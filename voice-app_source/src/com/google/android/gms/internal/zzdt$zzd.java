// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzhy, zzdt, zzbf, zzbe

public static class zzxe extends zzhy
{

    private final Object zzqt = new Object();
    private final zzdW zzxe;
    private boolean zzxf;

    static zzxe zza(zzxe zzxe1)
    {
        return zzxe1.zzxe;
    }

    public void release()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (!zzxf)
                {
                    break label0;
                }
            }
            return;
        }
        zzxf = true;
        zza(new zzhx.zzc() {

            final zzdt.zzd zzxg;

            public void zzb(zzbe zzbe1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Ending javascript session.");
                ((zzbf)zzbe1).zzcg();
            }

            public void zzc(Object obj1)
            {
                zzb((zzbe)obj1);
            }

            
            {
                zzxg = zzdt.zzd.this;
                super();
            }
        }, new <init>());
        zza(new zzhx.zzc() {

            final zzdt.zzd zzxg;

            public void zzb(zzbe zzbe1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Releasing engine reference.");
                zzdt.zzd.zza(zzxg).zzdW();
            }

            public void zzc(Object obj1)
            {
                zzb((zzbe)obj1);
            }

            
            {
                zzxg = zzdt.zzd.this;
                super();
            }
        }, new zzhx.zza() {

            final zzdt.zzd zzxg;

            public void run()
            {
                zzdt.zzd.zza(zzxg).zzdW();
            }

            
            {
                zzxg = zzdt.zzd.this;
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

    public _cls3.zzxg(_cls3.zzxg zzxg)
    {
        zzxe = zzxg;
    }
}
