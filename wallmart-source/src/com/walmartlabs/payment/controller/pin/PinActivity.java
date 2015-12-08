// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.walmartlabs.payment.controller.PaymentActivity;
import com.walmartlabs.payment.service.pin.PinPreferences;

// Referenced classes of package com.walmartlabs.payment.controller.pin:
//            CreatePinFragment, EnterPinFragment, ReEnterPinFragment

public abstract class PinActivity extends PaymentActivity
    implements CreatePinFragment.Callbacks, EnterPinFragment.Callbacks, ReEnterPinFragment.Callbacks
{

    public static final String EXTRA_CHANGE_PASSCODE = "EXTRA_CHANGE_PASSCODE";
    public static final String EXTRA_SUPPRESS_VERIFICATION = "EXTRA_SUPPRESS_VERIFICATION";
    private static final int MAX_ATTEMPTS = 5;
    private static final long PIN_PASS_TIMEOUT = 0x493e0L;
    protected static final int REQUEST_VERIFY = 1;
    private boolean mAccountVerified;
    private boolean mChangePasscode;

    public PinActivity()
    {
    }

    protected abstract String getCustomerId();

    protected boolean isAccountVerified()
    {
        return mAccountVerified;
    }

    public void onCancelEnterPin()
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getIntent() != null)
        {
            mChangePasscode = getIntent().getBooleanExtra("EXTRA_CHANGE_PASSCODE", false);
            mAccountVerified = getIntent().getBooleanExtra("EXTRA_SUPPRESS_VERIFICATION", false);
        }
    }

    public void onForgotPin()
    {
        mChangePasscode = true;
        showVerifyAccount();
    }

    public void onPinConfirmed(String s)
    {
        PinPreferences.setPin(this, s, getCustomerId());
        setResult(-1);
        finish();
    }

    public void onPinCreated(CharSequence charsequence)
    {
        showReEnterPin(charsequence);
    }

    public void onPinEntered()
    {
        setResult(-1);
        finish();
    }

    public void onPinNotConfirmed()
    {
        showCreatePin();
    }

    protected void onResume()
    {
        super.onResume();
        if (!mChangePasscode && PinPreferences.hasPin(this, getCustomerId()))
        {
            if (PinPreferences.hasPinPassedSince(this, getCustomerId(), 0x493e0L))
            {
                setResult(-1);
                finish();
                return;
            }
            if (!PinPreferences.hasAttempts(this, getCustomerId(), 5))
            {
                showEnterPin();
                return;
            }
            if (getSupportFragmentManager().getFragments() != null)
            {
                finish();
                return;
            } else
            {
                showVerifyAccount();
                return;
            }
        }
        if (isAccountVerified())
        {
            PinPreferences.resetPin(this, getCustomerId());
            setAccountVerified(false);
            showCreatePin();
            return;
        }
        if (getSupportFragmentManager().getFragments() == null)
        {
            showVerifyAccount();
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onWrongPinEntered()
    {
        if (PinPreferences.hasAttempts(this, getCustomerId(), 5))
        {
            showVerifyAccount();
        }
    }

    protected void setAccountVerified(boolean flag)
    {
        mAccountVerified = flag;
        PinPreferences.resetAttempts(this, getCustomerId());
    }

    protected void showCreatePin()
    {
        getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, CreatePinFragment.newInstance(), com/walmartlabs/payment/controller/pin/CreatePinFragment.getSimpleName()).commit();
    }

    protected void showEnterPin()
    {
        getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, EnterPinFragment.newInstance(getCustomerId()), com/walmartlabs/payment/controller/pin/EnterPinFragment.getSimpleName()).commit();
    }

    protected void showReEnterPin(CharSequence charsequence)
    {
        getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, ReEnterPinFragment.newInstance(charsequence), com/walmartlabs/payment/controller/pin/ReEnterPinFragment.getSimpleName()).commit();
    }

    protected abstract void showVerifyAccount();
}
