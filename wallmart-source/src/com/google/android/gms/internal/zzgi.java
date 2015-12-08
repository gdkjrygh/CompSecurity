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
//            zzgf, zzlh

public class zzgi
    implements zzgf.zza
{

    private final boolean zzDl;

    public zzgi(boolean flag)
    {
        zzDl = flag;
    }

    private void zza(zzgf zzgf1, JSONObject jsonobject, zzlh zzlh1)
        throws JSONException
    {
        zzlh1.put(jsonobject.getString("name"), zzgf1.zza(jsonobject, "image_value", zzDl));
    }

    private void zza(JSONObject jsonobject, zzlh zzlh1)
        throws JSONException
    {
        zzlh1.put(jsonobject.getString("name"), jsonobject.getString("string_value"));
    }

    private zzlh zzc(zzlh zzlh1)
        throws InterruptedException, ExecutionException
    {
        zzlh zzlh2 = new zzlh();
        for (int i = 0; i < zzlh1.size(); i++)
        {
            zzlh2.put(zzlh1.keyAt(i), ((Future)zzlh1.valueAt(i)).get());
        }

        return zzlh2;
    }

    public com.google.android.gms.ads.internal.formats.zzh.zza zza(zzgf zzgf1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        return zzd(zzgf1, jsonobject);
    }

    public zzf zzd(zzgf zzgf1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        zzlh zzlh1 = new zzlh();
        zzlh zzlh2 = new zzlh();
        zzih zzih = zzgf1.zze(jsonobject);
        JSONArray jsonarray = jsonobject.getJSONArray("custom_assets");
        int i = 0;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject1 = jsonarray.getJSONObject(i);
            String s = jsonobject1.getString("type");
            if ("string".equals(s))
            {
                zza(jsonobject1, zzlh2);
            } else
            if ("image".equals(s))
            {
                zza(zzgf1, jsonobject1, zzlh1);
            } else
            {
                zzb.zzaE((new StringBuilder()).append("Unknown custom asset type: ").append(s).toString());
            }
            i++;
        }
        return new zzf(jsonobject.getString("custom_template_id"), zzc(zzlh1), zzlh2, (zza)zzih.get());
    }
}
