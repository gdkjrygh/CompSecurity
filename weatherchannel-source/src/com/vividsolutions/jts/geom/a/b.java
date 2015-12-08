// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.f;
import java.io.Serializable;

// Referenced classes of package com.vividsolutions.jts.geom.a:
//            a

public final class b
    implements f, Serializable
{

    private static b a = new b();
    private static final long serialVersionUID = 0xc71b60593090d157L;

    private b()
    {
    }

    public static b a()
    {
        return a;
    }

    private Object readResolve()
    {
        return a;
    }

    public final d a(int i, int j)
    {
        if (j > 3)
        {
            throw new IllegalArgumentException("dimension must be <= 3");
        } else
        {
            return new a(i, j);
        }
    }

    public final d a(d d)
    {
        return new a(d);
    }

    public final d a(Coordinate acoordinate[])
    {
        return new a(acoordinate);
    }

}
