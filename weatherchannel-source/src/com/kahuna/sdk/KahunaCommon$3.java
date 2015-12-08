// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaInternalDebugManager, KahunaUtils, GCMRegistrationManager, 
//            Event, KahunaInAppManager

class this._cls0
    implements Runnable
{

    final KahunaCommon this$0;

    public void run()
    {
        if (!KahunaCommon.access$100(KahunaCommon.this))
        {
            KahunaCommon.access$200(KahunaCommon.this);
        }
        Object obj = KahunaCommon.access$900();
        obj;
        JVM INSTR monitorenter ;
        if (KahunaCommon.access$1000(KahunaCommon.this).incrementAndGet() == 1)
        {
            if (KahunaInternalDebugManager.getShouldSentMonitorRequest())
            {
                KahunaInternalDebugManager.requestSendMonitorRequest(KahunaCommon.access$1100(KahunaCommon.this), KahunaCommon.access$1200(KahunaCommon.this), KahunaCommon.access$800(KahunaCommon.this));
            }
            KahunaCommon.debugManagerSetDebugLogging(KahunaInternalDebugManager.getIsDebugEnabled(KahunaCommon.access$000(KahunaCommon.this)));
            if (KahunaCommon.access$1300(KahunaCommon.this) == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            KahunaCommon.access$1300(KahunaCommon.this).cancel();
            KahunaCommon.access$1302(KahunaCommon.this, null);
            return;
        }
          goto _L1
        if (!KahunaCommon.access$1400(KahunaCommon.this) || KahunaUtils.isNullOrEmpty(KahunaCommon.senderId)) goto _L3; else goto _L2
_L2:
        Object obj1 = GCMRegistrationManager.getRegistrationId();
        if (!"".equals(obj1)) goto _L5; else goto _L4
_L4:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", "Device not registered yet, will now register with GCM");
        }
        setPushToken("");
        GCMRegistrationManager.registerForPush(KahunaCommon.senderId);
_L3:
        KahunaCommon.access$1500(KahunaCommon.this, new Event("Start"));
        Object obj3 = KahunaCommon.access$000(KahunaCommon.this).getResources().getConfiguration().locale;
        obj1 = TimeZone.getDefault();
        obj1 = ((TimeZone) (obj1)).getDisplayName(((TimeZone) (obj1)).inDaylightTime(new Date(System.currentTimeMillis())), 0);
        obj3 = ((Locale) (obj3)).getLanguage();
        HashMap hashmap = new HashMap();
        hashmap.put("kahuna_tz", obj1);
        hashmap.put("kahuna_lang", obj3);
        KahunaCommon.access$1600(KahunaCommon.this, hashmap);
_L7:
        KahunaCommon.access$1700(KahunaCommon.this);
_L1:
        KahunaInAppManager.hostAppNewActivityStarted();
        return;
_L5:
        setPushToken(((String) (obj1)));
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", "Device already registered");
        }
          goto _L3
        Object obj2;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj2;
        if (!KahunaCommon.mDebugEnabled) goto _L7; else goto _L6
_L6:
        Log.d("Kahuna", (new StringBuilder()).append("Exception occured trying to retrieve app language or timezone:").append(obj2).toString());
          goto _L7
    }

    ger()
    {
        this$0 = KahunaCommon.this;
        super();
    }
}
