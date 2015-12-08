// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup;
import com.google.android.apps.youtube.core.player.notification.j;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            BackgroundPlayerService, ae

final class g
    implements j
{

    final BackgroundPlayerService a;

    private g(BackgroundPlayerService backgroundplayerservice)
    {
        a = backgroundplayerservice;
        super();
    }

    g(BackgroundPlayerService backgroundplayerservice, byte byte0)
    {
        this(backgroundplayerservice);
    }

    public final void a()
    {
        BackgroundPlayerService.c(a).a(BackgroundPlayerService.b(a).p(), BackgroundPlayerService.b(a).q());
    }

    public final void a(long l)
    {
        BackgroundPlayerService.b(a).c((int)l);
    }

    public final void b()
    {
        BackgroundPlayerService.b(a).i();
    }

    public final void c()
    {
        BackgroundPlayerService.b(a).l();
    }

    public final void d()
    {
        if (BackgroundPlayerService.d(a))
        {
            BackgroundPlayerService.b(a).l();
            return;
        } else
        {
            BackgroundPlayerService.b(a).i();
            return;
        }
    }

    public final void e()
    {
        if (BackgroundPlayerService.a(a) <= 3000L && BackgroundPlayerService.b(a).p())
        {
            BackgroundPlayerService.b(a).r();
            return;
        } else
        {
            BackgroundPlayerService.b(a).c(0);
            return;
        }
    }

    public final void f()
    {
        BackgroundPlayerService.b(a).s();
    }

    public final void g()
    {
        BackgroundPlayerService.b(a).E();
        a.stopSelf();
    }

    public final void h()
    {
        BackgroundPlayerService.b(a).j();
    }
}
