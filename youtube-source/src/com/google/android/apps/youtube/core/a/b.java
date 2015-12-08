// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            h, g, e

public abstract class b extends h
{

    private final g c;
    private final int d;

    public b(e e1, g g1, int i)
    {
        super(e1);
        c = (g)com.google.android.apps.youtube.common.fromguava.c.a(g1);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "groupSize must be positive");
        d = i;
    }

    public final int a()
    {
        return d;
    }

    protected final void a(Set set)
    {
        set.add(c);
    }

    public final int b()
    {
        return ((b.g() + d) - 1) / d;
    }

    public final boolean b(int i)
    {
        int j = d(i);
        for (i = d * i; i < j; i++)
        {
            if (b.b(i))
            {
                return true;
            }
        }

        return false;
    }

    protected final int c(int i)
    {
        return d * i;
    }

    public final boolean c()
    {
        return b.c();
    }

    protected final int d(int i)
    {
        return Math.min((i + 1) * d, b.g());
    }

    public final g e(int i)
    {
        return c;
    }

    public final long f(int i)
    {
        return b.f(d * i);
    }
}
