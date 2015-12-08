// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

public class zzez
{
    public static final class zza
    {

        private boolean zzzI;
        private boolean zzzJ;
        private boolean zzzK;
        private boolean zzzL;
        private boolean zzzM;

        static boolean zza(zza zza1)
        {
            return zza1.zzzI;
        }

        static boolean zzb(zza zza1)
        {
            return zza1.zzzJ;
        }

        static boolean zzc(zza zza1)
        {
            return zza1.zzzK;
        }

        static boolean zzd(zza zza1)
        {
            return zza1.zzzL;
        }

        static boolean zze(zza zza1)
        {
            return zza1.zzzM;
        }

        public zzez zzea()
        {
            return new zzez(this);
        }

        public zza zzo(boolean flag)
        {
            zzzI = flag;
            return this;
        }

        public zza zzp(boolean flag)
        {
            zzzJ = flag;
            return this;
        }

        public zza zzq(boolean flag)
        {
            zzzK = flag;
            return this;
        }

        public zza zzr(boolean flag)
        {
            zzzL = flag;
            return this;
        }

        public zza zzs(boolean flag)
        {
            zzzM = flag;
            return this;
        }

        public zza()
        {
        }
    }


    private final boolean zzzI;
    private final boolean zzzJ;
    private final boolean zzzK;
    private final boolean zzzL;
    private final boolean zzzM;

    private zzez(zza zza1)
    {
        zzzI = zza.zza(zza1);
        zzzJ = com.google.android.gms.internal.zza.zzb(zza1);
        zzzK = zza.zzc(zza1);
        zzzL = zza.zzd(zza1);
        zzzM = zza.zze(zza1);
    }


    public JSONObject toJson()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject()).put("sms", zzzI).put("tel", zzzJ).put("calendar", zzzK).put("storePicture", zzzL).put("inlineVideo", zzzM);
        }
        catch (JSONException jsonexception)
        {
            zzb.zzb("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
