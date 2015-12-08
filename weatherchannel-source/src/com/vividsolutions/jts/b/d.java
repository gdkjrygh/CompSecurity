// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.b.a.c;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.IntersectionMatrix;

// Referenced classes of package com.vividsolutions.jts.b:
//            m, h, a, n

public final class d extends m
{

    Coordinate a[];
    h b;
    private c d;
    private boolean e;
    private a f;
    private int g;

    public d(Coordinate acoordinate[], n n1)
    {
        b = new h(this);
        e = true;
        f = new a();
        g = 0;
        a = acoordinate;
        c = n1;
    }

    public static void a(n n1, IntersectionMatrix intersectionmatrix)
    {
        intersectionmatrix.setAtLeastIfValid(n1.a(0, 0), n1.a(1, 0), 1);
        if (n1.c())
        {
            intersectionmatrix.setAtLeastIfValid(n1.a(0, 1), n1.a(1, 1), 2);
            intersectionmatrix.setAtLeastIfValid(n1.a(0, 2), n1.a(1, 2), 2);
        }
    }

    public final int a()
    {
        return a.length;
    }

    public final Coordinate a(int i1)
    {
        return a[i1];
    }

    public final void a(k k1, int i1, int j1)
    {
        int l1 = 0;
        while (l1 < k1.b()) 
        {
            Coordinate coordinate = new Coordinate(k1.a(l1));
            double d1 = k1.a(j1, l1);
            int i2 = i1 + 1;
            if (i2 < a.length && coordinate.equals2D(a[i2]))
            {
                d1 = 0.0D;
            } else
            {
                i2 = i1;
            }
            b.a(coordinate, i2, d1);
            l1++;
        }
    }

    public final void a(IntersectionMatrix intersectionmatrix)
    {
        a(c, intersectionmatrix);
    }

    public final void a(boolean flag)
    {
        e = false;
    }

    public final boolean a(d d1)
    {
        if (a.length == d1.a.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= a.length)
                {
                    break label1;
                }
                if (!a[i1].equals2D(d1.a[i1]))
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final void b(int i1)
    {
        g = i1;
    }

    public final Coordinate[] b()
    {
        return a;
    }

    public final Coordinate c()
    {
        if (a.length > 0)
        {
            return a[0];
        } else
        {
            return null;
        }
    }

    public final a d()
    {
        return f;
    }

    public final int e()
    {
        return g;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof d) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (a.length == ((d) (obj = (d)obj)).a.length)
        {
            int j1 = a.length;
            boolean flag = true;
            boolean flag1 = true;
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    if (i1 >= a.length)
                    {
                        break label1;
                    }
                    if (!a[i1].equals2D(((d) (obj)).a[i1]))
                    {
                        flag1 = false;
                    }
                    Coordinate coordinate = a[i1];
                    Coordinate acoordinate[] = ((d) (obj)).a;
                    j1--;
                    if (!coordinate.equals2D(acoordinate[j1]))
                    {
                        flag = false;
                    }
                    if (!flag1 && !flag)
                    {
                        break label0;
                    }
                    i1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final int f()
    {
        return a.length - 1;
    }

    public final h g()
    {
        return b;
    }

    public final c h()
    {
        if (d == null)
        {
            d = new c(this);
        }
        return d;
    }

    public final boolean i()
    {
        return a[0].equals(a[a.length - 1]);
    }

    public final boolean j()
    {
        while (!c.c() || a.length != 3 || !a[0].equals(a[2])) 
        {
            return false;
        }
        return true;
    }

    public final d k()
    {
        Coordinate coordinate = a[0];
        Coordinate coordinate1 = a[1];
        n n1 = n.a(c);
        return new d(new Coordinate[] {
            coordinate, coordinate1
        }, n1);
    }

    public final boolean l()
    {
        return e;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder("edge ")).append(null).append(": ").toString());
        stringbuffer.append("LINESTRING (");
        for (int i1 = 0; i1 < a.length; i1++)
        {
            if (i1 > 0)
            {
                stringbuffer.append(",");
            }
            stringbuffer.append((new StringBuilder()).append(a[i1].x).append(" ").append(a[i1].y).toString());
        }

        stringbuffer.append((new StringBuilder(")  ")).append(c).append(" ").append(g).toString());
        return stringbuffer.toString();
    }
}
