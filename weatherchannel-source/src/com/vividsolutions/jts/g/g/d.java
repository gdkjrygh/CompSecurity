// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.g;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.b.g;
import com.vividsolutions.jts.b.h;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.r;
import com.vividsolutions.jts.geom.s;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.vividsolutions.jts.g.g:
//            e, b, c, a

public final class d
{

    private i a;
    private boolean b;
    private e c;

    public d(i k)
    {
        b = false;
        a = k;
    }

    public static Coordinate a(Coordinate acoordinate[], p p1, l l1)
    {
        p1 = l1.a(p1).g();
        for (int k = 0; k < acoordinate.length; k++)
        {
            l1 = acoordinate[k];
            if (!p1.a(l1))
            {
                return l1;
            }
        }

        return null;
    }

    private void a(l l1)
    {
        if (l1.a())
        {
            c = new e(9, l1.b());
        }
    }

    private void a(Polygon polygon)
    {
        a(polygon.getExteriorRing().getCoordinates());
        if (c == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k = 0;
_L5:
        if (k >= polygon.getNumInteriorRing()) goto _L1; else goto _L3
_L3:
        a(polygon.getInteriorRingN(k).getCoordinates());
        if (c != null) goto _L1; else goto _L4
_L4:
        k++;
          goto _L5
    }

    private void a(Polygon polygon, l l1)
    {
        p p1 = (p)polygon.getExteriorRing();
        com.vividsolutions.jts.a.l l2 = new com.vividsolutions.jts.a.l(p1);
        int k = 0;
        do
        {
            Coordinate coordinate;
label0:
            {
                if (k < polygon.getNumInteriorRing())
                {
                    coordinate = a(((p)polygon.getInteriorRingN(k)).getCoordinates(), p1, l1);
                    if (coordinate != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            boolean flag;
            if (!l2.a(coordinate))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                c = new e(2, coordinate);
                return;
            }
            k++;
        } while (true);
    }

    private void a(i k)
    {
        int i1;
        i1 = 0;
        c = null;
        if (!k.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (k instanceof Point)
        {
            a(((Point)k).getCoordinates());
            return;
        }
        if (k instanceof r)
        {
            a(((r)k).getCoordinates());
            return;
        }
        if (!(k instanceof p))
        {
            break; /* Loop/switch isn't completed */
        }
        k = (p)k;
        a(k.getCoordinates());
        if (c == null)
        {
            a(((p) (k)));
            if (c == null)
            {
                k = new l(0, k);
                a(((l) (k)));
                if (c == null)
                {
                    k.a(new com.vividsolutions.jts.a.r(), true);
                    c(k);
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!(k instanceof n))
        {
            break; /* Loop/switch isn't completed */
        }
        k = (n)k;
        a(k.getCoordinates());
        if (c == null)
        {
            a(new l(0, k));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!(k instanceof Polygon))
        {
            break; /* Loop/switch isn't completed */
        }
        k = (Polygon)k;
        a(((Polygon) (k)));
        if (c == null)
        {
            b(k);
            if (c == null)
            {
                l l1 = new l(0, k);
                a(l1);
                if (c == null)
                {
                    b(l1);
                    if (c == null)
                    {
                        c(l1);
                        if (c == null)
                        {
                            a(((Polygon) (k)), l1);
                            if (c == null)
                            {
                                b(k, l1);
                                if (c == null)
                                {
                                    d(l1);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
        s s1;
        if (!(k instanceof s))
        {
            break MISSING_BLOCK_LABEL_783;
        }
        s1 = (s)k;
        i1 = 0;
_L8:
        if (i1 >= s1.getNumGeometries())
        {
            break MISSING_BLOCK_LABEL_356;
        }
        k = (Polygon)s1.getGeometryN(i1);
        a(((Polygon) (k)));
        if (c != null) goto _L1; else goto _L6
_L6:
        b(k);
        if (c != null) goto _L1; else goto _L7
_L7:
        i1++;
          goto _L8
        l l2;
        l2 = new l(0, s1);
        a(l2);
        if (c != null) goto _L1; else goto _L9
_L9:
        b(l2);
        if (c != null) goto _L1; else goto _L10
_L10:
        c(l2);
        if (c != null) goto _L1; else goto _L11
_L11:
        i1 = 0;
_L13:
        if (i1 >= s1.getNumGeometries())
        {
            break MISSING_BLOCK_LABEL_449;
        }
        a((Polygon)s1.getGeometryN(i1), l2);
        if (c != null) goto _L1; else goto _L12
_L12:
        i1++;
          goto _L13
        i1 = 0;
_L15:
        if (i1 >= s1.getNumGeometries())
        {
            break MISSING_BLOCK_LABEL_492;
        }
        b((Polygon)s1.getGeometryN(i1), l2);
        if (c != null) goto _L1; else goto _L14
_L14:
        i1++;
          goto _L15
        i1 = 0;
_L26:
        p p1;
        int j1;
        if (i1 >= s1.getNumGeometries())
        {
            break; /* Loop/switch isn't completed */
        }
        p1 = (p)((Polygon)s1.getGeometryN(i1)).getExteriorRing();
        j1 = 0;
_L22:
        if (j1 >= s1.getNumGeometries())
        {
            break MISSING_BLOCK_LABEL_760;
        }
        if (i1 == j1) goto _L17; else goto _L16
_L16:
        Coordinate coordinate;
        Polygon polygon;
        polygon = (Polygon)s1.getGeometryN(j1);
        Coordinate acoordinate[] = p1.getCoordinates();
        p p2 = (p)polygon.getExteriorRing();
        k = p2.getCoordinates();
        coordinate = a(acoordinate, p2, l2);
        if (coordinate == null || !com.vividsolutions.jts.a.a.a(coordinate, k)) goto _L19; else goto _L18
_L18:
        if (polygon.getNumInteriorRing() > 0) goto _L21; else goto _L20
_L20:
        c = new e(7, coordinate);
_L19:
        if (c != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L17:
        j1++;
          goto _L22
_L21:
        int k1;
        k1 = 0;
        k = null;
_L24:
        if (k1 >= polygon.getNumInteriorRing())
        {
            break MISSING_BLOCK_LABEL_743;
        }
        k = (p)polygon.getInteriorRingN(k1);
        Coordinate acoordinate2[] = p1.getCoordinates();
        Coordinate acoordinate1[] = k.getCoordinates();
        k = a(acoordinate2, ((p) (k)), l2);
        if (k == null || com.vividsolutions.jts.a.a.a(k, acoordinate1))
        {
            Coordinate coordinate1 = a(acoordinate1, p1, l2);
            if (coordinate1 != null)
            {
                k = coordinate1;
                if (!com.vividsolutions.jts.a.a.a(coordinate1, acoordinate2))
                {
                    k = null;
                }
            } else
            {
                com.vividsolutions.jts.a.a.a("points in shell and hole appear to be equal");
                k = null;
            }
        }
        if (k == null) goto _L19; else goto _L23
_L23:
        k1++;
          goto _L24
        c = new e(7, k);
          goto _L19
        i1++;
        if (true) goto _L26; else goto _L25
_L25:
        if (c != null) goto _L1; else goto _L27
_L27:
        d(l2);
        return;
        if (!(k instanceof j))
        {
            break MISSING_BLOCK_LABEL_830;
        }
        k = (j)k;
_L30:
        if (i1 >= k.getNumGeometries()) goto _L1; else goto _L28
_L28:
        a(k.getGeometryN(i1));
        if (c != null) goto _L1; else goto _L29
_L29:
        i1++;
          goto _L30
        throw new UnsupportedOperationException(k.getClass().getName());
    }

    private void a(p p1)
    {
        if (!p1.d())
        {
            Coordinate coordinate = null;
            if (p1.getNumPoints() > 0)
            {
                coordinate = p1.a(0);
            }
            c = new e(11, coordinate);
        }
    }

    private void a(Coordinate acoordinate[])
    {
        int k = 0;
        do
        {
label0:
            {
                if (k < acoordinate.length)
                {
                    Coordinate coordinate = acoordinate[k];
                    boolean flag;
                    if (Double.isNaN(coordinate.x))
                    {
                        flag = false;
                    } else
                    if (Double.isInfinite(coordinate.x))
                    {
                        flag = false;
                    } else
                    if (Double.isNaN(coordinate.y))
                    {
                        flag = false;
                    } else
                    if (Double.isInfinite(coordinate.y))
                    {
                        flag = false;
                    } else
                    {
                        flag = true;
                    }
                    if (flag)
                    {
                        break label0;
                    }
                    c = new e(10, acoordinate[k]);
                }
                return;
            }
            k++;
        } while (true);
    }

    private void b(l l1)
    {
        l1 = new b(l1);
        if (!l1.b())
        {
            c = new e(5, l1.a());
        } else
        if (l1.c())
        {
            c = new e(8, l1.a());
            return;
        }
    }

    private void b(Polygon polygon)
    {
        a((p)polygon.getExteriorRing());
        if (c == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k = 0;
_L5:
        if (k >= polygon.getNumInteriorRing()) goto _L1; else goto _L3
_L3:
        a((p)polygon.getInteriorRingN(k));
        if (c != null) goto _L1; else goto _L4
_L4:
        k++;
          goto _L5
    }

    private void b(Polygon polygon, l l1)
    {
        l1 = new c(l1);
        for (int k = 0; k < polygon.getNumInteriorRing(); k++)
        {
            l1.a((p)polygon.getInteriorRingN(k));
        }

        if (!l1.b())
        {
            c = new e(3, l1.a());
        }
    }

    private void c(l l1)
    {
        l1 = l1.e();
_L2:
        TreeSet treeset;
        Object obj;
        boolean flag;
        if (!l1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((com.vividsolutions.jts.b.d)l1.next()).g();
        treeset = new TreeSet();
        obj = ((h) (obj)).a();
        flag = true;
_L3:
        g g1;
        do
        {
label0:
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                g1 = (g)((Iterator) (obj)).next();
                if (!flag)
                {
                    break label0;
                }
                flag = false;
            }
        } while (true);
        if (!treeset.contains(g1.a))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        c = new e(6, g1.a);
        if (c == null) goto _L2; else goto _L1
_L1:
        return;
        treeset.add(g1.a);
          goto _L3
    }

    private void d(l l1)
    {
        l1 = new com.vividsolutions.jts.g.g.a(l1);
        if (!l1.b())
        {
            c = new e(4, l1.a());
        }
    }

    public final boolean a()
    {
        a(a);
        return c == null;
    }

    public final e b()
    {
        a(a);
        return c;
    }
}
