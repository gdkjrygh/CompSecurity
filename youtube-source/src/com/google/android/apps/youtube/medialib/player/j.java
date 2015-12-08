// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import com.google.android.apps.youtube.common.L;
import com.google.android.exoplayer.DecoderInitializationException;
import com.google.android.exoplayer.af;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            i, y, YouTubePlayerEvents

final class j
    implements af
{

    final i a;

    private j(i k)
    {
        a = k;
        super();
    }

    j(i k, byte byte0)
    {
        this(k);
    }

    public final void a()
    {
        if (i.d(a) != null)
        {
            i.d(a).d();
        }
    }

    public final void a(int k)
    {
        i.h(a).d(k);
    }

    public final void a(int k, int l)
    {
        i.a(a, k);
        i.b(a, l);
        if (i.d(a) != null && i.d(a).h())
        {
            i.d(a).setVideoSize(i.b(a), i.c(a));
        }
    }

    public final void a(android.media.MediaCodec.CryptoException cryptoexception)
    {
        L.a("CryptoError with ExoPlayer.", cryptoexception);
        i.h(a).a(cryptoexception);
    }

    public final void a(DecoderInitializationException decoderinitializationexception)
    {
        L.a("Error with ExoPlayer decoder initialization.", decoderinitializationexception);
        i.h(a).a(decoderinitializationexception);
    }
}
