// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.r;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.m;
import com.vividsolutions.jts.geom.u;

// Referenced classes of package com.vividsolutions.jts.g.a:
//            d, i

final class h
{

    private double a;
    private int b;
    private i c;
    private double d;
    private u e;
    private d f;
    private k g;
    private Coordinate h;
    private Coordinate i;
    private Coordinate j;
    private m k;
    private m l;
    private m m;
    private m n;
    private int o;

    public h(u u, d d1, double d2)
    {
        b = 1;
        d = 0.0D;
        k = new m();
        l = new m();
        m = new m();
        n = new m();
        o = 0;
        e = u;
        f = d1;
        g = new r();
        a = 1.5707963267948966D / (double)d1.a();
        if (d1.a() >= 8 && d1.c() == 1)
        {
            b = 80;
        }
        d = d2;
        Math.cos(a / 2D);
        c = new i();
        c.a(e);
        c.a(9.9999999999999995E-07D * d2);
    }

    private void a(Coordinate coordinate, double d1, double d2, int i1, double d3)
    {
        double d4;
        int j1;
        if (i1 == -1)
        {
            i1 = -1;
        } else
        {
            i1 = 1;
        }
        d4 = Math.abs(d1 - d2);
        j1 = (int)(d4 / a + 0.5D);
        if (j1 > 0)
        {
            double d5 = d4 / (double)j1;
            d2 = 0.0D;
            Coordinate coordinate1 = new Coordinate();
            while (d2 < d4) 
            {
                double d6 = (double)i1 * d2 + d1;
                coordinate1.x = coordinate.x + Math.cos(d6) * d3;
                double d7 = coordinate.y;
                coordinate1.y = Math.sin(d6) * d3 + d7;
                c.a(coordinate1);
                d2 += d5;
            }
        }
    }

