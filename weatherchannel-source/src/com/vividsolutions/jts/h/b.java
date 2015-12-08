// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.h;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.i;

// Referenced classes of package com.vividsolutions.jts.h:
//            a

public final class com.vividsolutions.jts.h.b
{
    final class a
        implements com.vividsolutions.jts.geom.b
    {

        private com.vividsolutions.jts.h.a a;
        private com.vividsolutions.jts.h.a b;

        public final Coordinate a()
        {
            return new Coordinate(a.a(), b.a());
        }

        public final void a(Coordinate coordinate)
        {
            a.a(coordinate.x);
            b.a(coordinate.y);
        }

        a()
        {
            a = new com.vividsolutions.jts.h.a();
            b = new com.vividsolutions.jts.h.a();
        }
    }

    final class b
        implements com.vividsolutions.jts.geom.b
    {

        private Coordinate a;

        public final void a(Coordinate coordinate)
        {
            coordinate.x = coordinate.x + a.x;
            coordinate.y = coordinate.y + a.y;
        }

        public b(Coordinate coordinate)
        {
            a = null;
            a = coordinate;
        }
    }


    private Coordinate a;
    private a b;

    public com.vividsolutions.jts.h.b()
    {
        b = new a();
    }

    public final void a(i j)
    {
        j.apply(b);
        a = b.a();
    }

    public final i b(i j)
    {
        if (a.x == 0.0D && a.y == 0.0D)
        {
            return j;
        } else
        {
            Coordinate coordinate = new Coordinate(a);
            coordinate.x = -coordinate.x;
            coordinate.y = -coordinate.y;
            j.apply(new b(coordinate));
            j.geometryChanged();
            return j;
        }
    }

    public final void c(i j)
    {
        j.apply(new b(a));
        j.geometryChanged();
    }
}
