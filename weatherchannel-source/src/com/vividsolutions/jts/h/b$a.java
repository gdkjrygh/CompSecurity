// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.h;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.b;

// Referenced classes of package com.vividsolutions.jts.h:
//            b, a

final class nit>
    implements b
{

    private a a;
    private a b;

    public final Coordinate a()
    {
        return new Coordinate(a.a(), b.a());
    }

    public final void a(Coordinate coordinate)
    {
        a.a(coordinate.x);
        b.a(coordinate.y);
    }

    oordinate(com.vividsolutions.jts.h.b b1)
    {
        a = new a();
        b = new a();
    }
}
