// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.analytics.AniviaAnalytics;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.service.customer.GiftCardRequest;
import com.walmartlabs.payment.view.NumberFormattingTextWatcher;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            GiftCardValidator

public class AddGiftCardFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onGiftCardCreated();
    }


    private View mDiagram;
    private TextView mInstruction;
    private EditText mLabelView;
    private EditText mNumberView;
    private EditText mPinView;

    public AddGiftCardFragment()
    {
        super(com/walmartlabs/payment/controller/edit/AddGiftCardFragment$Callbacks);
        TAG = com/walmartlabs/payment/controller/edit/AddGiftCardFragment.getSimpleName();
    }

    private void createGiftCard()
    {
        GiftCardRequest giftcardrequest = new GiftCardRequest();
        giftcardrequest.number = trimNumber(mNumberView.getText().toString());
        giftcardrequest.pin = mPinView.getText().toString();
        giftcardrequest.label = mLabelView.getText().toString();
        PaymentServices.get().getCustomerService().createGiftCard(giftcardrequest).addCallback(new CallbackSameThread() {

            final AddGiftCardFragment this$0;

            public void onResultSameThread(Request request, Result result)
            {
                if (getView() != null)
                {
                    ViewUtil.findViewById(getView(), com.walmartlabs.android.payment.R.id.pm_add_gc_save_btn).setEnabled(true);
                }
                if (result.successful() && result.hasData() && !((GiftCard)result.getData()).hasClientErrorMessage())
                {
                    GiftCardsModel.get().updateGiftCard((GiftCard)result.getData());
                    if (isVisible())
                    {
                        ((Callbacks)getData).onGiftCardCreated();
                    }
                    return;
                } else
                {
                    ErrorHandlingUtil.handleResponseError(getActivity(), result, com.walmartlabs.android.payment.R.string.pm_add_gift_card_err);
                    return;
                }
            }

            
            {
                this$0 = AddGiftCardFragment.this;
                super();
            }
        });
    }

    public static AddGiftCardFragment newInstance()
    {
        return new AddGiftCardFragment();
    }

    private String trimNumber(String s)
    {
        return s.replaceAll("\\s+", "");
    }

    private void updateShowMoreText(TextView textview, boolean flag)
    {
        String s = (new StringBuilder()).append(getText(com.walmartlabs.android.payment.R.string.pm_add_gift_card_instruction_physical_card)).append(" ").toString();
        CharSequence charsequence;
        SpannableStringBuilder spannablestringbuilder;
        if (flag)
        {
            charsequence = getText(com.walmartlabs.android.payment.R.string.pm_add_gift_card_instruction_physical_card_show_more);
        } else
        {
            charsequence = getText(com.walmartlabs.android.payment.R.string.pm_add_gift_card_instruction_physical_card_show_less);
        }
        spannablestringbuilder = new SpannableStringBuilder(s);
        spannablestringbuilder.append(charsequence);
        spannablestringbuilder.setSpan(new ClickableSpan() {

            final AddGiftCardFragment this$0;

            public void onClick(View view)
            {
                byte byte0 = 0;
                boolean flag1;
                if (mDiagram.getVisibility() == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                view = mDiagram;
                if (flag1)
                {
                    byte0 = 8;
                }
                view.setVisibility(byte0);
                updateShowMoreText(mInstruction, flag1);
            }

            public void updateDrawState(TextPaint textpaint)
            {
                super.updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                this$0 = AddGiftCardFragment.this;
                super();
            }
        }, s.length(), s.length() + charsequence.length(), 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(getActivity().getResources().getColor(com.walmartlabs.android.payment.R.color.text_blue)), s.length(), s.length() + charsequence.length(), 33);
        textview.setText(spannablestringbuilder);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (bundle != null)
        {
            bundle.setTitle(com.walmartlabs.android.payment.R.string.pm_add_gift_card_title);
        }
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.payment.R.layout.pm_add_gift_card, viewgroup, false);
        getActivity().getWindow().setSoftInputMode(32);
        mInstruction = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_add_gc_instruction_physical);
        updateShowMoreText(mInstruction, true);
        mInstruction.setMovementMethod(LinkMovementMethod.getInstance());
        mDiagram = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_add_gc_diagram);
        mNumberView = (EditText)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_add_gc_number);
        mNumberView.setRawInputType(2);
        mNumberView.addTextChangedListener(new NumberFormattingTextWatcher());
        mPinView = (EditText)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_add_gc_pin);
        mLabelView = (EditText)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_add_gc_label);
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_add_gc_save_btn).setOnClickListener(new android.view.View.OnClickListener() {

            final AddGiftCardFragment this$0;

            public void onClick(View view)
            {
                if (GiftCardValidator.validateGiftCard(mNumberView, mPinView))
                {
                    ViewUtil.findViewById(getView(), com.walmartlabs.android.payment.R.id.pm_add_gc_save_btn).setEnabled(false);
                    createGiftCard();
                }
            }

            
            {
                this$0 = AddGiftCardFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        AniviaAnalytics.sendPageViewEvent();
    }







}
