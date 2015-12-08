// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ContainerHolder;

// Referenced classes of package com.google.android.gms.internal:
//            zzqg, zzqe

class zzaTs
    implements ResultCallback
{

    final zzqg zzaTs;

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
        containerholder = new zzqe(zzqg.zza(zzaTs), containerholder, zzaTs.zzBn());
        zzqg.zza(zzaTs, containerholder.zzBh());
        zzqg.zzb(zzaTs);
    }

    inerHolder(zzqg zzqg1)
    {
        zzaTs = zzqg1;
        super();
    }
}
