// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.apps.youtube.api.jar.ApiMobileControlsOverlay;
import com.google.android.apps.youtube.api.jar.ApiTvControlsOverlay;
import com.google.android.apps.youtube.api.jar.aa;
import com.google.android.apps.youtube.api.jar.b;
import com.google.android.apps.youtube.api.jar.t;
import com.google.android.apps.youtube.api.jar.u;
import com.google.android.apps.youtube.api.jar.w;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.DefaultAdOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultAnnotationOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultLiveOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultSubtitlesOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultSurveyOverlay;
import com.google.android.apps.youtube.core.player.overlay.DefaultThumbnailOverlay;
import com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout;
import com.google.android.apps.youtube.core.player.overlay.ak;
import com.google.android.apps.youtube.core.player.overlay.ax;
import com.google.android.apps.youtube.core.player.overlay.be;
import com.google.android.apps.youtube.core.player.overlay.br;
import com.google.android.apps.youtube.core.player.overlay.g;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.youtube.player.internal.RuntimeRemoteException;
import com.google.android.youtube.player.internal.dynamic.d;
import com.google.android.youtube.player.internal.h;
import com.google.android.youtube.player.internal.j;
import com.google.android.youtube.player.internal.m;
import com.google.android.youtube.player.internal.p;
import com.google.android.youtube.player.internal.s;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            t, u, s, r, 
//            b, j, k, l, 
//            n, o, p, q, 
//            i, c, d, e, 
//            m, g, f, h

public abstract class a extends h
{

    protected final Handler a;
    protected final PlayerOverlaysLayout b;
    protected final b c;
    protected final com.google.android.apps.youtube.core.player.overlay.a d;
    protected final DefaultSurveyOverlay e;
    protected final g f;
    protected final ak g;
    protected final be h;
    protected final br i;
    private final Context j;
    private final com.google.android.apps.youtube.api.jar.a k;
    private final w l;
    private final u m;
    private final aa n;
    private s o;
    private p p;
    private m q;
    private j r;
    private String s;
    private com.google.android.youtube.player.YouTubePlayer.PlayerStyle t;
    private boolean u;
    private boolean v;

