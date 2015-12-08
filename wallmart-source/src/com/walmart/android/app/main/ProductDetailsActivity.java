// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.WalmartUri;

// Referenced classes of package com.walmart.android.app.main:
//            WalmartStartActivity, HomeActivity

public class ProductDetailsActivity extends WalmartStartActivity
{

    private static final String TAG = com/walmart/android/app/main/ProductDetailsActivity.getSimpleName();

    public ProductDetailsActivity()
    {
    }

    private boolean handleIntent(Intent intent)
    {
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null)
        {
            WalmartUri walmarturi = WalmartUri.parse(intent.getData());
            if (walmarturi != null && walmarturi.getType() == 7 && walmarturi.getParam(1) != null)
            {
                intent.putExtra("item_id", walmarturi.getParam(1));
                switchToFragment(fragmentNameToClass(com.walmart.android.config.FragmentConfig.FragmentName.PRODUCT_DETAILS), getIntent().getExtras(), false);
                return true;
            }
        }
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (DrawerLayout)findViewById(0x7f100208);
        if (bundle != null)
        {
            bundle.setDrawerLockMode(1);
        }
        bundle = getSupportActionBar();
        bundle.setDisplayHomeAsUpEnabled(true);
        bundle.setDisplayShowTitleEnabled(true);
        if (!handleIntent(getIntent()))
        {
            startActivity(new Intent(this, com/walmart/android/app/main/HomeActivity));
            finish();
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    public void onPresenterStackUpdatedEvent(PresenterStackUpdatedEvent presenterstackupdatedevent)
    {
        getSupportActionBar().setTitle(presenterstackupdatedevent.onTop.getTitleText());
        supportInvalidateOptionsMenu();
    }

    public void onSwitchFragmentEvent(SwitchFragmentEvent switchfragmentevent)
    {
        Intent intent = new Intent(this, com/walmart/android/app/main/HomeActivity);
        intent.setFlags(0x20000);
        intent.putExtra("reroute", FragmentConfig.getFragmentClass(switchfragmentevent.fragmentName).getName());
        if (switchfragmentevent.arguments != null)
        {
            intent.putExtras(switchfragmentevent.arguments);
        }
        startActivity(intent);
        finish();
    }

}
