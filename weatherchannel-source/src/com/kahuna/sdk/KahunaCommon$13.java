// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;
import com.kahuna.sdk.location.KahunaIBeacon;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, Event

class val.status
    implements Runnable
{

    final KahunaCommon this$0;
    final KahunaIBeacon val$beacon;
    final String val$status;

    public void run()
    {
        try
        {
            HashMap hashmap = new HashMap();
            hashmap.put("id", val$beacon.getId());
            hashmap.put("status", val$status);
            hashmap.put("type", "beacon");
            if (val$beacon.getMajor() > -1)
            {
                hashmap.put("major", Integer.valueOf(val$beacon.getMajor()));
            }
            if (val$beacon.getMinor() > -1)
            {
                hashmap.put("minor", Integer.valueOf(val$beacon.getMinor()));
            }
            Event event = new Event("k_user_location", System.currentTimeMillis() / 1000L);
            event.setLocationMetadata(hashmap);
            KahunaCommon.access$1500(KahunaCommon.this, event);
            return;
        }
        catch (Exception exception)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.trackRegionMonitoringEvent(): ").append(exception).toString());
        }
    }

    Beacon()
    {
        this$0 = final_kahunacommon;
        val$beacon = kahunaibeacon;
        val$status = String.this;
        super();
    }
}
