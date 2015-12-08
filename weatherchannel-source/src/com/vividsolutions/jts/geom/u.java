// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.vividsolutions.jts.geom:
//            Coordinate

public final class u
    implements Serializable, Comparable
{
    public static final class a
        implements Serializable
    {

        private static Map a = new HashMap();
        private static final long serialVersionUID = 0xb3467532bf594d42L;
        private String b;

        private Object readResolve()
        {
            return a.get(b);
        }

        public final String toString()
        {
            return b;
        }


        public a(String s)
        {
            b = s;
            a.put(s, this);
        }
    }


    public static final a a = new a("FIXED");
    public static final a b = new a("FLOATING");
    public static final a c = new a("FLOATING SINGLE");
    private static final long serialVersionUID = 0x6bee6404e9a25c3bL;
    private a d;
    private double e;

    public u()
    {
        d = b;
    }

    public u(double d1)
    {
        d = a;
        b(d1);
    }

    public u(a a1)
    {
        d = a1;
        if (a1 == a)
        {
            b(1.0D);
        }
    }

    private void b(double d1)
    {
        e = Math.abs(d1);
    }

    public final double a(double d1)
    {
        if (!Double.isNaN(d1))
        {
            if (d == c)
            {
                return (double)(float)d1;
            }
            if (d == a)
            {
                return (double)Math.round(e * d1) / e;
            }
        }
        return d1;
    }

    public final int a()
    {
        if (d != b)
        {
            if (d == c)
            {
                return 6;
            }
            if (d == a)
            {
                return (int)Math.ceil(Math.log(e) / Math.log(10D)) + 1;
            }
        }
        return 16;
    }

    public final void a(Coordinate coordinate)
    {
        if (d == b)
        {
            return;
        } else
        {
            coordinate.x = a(coordinate.x);
            coordinate.y = a(coordinate.y);
            return;
        }
    }

    public final double b()
    {
        return e;
    }

    public final a c()
    {
        return d;
    }

    public final int compareTo(Object obj)
    {
        obj = (u)obj;
        int i = a();
        int j = ((u) (obj)).a();
        return (new Integer(i)).compareTo(new Integer(j));
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof u)
        {
            if (d == ((u) (obj = (u)obj)).d && e == ((u) (obj)).e)
            {
                return true;
            }
        }
        return false;
    }

    public final String toString()
    {
        String s = "UNKNOWN";
        if (d == b)
        {
            s = "Floating";
        } else
        {
            if (d == c)
            {
                return "Floating-Single";
            }
            if (d == a)
            {
                return (new StringBuilder("Fixed (Scale=")).append(e).append(")").toString();
            }
        }
        return s;
    }

}
