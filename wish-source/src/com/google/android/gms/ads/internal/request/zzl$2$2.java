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

class zzzY
    implements com.google.android.gms.internal.
{

    final zX zzzY;

    public void run()
    {
        zzl.zzet().zzH(zzzY.zX);
    }

    zX(zX zx)
    {
        zzzY = zx;
        super();
    }

    // Unreferenced inner class com/google/android/gms/ads/internal/request/zzl$2

/* anonymous class */
    class zzl._cls2
        implements Runnable
    {

        final zzl zzzV;
        final JSONObject zzzW;
        final String zzzX;

        public void run()
        {
            zzl.zza(zzzV, zzl.zzeu().zzda());
            com.google.android.gms.ads.internal.request.zzl.zzb(zzzV).zza(new zzl._cls2._cls1(), new zzl._cls2._cls2(this));
        }

            
            {
                zzzV = zzl1;
                zzzW = jsonobject;
                zzzX = s;
                super();
            }

        // Unreferenced inner class com/google/android/gms/ads/internal/request/zzl$2$1

/* anonymous class */
        class zzl._cls2._cls1
            implements com.google.android.gms.internal.zzfx.zzd
        {

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
        }

    }

}
