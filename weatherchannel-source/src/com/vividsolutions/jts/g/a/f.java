// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.u;

// Referenced classes of package com.vividsolutions.jts.g.a:
//            h, d, b

public final class f
{

    private double a;
    private u b;
    private d c;

    public f(u u, d d1)
    {
        a = 0.0D;
        b = u;
        c = d1;
    }

    private h a(double d1)
    {
        return new h(b, c, d1);
    }

    public final d a()
    {
        return c;
    }

    public final Coordinate[] a(Coordinate acoordinate[], double d1)
    {
        a = d1;
        if (d1 >= 0.0D) goto _L2; else goto _L1
_L1:
        acoordinate = c;
_L4:
        return null;
_L2:
        if (d1 == 0.0D) goto _L4; else goto _L3
_L3:
        h h1 = a(Math.abs(d1));
        if (acoordinate.length > 1) goto _L6; else goto _L5
_L5:
        acoordinate = acoordinate[0];
        c.b();
        JVM INSTR tableswitch 1 3: default 76
    //                   1 82
    //                   2 76
    //                   3 91;
           goto _L7 _L8 _L7 _L9
_L7:
        return h1.a();
_L8:
        h1.a(acoordinate);
        continue; /* Loop/switch isn't completed */
_L9:
        h1.b(acoordinate);
        continue; /* Loop/switch isn't completed */
_L6:
        d d2 = c;
        d1 = a / 100D;
        Coordinate acoordinate1[] = com.vividsolutions.jts.g.a.b.a(acoordinate, d1);
        int k = acoordinate1.length - 1;
        h1.a(acoordinate1[0], acoordinate1[1], 1);
        for (int i = 2; i <= k; i++)
        {
            h1.a(acoordinate1[i], true);
        }

        h1.c();
        h1.a(acoordinate1[k - 1], acoordinate1[k]);
        acoordinate = com.vividsolutions.jts.g.a.b.a(acoordinate, -d1);
        int j = acoordinate.length - 1;
        h1.a(acoordinate[j], acoordinate[j - 1], 1);
        for (j -= 2; j >= 0; j--)
        {
            h1.a(acoordinate[j], true);
        }

        h1.c();
        h1.a(acoordinate[1], acoordinate[0]);
        h1.b();
        if (true) goto _L7; else goto _L10
_L10:
    }

    public final Coordinate[] a(Coordinate acoordinate[], int i, double d1)
    {
        int j = 0;
        a = d1;
        if (acoordinate.length <= 2)
        {
            return a(acoordinate, d1);
        }
        if (d1 == 0.0D)
        {
            Coordinate acoordinate1[] = new Coordinate[acoordinate.length];
            for (i = j; i < acoordinate1.length; i++)
            {
                acoordinate1[i] = new Coordinate(acoordinate[i]);
            }

            return acoordinate1;
        }
        h h1 = a(d1);
        double d2 = a / 100D;
        d1 = d2;
        if (i == 2)
        {
            d1 = -d2;
        }
        acoordinate = com.vividsolutions.jts.g.a.b.a(acoordinate, d1);
        j = acoordinate.length - 1;
        h1.a(acoordinate[j - 1], acoordinate[0], i);
        i = 1;
        while (i <= j) 
        {
            boolean flag;
            if (i != 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h1.a(acoordinate[i], flag);
            i++;
        }
        h1.b();
        return h1.a();
    }
}
