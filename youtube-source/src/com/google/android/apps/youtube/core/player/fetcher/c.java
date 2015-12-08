// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.fetcher;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.player.fetcher:
//            PlayerFetcher

final class c
    implements Runnable
{

    final b a;
    final Exception b;
    final PlayerFetcher c;

    c(PlayerFetcher playerfetcher, b b1, Exception exception)
    {
        c = playerfetcher;
        a = b1;
        b = exception;
        super();
    }

    public final void run()
    {
        a.a(null, b);
    }
}
