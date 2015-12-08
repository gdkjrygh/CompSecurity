// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            k

final class m
    implements Runnable
{

    final PlaybackPair a;
    final k b;

    m(k k1, PlaybackPair playbackpair)
    {
        b = k1;
        a = playbackpair;
        super();
    }

    public final void run()
    {
        k.a(b, a);
    }
}
