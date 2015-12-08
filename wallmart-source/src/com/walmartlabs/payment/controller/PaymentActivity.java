// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public abstract class PaymentActivity extends AppCompatActivity
{

    public PaymentActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.walmartlabs.android.payment.R.layout.pm_activity_edit);
        bundle = new SystemBarTintManager(this);
        bundle.setStatusBarTintEnabled(true);
        bundle.setStatusBarTintColor(getResources().getColor(com.walmartlabs.android.payment.R.color.actionbar_bg_top));
        setSupportActionBar((Toolbar)findViewById(com.walmartlabs.android.payment.R.id.toolbar));
        bundle = getSupportActionBar();
        if (bundle != null)
        {
            bundle.setDisplayShowTitleEnabled(true);
            bundle.setDisplayHomeAsUpEnabled(true);
            bundle.setHomeButtonEnabled(true);
            bundle.setBackgroundDrawable(getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.actionbar_bg));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }
}
