// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            a

public final class n
    implements a
{

    private final Map a = new HashMap();
    private final a b;
    private final b c;
    private final long d;

    private n(a a1, b b1, long l)
    {
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        d = l;
    }

    public static n a(a a1, b b1, long l)
    {
        return new n(a1, b1, 0x36ee80L);
    }

    public final Object a(Object obj)
    {
        Object obj1 = b.a(obj);
        if (obj1 == null)
        {
            return null;
        }
        long l = ((Long)a.get(obj)).longValue();
        l = c.a() - l;
        if (d > l && l >= 0L)
        {
            return obj1;
        } else
        {
            b(obj);
            return null;
        }
    }

    public final void a()
    {
        b.a();
    }

    public final void a(d d1)
    {
        b.a(d1);
    }

    public final void a(Object obj, Object obj1)
    {
        b.a(obj, obj1);
        a.put(obj, Long.valueOf(c.a()));
    }

    public final Object b(Object obj)
    {
        Object obj1 = b.b(obj);
        if (obj1 == null)
        {
            return null;
        } else
        {
            a.remove(obj);
            return obj1;
        }
    }
}
