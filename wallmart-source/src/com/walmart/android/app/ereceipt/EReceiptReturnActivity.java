// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.ereceipt.EReceiptReturnPresenter;

public class EReceiptReturnActivity extends FullScreenActivity
{

    public static final String EXTRA_TCNUMBER = "tcnumber";

    public EReceiptReturnActivity()
    {
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0x7f05002f);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportActionBar().hide();
        if (getIntent() != null && getIntent().getExtras() != null)
        {
            bundle = new EReceiptReturnPresenter(this, getIntent().getExtras().getString("tcnumber"));
            getPresenterStack().pushPresenter(bundle, false);
            return;
        } else
        {
            finish();
            return;
        }
    }
}
