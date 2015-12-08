// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
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
import android.widget.Button;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.controller.settings.GiftCardState;
import com.walmartlabs.payment.controller.setup.SetupCallbacks;
import com.walmartlabs.payment.controller.setup.SetupCardData;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.payment.CreateUserRequest;
import com.walmartlabs.payment.service.payment.SetGiftCardsRequest;

public class TermsConditionsFragment extends CallbackFragment
{
    public static interface Callback
    {

        public abstract void onPrivacy();

        public abstract void onTerms();
    }


    private SetupCallbacks mCallbacks;
    private View mLoadingView;

    public TermsConditionsFragment()
    {
        super(com/walmartlabs/payment/controller/mpay/TermsConditionsFragment$Callback);
    }

    private CharSequence createConditionsText()
    {
        String s = getString(com.walmartlabs.android.payment.R.string.mpay_setup_tc_text);
        String s1 = getString(com.walmartlabs.android.payment.R.string.mpay_setup_tc_text_link_privacy);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        spannablestringbuilder.setSpan(new ClickableSpan() {

            final TermsConditionsFragment this$0;

            public void onClick(View view)
            {
                ((Callback)
// JavaClassFileOutputException: get_constant: invalid tag

            public void updateDrawState(TextPaint textpaint)
            {
                updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                this$0 = TermsConditionsFragment.this;
                super();
            }
        }, s.indexOf(s1), s.indexOf(s1) + s1.length(), 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(getResources().getColor(com.walmartlabs.android.payment.R.color.text_blue)), s.indexOf(s1), s.indexOf(s1) + s1.length(), 33);
        s1 = getString(com.walmartlabs.android.payment.R.string.mpay_setup_tc_text_link_terms);
        spannablestringbuilder.setSpan(new ClickableSpan() {

            final TermsConditionsFragment this$0;

            public void onClick(View view)
            {
                ((Callback)
// JavaClassFileOutputException: get_constant: invalid tag

            public void updateDrawState(TextPaint textpaint)
            {
                updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                this$0 = TermsConditionsFragment.this;
                super();
            }
        }, s.indexOf(s1), s.indexOf(s1) + s1.length(), 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(getResources().getColor(com.walmartlabs.android.payment.R.color.text_blue)), s.indexOf(s1), s.indexOf(s1) + s1.length(), 33);
        return spannablestringbuilder;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_terms_conditions, viewgroup, false);
        MessageBus.getBus().post((new Builder("pageView")).putString("name", "mobile pay terms and conditions").putString("section", "mobile pay"));
        mLoadingView = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.loading_page);
        ((Button)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_terms_conditions_btn_cancel)).setOnClickListener(new android.view.View.OnClickListener() {

            final TermsConditionsFragment this$0;

            public void onClick(View view)
            {
                MessageBus.getBus().post((new Builder("mobilePayTC")).putString("name", "cancel"));
                (new Builder(getActivity())).setTitle(com.walmartlabs.android.payment.R.string.mpay_tc_title).setMessage(com.walmartlabs.android.payment.R.string.mpay_setup_tc_dlg_msg).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                    final _cls1 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                }).show();
            }

            
            {
                this$0 = TermsConditionsFragment.this;
                super();
            }
        });
        ((Button)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_terms_conditions_btn_continue)).setOnClickListener(new android.view.View.OnClickListener() {

            final TermsConditionsFragment this$0;

            public void onClick(View view)
            {
                MessageBus.getBus().post((new Builder("mobilePayTC")).putString("name", "agree"));
                view = new CreateUserRequest();
                view.giftCards = SetGiftCardsRequest.makeRequestData(SetupCardData.getInstance().getGiftCardState().getGiftCards());
                if (((CreateUserRequest) (view)).giftCards == null)
                {
                    view.giftCards = new com.walmartlabs.payment.service.payment.SetGiftCardsRequest.GiftCardData[0];
                }
                mLoadingView.setVisibility(0);
                MobilePayManager.get().createUser(view, new CallbackSameThread() {

                    final _cls2 this$1;

                    public void onResultSameThread(Request request, Result result)
                    {
                        mLoadingView.setVisibility(8);
                        if (result.successful() && result.hasData())
                        {
                            mCallbacks.onTermsConditionsAccepted();
                            return;
                        } else
                        {
                            ErrorHandlingUtil.handleResponseError(getActivity(), result);
                            return;
                        }
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
            }

            
            {
                this$0 = TermsConditionsFragment.this;
                super();
            }
        });
        viewgroup = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_terms_conditions_text);
        viewgroup.setText(createConditionsText());
        viewgroup.setMovementMethod(LinkMovementMethod.getInstance());
        return layoutinflater;
    }

    public void onResume()
    {
        onResume();
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.mpay_tc_title);
        }
    }

    public void setCallbacks(SetupCallbacks setupcallbacks)
    {
        mCallbacks = setupcallbacks;
    }




}
