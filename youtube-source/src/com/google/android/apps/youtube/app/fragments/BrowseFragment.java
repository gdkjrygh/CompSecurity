// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.a.a.a.a.am;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.z;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.b.q;
import com.google.android.apps.youtube.app.d.aj;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.navigation.AppNavigator;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.ui.LoadingFrameLayout;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.TabbedView;
import com.google.android.apps.youtube.app.ui.bv;
import com.google.android.apps.youtube.app.ui.presenter.bk;
import com.google.android.apps.youtube.app.ui.presenter.cc;
import com.google.android.apps.youtube.app.ui.presenter.cv;
import com.google.android.apps.youtube.app.ui.presenter.o;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.apps.youtube.datalib.innertube.ao;
import com.google.android.apps.youtube.datalib.innertube.ap;
import com.google.android.apps.youtube.datalib.innertube.aq;
import com.google.android.apps.youtube.datalib.innertube.ar;
import com.google.android.apps.youtube.datalib.innertube.d;
import com.google.android.apps.youtube.datalib.innertube.g;
import com.google.android.apps.youtube.datalib.innertube.model.ab;
import com.google.android.apps.youtube.datalib.innertube.model.an;
import com.google.android.apps.youtube.datalib.innertube.model.c;
import com.google.android.apps.youtube.uilib.innertube.t;
import com.google.android.youtube.j;
import com.google.android.youtube.m;
import com.google.android.youtube.p;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, k, i, j, 
//            l, h

public class BrowseFragment extends PaneFragment
{

    private AtomicReference Y;
    private String Z;
    private ax a;
    private LoadingFrameLayout aa;
    private aj ab;
    private RemoteControlContextualMenuController ac;
    private cc ad;
    private String ae;
    private ab af;
    private com.google.android.apps.youtube.app.compat.q ag;
    private AlertDialog ah;
    private d b;
    private aw d;
    private com.google.android.apps.youtube.app.ui.a e;
    private a f;
    private bc g;
    private aq h;
    private au i;

    public BrowseFragment()
    {
    }

    private void L()
    {
        Object obj = E().getNavigationEndpoint();
        byte abyte0[] = AppNavigator.b(((kz) (obj)));
        g g1 = b.a();
        g1.a(Z);
        g1.a(abyte0);
        if (obj != null && ((kz) (obj)).c != null)
        {
            g1.c(((kz) (obj)).c.c);
        }
        aa.a();
        obj = a.bf();
        ((a) (obj)).a(new q());
        b.a(g1, new k(this, ((a) (obj)), abyte0));
    }

    static View a(BrowseFragment browsefragment, Object obj, byte abyte0[])
    {
        browsefragment.af = null;
        abyte0 = null;
        if (obj instanceof c)
        {
            abyte0 = (new o(browsefragment.c, browsefragment.a.G(), browsefragment.a.aT(), browsefragment.a.bk(), browsefragment.a.aQ(), browsefragment.a.F(), browsefragment.a.aw(), browsefragment.c.q(), browsefragment.a.bf(), browsefragment.d)).a((c)obj);
        } else
        if (obj instanceof ab)
        {
            abyte0 = browsefragment.a.Z();
            f f1 = new f(browsefragment.c, browsefragment.a.aT(), browsefragment.a.q(), browsefragment.a.bk(), browsefragment.a.aO(), browsefragment.a.aX(), abyte0, new bv(browsefragment.c, abyte0));
            WatchWhileActivity watchwhileactivity = browsefragment.c;
            com.google.android.apps.youtube.core.Analytics analytics = browsefragment.a.ba();
            l l1 = browsefragment.a.aT();
            com.google.android.apps.youtube.core.identity.aa aa1 = browsefragment.a.bk();
            com.google.android.apps.youtube.datalib.innertube.v v = browsefragment.a.x();
            aw aw = browsefragment.a.aO();
            a a1 = browsefragment.a.bf();
            bc bc1 = browsefragment.a.f();
            com.google.android.apps.youtube.core.client.bj bj = browsefragment.a.aw();
            com.google.android.apps.youtube.datalib.d.a a2 = browsefragment.c.q();
            abyte0 = browsefragment.a.q();
            l l2 = browsefragment.a.aT();
            if (l2.b())
            {
                abyte0 = abyte0.a(l2.c());
            } else
            {
                abyte0 = abyte0.a();
            }
            abyte0 = (new bk(watchwhileactivity, analytics, l1, aa1, v, aw, a1, bc1, bj, a2, abyte0, f1)).a((ab)obj);
            browsefragment.af = (ab)obj;
            return abyte0;
        }
        return abyte0;
    }

    static ab a(BrowseFragment browsefragment)
    {
        return browsefragment.af;
    }

