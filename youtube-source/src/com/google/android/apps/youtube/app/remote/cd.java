// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreensMonitor, bi, YouTubeTvScreen

final class cd
    implements Runnable
{

    final YouTubeTvScreen a;
    final YouTubeTvScreensMonitor b;

    cd(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeTvScreen youtubetvscreen)
    {
        b = youtubetvscreensmonitor;
        a = youtubetvscreen;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = YouTubeTvScreensMonitor.i(b).iterator(); iterator.hasNext(); ((bi)iterator.next()).a(a)) { }
    }
}
