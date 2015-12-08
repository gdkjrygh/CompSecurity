// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import com.squareup.otto.Bus;
import com.walmart.android.app.pharmacy.PharmacyActivity;
import com.walmart.android.app.photo.WalmartIntegrationProvider;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.UserVoiceUtils;
import com.walmartlabs.android.photo.controller.MainActivity;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            DrawerController, MiscActivity

class this._cls0
    implements android.widget.lickListener
{

    final DrawerController this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (awerAdapter.DrawerItem)adapterview.getItemAtPosition(i);
        if (DrawerController.access$700().equals(adapterview))
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.HOME, null, false));
            MessageBus.getBus().post((new com.walmartlabs.anivia.uilder("pageView")).putString("name", "Navigation").putString("section", "Home").putString("subCategory", "Homepage"));
            DrawerController.access$200(DrawerController.this, "home");
        } else
        if (DrawerController.access$800().equals(adapterview))
        {
            adapterview = new Bundle();
            adapterview.putString("start_mode", "root");
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.SHOP, adapterview, false));
            DrawerController.access$200(DrawerController.this, "shop by department");
        } else
        if (DrawerController.access$900().equals(adapterview))
        {
            adapterview = new Bundle();
            adapterview.putString("start_mode", "savings_showcase");
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.SHOP, adapterview, false));
        } else
        if (DrawerController.access$1000().equals(adapterview))
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.LOCAL_AD, null, false));
            DrawerController.access$200(DrawerController.this, "weekly ad");
        } else
        if (DrawerController.access$1100().equals(adapterview))
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.MOBILE_PAY, null, false));
            DrawerController.access$200(DrawerController.this, "mobile pay");
        } else
        if (DrawerController.access$1200().equals(adapterview))
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.STORE_FINDER, null, false));
            DrawerController.access$200(DrawerController.this, "store finder");
        } else
        if (DrawerController.access$1300().equals(adapterview))
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.TRACK_ORDER, null, false));
            DrawerController.access$200(DrawerController.this, "track your order");
        } else
        if (DrawerController.access$1400().equals(adapterview))
        {
            adapterview = new Bundle();
            adapterview.putBoolean("START_SYNC", true);
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.SAVER_DASHBOARD, adapterview, false));
            MessageBus.getBus().post((new com.walmartlabs.anivia.uilder("eReceiptsection")).putString("customerId", DrawerController.access$1500(DrawerController.this)));
            DrawerController.access$200(DrawerController.this, "savings catcher");
        } else
        if (DrawerController.access$1600().equals(adapterview))
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.PAYMENT, null, false));
        } else
        if (DrawerController.access$1700().equals(adapterview))
        {
            PharmacyActivity.launch(DrawerController.access$300(DrawerController.this));
            DrawerController.access$200(DrawerController.this, "pharmacy");
        } else
        if (DrawerController.access$1800().equals(adapterview))
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.PHARMACY_HYBRID, null, true));
        } else
        if (DrawerController.access$1900().equals(adapterview))
        {
            MainActivity.launch(DrawerController.access$300(DrawerController.this), com/walmart/android/app/photo/WalmartIntegrationProvider.getName());
            DrawerController.access$200(DrawerController.this, "1-hour photo");
        } else
        if (DrawerController.access$2000().equals(adapterview))
        {
            adapterview = new Bundle();
            adapterview.putBoolean("reload", true);
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.REGISTRY, adapterview, true));
        } else
        if (DrawerController.access$2100().equals(adapterview))
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.mentName.WISHLIST, null, true));
        } else
        if (DrawerController.access$400().equals(adapterview))
        {
            adapterview = new Intent(DrawerController.access$300(DrawerController.this), com/walmart/android/app/main/MiscActivity);
            if (SharedPreferencesUtil.getSavedLocalAdJsonStore(DrawerController.access$300(DrawerController.this)) != null)
            {
                adapterview.putExtra("show", 3);
                DrawerController.access$200(DrawerController.this, "your store");
            } else
            {
                adapterview.putExtra("show", 4).putExtra("EXTRA_STORE_PICKER_OPENED_FROM", "set your store");
                DrawerController.access$200(DrawerController.this, "set your store");
            }
            DrawerController.access$300(DrawerController.this).startActivity(adapterview);
        } else
        if (DrawerController.access$2200().equals(adapterview))
        {
            adapterview = new Intent(DrawerController.access$300(DrawerController.this), com/walmart/android/app/main/MiscActivity);
            adapterview.putExtra("show", 2);
            DrawerController.access$300(DrawerController.this).startActivity(adapterview);
            DrawerController.access$200(DrawerController.this, "settings");
        } else
        if (DrawerController.access$2300().equals(adapterview))
        {
            UserVoiceUtils.launchFeedback(DrawerController.access$300(DrawerController.this));
            DrawerController.access$200(DrawerController.this, "give feedback");
        } else
        if (DrawerController.access$2400().equals(adapterview))
        {
            adapterview = Uri.parse("https://help.walmart.com/app/home/incidents.c$client_source/Androidapp");
            try
            {
                view = new Intent("android.intent.action.VIEW", adapterview);
                if (view.resolveActivity(DrawerController.access$300(DrawerController.this).getPackageManager()) != null)
                {
                    DrawerController.access$300(DrawerController.this).startActivity(view);
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                WLog.e(DrawerController.access$2500(), (new StringBuilder()).append("Could not launch activity for: ").append(adapterview).toString());
            }
            DrawerController.access$200(DrawerController.this, "help");
        } else
        if (DrawerController.access$2600().equals(adapterview))
        {
            adapterview = new Intent(DrawerController.access$300(DrawerController.this), com/walmart/android/app/main/MiscActivity);
            adapterview.putExtra("show", 1);
            DrawerController.access$300(DrawerController.this).startActivity(adapterview);
            DrawerController.access$200(DrawerController.this, "about");
        } else
        if (!DrawerController.access$2700().equals(adapterview));
        DrawerController.access$600(DrawerController.this).closeDrawer(DrawerController.access$500(DrawerController.this));
    }

    ivity()
    {
        this$0 = DrawerController.this;
        super();
    }
}
