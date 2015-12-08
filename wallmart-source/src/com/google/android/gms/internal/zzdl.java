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
//            zzdg, zzie, zzip

public class zzdl
    implements zzdg
{

    final HashMap zzxi = new HashMap();

    public zzdl()
    {
    }

    public Future zzW(String s)
    {
        zzie zzie1 = new zzie();
        zzxi.put(s, zzie1);
        return zzie1;
    }

    public void zzX(String s)
    {
        zzie zzie1 = (zzie)zzxi.get(s);
        if (zzie1 == null)
        {
            zzb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!zzie1.isDone())
        {
            zzie1.cancel(true);
        }
        zzxi.remove(s);
    }

    public void zza(zzip zzip, Map map)
    {
        zze((String)map.get("request_id"), (String)map.get("fetched_ad"));
    }

    public void zze(String s, String s1)
    {
        zzie zzie1;
        zzb.zzaC("Received ad from the cache.");
        zzie1 = (zzie)zzxi.get(s);
        if (zzie1 == null)
        {
            zzb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        zzie1.zzf(new JSONObject(s1));
        zzxi.remove(s);
        return;
        s1;
        zzb.zzb("Failed constructing JSON object from value passed from javascript", s1);
        zzie1.zzf(null);
        zzxi.remove(s);
        return;
        s1;
        zzxi.remove(s);
        throw s1;
    }
}
