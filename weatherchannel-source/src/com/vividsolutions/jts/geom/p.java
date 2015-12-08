// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.a;

// Referenced classes of package com.vividsolutions.jts.geom:
//            n, d, GeometryFactory, i

public class p extends n
{

    private static final long serialVersionUID = 0xc4dd61d9dc98594bL;

    public p(d d1, GeometryFactory geometryfactory)
    {
        super(d1, geometryfactory);
        if (!isEmpty() && !super.d())
        {
            throw new IllegalArgumentException("Points of LinearRing do not form a closed linestring");
        }
        if (a().b() > 0 && a().b() < 4)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid number of points in LinearRing (found ")).append(a().b()).append(" - must be 0 or >= 4)").toString());
        } else
        {
            return;
        }
    }

    public final boolean d()
    {
        if (isEmpty())
        {
            return true;
        } else
        {
            return super.d();
        }
    }

    public int getBoundaryDimension()
    {
        return -1;
    }

    public String getGeometryType()
    {
        return "LinearRing";
    }

    public i reverse()
    {
        d d1 = (d)a.clone();
        a.b(d1);
        return getFactory().createLinearRing(d1);
    }
}
