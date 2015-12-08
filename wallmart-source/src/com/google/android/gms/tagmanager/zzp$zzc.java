// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzlm;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf, zzp, zzbg

private class <init>
    implements zzbf
{

    final zzp zzaPt;

    public void zzB(Object obj)
    {
        zzb((com.google.android.gms.internal.)obj);
    }

    public void zza( )
    {
         = zzaPt;
        ;
        JVM INSTR monitorenter ;
        if (!zzaPt.isReady())
        {
            if (zzp.zzf(zzaPt) == null)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            zzaPt.zza(zzp.zzf(zzaPt));
        }
_L2:
        zzp.zza(zzaPt, 0x36ee80L);
        return;
        zzaPt.zza(zzaPt.zzbg(Status.zzaaG));
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
            synchronized (zzaPt)
            {
                if (.zziR != null)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                if (zzp.zzi(zzaPt).zziR != null)
                {
                    break label0;
                }
                zzbg.e("Current resource is null; network resource is also null");
                zzp.zza(zzaPt, 0x36ee80L);
            }
            return;
        }
        .zziR = zzp.zzi(zzaPt).zziR;
        zzp.zza(zzaPt, , zzp.zzg(zzaPt).currentTimeMillis(), false);
        zzbg.v((new StringBuilder()).append("setting refresh time to current time: ").append(zzp.zzj(zzaPt)).toString());
        if (!zzp.zzk(zzaPt))
        {
            zzp.zza(zzaPt, );
        }
        zzp1;
        JVM INSTR monitorexit ;
        return;
        ;
        zzp1;
        JVM INSTR monitorexit ;
        throw ;
    }

    public void zzzL()
    {
    }

    private (zzp zzp1)
    {
        zzaPt = zzp1;
        super();
    }

    zzaPt(zzp zzp1, zzaPt zzapt)
    {
        this(zzp1);
    }
}
