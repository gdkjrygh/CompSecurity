// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.apps.youtube.common.L;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            w, p, n

final class v extends HandlerThread
{

    final p a;
    private final Runnable b;
    private Handler c;
    private int d;
    private volatile int e;

    public v(p p1)
    {
        a = p1;
        super("YouTubePlayer.ProgressDetector");
        b = new w(this, p1);
    }

    static void a(v v1)
    {
        n n1 = (n)p.u(v1.a).get();
        if (n1 != null && p.q(v1.a) && n1.e() > v1.d)
        {
            v1.c();
            return;
        } else
        {
            v1.c.postDelayed(v1.b, 1000L);
            return;
        }
    }

    public final void a()
    {
        e = e + 1;
        L.c((new StringBuilder("Retrying MediaPlayer error [retry=")).append(e).append(", max=3").append("]").toString());
    }

    public final void a(int i)
    {
        d = i;
        c.removeCallbacksAndMessages(null);
        c.postDelayed(b, 1000L);
    }

    public final boolean b()
    {
        return e < 3;
    }

    public final void c()
    {
        e = 0;
        c.removeCallbacksAndMessages(null);
    }

    public final boolean quit()
    {
        c.removeCallbacksAndMessages(null);
        return super.quit();
    }

    public final void start()
    {
        super.start();
        c = new Handler(getLooper());
    }
}
