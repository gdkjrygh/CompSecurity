// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.fetcher;

import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.fetcher:
//            PlayerFetcher

final class b
    implements Runnable
{

    final com.google.android.apps.youtube.common.a.b a;
    final PlaybackPair b;
    final PlayerFetcher c;

    b(PlayerFetcher playerfetcher, com.google.android.apps.youtube.common.a.b b1, PlaybackPair playbackpair)
    {
        c = playerfetcher;
        a = b1;
        b = playbackpair;
        super();
    }

    public final void run()
    {
        a.a(null, b);
    }
}
