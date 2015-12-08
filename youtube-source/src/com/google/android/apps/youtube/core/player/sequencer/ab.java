// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;


// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            y, u

final class ab
    implements Runnable
{

    final y a;

    ab(y y1)
    {
        a = y1;
        super();
    }

    public final void run()
    {
        if (y.a(a))
        {
            return;
        } else
        {
            a.a.a(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED);
            return;
        }
    }
}
