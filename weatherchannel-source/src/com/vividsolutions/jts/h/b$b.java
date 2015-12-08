// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.h;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.b;

// Referenced classes of package com.vividsolutions.jts.h:
//            b

final class a
    implements b
{

    private Coordinate a;

    public final void a(Coordinate coordinate)
    {
        coordinate.x = coordinate.x + a.x;
        coordinate.y = coordinate.y + a.y;
    }

    public oordinate(com.vividsolutions.jts.h.b b1, Coordinate coordinate)
    {
        a = null;
        a = coordinate;
    }
}
