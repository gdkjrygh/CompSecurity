// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

class zzcb
{
    static final class zza extends Enum
    {

        public static final zza zzaMI;
        public static final zza zzaMJ;
        public static final zza zzaMK;
        private static final zza zzaML[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzcb$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaML.clone();
        }

        static 
        {
            zzaMI = new zza("NONE", 0);
            zzaMJ = new zza("CONTAINER", 1);
            zzaMK = new zza("CONTAINER_DEBUG", 2);
            zzaML = (new zza[] {
                zzaMI, zzaMJ, zzaMK
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static zzcb zzaME;
    private volatile String zzaKy;
    private volatile zza zzaMF;
    private volatile String zzaMG;
    private volatile String zzaMH;

    zzcb()
    {
        clear();
    }

    private String zzeA(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String zzm(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static zzcb zzzf()
    {
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorenter ;
        zzcb zzcb1;
        if (zzaME == null)
        {
            zzaME = new zzcb();
        }
        zzcb1 = zzaME;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        return zzcb1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void clear()
    {
        zzaMF = zza.zzaMI;
        zzaMG = null;
        zzaKy = null;
        zzaMH = null;
    }

    String getContainerId()
    {
        return zzaKy;
    }

    boolean zzl(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        zzbg.zzaB((new StringBuilder()).append("Container preview url: ").append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        zzaMF = zza.zzaMK;
_L6:
        zzaMH = zzm(uri);
        if (zzaMF == zza.zzaMJ || zzaMF == zza.zzaMK)
        {
            zzaMG = (new StringBuilder()).append("/r?").append(zzaMH).toString();
        }
        zzaKy = zzeA(zzaMH);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        zzaMF = zza.zzaMJ;
          goto _L6
        uri;
        throw uri;
_L2:
label0:
        {
            if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
            {
                break label0;
            }
            if (!zzeA(uri.getQuery()).equals(zzaKy))
            {
                break MISSING_BLOCK_LABEL_247;
            }
            zzbg.zzaB((new StringBuilder()).append("Exit preview mode for container: ").append(zzaKy).toString());
            zzaMF = zza.zzaMI;
            zzaMG = null;
        }
          goto _L5
        zzbg.zzaC((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    zza zzzg()
    {
        return zzaMF;
    }

    String zzzh()
    {
        return zzaMG;
    }
}
