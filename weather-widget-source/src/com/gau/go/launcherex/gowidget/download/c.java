// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.download;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.gau.go.launcherex.gowidget.download:
//            e, DownloadService

public class c
{

    private static volatile c f = null;
    private ConcurrentHashMap a;
    private List b;
    private List c;
    private ConcurrentHashMap d;
    private int e;
    private Context g;

    private c(Context context)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 2;
        g = null;
        g = context;
        a = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        b = Collections.synchronizedList(new ArrayList());
        c = Collections.synchronizedList(new ArrayList());
    }

    public static c a(Context context)
    {
        com/gau/go/launcherex/gowidget/download/c;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new c(context);
        }
        context = f;
        com/gau/go/launcherex/gowidget/download/c;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public ConcurrentHashMap a()
    {
        return a;
    }

    public void a(long l)
    {
        if (a != null)
        {
            e e1 = (e)a.get(Long.valueOf(l));
            if (e1 != null)
            {
                e1.b(7);
            }
        }
    }

    public void a(e e1)
    {
        Object obj;
label0:
        {
            if (g != null && e1 != null)
            {
                obj = e1.c();
                String s = e1.d();
                String s1 = e1.g();
                if (obj != null && !"".equals(((String) (obj)).trim()) && s != null && !"".equals(s.trim()) && s1 != null && !"".equals(s1.trim()))
                {
                    obj = Long.valueOf(e1.b());
                    if (a != null && !a.contains(e1))
                    {
                        a.put(obj, e1);
                    }
                    if (b == null || b.size() >= e)
                    {
                        break label0;
                    }
                    b.add(obj);
                    obj = new Intent();
                    ((Intent) (obj)).setClass(g, com/gau/go/launcherex/gowidget/download/DownloadService);
                    ((Intent) (obj)).setFlags(0x10000000);
                    ((Intent) (obj)).putExtra("download_task_id_key", e1.b());
                    g.startService(((Intent) (obj)));
                }
            }
            return;
        }
        e1.b(1);
        if (c != null)
        {
            c.add(obj);
        }
        e1.c(7);
    }

    public void a(Long long1)
    {
        if (b != null && b.contains(long1))
        {
            b.remove(long1);
            if (c != null && c.size() > 0)
            {
                a(d(((Long)c.remove(0)).longValue()));
            }
        }
    }

    public void b(long l)
    {
        if (a != null)
        {
            b((e)a.get(Long.valueOf(l)));
        }
    }

    public void b(e e1)
    {
        if (e1 != null)
        {
            e1.b(8);
            a(e1);
        }
    }

    public e c(long l)
    {
        e e1 = null;
        if (b != null && b.contains(Long.valueOf(l)))
        {
            b.remove(Long.valueOf(l));
        }
        if (c != null && c.contains(Long.valueOf(l)))
        {
            c.remove(Long.valueOf(l));
        }
        if (a != null)
        {
            e e2 = (e)a.remove(Long.valueOf(l));
            e1 = e2;
            if (e2 != null)
            {
                if (e2.h() == 5 && d != null)
                {
                    d.put(Long.valueOf(e2.b()), e2.j());
                }
                e2.b(6);
                e2.k();
                e1 = e2;
            }
        }
        return e1;
    }

    public e c(e e1)
    {
        e e2 = null;
        if (e1 != null)
        {
            e2 = c(e1.b());
        }
        return e2;
    }

    public e d(long l)
    {
        e e1 = null;
        if (a != null)
        {
            e1 = (e)a.get(Long.valueOf(l));
        }
        return e1;
    }

}
