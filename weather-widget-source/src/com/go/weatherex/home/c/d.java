// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.c;

import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.e;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.c:
//            a, b

class d extends e
{

    final a a;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, b b1)
    {
        this(a1);
    }

    public void a()
    {
        super.a();
        if (!com.go.weatherex.home.c.a.a(a))
        {
            return;
        } else
        {
            com.go.weatherex.home.c.a.a(a, a.getView());
            return;
        }
    }

    public void a(List list, w w)
    {
        super.a(list, w);
        com.go.weatherex.home.c.a.a(a, a.getView());
    }

    public void b()
    {
        super.b();
        if (!com.go.weatherex.home.c.a.a(a))
        {
            return;
        } else
        {
            com.go.weatherex.home.c.a.a(a, a.getView());
            return;
        }
    }
}
