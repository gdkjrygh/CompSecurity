// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.app.Activity;
import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.config:
//            WalmartNetServiceSettings, ServiceConfigChangedEvent

static final class val.activity
    implements android.content.ner
{

    final Activity val$activity;
    final int val$selectedIndex;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i != val$selectedIndex)
        {
            if (i == 14)
            {
                WalmartNetServiceSettings.access$500(val$activity);
            } else
            {
                WalmartNetServiceSettings.access$600(val$activity, "server_setting", i);
                MessageBus.getBus().post(new ServiceConfigChangedEvent());
            }
        }
        dialoginterface.dismiss();
    }

    (int i, Activity activity1)
    {
        val$selectedIndex = i;
        val$activity = activity1;
        super();
    }
}
