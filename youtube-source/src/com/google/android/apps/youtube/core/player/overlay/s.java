// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.event.ScriptedPlaybackEvent;
import com.google.android.apps.youtube.core.player.event.aa;
import com.google.android.apps.youtube.core.player.event.b;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            p, q, t, ControlsOverlay

final class s
    implements p
{

    final q a;
    private boolean b;

    private s(q q1)
    {
        a = q1;
        super();
    }

    s(q q1, byte byte0)
    {
        this(q1);
    }

    private void a(ScriptedPlaybackEvent scriptedplaybackevent)
    {
        if (b)
        {
            q.e(a).c(scriptedplaybackevent);
        }
    }

    public final void a()
    {
        a(ScriptedPlaybackEvent.PLAYER_CONTROL);
        com.google.android.apps.youtube.core.player.overlay.q.a(a).i();
        b = false;
    }

    public final void a(int i1)
    {
        com.google.android.apps.youtube.core.player.overlay.q.a(a).c(i1);
        a(ScriptedPlaybackEvent.PLAYER_CONTROL);
        com.google.android.apps.youtube.core.player.overlay.q.a(a).i();
        b = false;
    }

    public final void a_(SubtitleTrack subtitletrack)
    {
        if (q.c(a) != null)
        {
            q.c(a).a(subtitletrack);
        }
        b = false;
    }

    public final void b()
    {
        com.google.android.apps.youtube.core.player.overlay.q.a(a).l();
        b = false;
    }

    public final void b(boolean flag)
    {
        com.google.android.apps.youtube.core.player.overlay.q.a(a).d(flag);
        b = false;
    }

    public final void c()
    {
        com.google.android.apps.youtube.core.player.overlay.q.a(a).l();
        b = false;
    }

    public final void d()
    {
        a(ScriptedPlaybackEvent.NAVIGATION);
        com.google.android.apps.youtube.core.player.overlay.q.a(a).s();
        b = false;
    }

    public final void e()
    {
        a(ScriptedPlaybackEvent.NAVIGATION);
        com.google.android.apps.youtube.core.player.overlay.q.a(a).r();
        b = false;
    }

    public final void f()
    {
        a(ScriptedPlaybackEvent.PLAYER_CONTROL);
        com.google.android.apps.youtube.core.player.overlay.q.a(a).D();
        b = false;
    }

    public final void g()
    {
        if (q.c(a) != null)
        {
            q.c(a).a();
        }
        b = false;
    }

    public final void h()
    {
        if (q.d(a))
        {
            com.google.android.apps.youtube.core.player.overlay.q.a(a).y();
        } else
        {
            com.google.android.apps.youtube.core.player.overlay.q.a(a).z();
        }
        b = false;
    }

    public final void i()
    {
        q.e(a).c(new b());
        b = false;
    }

    public final void j()
    {
        q.e(a).c(new aa(true));
        b = false;
    }

    public final void k()
    {
        q.e(a).c(new aa(false));
        b = false;
    }

    public final void l()
    {
        a(ScriptedPlaybackEvent.PLAYER_CONTROL);
        com.google.android.apps.youtube.core.player.overlay.q.a(a).m();
        b = false;
    }

    public final void m()
    {
        com.google.android.apps.youtube.core.player.overlay.q.b(a).d();
        a(ScriptedPlaybackEvent.PLAYER_CONTROL);
        com.google.android.apps.youtube.core.player.overlay.q.a(a).j();
        b = false;
    }

    public final void n()
    {
        b = true;
    }
}
