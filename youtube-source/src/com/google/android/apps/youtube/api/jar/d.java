// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import com.google.android.apps.youtube.core.player.overlay.bd;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ApiMobileControlsOverlay, ai

final class d
    implements bd
{

    final ApiMobileControlsOverlay a;

    d(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        a = apimobilecontrolsoverlay;
        super();
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        ApiMobileControlsOverlay.a(a).a_(subtitletrack);
    }
}
