// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.d.i;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.u;
import java.lang.reflect.Array;

// Referenced classes of package com.vividsolutions.jts.a:
//            a

public abstract class k
{

    protected int a;
    protected Coordinate b[][];
    protected Coordinate c[];
    protected boolean d;
    protected u e;

    public k()
    {
        b = (Coordinate[][])Array.newInstance(com/vividsolutions/jts/geom/Coordinate, new int[] {
            2, 2
        });
        c = new Coordinate[2];
        e = null;
        c[0] = new Coordinate();
        c[1] = new Coordinate();
        Coordinate acoordinate[] = c;
        acoordinate = c;
        a = 0;
    }

    private boolean b(int j)
    {
        boolean flag1 = false;
        int l = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (l < a)
                {
                    if (c[l].equals2D(b[j][0]) || c[l].equals2D(b[j][1]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            l++;
        } while (true);
    }

    public final double a(int j, int l)
    {
        Coordinate coordinate = c[l];
        Coordinate coordinate1 = b[j][0];
        Coordinate coordinate2 = b[j][1];
        double d4 = Math.abs(coordinate2.x - coordinate1.x);
        double d5 = Math.abs(coordinate2.y - coordinate1.y);
        double d1;
        boolean flag;
        if (coordinate.equals(coordinate1))
        {
            d1 = 0.0D;
        } else
        if (coordinate.equals(coordinate2))
        {
            d1 = d5;
            if (d4 > d5)
            {
                d1 = d4;
            }
        } else
        {
            double d2 = Math.abs(coordinate.x - coordinate1.x);
            double d3 = Math.abs(coordinate.y - coordinate1.y);
            if (d4 > d5)
            {
                d1 = d2;
            } else
            {
                d1 = d3;
            }
            if (d1 == 0.0D && !coordinate.equals(coordinate1))
            {
                d1 = Math.max(d2, d3);
            }
        }
        if (d1 != 0.0D || coordinate.equals(coordinate1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, "Bad distance calculation");
        return d1;
    }

    public final Coordinate a(int j)
    {
        return c[j];
    }

    public abstract void a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2);

    public final void a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3)
    {
        b[0][0] = coordinate;
        b[0][1] = coordinate1;
        b[1][0] = coordinate2;
        b[1][1] = coordinate3;
        a = b(coordinate, coordinate1, coordinate2, coordinate3);
    }

    public final void a(u u)
    {
        e = u;
    }

    public final boolean a()
    {
        return a != 0;
    }

    public final boolean a(Coordinate coordinate)
    {
        boolean flag1 = false;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < a)
                {
                    if (!c[j].equals2D(coordinate))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    public final int b()
    {
        return a;
    }

    protected abstract int b(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3);

    public final boolean c()
    {
        while (b(0) || b(1)) 
        {
            return true;
        }
        return false;
    }

    public final boolean d()
    {
        return a() && d;
    }

    public String toString()
    {
        boolean flag1 = true;
        StringBuilder stringbuilder = (new StringBuilder()).append(i.a(b[0][0], b[0][1])).append(" - ").append(i.a(b[1][0], b[1][1]));
        StringBuffer stringbuffer = new StringBuffer();
        boolean flag;
        if (a() && !d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuffer.append(" endpoint");
        }
        if (d)
        {
            stringbuffer.append(" proper");
        }
        if (a == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuffer.append(" collinear");
        }
        return stringbuilder.append(stringbuffer.toString()).toString();
    }
}
