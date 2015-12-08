// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ContainerHolder;

// Referenced classes of package com.google.android.gms.internal:
//            zzmh, zzmf

class zzaGK
    implements ResultCallback
{

    final zzmh zzaGK;

    public void onResult(Result result)
    {
        zza((ContainerHolder)result);
    }

    public void zza(ContainerHolder containerholder)
    {
        if (containerholder.getStatus().isSuccess())
        {
            containerholder = containerholder.getContainer();
        } else
        {
            containerholder = null;
        }
        containerholder = new zzmf(zzmh.zza(zzaGK), containerholder, zzaGK.zzyb());
        zzmh.zza(zzaGK, containerholder.zzxV());
        zzmh.zzb(zzaGK);
    }

    inerHolder(zzmh zzmh1)
    {
        zzaGK = zzmh1;
        super();
    }
}
