// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.r;
import java.util.Collection;

// Referenced classes of package com.vividsolutions.jts.f:
//            h, q, m

public final class c
{

    private static k b = new r();
    private q a;

    public c(Collection collection)
    {
        a = new h();
        a.a(collection);
    }

    public final boolean a(Collection collection)
    {
        m m1 = new m(b);
        a.a(m1);
        a.b(collection);
        return m1.a();
    }

    public final boolean a(Collection collection, m m1)
    {
        a.a(m1);
        a.b(collection);
        return m1.a();
    }

}
