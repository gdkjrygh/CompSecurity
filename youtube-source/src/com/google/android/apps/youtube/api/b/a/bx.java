// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            as, by, ch, cd, 
//            ca, cf, cg, ci, 
//            cj, ck, cl, cm, 
//            bz, cb, cc, ce

final class bx extends as
{

    private final Handler a;
    private p b;

    public bx(Handler handler)
    {
        a = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static p a(bx bx1)
    {
        return bx1.b;
    }

    public final void a()
    {
        a.post(new by(this));
    }

    public final void a(int i1)
    {
        a.post(new ch(this, i1));
    }

    public final void a(p p1)
    {
        b = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        a.post(new cd(this, subtitletrack));
    }

    public final void a(boolean flag)
    {
        a.post(new ca(this, flag));
    }

    public final void b()
    {
        a.post(new cf(this));
    }

    public final void c()
    {
        a.post(new cg(this));
    }

    public final void d()
    {
        a.post(new ci(this));
    }

    public final void e()
    {
        a.post(new cj(this));
    }

    public final void f()
    {
        a.post(new ck(this));
    }

    public final void g()
    {
        a.post(new cl(this));
    }

    public final void h()
    {
        a.post(new cm(this));
    }

    public final void i()
    {
        a.post(new bz(this));
    }

    public final void j()
    {
        a.post(new cb(this));
    }

    public final void k()
    {
        a.post(new cc(this));
    }

    public final void l()
    {
        a.post(new ce(this));
    }
}
