// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.service;

import android.os.Bundle;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.internal.a;
import com.google.android.youtube.player.internal.d;

// Referenced classes of package com.google.android.youtube.api.service:
//            YouTubeService, d

final class b extends a
{

    final YouTubeService a;

    private b(YouTubeService youtubeservice)
    {
        a = youtubeservice;
        super();
    }

    b(YouTubeService youtubeservice, byte byte0)
    {
        this(youtubeservice);
    }

    public final void a(d d1, int i, String s, String s1, String s2, Bundle bundle)
    {
        if (i < 1000)
        {
            com.google.android.youtube.api.service.YouTubeService.a(d1, YouTubeInitializationResult.CLIENT_LIBRARY_UPDATE_REQUIRED);
            return;
        }
        if (!com.google.android.youtube.api.service.YouTubeService.a(a, s))
        {
            com.google.android.youtube.api.service.YouTubeService.a(d1, YouTubeInitializationResult.INTERNAL_ERROR);
            return;
        } else
        {
            new com.google.android.youtube.api.service.d(a, com.google.android.youtube.api.service.YouTubeService.a(a), s2, s, s1, com.google.android.youtube.player.internal.b.b.a(i), d1);
            return;
        }
    }
}
