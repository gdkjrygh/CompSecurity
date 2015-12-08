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

        public static final zza zzaRc;
        public static final zza zzaRd;
        public static final zza zzaRe;
        private static final zza zzaRf[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzcb$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaRf.clone();
        }

        static 
        {
            zzaRc = new zza("NONE", 0);
            zzaRd = new zza("CONTAINER", 1);
            zzaRe = new zza("CONTAINER_DEBUG", 2);
            zzaRf = (new zza[] {
                zzaRc, zzaRd, zzaRe
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static zzcb zzaQY;
    private volatile String zzaOS;
    private volatile zza zzaQZ;
    private volatile String zzaRa;
    private volatile String zzaRb;

    zzcb()
    {
        clear();
    }

    static zzcb zzAv()
    {
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorenter ;
        zzcb zzcb1;
        if (zzaQY == null)
        {
            zzaQY = new zzcb();
        }
        zzcb1 = zzaQY;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        return zzcb1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String zzeP(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String zzn(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    void clear()
    {
        zzaQZ = zza.zzaRc;
        zzaRa = null;
        zzaOS = null;
        zzaRb = null;
    }

    String getContainerId()
    {
        return zzaOS;
    }

    zza zzAw()
    {
        return zzaQZ;
    }

    String zzAx()
    {
        return zzaRa;
    }

    boolean zzm(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        zzbg.v((new StringBuilder()).append("Container preview url: ").append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        zzaQZ = zza.zzaRe;
_L6:
        zzaRb = zzn(uri);
        if (zzaQZ == zza.zzaRd || zzaQZ == zza.zzaRe)
        {
            zzaRa = (new StringBuilder()).append("/r?").append(zzaRb).toString();
        }
        zzaOS = zzeP(zzaRb);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        zzaQZ = zza.zzaRd;
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
            if (!zzeP(uri.getQuery()).equals(zzaOS))
            {
                break MISSING_BLOCK_LABEL_247;
            }
            zzbg.v((new StringBuilder()).append("Exit preview mode for container: ").append(zzaOS).toString());
            zzaQZ = zza.zzaRc;
            zzaRa = null;
        }
          goto _L5
        zzbg.zzaE((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }
}
