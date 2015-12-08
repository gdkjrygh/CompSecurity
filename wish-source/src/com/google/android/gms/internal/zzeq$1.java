// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzeq, zzcf, zzes, zzay, 
//            zzfx, zzax, zzy

static final class zzAl
    implements Runnable
{

    final zzcf zzAh;
    final zzes zzAi;
    final zzay zzAj;
    final zzax zzAk;
    final String zzAl;

    public void run()
    {
        zzfx zzfx1 = zzAh.zzda();
        zzAi.zze(zzfx1);
        zzAj.zza(zzAk, new String[] {
            "rwc"
        });
        zzfx1.zza(new zzfx.zzd(zzAj.zzct()) {

            final zzax zzAm;
            final zzeq._cls1 zzAn;

            public void zza(Object obj)
            {
                zzc((zzy)obj);
            }

            public void zzc(zzy zzy1)
            {
                zzAn.zzAj.zza(zzAm, new String[] {
                    "jsf"
                });
                zzAn.zzAj.zzcu();
                zzy1.zza("/invalidRequest", zzAn.zzAi.zzAy);
                zzy1.zza("/loadAdURL", zzAn.zzAi.zzAz);
                try
                {
                    zzy1.zzb("AFMA_buildAdURL", zzAn.zzAl);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzy zzy1)
                {
                    zzb.zzb("Error requesting an ad url", zzy1);
                }
            }

            
            {
                zzAn = zzeq._cls1.this;
                zzAm = zzax;
                super();
            }
        }, new zzfx.zza() {

            final zzeq._cls1 zzAn;

            public void run()
            {
            }

            
            {
                zzAn = zzeq._cls1.this;
                super();
            }
        });
    }

    _cls2.zzAn(zzcf zzcf1, zzes zzes1, zzay zzay1, zzax zzax, String s)
    {
        zzAh = zzcf1;
        zzAi = zzes1;
        zzAj = zzay1;
        zzAk = zzax;
        zzAl = s;
        super();
    }
}
