// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbx;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzfx;
import com.google.android.gms.internal.zzy;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

class zzzX
    implements Runnable
{

    final zzl zzzV;
    final JSONObject zzzW;
    final String zzzX;

    public void run()
    {
        zzl.zza(zzzV, zzl.zzeu().zzda());
        com.google.android.gms.ads.internal.request.zzl.zzb(zzzV).zza(new com.google.android.gms.internal.zzfx.zzd() {

            final zzl._cls2 zzzY;

            public void zza(Object obj)
            {
                zzc((zzy)obj);
            }

            public void zzc(zzy zzy1)
            {
                try
                {
                    zzy1.zza("AFMA_getAdapterLessMediationAd", zzzY.zzzW);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzy zzy1)
                {
                    zzb.zzb("Error requesting an ad url", zzy1);
                }
                zzl.zzet().zzH(zzzY.zzzX);
            }

            
            {
                zzzY = zzl._cls2.this;
                super();
            }
        }, new com.google.android.gms.internal.zzfx.zza() {

            final zzl._cls2 zzzY;

            public void run()
            {
                zzl.zzet().zzH(zzzY.zzzX);
            }

            
            {
                zzzY = zzl._cls2.this;
                super();
            }
        });
    }

    _cls2.zzzY(zzl zzl1, JSONObject jsonobject, String s)
    {
        zzzV = zzl1;
        zzzW = jsonobject;
        zzzX = s;
        super();
    }
}
