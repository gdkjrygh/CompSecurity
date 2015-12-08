// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzik, zzdv, zzbf, zzbe

public static class zzxV extends zzik
{

    private final Object zzpc = new Object();
    private final zzdN zzxV;
    private boolean zzxW;

    static zzxV zza(zzxV zzxv)
    {
        return zzxv.zzxV;
    }

    public void release()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (!zzxW)
                {
                    break label0;
                }
            }
            return;
        }
        zzxW = true;
        zza(new zzij.zzc() {

            final zzdv.zzd zzxX;

            public void zzb(zzbe zzbe1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.v("Ending javascript session.");
                ((zzbf)zzbe1).zzck();
            }

            public void zzc(Object obj1)
            {
                zzb((zzbe)obj1);
            }

            
            {
                zzxX = zzdv.zzd.this;
                super();
            }
        }, new <init>());
        zza(new zzij.zzc() {

            final zzdv.zzd zzxX;

            public void zzb(zzbe zzbe1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.v("Releasing engine reference.");
                zzdv.zzd.zza(zzxX).zzdN();
            }

            public void zzc(Object obj1)
            {
                zzb((zzbe)obj1);
            }

            
            {
                zzxX = zzdv.zzd.this;
                super();
            }
        }, new zzij.zza() {

            final zzdv.zzd zzxX;

            public void run()
            {
                zzdv.zzd.zza(zzxX).zzdN();
            }

            
            {
                zzxX = zzdv.zzd.this;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public _cls3.zzxX(_cls3.zzxX zzxx)
    {
        zzxV = zzxx;
    }
}
