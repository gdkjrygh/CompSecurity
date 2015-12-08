// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.app.NotificationManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.service.payment.Transaction;
import com.walmartlabs.payment.view.OnSingleClickListener;
import com.walmartlabs.utils.WLog;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class PaymentConfirmationFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onSubmitToSaver(String s, String s1);
    }


    private Transaction mTransaction;

    public PaymentConfirmationFragment()
    {
        super(com/walmartlabs/payment/controller/mpay/PaymentConfirmationFragment$Callbacks);
    }

    private void notifySeenTransaction()
    {
        PaymentServices.get().getCustomerService().seenUserTransaction(mTransaction).addCallback(new CallbackSameThread() {

            final PaymentConfirmationFragment this$0;

            public void onResultSameThread(Request request, Result result)
            {
                if (result.successful() && result.hasData())
                {
                    WLog.d(
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = PaymentConfirmationFragment.this;
                super();
            }
        });
    }

    private void showEReceiptErrorDialog()
    {
        DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.R.string.mpay_confirm_submit_error_title), getString(com.walmartlabs.android.payment.R.string.mpay_confirm_submit_error_msg), getActivity());
    }

    private void submitToSC()
    {
        if (mTransaction != null && !TextUtils.isEmpty(mTransaction.tc) && !TextUtils.isEmpty(mTransaction.date))
        {
            ((Callbacks)mCallback).onSubmitToSaver(mTransaction.tc, mTransaction.date);
            return;
        } else
        {
            showEReceiptErrorDialog();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_payment_confirm, viewgroup, false);
        MessageBus.getBus().post((new Builder("pageView")).putString("name", "mobile pay confirmation").putString("section", "mobile pay"));
        viewgroup = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_cc_container);
        bundle = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_cc_divider);
        View view = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_tender_container);
        View view1 = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_tender_divider);
        View view2 = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_gc_container);
        TextView textview = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_date);
        TextView textview1 = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_total_value);
        TextView textview2 = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_cc_value);
        TextView textview3 = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_gc_value);
        TextView textview4 = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_cc_title);
        TextView textview5 = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_tender_value);
        TextView textview6 = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_confirm_submit);
        mTransaction = (Transaction)getArguments().getParcelable("transaction");
        notifySeenTransaction();
        float f;
        try
        {
            textview.setText(DateFormat.getDateInstance(2, Locale.US).format(CreditCardsModel.ISO_DATE.parse(mTransaction.date)));
        }
        catch (ParseException parseexception)
        {
            textview.setText(mTransaction.date);
        }
        textview1.setText(NumberFormat.getCurrencyInstance(Locale.US).format(mTransaction.transactionTotal));
        if (mTransaction.giftCardAmount > 0.0F)
        {
            textview3.setText(String.format("-%s", new Object[] {
                NumberFormat.getCurrencyInstance(Locale.US).format(mTransaction.giftCardAmount)
            }));
        } else
        {
            view2.setVisibility(8);
        }
        if (mTransaction.creditCardAmount > 0.0F)
        {
            textview2.setText(NumberFormat.getCurrencyInstance(Locale.US).format(mTransaction.creditCardAmount));
            textview4.setText(String.format(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_confirm_cc), new Object[] {
                mTransaction.creditCardType, mTransaction.lastFour
            }));
            if (mTransaction.giftCardAmount <= 0.0F)
            {
                bundle.setVisibility(8);
            }
        } else
        {
            viewgroup.setVisibility(8);
            bundle.setVisibility(8);
        }
        f = mTransaction.transactionTotal - mTransaction.giftCardAmount - mTransaction.creditCardAmount;
        if (f >= 0.01F)
        {
            textview5.setText(NumberFormat.getCurrencyInstance(Locale.US).format(f));
            if (mTransaction.giftCardAmount <= 0.0F && mTransaction.creditCardAmount <= 0.0F)
            {
                view1.setVisibility(8);
            }
        } else
        {
            view1.setVisibility(8);
            view.setVisibility(8);
        }
        ViewUtil.setTextHideIfEmpty(com.walmartlabs.android.payment.R.id.mpay_confirm_store_address, layoutinflater, mTransaction.addressLineOne);
        textview6.setOnClickListener(new OnSingleClickListener() {

            final PaymentConfirmationFragment this$0;

            public void onSingleClick(View view3)
            {
                MessageBus.getBus().post(new Builder("mobileSubmiteReceipt"));
                submitToSC();
            }

            
            {
                this$0 = PaymentConfirmationFragment.this;
                super();
            }
        });
        ((NotificationManager)getActivity().getSystemService("notification")).cancel(mTransaction.tc, 0);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.mpay_confirm_title);
        }
    }




}
