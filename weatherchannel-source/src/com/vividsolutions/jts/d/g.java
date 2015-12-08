// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.d;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.r;
import com.vividsolutions.jts.geom.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.vividsolutions.jts.d:
//            d, c

public final class g
{

    private int a;
    private int b;
    private boolean c;
    private ByteArrayOutputStream d;
    private byte e[];

    public g()
    {
        this(2, 1);
    }

    private g(int k, int l)
    {
        this(2, 1, false);
    }

    private g(int k, int l, boolean flag)
    {
        a = 2;
        c = false;
        d = new ByteArrayOutputStream();
        new com.vividsolutions.jts.d.d(d);
        e = new byte[8];
        a = k;
        b = l;
        c = false;
        if (k < 2 || k > 3)
        {
            throw new IllegalArgumentException("Output dimension must be 2 or 3");
        } else
        {
            return;
        }
    }

    private void a(int k, c c1)
        throws IOException
    {
        byte abyte0[] = e;
        if (b == 1)
        {
            abyte0[0] = k >> 24;
            abyte0[1] = (byte)(k >> 16);
            abyte0[2] = (byte)(k >> 8);
            abyte0[3] = (byte)k;
        } else
        {
            abyte0[0] = (byte)k;
            abyte0[1] = (byte)(k >> 8);
            abyte0[2] = (byte)(k >> 16);
            abyte0[3] = k >> 24;
        }
        c1.a(e, 4);
    }

    private void a(int k, i l, c c1)
        throws IOException
    {
        int j1 = 0;
        int i1;
        if (a == 3)
        {
            i1 = 0x80000000;
        } else
        {
            i1 = 0;
        }
        if (c)
        {
            j1 = 0x20000000;
        }
        a(i1 | k | j1, c1);
        if (c)
        {
            a(l.getSRID(), c1);
        }
    }

    private void a(int k, j j1, c c1)
        throws IOException
    {
        a(c1);
        a(k, ((i) (j1)), c1);
        a(j1.getNumGeometries(), c1);
        for (k = 0; k < j1.getNumGeometries(); k++)
        {
            a(j1.getGeometryN(k), c1);
        }

    }

    private void a(c c1)
        throws IOException
    {
        if (b == 2)
        {
            e[0] = 1;
        } else
        {
            e[0] = 0;
        }
        c1.a(e, 1);
    }

    private void a(Polygon polygon, c c1)
        throws IOException
    {
        a(c1);
        a(3, ((i) (polygon)), c1);
        a(polygon.getNumInteriorRing() + 1, c1);
        a(polygon.getExteriorRing().a(), true, c1);
        for (int k = 0; k < polygon.getNumInteriorRing(); k++)
        {
            a(polygon.getInteriorRingN(k).a(), true, c1);
        }

    }

    private void a(d d1, boolean flag, c c1)
        throws IOException
    {
        if (flag)
        {
            a(d1.b(), c1);
        }
        for (int k = 0; k < d1.b(); k++)
        {
            com.vividsolutions.jts.a.a.a(d1.c(k), e, b);
            c1.a(e, 8);
            com.vividsolutions.jts.a.a.a(d1.d(k), e, b);
            c1.a(e, 8);
            if (a < 3)
            {
                continue;
            }
            double d2 = (0.0D / 0.0D);
            if (d1.a() >= 3)
            {
                d2 = d1.a(k, 2);
            }
            com.vividsolutions.jts.a.a.a(d2, e, b);
            c1.a(e, 8);
        }

    }

    public final void a(i k, c c1)
        throws IOException
    {
        if (k instanceof Point)
        {
            k = (Point)k;
            if (k.getCoordinateSequence().b() == 0)
            {
                throw new IllegalArgumentException("Empty Points cannot be represented in WKB");
            } else
            {
                a(c1);
                a(1, k, c1);
                a(k.getCoordinateSequence(), false, c1);
                return;
            }
        }
        if (k instanceof n)
        {
            k = (n)k;
            a(c1);
            a(2, k, c1);
            a(k.a(), true, c1);
            return;
        }
        if (k instanceof Polygon)
        {
            a((Polygon)k, c1);
            return;
        }
        if (k instanceof r)
        {
            a(4, ((j) ((r)k)), c1);
            return;
        }
        if (k instanceof q)
        {
            a(5, ((j) ((q)k)), c1);
            return;
        }
        if (k instanceof s)
        {
            a(6, ((j) ((s)k)), c1);
            return;
        }
        if (k instanceof j)
        {
            a(7, (j)k, c1);
            return;
        } else
        {
            com.vividsolutions.jts.a.a.a("Unknown Geometry type");
            return;
        }
    }
}
