// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            a, m

public final class l
    implements a
{

    private final a a;
    private final a b;
    private final m c;

    public l(a a1, a a2, m m1)
    {
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a2, "singleElementsCache may not be null");
        c = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
    }

    public final Object a(Object obj)
    {
        return a.a(obj);
    }

    public final void a()
    {
        a.a();
    }

    public final void a(d d)
    {
        a.a(d);
    }

    public final void a(Object obj, Object obj1)
    {
        c.a(obj, obj1, b);
        a.a(obj, obj1);
    }

    public final Object b(Object obj)
    {
        return a.b(obj);
    }
}
