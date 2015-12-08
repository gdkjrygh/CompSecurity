// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.os.Bundle;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.pharmacy.PharmacyActivity;
import com.walmart.android.app.photo.WalmartIntegrationProvider;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.GooglePlay;
import com.walmartlabs.android.photo.controller.MainActivity;

// Referenced classes of package com.walmart.android.app.home:
//            HomePresenter

class <init> extends OnSingleClickListener
{

    final HomePresenter this$0;

    public void onSingleClick(View view)
    {
        String s;
        Bundle bundle;
        Object obj;
        s = null;
        obj = null;
        bundle = null;
        view.getId();
        JVM INSTR tableswitch 2131755368 2131755378: default 68
    //                   2131755368 110
    //                   2131755369 145
    //                   2131755370 292
    //                   2131755371 161
    //                   2131755372 323
    //                   2131755373 338
    //                   2131755374 196
    //                   2131755375 243
    //                   2131755376 215
    //                   2131755377 273
    //                   2131755378 360;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        clearSingleClickFlag();
        view = obj;
_L14:
        if (view != null)
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(view, bundle));
        }
        if (s != null)
        {
            GoogleAnalytics.trackEvent("Home", s, "");
        }
        return;
_L2:
        view = com.walmart.android.config.ragmentName.SHOP;
        bundle = new Bundle();
        bundle.putString("start_mode", "root");
        s = "Shop by Dept";
        HomePresenter.access$500(HomePresenter.this, "shop by department");
        continue; /* Loop/switch isn't completed */
_L3:
        view = com.walmart.android.config.ragmentName.MOBILE_PAY;
        HomePresenter.access$500(HomePresenter.this, "mobile pay");
        continue; /* Loop/switch isn't completed */
_L5:
        view = com.walmart.android.config.ragmentName.SHOP;
        bundle = new Bundle();
        bundle.putString("start_mode", "savings_showcase");
        s = "Rollbacks";
        HomePresenter.access$500(HomePresenter.this, "rollbacks");
        continue; /* Loop/switch isn't completed */
_L8:
        view = com.walmart.android.config.ragmentName.LOCAL_AD;
        s = "Local Ad";
        HomePresenter.access$500(HomePresenter.this, "weekly ad");
        continue; /* Loop/switch isn't completed */
_L10:
        PharmacyActivity.launch(HomePresenter.access$200(HomePresenter.this));
        s = "Pharmacy";
        HomePresenter.access$500(HomePresenter.this, "pharmacy");
        view = obj;
        continue; /* Loop/switch isn't completed */
_L9:
        MainActivity.launch(HomePresenter.access$200(HomePresenter.this), com/walmart/android/app/photo/WalmartIntegrationProvider.getName());
        HomePresenter.access$500(HomePresenter.this, "photo");
        view = obj;
        continue; /* Loop/switch isn't completed */
_L11:
        view = com.walmart.android.config.ragmentName.STORE_FINDER;
        s = "Find Store";
        HomePresenter.access$500(HomePresenter.this, "find store");
        continue; /* Loop/switch isn't completed */
_L4:
        view = com.walmart.android.config.ragmentName.SAVER_DASHBOARD;
        bundle = new Bundle();
        bundle.putBoolean("START_SYNC", true);
        HomePresenter.access$500(HomePresenter.this, "savings catcher");
        continue; /* Loop/switch isn't completed */
_L6:
        view = com.walmart.android.config.ragmentName.WISHLIST;
        bundle = new Bundle();
        continue; /* Loop/switch isn't completed */
_L7:
        view = com.walmart.android.config.ragmentName.REGISTRY;
        bundle = new Bundle();
        bundle.putBoolean("reload", true);
        continue; /* Loop/switch isn't completed */
_L12:
        GooglePlay.launchIfAvailable(HomePresenter.access$200(HomePresenter.this));
        MessageBus.getBus().post((new com.walmartlabs.anivia.n.Builder("pageView")).putString("name", "App Upgrade Message"));
        HomePresenter.access$500(HomePresenter.this, "update");
        view = obj;
        if (true) goto _L14; else goto _L13
_L13:
    }

    der(Presenter presenter)
    {
        this$0 = HomePresenter.this;
        super(presenter);
    }
}
