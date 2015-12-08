// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

static class start extends Thread
{

    private WeakReference zzml;
    private long zzmm;
    CountDownLatch zzmn;
    boolean zzmo;

    private void disconnect()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzml.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            zzmo = true;
        }
    }

    public void cancel()
    {
        zzmn.countDown();
    }

    public void run()
    {
        try
        {
            if (!zzmn.await(zzmm, TimeUnit.MILLISECONDS))
            {
                disconnect();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            disconnect();
        }
    }

    public boolean zzae()
    {
        return zzmo;
    }

    public (AdvertisingIdClient advertisingidclient, long l)
    {
        zzml = new WeakReference(advertisingidclient);
        zzmm = l;
        zzmn = new CountDownLatch(1);
        zzmo = false;
        start();
    }
}
