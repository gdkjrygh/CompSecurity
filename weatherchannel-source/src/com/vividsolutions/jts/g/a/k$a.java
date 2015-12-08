// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.m;

// Referenced classes of package com.vividsolutions.jts.g.a:
//            k

final class b
    implements Comparable
{

    private m a;
    private int b;

    static int a(b b1)
    {
        return b1.b;
    }

    public final int compareTo(Object obj)
    {
        Object obj1 = (b)obj;
        int j = a.a((() (obj1)).a);
        int i = j;
        if (j == 0)
        {
            i = ((a) (obj1)).a.a(a) * -1;
        }
        if (i == 0)
        {
            obj = a;
            obj1 = ((a) (obj1)).a;
            int l = ((m) (obj)).a.compareTo(((m) (obj1)).a);
            i = l;
            if (l == 0)
            {
                return ((m) (obj)).b.compareTo(((m) (obj1)).b);
            }
        }
        return i;
    }

    public rdinate(k k1, m m1, int i)
    {
        a = new m(m1);
        b = i;
    }
}
