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

    private static com.google.android.gms.internal.zzag.zza zzD(Object obj)
        throws JSONException
    {
        return zzdf.zzK(zzE(obj));
    }

    static Object zzE(Object obj)
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
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext(); ((Map) (obj1)).put(s, zzE(((JSONObject) (obj)).get(s))))
            {
                s = (String)iterator.next();
            }

        }
        return obj1;
    }

    public static com.google.android.gms.internal.zzqp.zzc zzeN(String s)
        throws JSONException
    {
        s = zzD(new JSONObject(s));
        com.google.android.gms.internal.zzqp.zzd zzd = com.google.android.gms.internal.zzqp.zzc.zzBF();
        for (int i = 0; i < ((com.google.android.gms.internal.zzag.zza) (s)).zziW.length; i++)
        {
            zzd.zzc(com.google.android.gms.internal.zzqp.zza.zzBC().zzb(zzae.zzfu.toString(), ((com.google.android.gms.internal.zzag.zza) (s)).zziW[i]).zzb(zzae.zzfj.toString(), zzdf.zzeY(zzn.zzzA())).zzb(zzn.zzzB(), ((com.google.android.gms.internal.zzag.zza) (s)).zziX[i]).zzBE());
        }

        return zzd.zzBI();
    }
}
