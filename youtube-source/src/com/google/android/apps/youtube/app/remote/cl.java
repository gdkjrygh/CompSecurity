// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            au, YouTubeTvScreensMonitor, YouTubeTvScreen

final class cl
    implements au
{

    final YouTubeTvScreensMonitor a;

    private cl(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        a = youtubetvscreensmonitor;
        super();
    }

    cl(YouTubeTvScreensMonitor youtubetvscreensmonitor, byte byte0)
    {
        this(youtubetvscreensmonitor);
    }

    public final void a(YouTubeTvScreen youtubetvscreen)
    {
        if (YouTubeTvScreensMonitor.c(a).contains(youtubetvscreen) && !youtubetvscreen.hasDevice())
        {
            YouTubeTvScreensMonitor.m(a).remove(youtubetvscreen);
            YouTubeTvScreensMonitor.c(a).remove(youtubetvscreen);
            YouTubeTvScreensMonitor.c(a, youtubetvscreen);
        }
    }
}
