// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.e;

import com.gau.go.a.f.e;

// Referenced classes of package com.gau.go.a.e:
//            a, c

class b extends Thread
{

    final a a;

    b(a a1, String s)
    {
        a = a1;
        super(s);
    }

    public void run()
    {
        java.util.Map map = null;
        if (com.gau.go.a.e.a.a(a) != null)
        {
            com.gau.go.a.e.a.a(a).a();
        }
        if (a.a)
        {
            String s = com.gau.go.a.e.a.b(a);
            if (e.c(s))
            {
                com.gau.go.a.e.a.a(a, false);
            } else
            {
                com.gau.go.a.e.a.a(a, true);
                e.a("StatisticsManager", (new StringBuilder()).append("NewCtrlInfo:").append(s).toString());
                map = com.gau.go.a.e.a.a(a, s);
                com.gau.go.a.e.a.a(a, s, map);
            }
            com.gau.go.a.e.a.a(a).a(map, com.gau.go.a.e.a.c(a));
            return;
        } else
        {
            e.a("Get ctrl info network is not ok and quit");
            com.gau.go.a.e.a.a(a, false);
            com.gau.go.a.e.a.a(a).a(null, com.gau.go.a.e.a.c(a));
            return;
        }
    }
}
