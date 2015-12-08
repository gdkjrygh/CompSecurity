// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.d;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.database.d;
import com.google.android.apps.youtube.common.database.e;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.common.d:
//            p, i, h, o, 
//            n, k, l, m

public final class j
{

    private final Map a = new HashMap();
    private final d b;
    private final ScheduledExecutorService c;
    private final b d;
    private final p e;
    private final Executor f;

    public j(d d1, ScheduledExecutorService scheduledexecutorservice, b b1, p p1, Executor executor)
    {
        b = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        c = scheduledexecutorservice;
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        e = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        f = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
    }

    static d a(j j1)
    {
        return j1.b;
    }

    static void a(j j1, g g1)
    {
        j1.e(g1);
    }

    private void a(List list)
    {
        b.a();
        String s;
        for (list = list.iterator(); list.hasNext(); b.a(s))
        {
            s = (String)list.next();
            L.c(String.format(Locale.US, "Removing task %s", new Object[] {
                s
            }));
        }

        b.c();
        b.b();
    }

    static void b(j j1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        ArrayList arraylist = new ArrayList();
        long l1 = j1.d.a();
        e e1 = j1.b.d();
        do
        {
            if (!e1.hasNext())
            {
                break;
            }
            Object obj = (g)e1.next();
            i i1 = (i)j1.a.get(((g) (obj)).a());
            if (i1 == null)
            {
                L.c((new StringBuilder("Missing task factory for task type: ")).append(((g) (obj)).a()).toString());
                arraylist.add(((g) (obj)).a());
            } else
            {
                obj = i1.a(((g) (obj)));
                if (l1 >= ((h) (obj)).d())
                {
                    L.e(String.format(Locale.US, "Executed scheduled task of type %s", new Object[] {
                        ((h) (obj)).c()
                    }));
                    j1.f.execute(new o(j1, ((h) (obj))));
                    if (!((h) (obj)).e())
                    {
                        arraylist.add(((h) (obj)).c());
                    }
                }
            }
        } while (true);
        e1.a();
        j1.a(arraylist);
    }

    private void e(g g1)
    {
        long l1 = Math.max(g1.c() - d.a(), 0L);
        n n1 = new n(this);
        if (g1.g() > 0L)
        {
            L.e(String.format(Locale.US, "Scheduling task %s with ScheduledExecutorService for repeating execution.", new Object[] {
                g1.a()
            }));
            c.scheduleAtFixedRate(n1, l1, g1.g(), TimeUnit.MILLISECONDS);
            return;
        } else
        {
            L.e(String.format(Locale.US, "Scheduling task %s with ScheduledExecutorService for one time execution.", new Object[] {
                g1.a()
            }));
            c.schedule(n1, l1, TimeUnit.MILLISECONDS);
            return;
        }
    }

    public final void a()
    {
        c.schedule(new k(this), e.x(), TimeUnit.MILLISECONDS);
    }

    public final void a(g g1)
    {
        f.execute(new l(this, g1));
    }

    public final void a(i i1)
    {
        a.put(i1.a(), i1);
    }

    public final void b(g g1)
    {
        f.execute(new m(this, g1));
    }

    public final void c(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        com.google.android.apps.youtube.common.fromguava.c.b();
        obj = b.b(g1.a());
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d(g1);
        if (true) goto _L1; else goto _L3
_L3:
        g1;
        throw g1;
    }

    public final void d(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.b();
        b.a(g1.a(), g1);
        e(g1);
        this;
        JVM INSTR monitorexit ;
        return;
        g1;
        throw g1;
    }
}
