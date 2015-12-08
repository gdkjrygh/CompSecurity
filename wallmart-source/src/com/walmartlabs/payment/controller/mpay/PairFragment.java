// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.mpay.MobilePayNotificationManager;
import com.walmartlabs.payment.service.payment.PairRequest;
import com.walmartlabs.payment.service.payment.Transaction;
import com.walmartlabs.utils.WLog;

public class PairFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onPairingError();

        public abstract void onTransaction(Transaction transaction);
    }


    private static final String TAG = com/walmartlabs/payment/controller/mpay/PairFragment.getSimpleName();
    private String mCreditCardId;
    private RelativeLayout mLoadingView;
    private boolean mShouldCheckTransaction;
    private String mTokenValue;
    private boolean mUseAssociateDiscount;
    private boolean mUseGiftCards;
    private String mUserName;

    public PairFragment()
    {
        super(com/walmartlabs/payment/controller/mpay/PairFragment$Callbacks);
        mShouldCheckTransaction = false;
    }

    private void checkForTransaction()
    {
        if (mShouldCheckTransaction)
        {
            mShouldCheckTransaction = false;
            MobilePayManager.get().getUserTransaction().addCallback(new CallbackSameThread() {

                final PairFragment this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    if (result.successful() && result.hasData())
                    {
                        WLog.d(PairFragment.TAG, "Obtained transaction");
                        request = (Transaction)result.getData();
                        if (!((Transaction) (request)).clientSeen && ((Transaction) (request)).tc != null && !((Transaction) (request)).tc.isEmpty())
                        {
                            ((Callbacks)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = PairFragment.this;
                super();
            }
            });
        }
    }

    private void handleArgs()
    {
        Bundle bundle = getArguments();
        mTokenValue = bundle.getString("token_value");
        mUserName = bundle.getString("user_firstname");
        mCreditCardId = bundle.getString("credit_card_id");
        mUseAssociateDiscount = bundle.getBoolean("use_assoc_discount", false);
        mUseGiftCards = bundle.getBoolean("use_gift_cards", true);
        WLog.d(TAG, (new StringBuilder()).append("Token = ").append(mTokenValue).toString());
        WLog.d(TAG, (new StringBuilder()).append("CC id = ").append(mCreditCardId).toString());
    }

    private void pairUser()
    {
        PairRequest pairrequest = null;
        String s = pairrequest;
        if (mCreditCardId != null)
        {
            s = pairrequest;
            if (!mCreditCardId.isEmpty())
            {
                s = mCreditCardId;
            }
        }
        pairrequest = (new Builder()).setToken(mTokenValue).setUseGiftCards(mUseGiftCards).setUseAssociateDiscount(mUseAssociateDiscount).build();
        if (s != null)
        {
            pairrequest.creditCardId = s;
        }
        MobilePayManager.get().pairUser(pairrequest).addCallback(new CallbackSameThread() {

            final PairFragment this$0;

            public void onResultSameThread(Request request, Result result)
            {
                WLog.d(PairFragment.TAG, (new StringBuilder()).append("result code = ").append(result.getStatusCode()).toString());
                if (result.successful() && result.hasData())
                {
                    mLoadingView.setVisibility(8);
                    mShouldCheckTransaction = true;
                    return;
                } else
                {
                    showErrorDialog(result.getError());
                    return;
                }
            }

            
            {
                this$0 = PairFragment.this;
                super();
            }
        });
    }

    private void showErrorDialog(com.walmartlabs.kangaroo.Result.Error error)
    {
        if (error.connectionError())
        {
            (new com.walmart.android.ui.dialog.AlertDialog.Builder(getActivity())).setMessage(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_pair_error_noconnect)).setPositiveButton(0x104000a, null).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() ).show();
            return;
        } else
        {
            (new Builder(getActivity())).setTitle(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_pair_error_title)).setMessage(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_pair_error_msg)).setPositiveButton(0x104000a, null).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() ).show();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_pair_device, viewgroup, false);
        mLoadingView = (RelativeLayout)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_pair_progress_layout);
        handleArgs();
        ((TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_pair_greeting)).setText(String.format(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_pair_greeting), new Object[] {
            mUserName
        }));
        pairUser();
        return layoutinflater;
    }

    public void onResume()
    {
        onResume();
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.mpay_pair_title);
        }
        checkForTransaction();
    }

    public void onStart()
    {
        onStart();
        MobilePayNotificationManager.get().registerMobilePayPushListener(new com.walmartlabs.payment.service.mpay.MobilePayNotificationManager.MobilePayPushListener() );
    }

    public void onStop()
    {
        onStop();
        mShouldCheckTransaction = false;
        MobilePayNotificationManager.get().unregisterMobilePayPushListener();
    }



/*
    static boolean access$002(PairFragment pairfragment, boolean flag)
    {
        pairfragment.mShouldCheckTransaction = flag;
        return flag;
    }

*/







}