    private void a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, int i1, double d1)
    {
        double d4;
        double d5;
        double d2 = coordinate1.x;
        d4 = coordinate.x;
        d4 = Math.atan2(coordinate1.y - coordinate.y, d2 - d4);
        d2 = coordinate2.x;
        d5 = coordinate.x;
        d5 = Math.atan2(coordinate2.y - coordinate.y, d2 - d5);
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        double d3;
        d3 = d4;
        if (d4 <= d5)
        {
            d3 = d4 + 6.2831853071795862D;
        }
_L4:
        c.a(coordinate1);
        a(coordinate, d3, d5, i1, d1);
        c.a(coordinate2);
        return;
_L2:
        d3 = d4;
        if (d4 >= d5)
        {
            d3 = d4 - 6.2831853071795862D;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Coordinate coordinate, m m1, m m2, double d1)
    {
        boolean flag = true;
        m1 = com.vividsolutions.jts.a.a.a(m1.a, m1.b, m2.a, m2.b);
        if (d1 > 0.0D) goto _L2; else goto _L1
_L1:
        double d2 = 1.0D;
_L10:
        double d3 = f.d();
        coordinate = m1;
        if (d2 > d3)
        {
            flag = false;
            coordinate = m1;
        }
_L4:
        if (flag)
        {
            c.a(coordinate);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        d2 = m1.distance(coordinate);
        d3 = Math.abs(d1);
        d2 /= d3;
        continue; /* Loop/switch isn't completed */
        coordinate;
        coordinate = new Coordinate(0.0D, 0.0D);
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        double d4;
        double d5;
        d4 = f.d();
        coordinate = k.b;
        d5 = com.vividsolutions.jts.a.a.a(coordinate, k.a);
        com.vividsolutions.jts.a.a.a(coordinate, l.b);
        m1 = k.a;
        m2 = l.b;
        d2 = com.vividsolutions.jts.a.a.a(coordinate, m1);
        d3 = com.vividsolutions.jts.a.a.a(coordinate, m2) - d2;
        if (d3 > -3.1415926535897931D) goto _L6; else goto _L5
_L5:
        d2 = d3 + 6.2831853071795862D;
_L8:
        double d6 = d2 / 2D;
        d2 = com.vividsolutions.jts.a.a.a(com.vividsolutions.jts.a.a.a(d5 + d6) + 3.1415926535897931D);
        d3 = d4 * d1;
        d1 -= Math.abs(Math.sin(d6)) * d3;
        d4 = coordinate.x;
        d5 = Math.cos(d2);
        d6 = coordinate.y;
        m1 = new m(coordinate, new Coordinate(d4 + d5 * d3, d3 * Math.sin(d2) + d6));
        coordinate = m1.a(1.0D, d1);
        m1 = m1.a(1.0D, -d1);
        if (o == 1)
        {
            c.a(coordinate);
            c.a(m1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        d2 = d3;
        if (d3 > 3.1415926535897931D)
        {
            d2 = d3 - 6.2831853071795862D;
        }
        if (true) goto _L8; else goto _L7
_L7:
        c.a(m1);
        c.a(coordinate);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private static void a(m m1, int i1, double d1, m m2)
    {
        boolean flag = true;
        double d2;
        double d3;
        double d4;
        if (i1 == 1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = -1;
        }
        d4 = m1.b.x - m1.a.x;
        d2 = m1.b.y - m1.a.y;
        d3 = Math.sqrt(d4 * d4 + d2 * d2);
        d4 = (d4 * ((double)i1 * d1)) / d3;
        d1 = ((double)i1 * d1 * d2) / d3;
        m2.a.x = m1.a.x - d1;
        m2.a.y = m1.a.y + d4;
        m2.b.x = m1.b.x - d1;
        m2.b.y = d4 + m1.b.y;
    }

    public final void a(Coordinate coordinate)
    {
        Coordinate coordinate1 = new Coordinate(coordinate.x + d, coordinate.y);
        c.a(coordinate1);
        a(coordinate, 0.0D, 6.2831853071795862D, -1, d);
        c.a();
    }

    public final void a(Coordinate coordinate, Coordinate coordinate1)
    {
        m m3 = new m(coordinate, coordinate1);
        m m2 = new m();
        a(m3, 1, d, m2);
        m m1 = new m();
        a(m3, 2, d, m1);
        double d1 = coordinate1.x;
        double d2 = coordinate.x;
        d1 = Math.atan2(coordinate1.y - coordinate.y, d1 - d2);
        switch (f.b())
        {
        default:
            return;

        case 1: // '\001'
            c.a(m2.b);
            a(coordinate1, d1 + 1.5707963267948966D, d1 - 1.5707963267948966D, -1, d);
            c.a(m1.b);
            return;

        case 2: // '\002'
            c.a(m2.b);
            c.a(m1.b);
            return;

        case 3: // '\003'
            coordinate = new Coordinate();
            break;
        }
        coordinate.x = Math.abs(d) * Math.cos(d1);
        coordinate.y = Math.abs(d) * Math.sin(d1);
        coordinate1 = new Coordinate(m2.b.x + coordinate.x, m2.b.y + coordinate.y);
        coordinate = new Coordinate(m1.b.x + coordinate.x, m1.b.y + coordinate.y);
        c.a(coordinate1);
        c.a(coordinate);
    }

    public final void a(Coordinate coordinate, Coordinate coordinate1, int i1)
    {
        i = coordinate;
        j = coordinate1;
        o = i1;
        l.a(coordinate, coordinate1);
        a(l, i1, d, n);
    }

    public final void a(Coordinate coordinate, boolean flag)
    {
        boolean flag2;
        flag2 = true;
        h = i;
        i = j;
        j = coordinate;
        k.a(h, i);
        a(k, o, d, m);
        l.a(i, j);
        a(l, o, d, n);
        if (!i.equals(j)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag1;
        int i1;
label0:
        {
            i1 = com.vividsolutions.jts.a.a.a(h, i, j);
            if (i1 == -1)
            {
                flag1 = flag2;
                if (o == 1)
                {
                    break label0;
                }
            }
            if (i1 == 1 && o == 2)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        if (i1 == 0)
        {
            g.a(h, i, i, j);
            if (g.b() >= 2)
            {
                if (f.c() == 3 || f.c() == 2)
                {
                    if (flag)
                    {
                        c.a(m.b);
                    }
                    c.a(n.a);
                    return;
                } else
                {
                    a(i, m.b, n.a, -1, d);
                    return;
                }
            }
        } else
        {
            if (flag1)
            {
                if (m.b.distance(n.a) < d * 0.001D)
                {
                    c.a(m.b);
                    return;
                }
                if (f.c() == 2)
                {
                    a(i, m, n, d);
                    return;
                }
                if (f.c() == 3)
                {
                    coordinate = m;
                    m m1 = n;
                    c.a(((m) (coordinate)).b);
                    c.a(m1.a);
                    return;
                }
                if (flag)
                {
                    c.a(m.b);
                }
                a(i, m.b, n.a, i1, d);
                c.a(n.a);
                return;
            }
            g.a(m.a, m.b, n.a, n.b);
            if (g.a())
            {
                c.a(g.a(0));
                return;
            }
            if (m.b.distance(n.a) < d * 0.001D)
            {
                c.a(m.b);
                return;
            }
            c.a(m.b);
            if (b > 0)
            {
                coordinate = new Coordinate(((double)b * m.b.x + i.x) / (double)(b + 1), ((double)b * m.b.y + i.y) / (double)(b + 1));
                c.a(coordinate);
                coordinate = new Coordinate(((double)b * n.a.x + i.x) / (double)(b + 1), ((double)b * n.a.y + i.y) / (double)(b + 1));
                c.a(coordinate);
            } else
            {
                c.a(i);
            }
            c.a(n.a);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final Coordinate[] a()
    {
        return c.b();
    }

    public final void b()
    {
        c.a();
    }

    public final void b(Coordinate coordinate)
    {
        c.a(new Coordinate(coordinate.x + d, coordinate.y + d));
        c.a(new Coordinate(coordinate.x + d, coordinate.y - d));
        c.a(new Coordinate(coordinate.x - d, coordinate.y - d));
        c.a(new Coordinate(coordinate.x - d, coordinate.y + d));
        c.a();
    }

    public final void c()
    {
        c.a(n.b);
    }
}
