// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import java.util.ArrayList;

// Referenced classes of package com.vividsolutions.jts.geom:
//            j, t, GeometryFactory, Polygon, 
//            i, n

public class s extends j
    implements t
{

    private static final long serialVersionUID = 0xf85a55ec96e8e67dL;

    public s(Polygon apolygon[], GeometryFactory geometryfactory)
    {
        super(apolygon, geometryfactory);
    }

    public boolean equalsExact(i k, double d)
    {
        if (!isEquivalentClass(k))
        {
            return false;
        } else
        {
            return super.equalsExact(k, d);
        }
    }

    public i getBoundary()
    {
        if (isEmpty())
        {
            return getFactory().createMultiLineString(null);
        }
        ArrayList arraylist = new ArrayList();
        for (int l = 0; l < a.length; l++)
        {
            i k = ((Polygon)a[l]).getBoundary();
            for (int i1 = 0; i1 < k.getNumGeometries(); i1++)
            {
                arraylist.add(k.getGeometryN(i1));
            }

        }

        n an[] = new n[arraylist.size()];
        return getFactory().createMultiLineString((n[])arraylist.toArray(an));
    }

    public int getBoundaryDimension()
    {
        return 1;
    }

    public int getDimension()
    {
        return 2;
    }

    public String getGeometryType()
    {
        return "MultiPolygon";
    }

    public i reverse()
    {
        Polygon apolygon[] = new Polygon[a.length];
        for (int k = 0; k < a.length; k++)
        {
            apolygon[k] = (Polygon)a[k].reverse();
        }

        return getFactory().createMultiPolygon(apolygon);
    }
}
