// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.jar.client;

import android.os.Handler;
import com.google.android.apps.youtube.api.jar.a.cl;

// Referenced classes of package com.google.android.youtube.api.jar.client:
//            RemoteEmbeddedPlayer, j, i, g, 
//            c, m, n, l, 
//            b, h, k, d, 
//            e, f

final class a extends cl
{

    final RemoteEmbeddedPlayer a;

    private a(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        a = remoteembeddedplayer;
        super();
    }

    a(RemoteEmbeddedPlayer remoteembeddedplayer, byte byte0)
    {
        this(remoteembeddedplayer);
    }

    public final void a()
    {
        RemoteEmbeddedPlayer.a(a);
    }

    public final void a(int i1)
    {
        RemoteEmbeddedPlayer.p(a).post(new j(this, i1));
        RemoteEmbeddedPlayer.q(a);
    }

    public final void a(int i1, int j1)
    {
        RemoteEmbeddedPlayer.m(a).post(new i(this, i1, j1));
        RemoteEmbeddedPlayer.n(a);
    }

    public final void a(String s)
    {
        try
        {
            s = com.google.android.youtube.player.YouTubePlayer.ErrorReason.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = com.google.android.youtube.player.YouTubePlayer.ErrorReason.UNKNOWN;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = com.google.android.youtube.player.YouTubePlayer.ErrorReason.UNKNOWN;
        }
        RemoteEmbeddedPlayer.a(a, s);
    }

    public final void a(String s, String s1, int i1, int j1, boolean flag, boolean flag1)
    {
        RemoteEmbeddedPlayer.f(a).post(new g(this, s, s1, flag, flag1, i1, j1));
        RemoteEmbeddedPlayer.a(a, s);
    }

    public final void a(boolean flag)
    {
        RemoteEmbeddedPlayer.x(a).post(new c(this, flag));
        RemoteEmbeddedPlayer.f(a, flag);
    }

    public final void a(boolean flag, int i1)
    {
        RemoteEmbeddedPlayer.v(a).post(new m(this, i1));
        RemoteEmbeddedPlayer.d(a, flag);
    }

    public final void b()
    {
        RemoteEmbeddedPlayer.b(a);
    }

    public final void b(int i1)
    {
        RemoteEmbeddedPlayer.w(a).post(new n(this, i1));
        RemoteEmbeddedPlayer.c(a, i1);
    }

    public final void b(int i1, int j1)
    {
        RemoteEmbeddedPlayer.u(a).post(new l(this, i1, j1));
    }

    public final void c()
    {
        RemoteEmbeddedPlayer.c(a);
    }

    public final void d()
    {
        RemoteEmbeddedPlayer.d(a).post(new b(this));
        RemoteEmbeddedPlayer.e(a);
    }

    public final void e()
    {
        RemoteEmbeddedPlayer.g(a);
    }

    public final void f()
    {
        RemoteEmbeddedPlayer.i(a).post(new h(this));
        RemoteEmbeddedPlayer.j(a);
    }

    public final void g()
    {
        RemoteEmbeddedPlayer.k(a);
    }

    public final void h()
    {
        RemoteEmbeddedPlayer.s(a).post(new k(this));
        RemoteEmbeddedPlayer.t(a);
    }

    public final void i()
    {
        RemoteEmbeddedPlayer.z(a).post(new d(this));
    }

    public final void j()
    {
        RemoteEmbeddedPlayer.B(a).post(new e(this));
    }

    public final void k()
    {
        RemoteEmbeddedPlayer.D(a).post(new f(this));
    }
}
