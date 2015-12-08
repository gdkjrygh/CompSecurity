// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.OfflineMeasurementsCache;

// Referenced classes of package com.comscore.analytics:
//            Core

class r
    implements Runnable
{

    final int a;
    final Core b;

    r(Core core, int i)
    {
        b = core;
        a = i;
        super();
    }

    public void run()
    {
        b.a.setCacheMeasurementExpiry(a);
    }
}
