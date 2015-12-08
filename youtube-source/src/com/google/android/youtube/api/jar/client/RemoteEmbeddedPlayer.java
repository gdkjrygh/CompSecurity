// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.jar.client;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.apps.youtube.api.b.a.al;
import com.google.android.apps.youtube.api.b.a.am;
import com.google.android.apps.youtube.api.b.a.ao;
import com.google.android.apps.youtube.api.jar.DefaultApiPlayerSurface;
import com.google.android.apps.youtube.api.jar.TextureApiPlayerSurface;
import com.google.android.apps.youtube.api.jar.a.a;
import com.google.android.apps.youtube.api.jar.a.ae;
import com.google.android.apps.youtube.api.jar.a.az;
import com.google.android.apps.youtube.api.jar.a.bb;
import com.google.android.apps.youtube.api.jar.a.do;
import com.google.android.apps.youtube.api.jar.a.dt;
import com.google.android.apps.youtube.api.jar.a.dy;
import com.google.android.apps.youtube.api.jar.a.ed;
import com.google.android.apps.youtube.api.jar.a.ej;
import com.google.android.apps.youtube.api.jar.a.ev;
import com.google.android.apps.youtube.api.jar.a.ez;
import com.google.android.apps.youtube.api.jar.a.fh;
import com.google.android.apps.youtube.api.jar.a.v;
import com.google.android.apps.youtube.api.jar.ah;
import com.google.android.apps.youtube.api.jar.h;
import com.google.android.apps.youtube.api.jar.i;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout;
import com.google.android.youtube.player.internal.dynamic.b;
import com.google.android.youtube.player.internal.dynamic.d;
import java.lang.reflect.Field;
import java.util.List;

// Referenced classes of package com.google.android.youtube.api.jar.client:
//            a

