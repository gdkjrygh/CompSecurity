// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.o;
import com.vividsolutions.jts.a.r;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.c.j;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.m;
import com.vividsolutions.jts.geom.n;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.b:
//            a, c

public final class b
{

    private i a[];
    private double b;
    private o c;
    private c d[];
    private double e;

    public b(i l, i i1)
    {
        this(l, i1, 0.0D);
    }

    public b(i l, i i1, double d1)
    {
        b = 0.0D;
        c = new o();
        e = 1.7976931348623157E+308D;
        a = new i[2];
        a[0] = l;
        a[1] = i1;
        b = d1;
    }

    private void a(int l, c ac[])
    {
        int j1 = 1 - l;
        List list = j.b(a[l]);
        if (list.size() > 0)
        {
            i i1 = a[j1];
            ArrayList arraylist = new ArrayList();
            i1.apply$6f9a9d12(new com.vividsolutions.jts.g.b.a(arraylist));
            a(((List) (arraylist)), list, ac);
            if (e <= b)
            {
                d[j1] = ac[0];
                d[l] = ac[1];
            }
        }
    }

    private void a(List list, List list1, c ac[])
    {
        int l = 0;
_L7:
        if (l >= list.size()) goto _L2; else goto _L1
_L1:
        c c1;
        int i1;
        c1 = (c)list.get(l);
        i1 = 0;
_L5:
        if (i1 >= list1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        Polygon polygon = (Polygon)list1.get(i1);
        Coordinate coordinate = c1.a();
        if (2 != c.b(coordinate, polygon))
        {
            e = 0.0D;
            ac[0] = c1;
            ac[1] = new c(polygon, coordinate);
        }
        if (e > b) goto _L3; else goto _L2
_L2:
        return;
_L3:
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
        l++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(c ac[], boolean flag)
    {
        if (ac[0] == null)
        {
            return;
        }
        if (flag)
        {
            d[0] = ac[1];
            d[1] = ac[0];
            return;
        } else
        {
            d[0] = ac[0];
            d[1] = ac[1];
            return;
        }
    }

    private void b(List list, List list1, c ac[])
    {
        int l = 0;
_L14:
        if (l >= list.size()) goto _L2; else goto _L1
_L1:
        n n1;
        int i1;
        n1 = (n)list.get(l);
        i1 = 0;
_L12:
        n n2;
        if (i1 >= list1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        n2 = (n)list1.get(i1);
        if (n1.getEnvelopeInternal().f(n2.getEnvelopeInternal()) > e) goto _L4; else goto _L3
_L3:
        Coordinate acoordinate[];
        Coordinate acoordinate1[];
        int j1;
        acoordinate = n1.getCoordinates();
        acoordinate1 = n2.getCoordinates();
        j1 = 0;
_L9:
        int k1;
        if (j1 >= acoordinate.length - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = 0;
_L7:
        Object obj;
        Object obj1;
        Object obj2;
        Coordinate coordinate;
        if (k1 >= acoordinate1.length - 1)
        {
            break MISSING_BLOCK_LABEL_882;
        }
        obj = acoordinate[j1];
        obj1 = acoordinate[j1 + 1];
        obj2 = acoordinate1[k1];
        coordinate = acoordinate1[k1 + 1];
        if (!((Coordinate) (obj)).equals(obj1)) goto _L6; else goto _L5
_L5:
        double d1 = com.vividsolutions.jts.a.a.b(((Coordinate) (obj)), ((Coordinate) (obj2)), coordinate);
_L8:
        if (d1 < e)
        {
            e = d1;
            obj1 = new m(acoordinate[j1], acoordinate[j1 + 1]);
            obj2 = new m(acoordinate1[k1], acoordinate1[k1 + 1]);
            obj = new r();
            ((k) (obj)).a(((m) (obj1)).a, ((m) (obj1)).b, ((m) (obj2)).a, ((m) (obj2)).b);
            double d3;
            double d5;
            double d7;
            double d8;
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            boolean flag;
            if (((k) (obj)).a())
            {
                obj = ((k) (obj)).a(0);
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                obj1 = new Coordinate[2];
                obj1[0] = obj;
                obj1[1] = obj;
                obj = obj1;
            } else
            {
                obj = new Coordinate[2];
                Coordinate coordinate1 = ((m) (obj1)).a(((m) (obj2)).a);
                double d2 = coordinate1.distance(((m) (obj2)).a);
                obj[0] = coordinate1;
                obj[1] = ((m) (obj2)).a;
                coordinate1 = ((m) (obj1)).a(((m) (obj2)).b);
                double d4 = coordinate1.distance(((m) (obj2)).b);
                if (d4 < d2)
                {
                    obj[0] = coordinate1;
                    obj[1] = ((m) (obj2)).b;
                    d2 = d4;
                }
                coordinate1 = ((m) (obj2)).a(((m) (obj1)).a);
                double d6 = coordinate1.distance(((m) (obj1)).a);
                d4 = d2;
                if (d6 < d2)
                {
                    obj[0] = ((m) (obj1)).a;
                    obj[1] = coordinate1;
                    d4 = d6;
                }
                obj2 = ((m) (obj2)).a(((m) (obj1)).b);
                if (((Coordinate) (obj2)).distance(((m) (obj1)).b) < d4)
                {
                    obj[0] = ((m) (obj1)).b;
                    obj[1] = obj2;
                }
            }
            ac[0] = new c(n1, j1, obj[0]);
            ac[1] = new c(n2, k1, obj[1]);
        }
        if (e <= b)
        {
            break; /* Loop/switch isn't completed */
        }
        k1++;
        if (true) goto _L7; else goto _L6
_L6:
        if (((Coordinate) (obj2)).equals(coordinate))
        {
            d1 = com.vividsolutions.jts.a.a.b(coordinate, ((Coordinate) (obj)), ((Coordinate) (obj1)));
        } else
        {
label0:
            {
                flag = false;
                if (h.a(((Coordinate) (obj)), ((Coordinate) (obj1)), ((Coordinate) (obj2)), coordinate))
                {
                    d3 = (((Coordinate) (obj1)).x - ((Coordinate) (obj)).x) * (coordinate.y - ((Coordinate) (obj2)).y) - (((Coordinate) (obj1)).y - ((Coordinate) (obj)).y) * (coordinate.x - ((Coordinate) (obj2)).x);
                    if (d3 != 0.0D)
                    {
                        d5 = ((Coordinate) (obj)).y;
                        d7 = ((Coordinate) (obj2)).y;
                        d8 = coordinate.x;
                        d9 = ((Coordinate) (obj2)).x;
                        d10 = ((Coordinate) (obj)).x;
                        d11 = ((Coordinate) (obj2)).x;
                        d12 = coordinate.y;
                        d13 = ((Coordinate) (obj2)).y;
                        d1 = ((((Coordinate) (obj)).y - ((Coordinate) (obj2)).y) * (((Coordinate) (obj1)).x - ((Coordinate) (obj)).x) - (((Coordinate) (obj)).x - ((Coordinate) (obj2)).x) * (((Coordinate) (obj1)).y - ((Coordinate) (obj)).y)) / d3;
                        d3 = ((d5 - d7) * (d8 - d9) - (d10 - d11) * (d12 - d13)) / d3;
                        if (d3 >= 0.0D && d3 <= 1.0D && d1 >= 0.0D && d1 <= 1.0D)
                        {
                            break label0;
                        }
                    }
                }
                flag = true;
            }
            if (flag)
            {
                d1 = com.vividsolutions.jts.e.b.b(com.vividsolutions.jts.a.a.b(((Coordinate) (obj)), ((Coordinate) (obj2)), coordinate), com.vividsolutions.jts.a.a.b(((Coordinate) (obj1)), ((Coordinate) (obj2)), coordinate), com.vividsolutions.jts.a.a.b(((Coordinate) (obj2)), ((Coordinate) (obj)), ((Coordinate) (obj1))), com.vividsolutions.jts.a.a.b(coordinate, ((Coordinate) (obj)), ((Coordinate) (obj1))));
            } else
            {
                d1 = 0.0D;
            }
        }
          goto _L8
        j1++;
        if (true) goto _L9; else goto _L4
_L4:
        if (e > b) goto _L10; else goto _L2
_L2:
        return;
_L10:
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
        l++;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void c(List list, List list1, c ac[])
    {
        int l = 0;
_L7:
        if (l >= list.size()) goto _L2; else goto _L1
_L1:
        Point point;
        int i1;
        point = (Point)list.get(l);
        i1 = 0;
_L5:
        if (i1 >= list1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        Point point1 = (Point)list1.get(i1);
        double d1 = point.getCoordinate().distance(point1.getCoordinate());
        if (d1 < e)
        {
            e = d1;
            ac[0] = new c(point, 0, point.getCoordinate());
            ac[1] = new c(point1, 0, point1.getCoordinate());
        }
        if (e > b) goto _L3; else goto _L2
_L2:
        return;
_L3:
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
        l++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void d(List list, List list1, c ac[])
    {
        int l = 0;
_L7:
        if (l >= list.size()) goto _L2; else goto _L1
_L1:
        n n1;
        int i1;
        n1 = (n)list.get(l);
        i1 = 0;
_L5:
        if (i1 >= list1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        Point point = (Point)list1.get(i1);
        if (n1.getEnvelopeInternal().f(point.getEnvelopeInternal()) <= e)
        {
            Coordinate acoordinate[] = n1.getCoordinates();
            Coordinate coordinate = point.getCoordinate();
            int j1 = 0;
            do
            {
                if (j1 >= acoordinate.length - 1)
                {
                    break;
                }
                double d1 = com.vividsolutions.jts.a.a.b(coordinate, acoordinate[j1], acoordinate[j1 + 1]);
                if (d1 < e)
                {
                    e = d1;
                    ac[0] = new c(n1, j1, (new m(acoordinate[j1], acoordinate[j1 + 1])).a(coordinate));
                    ac[1] = new c(point, 0, coordinate);
                }
                if (e <= b)
                {
                    break;
                }
                j1++;
            } while (true);
        }
        if (e > b) goto _L3; else goto _L2
_L2:
        return;
_L3:
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
        l++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final double a()
    {
        if (a[0] == null || a[1] == null)
        {
            throw new IllegalArgumentException("null geometries are not supported");
        }
        if (a[0].isEmpty() || a[1].isEmpty())
        {
            return 0.0D;
        }
        if (d == null)
        {
            d = new c[2];
            c ac[] = new c[2];
            a(0, ac);
            if (e > b)
            {
                a(1, ac);
            }
            if (e > b)
            {
                c ac1[] = new c[2];
                List list = com.vividsolutions.jts.geom.c.h.b(a[0]);
                List list1 = com.vividsolutions.jts.geom.c.h.b(a[1]);
                List list2 = com.vividsolutions.jts.geom.c.i.b(a[0]);
                List list3 = com.vividsolutions.jts.geom.c.i.b(a[1]);
                b(list, list1, ac1);
                a(ac1, false);
                if (e > b)
                {
                    ac1[0] = null;
                    ac1[1] = null;
                    d(list, list3, ac1);
                    a(ac1, false);
                    if (e > b)
                    {
                        ac1[0] = null;
                        ac1[1] = null;
                        d(list1, list2, ac1);
                        a(ac1, true);
                        if (e > b)
                        {
                            ac1[0] = null;
                            ac1[1] = null;
                            c(list2, list3, ac1);
                            a(ac1, false);
                        }
                    }
                }
            }
        }
        return e;
    }
}
