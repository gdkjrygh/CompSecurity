// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import com.google.android.apps.youtube.core.player.overlay.ControlsState;
import com.google.android.apps.youtube.core.player.overlay.au;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ApiMobileControlsOverlay, ControlsBar, MinimalTimeBar, ai

final class e
    implements au
{

    final ApiMobileControlsOverlay a;

    private e(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        a = apimobilecontrolsoverlay;
        super();
    }

    e(ApiMobileControlsOverlay apimobilecontrolsoverlay, byte byte0)
    {
        this(apimobilecontrolsoverlay);
    }

    public final void a()
    {
        ApiMobileControlsOverlay.b(a);
        ApiMobileControlsOverlay.f(a).setScrubbing(true);
        ApiMobileControlsOverlay.g(a).setScrubbing(true);
        ApiMobileControlsOverlay.a(a).c();
    }

    public final void a(int i)
    {
        ApiMobileControlsOverlay.f(a).setScrubberTime(i);
        ApiMobileControlsOverlay.g(a).setScrubberTime(i);
    }

    public final void b()
    {
        if (ApiMobileControlsOverlay.h(a) == ControlsState.PLAYING)
        {
            ApiMobileControlsOverlay.a(a).b();
        } else
        {
            if (ApiMobileControlsOverlay.h(a) == ControlsState.PAUSED)
            {
                ApiMobileControlsOverlay.a(a).a();
                return;
            }
            if (ApiMobileControlsOverlay.h(a) == ControlsState.ENDED)
            {
                ApiMobileControlsOverlay.a(a).m();
                return;
            }
        }
    }

    public final void b(int i)
    {
        ApiMobileControlsOverlay.f(a).setScrubberTime(i);
        ApiMobileControlsOverlay.g(a).setScrubberTime(i);
        ApiMobileControlsOverlay.f(a).setScrubbing(false);
        ApiMobileControlsOverlay.g(a).setScrubbing(false);
        ApiMobileControlsOverlay.a(a).a(i);
    }

    public final void c()
    {
        if (ApiMobileControlsOverlay.h(a) == ControlsState.PAUSED)
        {
            ApiMobileControlsOverlay.a(a).a();
        } else
        if (ApiMobileControlsOverlay.h(a) == ControlsState.ENDED)
        {
            ApiMobileControlsOverlay.a(a).m();
            return;
        }
    }

    public final void d()
    {
        if (ApiMobileControlsOverlay.h(a) == ControlsState.PLAYING)
        {
            ApiMobileControlsOverlay.a(a).b();
        }
    }

    public final void e()
    {
        if (ApiMobileControlsOverlay.i(a))
        {
            ApiMobileControlsOverlay.a(a).g();
        }
    }
}
