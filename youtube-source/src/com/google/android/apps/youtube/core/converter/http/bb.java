// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.f;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bh, bg, bf, be, 
//            bd, bc

public final class bb
{

    private static final Map a = new InfoCardRulesHelper._cls1();
    private static final Map b = new InfoCardRulesHelper._cls2();
    private static final Map c = new InfoCardRulesHelper._cls3();

    static int a(String s, Map map, int i)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = (Integer)map.get(s);
        }
        if (s == null)
        {
            return 0;
        } else
        {
            return s.intValue();
        }
    }

    static Map a()
    {
        return c;
    }

    public static void a(String s, f f1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(f1);
        f1.a((new StringBuilder()).append(s).append("/card").toString(), new bh()).a((new StringBuilder()).append(s).append("/card/action").toString(), new bg()).a((new StringBuilder()).append(s).append("/card/action/event").toString(), new bf()).a((new StringBuilder()).append(s).append("/card/event").toString(), new be()).a((new StringBuilder()).append(s).append("/card/app_card").toString(), new bd()).a((new StringBuilder()).append(s).append("/card/app_card/icon").toString(), new bc());
    }

    static Map b()
    {
        return b;
    }

    static Map c()
    {
        return a;
    }

}
