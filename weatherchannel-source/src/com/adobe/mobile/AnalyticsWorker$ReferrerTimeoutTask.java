// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.TimerTask;

// Referenced classes of package com.adobe.mobile:
//            AnalyticsWorker, ReferrerHandler, StaticMethods

protected class kickFlag extends TimerTask
{

    private boolean kickFlag;
    final AnalyticsWorker this$0;

    public void run()
    {
        ReferrerHandler.setReferrerProcessed(true);
        StaticMethods.logDebugFormat("Analytics - Referrer timeout has expired without referrer data", new Object[0]);
        kick(kickFlag);
    }

    (boolean flag)
    {
        this$0 = AnalyticsWorker.this;
        super();
        kickFlag = false;
        kickFlag = flag;
    }
}
