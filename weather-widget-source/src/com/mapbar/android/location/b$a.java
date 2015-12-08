// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;

// Referenced classes of package com.mapbar.android.location:
//            b, g, l, k

final class a extends Thread
{

    public Handler a;
    final b b;

    public final void run()
    {
        Looper.prepare();
        if (!g.b)
        {
            android.content.pm.PackageManager packagemanager = com.mapbar.android.location.b.b(b).getPackageManager();
            g.e = com.mapbar.android.location.b.b(b).getPackageName();
            g.d = g.a(packagemanager, g.e);
            g.c = a(packagemanager, g.e);
            g.b = g.a(g.d);
        }
        try
        {
            CellLocation.requestLocationUpdate();
            com.mapbar.android.location.b.a(b, (TelephonyManager)com.mapbar.android.location.b.b(b).getSystemService("phone"));
            l.a = com.mapbar.android.location.b.c(b).getDeviceId();
            l.b = com.mapbar.android.location.b.c(b).getSimSerialNumber();
            com.mapbar.android.location.b.c(b).listen(com.mapbar.android.location.b.d(b), 19);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        try
        {
            com.mapbar.android.location.b.a(b, (WifiManager)com.mapbar.android.location.b.b(b).getSystemService("wifi"));
        }
        catch (Exception exception1)
        {
            exception1.printStackTrace();
        }
        a = new Handler() {

            private b.a a;

            public final void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 1 2: default 28
            //                           1 29
            //                           2 101;
                   goto _L1 _L2 _L3
_L1:
                return;
_L2:
                if (com.mapbar.android.location.b.e(a.b) && g.b)
                {
                    try
                    {
                        com.mapbar.android.location.b.a(a.b, com.mapbar.android.location.b.c(a.b), 0);
                        com.mapbar.android.location.b.a(a.b, com.mapbar.android.location.b.c(a.b), 1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message) { }
                    com.mapbar.android.location.b.f(a.b);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                if (com.mapbar.android.location.b.e(a.b) && k.a(com.mapbar.android.location.b.b(a.b)).b())
                {
                    com.mapbar.android.location.b.g(a.b);
                    com.mapbar.android.location.b.a((short)1000);
                } else
                {
                    com.mapbar.android.location.b.a((short)10000);
                }
                message = com.mapbar.android.location.b.h(a.b);
                message = com.mapbar.android.location.b.a(a.b, message);
                if (!"".equals(message) && !message.equals(com.mapbar.android.location.b.i(a.b)))
                {
                    com.mapbar.android.location.b.b(a.b, message);
                    k.a(com.mapbar.android.location.b.b(a.b)).c();
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = b.a.this;
                super();
            }
        };
        a.removeMessages(2);
        a.sendEmptyMessage(2);
        a.removeMessages(1);
        a.sendEmptyMessageDelayed(1, 100L);
        Looper.loop();
    }

    public _cls1.a(b b1, String s)
    {
        b = b1;
        super(s);
        a = null;
    }
}
