// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Handler;
import android.util.Pair;
import com.google.android.apps.ytremote.logic.c;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreensMonitor, YouTubeTvScreen, cb, ck

final class ca
    implements c
{

    final SsdpId a;
    final ck b;
    final YouTubeTvScreensMonitor c;

    ca(YouTubeTvScreensMonitor youtubetvscreensmonitor, SsdpId ssdpid, ck ck)
    {
        c = youtubetvscreensmonitor;
        a = ssdpid;
        b = ck;
        super();
    }

    public final void a(YouTubeDevice youtubedevice)
    {
        if (!((Boolean)YouTubeTvScreensMonitor.h(c).get(a)).booleanValue() && youtubedevice.getSsdpId().equals(a))
        {
            YouTubeTvScreensMonitor.h(c).put(a, Boolean.valueOf(true));
            YouTubeTvScreensMonitor.e(c).removeMessages(3, new Pair(a, b));
            youtubedevice = new YouTubeTvScreen(youtubedevice);
            YouTubeTvScreensMonitor.a(c, youtubedevice);
            YouTubeTvScreensMonitor.e(c).post(new cb(this, youtubedevice));
        }
    }
}
