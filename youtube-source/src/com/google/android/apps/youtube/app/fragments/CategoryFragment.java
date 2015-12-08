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
import com.google.ads.conversiontracking.GoogleConversionPing;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.ie;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment

public class CategoryFragment extends PaneFragment
{

    public static final Map a;
    public static final Map b;
    private View Y;
    private PagedListView Z;
    private an aa;
    private RemoteControlContextualMenuController ab;
    private ie ac;
    private ax d;
    private Resources e;
    private aw f;
    private String g;
    private WatchFeature h;
    private et i;

    public CategoryFragment()
    {
    }

    private void L()
    {
        if (i != null)
        {
            i.a(e.getInteger(k.m));
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Y = layoutinflater.inflate(l.p, (ViewGroup)q());
        Z = (PagedListView)Y.findViewById(j.gf);
        if (g.equalsIgnoreCase("Music"))
        {
            GoogleConversionPing.a(d.af(), "1001680686", "4dahCKKczAYQrt7R3QM", "<Android_YT_Music_Page>", null);
        }
        layoutinflater = ad.a(c, d.ai());
        viewgroup = ag.b(c, d.aw(), layoutinflater);
        i = et.a(c, viewgroup);
        ac = new ie(c, Z, i, d.f().k(), f, false, c.N(), false, h, c.P(), com.google.android.apps.youtube.core.Analytics.VideoCategory.HomeFeed);
        if (bundle != null)
        {
            ac.a(bundle.getBundle("videos_helper"));
        }
        ac.a(new GDataRequest[] {
            d.f().a().a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_POPULAR, g, Util.a(c), com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.THIS_WEEK)
        });
        ab = RemoteControlContextualMenuController.a(aa, layoutinflater, i, f, h, d.ba());
        return Y;
    }

    public final CharSequence a()
    {
        return c.getString(((Integer)a.get(g)).intValue());
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        g = (String)c.a(((Bundle)c.a(h())).getString("category_term"), "categoryTerm cannot be null");
        h = (WatchFeature)c.a(b.get(g));
        d = G().d();
        e = c.getResources();
        f = d.aO();
        aa = d.W();
    }

    public final void d()
    {
        super.d();
        L();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (ac != null)
        {
            bundle.putBundle("videos_helper", ac.d());
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        L();
    }

    public final void r()
    {
        super.r();
        ab.b();
    }

    public final void t()
    {
        super.t();
        ab.a();
    }

    static 
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap(15);
        a = linkedhashmap;
        linkedhashmap.put("Autos", Integer.valueOf(p.P));
        a.put("Comedy", Integer.valueOf(p.Q));
        a.put("Education", Integer.valueOf(p.R));
        a.put("Entertainment", Integer.valueOf(p.S));
        a.put("Film", Integer.valueOf(p.T));
        a.put("Games", Integer.valueOf(p.U));
        a.put("Music", Integer.valueOf(p.W));
        a.put("News", Integer.valueOf(p.X));
        a.put("Nonprofit", Integer.valueOf(p.Y));
        a.put("People", Integer.valueOf(p.Z));
        a.put("Animals", Integer.valueOf(p.O));
        a.put("Tech", Integer.valueOf(p.ab));
        a.put("Sports", Integer.valueOf(p.aa));
        a.put("Howto", Integer.valueOf(p.V));
        a.put("Travel", Integer.valueOf(p.ac));
        linkedhashmap = new LinkedHashMap(20);
        b = linkedhashmap;
        linkedhashmap.put("Autos", WatchFeature.GUIDE_CATEGORY_AUTOS);
        b.put("Comedy", WatchFeature.GUIDE_CATEGORY_COMEDY);
        b.put("Education", WatchFeature.GUIDE_CATEGORY_EDUCATION);
        b.put("Entertainment", WatchFeature.GUIDE_CATEGORY_ENTERTAINMENT);
        b.put("Film", WatchFeature.GUIDE_CATEGORY_FILM);
        b.put("Games", WatchFeature.GUIDE_CATEGORY_GAMES);
        b.put("Music", WatchFeature.GUIDE_CATEGORY_MUSIC);
        b.put("News", WatchFeature.GUIDE_CATEGORY_NEWS);
        b.put("Nonprofit", WatchFeature.GUIDE_CATEGORY_NONPROFIT);
        b.put("People", WatchFeature.GUIDE_CATEGORY_PEOPLE);
        b.put("Animals", WatchFeature.GUIDE_CATEGORY_ANIMALS);
        b.put("Tech", WatchFeature.GUIDE_CATEGORY_SCIENCE);
        b.put("Sports", WatchFeature.GUIDE_CATEGORY_SPORTS);
        b.put("Howto", WatchFeature.GUIDE_CATEGORY_HOWTO);
        b.put("Travel", WatchFeature.GUIDE_CATEGORY_TRAVEL);
    }
}
