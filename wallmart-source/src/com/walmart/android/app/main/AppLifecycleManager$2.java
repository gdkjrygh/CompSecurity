// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            AppLifecycleManager

class this._cls0
    implements com.github.anrwatchdog.onListener
{

    final AppLifecycleManager this$0;

    public void onInterrupted(InterruptedException interruptedexception)
    {
        WLog.i(AppLifecycleManager.access$300(), "ANR Watchdog has stopped");
    }

    ener()
    {
        this$0 = AppLifecycleManager.this;
        super();
    }
}
