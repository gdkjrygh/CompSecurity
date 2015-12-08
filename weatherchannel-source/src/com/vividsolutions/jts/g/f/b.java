// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.f;

import com.vividsolutions.jts.a.o;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.a;
import com.vividsolutions.jts.geom.c.c;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.v;
import java.util.Set;
import java.util.TreeSet;

public final class b
{

    private i a;
    private i b;
    private GeometryFactory c;

    private b(v v, i j)
    {
        a = (i)v;
        b = j;
        c = j.getFactory();
    }

    public static i a(v v, i j)
    {
        j = new b(v, j);
        v = new o();
        TreeSet treeset = new TreeSet();
        for (int k = 0; k < ((b) (j)).a.getNumGeometries(); k++)
        {
            com.vividsolutions.jts.geom.Coordinate coordinate = ((Point)((b) (j)).a.getGeometryN(k)).getCoordinate();
            if (v.b(coordinate, ((b) (j)).b) == 2)
            {
                treeset.add(coordinate);
            }
        }

        if (treeset.size() == 0)
        {
            return ((b) (j)).b;
        }
        v = com.vividsolutions.jts.geom.a.a(treeset);
        if (v.length == 1)
        {
            v = ((b) (j)).c.createPoint(v[0]);
        } else
        {
            v = ((b) (j)).c.createMultiPoint(v);
        }
        return com.vividsolutions.jts.geom.c.c.a(v, ((b) (j)).b);
    }
}
