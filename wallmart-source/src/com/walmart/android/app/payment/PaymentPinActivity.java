// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.payment;

import android.content.Intent;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.payment.controller.pin.PinActivity;

public class PaymentPinActivity extends PinActivity
{

    public PaymentPinActivity()
    {
    }

    protected String getCustomerId()
    {
        return Services.get().getAuthentication().getCid();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == 1)
        {
            setAccountVerified(true);
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void showVerifyAccount()
    {
        Intent intent = new Intent(this, com/walmart/android/app/account/AccountActivity);
        intent.putExtra("from", "Other");
        if (Services.get().getAuthentication().hasCredentials())
        {
            intent.putExtra("mode", 2);
        }
        startActivityForResult(intent, 1);
    }
}
