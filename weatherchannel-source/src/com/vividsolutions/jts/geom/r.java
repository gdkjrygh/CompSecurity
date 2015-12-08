// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;


// Referenced classes of package com.vividsolutions.jts.geom:
//            j, v, GeometryFactory, Point, 
//            i

public class r extends j
    implements v
{

    private static final long serialVersionUID = 0x904e12be9d1f05c7L;

    public r(Point apoint[], GeometryFactory geometryfactory)
    {
        super(apoint, geometryfactory);
    }

    public boolean equalsExact(i i, double d)
    {
        if (!isEquivalentClass(i))
        {
            return false;
        } else
        {
            return super.equalsExact(i, d);
        }
    }

    public i getBoundary()
    {
        return getFactory().createGeometryCollection(null);
    }

    public int getBoundaryDimension()
    {
        return -1;
    }

    public int getDimension()
    {
        return 0;
    }

    public String getGeometryType()
    {
        return "MultiPoint";
    }

    public boolean isValid()
    {
        return true;
    }
}
