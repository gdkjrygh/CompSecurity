// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.os.Looper;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            au, ax, av, ba, 
//            az, ay

public final class VideoInterruptManager
    implements au
{

    private final az a;
    private final Executor b;
    private final Analytics c;
    private final b d;
    private volatile boolean e;
    private volatile ba f;
    private volatile av g;
    private boolean h;
    private final LinkedBlockingQueue i = new LinkedBlockingQueue();
    private final Runnable j = new ax(this);

    public VideoInterruptManager(Executor executor, az az1, Analytics analytics, b b1)
    {
        a = az1;
        b = executor;
        c = analytics;
        d = b1;
        e = false;
    }

    static void a(VideoInterruptManager videointerruptmanager)
    {
        if (videointerruptmanager.f == null && videointerruptmanager.e)
        {
            videointerruptmanager.g = (av)videointerruptmanager.i.poll();
            if (videointerruptmanager.g != null)
            {
                videointerruptmanager.f = new ba(videointerruptmanager);
                if (!videointerruptmanager.h)
                {
                    videointerruptmanager.h = true;
                    videointerruptmanager.a.l();
                }
                videointerruptmanager.g.a(videointerruptmanager.f);
                return;
            }
            if (videointerruptmanager.h)
            {
                videointerruptmanager.h = false;
                videointerruptmanager.a.m();
                return;
            }
        }
    }

    static void a(VideoInterruptManager videointerruptmanager, ba ba1)
    {
        if (ba1 == videointerruptmanager.f)
        {
            videointerruptmanager.f = null;
            videointerruptmanager.g = null;
            videointerruptmanager.c();
        }
    }

    static b b(VideoInterruptManager videointerruptmanager)
    {
        return videointerruptmanager.d;
    }

    static void b(VideoInterruptManager videointerruptmanager, ba ba1)
    {
        videointerruptmanager.b.execute(new ay(videointerruptmanager, ba1));
    }

    static Analytics c(VideoInterruptManager videointerruptmanager)
    {
        return videointerruptmanager.c;
    }

    static ba c(VideoInterruptManager videointerruptmanager, ba ba1)
    {
        videointerruptmanager.f = null;
        return null;
    }

    private void c()
    {
        boolean flag;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j.run();
            return;
        } else
        {
            b.execute(j);
            return;
        }
    }

    static void d(VideoInterruptManager videointerruptmanager)
    {
        videointerruptmanager.c();
    }

    static ba e(VideoInterruptManager videointerruptmanager)
    {
        return videointerruptmanager.f;
    }

    public final void a()
    {
        com.google.android.apps.youtube.common.fromguava.c.a();
        if (g != null)
        {
            g.a();
            g = null;
        }
        f = null;
        h = false;
        i.clear();
    }

    public final void a(av av1)
    {
        i.add(av1);
        c();
    }

    public final void a(boolean flag)
    {
        e = flag;
        c();
    }

    public final void b()
    {
        ba.a(f);
    }
}
