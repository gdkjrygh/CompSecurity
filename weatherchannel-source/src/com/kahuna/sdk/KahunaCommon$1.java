// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import android.util.Log;
import com.kahuna.sdk.location.KahunaRegionManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaSDKUpgradeManager, KahunaInternalDebugManager, GCMRegistrationManager, 
//            PushNotificationsManager, KahunaPreferences, ArchiveContainerObject, Event, 
//            EventBucketManager

class val.context
    implements Runnable
{

    final KahunaCommon this$0;
    final Context val$context;

    public void run()
    {
        Object obj;
        Object obj1;
        KahunaSDKUpgradeManager.checkIfSDKUpgraded(KahunaCommon.getSharedInstance(), KahunaCommon.access$000(KahunaCommon.this));
        if (!KahunaCommon.access$100(KahunaCommon.this))
        {
            KahunaCommon.access$200(KahunaCommon.this);
        }
        KahunaInternalDebugManager.onAppCreate(KahunaCommon.access$000(KahunaCommon.this));
        GCMRegistrationManager.init();
        PushNotificationsManager.init(val$context);
        ArchiveContainerObject archivecontainerobject;
        try
        {
            KahunaRegionManager.init(KahunaCommon.getSharedInstance());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.w("Kahuna", "Caught error when attepmting to initialize location services. If you are NOT using location services please ignore this error: ");
                Log.w("Kahuna", ((Throwable) (obj)));
            }
            continue; /* Loop/switch isn't completed */
        }
_L6:
        archivecontainerobject = KahunaPreferences.getSavedEvents(KahunaCommon.access$000(KahunaCommon.this), false);
        obj1 = KahunaCommon.access$300(KahunaCommon.this);
        obj1;
        JVM INSTR monitorenter ;
        KahunaCommon.access$402(KahunaCommon.this, archivecontainerobject.getArchivedEvents());
        if (KahunaCommon.access$400(KahunaCommon.this).isEmpty()) goto _L2; else goto _L1
_L1:
        obj = (Event)KahunaCommon.access$400(KahunaCommon.this).get(KahunaCommon.access$400(KahunaCommon.this).size() - 1);
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        if (((Event) (obj)).getEventNumber() <= 0L)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        KahunaCommon.access$500(KahunaCommon.this).set(((Event) (obj)).getEventNumber() + 1L);
_L4:
        obj1;
        JVM INSTR monitorexit ;
        EventBucketManager.rebuildBucketMappingsFromEvents(KahunaCommon.access$400(KahunaCommon.this));
        KahunaCommon.access$602(KahunaCommon.this, archivecontainerobject.getBase64CorruptedArchivedString());
        KahunaCommon.access$702(KahunaCommon.this, archivecontainerobject.getBase64CorruptedEventNames());
        return;
_L2:
        obj = null;
          goto _L3
        KahunaCommon.access$500(KahunaCommon.this).set(KahunaPreferences.getSavedEventNumber(KahunaCommon.access$000(KahunaCommon.this)));
          goto _L4
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    ger()
    {
        this$0 = final_kahunacommon;
        val$context = Context.this;
        super();
    }
}
