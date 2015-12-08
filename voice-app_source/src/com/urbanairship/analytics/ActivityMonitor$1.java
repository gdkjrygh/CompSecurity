// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;


// Referenced classes of package com.urbanairship.analytics:
//            ActivityMonitor

class this._cls0
    implements Runnable
{

    final ActivityMonitor this$0;

    public void run()
    {
        updateForegroundState();
    }

    ()
    {
        this$0 = ActivityMonitor.this;
        super();
    }
}
