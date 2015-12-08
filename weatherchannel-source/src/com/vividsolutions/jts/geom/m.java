// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.c;
import java.io.Serializable;

// Referenced classes of package com.vividsolutions.jts.geom:
//            Coordinate

public final class m
    implements Serializable, Comparable
{

    private static final long serialVersionUID = 0x2d2172135f411b63L;
    public Coordinate a;
    public Coordinate b;

    public m()
    {
        this(new Coordinate(), new Coordinate());
    }

    public m(Coordinate coordinate, Coordinate coordinate1)
    {
        a = coordinate;
        b = coordinate1;
    }

    public m(m m1)
    {
        this(m1.a, m1.b);
    }

    private double b(Coordinate coordinate)
    {
        if (coordinate.equals(a))
        {
            return 0.0D;
        }
        if (coordinate.equals(b))
        {
            return 1.0D;
        }
        double d = b.x - a.x;
        double d1 = b.y - a.y;
        double d2 = d * d + d1 * d1;
        if (d2 <= 0.0D)
        {
            return (0.0D / 0.0D);
        } else
        {
            return ((coordinate.x - a.x) * d + (coordinate.y - a.y) * d1) / d2;
        }
    }

    public final int a(m m1)
    {
        int i = c.a(a, b, m1.a);
        int j = c.a(a, b, m1.b);
        if (i >= 0 && j >= 0)
        {
            return Math.max(i, j);
        }
        if (i <= 0 && j <= 0)
        {
            return Math.max(i, j);
        } else
        {
            return 0;
        }
    }

    public final Coordinate a(double d, double d1)
    {
        double d3 = a.x;
        double d4 = b.x;
        double d5 = a.x;
        double d6 = a.y;
        double d7 = b.y;
        double d8 = a.y;
        double d11 = b.x - a.x;
        double d9 = b.y - a.y;
        double d10 = Math.sqrt(d11 * d11 + d9 * d9);
        double d2 = 0.0D;
        d = 0.0D;
        if (d1 != 0.0D)
        {
            if (d10 <= 0.0D)
            {
                throw new IllegalStateException("Cannot compute offset from zero-length line segment");
            }
            d2 = (d1 * d11) / d10;
            d = (d1 * d9) / d10;
        }
        return new Coordinate((d3 + 1.0D * (d4 - d5)) - d, d2 + (d6 + 1.0D * (d7 - d8)));
    }

    public final Coordinate a(int i)
    {
        if (i == 0)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public final Coordinate a(Coordinate coordinate)
    {
        double d = b(coordinate);
        if (d > 0.0D && d < 1.0D)
        {
            if (coordinate.equals(a) || coordinate.equals(b))
            {
                return new Coordinate(coordinate);
            } else
            {
                double d1 = b(coordinate);
                coordinate = new Coordinate();
                coordinate.x = a.x + (b.x - a.x) * d1;
                double d2 = a.y;
                coordinate.y = d1 * (b.y - a.y) + d2;
                return coordinate;
            }
        }
        if (a.distance(coordinate) < b.distance(coordinate))
        {
            return a;
        } else
        {
            return b;
        }
    }

    public final void a(Coordinate coordinate, Coordinate coordinate1)
    {
        a.x = coordinate.x;
        a.y = coordinate.y;
        b.x = coordinate1.x;
        b.y = coordinate1.y;
    }

    public final int compareTo(Object obj)
    {
        obj = (m)obj;
        int i = a.compareTo(((m) (obj)).a);
        if (i != 0)
        {
            return i;
        } else
        {
            return b.compareTo(((m) (obj)).b);
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof m)
        {
            if (a.equals(((m) (obj = (m)obj)).a) && b.equals(((m) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        long l = Double.doubleToLongBits(a.x) ^ Double.doubleToLongBits(a.y) * 31L;
        int i = (int)l;
        int j = (int)(l >> 32);
        l = Double.doubleToLongBits(b.x) ^ Double.doubleToLongBits(b.y) * 31L;
        return j ^ i ^ ((int)l ^ (int)(l >> 32));
    }

    public final String toString()
    {
        return (new StringBuilder("LINESTRING( ")).append(a.x).append(" ").append(a.y).append(", ").append(b.x).append(" ").append(b.y).append(")").toString();
    }
}
