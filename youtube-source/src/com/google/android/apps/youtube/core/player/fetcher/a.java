// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.fetcher;

import com.google.android.apps.youtube.common.a.b;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.core.player.fetcher:
//            PlayerFetcher

final class a
    implements Runnable
{

    final String a;
    final byte b[];
    final String c;
    final String d;
    final int e;
    final int f;
    final b g;
    final PlayerFetcher h;

    a(PlayerFetcher playerfetcher, String s, byte abyte0[], String s1, String s2, int i, int j, 
            b b1)
    {
        h = playerfetcher;
        a = s;
        b = abyte0;
        c = s1;
        d = s2;
        e = i;
        f = j;
        g = b1;
        super();
    }

    public final void run()
    {
        try
        {
            com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair playbackpair = h.a(a, b, c, d, e, f);
            PlayerFetcher.a(h, g, playbackpair);
            return;
        }
        catch (ExecutionException executionexception)
        {
            PlayerFetcher.a(h, g, executionexception);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            PlayerFetcher.a(h, g, interruptedexception);
        }
    }
}
