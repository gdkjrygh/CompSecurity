// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment

public final class ChannelStoreCategoryFragment extends PaneFragment
{

    private et Y;
    private com.google.android.apps.youtube.core.ui.l Z;
    private Resources a;
    private Uri aa;
    private String ab;
    private boolean ac;
    private com.google.android.apps.youtube.core.identity.l b;
    private bc d;
    private af e;
    private bj f;
    private a g;
    private aw h;
    private Analytics i;

    public ChannelStoreCategoryFragment()
    {
    }

    private void L()
    {
        if (Y != null)
        {
            Y.a(a.getInteger(k.b));
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(l.q, viewgroup, false);
        PagedListView pagedlistview = (PagedListView)viewgroup.findViewById(j.as);
        layoutinflater = G();
        layoutinflater = ag.a(c, i, d, b, layoutinflater, g, c.N(), h, f, c, c);
        Y = new et(c, layoutinflater);
        Y.b(g.x);
        Y.c(g.x);
        Y.a(g.u, g.w, g.v, g.t);
        if (ac)
        {
            layoutinflater = d.g();
        } else
        {
            layoutinflater = d.f();
        }
        e = layoutinflater;
        Z = new com.google.android.apps.youtube.core.ui.l(c, pagedlistview, Y, e, h);
        if (bundle != null)
        {
            Z.a(bundle.getBundle("category_helper"));
        }
        return viewgroup;
    }

    public final CharSequence a()
    {
        return ab;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = G().d();
        a = j();
        b = bundle.aT();
        d = bundle.f();
        f = bundle.aw();
        g = bundle.bf();
        h = bundle.aO();
        i = bundle.ba();
        bundle = h();
        aa = (Uri)c.a((Uri)bundle.getParcelable("channel_feed_uri"), "channelFeedUri cannot be null");
        ab = (String)c.a(bundle.getString("category"), "category cannot be null");
        ac = ab.equals(com.google.android.apps.youtube.app.ui.ChannelStoreOutline.Category.RECOMMENDED.toString(a));
    }

    public final String b()
    {
        return "yt_channel";
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
            bundle.putBundle("category_helper", Z.d());
        }
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        L();
    }

    public final void r()
    {
label0:
        {
            super.r();
            if (G().d().aT().b())
            {
                if (!ac)
                {
                    break label0;
                }
                Z.a(new GDataRequest[] {
                    d.a().e(24)
                });
            }
            return;
        }
        Z.a(new GDataRequest[] {
            d.a().d(aa)
        });
    }
}
