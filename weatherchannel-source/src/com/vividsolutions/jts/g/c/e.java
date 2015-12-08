// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.c;

import com.vividsolutions.jts.a.o;
import com.vividsolutions.jts.b.a;
import com.vividsolutions.jts.b.b;
import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.b.f;
import com.vividsolutions.jts.b.i;
import com.vividsolutions.jts.b.j;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.b.n;
import com.vividsolutions.jts.b.r;
import com.vividsolutions.jts.g.c;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.c:
//            d, g, a, f

public final class e extends c
{

    private final o c = new o();
    private GeometryFactory d;
    private com.vividsolutions.jts.geom.i e;
    private r f;
    private i g;
    private List h;
    private List i;
    private List j;

    private e(com.vividsolutions.jts.geom.i k, com.vividsolutions.jts.geom.i i1)
    {
        super(k, i1);
        g = new i();
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();
        f = new r(new com.vividsolutions.jts.g.c.d());
        d = k.getFactory();
    }

    public static com.vividsolutions.jts.geom.i a(int k, com.vividsolutions.jts.geom.i i1, com.vividsolutions.jts.geom.i j1, GeometryFactory geometryfactory)
    {
        int k1;
        int l1;
        int i2;
        l1 = i1.getDimension();
        i2 = j1.getDimension();
        k1 = l1;
        k;
        JVM INSTR tableswitch 1 4: default 48
    //                   1 86
    //                   2 98
    //                   3 51
    //                   4 110;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_110;
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        k1 = -1;
_L6:
        switch (k1)
        {
        default:
            return null;

        case -1: 
            return geometryfactory.createGeometryCollection(new com.vividsolutions.jts.geom.i[0]);

        case 0: // '\0'
            return geometryfactory.createPoint(null);

        case 1: // '\001'
            return geometryfactory.createLineString(null);

        case 2: // '\002'
            return geometryfactory.createPolygon(null, null);
        }
_L2:
        k1 = Math.min(l1, i2);
          goto _L6
_L3:
        k1 = Math.max(l1, i2);
          goto _L6
        k1 = Math.max(l1, i2);
          goto _L6
    }

    public static com.vividsolutions.jts.geom.i a(com.vividsolutions.jts.geom.i k, com.vividsolutions.jts.geom.i i1, int j1)
    {
        i1 = new e(k, i1);
        i1.a(0);
        i1.a(1);
        ((e) (i1)).b[0].a(((e) (i1)).a, false);
        ((e) (i1)).b[1].a(((e) (i1)).a, false);
        ((e) (i1)).b[0].a(((e) (i1)).b[1], ((e) (i1)).a, true);
        k = new ArrayList();
        ((e) (i1)).b[0].a(k);
        ((e) (i1)).b[1].a(k);
        i1.a(((List) (k)));
        i1.b();
        i1.c();
        com.vividsolutions.jts.b.j.a(((e) (i1)).g.a());
        ((e) (i1)).f.b(((e) (i1)).g.a());
        i1.d();
        i1.e();
        i1.b(j1);
        i1.f();
        k = new g(((e) (i1)).d);
        Object obj = ((e) (i1)).f;
        k.a(((r) (obj)).f(), ((r) (obj)).h());
        i1.h = k.a();
        i1.i = (new com.vividsolutions.jts.g.c.a(i1, ((e) (i1)).d, ((e) (i1)).c)).a(j1);
        k = ((e) (i1)).d;
        obj = ((e) (i1)).c;
        i1.j = (new com.vividsolutions.jts.g.c.f(i1, k)).a(j1);
        k = ((e) (i1)).j;
        obj = ((e) (i1)).i;
        List list = ((e) (i1)).h;
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(k);
        arraylist.addAll(((Collection) (obj)));
        arraylist.addAll(list);
        if (arraylist.isEmpty())
        {
            k = a(j1, ((e) (i1)).b[0].c(), ((e) (i1)).b[1].c(), ((e) (i1)).d);
        } else
        {
            k = ((e) (i1)).d.buildGeometry(arraylist);
        }
        i1.e = k;
        return ((e) (i1)).e;
    }

    private void a(int k)
    {
        com.vividsolutions.jts.b.o o1;
        for (Iterator iterator = b[k].g(); iterator.hasNext(); f.a(o1.a()).a(k, o1.m().a(k)))
        {
            o1 = (com.vividsolutions.jts.b.o)iterator.next();
        }

    }

    private void a(com.vividsolutions.jts.b.o o1, int k)
    {
        int i1 = c.b(o1.a(), b[k].c());
        o1.m().b(k, i1);
    }

