// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import java.util.ArrayList;

// Referenced classes of package com.vividsolutions.jts.geom:
//            Coordinate

public final class c extends ArrayList
{

    private static final Coordinate a[] = new Coordinate[0];

    public c()
    {
    }

    public c(Coordinate acoordinate[])
    {
        ensureCapacity(acoordinate.length);
        a(acoordinate, true);
    }

    public c(Coordinate acoordinate[], boolean flag)
    {
        ensureCapacity(acoordinate.length);
        a(acoordinate, false);
    }

    public final void a(int i, Coordinate coordinate, boolean flag)
    {
        for (int j = size(); j > 0 && (i > 0 && ((Coordinate)get(i - 1)).equals2D(coordinate) || i < j && ((Coordinate)get(i)).equals2D(coordinate));)
        {
            return;
        }

        super.add(i, coordinate);
    }

    public final void a(Coordinate coordinate, boolean flag)
    {
        if (!flag && size() > 0 && ((Coordinate)get(size() - 1)).equals2D(coordinate))
        {
            return;
        } else
        {
            super.add(coordinate);
            return;
        }
    }

    public final boolean a(Coordinate acoordinate[], boolean flag)
    {
        for (int i = 0; i < acoordinate.length; i++)
        {
            a(acoordinate[i], flag);
        }

        return true;
    }

    public final Coordinate[] a()
    {
        return (Coordinate[])toArray(a);
    }

    public final Object clone()
    {
        c c1 = (c)super.clone();
        for (int i = 0; i < size(); i++)
        {
            c1.add(i, ((Coordinate)get(i)).clone());
        }

        return c1;
    }

}
