// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.apps.youtube.api.ApiPlayer;
import com.google.android.apps.youtube.api.j;
import com.google.android.apps.youtube.api.jar.a.ce;
import com.google.android.apps.youtube.api.jar.a.ch;
import com.google.android.apps.youtube.api.jar.a.ck;
import com.google.android.apps.youtube.api.jar.a.cn;
import com.google.android.apps.youtube.api.jar.a.cq;
import com.google.android.apps.youtube.api.jar.a.ct;
import com.google.android.apps.youtube.api.jar.a.cw;
import com.google.android.apps.youtube.api.jar.a.cz;
import com.google.android.apps.youtube.api.jar.a.dc;
import com.google.android.apps.youtube.api.jar.a.df;
import com.google.android.apps.youtube.api.jar.a.di;
import com.google.android.apps.youtube.api.jar.a.dl;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.PlaybackServiceState;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.youtube.api.service.a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            ap, cr, bj, dl, 
//            bp, bw, co, cu, 
//            dq, cv, cn, ae, 
//            de, dp, a, j, 
//            s, e, x, z, 
//            g, v, ab, k, 
//            t, p, y, aa, 
//            l, ac, m, ad, 
//            o, f, h, i, 
//            n, q, r, u, 
//            w

public final class d extends ap
    implements android.os.IBinder.DeathRecipient, a
{

    private final Handler a;
    private final ApiPlayer b;
    private final com.google.android.youtube.api.service.c c;
    private final ae d;
    private final cv e;
    private final de f;
    private final cr g;
    private final bj h;
    private final com.google.android.apps.youtube.api.b.a.dl i;
    private final bp j;
    private final bw k;
    private final co l;
    private final cu m;
    private final dq n;
    private final com.google.android.apps.youtube.api.b.a.a o;
    private ck p;

    public d(Context context, Handler handler, com.google.android.youtube.api.service.c c1, j j1, ck ck1, cw cw, dc dc, 
            df df, ct ct, ce ce, di di, ch ch, cn cn1, cq cq, 
            cz cz, dl dl1, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context, "context cannot be null");
        a = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
        c = (com.google.android.youtube.api.service.c)com.google.android.apps.youtube.common.fromguava.c.a(c1, "serviceDestroyedNotifier");
        com.google.android.apps.youtube.common.fromguava.c.a(j1, "apiEnvironment cannot be null");
        p = (ck)com.google.android.apps.youtube.common.fromguava.c.a(ck1, "apiPlayerClient cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a(cw, "playerUiClient cannot be null");
        if (!flag)
        {
            com.google.android.apps.youtube.common.fromguava.c.a(dc, "surfaceHolderClient cannot be null");
        } else
        {
            com.google.android.apps.youtube.common.fromguava.c.a(df, "surfaceTextureClient cannot be null");
        }
        com.google.android.apps.youtube.common.fromguava.c.a(ct, "playerSurfaceClient cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a(ce, "adOverlayClient cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a(ch, "annotationOverlayClient cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a(cn1, "controlsOverlayClient cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a(cq, "liveOverlayClient cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a(cz, "subtitlesOverlayClient cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a(dl1, "thumbnailOverlayClient cannot be null");
        g = new cr(handler, cw);
        h = new bj(handler, ce);
        i = new com.google.android.apps.youtube.api.b.a.dl(handler, di);
        j = new bp(handler, ch);
        k = new bw(context, handler, cn1);
        l = new co(handler, cq);
        m = new cu(cz);
        n = new dq(dl1);
        if (!flag)
        {
            f = null;
            e = new cv(handler, dc, PackageUtil.d(context));
            o = new com.google.android.apps.youtube.api.b.a.cn(e, ct);
        } else
        {
            e = null;
            f = new de(handler, df);
            o = new dp(f, ct);
        }
        d = new ae(ck1);
        b = new ApiPlayer(context, d, j1, g, o, h, i, j, k, l, m, n);
        c1.a(this);
        try
        {
            ck1.asBinder().linkToDeath(this, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            binderDied();
        }
    }

    static ApiPlayer a(d d1)
    {
        return d1.b;
    }

    static void a(d d1, boolean flag)
    {
        d1.e(flag);
    }

    private void e(boolean flag)
    {
        b.n();
        c.b(this);
        if (p != null)
        {
            p.asBinder().unlinkToDeath(this, 0);
            p = null;
        }
        d.l();
        if (e != null)
        {
            e.a();
        }
        if (f != null)
        {
            f.a();
        }
        g.a();
        h.a();
        k.a();
        l.a();
        m.a();
        n.a();
        o.a();
        System.gc();
    }

    public final void a()
    {
        e(true);
    }

    public final void a(int i1)
    {
        a.post(new com.google.android.apps.youtube.api.b.a.j(this, i1));
    }

    public final void a(int i1, KeyEvent keyevent)
    {
        a.post(new s(this, i1, keyevent));
    }

    public final void a(String s1, int i1)
    {
        a.post(new e(this, s1, i1));
    }

    public final void a(String s1, int i1, int j1)
    {
        a.post(new x(this, s1, i1, j1));
    }

    public final void a(List list, int i1, int j1)
    {
        a.post(new z(this, list, i1, j1));
    }

    public final void a(boolean flag)
    {
        a.post(new g(this, flag));
    }

    public final boolean a(byte abyte0[])
    {
        Object obj = Parcel.obtain();
        ((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
        ((Parcel) (obj)).setDataPosition(0);
        if (((Parcel) (obj)).readInt() != 1)
        {
            ((Parcel) (obj)).recycle();
            return false;
        }
        try
        {
            abyte0 = (PlaybackServiceState)((Parcel) (obj)).readParcelable(com/google/android/apps/youtube/core/player/PlaybackServiceState.getClassLoader());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ((Parcel) (obj)).recycle();
            return false;
        }
        finally
        {
            ((Parcel) (obj)).recycle();
        }
        ((Parcel) (obj)).recycle();
        obj = new ConditionVariable();
        a.post(new v(this, abyte0, ((ConditionVariable) (obj))));
        ((ConditionVariable) (obj)).block();
        return true;
        throw abyte0;
    }

    public final void b()
    {
        a.post(new ab(this));
    }

    public final void b(int i1)
    {
        a.post(new k(this, i1));
    }

    public final void b(int i1, KeyEvent keyevent)
    {
        a.post(new t(this, i1, keyevent));
    }

    public final void b(String s1, int i1)
    {
        a.post(new p(this, s1, i1));
    }

    public final void b(String s1, int i1, int j1)
    {
        a.post(new y(this, s1, i1, j1));
    }

    public final void b(List list, int i1, int j1)
    {
        a.post(new aa(this, list, i1, j1));
    }

    public final void b(boolean flag)
    {
        a.post(new l(this, flag));
    }

    public final void binderDied()
    {
        a(true);
    }

    public final void c()
    {
        a.post(new ac(this));
    }

    public final void c(boolean flag)
    {
        a.post(new m(this, flag));
    }

    public final void d()
    {
        a.post(new ad(this));
    }

    public final void d(boolean flag)
    {
        a.post(new o(this, flag));
    }

    public final boolean e()
    {
        ConditionVariable conditionvariable = new ConditionVariable();
        AtomicBoolean atomicboolean = new AtomicBoolean();
        a.post(new f(this, atomicboolean, conditionvariable));
        conditionvariable.block();
        return atomicboolean.get();
    }

    public final void f()
    {
        a.post(new h(this));
    }

    public final void g()
    {
        a.post(new i(this));
    }

    public final void h()
    {
        a.post(new n(this));
    }

    public final void i()
    {
        a.post(new q(this));
    }

    public final void j()
    {
        a.post(new r(this));
    }

    public final byte[] k()
    {
        AtomicReference atomicreference = new AtomicReference();
        Object obj = new ConditionVariable();
        a.post(new u(this, atomicreference, ((ConditionVariable) (obj))));
        ((ConditionVariable) (obj)).block();
        obj = Parcel.obtain();
        ((Parcel) (obj)).writeInt(1);
        ((Parcel) (obj)).writeParcelable((Parcelable)atomicreference.get(), 0);
        byte abyte0[] = ((Parcel) (obj)).marshall();
        ((Parcel) (obj)).recycle();
        return abyte0;
    }

    public final void l()
    {
        a.post(new w(this));
    }
}
