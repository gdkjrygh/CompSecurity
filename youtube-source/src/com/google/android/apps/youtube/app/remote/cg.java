// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Handler;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.CloudScreen;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreen, YouTubeTvScreensMonitor, ch

final class cg
    implements b
{

    final CloudScreen a;
    final b b;
    final YouTubeTvScreensMonitor c;

    cg(YouTubeTvScreensMonitor youtubetvscreensmonitor, CloudScreen cloudscreen, b b1)
    {
        c = youtubetvscreensmonitor;
        a = cloudscreen;
        b = b1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (CloudScreen)obj;
        b.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = new YouTubeTvScreen(a);
        com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor.b(c, ((YouTubeTvScreen) (obj)));
        YouTubeTvScreensMonitor.e(c).post(new ch(this, ((YouTubeTvScreen) (obj))));
    }
}
