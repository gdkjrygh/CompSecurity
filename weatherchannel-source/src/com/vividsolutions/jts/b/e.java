// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.a.b;
import com.vividsolutions.jts.geom.Coordinate;

// Referenced classes of package com.vividsolutions.jts.b:
//            d, n, o

public class e
    implements Comparable
{

    protected d a;
    protected n b;
    private o c;
    private Coordinate d;
    private Coordinate e;
    private double f;
    private double g;
    private int h;

    protected e(d d1)
    {
        a = d1;
    }

    public e(d d1, Coordinate coordinate, Coordinate coordinate1, n n1)
    {
        this(d1);
        a(coordinate, coordinate1);
        b = n1;
    }

    public d a()
    {
        return a;
    }

    public void a(b b1)
    {
    }

    public final void a(o o1)
    {
        c = o1;
    }

    protected final void a(Coordinate coordinate, Coordinate coordinate1)
    {
        boolean flag = false;
        d = coordinate;
        e = coordinate1;
        f = coordinate1.x - coordinate.x;
        g = coordinate1.y - coordinate.y;
        double d1 = f;
        double d2 = g;
        if (d1 == 0.0D && d2 == 0.0D)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot compute the quadrant for point ( ")).append(d1).append(", ").append(d2).append(" )").toString());
        }
        int i;
        if (d1 >= 0.0D)
        {
            if (d2 >= 0.0D)
            {
                i = 0;
            } else
            {
                i = 3;
            }
        } else
        if (d2 >= 0.0D)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        h = i;
        if (f != 0.0D || g != 0.0D)
        {
            flag = true;
        }
        com.vividsolutions.jts.a.a.a(flag, "EdgeEnd with identical endpoints found");
    }

    public int compareTo(Object obj)
    {
        obj = (e)obj;
        if (f == ((e) (obj)).f && g == ((e) (obj)).g)
        {
            return 0;
        }
        if (h > ((e) (obj)).h)
        {
            return 1;
        }
        if (h < ((e) (obj)).h)
        {
            return -1;
        } else
        {
            return com.vividsolutions.jts.a.a.a(((e) (obj)).d, ((e) (obj)).e, e);
        }
    }

    public n l()
    {
        return b;
    }

    public final Coordinate m()
    {
        return d;
    }

    public final Coordinate n()
    {
        return e;
    }

    public final int o()
    {
        return h;
    }

    public final double p()
    {
        return g;
    }

    public final o q()
    {
        return c;
    }

    public String toString()
    {
        double d1 = Math.atan2(g, f);
        String s = getClass().getName();
        s = s.substring(s.lastIndexOf('.') + 1);
        return (new StringBuilder("  ")).append(s).append(": ").append(d).append(" - ").append(e).append(" ").append(h).append(":").append(d1).append("   ").append(b).toString();
    }
}
