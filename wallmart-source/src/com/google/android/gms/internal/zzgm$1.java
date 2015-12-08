// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzgm, zzdv, zzgo, zzcd, 
//            zzcc, zzbe

static final class zzER
    implements Runnable
{

    final zzdv zzEO;
    final zzgo zzEP;
    final zzcc zzEQ;
    final String zzER;
    final zzcd zzoC;

    public void run()
    {
        d d = zzEO.zzdL();
        zzEP.zzb(d);
        zzoC.zza(zzEQ, new String[] {
            "rwc"
        });
        d.zza(new zzij.zzc(zzoC.zzdl()) {

            final zzcc zzES;
            final zzgm._cls1 zzET;

            public void zzb(zzbe zzbe1)
            {
                zzET.zzoC.zza(zzES, new String[] {
                    "jsf"
                });
                zzET.zzoC.zzdm();
                zzbe1.zza("/invalidRequest", zzET.zzEP.zzFc);
                zzbe1.zza("/loadAdURL", zzET.zzEP.zzFd);
                try
                {
                    zzbe1.zza("AFMA_buildAdURL", zzET.zzER);
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
                zzET = zzgm._cls1.this;
                zzES = zzcc;
                super();
            }
        }, new zzij.zza() {

            final zzgm._cls1 zzET;

            public void run()
            {
            }

            
            {
                zzET = zzgm._cls1.this;
                super();
            }
        });
    }

    _cls2.zzET(zzdv zzdv1, zzgo zzgo1, zzcd zzcd1, zzcc zzcc, String s)
    {
        zzEO = zzdv1;
        zzEP = zzgo1;
        zzoC = zzcd1;
        zzEQ = zzcc;
        zzER = s;
        super();
    }
}
