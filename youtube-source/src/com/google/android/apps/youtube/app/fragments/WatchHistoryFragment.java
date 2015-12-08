// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.adapter.aw;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.ie;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.m;
import com.google.android.youtube.p;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, cb, cc, ca

public class WatchHistoryFragment extends PaneFragment
{

    private com.google.android.apps.youtube.core.a.a Y;
    private v Z;
    private ax a;
    private RemoteControlContextualMenuController aa;
    private an ab;
    private ClearHistoryDialogFragment ac;
    private af b;
    private bc d;
    private bj e;
    private com.google.android.apps.youtube.core.identity.l f;
    private com.google.android.apps.youtube.core.aw g;
    private et h;
    private ie i;

    public WatchHistoryFragment()
    {
    }

    static com.google.android.apps.youtube.core.a.a a(WatchHistoryFragment watchhistoryfragment)
    {
        return watchhistoryfragment.Y;
    }

    static void a(WatchHistoryFragment watchhistoryfragment, Video video)
    {
        a a1 = com.google.android.apps.youtube.common.a.a.a(watchhistoryfragment.c, new cb(watchhistoryfragment, video));
        watchhistoryfragment.d.d(video.editUri, a1);
    }

    static com.google.android.apps.youtube.core.aw b(WatchHistoryFragment watchhistoryfragment)
    {
        return watchhistoryfragment.g;
    }

    static ie c(WatchHistoryFragment watchhistoryfragment)
    {
        return watchhistoryfragment.i;
    }

    static void d(WatchHistoryFragment watchhistoryfragment)
    {
        a a1 = com.google.android.apps.youtube.common.a.a.a(watchhistoryfragment.c, new cc(watchhistoryfragment));
        watchhistoryfragment.d.b(a1);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(l.bI, viewgroup, false);
        Z = ad.a(c, a.ai());
        Z.a(p.eV, new ca(this));
        Y = new aw(ag.a(c, e, Z));
        h = et.b(c, Y);
        PagedListView pagedlistview = (PagedListView)viewgroup.findViewById(j.gk);
        pagedlistview.a(layoutinflater.inflate(l.n, pagedlistview, false));
        pagedlistview.b(layoutinflater.inflate(l.m, null));
        i = new ie(c, pagedlistview, h, b, g, true, c.N(), true, WatchFeature.WATCH_HISTORY, c.P(), com.google.android.apps.youtube.core.Analytics.VideoCategory.WatchHistory);
        aa = RemoteControlContextualMenuController.a(ab, Z, h, g, WatchFeature.WATCH_HISTORY, c.P());
        if (bundle != null)
        {
            i.a(bundle.getBundle("watch_history_helper"));
        }
        return viewgroup;
    }

    public final CharSequence a()
    {
        return a(p.ai);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = G().d();
        f = a.aT();
        d = a.f();
        e = a.aw();
        g = a.aO();
        ab = a.W();
        b = d.r();
    }

    public final void a(com.google.android.apps.youtube.app.compat.j j1)
    {
        super.a(j1);
        c.M().a(m.h, j1);
    }

    public final boolean a(q q1)
    {
        if (q1.e() == j.cs)
        {
            if (ac != null)
            {
                ac.a(c.c(), "ClearHistoryDialogFragment");
            }
            return true;
        } else
        {
            return super.a(q1);
        }
    }

    public final String b()
    {
        return "yt_your_channel";
    }

    public final void d()
    {
        super.d();
        ac = (ClearHistoryDialogFragment)c.c().a("ClearHistoryDialogFragment");
        if (ac == null)
        {
            ac = new ClearHistoryDialogFragment();
        }
        com.google.android.apps.youtube.app.fragments.ClearHistoryDialogFragment.a(ac, new WeakReference(this));
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (i != null)
        {
            bundle.putBundle("watch_history_helper", i.d());
        }
    }

    public final void f()
    {
        super.f();
        aa.a();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        Z.b();
    }

    public final void r()
    {
        super.r();
        if (f.b())
        {
            i.a(new GDataRequest[] {
                d.a().l()
            });
        }
        aa.b();
    }

    private class ClearHistoryDialogFragment extends YouTubeDialogFragment
    {

        private WeakReference Y;

        static WeakReference a(ClearHistoryDialogFragment clearhistorydialogfragment, WeakReference weakreference)
        {
            clearhistorydialogfragment.Y = weakreference;
            return weakreference;
        }

        static void a(ClearHistoryDialogFragment clearhistorydialogfragment)
        {
            if (clearhistorydialogfragment.Y != null && clearhistorydialogfragment.Y.get() != null)
            {
                WatchHistoryFragment.d((WatchHistoryFragment)clearhistorydialogfragment.Y.get());
            }
        }

        public final Dialog c(Bundle bundle)
        {
            bundle = i();
            cd cd1 = new cd(this);
            return (new aa(bundle)).setMessage(p.hh).setPositiveButton(0x1040013, cd1).setNegativeButton(0x1040009, cd1).create();
        }

        public ClearHistoryDialogFragment()
        {
        }
    }

}
