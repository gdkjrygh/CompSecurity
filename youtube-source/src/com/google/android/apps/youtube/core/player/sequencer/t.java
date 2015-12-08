// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            s, r

public final class t
    implements b
{

    final s a;

    protected t(s s1)
    {
        a = s1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        a.p = a.q;
        a.h = null;
        a.a(new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.REQUEST_FAILED, true, a.e.a(exception), exception));
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (PlaybackPair)obj1;
        a.h = ((PlaybackPair) (obj));
        a.p = a.q;
        a.a(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED);
        a.b.a(((PlaybackPair) (obj)));
    }
}
