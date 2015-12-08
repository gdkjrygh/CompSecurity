// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            ai, as, t, aj

public class ag extends ai
{

    private static final String a = com/paypal/android/sdk/onetouch/core/ag.getSimpleName();
    private Context b;
    private String c;
    private Handler d;

    public ag(Context context, String s, Handler handler)
    {
        b = context;
        c = s;
        d = handler;
    }

    public void run()
    {
        as.a(a, "entering LoadConfigurationRequest.");
        if (d == null)
        {
            return;
        }
        d.sendMessage(Message.obtain(d, 10, c));
        t t1 = new t(b, c);
        d.sendMessage(Message.obtain(d, 12, t1));
        aj.a().b(this);
_L2:
        as.a(a, "leaving LoadConfigurationRequest.");
        return;
        Object obj;
        obj;
        as.a(a, "LoadConfigurationRequest loading remote config failed.", ((Throwable) (obj)));
        d.sendMessage(Message.obtain(d, 11, obj));
        aj.a().b(this);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        aj.a().b(this);
        throw obj;
    }

}
