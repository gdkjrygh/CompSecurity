// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Handler;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.PairingCode;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreen, YouTubeTvScreensMonitor, cf

final class ce
    implements b
{

    final b a;
    final YouTubeTvScreensMonitor b;

    ce(YouTubeTvScreensMonitor youtubetvscreensmonitor, b b1)
    {
        b = youtubetvscreensmonitor;
        a = b1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (PairingCode)obj;
        a.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (PairingCode)obj;
        obj1 = (YouTubeTvScreen)obj1;
        com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor.b(b, ((YouTubeTvScreen) (obj1)));
        YouTubeTvScreensMonitor.e(b).post(new cf(this, ((PairingCode) (obj)), ((YouTubeTvScreen) (obj1))));
    }
}
