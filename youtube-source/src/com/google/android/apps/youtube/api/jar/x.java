// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout;
import com.google.android.apps.youtube.core.ui.g;
import com.google.android.apps.youtube.core.ui.h;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            w, a, z

final class x extends w
    implements h
{

    private final g f;
    private boolean g;
    private boolean h;

    public x(Context context, a a1, z z, PlayerOverlaysLayout playeroverlayslayout)
    {
        super(context, a1, z);
        c.a(playeroverlayslayout, "playerOverlaysLayout cannot be null");
        f = new g(a1.d(), a1.a(), playeroverlayslayout, this);
    }

    private void j()
    {
        if (e)
        {
            g g1 = f;
            boolean flag;
            if (!g && !h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g1.c(flag);
        }
    }

    public final void a()
    {
        f.a();
        super.a();
    }

    public final void a(int k)
    {
        super.a(k);
        f.d(d);
    }

    public final void d(boolean flag)
    {
        h = flag;
        j();
    }

    public final void f()
    {
        g = true;
        j();
    }

    public final void g()
    {
        g = false;
        j();
    }

    final void h()
    {
        f.b(true);
        j();
    }

    final void i()
    {
        f.b(false);
    }
}
