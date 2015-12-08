// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.golauncher.a.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

// Referenced classes of package com.jiubang.golauncher.a.a.a:
//            c, e

class d
    implements ServiceConnection
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        c.a(a, com.android.vending.billing.IInAppBillingService.Stub.asInterface(ibinder));
        if (c.a(a) == null)
        {
            Log.i("wss", "ServiceConnection billingService is null");
        }
        if (!c.b(a) && a.g())
        {
            a.h();
            if (c.c(a) != null)
            {
                c.c(a).a();
            }
        }
        if (c.c(a) != null)
        {
            c.c(a).b();
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        c.a(a, null);
    }
}
