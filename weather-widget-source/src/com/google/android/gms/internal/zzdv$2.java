// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzdv, zzbb

class zzxS
    implements c
{

    final zzdv zzxL;
    final e zzxS;

    public void zza(zzbb zzbb1)
    {
        synchronized (zzdv.zzc(zzxL))
        {
            zzdv.zza(zzxL, 0);
            if (zzdv.zzg(zzxL) != null && zzxS != zzdv.zzg(zzxL))
            {
                zzb.v("New JS engine is loaded, marking previous one as destroyable.");
                zzdv.zzg(zzxL).zzdO();
            }
            zzdv.zza(zzxL, zzxS);
        }
        return;
        exception;
        zzbb1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzc(Object obj)
    {
        zza((zzbb)obj);
    }

    e(zzdv zzdv1, e e)
    {
        zzxL = zzdv1;
        zzxS = e;
        super();
    }
}
