// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbb;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzip;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh

class zzwk
    implements zzdg
{

    final zzh zzwk;

    public void zza(zzip zzip, Map map)
    {
        zzip = new JSONObject();
        try
        {
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zzip.put(s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (zzip zzip)
        {
            zzb.zzb("Unable to dispatch sendMessageToNativeJs event", zzip);
            return;
        }
        zzip.put("id", zzh.zzc(zzwk));
        zzh.zzd(zzwk).zzb("sendMessageToNativeJs", zzip);
        return;
    }

    b(zzh zzh1)
    {
        zzwk = zzh1;
        super();
    }
}
