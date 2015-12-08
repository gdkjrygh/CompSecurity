// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbw, zzdf, zzbg

class zzdj
{

    private static zzbw zza(zzbw zzbw1)
    {
        zzbw zzbw2;
        try
        {
            zzbw2 = new zzbw(zzdf.zzI(zzeQ(zzdf.zzg((com.google.android.gms.internal.zzag.zza)zzbw1.getObject()))), zzbw1.zzza());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            zzbg.zzb("Escape URI: unsupported encoding", unsupportedencodingexception);
            return zzbw1;
        }
        return zzbw2;
    }

    private static zzbw zza(zzbw zzbw1, int i)
    {
        if (!zzn((com.google.android.gms.internal.zzag.zza)zzbw1.getObject()))
        {
            zzbg.zzaz("Escaping can only be applied to strings.");
            return zzbw1;
        }
        switch (i)
        {
        default:
            zzbg.zzaz((new StringBuilder()).append("Unsupported Value Escaping: ").append(i).toString());
            return zzbw1;

        case 12: // '\f'
            return zza(zzbw1);
        }
    }

    static transient zzbw zza(zzbw zzbw1, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            zzbw1 = zza(zzbw1, ai[i]);
        }

        return zzbw1;
    }

    static String zzeQ(String s)
        throws UnsupportedEncodingException
    {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean zzn(com.google.android.gms.internal.zzag.zza zza1)
    {
        return zzdf.zzl(zza1) instanceof String;
    }
}
