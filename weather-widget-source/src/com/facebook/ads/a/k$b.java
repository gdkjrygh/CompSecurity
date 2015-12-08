// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.ads.a:
//            k

class <init> extends BroadcastReceiver
{

    final k a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(context))
        {
            k.a(a, intent.getAction());
        } else
        if ("android.intent.action.SCREEN_ON".equals(context) && k.b(a) == 0)
        {
            a.a(intent.getAction());
            return;
        }
    }

    private (k k1)
    {
        a = k1;
        super();
    }

    stReceiver(k k1, stReceiver streceiver)
    {
        this(k1);
    }
}
