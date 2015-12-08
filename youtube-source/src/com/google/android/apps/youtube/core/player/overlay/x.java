// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bd, DefaultControlsOverlay, p

final class x
    implements bd
{

    final DefaultControlsOverlay a;

    x(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        a = defaultcontrolsoverlay;
        super();
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        DefaultControlsOverlay.a(a).a_(subtitletrack);
    }
}
