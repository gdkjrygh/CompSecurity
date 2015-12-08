// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f.a;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.f.i;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;

public final class a
{

    private k a;
    private Coordinate b;
    private Coordinate c;
    private Coordinate d;
    private Coordinate e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private Coordinate k[];
    private h l;

    public a(Coordinate coordinate, double d1, k k1)
    {
        k = new Coordinate[4];
        l = null;
        c = coordinate;
        b = coordinate;
        f = d1;
        a = k1;
        if (d1 <= 0.0D)
        {
            throw new IllegalArgumentException("Scale factor must be non-zero");
        }
        if (d1 != 1.0D)
        {
            b = new Coordinate(a(coordinate.x), a(coordinate.y));
            d = new Coordinate();
            e = new Coordinate();
        }
        coordinate = b;
        g = coordinate.x - 0.5D;
        h = coordinate.x + 0.5D;
        i = coordinate.y - 0.5D;
        j = coordinate.y + 0.5D;
        k[0] = new Coordinate(h, j);
        k[1] = new Coordinate(g, j);
        k[2] = new Coordinate(g, i);
        k[3] = new Coordinate(h, i);
    }

    private double a(double d1)
    {
        return (double)Math.round(f * d1);
    }

    private void a(Coordinate coordinate, Coordinate coordinate1)
    {
        coordinate1.x = a(coordinate.x);
        coordinate1.y = a(coordinate.y);
    }

    private boolean b(Coordinate coordinate, Coordinate coordinate1)
    {
        double d1 = Math.min(coordinate.x, coordinate1.x);
        double d2 = Math.max(coordinate.x, coordinate1.x);
        double d3 = Math.min(coordinate.y, coordinate1.y);
        double d4 = Math.max(coordinate.y, coordinate1.y);
        boolean flag;
        if (h < d1 || g > d2 || j < d3 || i > d4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return false;
        }
        flag = false;
        boolean flag1 = false;
        a.a(coordinate, coordinate1, k[0], k[1]);
        boolean flag2;
        if (a.d())
        {
            flag2 = true;
        } else
        {
            a.a(coordinate, coordinate1, k[1], k[2]);
            if (a.d())
            {
                flag2 = true;
            } else
            {
                if (a.a())
                {
                    flag = true;
                }
                a.a(coordinate, coordinate1, k[2], k[3]);
                if (a.d())
                {
                    flag2 = true;
                } else
                {
                    if (a.a())
                    {
                        flag1 = true;
                    }
                    a.a(coordinate, coordinate1, k[3], k[0]);
                    if (a.d())
                    {
                        flag2 = true;
                    } else
                    if (flag && flag1)
                    {
                        flag2 = true;
                    } else
                    if (coordinate.equals(b))
                    {
                        flag2 = true;
                    } else
                    if (coordinate1.equals(b))
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                }
            }
        }
        com.vividsolutions.jts.a.a.a(true, "Found bad envelope test");
        return flag2;
    }

    public final h a()
    {
        if (l == null)
        {
            double d1 = 0.75D / f;
            l = new h(c.x - d1, c.x + d1, c.y - d1, d1 + c.y);
        }
        return l;
    }

    public final boolean a(i i1, int j1)
    {
        Coordinate coordinate = i1.a(j1);
        Coordinate coordinate1 = i1.a(j1 + 1);
        boolean flag;
        if (f == 1.0D)
        {
            flag = b(coordinate, coordinate1);
        } else
        {
            a(coordinate, d);
            a(coordinate1, e);
            flag = b(d, e);
        }
        if (flag)
        {
            i1.a(c, j1);
            return true;
        } else
        {
            return false;
        }
    }
}
