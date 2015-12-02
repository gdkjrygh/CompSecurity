// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google:
//            fc, d7, b2, gU, 
//            fR, fW, gH, dA, 
//            c7, bd, P, dv

public final class cP
    implements fc
{

    private final gU a[];
    private final fW b;
    private d7 c;
    private final cP d[];
    private final fR e[];
    private final cP f;
    private final int g;
    private final fR h[];
    private final String i;

    private cP(d7 d7_1, fW fw, cP cp, int j)
    {
        g = j;
        c = d7_1;
        i = b2.a(fw, cp, d7_1.s());
        b = fw;
        f = cp;
        d = new cP[d7_1.h()];
        for (j = 0; j < d7_1.h(); j++)
        {
            d[j] = new cP(d7_1.a(j), fw, this, j);
        }

        a = new gU[d7_1.c()];
        for (j = 0; j < d7_1.c(); j++)
        {
            a[j] = new gU(d7_1.f(j), fw, this, j, null);
        }

        e = new fR[d7_1.q()];
        for (j = 0; j < d7_1.q(); j++)
        {
            e[j] = new fR(d7_1.e(j), fw, this, j, false, null);
        }

        h = new fR[d7_1.j()];
        for (j = 0; j < d7_1.j(); j++)
        {
            h[j] = new fR(d7_1.h(j), fw, this, j, true, null);
        }

        fW.a(fw).a(this);
    }

    cP(d7 d7_1, fW fw, cP cp, int j, bd bd)
    {
        this(d7_1, fw, cp, j);
    }

    static void a(cP cp)
    {
        cp.e();
    }

    static void a(cP cp, d7 d7_1)
    {
        cp.a(d7_1);
    }

    private void a(d7 d7_1)
    {
        boolean flag = false;
        c = d7_1;
        for (int j = 0; j < d.length; j++)
        {
            d[j].a(d7_1.a(j));
        }

        for (int k = 0; k < a.length; k++)
        {
            gU.a(a[k], d7_1.f(k));
        }

        int l = 0;
        int i1;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (l >= e.length)
            {
                break;
            }
            fR.a(e[l], d7_1.e(l));
            l++;
        } while (true);
        for (; i1 < h.length; i1++)
        {
            fR.a(h[i1], d7_1.h(i1));
        }

    }

    private void e()
    {
        boolean flag = false;
        Object aobj[] = d;
        int i1 = aobj.length;
        for (int j = 0; j < i1; j++)
        {
            aobj[j].e();
        }

        aobj = e;
        i1 = aobj.length;
        for (int k = 0; k < i1; k++)
        {
            fR.b(aobj[k]);
        }

        aobj = h;
        i1 = aobj.length;
        for (int l = ((flag) ? 1 : 0); l < i1; l++)
        {
            fR.b(aobj[l]);
        }

    }

    public fW a()
    {
        return b;
    }

    public List a()
    {
        return Collections.unmodifiableList(Arrays.asList(h));
    }

    public boolean a(int j)
    {
        for (Iterator iterator = c.z().iterator(); iterator.hasNext();)
        {
            dA da = (dA)iterator.next();
            if (da.i() <= j && j < da.a())
            {
                return true;
            }
        }

        return false;
    }

    public fR b(int j)
    {
        return (fR)gH.a(fW.a(b)).get(new c7(this, j));
    }

    public String b()
    {
        return c.s();
    }

    public List b()
    {
        return Collections.unmodifiableList(Arrays.asList(a));
    }

    public String c()
    {
        return i;
    }

    public List c()
    {
        return Collections.unmodifiableList(Arrays.asList(d));
    }

    public P d()
    {
        return g();
    }

    public dv d()
    {
        return c.A();
    }

    public List f()
    {
        return Collections.unmodifiableList(Arrays.asList(e));
    }

    public d7 g()
    {
        return c;
    }
}
