// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer.ah;
import com.google.android.exoplayer.ai;
import com.google.android.exoplayer.aj;
import com.google.android.exoplayer.e.a;
import com.google.android.exoplayer.l;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.upstream.m;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.a:
//            c, j, t, h, 
//            l, a, m, d, 
//            i, f, g, e, 
//            k

public final class b
    implements ai, m
{

    private final int a;
    private final com.google.android.exoplayer.m b;
    private final com.google.android.exoplayer.a.l c;
    private final LinkedList d;
    private final List e;
    private final int f;
    private final boolean g;
    private final Handler h;
    private final k i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private Loader o;
    private com.google.android.exoplayer.a.a p;
    private IOException q;
    private boolean r;
    private int s;
    private long t;
    private volatile com.google.android.exoplayer.a.m u;

    public b(com.google.android.exoplayer.a.l l1, com.google.android.exoplayer.m m1, int i1, boolean flag)
    {
        this(l1, m1, i1, flag, null, null, 0);
    }

    private b(com.google.android.exoplayer.a.l l1, com.google.android.exoplayer.m m1, int i1, boolean flag, Handler handler, k k1, int j1)
    {
        c = l1;
        b = m1;
        f = i1;
        g = flag;
        h = null;
        i = null;
        a = 0;
        d = new LinkedList();
        e = Collections.unmodifiableList(d);
        j = 0;
    }

    static int a(b b1)
    {
        return b1.a;
    }

    private void a(int i1, int j1, boolean flag, long l1, long l2, 
            long l3)
    {
        if (h != null && i != null)
        {
            h.post(new c(this, i1, j1, flag, l1, l2, l3));
        }
    }

    private void a(long l1, long l2, long l3)
    {
        if (h != null && i != null)
        {
            h.post(new j(this, l1, l2, l3));
        }
    }

    private void a(t t1)
    {
        long l1 = 0L;
        if (d.isEmpty() || t1 == d.getFirst())
        {
            return;
        }
        long l3 = ((t)d.getFirst()).d;
        long l2 = 0L;
        t t2;
        for (; !d.isEmpty() && t1 != d.getFirst(); t2.a())
        {
            t2 = (t)d.removeFirst();
            l2 += t2.c();
            l1 = t2.e;
        }

        a(l3, l1, l2);
    }

    static k b(b b1)
    {
        return b1.i;
    }

    private void c(int i1)
    {
        long l1 = 0L;
        if (d.size() > i1)
        {
            long l3 = ((t)d.getLast()).e;
            long l2 = 0L;
            t t1;
            for (; d.size() > i1; t1.a())
            {
                t1 = (t)d.removeLast();
                l2 += t1.c();
                l1 = t1.d;
            }

            if (h != null && i != null)
            {
                h.post(new h(this, l1, l3, l2));
                return;
            }
        }
    }

    private void c(long l1)
    {
        m = l1;
        if (o.a())
        {
            o.b();
            return;
        } else
        {
            a(((t) (null)));
            g();
            h();
            return;
        }
    }

    private void g()
    {
        p = null;
        q = null;
        s = 0;
        r = false;
    }

    private void h()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        com.google.android.exoplayer.m m1;
        long l1;
        long l3;
        if (j())
        {
            l1 = m;
        } else
        {
            t t1 = (t)d.getLast();
            if (t1.f == -1)
            {
                l1 = -1L;
            } else
            {
                l1 = t1.e;
            }
        }
        if (q != null && !r)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m1 = b;
        l3 = k;
        if (flag || o.a())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag2 = m1.a(this, l3, l1, flag2, r);
        if (!r) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l2;
        l2 = SystemClock.elapsedRealtime();
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l2 - t < Math.min(((long)s - 1L) * 1000L, 5000L))
        {
            continue; /* Loop/switch isn't completed */
        }
        q = null;
        if (p instanceof t)
        {
            break; /* Loop/switch isn't completed */
        }
        Pair pair = c.a(e, m, k);
        c(((Integer)pair.first).intValue());
        p.a();
        p = (com.google.android.exoplayer.a.a)pair.second;
        if (p != null)
        {
            i();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        t t2;
        Pair pair2;
        Object obj;
        if (p == d.getFirst())
        {
            o.a(p);
            return;
        }
        t2 = (t)d.removeLast();
        if (p == t2)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        com.google.android.exoplayer.e.a.b(flag2);
        pair2 = c.a(e, m, k);
        d.add(t2);
        obj = (com.google.android.exoplayer.a.a)pair2.second;
        flag = flag1;
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (obj instanceof t) goto _L7; else goto _L6
_L6:
        flag = flag1;
_L5:
        if (flag)
        {
            o.a(p);
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        obj = (t)obj;
        flag = flag1;
        if (t2.a.a == ((t) (obj)).a.a)
        {
            flag = flag1;
            if (t2.d == ((t) (obj)).d)
            {
                flag = flag1;
                if (t2.e == ((t) (obj)).e)
                {
                    flag = true;
                }
            }
        }
        if (true) goto _L5; else goto _L8
_L8:
        c(((Integer)pair2.first).intValue());
        g();
        p = (com.google.android.exoplayer.a.a)pair2.second;
        if (p != null)
        {
            i();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (o.a()) goto _L1; else goto _L9
_L9:
        if (p == null || l2 - n > 1000L)
        {
            n = l2;
            Pair pair1 = c.a(e, m, k);
            c(((Integer)pair1.first).intValue());
            p = (com.google.android.exoplayer.a.a)pair1.second;
        }
        if (flag2 && p != null)
        {
            i();
            return;
        }
        if (true) goto _L1; else goto _L10
_L10:
    }

    private void i()
    {
        p.a(b.b());
        if (p instanceof t)
        {
            t t1 = (t)p;
            if (j())
            {
                t1.a(m, false);
                m = -1L;
            }
            d.add(t1);
            a(t1.a.a, t1.b, false, t1.d, t1.e, t1.c);
        } else
        {
            a(p.a.a, p.b, true, -1L, -1L, p.c);
        }
        o.a(p);
    }

    private boolean j()
    {
        return m != -1L;
    }

    private void k()
    {
        if (h != null && i != null)
        {
            h.post(new d(this));
        }
    }

    public final int a(int i1, long l1, l l2, ah ah1)
    {
        t t1;
        do
        {
            boolean flag;
            if (j == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.exoplayer.e.a.b(flag);
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.exoplayer.e.a.b(flag);
            k = l1;
            if (j())
            {
                if (q != null)
                {
                    throw q;
                } else
                {
                    return -2;
                }
            }
            t1 = (t)d.getFirst();
            if (!t1.b())
            {
                break;
            }
            if (d.size() > 1)
            {
                t1 = (t)d.removeFirst();
                long l3 = t1.c();
                t1.a();
                a(t1.d, t1.e, l3);
                t1 = (t)d.getFirst();
                t1.a(t1.d, false);
            } else
            {
                return !t1.j() ? -2 : -1;
            }
        } while (true);
        if (u == null || u.a != t1.a.a)
        {
            i1 = t1.a.a;
            int j1 = t1.b;
            l1 = t1.d;
            if (h != null && i != null)
            {
                h.post(new i(this, i1, j1, l1));
            }
            ah1 = t1.k();
            c.a(ah1);
            l2.a = ah1;
            l2.b = t1.l();
            u = t1.a;
            return -4;
        }
        if (t1.a(ah1))
        {
            boolean flag1;
            if (g && ah1.f < l)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ah1.g = flag1;
            return -3;
        }
        if (q != null)
        {
            throw q;
        } else
        {
            return -2;
        }
    }

    public final aj a(int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        if (i1 == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        return c.a();
    }

    public final void a(int i1, long l1)
    {
        boolean flag1 = true;
        boolean flag;
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        if (i1 == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        j = 2;
        c.b();
        b.a(this, f);
        u = null;
        k = l1;
        l = l1;
        c(l1);
    }

    public final void a(long l1)
    {
        boolean flag;
        if (j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        k = l1;
        h();
    }

    public final void a(IOException ioexception)
    {
        q = ioexception;
        s = s + 1;
        t = SystemClock.elapsedRealtime();
        if (h != null && i != null)
        {
            h.post(new f(this, ioexception));
        }
        h();
    }

    public final boolean a()
    {
        boolean flag;
        if (j == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        o = new Loader((new StringBuilder("Loader:")).append(c.a().a).toString(), this);
        j = 1;
        return true;
    }

    public final int b()
    {
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        return 1;
    }

    public final void b(int i1)
    {
        boolean flag1 = false;
        boolean flag;
        if (j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        flag = flag1;
        if (i1 == 0)
        {
            flag = true;
        }
        com.google.android.exoplayer.e.a.b(flag);
        j = 1;
        b.a(this);
        c.c();
        if (o.a())
        {
            o.b();
            return;
        } else
        {
            a(((t) (null)));
            g();
            b.a();
            return;
        }
    }

    public final boolean b(long l1)
    {
        Iterator iterator;
        boolean flag2;
        flag2 = true;
        boolean flag;
        if (j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        k = l1;
        l = l1;
        if (m == l1)
        {
            return false;
        }
        iterator = d.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        t t2 = (t)iterator.next();
        if (l1 < t2.d) goto _L2; else goto _L3
_L3:
        t t1;
        t1 = t2;
        if (t2.j())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (l1 >= t2.e) goto _L5; else goto _L4
_L4:
        t1 = t2;
_L7:
        if (t1 == null)
        {
            c(l1);
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        t1 = null;
        if (true) goto _L7; else goto _L6
_L6:
        boolean flag1;
        if (t1 == d.getFirst())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        flag1 = t1.a(l1, flag1);
        a(t1);
        h();
        return flag1;
    }

    public final long c()
    {
        boolean flag;
        if (j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        if (j())
        {
            return m;
        }
        t t1 = (t)d.getLast();
        if (p != null && t1 == p)
        {
            return t1.d + ((t1.e - t1.d) * t1.c()) / t1.c;
        }
        if (t1.j())
        {
            return -3L;
        } else
        {
            return t1.e;
        }
    }

    public final void d()
    {
        boolean flag;
        if (j != 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        if (o != null)
        {
            o.c();
            o = null;
        }
        j = 0;
    }

    public final void e()
    {
        p.d();
        if (!(p instanceof t))
        {
            p.a();
        }
        if (!r)
        {
            g();
        }
        k();
        h();
        return;
        Object obj;
        obj;
        q = ((IOException) (obj));
        s = s + 1;
        t = SystemClock.elapsedRealtime();
        r = true;
        if (h != null && i != null)
        {
            h.post(new g(this, ((IOException) (obj))));
        }
        if (!(p instanceof t))
        {
            p.a();
        }
        if (!r)
        {
            g();
        }
        k();
        h();
        return;
        obj;
        if (!(p instanceof t))
        {
            p.a();
        }
        if (!r)
        {
            g();
        }
        k();
        h();
        throw obj;
    }

    public final void f()
    {
        if (!(p instanceof t))
        {
            p.a();
        }
        g();
        if (h != null && i != null)
        {
            h.post(new e(this));
        }
        if (j == 2)
        {
            c(m);
            return;
        } else
        {
            a(((t) (null)));
            b.a();
            return;
        }
    }
}
