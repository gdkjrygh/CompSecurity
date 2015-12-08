// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.service.pin.PinPreferences;
import com.walmartlabs.payment.view.OnSingleClickListener;
import com.walmartlabs.ui.CodeView;

public class EnterPinFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onCancelEnterPin();

        public abstract void onForgotPin();

        public abstract void onPinEntered();

        public abstract void onWrongPinEntered();
    }


    private static final int ERROR_ANIMATION_LENGTH = 280;
    private static final String EXTRA_CUSTOMER_ID = "EXTRA_CUSTOMER_ID";
    private Animation mErrorAnimation;
    private Vibrator mVibrator;

    public EnterPinFragment()
    {
        super(com/walmartlabs/payment/controller/pin/EnterPinFragment$Callbacks);
    }

    public static EnterPinFragment newInstance(String s)
    {
        EnterPinFragment enterpinfragment = new EnterPinFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_CUSTOMER_ID", s);
        enterpinfragment.setArguments(bundle);
        return enterpinfragment;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mVibrator = (Vibrator)activity.getSystemService("vibrator");
        mErrorAnimation = AnimationUtils.loadAnimation(activity, com.walmartlabs.android.payment.R.anim.pm_pin_wrong);
    }

    public View onCreateView(LayoutInflater layoutinflater, final ViewGroup errorView, final Bundle codeView)
    {
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.payment.R.layout.mpay_pin_enter, errorView, false);
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "mobile pay enter pin").putString("section", "mobile pay"));
        errorView = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_error);
        codeView = (CodeView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_code);
        codeView.setOnCodeEnteredListener(new com.walmartlabs.ui.CodeView.OnCodeEnteredListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onCodeEntered(CharSequence charsequence)
            {
                if (PinPreferences.comparePin(getActivity(), charsequence.toString(), getArguments().getString("EXTRA_CUSTOMER_ID", "")))
                {
                    ((Callbacks)).onPinEntered();
                    return;
                } else
                {
                    errorView.setVisibility(0);
                    mErrorAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                        final _cls1 this$1;

                        public void onAnimationEnd(Animation animation)
                        {
                            mVibrator.cancel();
                            codeView.clear();
                            ((Callbacks)
// JavaClassFileOutputException: get_constant: invalid tag

                        public void onAnimationRepeat(Animation animation)
                        {
                        }

                        public void onAnimationStart(Animation animation)
                        {
                            if (mVibrator.hasVibrator())
                            {
                                mVibrator.vibrate(280L);
                            }
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    codeView.startAnimation(mErrorAnimation);
                    return;
                }
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_delete).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;

            public void onSingleClick(View view)
            {
                codeView.delete();
            }

            
            {
                this$0 = EnterPinFragment.this;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_1).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("1");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_2).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("2");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_3).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("3");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_4).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("4");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_5).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("5");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_6).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("6");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_7).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("7");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_8).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("8");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_9).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("9");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_enter_key_10).setOnClickListener(new OnSingleClickListener() {

            final EnterPinFragment this$0;
            final CodeView val$codeView;
            final TextView val$errorView;

            public void onSingleClick(View view)
            {
                errorView.setVisibility(4);
                codeView.append("0");
            }

            
            {
                this$0 = EnterPinFragment.this;
                errorView = textview;
                codeView = codeview;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pim_enter_forgot).setOnClickListener(new android.view.View.OnClickListener() );
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pim_enter_cancel).setOnClickListener(new android.view.View.OnClickListener() );
        return layoutinflater;
    }

    public void onResume()
    {
        onResume();
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.pm_pin_enter_title);
        }
    }






}
