// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbb;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zziq;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh

class zzwk
    implements zzdg
{

    final zzh zzwk;

    public void zza(zzip zzip1, Map map)
    {
        zzh.zze(zzwk).zzgS().zza(new com.google.android.gms.internal.zziq.zza(map) {

            final Map zzwl;
            final zzh._cls1 zzwm;

            public void zza(zzip zzip2, boolean flag)
            {
                zzh.zza(zzwm.zzwk, (String)zzwl.get("id"));
                zzip2 = new JSONObject();
                try
                {
                    zzip2.put("messageType", "htmlLoaded");
                    zzip2.put("id", zzh.zzc(zzwm.zzwk));
                    zzh.zzd(zzwm.zzwk).zzb("sendMessageToNativeJs", zzip2);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzip zzip2)
                {
                    zzb.zzb("Unable to dispatch sendMessageToNativeJsevent", zzip2);
                }
            }

            
            {
                zzwm = zzh._cls1.this;
                zzwl = map;
                super();
            }
        });
        zzip1 = (String)map.get("overlayHtml");
        zzh.zze(zzwk).loadData(zzip1, "text/html", "UTF-8");
    }

    _cls1.zzwl(zzh zzh1)
    {
        zzwk = zzh1;
        super();
    }
}
