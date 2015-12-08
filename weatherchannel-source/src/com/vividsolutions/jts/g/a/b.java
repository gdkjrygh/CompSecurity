// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.c;

public final class b
{

    private Coordinate a[];
    private double b;
    private byte c[];
    private int d;

    private b(Coordinate acoordinate[])
    {
        d = 1;
        a = acoordinate;
    }

    private int a(int i)
    {
        for (i++; i < a.length && c[i] == 1; i++) { }
        return i;
    }

    private static boolean a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, double d1)
    {
        return com.vividsolutions.jts.a.a.b(coordinate1, coordinate, coordinate2) < d1;
    }

    public static Coordinate[] a(Coordinate acoordinate[], double d1)
    {
        acoordinate = new b(acoordinate);
        acoordinate.b = Math.abs(d1);
        if (d1 < 0.0D)
        {
            acoordinate.d = -1;
        }
        acoordinate.c = new byte[((b) (acoordinate)).a.length];
_L7:
        int i;
        int j;
        int k;
        boolean flag;
        i = 1;
        Coordinate acoordinate1[] = ((b) (acoordinate)).a;
        k = acoordinate.a(1);
        j = acoordinate.a(k);
        flag = false;
_L3:
        Object obj;
        Coordinate coordinate;
        Coordinate coordinate1;
        if (j >= ((b) (acoordinate)).a.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        d1 = ((b) (acoordinate)).b;
        obj = ((b) (acoordinate)).a[i];
        coordinate = ((b) (acoordinate)).a[k];
        coordinate1 = ((b) (acoordinate)).a[j];
        boolean flag1;
        if (com.vividsolutions.jts.a.a.a(((Coordinate) (obj)), coordinate, coordinate1) == ((b) (acoordinate)).d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        int l;
        int i1;
        int j1;
        if (i != 0)
        {
            ((b) (acoordinate)).c[k] = 1;
            flag = true;
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = j;
        } else
        {
            i = k;
        }
        k = acoordinate.a(i);
        j = acoordinate.a(k);
        if (true) goto _L3; else goto _L2
_L2:
label0:
        {
            if (a(((Coordinate) (obj)), coordinate, coordinate1, d1))
            {
                break label0;
            }
            i = 0;
        }
          goto _L4
        j1 = (j - i) / 10;
        i1 = i;
        l = j1;
        if (j1 <= 0)
        {
            l = 1;
            i1 = i;
        }
_L5:
label1:
        {
            if (i1 >= j)
            {
                break MISSING_BLOCK_LABEL_273;
            }
            if (a(((Coordinate) (obj)), coordinate, ((b) (acoordinate)).a[i1], d1))
            {
                break label1;
            }
            i = 0;
        }
          goto _L4
        i1 += l;
          goto _L5
        i = 1;
          goto _L4
        if (flag) goto _L7; else goto _L6
_L6:
        obj = new c();
        for (i = 0; i < ((b) (acoordinate)).a.length; i++)
        {
            if (((b) (acoordinate)).c[i] != 1)
            {
                ((c) (obj)).add(((b) (acoordinate)).a[i]);
            }
        }

        return ((c) (obj)).a();
    }
}
