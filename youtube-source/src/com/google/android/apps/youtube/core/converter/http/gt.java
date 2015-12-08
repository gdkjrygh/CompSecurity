// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.f;
import com.google.android.apps.youtube.core.utils.ag;
import com.google.android.apps.youtube.datalib.legacy.model.bj;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            gu, gv, gw, gx, 
//            gy, em, dj

public final class gt
{

    static Pair a(String s)
    {
        return d(s);
    }

    public static void a(f f1, b b1, dj dj)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(f1);
        com.google.android.apps.youtube.common.fromguava.c.a(b1);
        com.google.android.apps.youtube.common.fromguava.c.a(dj);
        f1.a(c("/VMAP"), new gu());
        f1.a(c("/VMAP/AdBreak"), new gv());
        f1.a(c("/VMAP/AdBreak/TrackingEvents/Tracking"), new gw());
        f1.a(c("/VMAP/Extensions/Extension").concat("/TrackingDecoration"), new gx());
        em.a(c("/VMAP/AdBreak/AdSource/VASTData"), b1, f1, new gy(), dj);
    }

    static void a(String s, bj bj1)
    {
        if (s == null)
        {
            L.b("in Vmap AdBreak: timeOffset is null");
        } else
        {
            String as[] = s.split(",");
            if (as.length > 1)
            {
                int j = as.length;
                int i = 0;
                while (i < j) 
                {
                    b(as[i], bj1);
                    i++;
                }
            } else
            {
                b(s, bj1);
                return;
            }
        }
    }

    static com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.TrackingEventType b(String s)
    {
        if ("breakEnd".equalsIgnoreCase(s))
        {
            return com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.TrackingEventType.END;
        }
        if ("error".equalsIgnoreCase(s))
        {
            return com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.TrackingEventType.ERROR;
        } else
        {
            "breakStart".equalsIgnoreCase(s);
            return com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.TrackingEventType.START;
        }
    }

    private static void b(String s, bj bj1)
    {
        if ("linear".equalsIgnoreCase(s))
        {
            bj1.a(true);
        } else
        {
            if ("nonlinear".equalsIgnoreCase(s))
            {
                bj1.b(true);
                return;
            }
            if ("display".equalsIgnoreCase(s))
            {
                bj1.c(true);
                return;
            }
        }
    }

    private static String c(String s)
    {
        return s.replaceAll("\\/", "/vmap:");
    }

    private static Pair d(String s)
    {
        int i;
        int j;
        boolean flag;
        flag = true;
        j = 1;
        i = 0;
        if (TextUtils.isEmpty(s))
        {
            L.b("in Vmap AdBreak: timeOffset is null or empty");
            return new Pair(com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.OffsetType.UNKNOWN, Integer.valueOf(0));
        }
        if ("start".equals(s))
        {
            return new Pair(com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.OffsetType.PRE_ROLL, Integer.valueOf(0));
        }
        if ("end".equals(s))
        {
            return new Pair(com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.OffsetType.POST_ROLL, Integer.valueOf(0));
        }
        if ('#' != s.charAt(0)) goto _L2; else goto _L1
_L1:
        i = Integer.parseInt(s.substring(1).trim());
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        L.b("in Vmap AdBreak(positional): timeOffset must be >= 1");
        i = j;
_L3:
        return new Pair(com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.OffsetType.POSITIONAL, Integer.valueOf(i));
        s;
        i = ((flag) ? 1 : 0);
_L10:
        L.a("in Vmap AdBreak(positional): integer parse error", s);
        if (true) goto _L3; else goto _L2
_L2:
        j = s.length();
        if ('%' != s.charAt(j - 1)) goto _L5; else goto _L4
_L4:
        j = Integer.parseInt(s.substring(0, j - 1).trim());
        if (j >= 0) goto _L7; else goto _L6
_L6:
        L.b("in Vmap AdBreak(percentage): value must not be <0");
        i = 0;
_L8:
        return new Pair(com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.OffsetType.PERCENTAGE, Integer.valueOf(i));
_L7:
        i = j;
        if (j <= 100)
        {
            continue; /* Loop/switch isn't completed */
        }
        L.b("in Vmap AdBreak(percentage): value must not be >100");
        i = 100;
        continue; /* Loop/switch isn't completed */
        s;
        i = 0;
_L9:
        L.a("in Vmap AdBreak(percentage): integer parse error", s);
        if (true) goto _L8; else goto _L5
_L5:
        j = ag.a(s);
        if (j < 0)
        {
            L.b("in Vmap AdBreak(time): value must not be <00:00:00.000");
        } else
        {
            i = j;
        }
        return new Pair(com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.OffsetType.TIME, Integer.valueOf(i));
        s;
        i = j;
          goto _L9
        s;
          goto _L10
    }
}
