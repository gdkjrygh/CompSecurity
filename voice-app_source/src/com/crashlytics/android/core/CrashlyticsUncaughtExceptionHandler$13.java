// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, CrashlyticsCore

class this._cls0
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler this$0;

    public Boolean call()
        throws Exception
    {
        if (!CrashlyticsUncaughtExceptionHandler.access$300(CrashlyticsUncaughtExceptionHandler.this).get())
        {
            Fabric.getLogger().d("CrashlyticsCore", "Finalizing previously open sessions.");
            com.crashlytics.android.core.internal.models.SessionEventData sessioneventdata = CrashlyticsUncaughtExceptionHandler.access$900(CrashlyticsUncaughtExceptionHandler.this).getExternalCrashEventData();
            if (sessioneventdata != null)
            {
                CrashlyticsUncaughtExceptionHandler.access$1000(CrashlyticsUncaughtExceptionHandler.this, sessioneventdata);
            }
            CrashlyticsUncaughtExceptionHandler.access$1100(CrashlyticsUncaughtExceptionHandler.this, true);
            Fabric.getLogger().d("CrashlyticsCore", "Closed all previously open sessions");
            return Boolean.valueOf(true);
        } else
        {
            Fabric.getLogger().d("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
            return Boolean.valueOf(false);
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    I()
    {
        this$0 = CrashlyticsUncaughtExceptionHandler.this;
        super();
    }
}
