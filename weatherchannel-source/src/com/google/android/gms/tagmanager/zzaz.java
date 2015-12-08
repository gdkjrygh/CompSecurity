// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzae;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdf, zzn

class zzaz
{

    private static com.google.android.gms.internal.zzag.zza zzB(Object obj)
        throws JSONException
    {
        return zzdf.zzI(zzC(obj));
    }

    static Object zzC(Object obj)
        throws JSONException
    {
        if (obj instanceof JSONArray)
        {
            throw new RuntimeException("JSONArrays are not supported");
        }
        if (JSONObject.NULL.equals(obj))
        {
            throw new RuntimeException("JSON nulls are not supported");
        }
        Object obj1 = obj;
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            obj1 = new HashMap();
            String s;
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext(); ((Map) (obj1)).put(s, zzC(((JSONObject) (obj)).get(s))))
            {
                s = (String)iterator.next();
            }

        }
        return obj1;
    }

    public static com.google.android.gms.internal.zzqf.zzc zzey(String s)
        throws JSONException
    {
        s = zzB(new JSONObject(s));
        com.google.android.gms.internal.zzqf.zzd zzd = com.google.android.gms.internal.zzqf.zzc.zzAp();
        for (int i = 0; i < ((com.google.android.gms.internal.zzag.zza) (s)).zziT.length; i++)
        {
            zzd.zzc(com.google.android.gms.internal.zzqf.zza.zzAm().zzb(zzae.zzfr.toString(), ((com.google.android.gms.internal.zzag.zza) (s)).zziT[i]).zzb(zzae.zzfg.toString(), zzdf.zzeJ(zzn.zzyk())).zzb(zzn.zzyl(), ((com.google.android.gms.internal.zzag.zza) (s)).zziU[i]).zzAo());
        }

        return zzd.zzAs();
    }
}
