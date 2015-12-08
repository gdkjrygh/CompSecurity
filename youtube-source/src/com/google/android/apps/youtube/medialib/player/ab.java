// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            x, ac, y

public final class ab
    implements x
{

    private x a;
    private final x b;
    private final x c = new ac(this, (byte)0);

    public ab(x x1)
    {
        b = (x)com.google.android.apps.youtube.common.fromguava.c.a(x1);
        a = x1;
    }

    public final FormatStream a()
    {
        return a.a();
    }

    public final void a(float f1)
    {
        a.a(f1);
    }

    public final void a(int i1)
    {
        a.a(i1);
    }

    public final void a(int i1, int j1)
    {
        a.a(i1, j1);
    }

    public final void a(int i1, VideoStreamingData videostreamingdata, int j1, String s, PlayerConfig playerconfig)
    {
        a.a(i1, videostreamingdata, j1, s, playerconfig);
    }

    public final void a(Handler handler)
    {
        b.a(handler);
    }

    public final void a(y y)
    {
        b.a(y);
        c.a(y);
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final void b()
    {
        a.b();
    }

    public final void b(Handler handler)
    {
        b.b(handler);
    }

    public final void c()
    {
        a.c();
    }

    public final void d()
    {
        a.d();
    }

    public final void e()
    {
        b.e();
        c.e();
    }

    public final int f()
    {
        return a.f();
    }

    public final int g()
    {
        return a.g();
    }

    public final int h()
    {
        return a.h();
    }

    public final boolean i()
    {
        return a.i();
    }

    public final boolean j()
    {
        return a.j();
    }

    public final void k()
    {
        a.k();
    }

    public final void l()
    {
        b.l();
        c.l();
    }

    public final void m()
    {
        a = b;
    }

    public final void n()
    {
        a = c;
        b.d();
        b.k();
    }
}
