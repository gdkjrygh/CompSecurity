// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcm

class zzaRu
    implements b
{

    final zzcm zzaRu;

    public ScheduledExecutorService zzAC()
    {
        return Executors.newSingleThreadScheduledExecutor();
    }

    vice(zzcm zzcm1)
    {
        zzaRu = zzcm1;
        super();
    }
}
