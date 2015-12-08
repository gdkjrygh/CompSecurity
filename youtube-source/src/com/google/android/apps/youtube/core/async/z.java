// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            y

final class z
    implements b
{

    final y a;
    private final b b;

    public z(y y1, b b1)
    {
        a = y1;
        super();
        b = (b)c.a(b1);
    }

    public final void a(Object obj, Exception exception)
    {
        b.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        com.google.android.apps.youtube.core.async.y.b(a).set(y.a(a).a());
        b.a(obj, obj1);
    }
}
