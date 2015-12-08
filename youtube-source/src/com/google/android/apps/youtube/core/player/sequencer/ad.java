// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            y, u

final class ad
    implements Runnable
{

    final Exception a;
    final y b;

    ad(y y1, Exception exception)
    {
        b = y1;
        a = exception;
        super();
    }

    public final void run()
    {
        if (com.google.android.apps.youtube.core.player.sequencer.y.a(b))
        {
            return;
        } else
        {
            b.a.c.c(new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.WATCH_NEXT_ERROR, true, b.a.e.a(a), a));
            return;
        }
    }
}
