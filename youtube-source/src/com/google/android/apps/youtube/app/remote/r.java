// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.media.j;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreen, bk, YouTubeTvScreensMonitor, s

public class r extends j
{

    protected final bk a;
    private final YouTubeTvScreen b;
    private final YouTubeTvScreensMonitor c;
    private final Handler d = new s(this);
    private long e;
    private long f;
    private int g;

    public r(YouTubeTvScreen youtubetvscreen, bk bk1, YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        e = 0L;
        f = 0L;
        g = 0;
        b = (YouTubeTvScreen)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreen);
        a = (bk)com.google.android.apps.youtube.common.fromguava.c.a(bk1);
        c = (YouTubeTvScreensMonitor)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreensmonitor);
    }

    public final void a(int i)
    {
        d.removeMessages(0);
        if (SystemClock.elapsedRealtime() - f > 200L)
        {
            f = SystemClock.elapsedRealtime();
            a.d(i);
        } else
        {
            d.sendMessageDelayed(Message.obtain(d, 0, i, 0), 200L);
        }
        super.a(i);
    }

    public final void b(int i)
    {
        d.removeMessages(1);
        g = g + i;
        if (SystemClock.elapsedRealtime() - e > 200L)
        {
            e = SystemClock.elapsedRealtime();
            a.b(g);
            g = 0;
            return;
        } else
        {
            d.sendMessageDelayed(Message.obtain(d, 1, g, 0), 200L);
            return;
        }
    }

    public void c()
    {
        boolean flag = c.a().contains(b);
        a.a(flag);
    }
}
