// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.geom.Coordinate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.vividsolutions.jts.b:
//            o, p, e

public final class q
{

    Map a;
    private p b;

    public q(p p1)
    {
        a = new TreeMap();
        b = p1;
    }

    public final o a(Coordinate coordinate)
    {
        o o2 = (o)a.get(coordinate);
        o o1 = o2;
        if (o2 == null)
        {
            o1 = b.a(coordinate);
            a.put(coordinate, o1);
        }
        return o1;
    }

    public final Iterator a()
    {
        return a.values().iterator();
    }

    public final void a(e e1)
    {
        a(e1.m()).a(e1);
    }
}
