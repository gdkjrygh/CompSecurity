// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            af, DefaultControlsOverlay, p, ad

final class z
    implements af
{

    final DefaultControlsOverlay a;

    private z(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        a = defaultcontrolsoverlay;
        super();
    }

    z(DefaultControlsOverlay defaultcontrolsoverlay, byte byte0)
    {
        this(defaultcontrolsoverlay);
    }

    public final void a()
    {
        DefaultControlsOverlay.a(a).f();
    }

    public final void b()
    {
        DefaultControlsOverlay.a(a).g();
    }

    public final void c()
    {
        DefaultControlsOverlay.c(a).c();
    }

    public final void d()
    {
        DefaultControlsOverlay.a(a).h();
    }

    public final void e()
    {
        a.a();
        DefaultControlsOverlay.e(a).startAnimation(DefaultControlsOverlay.d(a));
        DefaultControlsOverlay.e(a).setVisibility(0);
        DefaultControlsOverlay.f(a);
    }
}
