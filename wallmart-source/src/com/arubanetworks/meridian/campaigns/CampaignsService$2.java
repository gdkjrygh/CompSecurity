// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.campaigns;

import android.bluetooth.BluetoothAdapter;
import com.arubanetworks.meridian.log.MeridianLogger;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.arubanetworks.meridian.campaigns:
//            CampaignsService

class d extends TimerTask
{

    final AtomicLong a;
    final BluetoothAdapter b;
    final android.bluetooth.ScanCallback c;
    final AtomicBoolean d;
    final CampaignsService e;

    public void run()
    {
        if (System.nanoTime() - a.get() >= CampaignsService.a(e).f || !CampaignsService.b(e.getApplicationContext()))
        {
            cancel();
            CampaignsService.b(e);
            CampaignsService.a().d("Canceled due to timeout! state = %s", new Object[] {
                CampaignsService.a(e).name()
            });
            b.stopLeScan(c);
            d.set(true);
        }
    }

    dateCheckState(CampaignsService campaignsservice, AtomicLong atomiclong, BluetoothAdapter bluetoothadapter, android.bluetooth.ScanCallback scancallback, AtomicBoolean atomicboolean)
    {
        e = campaignsservice;
        a = atomiclong;
        b = bluetoothadapter;
        c = scancallback;
        d = atomicboolean;
        super();
    }
}
