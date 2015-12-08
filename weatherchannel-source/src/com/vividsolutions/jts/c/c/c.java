// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.c;

import com.vividsolutions.jts.c.a;
import com.vividsolutions.jts.d.i;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.Comparator;

public abstract class c
{
    public static final class a
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (c)obj;
            obj1 = (c)obj1;
            double d = (((c) (obj)).a + ((c) (obj)).b) / 2D;
            double d1 = (((c) (obj1)).a + ((c) (obj1)).b) / 2D;
            if (d < d1)
            {
                return -1;
            }
            return d <= d1 ? 0 : 1;
        }

        public a()
        {
        }
    }


    protected double a;
    protected double b;

    public c()
    {
        a = (1.0D / 0.0D);
        b = (-1.0D / 0.0D);
    }

    public abstract void a(double d, double d1, com.vividsolutions.jts.c.a a1);

    protected final boolean a(double d, double d1)
    {
        return a <= d1 && b >= d;
    }

    public String toString()
    {
        return i.a(new Coordinate(a, 0.0D), new Coordinate(b, 0.0D));
    }
}
