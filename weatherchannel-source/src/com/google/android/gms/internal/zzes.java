// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

public class zzes
{

    private final boolean zzyO;
    private final boolean zzyP;
    private final boolean zzyQ;
    private final boolean zzyR;
    private final boolean zzyS;

    private zzes(zza zza1)
    {
    /* block-local class not found */
    class zza {}

        zzyO = zza.zza(zza1);
        zzyP = com.google.android.gms.internal.zza.zzb(zza1);
        zzyQ = zza.zzc(zza1);
        zzyR = zza.zzd(zza1);
        zzyS = zza.zze(zza1);
    }

    zzes(zza zza1, _cls1 _pcls1)
    {
        this(zza1);
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject()).put("sms", zzyO).put("tel", zzyP).put("calendar", zzyQ).put("storePicture", zzyR).put("inlineVideo", zzyS);
        }
        catch (JSONException jsonexception)
        {
            zzb.zzb("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
