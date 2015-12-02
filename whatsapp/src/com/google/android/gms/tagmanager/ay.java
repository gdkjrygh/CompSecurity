// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cz

class ay
{

    private static String arH;
    static Map arI = new HashMap();

    ay()
    {
    }

    static void cH(String s)
    {
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorenter ;
        arH = s;
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
        return;
        s;
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
        throw s;
    }

    static void d(Context context, String s)
    {
        cz.a(context, "gtm_install_referrer", "referrer", s);
        f(context, s);
    }

    static void f(Context context, String s)
    {
        String s1 = w(s, "conv");
        if (s1 != null && s1.length() > 0)
        {
            arI.put(s1, s);
            cz.a(context, "gtm_click_referrers", s1, s);
        }
    }

    static String w(String s, String s1)
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

}
