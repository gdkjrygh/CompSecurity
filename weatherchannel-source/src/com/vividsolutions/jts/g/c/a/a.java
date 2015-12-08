// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.u;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.vividsolutions.jts.g.c.a:
//            e

public final class a
{

    private i a;

    private a(i j)
    {
        a = j;
    }

    public static double a(i j)
    {
        h h1 = j.getEnvelopeInternal();
        double d = 1.0000000000000001E-09D * Math.min(h1.c(), h1.b());
        j = j.getPrecisionModel();
        if (j.c() == u.a)
        {
            double d1 = ((1.0D / j.b()) * 2D) / 1.415D;
            if (d1 > d)
            {
                return d1;
            }
        }
        return d;
    }

    private i a(i j, double d)
    {
        TreeSet treeset = new TreeSet();
        j = j.getCoordinates();
        for (int k = 0; k < j.length; k++)
        {
            treeset.add(j[k]);
        }

        return (new e(d, (Coordinate[])treeset.toArray(new Coordinate[0]))).a(a);
    }

    public static i[] a(i j, i k, double d)
    {
        i ai[] = new i[2];
        ai[0] = (new a(j)).a(k, d);
        ai[1] = (new a(k)).a(ai[0], d);
        return ai;
    }
}
