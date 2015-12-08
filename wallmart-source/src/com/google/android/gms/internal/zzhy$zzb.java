// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            zzk, zzhy, zzi, zzx, 
//            zzm, zzr

private static class zzaG extends zzk
{

    private final zzh zzIk;
    private final zzh zzaG;

    protected zzm zza(zzi zzi1)
    {
        return zzm.zza(new ByteArrayInputStream(zzi1.data), zzx.zzb(zzi1));
    }

    protected void zza(Object obj)
    {
        zzj((InputStream)obj);
    }

    protected void zzj(InputStream inputstream)
    {
        zzaG.zb(zzIk.zzh(inputstream));
    }

    public _cls1.zzIm(String s, _cls1.zzIm zzim, _cls1.zzIm zzim1)
    {
        super(0, s, new zzm.zza(zzim1, zzim) {

            final zzm.zzb zzIl;
            final zzhy.zza zzIm;

            public void zze(zzr zzr)
            {
                zzIl.zzb(zzIm.zzfv());
            }

            
            {
                zzIl = zzb1;
                zzIm = zza1;
                super();
            }
        });
        zzIk = zzim;
        zzaG = zzim1;
    }
}
