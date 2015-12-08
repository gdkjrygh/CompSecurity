// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a.a;

import com.vividsolutions.jts.c.a;
import com.vividsolutions.jts.c.c.d;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.c.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.m;
import com.vividsolutions.jts.geom.n;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.a.a:
//            a

static final class a
{

    private d a;

    private void a(i i)
    {
        for (i = h.b(i).iterator(); i.hasNext();)
        {
            Coordinate acoordinate[] = ((n)i.next()).getCoordinates();
            int j = 1;
            while (j < acoordinate.length) 
            {
                m m1 = new m(acoordinate[j - 1], acoordinate[j]);
                double d1 = Math.min(m1.a.y, m1.b.y);
                double d2 = Math.max(m1.a.y, m1.b.y);
                a.a(d1, d2, m1);
                j++;
            }
        }

    }

    public final void a(double d1, double d2, a a1)
    {
        a.a(d1, d2, a1);
    }

    public rdinate(i i)
    {
        a = new d();
        a(i);
    }
}
