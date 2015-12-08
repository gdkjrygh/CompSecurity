// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.d.i;
import com.vividsolutions.jts.geom.Coordinate;

// Referenced classes of package com.vividsolutions.jts.f:
//            r

public final class a
    implements r
{

    private Coordinate a[];
    private Object b;

    public a(Coordinate acoordinate[], Object obj)
    {
        a = acoordinate;
        b = obj;
    }

    public final Object a()
    {
        return b;
    }

    public final int b()
    {
        return a.length;
    }

    public final Coordinate[] c()
    {
        return a;
    }

    public final boolean d()
    {
        return a[0].equals(a[a.length - 1]);
    }

    public final String toString()
    {
        return i.a(new com.vividsolutions.jts.geom.a.a(a));
    }
}
