// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.app.Activity;
import com.google.android.youtube.player.internal.PlayerViewPlaceHolder;
import com.google.android.youtube.player.internal.aq;
import com.google.android.youtube.player.internal.as;

// Referenced classes of package com.google.android.youtube.player:
//            YouTubePlayerView

final class j
    implements as
{

    final Activity a;
    final YouTubePlayerView b;

    j(YouTubePlayerView youtubeplayerview, Activity activity)
    {
        b = youtubeplayerview;
        a = activity;
        super();
    }

    public final void a()
    {
        if (YouTubePlayerView.a(b) != null)
        {
            YouTubePlayerView.a(b, a);
        }
        YouTubePlayerView.a(b, null);
    }

    public final void b()
    {
        if (!YouTubePlayerView.b(b) && YouTubePlayerView.c(b) != null)
        {
            YouTubePlayerView.c(b).f();
        }
        YouTubePlayerView.d(b).a();
        if (b.indexOfChild(YouTubePlayerView.d(b)) < 0)
        {
            b.addView(YouTubePlayerView.d(b));
            b.removeView(YouTubePlayerView.e(b));
        }
        YouTubePlayerView.a(b, null);
        YouTubePlayerView.a(b, null);
        YouTubePlayerView.a(b, null);
    }
}
