// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.AppStatus;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreensMonitor, YouTubeTvScreen

final class ci
    implements b
{

    final YouTubeTvScreensMonitor a;
    private final YouTubeTvScreen b;

    public ci(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeTvScreen youtubetvscreen)
    {
        a = youtubetvscreensmonitor;
        super();
        b = youtubetvscreen;
    }

    public final void a(Object obj, Exception exception)
    {
        L.a((new StringBuilder("Error on retrieving app status for ")).append(b).toString(), exception);
        YouTubeTvScreensMonitor.e(a, b);
    }

    public final void a(Object obj, Object obj1)
    {
        int i = ((AppStatus)obj1).getStatus();
        YouTubeTvScreensMonitor.a(a, (new StringBuilder("App status for ")).append(b.getScreenName()).append(" is ").append(i).append(".").toString());
        if (i != 1 && i != 2)
        {
            YouTubeTvScreensMonitor.e(a, b);
        }
    }
}
