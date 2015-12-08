// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            zzk, zzho, zzi, zzx, 
//            zzm, zzr

private static class zzaH extends zzk
{

    private final zzh zzGz;
    private final zzh zzaH;

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
        zzaH.zb(zzGz.zzh(inputstream));
    }

    public _cls1.zzGB(String s, _cls1.zzGB zzgb, _cls1.zzGB zzgb1)
    {
        super(0, s, new zzm.zza(zzgb1, zzgb) {

            final zzm.zzb zzGA;
            final zzho.zza zzGB;

            public void zze(zzr zzr)
            {
                zzGA.zzb(zzGB.zzft());
            }

            
            {
                zzGA = zzb1;
                zzGB = zza1;
                super();
            }
        });
        zzGz = zzgb;
        zzaH = zzgb1;
    }
}
