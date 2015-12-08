// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreensMonitor, YouTubeTvScreen

final class cn
    implements Runnable
{

    final YouTubeTvScreensMonitor a;
    private final YouTubeTvScreen b;
    private final YouTubeTvScreen c;
    private final b d;

    public cn(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeTvScreen youtubetvscreen, YouTubeTvScreen youtubetvscreen1, b b1)
    {
        a = youtubetvscreensmonitor;
        super();
        b = youtubetvscreen;
        c = youtubetvscreen1;
        d = b1;
    }

    public final void run()
    {
        YouTubeTvScreensMonitor.a(a, YouTubeTvScreensMonitor.l(a));
        YouTubeTvScreensMonitor.j(a).put(b.getDevice().getSsdpId(), c.getScreenName());
        YouTubeTvScreensMonitor.k(a).add(b.getDevice().getSsdpId());
        for (; YouTubeTvScreensMonitor.k(a).size() > 10; YouTubeTvScreensMonitor.k(a).remove(0)) { }
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        SsdpId ssdpid;
        for (Iterator iterator = YouTubeTvScreensMonitor.k(a).iterator(); iterator.hasNext(); stringbuilder1.append((String)YouTubeTvScreensMonitor.j(a).get(ssdpid)).append(","))
        {
            ssdpid = (SsdpId)iterator.next();
            stringbuilder.append(ssdpid).append(",");
        }

        YouTubeTvScreensMonitor.l(a).edit().putString("dial_device_ids", stringbuilder.toString()).putString("dial_device_names", stringbuilder1.toString()).apply();
        d.a(b, c);
    }
}
