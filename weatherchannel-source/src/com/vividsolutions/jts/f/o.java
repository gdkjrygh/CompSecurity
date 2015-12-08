// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;

// Referenced classes of package com.vividsolutions.jts.f:
//            i

public final class o
    implements Comparable
{

    public final Coordinate a;
    public final int b;
    private final int c;
    private final boolean d;

    public o(i j, Coordinate coordinate, int k, int l)
    {
        a = new Coordinate(coordinate);
        b = k;
        c = l;
        boolean flag;
        if (!coordinate.equals2D(j.a(k)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    public final boolean a()
    {
        return d;
    }

    public final int compareTo(Object obj)
    {
        obj = (o)obj;
        if (b < ((o) (obj)).b)
        {
            return -1;
        }
        if (b > ((o) (obj)).b)
        {
            return 1;
        }
        if (a.equals2D(((o) (obj)).a))
        {
            return 0;
        } else
        {
            return com.vividsolutions.jts.a.a.a(c, a, ((o) (obj)).a);
        }
    }
}
