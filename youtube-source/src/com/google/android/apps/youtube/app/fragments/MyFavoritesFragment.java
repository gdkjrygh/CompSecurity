// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.af;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.ie;
import com.google.android.apps.youtube.app.ui.ig;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, aj, ai

public class MyFavoritesFragment extends PaneFragment
    implements ig
{

    private ie Y;
    private af Z;
    private ax a;
    private v aa;
    private RemoteControlContextualMenuController ab;
    private an ac;
    private Resources b;
    private com.google.android.apps.youtube.core.async.af d;
    private bc e;
    private bj f;
    private com.google.android.apps.youtube.core.identity.l g;
    private aw h;
    private et i;

    public MyFavoritesFragment()
    {
    }

    private void L()
    {
        if (i != null)
        {
            i.a(b.getInteger(k.m));
        }
    }

    static af a(MyFavoritesFragment myfavoritesfragment)
    {
        return myfavoritesfragment.Z;
    }

    static void a(MyFavoritesFragment myfavoritesfragment, Video video)
    {
        a a1 = com.google.android.apps.youtube.common.a.a.a(myfavoritesfragment.c, new aj(myfavoritesfragment, video));
        myfavoritesfragment.e.b(video.editUri, a1);
    }

    static aw b(MyFavoritesFragment myfavoritesfragment)
    {
        return myfavoritesfragment.h;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.ao, viewgroup, false);
        aa = ad.a(c, a.ai());
        viewgroup = new ai(this);
        aa.a(p.eT, viewgroup);
        Z = ag.b(c, f, aa);
        i = et.a(c, Z);
        Y = new ie(c, (PagedView)layoutinflater.findViewById(j.bf), i, d, h, true, this);
        ab = RemoteControlContextualMenuController.a(ac, aa, i, h, WatchFeature.MY_FAVORITES, c.P());
        if (bundle != null)
        {
            Y.a(bundle.getBundle("favorites_helper"));
        }
        return layoutinflater;
    }

    public final CharSequence a()
    {
        return a(p.ad);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = G().d();
        b = j();
        g = a.aT();
        e = a.f();
        f = a.aw();
        d = e.v();
        h = a.aO();
        ac = a.W();
    }

    public final void a(Video video, int i1)
    {
        c.N().a(video.id, false, WatchFeature.MY_FAVORITES);
    }

    public final String b()
    {
        return "yt_your_channel";
    }

    public final void d()
    {
        super.d();
        L();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (Y != null)
        {
            bundle.putBundle("favorites_helper", Y.d());
        }
    }

    public final void f()
    {
        super.f();
        ab.a();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        aa.b();
        L();
    }

    public final void r()
    {
        super.r();
        if (g.b())
        {
            Y.a(new GDataRequest[] {
                e.a().j()
            });
        }
        ab.b();
    }
}
