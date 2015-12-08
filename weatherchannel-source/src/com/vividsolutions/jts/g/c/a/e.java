// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.c.g;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.f;

// Referenced classes of package com.vividsolutions.jts.g.c.a:
//            b

final class e extends g
{

    private double b;
    private Coordinate c[];
    private boolean d;

    e(double d1, Coordinate acoordinate[])
    {
        d = false;
        b = d1;
        c = acoordinate;
    }

    protected final d a(d d1)
    {
        Coordinate acoordinate[] = d1.c();
        d1 = c;
        b b1 = new b(acoordinate, b);
        b1.a(false);
        d1 = b1.a(d1);
        return a.getCoordinateSequenceFactory().a(d1);
    }
}
