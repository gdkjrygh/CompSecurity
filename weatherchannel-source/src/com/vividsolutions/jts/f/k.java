// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.a;

public final class k
    implements Comparable
{

    private Coordinate a[];
    private boolean b;

    public k(Coordinate acoordinate[])
    {
        boolean flag = true;
        super();
        a = acoordinate;
        if (com.vividsolutions.jts.geom.a.a(acoordinate) != 1)
        {
            flag = false;
        }
        b = flag;
    }

    public final int compareTo(Object obj)
    {
        obj = (k)obj;
        Coordinate acoordinate[] = a;
        boolean flag2 = b;
        Coordinate acoordinate1[] = ((k) (obj)).a;
        boolean flag3 = ((k) (obj)).b;
        int i;
        int j;
        byte byte0;
        byte byte1;
        int l;
        int i1;
        if (flag2)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (flag3)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        if (flag2)
        {
            l = acoordinate.length;
        } else
        {
            l = -1;
        }
        if (flag3)
        {
            i1 = acoordinate1.length;
        } else
        {
            i1 = -1;
        }
        if (flag2)
        {
            j = 0;
        } else
        {
            j = acoordinate.length - 1;
        }
        if (flag3)
        {
            i = 0;
        } else
        {
            i = acoordinate1.length - 1;
        }
        boolean flag1;
        do
        {
            boolean flag;
            int k1;
            int l1;
            do
            {
                int j1 = acoordinate[j].compareTo(acoordinate1[i]);
                if (j1 != 0)
                {
                    return j1;
                }
                k1 = j + byte0;
                l1 = i + byte1;
                if (k1 == l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (l1 == i1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag && !flag1)
                {
                    return -1;
                }
                if (!flag && flag1)
                {
                    return 1;
                }
                i = l1;
                j = k1;
            } while (!flag);
            i = l1;
            j = k1;
        } while (!flag1);
        return 0;
    }
}
