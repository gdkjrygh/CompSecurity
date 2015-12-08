// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.geom.Coordinate;

public final class g
    implements Comparable
{

    public Coordinate a;
    public int b;
    public double c;

    public g(Coordinate coordinate, int i, double d)
    {
        a = new Coordinate(coordinate);
        b = i;
        c = d;
    }

    public final int compareTo(Object obj)
    {
        obj = (g)obj;
        int i = ((g) (obj)).b;
        double d = ((g) (obj)).c;
        if (b >= i)
        {
            if (b > i)
            {
                return 1;
            }
            if (c >= d)
            {
                return c <= d ? 0 : 1;
            }
        }
        return -1;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(" seg # = ").append(b).append(" dist = ").append(c).toString();
    }
}
