// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;


// Referenced classes of package com.vividsolutions.jts.geom:
//            Coordinate

public final class w extends RuntimeException
{

    public w(String s)
    {
        super(s);
    }

    public w(String s, Coordinate coordinate)
    {
        String s1 = s;
        if (coordinate != null)
        {
            s1 = (new StringBuilder()).append(s).append(" [ ").append(coordinate).append(" ]").toString();
        }
        super(s1);
        new Coordinate(coordinate);
    }
}
