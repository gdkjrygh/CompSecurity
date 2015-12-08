// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import com.google.android.youtube.player.internal.at;

// Referenced classes of package com.google.android.youtube.player:
//            YouTubePlayerView, YouTubeInitializationResult

final class k
    implements at
{

    final YouTubePlayerView a;

    k(YouTubePlayerView youtubeplayerview)
    {
        a = youtubeplayerview;
        super();
    }

    public final void a(YouTubeInitializationResult youtubeinitializationresult)
    {
        YouTubePlayerView.a(a, youtubeinitializationresult);
        YouTubePlayerView.a(a, null);
    }
}
