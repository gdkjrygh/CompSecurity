// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, Event

class val.status
    implements Runnable
{

    final KahunaCommon this$0;
    final String val$regionId;
    final String val$status;

    public void run()
    {
        try
        {
            HashMap hashmap = new HashMap();
            hashmap.put("id", val$regionId);
            hashmap.put("status", val$status);
            hashmap.put("type", "circle");
            Event event = new Event("k_user_location");
            event.setLocationMetadata(hashmap);
            KahunaCommon.access$1500(KahunaCommon.this, event);
            return;
        }
        catch (Exception exception)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.trackRegionMonitoringEvent(): ").append(exception).toString());
        }
    }

    ()
    {
        this$0 = final_kahunacommon;
        val$regionId = s;
        val$status = String.this;
        super();
    }
}
