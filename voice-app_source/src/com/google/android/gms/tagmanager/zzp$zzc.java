// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzlb;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf, zzp, zzbg

private class <init>
    implements zzbf
{

    final zzp zzaKZ;

    public void zza( )
    {
         = zzaKZ;
        ;
        JVM INSTR monitorenter ;
        if (!zzaKZ.isReady())
        {
            if (zzp.zzf(zzaKZ) == null)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            zzaKZ.setResult(zzp.zzf(zzaKZ));
        }
_L2:
        zzp.zza(zzaKZ, 0x36ee80L);
        return;
        zzaKZ.setResult(zzaKZ.zzaU(Status.zzXS));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        ;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(com.google.android.gms.internal. )
    {
label0:
        {
            synchronized (zzaKZ)
            {
                if (.zziO != null)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                if (zzp.zzi(zzaKZ).zziO != null)
                {
                    break label0;
                }
                zzbg.zzaz("Current resource is null; network resource is also null");
                zzp.zza(zzaKZ, 0x36ee80L);
            }
            return;
        }
        .zziO = zzp.zzi(zzaKZ).zziO;
        zzp.zza(zzaKZ, , zzp.zzg(zzaKZ).currentTimeMillis(), false);
        zzbg.zzaB((new StringBuilder()).append("setting refresh time to current time: ").append(zzp.zzj(zzaKZ)).toString());
        if (!zzp.zzk(zzaKZ))
        {
            zzp.zza(zzaKZ, );
        }
        zzp1;
        JVM INSTR monitorexit ;
        return;
        ;
        zzp1;
        JVM INSTR monitorexit ;
        throw ;
    }

    public void zzyv()
    {
    }

    public void zzz(Object obj)
    {
        zzb((com.google.android.gms.internal.)obj);
    }

    private (zzp zzp1)
    {
        zzaKZ = zzp1;
        super();
    }

    zzaKZ(zzp zzp1, zzaKZ zzakz)
    {
        this(zzp1);
    }
}
