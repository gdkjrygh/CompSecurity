// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import java.util.EventObject;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatistics

class a
    implements Runnable
{

    final EventObject a;
    final AppStatistics b;

    public void run()
    {
        AppStatistics.b(b, a);
    }

    (AppStatistics appstatistics, EventObject eventobject)
    {
        b = appstatistics;
        a = eventobject;
        super();
    }
}
