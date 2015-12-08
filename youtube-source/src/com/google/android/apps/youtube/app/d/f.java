// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.app.Activity;
import android.app.Dialog;
import android.widget.ListView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ui.bm;
import com.google.android.apps.youtube.app.ui.presenter.ct;
import com.google.android.apps.youtube.app.ui.presenter.r;
import com.google.android.apps.youtube.app.ui.presenter.u;
import com.google.android.apps.youtube.app.ui.presenter.v;
import com.google.android.apps.youtube.app.ui.presenter.x;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.distiller.a;
import com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment;
import com.google.android.apps.youtube.datalib.distiller.model.b;
import com.google.android.apps.youtube.uilib.a.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            p, k, n, s, 
//            ac, l, h, g

public final class f
{

    private final Activity a;
    private final ListView b;
    private final a c;
    private final bc d;
    private final ak e;
    private final l f;
    private final aa g;
    private final am h;
    private final aw i;
    private final List j = new ArrayList(25);
    private final h k = new h();
    private final v l = new v();
    private final com.google.android.apps.youtube.app.ui.presenter.CommentFooterPresenter.Model m = new com.google.android.apps.youtube.app.ui.presenter.CommentFooterPresenter.Model();
    private final p n = new p(this, (byte)0);
    private com.google.android.apps.youtube.datalib.distiller.model.a o;

    public f(Activity activity, ListView listview, a a1, bj bj, bc bc1, ak ak1, l l1, 
            aa aa1, am am1, aw aw1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (ListView)com.google.android.apps.youtube.common.fromguava.c.a(listview);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        e = (ak)com.google.android.apps.youtube.common.fromguava.c.a(ak1);
        f = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        g = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        h = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        i = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        com.google.android.apps.youtube.common.fromguava.c.a(listview);
        com.google.android.apps.youtube.common.fromguava.c.a(bj);
        a1 = new k(this, (byte)0);
        bc1 = new n(this, (byte)0);
        ak1 = new s(this, (byte)0);
        k.a(com/google/android/apps/youtube/datalib/distiller/model/TopLevelComment, new ct(activity, bj, a1, new ac(this, (byte)0), bc1, ak1));
        k.a(com/google/android/apps/youtube/datalib/distiller/model/b, new x(activity, bj, a1, bc1, ak1));
        k.a(com/google/android/apps/youtube/app/ui/presenter/v, new u(activity, bj, n));
        k.a(com/google/android/apps/youtube/app/ui/presenter/CommentFooterPresenter$Model, new r(activity, new com.google.android.apps.youtube.app.d.l(this, (byte)0)));
        listview.setAdapter(k);
    }

    static v a(f f1)
    {
        return f1.l;
    }

    static TopLevelComment a(com.google.android.apps.youtube.datalib.distiller.model.c c1)
    {
        if (c1 instanceof b)
        {
            return ((b)c1).a();
        } else
        {
            return (TopLevelComment)c1;
        }
    }

    static void a(f f1, int i1)
    {
        ah.a(f1.a, i1, 1);
    }

    static void a(f f1, Runnable runnable)
    {
        UserProfile userprofile = f1.l.b;
        if (userprofile == null)
        {
            f1.g.a(f1.a, new com.google.android.apps.youtube.app.d.h(f1, runnable));
        } else
        if (!f1.a(userprofile))
        {
            runnable.run();
            return;
        }
    }

    static boolean a(f f1, UserProfile userprofile)
    {
        return f1.a(userprofile);
    }

    private boolean a(UserProfile userprofile)
    {
        userprofile = bm.a(a, e, f, userprofile, d);
        if (userprofile != null)
        {
            userprofile.show();
            return true;
        } else
        {
            return false;
        }
    }

    static h b(f f1)
    {
        return f1.k;
    }

    static Activity c(f f1)
    {
        return f1.a;
    }

    private void c()
    {
        j.clear();
        if (o != null)
        {
            if (o.a() == 0)
            {
                m.a(com.google.android.apps.youtube.app.ui.presenter.CommentFooterPresenter.Model.State.NO_COMMENTS);
            } else
            if (!o.c())
            {
                m.a(com.google.android.apps.youtube.app.ui.presenter.CommentFooterPresenter.Model.State.NO_MORE_COMMENTS);
            } else
            {
                m.a(com.google.android.apps.youtube.app.ui.presenter.CommentFooterPresenter.Model.State.CAN_LOAD_MORE);
            }
            j.add(l);
            if (o.a() > 0)
            {
                for (Iterator iterator = o.b().iterator(); iterator.hasNext();)
                {
                    Object obj = (TopLevelComment)iterator.next();
                    j.add(obj);
                    obj = ((TopLevelComment) (obj)).l().iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        b b1 = (b)((Iterator) (obj)).next();
                        j.add(b1);
                    }
                }

            }
            j.add(m);
        }
        k.b();
        k.a(j);
    }

    static aw d(f f1)
    {
        return f1.i;
    }

    static bc e(f f1)
    {
        return f1.d;
    }

    static am f(f f1)
    {
        return f1.h;
    }

    static com.google.android.apps.youtube.datalib.distiller.model.a g(f f1)
    {
        return f1.o;
    }

    static com.google.android.apps.youtube.app.ui.presenter.CommentFooterPresenter.Model h(f f1)
    {
        return f1.m;
    }

    static a i(f f1)
    {
        return f1.c;
    }

    static void j(f f1)
    {
        f1.c();
    }

    static ak k(f f1)
    {
        return f1.e;
    }

    static p l(f f1)
    {
        return f1.n;
    }

    public final void a()
    {
        if (!f.b())
        {
            l.b = null;
            k.notifyDataSetChanged();
            return;
        } else
        {
            d.a(com.google.android.apps.youtube.common.a.a.a(a, new g(this)));
            return;
        }
    }

    public final void a(com.google.android.apps.youtube.datalib.distiller.model.a a1)
    {
        o = a1;
        v v1 = l;
        boolean flag;
        if (a1 == null)
        {
            flag = false;
        } else
        {
            flag = a1.f();
        }
        v1.a = flag;
        c();
    }

    public final h b()
    {
        return k;
    }

    public final void handleSignInEvent(ai ai)
    {
        a();
    }

    public final void handleSignOutEvent(aj aj)
    {
        l.b = null;
        k.notifyDataSetChanged();
    }
}
