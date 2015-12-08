// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.e.b;
import com.vividsolutions.jts.f.l;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.u;
import com.vividsolutions.jts.geom.w;

// Referenced classes of package com.vividsolutions.jts.g.a:
//            d, a

public final class c
{

    private static int a = 12;
    private i b;
    private double c;
    private d d;
    private i e;
    private RuntimeException f;

    private c(i j)
    {
        d = new d();
        e = null;
        b = j;
    }

    private i a(double d1)
    {
        c = d1;
        b();
        if (e == null)
        {
            u u1 = b.getFactory().getPrecisionModel();
            if (u1.c() == u.a)
            {
                a(u1);
            } else
            {
                a();
            }
        }
        return e;
    }

    public static i a(i j, double d1)
    {
        return (new c(j)).a(d1);
    }

    public static i a(i j, double d1, int k)
    {
        j = new c(j);
        j.a(k);
        return j.a(d1);
    }

    public static i a(i j, double d1, int k, int i1)
    {
        j = new c(j);
        j.a(k);
        ((c) (j)).d.b(i1);
        return j.a(d1);
    }

    private void a()
    {
        int j = a;
_L2:
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        double d1;
        double d2;
        Object obj = b;
        d1 = c;
        obj = ((i) (obj)).getEnvelopeInternal();
        d2 = com.vividsolutions.jts.e.b.a(Math.abs(((h) (obj)).e()), Math.abs(((h) (obj)).g()), Math.abs(((h) (obj)).d()), Math.abs(((h) (obj)).f()));
        if (d1 <= 0.0D)
        {
            d1 = 0.0D;
        }
        try
        {
            a(new u(Math.pow(10D, j - (int)(Math.log(d1 * 2D + d2) / Math.log(10D) + 1.0D))));
        }
        catch (w w1)
        {
            f = w1;
        }
        if (e != null)
        {
            return;
        }
        j--;
        if (true) goto _L2; else goto _L1
_L1:
        throw f;
    }

    private void a(int j)
    {
        d.a(j);
    }

    private void a(u u1)
    {
        l l1 = new l(new com.vividsolutions.jts.f.a.c(new u(1.0D)), u1.b());
        a a1 = new a(d);
        a1.a(u1);
        a1.a(l1);
        e = a1.a(b, c);
    }

    private void b()
    {
        try
        {
            e = (new a(d)).a(b, c);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            f = runtimeexception;
        }
    }

}
