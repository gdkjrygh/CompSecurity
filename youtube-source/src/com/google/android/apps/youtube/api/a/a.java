// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.a;

import android.app.Activity;
import android.os.Parcel;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.youtube.api.ApiPlayer;
import com.google.android.apps.youtube.api.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.PlaybackServiceState;
import com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout;
import com.google.android.apps.youtube.medialib.player.DefaultPlayerSurface;
import com.google.android.apps.youtube.medialib.player.y;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.a:
//            b

public final class a extends com.google.android.apps.youtube.api.jar.a.a
{

    private final ApiPlayer j;

    private a(Activity activity, j j1, PlayerOverlaysLayout playeroverlayslayout, y y1)
    {
        super(activity, new com.google.android.apps.youtube.api.jar.a(activity), playeroverlayslayout);
        com.google.android.apps.youtube.common.fromguava.c.a(j1, "apiEnvironment cannot be null");
        playeroverlayslayout.setVideoView((View)y1);
        j = new ApiPlayer(activity, new b(this, (byte)0), j1, playeroverlayslayout, y1, d, e, f, c, g, h, i);
    }

    public a(Activity activity, j j1, boolean flag)
    {
        this(activity, j1, new PlayerOverlaysLayout(activity), (y)new DefaultPlayerSurface(activity));
    }

    static void a(a a1)
    {
        a1.T();
    }

    static void a(a a1, int i1)
    {
        a1.g(i1);
    }

    static void a(a a1, com.google.android.youtube.player.YouTubePlayer.ErrorReason errorreason)
    {
        a1.a(errorreason);
    }

    static void a(a a1, String s)
    {
        a1.b(s);
    }

    static void a(a a1, String s, String s1)
    {
        a1.a(s, s1);
    }

    static void a(a a1, boolean flag)
    {
        a1.k(flag);
    }

    static void b(a a1)
    {
        a1.U();
    }

    static void b(a a1, boolean flag)
    {
        a1.j(flag);
    }

    static void c(a a1)
    {
        a1.V();
    }

    static void c(a a1, boolean flag)
    {
        a1.l(flag);
    }

    static void d(a a1)
    {
        a1.W();
    }

    static void e(a a1)
    {
        a1.X();
    }

    static void f(a a1)
    {
        a1.O();
    }

    static void g(a a1)
    {
        a1.Y();
    }

    static void h(a a1)
    {
        a1.Z();
    }

    static void i(a a1)
    {
        a1.R();
    }

    static void j(a a1)
    {
        a1.aa();
    }

    static void k(a a1)
    {
        a1.S();
    }

    static void l(a a1)
    {
        a1.ab();
    }

    static void m(a a1)
    {
        a1.S();
    }

    static void n(a a1)
    {
        a1.ac();
    }

    static void o(a a1)
    {
        a1.N();
    }

    static void p(a a1)
    {
        a1.P();
    }

    static void q(a a1)
    {
        a1.Q();
    }

    public final void A()
    {
        j.k();
    }

    public final boolean B()
    {
        return j.d();
    }

    public final boolean C()
    {
        return j.e();
    }

    public final boolean D()
    {
        return j.f();
    }

    public final void E()
    {
        j.g();
    }

    public final void F()
    {
        j.h();
    }

    public final int G()
    {
        return j.i();
    }

    public final int H()
    {
        return j.j();
    }

    public final void I()
    {
        j.o();
    }

    public final void J()
    {
        j.p();
    }

    public final void K()
    {
        j.m();
    }

    public final boolean L()
    {
        return j.l();
    }

    public final void M()
    {
        j.a();
    }

    public final ApiPlayer a()
    {
        return j;
    }

    protected final boolean a(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = (PlaybackServiceState)parcel.readParcelable(com/google/android/apps/youtube/core/player/PlaybackServiceState.getClassLoader());
        j.a(abyte0);
        parcel.recycle();
        return true;
    }

    public final void c(String s, int i1)
    {
        j.a(s, i1);
    }

    public final void c(String s, int i1, int j1)
    {
        j.a(s, i1, j1);
    }

    public final void c(List list, int i1, int j1)
    {
        j.a(list, i1, j1);
    }

    public final boolean c(int i1, KeyEvent keyevent)
    {
        return j.a(i1, keyevent);
    }

    public final void d(String s, int i1)
    {
        j.b(s, i1);
    }

    public final void d(String s, int i1, int j1)
    {
        j.b(s, i1, j1);
    }

    public final void d(List list, int i1, int j1)
    {
        j.b(list, i1, j1);
    }

    public final boolean d(int i1, KeyEvent keyevent)
    {
        return j.b(i1, keyevent);
    }

    public final void e(int i1)
    {
        j.a(i1);
    }

    public final void f(int i1)
    {
        j.b(i1);
    }

    public final void f(boolean flag)
    {
        j.b(flag);
    }

    protected final void g(boolean flag)
    {
        j.a(flag);
    }

    public final void h(boolean flag)
    {
        j.c(flag);
    }

    public final void i(boolean flag)
    {
        j.n();
    }

    protected final byte[] x()
    {
        PlaybackServiceState playbackservicestate = j.q();
        Parcel parcel = Parcel.obtain();
        parcel.writeParcelable(playbackservicestate, 0);
        byte abyte0[] = parcel.marshall();
        parcel.recycle();
        return abyte0;
    }

    public final void y()
    {
        j.b();
    }

    public final void z()
    {
        j.c();
    }
}
