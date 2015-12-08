// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.b.b;
import com.vividsolutions.jts.b.c;
import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.o;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.Iterator;
import java.util.List;

public final class j
{

    private int a;
    private Coordinate b;
    private b c;
    private b d;

    public j()
    {
        a = -1;
        b = null;
        c = null;
        d = null;
    }

    private static int a(b b1, int i)
    {
        byte byte1 = -1;
        b1 = b1.a().b();
        byte byte0 = byte1;
        if (i >= 0)
        {
            if (i + 1 >= b1.length)
            {
                byte0 = byte1;
            } else
            {
                byte0 = byte1;
                if (((Coordinate) (b1[i])).y != ((Coordinate) (b1[i + 1])).y)
                {
                    byte0 = 1;
                    if (((Coordinate) (b1[i])).y < ((Coordinate) (b1[i + 1])).y)
                    {
                        return 2;
                    }
                }
            }
        }
        return byte0;
    }

    private void a(b b1)
    {
        Coordinate acoordinate[] = b1.a().b();
        for (int i = 0; i < acoordinate.length - 1; i++)
        {
            if (b == null || acoordinate[i].x > b.x)
            {
                c = b1;
                a = i;
                b = acoordinate[i];
            }
        }

    }

    public final b a()
    {
        return d;
    }

    public final void a(List list)
    {
        Object obj;
        int i;
        int l;
        l = 0;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            b b1 = (b)list.next();
            if (b1.g())
            {
                a(b1);
            }
        } while (true);
        int i1;
        boolean flag;
        if (a != 0 || b.equals(c.m()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, "inconsistency in rightmost processing");
        if (a != 0)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        obj = ((c)c.q().b()).g();
        i = ((List) (obj)).size();
        if (i > 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        c = list;
        if (!c.g())
        {
            c = c.f();
            a = c.a().b().length - 1;
        }
_L7:
        d = c;
        list = c;
        i1 = a;
        l = a(((b) (list)), i1);
        i = l;
        if (l < 0)
        {
            i = a(((b) (list)), i1 - 1);
        }
        if (i < 0)
        {
            b = null;
            a(((b) (list)));
        }
        if (i == 1)
        {
            d = c.f();
        }
        return;
_L2:
        b b2;
        b2 = (b)((List) (obj)).get(0);
        list = b2;
        if (i == 1) goto _L4; else goto _L3
_L3:
        obj = (b)((List) (obj)).get(i - 1);
        i = b2.o();
        l = ((b) (obj)).o();
        if (!com.vividsolutions.jts.a.a.c(i)) goto _L6; else goto _L5
_L5:
        list = b2;
        if (com.vividsolutions.jts.a.a.c(l)) goto _L4; else goto _L6
_L6:
        if (!com.vividsolutions.jts.a.a.c(i) && !com.vividsolutions.jts.a.a.c(l))
        {
            list = ((List) (obj));
        } else
        {
            list = b2;
            if (b2.p() == 0.0D)
            {
                if (((b) (obj)).p() != 0.0D)
                {
                    list = ((List) (obj));
                } else
                {
                    com.vividsolutions.jts.a.a.a("found two horizontal edges incident on node");
                    list = null;
                }
            }
        }
          goto _L4
        Coordinate acoordinate[] = c.a().b();
        Coordinate coordinate;
        int k;
        int j1;
        boolean flag1;
        if (a > 0 && a < acoordinate.length)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.vividsolutions.jts.a.a.a(flag1, "rightmost point expected to be interior vertex of edge");
        list = acoordinate[a - 1];
        coordinate = acoordinate[a + 1];
        j1 = com.vividsolutions.jts.a.a.a(b, coordinate, list);
        if (((Coordinate) (list)).y < b.y && coordinate.y < b.y && j1 == 1)
        {
            k = 1;
        } else
        {
            k = l;
            if (((Coordinate) (list)).y > b.y)
            {
                k = l;
                if (coordinate.y > b.y)
                {
                    k = l;
                    if (j1 == -1)
                    {
                        k = 1;
                    }
                }
            }
        }
        if (k != 0)
        {
            a = a - 1;
        }
          goto _L7
    }

    public final Coordinate b()
    {
        return b;
    }
}
