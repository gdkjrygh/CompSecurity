// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.ui.CodeView;

public class ReEnterPinFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onPinConfirmed(String s);

        public abstract void onPinNotConfirmed();
    }


    private static final int ERROR_ANIMATION_LENGTH = 280;
    private static final String EXTRA_PIN = "EXTRA_PIN";
    private CodeView mCodeView;
    private Animation mErrorAnimation;
    private Handler mHandler;
    private Vibrator mVibrator;

    public ReEnterPinFragment()
    {
        super(com/walmartlabs/payment/controller/pin/ReEnterPinFragment$Callbacks);
    }

    public static ReEnterPinFragment newInstance(CharSequence charsequence)
    {
        ReEnterPinFragment reenterpinfragment = new ReEnterPinFragment();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("EXTRA_PIN", charsequence);
        reenterpinfragment.setArguments(bundle);
        return reenterpinfragment;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mVibrator = (Vibrator)activity.getSystemService("vibrator");
        mErrorAnimation = AnimationUtils.loadAnimation(activity, com.walmartlabs.android.payment.R.anim.pm_pin_wrong);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mHandler = new Handler();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.payment.R.layout.mpay_pin_create, viewgroup, false);
        ViewUtil.setText(com.walmartlabs.android.payment.R.id.pm_pin_create_title, layoutinflater, com.walmartlabs.android.payment.R.string.pm_pin_reenter_message);
        mCodeView = (CodeView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_create_code);
        mCodeView.setOnCodeEnteredListener(new com.walmartlabs.ui.CodeView.OnCodeEnteredListener() {

            final ReEnterPinFragment this$0;

            public void onCodeEntered(CharSequence charsequence)
            {
                CharSequence charsequence1;
                if (getArguments() != null)
                {
                    charsequence1 = getArguments().getCharSequence("EXTRA_PIN");
                } else
                {
                    charsequence1 = null;
                }
                if (charsequence1 != null && charsequence.toString().equals(charsequence1.toString()))
                {
                    ((Callbacks)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = ReEnterPinFragment.this;
                super();
            }
        });
        mCodeView.setOnClickListener(new android.view.View.OnClickListener() {

            final ReEnterPinFragment this$0;

            public void onClick(View view)
            {
                if (mCodeView != null)
                {
                    ViewUtil.showKeyboard(mCodeView);
                }
            }

            
            {
                this$0 = ReEnterPinFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onResume()
    {
        onResume();
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.pm_pin_create_title);
        }
        (new Handler()).postDelayed(new Runnable() {

            final ReEnterPinFragment this$0;

            public void run()
            {
                if (mCodeView != null)
                {
                    ViewUtil.showKeyboard(mCodeView);
                }
            }

            
            {
                this$0 = ReEnterPinFragment.this;
                super();
            }
        }, 100L);
    }







    // Unreferenced inner class com/walmartlabs/payment/controller/pin/ReEnterPinFragment$1$1

/* anonymous class */
}
