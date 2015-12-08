// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.Handler;
import com.google.android.exoplayer.upstream.NetworkLock;
import com.google.android.exoplayer.upstream.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer:
//            n, p, o

public final class m
{

    private final b a;
    private final List b = new ArrayList();
    private final HashMap c = new HashMap();
    private final Handler d = null;
    private final o e = null;
    private final long f;
    private final long g;
    private final float h;
    private final float i;
    private int j;
    private long k;
    private int l;
    private boolean m;
    private boolean n;

    public m(b b1, Handler handler, o o, int i1, int j1, float f1, float f2)
    {
        a = b1;
        f = (long)i1 * 1000L;
        g = (long)j1 * 1000L;
        h = f1;
        i = f2;
    }

    static o a(m m1)
    {
        return m1.e;
    }

    private void a(boolean flag)
    {
        if (d != null && e != null)
        {
            d.post(new n(this, flag));
        }
    }

    private void c()
    {
        boolean flag1;
        boolean flag2 = false;
        int j1 = l;
        int i1 = 0;
        boolean flag = false;
        flag1 = false;
        for (; i1 < b.size(); i1++)
        {
            p p1 = (p)c.get(b.get(i1));
            flag1 |= p1.c;
            flag |= p1.d;
            j1 = Math.max(j1, p1.b);
        }

        Object obj;
        long l1;
        boolean flag3;
        if (!b.isEmpty() && !flag && (j1 == 2 || j1 == 1 && m))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        m = flag3;
        if (!m || n) goto _L2; else goto _L1
_L1:
        NetworkLock.a.a(0);
        n = true;
        a(true);
_L4:
        k = -1L;
        if (m)
        {
            for (i1 = ((flag2) ? 1 : 0); i1 < b.size(); i1++)
            {
                obj = b.get(i1);
                l1 = ((p)c.get(obj)).e;
                if (l1 != -1L && (k == -1L || l1 < k))
                {
                    k = l1;
                }
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!m && n && !flag1)
        {
            NetworkLock.a.b(0);
            n = false;
            a(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        a.b(j);
    }

    public final void a(Object obj)
    {
        b.remove(obj);
        obj = (p)c.remove(obj);
        j = j - ((p) (obj)).a;
        c();
    }

    public final void a(Object obj, int i1)
    {
        b.add(obj);
        c.put(obj, new p(i1));
        j = j + i1;
    }

    public final boolean a(Object obj, long l1, long l2, boolean flag, boolean flag1)
    {
        byte byte0 = 2;
        float f1;
        int i1;
        boolean flag2;
        int j1;
        if (l2 == -1L)
        {
            i1 = 0;
        } else
        {
            l1 = l2 - l1;
            if (l1 > g)
            {
                i1 = 0;
            } else
            if (l1 < f)
            {
                i1 = 2;
            } else
            {
                i1 = 1;
            }
        }
        obj = (p)c.get(obj);
        if (((p) (obj)).b != i1 || ((p) (obj)).e != l2 || ((p) (obj)).c != flag || ((p) (obj)).d != flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            obj.b = i1;
            obj.e = l2;
            obj.c = flag;
            obj.d = flag1;
        }
        j1 = a.a();
        f1 = (float)j1 / (float)j;
        if (f1 > i)
        {
            i1 = 0;
        } else
        {
            i1 = byte0;
            if (f1 >= h)
            {
                i1 = 1;
            }
        }
        if (l != i1)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 != 0)
        {
            l = i1;
        }
        if (flag2 || byte0 != 0)
        {
            c();
        }
        return j1 < j && l2 <= k;
    }

    public final b b()
    {
        return a;
    }
}
