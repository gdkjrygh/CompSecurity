// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.jar.ac;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            a

final class t
    implements ac
{

    final a a;

    private t(a a1)
    {
        a = a1;
        super();
    }

    t(a a1, byte byte0)
    {
        this(a1);
    }

    public final void a(String s)
    {
        com.google.android.apps.youtube.api.jar.a.a.a(a, (new StringBuilder("YouTube video playback stopped due to unauthorized overlay on top of player. ")).append(s).toString(), com.google.android.youtube.player.YouTubePlayer.ErrorReason.UNAUTHORIZED_OVERLAY);
    }

    public final void b(String s)
    {
        com.google.android.apps.youtube.api.jar.a.a.a(a, (new StringBuilder("YouTube video playback stopped due to the player's view being too small. ")).append(s).toString(), com.google.android.youtube.player.YouTubePlayer.ErrorReason.PLAYER_VIEW_TOO_SMALL);
    }

    public final void c(String s)
    {
        com.google.android.apps.youtube.api.jar.a.a.a(a, (new StringBuilder("YouTube video playback stopped because the player's view is not visible. ")).append(s).toString(), com.google.android.youtube.player.YouTubePlayer.ErrorReason.PLAYER_VIEW_NOT_VISIBLE);
    }
}
