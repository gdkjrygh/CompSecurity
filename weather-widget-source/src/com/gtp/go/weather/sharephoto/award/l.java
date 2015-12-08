// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gau.go.launcherex.gowidget.weather.service.a.g;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            w, k, v, u, 
//            t, a

class l extends g
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void b(a a1)
    {
        if (a1 instanceof w)
        {
            com.gtp.go.weather.sharephoto.award.k.a(a);
        } else
        {
            if (a1 instanceof v)
            {
                k.b(a);
                return;
            }
            if (a1 instanceof u)
            {
                a1 = (u)a1;
                com.gtp.go.weather.sharephoto.award.k.a(a, a1.c());
                return;
            }
            if (a1 instanceof t)
            {
                a1 = (t)a1;
                com.gtp.go.weather.sharephoto.award.k.a(a, a1.c(), a1.d(), a1.e());
                return;
            }
            if (a1 instanceof com.gtp.go.weather.sharephoto.award.a)
            {
                a1 = (com.gtp.go.weather.sharephoto.award.a)a1;
                com.gtp.go.weather.sharephoto.award.k.a(a, a1.e(), a1.c(), a1.d());
                return;
            }
        }
    }
}
