// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzfy, zzkw

public class zzgb
    implements zzfy.zza
{

    private final boolean zzBY;

    public zzgb(boolean flag)
    {
        zzBY = flag;
    }

    private void zza(zzfy zzfy1, JSONObject jsonobject, zzkw zzkw1)
        throws JSONException
    {
        zzkw1.put(jsonobject.getString("name"), zzfy1.zza(jsonobject, "image_value", zzBY));
    }

    private void zza(JSONObject jsonobject, zzkw zzkw1)
        throws JSONException
    {
        zzkw1.put(jsonobject.getString("name"), jsonobject.getString("string_value"));
    }

    private zzkw zzc(zzkw zzkw1)
        throws InterruptedException, ExecutionException
    {
        zzkw zzkw2 = new zzkw();
        for (int i = 0; i < zzkw1.size(); i++)
        {
            zzkw2.put(zzkw1.keyAt(i), ((Future)zzkw1.valueAt(i)).get());
        }

        return zzkw2;
    }

    public com.google.android.gms.ads.internal.formats.zzg.zza zza(zzfy zzfy1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        return zzd(zzfy1, jsonobject);
    }

    public zzf zzd(zzfy zzfy1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        zzkw zzkw1 = new zzkw();
        zzkw zzkw2 = new zzkw();
        zzhv zzhv = zzfy1.zze(jsonobject);
        JSONArray jsonarray = jsonobject.getJSONArray("custom_assets");
        int i = 0;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject1 = jsonarray.getJSONObject(i);
            String s = jsonobject1.getString("type");
            if ("string".equals(s))
            {
                zza(jsonobject1, zzkw2);
            } else
            if ("image".equals(s))
            {
                zza(zzfy1, jsonobject1, zzkw1);
            } else
            {
                zzb.zzaC((new StringBuilder()).append("Unknown custom asset type: ").append(s).toString());
            }
            i++;
        }
        return new zzf(jsonobject.getString("custom_template_id"), zzc(zzkw1), zzkw2, (zza)zzhv.get());
    }
}
