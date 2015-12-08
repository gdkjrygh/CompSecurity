// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.i;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.b;
import java.util.ArrayList;
import java.util.TreeSet;

public final class d
    implements b
{

    private TreeSet a;
    private ArrayList b;

    public d()
    {
        a = new TreeSet();
        b = new ArrayList();
    }

    public final void a(Coordinate coordinate)
    {
        if (!a.contains(coordinate))
        {
            b.add(coordinate);
            a.add(coordinate);
        }
    }

    public final Coordinate[] a()
    {
        Coordinate acoordinate[] = new Coordinate[b.size()];
        return (Coordinate[])b.toArray(acoordinate);
    }
}
