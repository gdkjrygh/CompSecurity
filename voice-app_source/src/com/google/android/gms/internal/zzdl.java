// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzhs, zzid

public class zzdl
    implements zzdg
{

    final HashMap zzwv = new HashMap();

    public zzdl()
    {
    }

    public Future zzU(String s)
    {
        zzhs zzhs1 = new zzhs();
        zzwv.put(s, zzhs1);
        return zzhs1;
    }

    public void zzV(String s)
    {
        zzhs zzhs1 = (zzhs)zzwv.get(s);
        if (zzhs1 == null)
        {
            zzb.zzaz("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!zzhs1.isDone())
        {
            zzhs1.cancel(true);
        }
        zzwv.remove(s);
    }

    public void zza(zzid zzid, Map map)
    {
        zze((String)map.get("request_id"), (String)map.get("fetched_ad"));
    }

    public void zze(String s, String s1)
    {
        zzhs zzhs1;
        zzb.zzay("Received ad from the cache.");
        zzhs1 = (zzhs)zzwv.get(s);
        if (zzhs1 == null)
        {
            zzb.zzaz("Could not find the ad request for the corresponding ad response.");
            return;
        }
        zzhs1.zzf(new JSONObject(s1));
        zzwv.remove(s);
        return;
        s1;
        zzb.zzb("Failed constructing JSON object from value passed from javascript", s1);
        zzhs1.zzf(null);
        zzwv.remove(s);
        return;
        s1;
        zzwv.remove(s);
        throw s1;
    }
}
