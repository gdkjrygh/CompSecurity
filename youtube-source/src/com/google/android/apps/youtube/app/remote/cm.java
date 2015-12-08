// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.ytremote.model.CloudScreen;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            av, YouTubeTvScreensMonitor, bk, YouTubeTvScreen, 
//            a

final class cm extends av
{

    final YouTubeTvScreensMonitor a;

    private cm(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        a = youtubetvscreensmonitor;
        super();
    }

    cm(YouTubeTvScreensMonitor youtubetvscreensmonitor, byte byte0)
    {
        this(youtubetvscreensmonitor);
    }

    public final void a(RemoteControl.State state)
    {
        if ((RemoteControl.State.CONNECTED.equals(state) || RemoteControl.State.CONNECTING.equals(state)) && YouTubeTvScreensMonitor.n(a).x().hasScreen())
        {
            com.google.android.apps.youtube.app.remote.a.a(YouTubeTvScreensMonitor.o(a), YouTubeTvScreensMonitor.n(a).x().getScreen().getScreenId());
        }
    }
}
