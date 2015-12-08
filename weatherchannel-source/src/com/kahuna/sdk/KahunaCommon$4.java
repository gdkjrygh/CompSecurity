// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaPreferences

class this._cls0
    implements Runnable
{

    final KahunaCommon this$0;

    public void run()
    {
        Object obj = KahunaCommon.access$900();
        obj;
        JVM INSTR monitorenter ;
        int i;
        i = KahunaCommon.access$1000(KahunaCommon.this).decrementAndGet();
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Called stop, remaining activities in foreground is: ").append(i).toString());
        }
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (KahunaCommon.access$1300(KahunaCommon.this) != null)
        {
            KahunaCommon.access$1300(KahunaCommon.this).cancel();
            KahunaCommon.access$1302(KahunaCommon.this, null);
        }
        KahunaCommon.access$1302(KahunaCommon.this, new Timer());
    /* block-local class not found */
    class _cls1 {}

        KahunaCommon.access$1300(KahunaCommon.this).schedule(new _cls1(), 5000L);
        synchronized (KahunaCommon.access$300(KahunaCommon.this))
        {
            KahunaPreferences.saveEvents(KahunaCommon.access$400(KahunaCommon.this), KahunaCommon.access$000(KahunaCommon.this));
        }
        KahunaPreferences.saveEventNumber(KahunaCommon.access$500(KahunaCommon.this).get(), KahunaCommon.access$000(KahunaCommon.this));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    omicLong()
    {
        this$0 = KahunaCommon.this;
        super();
    }
}