    static void a(BrowseFragment browsefragment, String s1)
    {
        if (browsefragment.i.F())
        {
            ar ar1 = browsefragment.h.a();
            ar1.a(s1);
            ar1.a(ar.a);
            browsefragment.h.a(ar1, new i(browsefragment, s1));
            return;
        } else
        {
            browsefragment.g.n(s1, com.google.android.apps.youtube.common.a.a.a(browsefragment.c, new com.google.android.apps.youtube.app.fragments.j(browsefragment, s1)));
            return;
        }
    }

    static void a(BrowseFragment browsefragment, List list, View view)
    {
        boolean flag;
        if (view != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        browsefragment.ab.a();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            an an1 = (an)list.next();
            com.google.android.apps.youtube.datalib.innertube.model.aj aj1 = an1.c();
            if (aj1 != null)
            {
                Object obj = new z(new com.google.android.apps.youtube.app.ui.presenter.am(browsefragment.c, new cv(), browsefragment.a.bf()));
                ListView listview = (ListView)ListView.inflate(browsefragment.c, com.google.android.youtube.l.ba, null);
                if (flag)
                {
                    listview.addHeaderView(view);
                    flag = false;
                }
                obj = new t(browsefragment.c.N(), listview, ((com.google.android.apps.youtube.uilib.innertube.p) (obj)), browsefragment.b, browsefragment.a.bf(), browsefragment.ad, browsefragment.d);
                ((t) (obj)).a(aj1);
                browsefragment.ab.a(an1, ((t) (obj)));
            }
        } while (true);
    }

    static String b(BrowseFragment browsefragment, String s1)
    {
        browsefragment.ae = s1;
        return s1;
    }

    static AtomicReference b(BrowseFragment browsefragment)
    {
        return browsefragment.Y;
    }

    static a c(BrowseFragment browsefragment)
    {
        return browsefragment.f;
    }

    static aw d(BrowseFragment browsefragment)
    {
        return browsefragment.d;
    }

    static LoadingFrameLayout e(BrowseFragment browsefragment)
    {
        return browsefragment.aa;
    }

    static void f(BrowseFragment browsefragment)
    {
        browsefragment.L();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aa = (LoadingFrameLayout)layoutinflater.inflate(com.google.android.youtube.l.k, viewgroup, false);
        aa.setOnRetryClickListener(new com.google.android.apps.youtube.app.fragments.l(this, (byte)0));
        ad = new cc(c, c.q(), a.bf(), a.aw(), a.aT(), a.aQ(), a.bk(), e, a.F(), a.G(), a.ai(), d, ac);
        ab = new aj((TabbedView)aa.findViewById(j.ft));
        if (Z == null)
        {
            if (bundle == null)
            {
                bundle = h();
            }
            Z = bundle.getString("browse_id");
        }
        L();
        return aa;
    }

    public final CharSequence a()
    {
        return ae;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = G().d();
        d = a.aO();
        b = a.A();
        e = new com.google.android.apps.youtube.app.ui.a(a.C());
        f = a.bf();
        g = a.f();
        h = a.z();
        i = a.b();
        Y = a.ai();
        ac = RemoteControlContextualMenuController.a(c, a.W(), d, WatchFeature.BROWSE, c.P(), a.f());
    }

    public final void a(com.google.android.apps.youtube.app.compat.j j1)
    {
        super.a(j1);
        c.M().a(m.a, j1);
        ag = j1.c(j.cu);
        ag.b(false);
    }

    public final boolean a(com.google.android.apps.youtube.app.compat.q q1)
    {
        if (q1.e() == j.cu)
        {
            if (ah == null)
            {
                q1 = new h(this);
                ah = (new aa(c)).setMessage(String.format(a(p.aL), new Object[] {
                    af.c()
                })).setPositiveButton(0x1040013, q1).setNegativeButton(0x1040009, q1).create();
            }
            ah.show();
            return true;
        } else
        {
            return super.a(q1);
        }
    }

    public final void b(com.google.android.apps.youtube.app.compat.j j1)
    {
        super.b(j1);
        j1 = ag;
        boolean flag;
        if (af != null && af.l())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1.b(flag);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("browse_id", Z);
    }

    public void handleVideoAddedToPlaylistEvent(ao ao1)
    {
        if (af != null && ao1.a.equals(af.a()))
        {
            L();
        }
    }

    public void handleVideoRemovedFromPlaylistEvent(ap ap1)
    {
        if (af != null && ap1.a.equals(af.a()))
        {
            L();
        }
    }

    public final void r()
    {
        super.r();
        a.bf().a(this);
        ac.b();
    }

    public final void s()
    {
        super.s();
        a.bf().b(this);
    }

    public final void t()
    {
        super.t();
        ac.a();
    }
}
