// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.u;

// Referenced classes of package com.vividsolutions.jts.a:
//            k, m, a, c

public final class r extends k
{

    public r()
    {
    }

    private static Coordinate c(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3)
    {
        Coordinate coordinate4;
        try
        {
            coordinate4 = com.vividsolutions.jts.a.a.a(coordinate, coordinate1, coordinate2, coordinate3);
        }
        catch (m m1)
        {
            return com.vividsolutions.jts.a.c.a(coordinate, coordinate1, coordinate2, coordinate3);
        }
        return coordinate4;
    }

    public final void a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2)
    {
        d = false;
        if (h.a(coordinate1, coordinate2, coordinate) && com.vividsolutions.jts.a.c.a(coordinate1, coordinate2, coordinate) == 0 && com.vividsolutions.jts.a.c.a(coordinate2, coordinate1, coordinate) == 0)
        {
            d = true;
            if (coordinate.equals(coordinate1) || coordinate.equals(coordinate2))
            {
                d = false;
            }
            a = 1;
            return;
        } else
        {
            a = 0;
            return;
        }
    }

    protected final int b(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3)
    {
        int i;
        int j;
        int l;
        int i1;
        this.d = false;
        if (!h.a(coordinate, coordinate1, coordinate2, coordinate3))
        {
            return 0;
        }
        i = com.vividsolutions.jts.a.c.a(coordinate, coordinate1, coordinate2);
        j = com.vividsolutions.jts.a.c.a(coordinate, coordinate1, coordinate3);
        if (i > 0 && j > 0 || i < 0 && j < 0)
        {
            return 0;
        }
        l = com.vividsolutions.jts.a.c.a(coordinate2, coordinate3, coordinate);
        i1 = com.vividsolutions.jts.a.c.a(coordinate2, coordinate3, coordinate1);
        if (l > 0 && i1 > 0 || l < 0 && i1 < 0)
        {
            return 0;
        }
        boolean flag;
        if (i == 0 && j == 0 && l == 0 && i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            boolean flag2 = h.a(coordinate, coordinate1, coordinate2);
            boolean flag3 = h.a(coordinate, coordinate1, coordinate3);
            boolean flag4 = h.a(coordinate2, coordinate3, coordinate);
            boolean flag5 = h.a(coordinate2, coordinate3, coordinate1);
            if (flag2 && flag3)
            {
                c[0] = coordinate2;
                c[1] = coordinate3;
                return 2;
            }
            if (flag4 && flag5)
            {
                c[0] = coordinate;
                c[1] = coordinate1;
                return 2;
            }
            if (flag2 && flag4)
            {
                c[0] = coordinate2;
                c[1] = coordinate;
                return !coordinate2.equals(coordinate) || flag3 || flag5 ? 2 : 1;
            }
            if (flag2 && flag5)
            {
                c[0] = coordinate2;
                c[1] = coordinate1;
                return !coordinate2.equals(coordinate1) || flag3 || flag4 ? 2 : 1;
            }
            if (flag3 && flag4)
            {
                c[0] = coordinate3;
                c[1] = coordinate;
                return !coordinate3.equals(coordinate) || flag2 || flag5 ? 2 : 1;
            }
            if (flag3 && flag5)
            {
                c[0] = coordinate3;
                c[1] = coordinate1;
                return !coordinate3.equals(coordinate1) || flag2 || flag4 ? 2 : 1;
            } else
            {
                return 0;
            }
        }
        if (i != 0 && j != 0 && l != 0 && i1 != 0) goto _L2; else goto _L1
_L1:
        this.d = false;
        if (!coordinate.equals2D(coordinate2) && !coordinate.equals2D(coordinate3)) goto _L4; else goto _L3
_L3:
        c[0] = coordinate;
_L6:
        return 1;
_L4:
        if (coordinate1.equals2D(coordinate2) || coordinate1.equals2D(coordinate3))
        {
            c[0] = coordinate1;
        } else
        if (i == 0)
        {
            c[0] = new Coordinate(coordinate2);
        } else
        if (j == 0)
        {
            c[0] = new Coordinate(coordinate3);
        } else
        if (l == 0)
        {
            c[0] = new Coordinate(coordinate);
        } else
        if (i1 == 0)
        {
            c[0] = new Coordinate(coordinate1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        this.d = true;
        Coordinate acoordinate[] = c;
        Coordinate coordinate4 = new Coordinate(coordinate);
        Object obj1 = new Coordinate(coordinate1);
        Coordinate coordinate5 = new Coordinate(coordinate2);
        Coordinate coordinate6 = new Coordinate(coordinate3);
        Object obj = new Coordinate();
        double d;
        double d1;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        boolean flag1;
        if (coordinate4.x < ((Coordinate) (obj1)).x)
        {
            d1 = coordinate4.x;
        } else
        {
            d1 = ((Coordinate) (obj1)).x;
        }
        if (coordinate4.y < ((Coordinate) (obj1)).y)
        {
            d = coordinate4.y;
        } else
        {
            d = ((Coordinate) (obj1)).y;
        }
        if (coordinate4.x > ((Coordinate) (obj1)).x)
        {
            d3 = coordinate4.x;
        } else
        {
            d3 = ((Coordinate) (obj1)).x;
        }
        if (coordinate4.y > ((Coordinate) (obj1)).y)
        {
            d2 = coordinate4.y;
        } else
        {
            d2 = ((Coordinate) (obj1)).y;
        }
        if (coordinate5.x < coordinate6.x)
        {
            d5 = coordinate5.x;
        } else
        {
            d5 = coordinate6.x;
        }
        if (coordinate5.y < coordinate6.y)
        {
            d4 = coordinate5.y;
        } else
        {
            d4 = coordinate6.y;
        }
        if (coordinate5.x > coordinate6.x)
        {
            d7 = coordinate5.x;
        } else
        {
            d7 = coordinate6.x;
        }
        if (coordinate5.y > coordinate6.y)
        {
            d6 = coordinate5.y;
        } else
        {
            d6 = coordinate6.y;
        }
        if (d1 <= d5)
        {
            d1 = d5;
        }
        if (d3 >= d7)
        {
            d3 = d7;
        }
        if (d <= d4)
        {
            d = d4;
        }
        if (d2 >= d6)
        {
            d2 = d6;
        }
        d1 = (d1 + d3) / 2D;
        d = (d + d2) / 2D;
        obj.x = d1;
        obj.y = d;
        coordinate4.x = coordinate4.x - ((Coordinate) (obj)).x;
        coordinate4.y = coordinate4.y - ((Coordinate) (obj)).y;
        obj1.x = ((Coordinate) (obj1)).x - ((Coordinate) (obj)).x;
        obj1.y = ((Coordinate) (obj1)).y - ((Coordinate) (obj)).y;
        coordinate5.x = coordinate5.x - ((Coordinate) (obj)).x;
        coordinate5.y = coordinate5.y - ((Coordinate) (obj)).y;
        coordinate6.x = coordinate6.x - ((Coordinate) (obj)).x;
        coordinate6.y = coordinate6.y - ((Coordinate) (obj)).y;
        coordinate4 = c(coordinate4, ((Coordinate) (obj1)), coordinate5, coordinate6);
        coordinate4.x = coordinate4.x + ((Coordinate) (obj)).x;
        coordinate4.y = coordinate4.y + ((Coordinate) (obj)).y;
        obj = new h(b[0][0], b[0][1]);
        obj1 = new h(b[1][0], b[1][1]);
        if (((h) (obj)).c(coordinate4) && ((h) (obj1)).c(coordinate4))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            coordinate4 = com.vividsolutions.jts.a.c.a(coordinate, coordinate1, coordinate2, coordinate3);
        }
        if (e != null)
        {
            e.a(coordinate4);
        }
        acoordinate[0] = coordinate4;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
