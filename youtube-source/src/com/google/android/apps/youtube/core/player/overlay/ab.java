// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            au, DefaultControlsOverlay, TimeBar, aa, 
//            ControlsState, p, DefaultOverflowOverlay

final class ab
    implements au
{

    final DefaultControlsOverlay a;

    private ab(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        a = defaultcontrolsoverlay;
        super();
    }

    ab(DefaultControlsOverlay defaultcontrolsoverlay, byte byte0)
    {
        this(defaultcontrolsoverlay);
    }

    public final void a()
    {
        DefaultControlsOverlay.b(a).setScrubbing(true);
        DefaultControlsOverlay.g(a).a();
    }

    public final void a(int i)
    {
        DefaultControlsOverlay.b(a).setScrubberTime(i);
    }

    public final void b()
    {
        if (DefaultControlsOverlay.h(a) == ControlsState.PLAYING)
        {
            DefaultControlsOverlay.a(a).b();
        } else
        {
            if (DefaultControlsOverlay.h(a) == ControlsState.PAUSED)
            {
                DefaultControlsOverlay.a(a).a();
                return;
            }
            if (DefaultControlsOverlay.h(a) == ControlsState.ENDED)
            {
                DefaultControlsOverlay.a(a).m();
                return;
            }
        }
    }

    public final void b(int i)
    {
        DefaultControlsOverlay.b(a).setScrubbing(false);
        DefaultControlsOverlay.g(a).a(i);
    }

    public final void c()
    {
        if (DefaultControlsOverlay.h(a) == ControlsState.PAUSED)
        {
            DefaultControlsOverlay.a(a).a();
        } else
        if (DefaultControlsOverlay.h(a) == ControlsState.ENDED)
        {
            DefaultControlsOverlay.a(a).m();
            return;
        }
    }

    public final void d()
    {
        if (DefaultControlsOverlay.h(a) == ControlsState.PLAYING)
        {
            DefaultControlsOverlay.a(a).b();
        }
    }

    public final void e()
    {
        DefaultControlsOverlay.i(a).c();
    }
}
