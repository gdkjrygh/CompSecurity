// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.u;
import java.util.ArrayList;

final class i
{

    private static final Coordinate a[] = new Coordinate[0];
    private ArrayList b;
    private u c;
    private double d;

    public i()
    {
        c = null;
        d = 0.0D;
        b = new ArrayList();
    }

    public final void a()
    {
        if (b.size() > 0)
        {
            Coordinate coordinate = new Coordinate((Coordinate)b.get(0));
            Coordinate coordinate1 = (Coordinate)b.get(b.size() - 1);
            if (b.size() >= 2)
            {
                b.get(b.size() - 2);
            }
            if (!coordinate.equals(coordinate1))
            {
                b.add(coordinate);
                return;
            }
        }
    }

    public final void a(double d1)
    {
        d = d1;
    }

    public final void a(Coordinate coordinate)
    {
        coordinate = new Coordinate(coordinate);
        c.a(coordinate);
        break MISSING_BLOCK_LABEL_17;
        boolean flag;
        if (b.size() <= 0 || coordinate.distance((Coordinate)b.get(b.size() - 1)) >= d)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            return;
        } else
        {
            b.add(coordinate);
            return;
        }
    }

    public final void a(u u1)
    {
        c = u1;
    }

    public final Coordinate[] b()
    {
        return (Coordinate[])b.toArray(a);
    }

    public final String toString()
    {
        return (new GeometryFactory()).createLineString(b()).toString();
    }

}
