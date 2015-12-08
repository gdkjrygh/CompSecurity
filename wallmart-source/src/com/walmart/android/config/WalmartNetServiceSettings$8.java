// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.content.Context;
import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.config:
//            WalmartNetServiceSettings, ServiceConfigChangedEvent

static final class val.context
    implements android.content.ner
{

    final Context val$context;
    final int val$selectedIndex;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i != val$selectedIndex)
        {
            WalmartNetServiceSettings.access$600(val$context, "store_search_server_setting", i);
            MessageBus.getBus().post(new ServiceConfigChangedEvent());
        }
        dialoginterface.dismiss();
    }

    (int i, Context context1)
    {
        val$selectedIndex = i;
        val$context = context1;
        super();
    }
}
