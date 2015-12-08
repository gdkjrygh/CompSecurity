// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bu, DefaultControlsOverlay, p, TimeBar

final class aa
    implements bu
{

    final DefaultControlsOverlay a;

    private aa(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        a = defaultcontrolsoverlay;
        super();
    }

    aa(DefaultControlsOverlay defaultcontrolsoverlay, byte byte0)
    {
        this(defaultcontrolsoverlay);
    }

    public final void a()
    {
        a.i();
        DefaultControlsOverlay.a(a).c();
    }

    public final void a(int i)
    {
        DefaultControlsOverlay.b(a).setScrubbing(false);
        DefaultControlsOverlay.a(a).a(i);
    }
}