    protected a(Context context, com.google.android.apps.youtube.api.jar.a a1, PlayerOverlaysLayout playeroverlayslayout)
    {
        j = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context, "context cannot be null");
        k = (com.google.android.apps.youtube.api.jar.a)com.google.android.apps.youtube.common.fromguava.c.a(a1, "activityProxy cannot be null");
        b = (PlayerOverlaysLayout)com.google.android.apps.youtube.common.fromguava.c.a(playeroverlayslayout, "playerOverlaysLayout cannot be null");
        a = new Handler(context.getMainLooper());
        n = new aa(playeroverlayslayout, a1, new com.google.android.apps.youtube.api.jar.a.t(this, (byte)0));
        if (PackageUtil.d(context))
        {
            c = new ApiTvControlsOverlay(context, playeroverlayslayout, n);
        } else
        {
            c = new ApiMobileControlsOverlay(context, n);
        }
        c.setOnPlayInYouTubeListener(new com.google.android.apps.youtube.api.jar.a.u(this, (byte)0));
        l = com.google.android.apps.youtube.api.jar.w.a(context, a1, new com.google.android.apps.youtube.api.jar.a.s(this, (byte)0), playeroverlayslayout);
        m = new u(context, new r(this, (byte)0), playeroverlayslayout);
        d = new DefaultAdOverlay(context, new t(), c.a());
        e = new DefaultSurveyOverlay(context);
        f = new DefaultAnnotationOverlay(context);
        g = new DefaultLiveOverlay(context, com.google.android.youtube.api.b.i);
        h = new DefaultSubtitlesOverlay(context);
        i = new DefaultThumbnailOverlay(context);
        t = com.google.android.youtube.player.YouTubePlayer.PlayerStyle.DEFAULT;
        playeroverlayslayout.a(new ax[] {
            i, h, c, f, d, e, g
        });
    }

    static s a(a a1)
    {
        return a1.o;
    }

    private void a()
    {
        if (!d())
        {
            throw new IllegalStateException("This YouTubePlayer has been released");
        } else
        {
            return;
        }
    }

    static void a(a a1, String s1, com.google.android.youtube.player.YouTubePlayer.ErrorReason errorreason)
    {
        if (a1.d() && a1.o())
        {
            a1.n();
            com.google.android.youtube.player.internal.b.a.a(s1, new Object[0]);
            a1.a(errorreason);
        }
    }

    static void a(a a1, boolean flag)
    {
        if (a1.d())
        {
            a1.u = a1.L();
            a1.n();
            if (flag && !a1.m.isShowing())
            {
                a1.m.show();
            } else
            if (!flag && a1.m.isShowing())
            {
                a1.m.dismiss();
                return;
            }
        }
    }

    static p b(a a1)
    {
        return a1.p;
    }

    static m c(a a1)
    {
        return a1.q;
    }

    static j d(a a1)
    {
        return a1.r;
    }

    static boolean e(a a1)
    {
        return a1.u;
    }

    static Context f(a a1)
    {
        return a1.j;
    }

    static com.google.android.apps.youtube.api.jar.a g(a a1)
    {
        return a1.k;
    }

    static String h(a a1)
    {
        return a1.s;
    }

    protected abstract void A();

    protected abstract boolean B();

    protected abstract boolean C();

    protected abstract boolean D();

    protected abstract void E();

    protected abstract void F();

    protected abstract int G();

    protected abstract int H();

    protected abstract void I();

    protected abstract void J();

    protected abstract void K();

    protected abstract boolean L();

    protected abstract void M();

    protected final void N()
    {
        if (!d())
        {
            return;
        } else
        {
            l.d(true);
            return;
        }
    }

    protected final void O()
    {
        if (!d())
        {
            return;
        } else
        {
            l.d(false);
            return;
        }
    }

    protected final void P()
    {
        if (!d())
        {
            return;
        } else
        {
            l.f();
            return;
        }
    }

    protected final void Q()
    {
        if (!d())
        {
            return;
        } else
        {
            l.g();
            return;
        }
    }

    protected final void R()
    {
        if (!d())
        {
            return;
        } else
        {
            n.a();
            return;
        }
    }

    protected final void S()
    {
        if (!d())
        {
            return;
        } else
        {
            n.b();
            return;
        }
    }

    protected final void T()
    {
        a.post(new com.google.android.apps.youtube.api.jar.a.b(this));
    }

    protected final void U()
    {
        a.post(new com.google.android.apps.youtube.api.jar.a.j(this));
    }

    protected final void V()
    {
        a.post(new k(this));
    }

    protected final void W()
    {
        a.post(new l(this));
    }

    protected final void X()
    {
        a.post(new n(this));
    }

    protected final void Y()
    {
        a.post(new o(this));
    }

    protected final void Z()
    {
        a.post(new com.google.android.apps.youtube.api.jar.a.p(this));
    }

    public final void a(int i1)
    {
        a();
        l.a(i1);
    }

    public final void a(Configuration configuration)
    {
        if (!d())
        {
            return;
        } else
        {
            l.a(configuration);
            return;
        }
    }

    protected final void a(com.google.android.youtube.player.YouTubePlayer.ErrorReason errorreason)
    {
        a.post(new q(this, errorreason));
    }

    public final void a(j j1)
    {
        a();
        r = j1;
    }

    public final void a(m m1)
    {
        a();
        q = m1;
    }

    public final void a(p p1)
    {
        a();
        p = p1;
    }

    public final void a(s s1)
    {
        a();
        o = s1;
    }

    public final void a(String s1)
    {
        s1 = com.google.android.youtube.player.YouTubePlayer.PlayerStyle.valueOf(s1);
        a();
        i.a[s1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 61
    //                   2 92
    //                   3 123;
           goto _L1 _L2 _L3 _L4
_L1:
        com.google.android.apps.youtube.common.L.b("Unhandled PlayerStyle");
        s1 = t;
_L6:
        t = s1;
        return;
_L2:
        c.setMinimal(false);
        c.setControlsPermanentlyHidden(false);
        b.setFocusable(true);
        continue; /* Loop/switch isn't completed */
_L3:
        c.setMinimal(true);
        c.setControlsPermanentlyHidden(false);
        b.setFocusable(true);
        continue; /* Loop/switch isn't completed */
_L4:
        c.setControlsPermanentlyHidden(true);
        b.setFocusable(false);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(String s1, int i1)
    {
        a();
        c(s1, i1);
    }

    public final void a(String s1, int i1, int j1)
    {
        a();
        c(s1, i1, j1);
    }

    protected final void a(String s1, String s2)
    {
        s = s1;
        c.setVideoTitle(s2);
    }

    public final void a(List list, int i1, int j1)
    {
        a();
        c(list, i1, j1);
    }

    public final void a(boolean flag)
    {
        c(flag);
    }

    public final boolean a(int i1, KeyEvent keyevent)
    {
        if (!d())
        {
            return false;
        } else
        {
            return c(i1, keyevent);
        }
    }

    public final boolean a(Bundle bundle)
    {
        if (!d() || bundle == null)
        {
            return false;
        } else
        {
            a(bundle.getString("playerStyle"));
            l.a(bundle.getBundle("fullscreenHelperState"));
            return a(bundle.getByteArray("apiPlayerState"));
        }
    }

    protected abstract boolean a(byte abyte0[]);

    protected final void aa()
    {
        a.post(new com.google.android.apps.youtube.api.jar.a.c(this));
    }

    protected final void ab()
    {
        a.post(new com.google.android.apps.youtube.api.jar.a.d(this));
    }

    protected final void ac()
    {
        a.post(new e(this));
    }

    public final void b(int i1)
    {
        a();
        l.a(k() | i1);
    }

    protected final void b(String s1)
    {
        a.post(new com.google.android.apps.youtube.api.jar.a.m(this, s1));
    }

    public final void b(String s1, int i1)
    {
        a();
        d(s1, i1);
    }

    public final void b(String s1, int i1, int j1)
    {
        a();
        d(s1, i1, j1);
    }

    public final void b(List list, int i1, int j1)
    {
        a();
        d(list, i1, j1);
    }

    public final void b(boolean flag)
    {
        a();
        g(flag);
    }

    public final boolean b(int i1, KeyEvent keyevent)
    {
        if (!d())
        {
            return false;
        } else
        {
            return d(i1, keyevent);
        }
    }

    public final void c(int i1)
    {
        a();
        e(i1);
    }

    protected abstract void c(String s1, int i1);

    protected abstract void c(String s1, int i1, int j1);

    protected abstract void c(List list, int i1, int j1);

    public final void c(boolean flag)
    {
        if (!d())
        {
            return;
        } else
        {
            v = true;
            l.a();
            n.b();
            o = null;
            p = null;
            q = null;
            r = null;
            i(flag);
            return;
        }
    }

    protected abstract boolean c(int i1, KeyEvent keyevent);

    public final void d(int i1)
    {
        a();
        f(i1);
    }

    protected abstract void d(String s1, int i1);

    protected abstract void d(String s1, int i1, int j1);

    protected abstract void d(List list, int i1, int j1);

    public final void d(boolean flag)
    {
        a();
        f(flag);
    }

    protected boolean d()
    {
        return !v;
    }

    protected abstract boolean d(int i1, KeyEvent keyevent);

    public final void e()
    {
        if (!d())
        {
            return;
        } else
        {
            l.b();
            return;
        }
    }

    protected abstract void e(int i1);

    public final void e(boolean flag)
    {
        a();
        h(flag);
    }

    public final void f()
    {
        if (!d())
        {
            return;
        } else
        {
            I();
            return;
        }
    }

    protected abstract void f(int i1);

    protected abstract void f(boolean flag);

    public final void g()
    {
        if (!d())
        {
            return;
        } else
        {
            J();
            return;
        }
    }

    protected final void g(int i1)
    {
        a.post(new com.google.android.apps.youtube.api.jar.a.g(this, i1));
    }

    protected abstract void g(boolean flag);

    public final void h()
    {
        if (!d())
        {
            return;
        } else
        {
            u = false;
            m.dismiss();
            return;
        }
    }

    protected abstract void h(boolean flag);

    public final void i()
    {
        if (p != null && !v)
        {
            try
            {
                p.b(com.google.android.youtube.player.YouTubePlayer.ErrorReason.UNEXPECTED_SERVICE_DISCONNECTION.name());
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }
        c(true);
    }

    protected abstract void i(boolean flag);

    public final com.google.android.youtube.player.internal.dynamic.a j()
    {
        return com.google.android.youtube.player.internal.dynamic.d.a(b);
    }

    protected final void j(boolean flag)
    {
        if (!d())
        {
            return;
        } else
        {
            l.a(flag);
            return;
        }
    }

    public final int k()
    {
        a();
        return l.e();
    }

    protected final void k(boolean flag)
    {
        a.post(new f(this, flag));
    }

    public final void l()
    {
        a();
        y();
    }

    protected final void l(boolean flag)
    {
        a.post(new com.google.android.apps.youtube.api.jar.a.h(this, flag));
    }

    public final void m()
    {
        a();
        z();
    }

    public final void n()
    {
        a();
        A();
    }

    public final boolean o()
    {
        a();
        return B();
    }

    public final boolean p()
    {
        a();
        return C();
    }

    public final boolean q()
    {
        a();
        return D();
    }

    public final void r()
    {
        a();
        if (!p())
        {
            throw new NoSuchElementException("Called next at end of playlist");
        } else
        {
            E();
            return;
        }
    }

    public final void s()
    {
        a();
        if (!q())
        {
            throw new NoSuchElementException("Called previous at start of playlist");
        } else
        {
            F();
            return;
        }
    }

    public final int t()
    {
        a();
        return G();
    }

    public final int u()
    {
        a();
        return H();
    }

    public final void v()
    {
        a();
        K();
    }

    public final Bundle w()
    {
        if (!d())
        {
            return null;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("playerStyle", t.name());
            bundle.putBundle("fullscreenHelperState", l.d());
            bundle.putByteArray("apiPlayerState", x());
            return bundle;
        }
    }

    protected abstract byte[] x();

    protected abstract void y();

    protected abstract void z();
}
