// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.zzbg;

// Referenced classes of package com.google.android.gms.internal:
//            zzqx, zzqk, zzqo, zzqi, 
//            zzqr, zzqn, zzql

class zzaTE extends zzqx
{

    final zzqk zzaTD;
    private final zzaTE zzaTE;

    protected zzaTE zza(zzqi zzqi1)
    {
        return null;
    }

    protected void zza(zzqo zzqo1)
    {
        zzaTE zzate = zzqo1.zzBw();
        zzaTD.zza(zzate);
        if (zzate.getStatus() == Status.zzaaD && zzate.zzBx() == zza.zzaTO && zzate.zzBy() != null && zzate.zzBy().length > 0)
        {
            zzqk.zza(zzaTD).zze(zzate.zzBz().zzBr(), zzate.zzBy());
            zzbg.v("Resource successfully load from Network.");
            zzaTE.zza(zzqo1);
            return;
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("Response status: ");
        if (zzate.getStatus().isSuccess())
        {
            zzqo1 = "SUCCESS";
        } else
        {
            zzqo1 = "FAILURE";
        }
        zzbg.v(stringbuilder.append(zzqo1).toString());
        if (zzate.getStatus().isSuccess())
        {
            zzbg.v((new StringBuilder()).append("Response source: ").append(zzate.zzBx().toString()).toString());
            zzbg.v((new StringBuilder()).append("Response size: ").append(zzate.zzBy().length).toString());
        }
        zzaTD.zza(zzate.zzBz(), zzaTE);
    }

    zza(zzqk zzqk1, zzqn zzqn, zzql zzql, zza zza1)
    {
        zzaTD = zzqk1;
        super(zzqn, zzql);
        zzaTE = zza1;
    }
}
