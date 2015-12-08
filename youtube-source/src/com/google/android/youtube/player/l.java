// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.view.View;
import com.google.android.youtube.player.internal.aq;
import java.util.Set;

// Referenced classes of package com.google.android.youtube.player:
//            YouTubePlayerView

final class l
    implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener
{

    final YouTubePlayerView a;

    private l(YouTubePlayerView youtubeplayerview)
    {
        a = youtubeplayerview;
        super();
    }

    l(YouTubePlayerView youtubeplayerview, byte byte0)
    {
        this(youtubeplayerview);
    }

    public final void onGlobalFocusChanged(View view, View view1)
    {
        if (YouTubePlayerView.c(a) != null && YouTubePlayerView.f(a).contains(view1) && !YouTubePlayerView.f(a).contains(view))
        {
            YouTubePlayerView.c(a).g();
        }
    }
}
