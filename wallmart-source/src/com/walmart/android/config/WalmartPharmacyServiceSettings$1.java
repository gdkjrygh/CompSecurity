// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.app.Activity;
import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.config:
//            WalmartPharmacyServiceSettings, ServiceConfigChangedEvent

static final class val.activity
    implements android.content.Settings._cls1
{

    final Activity val$activity;
    final int val$selectedIndex;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i != val$selectedIndex)
        {
            WalmartPharmacyServiceSettings.access$000(val$activity, "pharmacy_server_setting", i);
            MessageBus.getBus().post(new ServiceConfigChangedEvent());
        }
        dialoginterface.dismiss();
    }

    A(int i, Activity activity1)
    {
        val$selectedIndex = i;
        val$activity = activity1;
        super();
    }
}
