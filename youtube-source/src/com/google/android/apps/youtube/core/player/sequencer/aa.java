// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            y, u

final class aa
    implements Runnable
{

    final Exception a;
    final y b;

    aa(y y1, Exception exception)
    {
        b = y1;
        a = exception;
        super();
    }

    public final void run()
    {
        if (y.a(b))
        {
            return;
        } else
        {
            b.a.a(new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.REQUEST_FAILED, true, b.a.e.a(a), a));
            return;
        }
    }
}