    private void a(List list)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            Object obj = g.b(d1);
            if (obj != null)
            {
                n n1 = ((d) (obj)).m();
                list = d1.m();
                if (!((d) (obj)).a(d1))
                {
                    list = new n(d1.m());
                    list.a();
                }
                obj = ((d) (obj)).d();
                if (((a) (obj)).a())
                {
                    ((a) (obj)).a(n1);
                }
                ((a) (obj)).a(list);
                n1.b(list);
            } else
            {
                g.a(d1);
            }
        }

    }

    private static boolean a(int k, int i1, int j1)
    {
        int k1;
        boolean flag1;
        flag1 = true;
        k1 = k;
        if (k == 1)
        {
            k1 = 0;
        }
        k = i1;
        if (i1 == 1)
        {
            k = 0;
        }
        j1;
        JVM INSTR tableswitch 1 4: default 52
    //                   1 58
    //                   2 72
    //                   3 90
    //                   4 104;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag = false;
_L7:
        return flag;
_L2:
        if (k1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (k == 0) goto _L7; else goto _L6
_L6:
        return false;
_L3:
        flag = flag1;
        if (k1 == 0) goto _L7; else goto _L8
_L8:
        flag = flag1;
        if (k == 0) goto _L7; else goto _L9
_L9:
        return false;
_L4:
        if (k1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (k != 0) goto _L7; else goto _L10
_L10:
        return false;
_L5:
        if (k1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (k != 0) goto _L7; else goto _L11
_L11:
        if (k1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (k == 0) goto _L7; else goto _L12
_L12:
        return false;
    }

    public static boolean a(n n1, int k)
    {
        return a(n1.a(0), n1.a(1), k);
    }

    private boolean a(Coordinate coordinate, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            com.vividsolutions.jts.geom.i k = (com.vividsolutions.jts.geom.i)list.next();
            if (c.b(coordinate, k) != 2)
            {
                return true;
            }
        }

        return false;
    }

    private void b()
    {
        Iterator iterator = g.b();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (d)iterator.next();
            n n1 = ((d) (obj)).m();
            obj = ((d) (obj)).d();
            if (!((a) (obj)).a())
            {
                ((a) (obj)).b();
                int k = 0;
                while (k < 2) 
                {
                    if (!n1.b(k) && n1.c() && !((a) (obj)).a(k))
                    {
                        if (((a) (obj)).b(k) == 0)
                        {
                            n1.e(k);
                        } else
                        {
                            boolean flag;
                            if (!((a) (obj)).b(k, 1))
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            com.vividsolutions.jts.a.a.a(flag, "depth of LEFT side has not been initialized");
                            n1.a(k, 1, ((a) (obj)).a(k, 1));
                            if (!((a) (obj)).b(k, 2))
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            com.vividsolutions.jts.a.a.a(flag, "depth of RIGHT side has not been initialized");
                            n1.a(k, 2, ((a) (obj)).a(k, 2));
                        }
                    }
                    k++;
                }
            }
        } while (true);
    }

    private void b(int k)
    {
        Iterator iterator = f.f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b1 = (b)iterator.next();
            n n1 = b1.l();
            if (n1.c() && !b1.k() && a(n1.a(0, 2), n1.a(1, 2), k))
            {
                b1.a(true);
            }
        } while (true);
    }

    private void c()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = g.b();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d1 = (d)iterator.next();
            if (d1.j())
            {
                iterator.remove();
                arraylist.add(d1.k());
            }
        } while (true);
        g.a(arraylist);
    }

    private void d()
    {
        for (Iterator iterator = f.h().iterator(); iterator.hasNext(); ((com.vividsolutions.jts.b.o)iterator.next()).b().a(b)) { }
        for (Iterator iterator1 = f.h().iterator(); iterator1.hasNext(); ((com.vividsolutions.jts.b.c)((com.vividsolutions.jts.b.o)iterator1.next()).b()).b()) { }
        com.vividsolutions.jts.b.o o1;
        n n1;
        for (Iterator iterator2 = f.h().iterator(); iterator2.hasNext(); o1.m().b(n1))
        {
            o1 = (com.vividsolutions.jts.b.o)iterator2.next();
            n1 = ((com.vividsolutions.jts.b.c)o1.b()).a();
        }

    }

    private void e()
    {
        Iterator iterator = f.h().iterator();
        while (iterator.hasNext()) 
        {
            com.vividsolutions.jts.b.o o1 = (com.vividsolutions.jts.b.o)iterator.next();
            n n1 = o1.m();
            if (o1.d())
            {
                if (n1.b(0))
                {
                    a(o1, 0);
                } else
                {
                    a(o1, 1);
                }
            }
            ((com.vividsolutions.jts.b.c)o1.b()).a(n1);
        }
    }

    private void f()
    {
        Iterator iterator = f.f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b1 = (b)iterator.next();
            b b2 = b1.f();
            if (b1.b() && b2.b())
            {
                b1.a(false);
                b2.a(false);
            }
        } while (true);
    }

    public final r a()
    {
        return f;
    }

    public final boolean a(Coordinate coordinate)
    {
        while (a(coordinate, i) || a(coordinate, h)) 
        {
            return true;
        }
        return false;
    }

    public final boolean b(Coordinate coordinate)
    {
        return a(coordinate, h);
    }
}
