// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

public class zzes
{
    public static final class zza
    {

        private boolean zzyO;
        private boolean zzyP;
        private boolean zzyQ;
        private boolean zzyR;
        private boolean zzyS;

        static boolean zza(zza zza1)
        {
            return zza1.zzyO;
        }

        static boolean zzb(zza zza1)
        {
            return zza1.zzyP;
        }

        static boolean zzc(zza zza1)
        {
            return zza1.zzyQ;
        }

        static boolean zzd(zza zza1)
        {
            return zza1.zzyR;
        }

        static boolean zze(zza zza1)
        {
            return zza1.zzyS;
        }

        public zzes zzeg()
        {
            return new zzes(this);
        }

        public zza zzo(boolean flag)
        {
            zzyO = flag;
            return this;
        }

        public zza zzp(boolean flag)
        {
            zzyP = flag;
            return this;
        }

        public zza zzq(boolean flag)
        {
            zzyQ = flag;
            return this;
        }

        public zza zzr(boolean flag)
        {
            zzyR = flag;
            return this;
        }

        public zza zzs(boolean flag)
        {
            zzyS = flag;
            return this;
        }

        public zza()
        {
        }
    }


    private final boolean zzyO;
    private final boolean zzyP;
    private final boolean zzyQ;
    private final boolean zzyR;
    private final boolean zzyS;

    private zzes(zza zza1)
    {
        zzyO = zza.zza(zza1);
        zzyP = com.google.android.gms.internal.zza.zzb(zza1);
        zzyQ = zza.zzc(zza1);
        zzyR = zza.zzd(zza1);
        zzyS = zza.zze(zza1);
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
