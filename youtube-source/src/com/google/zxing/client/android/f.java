// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.zxing.client.android:
//            d

final class f extends BroadcastReceiver
{

    final d a;

    private f(d d1)
    {
        a = d1;
        super();
    }

    f(d d1, byte byte0)
    {
        this(d1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction()) && intent.getIntExtra("plugged", -1) > 0)
        {
            d.a(a);
        }
    }
}
