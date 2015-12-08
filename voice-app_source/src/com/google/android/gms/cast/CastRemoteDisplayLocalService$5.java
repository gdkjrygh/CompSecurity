// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

class zzRp
    implements ResultCallback
{

    final CastRemoteDisplayLocalService zzRp;

    public void onResult(Result result)
    {
        zza((laySessionResult)result);
    }

    public void zza(laySessionResult laysessionresult)
    {
        if (!laysessionresult.getStatus().isSuccess())
        {
            CastRemoteDisplayLocalService.zzln().zzb("Unable to stop the remote display, result unsuccessful", new Object[0]);
        } else
        {
            CastRemoteDisplayLocalService.zzln().zzb("remote display stopped", new Object[0]);
        }
        CastRemoteDisplayLocalService.zzb(zzRp, null);
    }

    laySessionResult(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        zzRp = castremotedisplaylocalservice;
        super();
    }
}
