// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.os.Debug;
import com.github.anrwatchdog.ANRError;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            AppLifecycleManager

class this._cls0
    implements com.github.anrwatchdog.r
{

    final AppLifecycleManager this$0;

    public void onAppNotResponding(ANRError anrerror)
    {
        if (Debug.isDebuggerConnected())
        {
            WLog.i(AppLifecycleManager.access$300(), (new StringBuilder()).append("Debugger is connected, ignore ANR Watchdog ").append(AppLifecycleManager.access$400(AppLifecycleManager.this)).toString());
            return;
        } else
        {
            throw anrerror;
        }
    }

    ()
    {
        this$0 = AppLifecycleManager.this;
        super();
    }
}
