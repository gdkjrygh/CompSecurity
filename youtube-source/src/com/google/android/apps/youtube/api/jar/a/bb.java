// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.Handler;
import android.view.KeyEvent;
import com.google.android.apps.youtube.api.b.a.ar;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            co, cd, bo, bc, 
//            bn, bk, bv, bw, 
//            br, bd, bx, bs, 
//            be, by, bf, bz, 
//            bg, ca, bh, cb, 
//            bi, cc, bj, bl, 
//            bp, bm, bq, bt, 
//            bu

public final class bb extends co
{

    private final ControlsOverlay a;
    private final Handler b;
    private cd c;

    public bb(ControlsOverlay controlsoverlay, Handler handler)
    {
        a = (ControlsOverlay)com.google.android.apps.youtube.common.fromguava.c.a(controlsoverlay, "target cannot be null");
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static cd a(bb bb1)
    {
        return bb1.c;
    }

    static cd a(bb bb1, cd cd1)
    {
        bb1.c = cd1;
        return cd1;
    }

    static ControlsOverlay b(bb bb1)
    {
        return bb1.a;
    }

    public final void a()
    {
        if (c != null)
        {
            c.o();
            c = null;
        }
    }

    public final void a(int l, int i1, int j1)
    {
        b.post(new bo(this, l, i1, j1));
    }

    public final void a(ar ar)
    {
        b.post(new bc(this, ar));
    }

    public final void a(String s)
    {
        s = com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.valueOf(s);
        b.post(new bn(this, s));
    }

    public final void a(String s, boolean flag)
    {
        b.post(new bk(this, s, flag));
    }

    public final void a(List list)
    {
        b.post(new bv(this, list));
    }

    public final void a(boolean flag)
    {
        b.post(new bw(this, flag));
    }

    public final boolean a(int l, KeyEvent keyevent)
    {
        b.post(new br(this, l, keyevent));
        return true;
    }

    public final void b()
    {
        b.post(new bd(this));
    }

    public final void b(boolean flag)
    {
        b.post(new bx(this, flag));
    }

    public final boolean b(int l, KeyEvent keyevent)
    {
        b.post(new bs(this, l, keyevent));
        return true;
    }

    public final void c()
    {
        b.post(new be(this));
    }

    public final void c(boolean flag)
    {
        b.post(new by(this, flag));
    }

    public final void d()
    {
        b.post(new bf(this));
    }

    public final void d(boolean flag)
    {
        b.post(new bz(this, flag));
    }

    public final void e()
    {
        b.post(new bg(this));
    }

    public final void e(boolean flag)
    {
        b.post(new ca(this, flag));
    }

    public final void f()
    {
        b.post(new bh(this));
    }

    public final void f(boolean flag)
    {
        b.post(new cb(this, flag));
    }

    public final void g()
    {
        b.post(new bi(this));
    }

    public final void g(boolean flag)
    {
        b.post(new cc(this, flag));
    }

    public final void h()
    {
        b.post(new bj(this));
    }

    public final void h(boolean flag)
    {
        b.post(new bl(this, flag));
    }

    public final void i()
    {
        b.post(new bp(this));
    }

    public final void i(boolean flag)
    {
        b.post(new bm(this, flag));
    }

    public final void j()
    {
        b.post(new bq(this));
    }

    public final void j(boolean flag)
    {
        b.post(new bt(this, flag));
    }

    public final void k(boolean flag)
    {
        b.post(new bu(this, flag));
    }
}
