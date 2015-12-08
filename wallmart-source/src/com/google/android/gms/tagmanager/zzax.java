// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcv

public class zzax
{

    private static String zzaQo;
    static Map zzaQp = new HashMap();

    public zzax()
    {
    }

    public static String zzF(String s, String s1)
    {
        if (s1 == null)
        {
            if (s.length() > 0)
            {
                return s;
            } else
            {
                return null;
            }
        } else
        {
            return Uri.parse((new StringBuilder()).append("http://hostname/?").append(s).toString()).getQueryParameter(s1);
        }
    }

    public static void zzeM(String s)
    {
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorenter ;
        zzaQo = s;
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorexit ;
        return;
        s;
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static String zzg(Context context, String s, String s1)
    {
        String s2 = (String)zzaQp.get(s);
        Object obj = s2;
        if (s2 == null)
        {
            context = context.getSharedPreferences("gtm_click_referrers", 0);
            if (context != null)
            {
                context = context.getString(s, "");
            } else
            {
                context = "";
            }
            zzaQp.put(s, context);
            obj = context;
        }
        return zzF(((String) (obj)), s1);
    }

    public static String zzk(Context context, String s)
    {
        if (zzaQo != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorenter ;
        if (zzaQo != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        context = context.getSharedPreferences("gtm_install_referrer", 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zzaQo = context.getString("referrer", "");
_L3:
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorexit ;
_L2:
        return zzF(zzaQo, s);
        zzaQo = "";
          goto _L3
        context;
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void zzl(Context context, String s)
    {
        String s1 = zzF(s, "conv");
        if (s1 != null && s1.length() > 0)
        {
            zzaQp.put(s1, s);
            zzcv.zzb(context, "gtm_click_referrers", s1, s);
        }
    }

}
