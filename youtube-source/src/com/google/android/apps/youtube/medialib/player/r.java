// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.network.h;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            o, z, p, y, 
//            n, YouTubePlayerEvents, v, s

final class r
    implements o, z
{

    final p a;

    private r(p p1)
    {
        a = p1;
        super();
    }

    r(p p1, byte byte0)
    {
        this(p1);
    }

    private void c(n n1)
    {
        if (p.i(a))
        {
            if (android.os.Build.VERSION.SDK_INT > 16 && p.e(a).a(p.j(a)) && n1 != null)
            {
                n1.b(2);
            }
            if (!p.j(a) && p.k(a) != 0)
            {
                n1.a(p.k(a));
            }
            if (!p.l(a) && !p.m(a))
            {
                p.n(a).a(1);
            }
            p.d(a, false);
            if (!p.j(a) || com.google.android.apps.youtube.medialib.player.p.h(a))
            {
                p.e(a, false);
            }
            if (!p.o(a))
            {
                a.b();
            }
        }
    }

    public final void a()
    {
        L.a();
        p.a(a, true);
        if (p.d(a) != null)
        {
            p.a(a, p.d(a));
            p.b(a, null);
        }
    }

    public final void a(n n1)
    {
        p.n(a).c(p.k(a));
    }

    public final boolean a(int i, int j)
    {
        boolean flag;
        if (!p.q(a))
        {
            p.d(a, true);
            p.g(a, false);
            L.c((new StringBuilder("MediaPlayer error during prepare [what=")).append(i).append(", extra=").append(j).append("]").toString());
        } else
        {
            p.d(a, false);
            p.g(a, true);
            L.c((new StringBuilder("MediaPlayer error during playback [what=")).append(i).append(", extra=").append(j).append("]").toString());
        }
        if (i != 1 || !p.m().contains(Integer.valueOf(j)))
        {
            if (i == 1 && (j == -1004 || j == 0x80000000) && !p.t(a).a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_281;
            }
        }
        flag = true;
_L1:
        if (!flag && p.r(a).b())
        {
            p.r(a).a();
            if (i == 100)
            {
                p.e(a).f();
            }
            p.n(a).b(i, j);
            if (p.j(a))
            {
                p.c(a, p.s(a));
            } else
            {
                p.a(a, p.s(a), p.k(a));
            }
            p.r(a).a(p.k(a));
            return true;
        } else
        {
            L.c("Reporting MediaPlayer error");
            p.r(a).c();
            p.d(a, false);
            p.g(a, false);
            a.d();
            p.n(a).a(i, j);
            return true;
        }
        flag = false;
          goto _L1
    }

    public final boolean a(n n1, int i, int j)
    {
        L.d((new StringBuilder("media player info ")).append(Integer.toHexString(i)).append(" ").append(Integer.toHexString(j)).toString());
        switch (i)
        {
        default:
            return false;

        case 701: 
            L.d((new StringBuilder("Buffering data from ")).append(p.s(a)).toString());
            p.e(a, true);
            return false;

        case 702: 
            p.e(a, false);
            return false;

        case 901: 
            p.n(a).a(11);
            break;
        }
        return false;
    }

    public final void b()
    {
        L.a();
    }

    public final void b(n n1)
    {
        L.a();
        p.b(a, true);
        p.b(a, n1.f());
        c(n1);
    }

    public final void b(n n1, int i, int j)
    {
        L.a();
        if (i > 0 && j > 0)
        {
            if (p.f(a).getMainLooper().getThread() == Thread.currentThread())
            {
                p.e(a).setVideoSize(i, j);
            } else
            {
                p.g(a).post(new s(this, i, j));
            }
            if (!com.google.android.apps.youtube.medialib.player.p.h(a))
            {
                p.c(a, true);
                c(n1);
                return;
            }
        }
    }

    public final void c()
    {
        L.a();
        a.e();
        p.e(a).e();
        p.a(a, false);
    }

    public final void d(int i)
    {
        int j;
label0:
        {
            j = i;
            if (i <= 90)
            {
                break label0;
            }
            if (p.p(a) != i)
            {
                j = i;
                if (p.p(a) != 100)
                {
                    break label0;
                }
            }
            j = 100;
        }
        p.c(a, j);
    }

    public final void g()
    {
        L.a();
        p.d(a, 0);
        p.f(a, false);
        p.n(a).a(7);
    }
}
