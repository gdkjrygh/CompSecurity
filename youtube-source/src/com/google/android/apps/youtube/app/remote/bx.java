// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreensMonitor

final class bx
    implements Runnable
{

    final SharedPreferences a;
    final YouTubeTvScreensMonitor b;

    bx(YouTubeTvScreensMonitor youtubetvscreensmonitor, SharedPreferences sharedpreferences)
    {
        b = youtubetvscreensmonitor;
        a = sharedpreferences;
        super();
    }

    public final void run()
    {
        YouTubeTvScreensMonitor.a(b, a);
    }
}
