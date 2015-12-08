// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;

// Referenced classes of package com.vividsolutions.jts.geom.c:
//            d

public static abstract class ryFactory
{

    public abstract d a(d d1);

    public i a(i i, GeometryFactory geometryfactory)
    {
        Object obj;
        if (i instanceof p)
        {
            obj = geometryfactory.createLinearRing(a(((p)i).a()));
        } else
        {
            if (i instanceof n)
            {
                return geometryfactory.createLineString(a(((n)i).a()));
            }
            obj = i;
            if (i instanceof Point)
            {
                return geometryfactory.createPoint(a(((Point)i).getCoordinateSequence()));
            }
        }
        return ((i) (obj));
    }

    public ryFactory()
    {
    }
}
