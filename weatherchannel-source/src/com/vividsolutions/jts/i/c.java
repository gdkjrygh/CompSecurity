// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.i;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.u;

public final class c
{
    public final class a
    {

        public Coordinate a;
        public double b;
        public double c;

        protected a()
        {
        }
    }


    private GeometryFactory a;
    private u b;
    private a c;
    private int d;
    private double e;

    public c()
    {
        this(new GeometryFactory());
    }

    public c(GeometryFactory geometryfactory)
    {
        b = null;
        c = new a();
        d = 100;
        e = 0.0D;
        a = geometryfactory;
        b = geometryfactory.getPrecisionModel();
    }

    public final Polygon a()
    {
        Coordinate acoordinate[] = c;
        double d1;
        double d2;
        double d3;
        double d4;
        int i;
        if (((a) (acoordinate)).a != null)
        {
            acoordinate = new h(((a) (acoordinate)).a.x - ((a) (acoordinate)).b / 2D, ((a) (acoordinate)).a.x + ((a) (acoordinate)).b / 2D, ((a) (acoordinate)).a.y - ((a) (acoordinate)).c / 2D, ((a) (acoordinate)).a.y + ((a) (acoordinate)).c / 2D);
        } else
        {
            acoordinate = new h(0.0D, ((a) (acoordinate)).b, 0.0D, ((a) (acoordinate)).c);
        }
        d1 = acoordinate.b() / 2D;
        d2 = acoordinate.c() / 2D;
        d3 = acoordinate.d();
        d4 = acoordinate.f();
        acoordinate = new Coordinate[d + 1];
        i = 0;
        for (int j = 0; j < d;)
        {
            double d5 = (double)j * (6.2831853071795862D / (double)d);
            Coordinate coordinate = new Coordinate(Math.cos(d5) * d1 + (d3 + d1), Math.sin(d5) * d2 + (d4 + d2));
            b.a(coordinate);
            acoordinate[i] = coordinate;
            j++;
            i++;
        }

        acoordinate[i] = new Coordinate(acoordinate[0]);
        com.vividsolutions.jts.geom.p p = a.createLinearRing(acoordinate);
        return (Polygon)a.createPolygon(p, null);
    }

    public final void a(double d1)
    {
        a a1 = c;
        a1.c = d1;
        a1.b = d1;
    }

    public final void a(int i)
    {
        d = 100;
    }

    public final void a(Coordinate coordinate)
    {
        c.a = coordinate;
    }
}
