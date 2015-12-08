// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbe;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzdt;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

class zzDo
    implements Runnable
{

    final zzl zzDm;
    final JSONObject zzDn;
    final String zzDo;

    public void run()
    {
        zzl.zza(zzDm, zzl.zzfA().zzdU());
        com.google.android.gms.ads.internal.request.zzl.zzb(zzDm).zza(new com.google.android.gms.internal.zzhx.zzc() {

            final zzl._cls2 zzDp;

            public void zzb(zzbe zzbe1)
            {
                try
                {
                    zzbe1.zza("AFMA_getAdapterLessMediationAd", zzDp.zzDn);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzbe zzbe1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", zzbe1);
                }
                zzl.zzfz().zzV(zzDp.zzDo);
            }

            public void zzc(Object obj)
            {
                zzb((zzbe)obj);
            }

            
            {
                zzDp = zzl._cls2.this;
                super();
            }
        }, new com.google.android.gms.internal.zzhx.zza() {

            final zzl._cls2 zzDp;

            public void run()
            {
                zzl.zzfz().zzV(zzDp.zzDo);
            }

            
            {
                zzDp = zzl._cls2.this;
                super();
            }
        });
    }

    _cls2.zzDp(zzl zzl1, JSONObject jsonobject, String s)
    {
        zzDm = zzl1;
        zzDn = jsonobject;
        zzDo = s;
        super();
    }
}
