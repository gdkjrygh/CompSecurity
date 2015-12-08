// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import java.io.Serializable;

// Referenced classes of package com.vividsolutions.jts.geom:
//            Coordinate

public final class h
    implements Serializable
{

    private static final long serialVersionUID = 0x51845cd552189854L;
    private double a;
    private double b;
    private double c;
    private double d;

    public h()
    {
        a = 0.0D;
        b = -1D;
        c = 0.0D;
        d = -1D;
    }

    public h(double d1, double d2, double d3, double d4)
    {
        a(d1, d2, d3, d4);
    }

    public h(Coordinate coordinate, Coordinate coordinate1)
    {
        a(coordinate.x, coordinate1.x, coordinate.y, coordinate1.y);
    }

    public h(h h1)
    {
        a = h1.a;
        b = h1.b;
        c = h1.c;
        d = h1.d;
    }

    private void a(double d1, double d2, double d3, double d4)
    {
        if (d1 < d2)
        {
            a = d1;
            b = d2;
        } else
        {
            a = d2;
            b = d1;
        }
        if (d3 < d4)
        {
            c = d3;
            d = d4;
            return;
        } else
        {
            c = d4;
            d = d3;
            return;
        }
    }

    public static boolean a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2)
    {
        double d2 = coordinate2.x;
        double d1;
        if (coordinate.x < coordinate1.x)
        {
            d1 = coordinate.x;
        } else
        {
            d1 = coordinate1.x;
        }
        if (d2 >= d1)
        {
            double d3 = coordinate2.x;
            if (coordinate.x > coordinate1.x)
            {
                d1 = coordinate.x;
            } else
            {
                d1 = coordinate1.x;
            }
            if (d3 <= d1)
            {
                double d4 = coordinate2.y;
                if (coordinate.y < coordinate1.y)
                {
                    d1 = coordinate.y;
                } else
                {
                    d1 = coordinate1.y;
                }
                if (d4 >= d1)
                {
                    double d5 = coordinate2.y;
                    if (coordinate.y > coordinate1.y)
                    {
                        d1 = coordinate.y;
                    } else
                    {
                        d1 = coordinate1.y;
                    }
                    if (d5 <= d1)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3)
    {
        double d1;
        double d3;
        double d5;
        double d7;
        d1 = Math.min(coordinate2.x, coordinate3.x);
        d3 = Math.max(coordinate2.x, coordinate3.x);
        d5 = Math.min(coordinate.x, coordinate1.x);
        d7 = Math.max(coordinate.x, coordinate1.x);
        break MISSING_BLOCK_LABEL_52;
        if (d5 <= d3 && d7 >= d1)
        {
            double d2 = Math.min(coordinate2.y, coordinate3.y);
            double d4 = Math.max(coordinate2.y, coordinate3.y);
            double d6 = Math.min(coordinate.y, coordinate1.y);
            double d8 = Math.max(coordinate.y, coordinate1.y);
            if (d6 <= d4 && d8 >= d2)
            {
                return true;
            }
        }
        return false;
    }

    public final void a(double d1, double d2)
    {
        if (a())
        {
            a = d1;
            b = d1;
            c = d2;
            d = d2;
        } else
        {
            if (d1 < a)
            {
                a = d1;
            }
            if (d1 > b)
            {
                b = d1;
            }
            if (d2 < c)
            {
                c = d2;
            }
            if (d2 > d)
            {
                d = d2;
                return;
            }
        }
    }

    public final void a(Coordinate coordinate)
    {
        a(coordinate.x, coordinate.y);
    }

    public final void a(Coordinate coordinate, Coordinate coordinate1)
    {
        a(coordinate.x, coordinate1.x, coordinate.y, coordinate1.y);
    }

    public final void a(h h1)
    {
        if (!h1.a())
        {
            if (a())
            {
                a = h1.a;
                b = h1.b;
                c = h1.c;
                d = h1.d;
                return;
            }
            if (h1.a < a)
            {
                a = h1.a;
            }
            if (h1.b > b)
            {
                b = h1.b;
            }
            if (h1.c < c)
            {
                c = h1.c;
            }
            if (h1.d > d)
            {
                d = h1.d;
                return;
            }
        }
    }

    public final boolean a()
    {
        return b < a;
    }

    public final double b()
    {
        if (a())
        {
            return 0.0D;
        } else
        {
            return b - a;
        }
    }

    public final h b(h h1)
    {
        if (a() || h1.a() || !c(h1))
        {
            return new h();
        }
        double d1;
        double d2;
        double d3;
        double d4;
        if (a > h1.a)
        {
            d1 = a;
        } else
        {
            d1 = h1.a;
        }
        if (c > h1.c)
        {
            d2 = c;
        } else
        {
            d2 = h1.c;
        }
        if (b < h1.b)
        {
            d3 = b;
        } else
        {
            d3 = h1.b;
        }
        if (d < h1.d)
        {
            d4 = d;
        } else
        {
            d4 = h1.d;
        }
        return new h(d1, d3, d2, d4);
    }

    public final boolean b(Coordinate coordinate)
    {
        double d1 = coordinate.x;
        double d2 = coordinate.y;
        return !a() && d1 <= b && d1 >= a && d2 <= d && d2 >= c;
    }

    public final double c()
    {
        if (a())
        {
            return 0.0D;
        } else
        {
            return d - c;
        }
    }

    public final boolean c(Coordinate coordinate)
    {
        double d1 = coordinate.x;
        double d2 = coordinate.y;
        return !a() && d1 >= a && d1 <= b && d2 >= c && d2 <= d;
    }

    public final boolean c(h h1)
    {
        while (a() || h1.a() || h1.a > b || h1.b < a || h1.c > d || h1.d < c) 
        {
            return false;
        }
        return true;
    }

    public final double d()
    {
        return a;
    }

    public final boolean d(h h1)
    {
        return e(h1);
    }

    public final double e()
    {
        return b;
    }

    public final boolean e(h h1)
    {
        while (a() || h1.a() || h1.a < a || h1.b > b || h1.c < c || h1.d > d) 
        {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof h)
        {
            obj = (h)obj;
            if (a())
            {
                return ((h) (obj)).a();
            }
            if (b == ((h) (obj)).b && d == ((h) (obj)).d && a == ((h) (obj)).a && c == ((h) (obj)).c)
            {
                return true;
            }
        }
        return false;
    }

    public final double f()
    {
        return c;
    }

    public final double f(h h1)
    {
        if (c(h1))
        {
            return 0.0D;
        }
        double d1;
        double d2;
        if (b < h1.a)
        {
            d1 = h1.a - b;
        } else
        if (a > h1.b)
        {
            d1 = a - h1.b;
        } else
        {
            d1 = 0.0D;
        }
        if (d < h1.c)
        {
            d2 = h1.c - d;
        } else
        if (c > h1.d)
        {
            d2 = c - h1.d;
        } else
        {
            d2 = 0.0D;
        }
        if (d1 == 0.0D)
        {
            return d2;
        }
        if (d2 == 0.0D)
        {
            return d1;
        } else
        {
            return Math.sqrt(d1 * d1 + d2 * d2);
        }
    }

    public final double g()
    {
        return d;
    }

    public final int hashCode()
    {
        return (((Coordinate.hashCode(a) + 629) * 37 + Coordinate.hashCode(b)) * 37 + Coordinate.hashCode(c)) * 37 + Coordinate.hashCode(d);
    }

    public final String toString()
    {
        return (new StringBuilder("Env[")).append(a).append(" : ").append(b).append(", ").append(c).append(" : ").append(d).append("]").toString();
    }
}
