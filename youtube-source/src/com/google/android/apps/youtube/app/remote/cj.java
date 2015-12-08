// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.ytremote.logic.c;
import com.google.android.apps.ytremote.model.AppStatus;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreen, YouTubeTvScreensMonitor, bk

final class cj
    implements c
{

    final YouTubeTvScreensMonitor a;
    private final Set b;

    public cj(YouTubeTvScreensMonitor youtubetvscreensmonitor, Set set)
    {
        a = youtubetvscreensmonitor;
        super();
        b = set;
    }

    public final void a(YouTubeDevice youtubedevice)
    {
        YouTubeTvScreen youtubetvscreen;
label0:
        {
            youtubetvscreen = new YouTubeTvScreen(youtubedevice.withNewDeviceName(YouTubeTvScreensMonitor.a(a, youtubedevice)));
            if (YouTubeTvScreensMonitor.n(a).b() == RemoteControl.State.CONNECTED && youtubetvscreen.equals(YouTubeTvScreensMonitor.n(a).x()) && youtubedevice.hasAppStatus() && youtubedevice.getAppStatus().getStatus() == 2)
            {
                YouTubeTvScreensMonitor.a(a, (new StringBuilder("The app status for ")).append(youtubedevice).append(" is STOPPED. Will remove the route!").toString());
                YouTubeTvScreensMonitor.e(a, youtubetvscreen);
                b.remove(youtubetvscreen);
                return;
            }
            YouTubeTvScreensMonitor.g(a).put(youtubedevice.getSsdpId(), Integer.valueOf(0));
            Object obj = YouTubeTvScreensMonitor.a(a, youtubedevice.getSsdpId());
            if (obj != null)
            {
                obj = ((YouTubeTvScreen) (obj)).getDevice();
                if (!youtubedevice.hasAppStatus() || ((YouTubeDevice) (obj)).hasAppStatus() && youtubedevice.getAppStatus().appInfoEquals(((YouTubeDevice) (obj)).getAppStatus()) || YouTubeTvScreensMonitor.n(a).b() == RemoteControl.State.CONNECTED && youtubetvscreen.equals(YouTubeTvScreensMonitor.n(a).x()))
                {
                    break label0;
                }
            }
            YouTubeTvScreensMonitor.a(a, youtubetvscreen);
        }
        b.remove(youtubetvscreen);
    }
}
