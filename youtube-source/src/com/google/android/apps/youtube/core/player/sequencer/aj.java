// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            ae

final class aj
    implements Runnable
{

    final ae a;
    private final Exception b;

    public aj(ae ae1, Exception exception)
    {
        a = ae1;
        super();
        b = exception;
    }

    public final void run()
    {
        a.i = null;
        a.c.c(new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.WATCH_NEXT_ERROR, true, a.e.a(b), b));
    }
}
