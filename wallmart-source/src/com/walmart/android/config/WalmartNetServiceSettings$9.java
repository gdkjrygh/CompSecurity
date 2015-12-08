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
    final int val$index;
    final String val$strings[];

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i != val$index && i < val$strings.length)
        {
            WalmartNetServiceSettings.access$800(val$context, "mobile_pay_server_setting", val$strings[i]);
            MessageBus.getBus().post(new ServiceConfigChangedEvent());
        }
        dialoginterface.dismiss();
    }

    (int i, String as[], Context context1)
    {
        val$index = i;
        val$strings = as;
        val$context = context1;
        super();
    }
}
