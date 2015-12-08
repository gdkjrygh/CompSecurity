// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            Analytics, AnalyticsWorker

static final class er
    implements Runnable
{

    public void run()
    {
        AnalyticsWorker.sharedInstance().forceKick();
    }

    er()
    {
    }
}
