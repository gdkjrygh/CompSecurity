// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.ui.CodeView;

public class CreatePinFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onPinCreated(CharSequence charsequence);
    }


    private CodeView mCodeView;

    public CreatePinFragment()
    {
        super(com/walmartlabs/payment/controller/pin/CreatePinFragment$Callbacks);
    }

    public static CreatePinFragment newInstance()
    {
        return new CreatePinFragment();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.payment.R.layout.mpay_pin_create, viewgroup, false);
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "mobile pay create pin").putString("section", "mobile pay"));
        ViewUtil.setText(com.walmartlabs.android.payment.R.id.pm_pin_create_title, layoutinflater, com.walmartlabs.android.payment.R.string.pm_pin_create_message);
        mCodeView = (CodeView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_pin_create_code);
        mCodeView.setOnCodeEnteredListener(new com.walmartlabs.ui.CodeView.OnCodeEnteredListener() {

            final CreatePinFragment this$0;

            public void onCodeEntered(CharSequence charsequence)
            {
                ((Callbacks)access$000).onPinCreated(charsequence);
            }

            
            {
                this$0 = CreatePinFragment.this;
                super();
            }
        });
        mCodeView.setOnClickListener(new android.view.View.OnClickListener() {

            final CreatePinFragment this$0;

            public void onClick(View view)
            {
                if (mCodeView != null)
                {
                    ViewUtil.showKeyboard(mCodeView);
                }
            }

            
            {
                this$0 = CreatePinFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.pm_pin_create_title);
        }
        (new Handler()).postDelayed(new Runnable() {

            final CreatePinFragment this$0;

            public void run()
            {
                if (mCodeView != null)
                {
                    ViewUtil.showKeyboard(mCodeView);
                }
            }

            
            {
                this$0 = CreatePinFragment.this;
                super();
            }
        }, 100L);
    }


}
