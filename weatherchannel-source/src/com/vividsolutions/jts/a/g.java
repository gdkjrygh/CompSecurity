// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.c;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.i.a;
import com.vividsolutions.jts.i.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.TreeSet;

// Referenced classes of package com.vividsolutions.jts.a:
//            a

public final class g
{
    static final class a
        implements Comparator
    {

        private Coordinate a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (Coordinate)obj;
            obj1 = (Coordinate)obj1;
            Coordinate coordinate = a;
            double d3 = ((Coordinate) (obj)).x - coordinate.x;
            double d4 = ((Coordinate) (obj)).y - coordinate.y;
            double d1 = ((Coordinate) (obj1)).x - coordinate.x;
            double d2 = ((Coordinate) (obj1)).y - coordinate.y;
            int j = com.vividsolutions.jts.a.a.a(coordinate, ((Coordinate) (obj)), ((Coordinate) (obj1)));
            if (j == 1)
            {
                return 1;
            }
            if (j == -1)
            {
                return -1;
            }
            d3 = d3 * d3 + d4 * d4;
            d1 = d1 * d1 + d2 * d2;
            if (d3 < d1)
            {
                return -1;
            }
            return d3 <= d1 ? 0 : 1;
        }

        public a(Coordinate coordinate)
        {
            a = coordinate;
        }
    }


    private GeometryFactory a;
    private Coordinate b[];

    public g(i j)
    {
        d d1 = new d();
        j.apply(d1);
        this(d1.a(), j.getFactory());
    }

    private g(Coordinate acoordinate[], GeometryFactory geometryfactory)
    {
        b = acoordinate;
        a = geometryfactory;
    }

    private static Coordinate[] a(Stack stack)
    {
        Coordinate acoordinate[] = new Coordinate[stack.size()];
        for (int j = 0; j < stack.size(); j++)
        {
            acoordinate[j] = (Coordinate)stack.get(j);
        }

        return acoordinate;
    }

    private static Coordinate[] a(Coordinate acoordinate[])
    {
        Coordinate acoordinate1[] = new Coordinate[3];
        int j = 0;
        while (j < 3) 
        {
            if (j < acoordinate.length)
            {
                acoordinate1[j] = acoordinate[j];
            } else
            {
                acoordinate1[j] = acoordinate[0];
            }
            j++;
        }
        return acoordinate1;
    }

    private static Coordinate[] b(Coordinate acoordinate[])
    {
        for (int j = 1; j < acoordinate.length; j++)
        {
            if (acoordinate[j].y < acoordinate[0].y || acoordinate[j].y == acoordinate[0].y && acoordinate[j].x < acoordinate[0].x)
            {
                Coordinate coordinate = acoordinate[0];
                acoordinate[0] = acoordinate[j];
                acoordinate[j] = coordinate;
            }
        }

        Arrays.sort(acoordinate, 1, acoordinate.length, new a(acoordinate[0]));
        return acoordinate;
    }

    private static Stack c(Coordinate acoordinate[])
    {
        Stack stack = new Stack();
        stack.push(acoordinate[0]);
        stack.push(acoordinate[1]);
        stack.push(acoordinate[2]);
        for (int j = 3; j < acoordinate.length; j++)
        {
            Coordinate coordinate;
            for (coordinate = (Coordinate)stack.pop(); !stack.empty() && com.vividsolutions.jts.a.a.a((Coordinate)stack.peek(), coordinate, acoordinate[j]) > 0; coordinate = (Coordinate)stack.pop()) { }
            stack.push(coordinate);
            stack.push(acoordinate[j]);
        }

        stack.push(acoordinate[0]);
        return stack;
    }

    private Coordinate[] d(Coordinate acoordinate[])
    {
        Coordinate coordinate;
        ArrayList arraylist;
        int j;
        coordinate = acoordinate[0];
        Coordinate coordinate1 = acoordinate[acoordinate.length - 1];
        if (!coordinate1.equals(coordinate))
        {
            throw new com.vividsolutions.jts.i.a((new StringBuilder("Expected ")).append(coordinate).append(" but encountered ").append(coordinate1).toString());
        }
        arraylist = new ArrayList();
        coordinate = null;
        j = 0;
_L15:
        if (j > acoordinate.length - 2) goto _L2; else goto _L1
_L1:
        Coordinate coordinate2;
        Coordinate coordinate3;
        Coordinate coordinate4;
        coordinate3 = acoordinate[j];
        coordinate4 = acoordinate[j + 1];
        coordinate2 = coordinate;
        if (coordinate3.equals(coordinate4)) goto _L4; else goto _L3
_L3:
        if (coordinate == null) goto _L6; else goto _L5
_L5:
        if (com.vividsolutions.jts.a.a.a(coordinate, coordinate3, coordinate4) != 0) goto _L8; else goto _L7
_L7:
        if (coordinate.x == coordinate4.x) goto _L10; else goto _L9
_L9:
        if (coordinate.x > coordinate3.x || coordinate3.x > coordinate4.x) goto _L12; else goto _L11
_L11:
        boolean flag = true;
_L13:
        coordinate2 = coordinate;
        if (flag) goto _L4; else goto _L6
_L6:
        arraylist.add(coordinate3);
        coordinate2 = coordinate3;
_L4:
        j++;
        coordinate = coordinate2;
        continue; /* Loop/switch isn't completed */
_L12:
        if (coordinate4.x <= coordinate3.x && coordinate3.x <= coordinate.x)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L10:
        if (coordinate.y != coordinate4.y)
        {
            if (coordinate.y <= coordinate3.y && coordinate3.y <= coordinate4.y)
            {
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
            if (coordinate4.y <= coordinate3.y && coordinate3.y <= coordinate.y)
            {
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
        }
_L8:
        flag = false;
        if (true) goto _L13; else goto _L2
_L2:
        arraylist.add(acoordinate[acoordinate.length - 1]);
        return (Coordinate[])arraylist.toArray(new Coordinate[arraylist.size()]);
        if (true) goto _L15; else goto _L14
_L14:
    }

    public final i a()
    {
        if (b.length == 0)
        {
            return a.createGeometryCollection(null);
        }
        if (b.length == 1)
        {
            return a.createPoint(b[0]);
        }
        if (b.length == 2)
        {
            return a.createLineString(b);
        }
        Coordinate acoordinate[] = b;
        if (b.length > 50)
        {
            Coordinate acoordinate1[] = b;
            acoordinate = new Coordinate[8];
            for (int j = 0; j < 8; j++)
            {
                acoordinate[j] = acoordinate1[0];
            }

            for (int k = 1; k < acoordinate1.length; k++)
            {
                if (acoordinate1[k].x < acoordinate[0].x)
                {
                    acoordinate[0] = acoordinate1[k];
                }
                if (acoordinate1[k].x - acoordinate1[k].y < acoordinate[1].x - acoordinate[1].y)
                {
                    acoordinate[1] = acoordinate1[k];
                }
                if (acoordinate1[k].y > acoordinate[2].y)
                {
                    acoordinate[2] = acoordinate1[k];
                }
                if (acoordinate1[k].x + acoordinate1[k].y > acoordinate[3].x + acoordinate[3].y)
                {
                    acoordinate[3] = acoordinate1[k];
                }
                if (acoordinate1[k].x > acoordinate[4].x)
                {
                    acoordinate[4] = acoordinate1[k];
                }
                if (acoordinate1[k].x - acoordinate1[k].y > acoordinate[5].x - acoordinate[5].y)
                {
                    acoordinate[5] = acoordinate1[k];
                }
                if (acoordinate1[k].y < acoordinate[6].y)
                {
                    acoordinate[6] = acoordinate1[k];
                }
                if (acoordinate1[k].x + acoordinate1[k].y < acoordinate[7].x + acoordinate[7].y)
                {
                    acoordinate[7] = acoordinate1[k];
                }
            }

            c c1 = new c();
            c1.a(acoordinate, false);
            if (c1.size() < 3)
            {
                acoordinate = null;
            } else
            {
                if (c1.size() > 0)
                {
                    c1.a(new Coordinate((Coordinate)c1.get(0)), false);
                }
                acoordinate = c1.a();
            }
            if (acoordinate == null)
            {
                acoordinate = acoordinate1;
            } else
            {
                TreeSet treeset = new TreeSet();
                for (int l = 0; l < acoordinate.length; l++)
                {
                    treeset.add(acoordinate[l]);
                }

                for (int i1 = 0; i1 < acoordinate1.length; i1++)
                {
                    if (!com.vividsolutions.jts.a.a.a(acoordinate1[i1], acoordinate))
                    {
                        treeset.add(acoordinate1[i1]);
                    }
                }

                acoordinate1 = com.vividsolutions.jts.geom.a.a(treeset);
                acoordinate = acoordinate1;
                if (acoordinate1.length < 3)
                {
                    acoordinate = a(acoordinate1);
                }
            }
        }
        acoordinate = d(a(c(b(acoordinate))));
        if (acoordinate.length == 3)
        {
            return a.createLineString(new Coordinate[] {
                acoordinate[0], acoordinate[1]
            });
        } else
        {
            com.vividsolutions.jts.geom.p p = a.createLinearRing(acoordinate);
            return a.createPolygon(p, null);
        }
    }
}
