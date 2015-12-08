// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.view.View;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            e, g, n

public abstract class m extends e
{

    private final g b;

    public m(g g1)
    {
        b = (g)c.a(g1);
    }

    public static final m a(View view, boolean flag)
    {
        return new n(view, false);
    }

    public final Object a(int i)
    {
        return null;
    }

    protected final void a(Set set)
    {
        set.add(b);
    }

    public final int b()
    {
        return 1;
    }

    public final g e(int i)
    {
        return b;
    }
}
