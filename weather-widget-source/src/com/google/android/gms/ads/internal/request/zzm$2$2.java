// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbe;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzdv;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

class zzEE
    implements com.google.android.gms.internal.
{

    final ED zzEE;

    public void run()
    {
        zzm.zzfD().zzX(zzEE.ED);
    }

    ED(ED ed)
    {
        zzEE = ed;
        super();
    }

    // Unreferenced inner class com/google/android/gms/ads/internal/request/zzm$2

/* anonymous class */
    class zzm._cls2
        implements Runnable
    {

        final zzm zzEB;
        final JSONObject zzEC;
        final String zzED;

        public void run()
        {
            zzm.zza(zzEB, zzm.zzfE().zzdL());
            com.google.android.gms.ads.internal.request.zzm.zzb(zzEB).zza(new zzm._cls2._cls1(), new zzm._cls2._cls2(this));
        }

            
            {
                zzEB = zzm1;
                zzEC = jsonobject;
                zzED = s;
                super();
            }

        // Unreferenced inner class com/google/android/gms/ads/internal/request/zzm$2$1

/* anonymous class */
        class zzm._cls2._cls1
            implements com.google.android.gms.internal.zzij.zzc
        {

            final zzm._cls2 zzEE;

            public void zzb(zzbe zzbe1)
            {
                try
                {
                    zzbe1.zza("AFMA_getAdapterLessMediationAd", zzEE.zzEC);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzbe zzbe1)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", zzbe1);
                }
                zzm.zzfD().zzX(zzEE.zzED);
            }

            public void zzc(Object obj)
            {
                zzb((zzbe)obj);
            }

                    
                    {
                        zzEE = zzm._cls2.this;
                        super();
                    }
        }

    }

}
