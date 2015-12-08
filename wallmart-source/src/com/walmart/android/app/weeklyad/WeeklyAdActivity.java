// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.squareup.otto.Bus;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.fragments.WeeklyAdFragment;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ui.PresenterFragment;

public class WeeklyAdActivity extends AppCompatActivity
{

    public static final String EXTRA_STORE_ID = "store_id";

    public WeeklyAdActivity()
    {
    }

    public void onBackPressed()
    {
        PresenterFragment presenterfragment = (PresenterFragment)getSupportFragmentManager().findFragmentById(0x7f1000bb);
        if (presenterfragment == null || !presenterfragment.onBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0401d6);
        setSupportActionBar((Toolbar)findViewById(0x7f100207));
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (android.os.Build.VERSION.SDK_INT <= 21)
        {
            bundle = new SystemBarTintManager(this);
            bundle.setStatusBarTintEnabled(true);
            bundle.setStatusBarTintColor(getResources().getColor(0x7f0f0006));
        }
        bundle = new WeeklyAdFragment();
        bundle.setDynamicArguments(getIntent().getExtras());
        if (getSupportFragmentManager().findFragmentById(0x7f1000bb) == null)
        {
            getSupportFragmentManager().beginTransaction().replace(0x7f1000bb, bundle, com/walmart/android/fragments/WeeklyAdFragment.getName()).commit();
        }
        MessageBus.getBus().register(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        MessageBus.getBus().unregister(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (0x102002c == menuitem.getItemId())
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPresenterStackUpdatedEvent(PresenterStackUpdatedEvent presenterstackupdatedevent)
    {
        supportInvalidateOptionsMenu();
    }
}
