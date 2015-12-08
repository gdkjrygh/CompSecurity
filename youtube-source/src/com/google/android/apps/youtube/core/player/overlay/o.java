// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.a.a.a.a.be;
import com.google.a.a.a.a.fc;
import com.google.a.a.a.a.ne;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.s;
import com.google.android.apps.youtube.datalib.d.a;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            h, i

final class o
    implements h
{

    final i a;

    private o(i j)
    {
        a = j;
        super();
    }

    o(i j, byte byte0)
    {
        this(j);
    }

    public final void a(boolean flag)
    {
label0:
        {
            if (i.e(a) != null)
            {
                if (!flag)
                {
                    break label0;
                }
                if (i.e(a).i != null)
                {
                    i.c(a).a(i.e(a).i);
                }
            }
            return;
        }
        i.f(a)[i.g(a)] = true;
        i.b(a, true);
    }

    public final void b()
    {
        i.h(a)[i.g(a)] = true;
        i.i(a);
    }

    public final void c()
    {
        if (i.b(a) != null && i.b(a).b != null && i.b(a).b.g != null)
        {
            i.c(a).a(i.b(a).b.g);
        }
    }

    public final void d()
    {
        com.google.android.apps.youtube.core.player.overlay.i.a(a, true);
        i.d(a);
    }

    public final void e()
    {
        if (i.j(a) >= 0)
        {
            com.google.android.apps.youtube.core.player.overlay.i.a(a, i.j(a));
            i.k(a).l();
            i.m(a).a(i.l(a), i.j(a));
        }
    }
}
