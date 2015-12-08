// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.core.Analytics;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            at, VideoInterruptManager, aw

final class ba
    implements at
{

    final VideoInterruptManager a;
    private final long b;
    private aw c;

    public ba(VideoInterruptManager videointerruptmanager)
    {
        a = videointerruptmanager;
        super();
        b = com.google.android.apps.youtube.core.player.VideoInterruptManager.b(videointerruptmanager).b();
    }

    static aw a(ba ba1)
    {
        return ba1.c;
    }

    public final void a()
    {
        if (VideoInterruptManager.e(a) != this)
        {
            throw new VideoInterruptManager.VideoInterruptStaleException();
        } else
        {
            com.google.android.apps.youtube.core.player.VideoInterruptManager.b(a, this);
            VideoInterruptManager.c(a, null);
            VideoInterruptManager.c(a).a("VideoInterruption", "InterruptionTime", (int)TimeUnit.SECONDS.convert(com.google.android.apps.youtube.core.player.VideoInterruptManager.b(a).b() - b, TimeUnit.MILLISECONDS));
            VideoInterruptManager.d(a);
            return;
        }
    }
}
