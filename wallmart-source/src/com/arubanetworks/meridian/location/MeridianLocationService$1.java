// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arubanetworks.meridian.internal.util.Dev;

// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocationService

class a extends BroadcastReceiver
{

    final MeridianLocationService a;

    public void onReceive(Context context, Intent intent)
    {
        String s;
        byte byte0;
        s = intent.getAction();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 48
    //                   -1875733435: 77
    //                   -1530327060: 92
    //                   -511271086: 107;
           goto _L1 _L2 _L3 _L4
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 76
    //                   0 122
    //                   1 137
    //                   2 153;
           goto _L5 _L6 _L7 _L8
_L5:
        return;
_L2:
        if (s.equals("android.net.wifi.WIFI_STATE_CHANGED"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s.equals("android.bluetooth.adapter.action.STATE_CHANGED"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s.equals("android.location.MODE_CHANGED"))
        {
            byte0 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        MeridianLocationService.a(a, intent.getIntExtra("wifi_state", 4));
        return;
_L7:
        MeridianLocationService.b(a, intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10));
        return;
_L8:
        if (android.os.eridianLocationService._cls1.a < 19) goto _L5; else goto _L9
_L9:
        boolean flag = Dev.isLocationEnabled(context);
        if (MeridianLocationService.a(a) == flag) goto _L5; else goto _L10
_L10:
        MeridianLocationService.a(a, flag);
        if (MeridianLocationService.a(a))
        {
            MeridianLocationService.a(a, MeridianLocationService.b(a), MeridianLocationService.c(a));
            return;
        }
        MeridianLocationService.d(a);
        return;
        if (true) goto _L1; else goto _L11
_L11:
    }

    (MeridianLocationService meridianlocationservice)
    {
        a = meridianlocationservice;
        super();
    }
}
