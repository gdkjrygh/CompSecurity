// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import com.gtp.a.a.a.a;
import com.jiubang.goweather.celllocation.b;

// Referenced classes of package com.jiubang.goweather.c:
//            q, r, a, w, 
//            b, m, s

public class p
{

    private Context a;
    private s b;
    private w c;
    private int d;
    private Handler e;
    private Runnable f;

    public p(Context context)
    {
        e = new q(this);
        f = new r(this);
        a = context;
        d = 0;
    }

    static w a(p p1)
    {
        return p1.c;
    }

    static s b(p p1)
    {
        return p1.b;
    }

    static int c(p p1)
    {
        return p1.d;
    }

    static Handler d(p p1)
    {
        return p1.e;
    }

    public void a()
    {
        e.removeCallbacks(f);
    }

    public void a(Location location)
    {
        (new com.jiubang.goweather.c.a(a, b, location)).execute(new Object[] {
            location
        });
    }

    public boolean a(int i, int j, int k, s s)
    {
        boolean flag;
        b = s;
        d = j;
        flag = false;
        j;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 76
    //                   2 162
    //                   3 119;
           goto _L1 _L2 _L3 _L4
_L1:
        if (flag)
        {
            com.gtp.a.a.a.a.a().a("\u5B9A\u4F4D\u5F00\u59CB", "location.txt");
            e.postDelayed(f, k * 1000);
        }
        return flag;
_L2:
        c = new b(a, this);
        com.gtp.a.a.a.a.a().a("\u51C6\u5907\u57FA\u7AD9\u5B9A\u4F4D", "location.txt");
        flag = c.a(i, b);
        continue; /* Loop/switch isn't completed */
_L4:
        c = new com.jiubang.goweather.c.b(a, this);
        com.gtp.a.a.a.a.a().a("\u51C6\u5907GPS\u57FA\u7AD9\u5B9A\u4F4D", "location.txt");
        flag = c.a(i, b);
        continue; /* Loop/switch isn't completed */
_L3:
        c = new m(a, this);
        com.gtp.a.a.a.a.a().a("\u51C6\u5907\u7F51\u7EDC\u5B9A\u4F4D", "location.txt");
        flag = c.a(i, b);
        if (true) goto _L1; else goto _L5
_L5:
    }
}
