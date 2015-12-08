// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.event;

import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

public final class v
{

    private final com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage a;
    private final PlaybackPair b;
    private final WatchNextResponse c;

    public v(com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage sequencerstage, PlaybackPair playbackpair, WatchNextResponse watchnextresponse)
    {
        a = sequencerstage;
        b = playbackpair;
        c = watchnextresponse;
    }

    public final com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage a()
    {
        return a;
    }

    public final PlaybackPair b()
    {
        return b;
    }

    public final WatchNextResponse c()
    {
        return c;
    }
}
