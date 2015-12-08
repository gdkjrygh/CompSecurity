// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            ae

final class ag
    implements Runnable
{

    final WatchNextResponse a;
    final ae b;

    ag(ae ae1, WatchNextResponse watchnextresponse)
    {
        b = ae1;
        a = watchnextresponse;
        super();
    }

    public final void run()
    {
        b.i = a;
        b.a(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED);
    }
}
