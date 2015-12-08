// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import com.arubanetworks.meridian.requests.RtlsLocationRequest;

// Referenced classes of package com.arubanetworks.meridian.location:
//            LocationProvider, ClientLocationData, MeridianLocation

class a extends LocationProvider
{

    private final Context a;
    private final WifiManager b;
    private final Runnable c = new _cls3();
    private final Runnable d = new _cls4();
    private Handler e;
    private boolean f;
    private boolean g;
    private BroadcastReceiver h;
    private RtlsLocationRequest i;
    private final com.arubanetworks.meridian.requests.RtlsLocationRequest.Builder j;

    public a(Context context, ClientLocationData clientlocationdata, LocationProvider.a a1)
    {
        super(clientlocationdata, a1);
        f = false;
        g = true;
        a = context.getApplicationContext();
        b = (WifiManager)a.getSystemService("wifi");
        context = b.getConnectionInfo();
        if (context != null && context.getMacAddress() != null)
        {
            context = context.getMacAddress().toLowerCase();
        } else
        {
            context = null;
        }
        j = (new com.arubanetworks.meridian.requests.RtlsLocationRequest.Builder()).setProvider(this).setClientData(clientLocationData).setWifiMac(context).setListener(new _cls2()).setErrorListener(new _cls1());
        e = new Handler();
        a();
        g = false;
    }

    private void a()
    {
        if (i != null)
        {
            i.cancel();
        }
        i = j.build();
        i.sendRequest();
        if (h == null)
        {
            h = new _cls5();
            a.registerReceiver(h, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            b();
        }
    }

    private void a(MeridianLocation meridianlocation)
    {
        if (meridianlocation != null)
        {
            updateWithLocation(meridianlocation);
        }
        i = null;
        e.postDelayed(c, 5000L);
    }

    static void a(a a1)
    {
        a1.a();
    }

    static void a(a a1, MeridianLocation meridianlocation)
    {
        a1.a(meridianlocation);
    }

    static boolean a(a a1, boolean flag)
    {
        a1.f = flag;
        return flag;
    }

    private void b()
    {
        if (g)
        {
            return;
        }
        if (!f)
        {
            b.startScan();
            f = true;
            return;
        } else
        {
            c();
            return;
        }
    }

    static void b(a a1)
    {
        a1.b();
    }

    private void c()
    {
        e.postDelayed(d, 2000L);
    }

    static void c(a a1)
    {
        a1.c();
    }

    protected float getPriority()
    {
        return 0.5F;
    }

    public LocationProvider.ProviderType getType()
    {
        return LocationProvider.ProviderType.RTLS_PROVIDER;
    }

    protected void shutdown()
    {
        if (!g)
        {
            e.removeCallbacks(c);
            g = true;
            try
            {
                a.unregisterReceiver(h);
                h = null;
            }
            catch (Exception exception) { }
            if (i != null)
            {
                i.cancel();
                return;
            }
        }
    }

    protected void wifiStateChanged(int k)
    {
        k;
        JVM INSTR tableswitch 1 3: default 28
    //                   1 29
    //                   2 28
    //                   3 34;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        shutdown();
        return;
_L3:
        if (g)
        {
            a();
            g = false;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}

}
