// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;


// Referenced classes of package com.google.android.youtube.player:
//            m, YouTubeBaseActivity, YouTubePlayerView

final class b
    implements m
{

    final YouTubeBaseActivity a;

    private b(YouTubeBaseActivity youtubebaseactivity)
    {
        a = youtubebaseactivity;
        super();
    }

    b(YouTubeBaseActivity youtubebaseactivity, byte byte0)
    {
        this(youtubebaseactivity);
    }

    public final void a(YouTubePlayerView youtubeplayerview)
    {
        if (YouTubeBaseActivity.a(a) != null && YouTubeBaseActivity.a(a) != youtubeplayerview)
        {
            YouTubeBaseActivity.a(a).b(true);
        }
        YouTubeBaseActivity.a(a, youtubeplayerview);
        if (YouTubeBaseActivity.b(a) > 0)
        {
            youtubeplayerview.a();
        }
        if (YouTubeBaseActivity.b(a) >= 2)
        {
            youtubeplayerview.b();
        }
    }
}
