// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google:
//            e4, cJ, cR

public class z
{

    private static volatile boolean b = false;
    private static final z c = new z(true);
    private final Map a;

    z()
    {
        a = new HashMap();
    }

    z(z z1)
    {
        if (z1 == c)
        {
            a = Collections.emptyMap();
            return;
        } else
        {
            a = Collections.unmodifiableMap(z1.a);
            return;
        }
    }

    private z(boolean flag)
    {
        a = Collections.emptyMap();
    }

    public static boolean a()
    {
        return b;
    }

    public static z b()
    {
        return c;
    }

    public cJ a(cR cr, int i)
    {
        return (cJ)a.get(new e4(cr, i));
    }

}
