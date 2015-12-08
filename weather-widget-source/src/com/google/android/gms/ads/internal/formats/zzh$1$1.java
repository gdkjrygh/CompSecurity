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

class zzwl
    implements com.google.android.gms.internal.
{

    final Map zzwl;
    final zzb zzwm;

    public void zza(zzip zzip, boolean flag)
    {
        zzh.zza(zzwm.wk, (String)zzwl.get("id"));
        zzip = new JSONObject();
        try
        {
            zzip.put("messageType", "htmlLoaded");
            zzip.put("id", zzh.zzc(zzwm.wk));
            zzh.zzd(zzwm.wk).zzb("sendMessageToNativeJs", zzip);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzip zzip)
        {
            zzb.zzb("Unable to dispatch sendMessageToNativeJsevent", zzip);
        }
    }

    wk(wk wk, Map map)
    {
        zzwm = wk;
        zzwl = map;
        super();
    }

    // Unreferenced inner class com/google/android/gms/ads/internal/formats/zzh$1

/* anonymous class */
    class zzh._cls1
        implements zzdg
    {

        final zzh zzwk;

        public void zza(zzip zzip1, Map map)
        {
            zzh.zze(zzwk).zzgS().zza(new zzh._cls1._cls1(this, map));
            zzip1 = (String)map.get("overlayHtml");
            zzh.zze(zzwk).loadData(zzip1, "text/html", "UTF-8");
        }

            
            {
                zzwk = zzh1;
                super();
            }
    }

}
