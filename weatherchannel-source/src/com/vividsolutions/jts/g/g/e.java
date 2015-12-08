// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.g;

import com.vividsolutions.jts.geom.Coordinate;

public final class e
{

    private static String a[] = {
        "Topology Validation Error", "Repeated Point", "Hole lies outside shell", "Holes are nested", "Interior is disconnected", "Self-intersection", "Ring Self-intersection", "Nested shells", "Duplicate Rings", "Too few distinct points in geometry component", 
        "Invalid Coordinate", "Ring is not closed"
    };
    private int b;
    private Coordinate c;

    public e(int i, Coordinate coordinate)
    {
        b = i;
        if (coordinate != null)
        {
            c = (Coordinate)coordinate.clone();
        }
    }

    public final String toString()
    {
        String s = "";
        if (c != null)
        {
            s = (new StringBuilder(" at or near point ")).append(c).toString();
        }
        return (new StringBuilder()).append(a[b]).append(s).toString();
    }

}
