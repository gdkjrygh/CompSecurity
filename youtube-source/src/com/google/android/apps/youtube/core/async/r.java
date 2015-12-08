// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            m

final class r
    implements b
{

    final m a;
    private final b b;

    public r(m m1, b b1)
    {
        a = m1;
        super();
        b = (b)c.a(b1);
    }

    public final void a(Object obj, Exception exception)
    {
        b.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        com.google.android.apps.youtube.core.async.m.a(a).a(a.a(obj, obj1));
        b.a(obj, obj1);
    }
}
