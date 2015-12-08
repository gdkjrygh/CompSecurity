// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gau.go.launcherex.gowidget.weather.service.a.b;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import com.gtp.go.weather.sharephoto.b.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            m, n, a, b

public class l
{

    private static l a;
    private final ExecutorService b = Executors.newSingleThreadExecutor();
    private final ExecutorService c = Executors.newFixedThreadPool(2);
    private final List d = new ArrayList();
    private final HashMap e = new HashMap();
    private final List f = new ArrayList();
    private final g g = new m(this);

    private l()
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(g);
    }

    private static l a()
    {
        if (a == null)
        {
            a = new l();
        }
        return a;
    }

    static List a(l l1)
    {
        return l1.f;
    }

    public static void a(Context context, e e1)
    {
        while (e1 == null || context == null || e1.f() == -1L) 
        {
            return;
        }
        a(((a) (new n(context.getApplicationContext(), e1))));
    }

    public static void a(a a1)
    {
        if (a1 == null)
        {
            return;
        } else
        {
            a().b(a1);
            return;
        }
    }

    public static void a(g g1)
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(g1);
    }

    public static void a(com.gtp.go.weather.sharephoto.c.a a1)
    {
        a().c(a1);
    }

    static void a(l l1, n n1)
    {
        l1.b(n1);
    }

    private void a(n n1)
    {
        e e1 = n1.c();
        if (!b(Long.valueOf(e1.f())))
        {
            e.put(Long.valueOf(e1.f()), n1);
            for (Iterator iterator = (new ArrayList(d)).iterator(); iterator.hasNext(); ((com.gtp.go.weather.sharephoto.c.a)iterator.next()).a(e1)) { }
            f.add(n1);
            com.gau.go.launcherex.gowidget.weather.service.a.b.a(n1, c);
        }
    }

    public static boolean a(Long long1)
    {
        return a().b(long1);
    }

    private void b(a a1)
    {
        if (!f.contains(a1))
        {
            if (a1 instanceof com.gtp.go.weather.sharephoto.c.b)
            {
                f.add(a1);
                com.gau.go.launcherex.gowidget.weather.service.a.b.a(a1, b);
                return;
            }
            if (a1 instanceof n)
            {
                a((n)a1);
                return;
            }
        }
    }

    public static void b(g g1)
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.b(g1);
    }

    public static void b(com.gtp.go.weather.sharephoto.c.a a1)
    {
        a().d(a1);
    }

    private void b(n n1)
    {
        n1 = n1.c();
        e.remove(Long.valueOf(n1.f()));
        for (Iterator iterator = (new ArrayList(d)).iterator(); iterator.hasNext(); ((com.gtp.go.weather.sharephoto.c.a)iterator.next()).b(n1)) { }
    }

    private boolean b(Long long1)
    {
        return e.get(long1) != null;
    }

    private void c(com.gtp.go.weather.sharephoto.c.a a1)
    {
        if (d.contains(a1))
        {
            throw new IllegalStateException((new StringBuilder()).append(a1.toString()).append("had be added before, did you forget to call removeListener()?").toString());
        } else
        {
            d.add(a1);
            return;
        }
    }

    private void d(com.gtp.go.weather.sharephoto.c.a a1)
    {
        d.remove(a1);
    }
}
