// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.c;

import com.google.android.apps.youtube.common.fromguava.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.youtube.common.c:
//            d

public final class e
{

    private final WeakReference a;
    private final Class b;
    private final d c;
    private final int d;
    private final int e;

    e(Object obj, Class class1, Object obj1, d d1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        com.google.android.apps.youtube.common.fromguava.c.a(obj1);
        a = new WeakReference(obj);
        b = (Class)com.google.android.apps.youtube.common.fromguava.c.a(class1);
        c = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        d = Arrays.hashCode(new Object[] {
            obj, b, obj1, c
        });
        e = obj1.hashCode();
    }

    final Object a()
    {
        return a.get();
    }

    final Class b()
    {
        return b;
    }

    final d c()
    {
        return c;
    }

    public final int d()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof e)
            {
                if (a.get() != ((e) (obj = (e)obj)).a.get() || !b.equals(((e) (obj)).b) || e != ((e) (obj)).e || c != ((e) (obj)).c)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return d;
    }
}
