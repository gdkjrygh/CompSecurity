// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.a.a:
//            f

private static final class a
    implements Runnable
{

    private Context a;

    public void run()
    {
        com/google/a/a/f;
        JVM INSTR monitorenter ;
        if (f.f() == null)
        {
            AdvertisingIdClient advertisingidclient = new AdvertisingIdClient(a);
            advertisingidclient.start();
            f.a(advertisingidclient);
        }
        f.g().countDown();
_L1:
        com/google/a/a/f;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        f.a(true);
        f.g().countDown();
          goto _L1
        obj;
        com/google/a/a/f;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        f.g().countDown();
          goto _L1
        obj;
        f.g().countDown();
          goto _L1
        obj;
        f.g().countDown();
        throw obj;
    }

    public text(Context context)
    {
        a = context.getApplicationContext();
        if (a == null)
        {
            a = context;
        }
    }
}
