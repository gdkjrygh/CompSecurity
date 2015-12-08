// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.b;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.i;

public final class c
{

    private Coordinate a;

    public c(i i, int j, Coordinate coordinate)
    {
        a = null;
        a = coordinate;
    }

    public c(i i, Coordinate coordinate)
    {
        this(i, -1, coordinate);
    }

    public final Coordinate a()
    {
        return a;
    }
}
