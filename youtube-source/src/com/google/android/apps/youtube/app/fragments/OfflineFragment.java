// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.app.ui.TabbedView;
import com.google.android.apps.youtube.app.ui.bv;
import com.google.android.apps.youtube.app.ui.cc;
import com.google.android.apps.youtube.app.ui.ch;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.player.z;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.m;
import com.google.android.youtube.p;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, aw, ax

public class OfflineFragment extends PaneFragment
{

    private TabbedView Y;
    private ProgressBar Z;
    private ax a;
    private int aa;
    private int ab;
    private ClearOfflineDialogFragment ac;
    private OfflineStoreInterface b;
    private a d;
    private bj e;
    private h f;
    private com.google.android.apps.youtube.app.offline.p g;
    private ch h;
    private cc i;

    public OfflineFragment()
    {
    }

    static int a(OfflineFragment offlinefragment)
    {
        return offlinefragment.aa;
    }

    static int a(OfflineFragment offlinefragment, int k)
    {
        offlinefragment.aa = k;
        return k;
    }

    static int b(OfflineFragment offlinefragment, int k)
    {
        offlinefragment.ab = k;
        return k;
    }

    static void b(OfflineFragment offlinefragment)
    {
        if (offlinefragment.aa == -1 || offlinefragment.ab == -1) goto _L2; else goto _L1
_L1:
        if (offlinefragment.aa != 0 || offlinefragment.ab <= 0) goto _L4; else goto _L3
_L3:
        offlinefragment.Y.a(1);
_L6:
        offlinefragment.Y.setVisibility(0);
        offlinefragment.Z.setVisibility(8);
_L2:
        return;
_L4:
        if (offlinefragment.aa > 0 && offlinefragment.ab == 0)
        {
            offlinefragment.Y.a(0);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static int c(OfflineFragment offlinefragment)
    {
        return offlinefragment.ab;
    }

    static void d(OfflineFragment offlinefragment)
    {
        offlinefragment.b.f();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.as, viewgroup, false);
        Y = (TabbedView)layoutinflater.findViewById(j.ft);
        Z = (ProgressBar)layoutinflater.findViewById(j.co);
        viewgroup = Y.a(p._flddo, l.ay);
        Object obj = a.aT();
        q q1 = a.q();
        r r1;
        w w1;
        bv bv1;
        if (((com.google.android.apps.youtube.core.identity.l) (obj)).b())
        {
            b = q1.a(((com.google.android.apps.youtube.core.identity.l) (obj)).c());
        } else
        {
            b = q1.a();
        }
        bv1 = new bv(c, g);
        r1 = new r(c, ((com.google.android.apps.youtube.core.identity.l) (obj)), q1, a.bk(), a.aO(), f, g, bv1, c.J());
        w1 = a.aa();
        w1.a(new z(c));
        obj = new f(c, ((com.google.android.apps.youtube.core.identity.l) (obj)), q1, a.bk(), a.aO(), f, g, bv1);
        h = new ch(c, c.N(), b, r1, c.J(), d, e, f, g, w1, new aw(this));
        h.a(viewgroup);
        viewgroup = Y.a(p.dm, l.av);
        i = new cc(c, b, ((f) (obj)), e, d, c.N(), f, g, new com.google.android.apps.youtube.app.fragments.ax(this));
        i.a(viewgroup);
        if (bundle != null)
        {
            int k = bundle.getInt("offline_selected_tab_index");
            Y.a(k);
        }
        return layoutinflater;
    }

    public final CharSequence a()
    {
        return c.getString(p.dn);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = H();
        d = a.bf();
        e = a.aw();
        f = a.aX();
        g = a.Z();
    }

    public final void a(com.google.android.apps.youtube.app.compat.j j1)
    {
        super.a(j1);
        c.M().a(m.g, j1);
    }

    public final boolean a(com.google.android.apps.youtube.app.compat.q q1)
    {
        if (q1.e() == j.ct)
        {
            if (ac != null)
            {
                ac.a(c.c(), "ClearOfflineDialogFragment");
            }
            return true;
        }
        if (q1.e() == j.cw)
        {
            com.google.android.apps.youtube.core.utils.m.a(c, Uri.parse(a(p.gB)));
            return true;
        } else
        {
            return super.a(q1);
        }
    }

    public final void d()
    {
        super.d();
        ac = (ClearOfflineDialogFragment)c.c().a("ClearOfflineDialogFragment");
        if (ac == null)
        {
            ac = new ClearOfflineDialogFragment();
        }
        com.google.android.apps.youtube.app.fragments.ClearOfflineDialogFragment.a(ac, new WeakReference(this));
        d.a(h);
        d.a(i);
    }

    public final void e()
    {
        super.e();
        d.b(h);
        d.b(i);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (Y != null)
        {
            bundle.putInt("offline_selected_tab_index", Y.b());
        }
    }

    public final void r()
    {
        super.r();
        Y.setVisibility(8);
        Z.setVisibility(0);
        aa = -1;
        ab = -1;
        h.a();
        i.a();
    }

    private class ClearOfflineDialogFragment extends YouTubeDialogFragment
    {

        private WeakReference Y;

        static WeakReference a(ClearOfflineDialogFragment clearofflinedialogfragment, WeakReference weakreference)
        {
            clearofflinedialogfragment.Y = weakreference;
            return weakreference;
        }

        static void a(ClearOfflineDialogFragment clearofflinedialogfragment)
        {
            if (clearofflinedialogfragment.Y != null && clearofflinedialogfragment.Y.get() != null)
            {
                OfflineFragment.d((OfflineFragment)clearofflinedialogfragment.Y.get());
            }
        }

        public final Dialog c(Bundle bundle)
        {
            bundle = i();
            ay ay1 = new ay(this);
            return (new aa(bundle)).setMessage(p.al).setPositiveButton(0x1040013, ay1).setNegativeButton(0x1040009, ay1).create();
        }

        public ClearOfflineDialogFragment()
        {
        }
    }

}
