// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            l, n

class m extends g
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void b(a a1)
    {
        com.gtp.go.weather.sharephoto.c.l.a(a).remove(a1);
        if (a1 instanceof n)
        {
            a1 = (n)a1;
            com.gtp.go.weather.sharephoto.c.l.a(a, a1);
        }
    }
}
