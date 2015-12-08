// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;

public final class h
{

    private GeometryFactory a;
    private Coordinate b;
    private double c;

    public h(i k)
    {
        b = null;
        c = 0.0D;
        a = k.getFactory();
        a(k);
    }

    private void a(i k)
    {
        int i1 = 1;
        if (k instanceof Polygon)
        {
            com.vividsolutions.jts.geom.h h1 = k.getEnvelopeInternal();
            double d = (h1.f() + h1.g()) / 2D;
            k = a.createLineString(new Coordinate[] {
                new Coordinate(h1.d(), d), new Coordinate(h1.e(), d)
            }).intersection(k);
            if (k instanceof j)
            {
                j j1 = (j)k;
                k = j1;
                if (!j1.isEmpty())
                {
                    k = j1.getGeometryN(0);
                    while (i1 < j1.getNumGeometries()) 
                    {
                        i l = k;
                        if (j1.getGeometryN(i1).getEnvelopeInternal().b() > k.getEnvelopeInternal().b())
                        {
                            l = j1.getGeometryN(i1);
                        }
                        i1++;
                        k = l;
                    }
                }
            }
            d = k.getEnvelopeInternal().b();
            if (b == null || d > c)
            {
                k = k.getEnvelopeInternal();
                b = new Coordinate((k.d() + k.e()) / 2D, (k.f() + k.g()) / 2D);
                c = d;
            }
        } else
        if (k instanceof j)
        {
            k = (j)k;
            int k1 = 0;
            while (k1 < k.getNumGeometries()) 
            {
                a(k.getGeometryN(k1));
                k1++;
            }
        }
    }

    public final Coordinate a()
    {
        return b;
    }
}
