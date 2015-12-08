// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.d;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.u;
import java.io.IOException;

// Referenced classes of package com.vividsolutions.jts.d:
//            a, e, b

public final class f
{

    private GeometryFactory a;
    private com.vividsolutions.jts.geom.f b;
    private u c;
    private int d;
    private boolean e;
    private boolean f;
    private com.vividsolutions.jts.d.a g;
    private double h[];

    public f()
    {
        this(new GeometryFactory());
    }

    public f(GeometryFactory geometryfactory)
    {
        d = 2;
        e = false;
        f = false;
        g = new com.vividsolutions.jts.d.a();
        a = geometryfactory;
        c = a.getPrecisionModel();
        b = a.getCoordinateSequenceFactory();
    }

    private d a(int j)
        throws IOException
    {
        d d1 = b.a(j, d);
        int l = d1.a();
        int k = l;
        if (l > d)
        {
            k = d;
        }
        for (int i1 = 0; i1 < j; i1++)
        {
            int j1 = 0;
            while (j1 < d) 
            {
                if (j1 <= 1)
                {
                    h[j1] = c.a(g.c());
                } else
                {
                    h[j1] = g.c();
                }
                j1++;
            }
            for (int k1 = 0; k1 < k; k1++)
            {
                d1.a(i1, k1, h[k1]);
            }

        }

        return d1;
    }

    private i a()
        throws IOException, e
    {
        int l = 0;
        int i1 = 0;
        boolean flag = false;
        boolean flag1 = false;
        int k = 0;
        int j;
        int j1;
        int k1;
        boolean flag2;
        if (g.a() == 1)
        {
            j = 2;
        } else
        {
            j = 1;
        }
        g.a(j);
        k1 = g.b();
        j1 = k1 & 0xff;
        if ((0x80000000 & k1) != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            j = 3;
        } else
        {
            j = 2;
        }
        d = j;
        if ((0x20000000 & k1) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        e = flag2;
        Object obj;
        Object obj1;
        d d1;
        if (e)
        {
            j = g.b();
        } else
        {
            j = 0;
        }
        if (h == null || h.length < d)
        {
            h = new double[d];
        }
        j1;
        JVM INSTR tableswitch 1 7: default 188
    //                   1 237
    //                   2 265
    //                   3 384
    //                   4 453
    //                   5 530
    //                   6 607
    //                   7 684;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new e((new StringBuilder("Unknown WKB type ")).append(j1).toString());
_L2:
        obj = a(1);
        obj = a.createPoint(((d) (obj)));
_L13:
        if (j != 0)
        {
            ((i) (obj)).setSRID(j);
        }
        return ((i) (obj));
_L3:
        obj1 = a(g.b());
        if (((d) (obj1)).b() != 0 && ((d) (obj1)).b() < 2) goto _L10; else goto _L9
_L9:
        obj = obj1;
_L11:
        obj = a.createLineString(((d) (obj)));
        continue; /* Loop/switch isn't completed */
_L10:
        d1 = b.a(2, ((d) (obj1)).a());
        l = ((d) (obj1)).b();
        com.vividsolutions.jts.a.a.a(((d) (obj1)), 0, d1, 0, l);
        obj = d1;
        if (l > 0)
        {
            k = l;
            do
            {
                obj = d1;
                if (k >= 2)
                {
                    break;
                }
                com.vividsolutions.jts.a.a.a(((d) (obj1)), l - 1, d1, k, 1);
                k++;
            } while (true);
        }
        if (true) goto _L11; else goto _L4
_L4:
        l = g.b();
        obj = null;
        if (l > 1)
        {
            obj = new p[l - 1];
        }
        obj1 = b();
        for (; k < l - 1; k++)
        {
            obj[k] = b();
        }

        obj = a.createPolygon(((p) (obj1)), ((p []) (obj)));
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = g.b();
        obj = new Point[i1];
        for (k = l; k < i1; k++)
        {
            obj1 = a();
            if (!(obj1 instanceof Point))
            {
                throw new e("Invalid geometry type encountered in MultiPoint");
            }
            obj[k] = (Point)obj1;
        }

        obj = a.createMultiPoint(((Point []) (obj)));
        continue; /* Loop/switch isn't completed */
_L6:
        l = g.b();
        obj = new n[l];
        for (k = i1; k < l; k++)
        {
            obj1 = a();
            if (!(obj1 instanceof n))
            {
                throw new e("Invalid geometry type encountered in MultiLineString");
            }
            obj[k] = (n)obj1;
        }

        obj = a.createMultiLineString(((n []) (obj)));
        continue; /* Loop/switch isn't completed */
_L7:
        l = g.b();
        obj = new Polygon[l];
        for (k = ((flag) ? 1 : 0); k < l; k++)
        {
            obj1 = a();
            if (!(obj1 instanceof Polygon))
            {
                throw new e("Invalid geometry type encountered in MultiPolygon");
            }
            obj[k] = (Polygon)obj1;
        }

        obj = a.createMultiPolygon(((Polygon []) (obj)));
        continue; /* Loop/switch isn't completed */
_L8:
        l = g.b();
        obj = new i[l];
        for (k = ((flag1) ? 1 : 0); k < l; k++)
        {
            obj[k] = a();
        }

        obj = a.createGeometryCollection(((i []) (obj)));
        if (true) goto _L13; else goto _L12
_L12:
    }

    private p b()
        throws IOException
    {
        d d1;
        boolean flag;
        int j;
        flag = true;
        d1 = a(g.b());
        j = d1.b();
        break MISSING_BLOCK_LABEL_21;
        if (j != 0 && (j <= 3 || d1.a(0, 0) != d1.a(j - 1, 0) || d1.a(0, 1) != d1.a(j - 1, 1)))
        {
            flag = false;
        }
        if (!flag)
        {
            d1 = com.vividsolutions.jts.a.a.a(b, d1);
        }
        return a.createLinearRing(d1);
    }

    public final i a(b b1)
        throws IOException, e
    {
        g.a(b1);
        return a();
    }
}
