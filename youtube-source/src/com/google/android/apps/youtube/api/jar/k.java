// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import com.google.android.apps.youtube.core.player.overlay.bd;
import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ApiTvControlsOverlay

final class k
    implements bd
{

    final ApiTvControlsOverlay a;

    k(ApiTvControlsOverlay apitvcontrolsoverlay)
    {
        a = apitvcontrolsoverlay;
        super();
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        ApiTvControlsOverlay.b(a).a_(subtitletrack);
    }
}
