// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.async.b;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreensMonitor, bw, YouTubeTvScreen, bk, 
//            ci, ck

final class bz extends Handler
{

    final h a;
    final bw b;
    final bk c;
    final b d;
    final YouTubeTvScreensMonitor e;

    bz(YouTubeTvScreensMonitor youtubetvscreensmonitor, h h1, bw bw1, bk bk1, b b1)
    {
        e = youtubetvscreensmonitor;
        a = h1;
        b = bw1;
        c = bk1;
        d = b1;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (YouTubeTvScreensMonitor.a(e)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            if (a.a())
            {
                b.a(com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor.b(e));
            } else
            {
                if (!YouTubeTvScreensMonitor.c(e).isEmpty())
                {
                    YouTubeTvScreensMonitor.a(e, "Network unavailable. Removing all screens.");
                }
                YouTubeTvScreensMonitor.d(e);
            }
            YouTubeTvScreensMonitor.e(e).sendEmptyMessageDelayed(0, 5000L);
            return;

        case 1: // '\001'
            YouTubeTvScreensMonitor.f(e);
            if (!YouTubeTvScreensMonitor.e(e).hasMessages(1))
            {
                YouTubeTvScreensMonitor.e(e).sendEmptyMessageDelayed(1, 10000L);
                return;
            }
            break;

        case 2: // '\002'
            message = (Set)message.obj;
            if (!message.isEmpty())
            {
                message = message.iterator();
                while (message.hasNext()) 
                {
                    YouTubeTvScreen youtubetvscreen = (YouTubeTvScreen)message.next();
                    SsdpId ssdpid = youtubetvscreen.getDevice().getSsdpId();
                    Integer integer = (Integer)YouTubeTvScreensMonitor.g(e).get(ssdpid);
                    if (integer != null && integer.intValue() < 5 && c.a(youtubetvscreen))
                    {
                        YouTubeTvScreensMonitor.a(e, (new StringBuilder("RemoteControl connected/connecting to ")).append(youtubetvscreen.getScreenName()).append(" . Will not remove the screen from the list of available devices even though it timed out. Time out count: ").append(integer.intValue() + 1).toString());
                        YouTubeTvScreensMonitor.g(e).put(ssdpid, Integer.valueOf(integer.intValue() + 1));
                    } else
                    {
                        YouTubeTvScreensMonitor.a(e, (new StringBuilder("Screen ")).append(youtubetvscreen.getScreenName()).append(" timed out. Will check the app status.").toString());
                        d.a(youtubetvscreen.getDevice().getAppUri(), new ci(e, youtubetvscreen));
                    }
                }
            }
            break;

        case 3: // '\003'
            Object obj = (Pair)message.obj;
            message = (SsdpId)((Pair) (obj)).first;
            obj = (ck)((Pair) (obj)).second;
            if (!((Boolean)com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor.h(e).get(message)).booleanValue())
            {
                ((ck) (obj)).a();
            }
            com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor.h(e).remove(message);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
