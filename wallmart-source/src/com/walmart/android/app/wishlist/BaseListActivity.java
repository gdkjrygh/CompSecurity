// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import com.walmart.android.app.main.CartActionController;
import com.walmart.android.app.main.HomeActivity;
import com.walmart.android.app.main.WalmartStartActivity;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.ui.Presenter;

public class BaseListActivity extends WalmartStartActivity
{
    class ListCartActionController extends CartActionController
    {

        final BaseListActivity this$0;

        protected void switchToCart()
        {
            onSwitchFragmentEvent(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.HYBRID_CART, null, true));
        }

        public ListCartActionController(Activity activity)
        {
            this$0 = BaseListActivity.this;
            super(activity);
        }
    }


    public BaseListActivity()
    {
    }

    protected CartActionController createCartActionController()
    {
        return new ListCartActionController(this);
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
