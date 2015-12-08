// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.ytremote.b.c;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreensMonitor

final class by
    implements af
{

    final c a;
    final YouTubeTvScreensMonitor b;

    by(YouTubeTvScreensMonitor youtubetvscreensmonitor, c c1)
    {
        b = youtubetvscreensmonitor;
        a = c1;
        super();
    }

    public final volatile void a(Object obj, b b1)
    {
        obj = (Uri)obj;
        b1.a(obj, a.a(((Uri) (obj))));
    }
}
