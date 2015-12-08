// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import android.util.SparseArray;
import com.android.volley.NetworkError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.database.d;
import com.google.android.apps.youtube.common.database.e;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            j, m, SendingStrategy, e, 
//            f, c, b, l

public final class a
    implements com.google.android.apps.youtube.datalib.offline.j
{

    private final d b;
    private final SparseArray c = new SparseArray();
    private final Executor d;
    private final com.google.android.apps.youtube.datalib.config.c e;
    private final m f;
    private final b g;
    private final h h;

    public a(d d1, Set set, Executor executor, com.google.android.apps.youtube.datalib.config.c c1, m m1, b b1, h h1)
    {
        b = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        d = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        e = (com.google.android.apps.youtube.datalib.config.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
        f = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
        g = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        h = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        for (d1 = set.iterator(); d1.hasNext(); c.put(set.a(), set))
        {
            set = (SendingStrategy)d1.next();
        }

    }

    static m a(a a1)
    {
        return a1.f;
    }

    private void a(com.google.android.apps.youtube.a.a.c c1)
    {
        d.execute(new com.google.android.apps.youtube.datalib.offline.e(this, c1));
    }

    static void a(a a1, com.google.android.apps.youtube.a.a.c c1)
    {
        a1.a(c1);
    }

    private static void a(Map map, String s)
    {
        if (map.containsKey(s))
        {
            map.put(s, Integer.valueOf(((Integer)map.get(s)).intValue() + 1));
            return;
        } else
        {
            map.put(s, Integer.valueOf(1));
            return;
        }
    }

    static boolean a(a a1, com.google.android.apps.youtube.a.a.c c1, VolleyError volleyerror)
    {
        if (c1.m() < a1.e.f())
        {
            a1 = null;
            boolean flag;
            if (volleyerror instanceof SendingStrategy.PermanentVolleyError)
            {
                flag = true;
            } else
            {
                if (volleyerror instanceof NetworkError)
                {
                    a1 = ((NetworkError)volleyerror).networkResponse;
                } else
                if (volleyerror instanceof ServerError)
                {
                    a1 = ((ServerError)volleyerror).networkResponse;
                }
                if (a1 != null)
                {
                    L.e((new StringBuilder("Status code of errored request is ")).append(((j) (a1)).a).toString());
                    if (((j) (a1)).a == 400 || ((j) (a1)).a == 403)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    L.e("Network response was not present, request is retryable.");
                    flag = false;
                }
            }
            if (!flag)
            {
                return true;
            }
        }
        return false;
    }

    static d b(a a1)
    {
        return a1.b;
    }

    private List b()
    {
        Object obj;
        obj = new ArrayList();
        e e1 = b.d();
        int i = 0;
        int l = 0;
        while (e1.hasNext()) 
        {
            com.google.android.apps.youtube.a.a.c c1 = (com.google.android.apps.youtube.a.a.c)e1.next();
            int k = i;
            if (l < e.c())
            {
                k = i + 1;
                ((List) (obj)).add(c1);
            }
            l++;
            i = k;
        }
        e1.a();
        f.b(l - i);
        b.a();
        com.google.android.apps.youtube.a.a.c c2;
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); b.a(c2.a()))
        {
            c2 = (com.google.android.apps.youtube.a.a.c)iterator.next();
        }

        break MISSING_BLOCK_LABEL_170;
        obj;
        b.b();
        throw obj;
        b.c();
        b.b();
        return ((List) (obj));
    }

    static h c(a a1)
    {
        return a1.h;
    }

    static b d(a a1)
    {
        return a1.g;
    }

    static Executor e(a a1)
    {
        return a1.d;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        HashMap hashmap;
        e e1;
        com.google.android.apps.youtube.common.fromguava.c.b();
        obj = new ArrayList();
        obj1 = new ArrayList();
        hashmap = new HashMap();
        e1 = b.d();
        int i;
        int k;
        i = 1;
        k = 0;
_L1:
        com.google.android.apps.youtube.a.a.c c2;
        if (!e1.hasNext())
        {
            break MISSING_BLOCK_LABEL_201;
        }
        c2 = (com.google.android.apps.youtube.a.a.c)e1.next();
        k++;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        f.a(TimeUnit.MILLISECONDS.toHours(g.a()) - TimeUnit.MILLISECONDS.toHours(c2.i()));
        i = 0;
        SendingStrategy sendingstrategy = (SendingStrategy)c.get(c2.b());
        if (sendingstrategy == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (sendingstrategy.a(c2))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        ((List) (obj1)).add(c2.a());
        a(((Map) (hashmap)), c2.k());
          goto _L1
        ((List) (obj)).add(new f(c2.a(), c2.k()));
          goto _L1
        e1.a();
        if (((List) (obj)).size() <= e.a()) goto _L3; else goto _L2
_L2:
        int j1;
        int k1;
        j1 = ((List) (obj)).size();
        k1 = e.a();
        i = 0;
_L4:
        if (i >= j1 - k1)
        {
            break; /* Loop/switch isn't completed */
        }
        f f1 = (f)((List) (obj)).get(i);
        ((List) (obj1)).add(f1.a);
        a(((Map) (hashmap)), f1.b);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        f.a(hashmap);
        f.a(k);
        if (((List) (obj1)).isEmpty()) goto _L6; else goto _L5
_L5:
        b.a();
        for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); b.a(((String) (obj1))))
        {
            obj1 = (String)((Iterator) (obj)).next();
        }

          goto _L7
        Exception exception;
        exception;
        throw exception;
_L7:
        b.c();
        b.b();
          goto _L6
_L11:
        if (i >= c.size())
        {
            break MISSING_BLOCK_LABEL_444;
        }
        int l = c.keyAt(i);
        c.get(l);
        i++;
        continue; /* Loop/switch isn't completed */
        exception = b().iterator();
_L8:
        if (!exception.hasNext())
        {
            break MISSING_BLOCK_LABEL_634;
        }
        obj1 = (com.google.android.apps.youtube.a.a.c)exception.next();
        com.google.android.apps.youtube.datalib.offline.c c1;
        int i1;
        if (TimeUnit.SECONDS.toMillis(BigInteger.valueOf(e.g()).pow(((com.google.android.apps.youtube.a.a.c) (obj1)).m()).longValue()) + ((com.google.android.apps.youtube.a.a.c) (obj1)).n() > g.a())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_536;
        }
        a(((com.google.android.apps.youtube.a.a.c) (obj1)));
          goto _L8
        c1 = new com.google.android.apps.youtube.datalib.offline.c(this, ((com.google.android.apps.youtube.a.a.c) (obj1)));
        i = ((com.google.android.apps.youtube.a.a.c) (obj1)).b();
        ((SendingStrategy)c.get(i)).a(((com.google.android.apps.youtube.a.a.c) (obj1)), c1);
          goto _L8
_L9:
        for (; i >= c.size(); i = 0)
        {
            break MISSING_BLOCK_LABEL_616;
        }

        i1 = c.keyAt(i);
        c.get(i1);
        i++;
          goto _L9
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        i = 0;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void a(l l)
    {
        this;
        JVM INSTR monitorenter ;
        d.execute(new com.google.android.apps.youtube.datalib.offline.b(this, l));
        this;
        JVM INSTR monitorexit ;
        return;
        l;
        throw l;
    }
}
