// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.e;

import com.vividsolutions.jts.b.f;
import com.vividsolutions.jts.b.n;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.IntersectionMatrix;
import java.util.Iterator;

// Referenced classes of package com.vividsolutions.jts.g.e:
//            c, b

public final class e extends o
{

    public e(Coordinate coordinate, f f)
    {
        super(coordinate, f);
    }

    protected final void a(IntersectionMatrix intersectionmatrix)
    {
        intersectionmatrix.setAtLeastIfValid(c.a(0), c.a(1), 0);
    }

    final void c(IntersectionMatrix intersectionmatrix)
    {
        for (Iterator iterator = ((c)a).f(); iterator.hasNext(); ((b)iterator.next()).a(intersectionmatrix)) { }
    }
}
