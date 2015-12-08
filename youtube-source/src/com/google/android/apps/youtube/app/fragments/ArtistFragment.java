// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.dw;
import com.google.android.apps.youtube.app.ui.fp;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bq;
import com.google.android.apps.youtube.datalib.legacy.model.Artist;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, c, d, g, 
//            e, a

public class ArtistFragment extends PaneFragment
    implements fp
{

    private String Y;
    private TextView Z;
    public g a;
    private TextView aa;
    private boolean ab;
    private View ac;
    private ViewStub ad;
    private View ae;
    private View af;
    private TextView ag;
    private ProgressBar ah;
    private v ai;
    private dw aj;
    private RemoteControlContextualMenuController ak;
    private boolean al;
    private boolean am;
    private am b;
    private bq d;
    private ax e;
    private ListView f;
    private View g;
    private View h;
    private String i;

    public ArtistFragment()
    {
    }

    private void L()
    {
        int k = 0;
        boolean flag = false;
        if (ae != null)
        {
            View view = ac;
            if (!al && am)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            view.setVisibility(k);
            view = ae;
            if (al && am)
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = 8;
            }
            view.setVisibility(k);
            return;
        }
        View view1 = ac;
        if (!am)
        {
            k = 8;
        }
        view1.setVisibility(k);
    }

    private void M()
    {
        int k;
        if (ab)
        {
            k = h.e;
        } else
        {
            k = h.d;
        }
        Z.setCompoundDrawablesWithIntrinsicBounds(0, 0, k, 0);
    }

    static TextView a(ArtistFragment artistfragment)
    {
        return artistfragment.Z;
    }

    static String a(ArtistFragment artistfragment, String s)
    {
        artistfragment.Y = s;
        return s;
    }

    static void a(ArtistFragment artistfragment, Artist artist)
    {
        if (artist.relatedArtists != null && !artist.relatedArtists.isEmpty())
        {
            int k = artist.relatedArtists.size();
            artistfragment.af.setVisibility(0);
            Object obj = artistfragment.c.getLayoutInflater();
            if (k > 3)
            {
                artistfragment.h = ((LayoutInflater) (obj)).inflate(l.g, artistfragment.f, false);
                artistfragment.ag = (TextView)artistfragment.h.findViewById(j.cH);
                artistfragment.ag.setOnClickListener(new c(artistfragment));
            } else
            {
                artistfragment.h = ((LayoutInflater) (obj)).inflate(l.m, artistfragment.f, false);
            }
            artistfragment.f.addFooterView(artistfragment.h);
            obj = new d(artistfragment);
            artistfragment.a = new g(artistfragment, artistfragment.c, l.aQ, ((com.google.android.apps.youtube.app.adapter.ai) (obj)));
            artistfragment.a.a(artist);
            artistfragment.a.a(true);
            artistfragment.f.setAdapter(artistfragment.a);
            artistfragment.f.setOnItemClickListener(new e(artistfragment));
        }
    }

    static boolean a(ArtistFragment artistfragment, boolean flag)
    {
        artistfragment.ab = false;
        return false;
    }

    static TextView b(ArtistFragment artistfragment)
    {
        return artistfragment.aa;
    }

    static void c(ArtistFragment artistfragment)
    {
        artistfragment.M();
    }

    static dw d(ArtistFragment artistfragment)
    {
        return artistfragment.aj;
    }

    static void e(ArtistFragment artistfragment)
    {
        boolean flag;
        if (!artistfragment.ab)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        artistfragment.ab = flag;
        if (artistfragment.ab)
        {
            artistfragment.aa.setMaxLines(0x7fffffff);
        } else
        {
            artistfragment.aa.setMaxLines(4);
        }
        artistfragment.M();
        artistfragment.f.requestLayout();
    }

    static TextView f(ArtistFragment artistfragment)
    {
        return artistfragment.ag;
    }

    static ListView g(ArtistFragment artistfragment)
    {
        return artistfragment.f;
    }

    static am h(ArtistFragment artistfragment)
    {
        return artistfragment.b;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        f = (ListView)layoutinflater.inflate(l.f, null);
        e.aV();
        viewgroup = e.f();
        bundle = e.aO();
        com.google.android.apps.youtube.core.client.bj bj = e.aw();
        g = layoutinflater.inflate(l.h, null);
        layoutinflater = g.findViewById(j.w);
        Z = (TextView)layoutinflater.findViewById(j.x);
        aa = (TextView)layoutinflater.findViewById(j.v);
        ai = com.google.android.apps.youtube.app.ui.ad.a(c, e.ai());
        ac = g.findViewById(j.eb);
        aj = new dw(c, b, e.aw(), ai, viewgroup, this);
        aj.a(ac);
        ac.setVisibility(8);
        ad = (ViewStub)g.findViewById(j.fu);
        if (com.google.android.apps.youtube.core.utils.l.a(c))
        {
            ae = ad.inflate();
            aj.a(ae, com.google.android.apps.youtube.app.adapter.ag.a(c, bj, ai, 2), 4);
            ae.setVisibility(8);
        }
        ah = (ProgressBar)g.findViewById(j.dR);
        af = g.findViewById(j.ea);
        af.setVisibility(8);
        ah.setVisibility(0);
        f.addHeaderView(g);
        d.a(i, com.google.android.apps.youtube.common.a.a.a(c, new com.google.android.apps.youtube.app.fragments.a(this)));
        ak = RemoteControlContextualMenuController.a(e.W(), ai, null, bundle, WatchFeature.ARTIST_VIDEOS, c.P());
        return f;
    }

    public final CharSequence a()
    {
        return Y;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        e = G().d();
        d = e.N();
        b = c.N();
        i = h().getString("artist_id");
        if (TextUtils.isEmpty(i))
        {
            c.d(false);
        }
    }

    public final void b(int k)
    {
        boolean flag;
        if (k > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am = flag;
        ah.setVisibility(8);
        L();
        f.requestLayout();
        if (a != null)
        {
            a.notifyDataSetChanged();
        }
    }

    public final void h_()
    {
        ah.setVisibility(8);
        L();
        f.requestLayout();
        if (a != null)
        {
            a.notifyDataSetChanged();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        boolean flag;
        if (configuration.orientation == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        al = flag;
        L();
    }

    public final void r()
    {
        super.r();
        boolean flag;
        if (j().getConfiguration().orientation == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        al = flag;
        ak.b();
        L();
    }

    public final void t()
    {
        super.t();
        ak.a();
    }
}
