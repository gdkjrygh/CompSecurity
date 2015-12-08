// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.zzbg;

// Referenced classes of package com.google.android.gms.internal:
//            zzqn, zzqa, zzqe, zzpy, 
//            zzqh, zzqd, zzqb

class zzaPk extends zzqn
{

    final zzqa zzaPj;
    private final zzaPk zzaPk;

    protected zzaPk zza(zzpy zzpy1)
    {
        return null;
    }

    protected void zza(zzqe zzqe1)
    {
        zzaPk zzapk = zzqe1.zzAg();
        zzaPj.zza(zzapk);
        if (zzapk.getStatus() == Status.zzXP && zzapk.zzAh() == zza.zzaPu && zzapk.zzAi() != null && zzapk.zzAi().length > 0)
        {
            zzqa.zza(zzaPj).zze(zzapk.zzAj().zzAb(), zzapk.zzAi());
            zzbg.zzaB("Resource successfully load from Network.");
            zzaPk.zza(zzqe1);
            return;
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("Response status: ");
        if (zzapk.getStatus().isSuccess())
        {
            zzqe1 = "SUCCESS";
        } else
        {
            zzqe1 = "FAILURE";
        }
        zzbg.zzaB(stringbuilder.append(zzqe1).toString());
        if (zzapk.getStatus().isSuccess())
        {
            zzbg.zzaB((new StringBuilder()).append("Response source: ").append(zzapk.zzAh().toString()).toString());
            zzbg.zzaB((new StringBuilder()).append("Response size: ").append(zzapk.zzAi().length).toString());
        }
        zzaPj.zza(zzapk.zzAj(), zzaPk);
    }

    zza(zzqa zzqa1, zzqd zzqd, zzqb zzqb, zza zza1)
    {
        zzaPj = zzqa1;
        super(zzqd, zzqb);
        zzaPk = zza1;
    }
}
