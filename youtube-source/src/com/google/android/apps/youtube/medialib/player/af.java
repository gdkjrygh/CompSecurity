// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            x, ai, ag, y

public final class af
    implements x
{

    private final x a;
    private final x b;
    private final Handler c = new Handler(new ai(this, (byte)0));
    private final Handler d = new Handler(new ag(this, (byte)0));
    private final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    private x f;
    private int g;
    private VideoStreamingData h;
    private String i;
    private PlayerConfig j;
    private boolean k;

    public af(x x1, x x2)
    {
        a = x1;
        b = x2;
        x1.a(c);
        x2.a(d);
        f = x2;
    }

    static CopyOnWriteArrayList a(af af1)
    {
        return af1.e;
    }

    private void b(boolean flag)
    {
        Iterator iterator = e.iterator();
        while (iterator.hasNext()) 
        {
            Handler handler = (Handler)iterator.next();
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            Message.obtain(handler, 16, i1, 0).sendToTarget();
        }
    }

    static boolean b(af af1)
    {
        return af1.m();
    }

    static boolean c(af af1)
    {
        return af1.k;
    }

    static x d(af af1)
    {
        return af1.a;
    }

    static void e(af af1)
    {
        af1.n();
    }

    static x f(af af1)
    {
        return af1.b;
    }

    private boolean m()
    {
        return f == a;
    }

    private void n()
    {
        k = false;
        f = a;
        b.c();
        b(false);
    }

    public final FormatStream a()
    {
        return f.a();
    }

    public final void a(float f1)
    {
        a.a(f1);
        b.a(f1);
    }

    public final void a(int i1)
    {
        if (k)
        {
            n();
        }
        f.a(i1);
    }

    public final void a(int i1, int j1)
    {
        g = i1;
        f.a(i1, j1);
    }

    public final void a(int i1, VideoStreamingData videostreamingdata, int j1, String s, PlayerConfig playerconfig)
    {
        g = i1;
        h = videostreamingdata;
        i = s;
        j = playerconfig;
        if (m() || videostreamingdata.isLive())
        {
            a.a(i1, videostreamingdata, j1, s, playerconfig);
            return;
        } else
        {
            b.a(i1, videostreamingdata, j1, s, playerconfig);
            return;
        }
    }

    public final void a(Handler handler)
    {
        e.add(handler);
    }

    public final void a(y y)
    {
        if (b.j())
        {
            b(true);
        }
        a.a(y);
        if (!m())
        {
            if ((b.j() || b.i()) && h != null)
            {
                if (!k)
                {
                    char c1;
                    if (h.isOffline())
                    {
                        c1 = '\u07D0';
                    } else
                    {
                        c1 = '\u0FA0';
                    }
                    a.a(g, h, c1 + b.f(), i, j);
                    k = true;
                }
            } else
            {
                f = a;
                if (h != null && b.g() > 0)
                {
                    a.a(g, h, b.f(), i, j);
                    a.c();
                    return;
                }
            }
        }
    }

    public final void a(boolean flag)
    {
        a.b(c);
        b.b(d);
        a.a(flag);
        b.a(flag);
    }

    public final void b()
    {
        if (k)
        {
            n();
        }
        f.b();
    }

    public final void b(Handler handler)
    {
        e.remove(handler);
    }

    public final void c()
    {
        f.c();
    }

    public final void d()
    {
        a.d();
        b.d();
    }

    public final void e()
    {
        a.e();
        b.e();
    }

    public final int f()
    {
        return f.f();
    }

    public final int g()
    {
        return f.g();
    }

    public final int h()
    {
        if (k)
        {
            return a.h();
        } else
        {
            return f.h();
        }
    }

    public final boolean i()
    {
        return f.i();
    }

    public final boolean j()
    {
        return f.j();
    }

    public final void k()
    {
        a.k();
        b(false);
    }

    public final void l()
    {
        boolean flag;
        if (!h.isLive() && (a.j() || a.i()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = false;
        if (m() && flag)
        {
            b.a(g, h, a.f() + 200, i, j);
            f = b;
        }
        a.d();
        a.l();
    }
}
