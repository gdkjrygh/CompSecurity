// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            y, u, r

final class z
    implements Runnable
{

    final PlaybackPair a;
    final y b;

    z(y y1, PlaybackPair playbackpair)
    {
        b = y1;
        a = playbackpair;
        super();
    }

    public final void run()
    {
        if (y.a(b))
        {
            return;
        }
        b.a.h = a;
        if (!b.a.g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED))
        {
            b.a.a(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED);
        }
        b.a.b.a(a);
    }
}
