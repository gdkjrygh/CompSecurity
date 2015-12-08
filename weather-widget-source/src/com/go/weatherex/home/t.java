// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.util.f;

// Referenced classes of package com.go.weatherex.home:
//            r

class t
    implements Runnable
{

    final r a;

    t(r r1)
    {
        a = r1;
        super();
    }

    public void run()
    {
        f f1 = r.b(a).h();
        if (com.go.weatherex.home.r.c(a) != null && f1.e() != 0)
        {
            r.d(a);
        }
    }
}
