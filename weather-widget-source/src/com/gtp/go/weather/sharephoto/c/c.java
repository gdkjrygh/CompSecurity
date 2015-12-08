// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            n, b, l

class c
    implements Runnable
{

    final int a;
    final int b;
    final b c;

    c(b b1, int i, int j)
    {
        c = b1;
        a = i;
        b = j;
        super();
    }

    public void run()
    {
        com.gtp.go.weather.sharephoto.c.l.a(new n(com.gtp.go.weather.sharephoto.c.b.a(c), com.gtp.go.weather.sharephoto.c.b.b(c)));
        a a1 = new a(117, "share_photo");
        a1.g(String.valueOf(a));
        a1.h(String.valueOf(b));
        q.a(com.gtp.go.weather.sharephoto.c.b.a(c)).a(a1);
    }
}
