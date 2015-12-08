// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;

import com.vividsolutions.jts.a.r;
import com.vividsolutions.jts.f.c;
import com.vividsolutions.jts.f.m;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.t;

// Referenced classes of package com.vividsolutions.jts.geom.b:
//            k, h

abstract class a extends k
{

    protected boolean a;
    private boolean c;
    private boolean d;
    private boolean e;

    public a(h h1)
    {
        super(h1);
        a = true;
        c = false;
        d = false;
        e = false;
    }

    protected final boolean a(i j)
    {
        if (d(j))
        {
            if (a && j.getDimension() == 0)
            {
                return f(j);
            }
            java.util.List list;
            m m1;
            boolean flag;
            if (j instanceof t)
            {
                flag = true;
            } else
            {
                i l = b.a();
                if (l.getNumGeometries() == 1 && ((Polygon)l.getGeometryN(0)).getNumInteriorRing() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            list = com.vividsolutions.jts.a.a.a(j);
            m1 = new m(new r());
            m1.a(true);
            b.c().a(list, m1);
            c = m1.a();
            d = m1.b();
            e = m1.c();
            if ((!flag || !d) && (!c || e))
            {
                if (c)
                {
                    return b(j);
                }
                if (!(j instanceof t) || !a(j, b.b()))
                {
                    return true;
                }
            }
        }
        return false;
    }

    protected abstract boolean b(i j);
}
