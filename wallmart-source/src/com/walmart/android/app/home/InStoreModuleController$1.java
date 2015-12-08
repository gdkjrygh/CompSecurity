// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.app.main.HomeActivity;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmartlabs.msco.service.StoreModeEvent;

// Referenced classes of package com.walmart.android.app.home:
//            InStoreModuleController

class this._cls0
    implements android.view.uleController._cls1
{

    final InStoreModuleController this$0;

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755361: 
            InStoreModuleController.access$000(InStoreModuleController.this);
            InStoreModuleController.access$100(InStoreModuleController.this, "enable location");
            return;

        case 2131755415: 
            view = new Intent(InStoreModuleController.access$200(InStoreModuleController.this), com/walmart/android/app/main/HomeActivity);
            view.setAction("android.intent.action.SEARCH");
            view.setData(Uri.parse("scanner"));
            InStoreModuleController.access$200(InStoreModuleController.this).startActivity(view);
            InStoreModuleController.access$100(InStoreModuleController.this, "scan for price");
            return;

        case 2131755414: 
            view = new Intent(InStoreModuleController.access$200(InStoreModuleController.this), com/walmart/android/app/main/HomeActivity);
            view.setAction("android.intent.action.SEARCH");
            InStoreModuleController.access$200(InStoreModuleController.this).startActivity(view);
            InStoreModuleController.access$100(InStoreModuleController.this, "search this store");
            return;

        case 2131755416: 
            view = new Bundle();
            view.putString("store_id", InStoreModuleController.access$300(InStoreModuleController.this).getStoreId());
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.e.LOCAL_AD, view, true));
            InStoreModuleController.access$100(InStoreModuleController.this, "weekly ad");
            return;

        case 2131755383: 
            Services.get().getFastPickupManager().refresh(true);
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.e.FAST_PICKUP, null, false));
            InStoreModuleController.access$100(InStoreModuleController.this, "express pickup");
            return;
        }
    }

    ger()
    {
        this$0 = InStoreModuleController.this;
        super();
    }
}
