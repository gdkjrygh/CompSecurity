// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.b;

import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.l;
import com.vividsolutions.jts.geom.n;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.b:
//            c

public final class a
    implements l
{

    private List a;

    a(List list)
    {
        a = list;
    }

    public final void a(i j)
    {
        if ((j instanceof Point) || (j instanceof n) || (j instanceof Polygon))
        {
            a.add(new c(j, 0, j.getCoordinate()));
        }
    }
}
