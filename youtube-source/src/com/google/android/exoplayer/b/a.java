// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.b;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer.a.l;
import com.google.android.exoplayer.a.m;
import com.google.android.exoplayer.a.n;
import com.google.android.exoplayer.a.o;
import com.google.android.exoplayer.a.r;
import com.google.android.exoplayer.a.t;
import com.google.android.exoplayer.a.u;
import com.google.android.exoplayer.ag;
import com.google.android.exoplayer.aj;
import com.google.android.exoplayer.d.a.f;
import com.google.android.exoplayer.d.a.h;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.b:
//            b

public class a
    implements l
{

    private static final String a = com/google/android/exoplayer/b/a.getSimpleName();
    private final aj b;
    private final i c;
    private final o d;
    private final r e;
    private final int f;
    private final int g;
    private final int h;
    private final m i[];
    private final SparseArray j;
    private final SparseArray k;
    private boolean l;

    private transient a(i i1, o o1, int j1, com.google.android.exoplayer.b.a.a aa[])
    {
        j1 = 0;
        super();
        c = i1;
        d = o1;
        h = 1;
        i = new m[aa.length];
        k = new SparseArray();
        j = new SparseArray();
        b = new aj(aa[0].c.b, aa[0].j * 1000L);
        e = new r();
        int k1 = 0;
        int l1 = 0;
        for (; j1 < aa.length; j1++)
        {
            i[j1] = aa[j1].c;
            l1 = Math.max(i[j1].c, l1);
            k1 = Math.max(i[j1].d, k1);
            k.append(i[j1].a, new f());
            j.put(i[j1].a, aa[j1]);
        }

        f = l1;
        g = k1;
        Arrays.sort(i, new n());
    }

    public transient a(i i1, o o1, com.google.android.exoplayer.b.a.a aa[])
    {
        this(i1, o1, 1, aa);
    }

    static String d()
    {
        return a;
    }

    public final Pair a(List list, long l1, long l2)
    {
        e.a = list.size();
        if (e.c == null || !l)
        {
            d.a(list, l2, i, e);
        }
        int j2 = e.a;
        if (e.c == null)
        {
            return Pair.create(Integer.valueOf(j2), null);
        }
        com.google.android.exoplayer.b.a.a a1 = (com.google.android.exoplayer.b.a.a)j.get(e.c.a);
        f f1 = (f)k.get(a1.c.a);
        if (f1.d() == null)
        {
            list = c;
            int i1 = e.b;
            list = new b(list, new j(a1.k, 0L, a1.h + 1L, a1.a()), i1, f1, a1);
            l = true;
            return Pair.create(Integer.valueOf(j2), list);
        }
        int j1;
        if (list.isEmpty())
        {
            int k1 = Arrays.binarySearch(f1.a().f, l1);
            j1 = k1;
            if (k1 < 0)
            {
                j1 = -k1 - 2;
            }
        } else
        {
            j1 = ((t)list.get(j2 - 1)).f;
        }
        if (j1 == -1)
        {
            return Pair.create(Integer.valueOf(j2), null);
        }
        list = c;
        h h1 = f1.a();
        int k2 = e.b;
        int i3 = (Math.min(h, h1.b - j1) + j1) - 1;
        int i2;
        long l3;
        long l4;
        long l5;
        if (i3 == h1.b - 1)
        {
            i2 = -1;
        } else
        {
            i2 = i3 + 1;
        }
        l3 = h1.f[j1];
        if (i2 == -1)
        {
            l1 = h1.f[i3] + h1.e[i3];
        } else
        {
            l1 = h1.f[i2];
        }
        l4 = (int)a1.h + 1;
        l5 = h1.d[j1];
        l2 = 0L;
        for (; j1 <= i3; j1++)
        {
            l2 += h1.c[j1];
        }

        list = new u(list, new j(a1.k, l4 + l5, l2, a1.a()), a1.c, k2, f1, l3, l1, i2, false);
        l = false;
        return Pair.create(Integer.valueOf(j2), list);
    }

    public final aj a()
    {
        return b;
    }

    public final void a(ag ag1)
    {
        if (b.a.startsWith("video"))
        {
            ag1.a(f, g);
        }
    }

    public final void b()
    {
        o o1 = d;
    }

    public final void c()
    {
        o o1 = d;
    }

}
