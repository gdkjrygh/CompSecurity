// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google:
//            z, f1, cd, cP

public final class A extends z
{

    private static final A d = new A(true);
    private final Map e;
    private final Map f;

    private A()
    {
        f = new HashMap();
        e = new HashMap();
    }

    private A(boolean flag)
    {
        super(z.b());
        f = Collections.emptyMap();
        e = Collections.emptyMap();
    }

    public static A a()
    {
        return d;
    }

    public cd a(cP cp, int i)
    {
        return (cd)e.get(new f1(cp, i));
    }

}
