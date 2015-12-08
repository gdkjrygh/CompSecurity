// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.os.Handler;
import com.google.android.apps.youtube.medialib.player.x;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            o, Director

final class n extends Handler
{

    final Director a;
    private final Runnable b;

    public n(Director director)
    {
        a = director;
        super();
        b = new o(this, director);
    }

    static void a(n n1)
    {
        if (!Director.s(n1.a))
        {
            Director.a(n1.a, Director.k(n1.a).f(), Director.k(n1.a).g(), Director.k(n1.a).h());
            n1.postDelayed(n1.b, 1000L);
        }
    }

    public final void a()
    {
        removeCallbacks(b);
        post(b);
    }

    public final void b()
    {
        removeCallbacks(b);
    }

    public final void c()
    {
        b();
        int i = Director.k(a).g();
        Director.a(a, i, i, 100);
    }

    public final void d()
    {
        removeCallbacksAndMessages(null);
    }
}
