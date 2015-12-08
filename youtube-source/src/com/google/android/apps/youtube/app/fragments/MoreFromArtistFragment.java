// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.ie;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.client.bq;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, af

public class MoreFromArtistFragment extends PaneFragment
{

    private et Y;
    private ie Z;
    private ax a;
    private v aa;
    private RemoteControlContextualMenuController ab;
    private an ac;
    private bc b;
    private bj d;
    private bq e;
    private aw f;
    private Analytics g;
    private String h;
    private String i;

    public MoreFromArtistFragment()
    {
    }

    private void L()
    {
        if (Y != null)
        {
            Y.a(1);
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (PagedListView)layoutinflater.inflate(l.aR, viewgroup, false);
        viewgroup.a(layoutinflater.inflate(l.an, viewgroup, false));
        viewgroup.b(layoutinflater.inflate(l.m, null));
        layoutinflater = ad.a(c, a.ai());
        aa = layoutinflater;
        aa = layoutinflater;
        layoutinflater = ag.a(c, d, aa);
        Y = et.b(c, layoutinflater);
        Z = new ie(c, viewgroup, Y, new af(b, e), f, false, c.N(), false, WatchFeature.SEARCH, g, com.google.android.apps.youtube.core.Analytics.VideoCategory.RelatedVideos);
        ab = RemoteControlContextualMenuController.a(ac, aa, Y, f, WatchFeature.ARTIST_VIDEOS, G().D());
        if (bundle != null)
        {
            Z.a(bundle.getBundle("videos_helper"));
        }
        return viewgroup;
    }

    public final CharSequence a()
    {
        return c.getString(p.B, new Object[] {
            h
        });
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = G().d();
        b = a.f();
        d = a.aw();
        e = a.N();
        f = a.aO();
        g = a.ba();
        ac = a.W();
        bundle = h();
        h = (String)c.a(bundle.getString("artist_name"));
        i = (String)c.a(bundle.getString("artist_id"));
    }

    public final void d()
    {
        super.d();
        L();
    }

    public final void e()
    {
        super.e();
        if (Z != null)
        {
            Z.f();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (Z != null)
        {
            bundle.putBundle("videos_helper", Z.d());
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
        L();
    }

    public final void r()
    {
        super.r();
        Uri uri = Uri.parse(String.format("bs://%s/", new Object[] {
            i
        }));
        Z.a(new GDataRequest[] {
            GDataRequest.a(uri)
        });
        ab.b();
    }
}
