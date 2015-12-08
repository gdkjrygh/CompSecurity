// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            d, f, af

final class e
    implements b
{

    final b a;
    final Object b;
    final d c;
    private boolean d;

    e(d d1, b b1, Object obj)
    {
        c = d1;
        a = b1;
        b = obj;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        if (!d && com.google.android.apps.youtube.core.async.d.a(c).a(obj, exception))
        {
            d = true;
            com.google.android.apps.youtube.core.async.d.b(c).a();
            com.google.android.apps.youtube.core.async.d.c(c).a(obj, this);
            return;
        } else
        {
            a.a(b, exception);
            return;
        }
    }

    public final void a(Object obj, Object obj1)
    {
        a.a(b, obj1);
    }
}