public final class RemoteEmbeddedPlayer extends a
    implements ah, i
{

    private boolean A;
    private boolean B;
    private ao j;
    private final dy k;
    private final ej l;
    private final ev m;
    private final dt n;
    private final v o;
    private final ez p;
    private final ae q;
    private final bb r;
    private final do s;
    private final ed t;
    private final fh u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    private RemoteEmbeddedPlayer(Activity activity, al al1, boolean flag)
    {
        this(((Context) (activity)), a(activity), al1, flag);
    }

    private RemoteEmbeddedPlayer(Context context, Activity activity, al al1, boolean flag)
    {
        this(((Context) (new az(activity, context.getResources(), context.getClassLoader(), context.getTheme()))), new com.google.android.apps.youtube.api.jar.a(activity), al1, flag);
    }

    private RemoteEmbeddedPlayer(Context context, com.google.android.apps.youtube.api.jar.a a1, al al1, boolean flag)
    {
        super(context, a1, new PlayerOverlaysLayout(context));
        com.google.android.apps.youtube.common.fromguava.c.a(al1, "apiPlayerFactoryService cannot be null");
        if (!flag)
        {
            a1 = new DefaultApiPlayerSurface(context, this);
            l = new ej(a1, context, a);
            m = null;
            context = a1;
        } else
        {
            a1 = new TextureApiPlayerSurface(context, this);
            l = null;
            m = new ev(a1, context, a);
            context = a1;
        }
        b.setVideoView(context.a());
        k = new dy(b, a);
        n = new dt(context, a);
        o = new v(d, a);
        p = new ez(e, a);
        q = new ae(f, a);
        r = new bb(c, a);
        s = new do(g, a);
        t = new ed(h, a);
        u = new fh(i, a);
        j = al1.a(new com.google.android.youtube.api.jar.client.a(this, (byte)0), k, l, m, n, o, p, q, r, s, t, u, flag);
    }

    public RemoteEmbeddedPlayer(IBinder ibinder, IBinder ibinder1)
    {
        this(ibinder, ibinder1, false);
    }

    public RemoteEmbeddedPlayer(IBinder ibinder, IBinder ibinder1, IBinder ibinder2, boolean flag)
    {
        this((Context)com.google.android.youtube.player.internal.dynamic.d.a(com.google.android.youtube.player.internal.dynamic.b.a(ibinder)), (Activity)com.google.android.youtube.player.internal.dynamic.d.a(com.google.android.youtube.player.internal.dynamic.b.a(ibinder1)), am.a(ibinder2), flag);
    }

    public RemoteEmbeddedPlayer(IBinder ibinder, IBinder ibinder1, boolean flag)
    {
        this((Activity)com.google.android.youtube.player.internal.dynamic.d.a(com.google.android.youtube.player.internal.dynamic.b.a(ibinder)), am.a(ibinder1), flag);
    }

    static void A(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.P();
    }

    static Handler B(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static void C(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.Q();
    }

    static Handler D(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static int a(RemoteEmbeddedPlayer remoteembeddedplayer, int i1)
    {
        remoteembeddedplayer.y = i1;
        return i1;
    }

    private static Activity a(Activity activity)
    {
        Field afield[] = activity.getClass().getSuperclass().getDeclaredFields();
        int j1 = afield.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Field field = afield[i1];
            if (field.getType() == android/app/Activity)
            {
                field.setAccessible(true);
                try
                {
                    activity = (Activity)field.get(activity);
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    throw new IllegalStateException("Could not get the activity from the ActivityWrapper", activity);
                }
                return activity;
            }
        }

        throw new IllegalStateException("Failed to extract the wrapped activity");
    }

    static void a(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.T();
    }

    static void a(RemoteEmbeddedPlayer remoteembeddedplayer, com.google.android.youtube.player.YouTubePlayer.ErrorReason errorreason)
    {
        remoteembeddedplayer.a(errorreason);
    }

    static void a(RemoteEmbeddedPlayer remoteembeddedplayer, String s1)
    {
        remoteembeddedplayer.b(s1);
    }

    static void a(RemoteEmbeddedPlayer remoteembeddedplayer, String s1, String s2)
    {
        remoteembeddedplayer.a(s1, s2);
    }

    static boolean a(RemoteEmbeddedPlayer remoteembeddedplayer, boolean flag)
    {
        remoteembeddedplayer.x = flag;
        return flag;
    }

    static int b(RemoteEmbeddedPlayer remoteembeddedplayer, int i1)
    {
        remoteembeddedplayer.z = i1;
        return i1;
    }

    static void b(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.U();
    }

    static boolean b(RemoteEmbeddedPlayer remoteembeddedplayer, boolean flag)
    {
        remoteembeddedplayer.w = flag;
        return flag;
    }

    static void c(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.V();
    }

    static void c(RemoteEmbeddedPlayer remoteembeddedplayer, int i1)
    {
        remoteembeddedplayer.g(i1);
    }

    static boolean c(RemoteEmbeddedPlayer remoteembeddedplayer, boolean flag)
    {
        remoteembeddedplayer.v = flag;
        return flag;
    }

    static Handler d(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static void d(RemoteEmbeddedPlayer remoteembeddedplayer, boolean flag)
    {
        remoteembeddedplayer.k(flag);
    }

    static void e(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.W();
    }

    static void e(RemoteEmbeddedPlayer remoteembeddedplayer, boolean flag)
    {
        remoteembeddedplayer.j(flag);
    }

    static Handler f(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static void f(RemoteEmbeddedPlayer remoteembeddedplayer, boolean flag)
    {
        remoteembeddedplayer.l(flag);
    }

    static void g(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.X();
    }

    static void h(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.O();
    }

    static Handler i(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static void j(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.Y();
    }

    static void k(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.Z();
    }

    static void l(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.R();
    }

    static Handler m(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static void n(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.aa();
    }

    static void o(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.S();
    }

    static Handler p(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static void q(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.ab();
    }

    static void r(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.S();
    }

    static Handler s(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static void t(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.ac();
    }

    static Handler u(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static Handler v(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static Handler w(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static Handler x(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    static void y(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        remoteembeddedplayer.N();
    }

    static Handler z(RemoteEmbeddedPlayer remoteembeddedplayer)
    {
        return remoteembeddedplayer.a;
    }

    public final void A()
    {
        try
        {
            B = false;
            j.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final boolean B()
    {
        return v;
    }

    public final boolean C()
    {
        return w;
    }

    public final boolean D()
    {
        return x;
    }

    public final void E()
    {
        try
        {
            j.f();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void F()
    {
        try
        {
            j.g();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final int G()
    {
        return y;
    }

    public final int H()
    {
        return z;
    }

    public final void I()
    {
        try
        {
            j.i();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void J()
    {
        try
        {
            j.j();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void K()
    {
        try
        {
            j.h();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final boolean L()
    {
        boolean flag;
        try
        {
            flag = j.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return flag;
    }

    public final void M()
    {
        if (!A)
        {
            B = true;
            return;
        }
        try
        {
            B = false;
            j.l();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void a()
    {
        A = true;
        if (B)
        {
            M();
        }
    }

    protected final boolean a(byte abyte0[])
    {
        boolean flag;
        try
        {
            flag = j.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalStateException(abyte0);
        }
        return flag;
    }

    public final void b()
    {
        A = false;
    }

    public final void c()
    {
        com.google.android.youtube.player.internal.b.a.b("Cannot attach a YouTubePlayerView backed by a TextureView to a Window that is not hardware accelerated", new Object[0]);
        a(com.google.android.youtube.player.YouTubePlayer.ErrorReason.UNABLE_TO_USE_TEXTUREVIEW);
    }

    public final void c(String s1, int i1)
    {
        try
        {
            B = false;
            y = i1;
            j.a(s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IllegalStateException(s1);
        }
    }

    public final void c(String s1, int i1, int j1)
    {
        try
        {
            B = false;
            y = j1;
            j.a(s1, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IllegalStateException(s1);
        }
    }

    public final void c(List list, int i1, int j1)
    {
        try
        {
            B = false;
            y = j1;
            j.a(list, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalStateException(list);
        }
    }

    public final boolean c(int i1, KeyEvent keyevent)
    {
        try
        {
            j.a(i1, keyevent);
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw new IllegalStateException(keyevent);
        }
        return false;
    }

    public final void d(String s1, int i1)
    {
        try
        {
            B = false;
            y = i1;
            j.b(s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IllegalStateException(s1);
        }
    }

    public final void d(String s1, int i1, int j1)
    {
        try
        {
            B = false;
            y = j1;
            j.b(s1, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IllegalStateException(s1);
        }
    }

    public final void d(List list, int i1, int j1)
    {
        try
        {
            B = false;
            y = j1;
            j.b(list, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalStateException(list);
        }
    }

    protected final boolean d()
    {
        return super.d() && j != null;
    }

    public final boolean d(int i1, KeyEvent keyevent)
    {
        try
        {
            j.b(i1, keyevent);
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw new IllegalStateException(keyevent);
        }
        return false;
    }

    public final void e(int i1)
    {
        try
        {
            B = false;
            y = i1;
            j.a(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void f(int i1)
    {
        try
        {
            B = false;
            y = y + i1;
            j.b(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void f(boolean flag)
    {
        try
        {
            j.b(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void g(boolean flag)
    {
        try
        {
            j.c(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void h(boolean flag)
    {
        try
        {
            j.d(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void i(boolean flag)
    {
        try
        {
            j.a(flag);
            if (l != null)
            {
                l.d();
            }
            if (m != null)
            {
                m.a();
            }
            k.a();
            o.a();
            q.a();
            r.a();
            s.b();
        }
        catch (RemoteException remoteexception) { }
        j = null;
    }

    protected final byte[] x()
    {
        byte abyte0[];
        try
        {
            abyte0 = j.k();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return abyte0;
    }

    public final void y()
    {
        try
        {
            B = false;
            j.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public final void z()
    {
        try
        {
            B = false;
            j.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }
}
