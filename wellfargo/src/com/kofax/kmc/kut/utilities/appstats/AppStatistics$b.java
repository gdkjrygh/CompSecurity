// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatistics

class <init>
    implements com.kofax.kmc.kut.utilities.async.ompletedListener
{

    final AppStatistics a;

    public void onTaskCompleted(com.kofax.kmc.kut.utilities.async.ompletedEvent ompletedevent)
    {
        if (ompletedevent.getTaskError() != ErrorInfo.KMC_SUCCESS);
    }

    private letedEvent(AppStatistics appstatistics)
    {
        a = appstatistics;
        super();
    }

    a(AppStatistics appstatistics, a a1)
    {
        this(appstatistics);
    }
}
