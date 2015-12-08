// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzgf, zzdt, zzgh, zzce, 
//            zzcd, zzbe

static final class zzDC
    implements Runnable
{

    final zzce zzDA;
    final zzcd zzDB;
    final String zzDC;
    final zzdt zzDy;
    final zzgh zzDz;

    public void run()
    {
        d d = zzDy.zzdU();
        zzDz.zzb(d);
        zzDA.zza(zzDB, new String[] {
            "rwc"
        });
        d.zza(new zzhx.zzc(zzDA.zzdo()) {

            final zzcd zzDD;
            final zzgf._cls1 zzDE;

            public void zzb(zzbe zzbe1)
            {
                zzDE.zzDA.zza(zzDD, new String[] {
                    "jsf"
                });
                zzDE.zzDA.zzdp();
                zzbe1.zza("/invalidRequest", zzDE.zzDz.zzDO);
                zzbe1.zza("/loadAdURL", zzDE.zzDz.zzDP);
                try
                {
                    zzbe1.zza("AFMA_buildAdURL", zzDE.zzDC);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzbe zzbe1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", zzbe1);
                }
            }

            public void zzc(Object obj)
            {
                zzb((zzbe)obj);
            }

            
            {
                zzDE = zzgf._cls1.this;
                zzDD = zzcd;
                super();
            }
        }, new zzhx.zza() {

            final zzgf._cls1 zzDE;

            public void run()
            {
            }

            
            {
                zzDE = zzgf._cls1.this;
                super();
            }
        });
    }

    _cls2.zzDE(zzdt zzdt1, zzgh zzgh1, zzce zzce1, zzcd zzcd, String s)
    {
        zzDy = zzdt1;
        zzDz = zzgh1;
        zzDA = zzce1;
        zzDB = zzcd;
        zzDC = s;
        super();
    }
}
