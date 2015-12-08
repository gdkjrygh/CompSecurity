// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;


// Referenced classes of package com.walmart.android.analytics:
//            AnalyticsHelper

static final class val.object
    implements Runnable
{

    final Object val$object;

    public void run()
    {
        AnalyticsHelper.post(val$object);
    }

    (Object obj)
    {
        val$object = obj;
        super();
    }
}
