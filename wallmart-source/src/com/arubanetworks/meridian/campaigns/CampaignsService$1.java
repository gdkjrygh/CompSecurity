// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.campaigns;

import android.bluetooth.BluetoothDevice;
import com.arubanetworks.meridian.location.Beacon;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.arubanetworks.meridian.campaigns:
//            CampaignsService, CampaignCache

class b
    implements android.bluetooth.ScanCallback
{

    final HashMap a;
    final AtomicLong b;
    final CampaignsService c;

    public void onLeScan(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        bluetoothdevice = Beacon.fromScanData(bluetoothdevice, abyte0, i);
        if (bluetoothdevice != null)
        {
            if (CampaignsService.a(c) == dateCheckState.c)
            {
                CampaignsService.a(c, dateCheckState.b);
            }
            abyte0 = a.values().iterator();
            boolean flag = false;
            while (abyte0.hasNext()) 
            {
                if (((CampaignCache)abyte0.next()).a(c.getApplicationContext(), bluetoothdevice, i) || flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            if (flag)
            {
                b.set(System.nanoTime());
                CampaignsService.a(c, dateCheckState.a);
                return;
            }
        }
    }

    dateCheckState(CampaignsService campaignsservice, HashMap hashmap, AtomicLong atomiclong)
    {
        c = campaignsservice;
        a = hashmap;
        b = atomiclong;
        super();
    }
}
