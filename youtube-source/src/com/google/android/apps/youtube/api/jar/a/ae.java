// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.youtube.api.b.a.ai;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.g;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ci, ay, as, af, 
//            an, av, ah, ar, 
//            aq, aw, aj, at, 
//            ai, ap, au, ao, 
//            ax, ag, ak, al, 
//            am

public final class ae extends ci
{

    private final g a;
    private final Handler b;
    private ay c;

    public ae(g g1, Handler handler)
    {
        a = (g)com.google.android.apps.youtube.common.fromguava.c.a(g1, "target cannot be null");
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static ay a(ae ae1)
    {
        return ae1.c;
    }

    static ay a(ae ae1, ay ay1)
    {
        ae1.c = ay1;
        return ay1;
    }

    static g b(ae ae1)
    {
        return ae1.a;
    }

    public final void a()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
    }

    public final void a(Bitmap bitmap)
    {
        b.post(new as(this, bitmap));
    }

    public final void a(ai ai1)
    {
        b.post(new af(this, ai1));
    }

    public final void a(CharSequence charsequence)
    {
        b.post(new an(this, charsequence));
    }

    public final void a(String s)
    {
        b.post(new av(this, s));
    }

    public final void a(String s, String s1)
    {
        b.post(new ah(this, s, s1));
    }

    public final void a(boolean flag)
    {
        b.post(new ar(this, flag));
    }

    public final void b()
    {
        b.post(new aq(this));
    }

    public final void b(Bitmap bitmap)
    {
        b.post(new aw(this, bitmap));
    }

    public final void b(boolean flag)
    {
        b.post(new aj(this, flag));
    }

    public final void c()
    {
        b.post(new at(this));
    }

    public final void c(Bitmap bitmap)
    {
        b.post(new com.google.android.apps.youtube.api.jar.a.ai(this, bitmap));
    }

    public final void c(boolean flag)
    {
        b.post(new ap(this, flag));
    }

    public final void d()
    {
        b.post(new au(this));
    }

    public final void d(Bitmap bitmap)
    {
        b.post(new ao(this, bitmap));
    }

    public final void e()
    {
        b.post(new ax(this));
    }

    public final void f()
    {
        b.post(new ag(this));
    }

    public final void g()
    {
        b.post(new ak(this));
    }

    public final void h()
    {
        b.post(new al(this));
    }

    public final void i()
    {
        b.post(new am(this));
    }
}
