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
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.ie;
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
//            PaneFragment, cf, ce

public class WatchLaterFragment extends PaneFragment
{

    private af Y;
    private et Z;
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
    private ie i;

    public WatchLaterFragment()
    {
    }

    private void L()
    {
        if (Z != null)
        {
            Z.a(b.getInteger(k.m));
        }
    }

    static af a(WatchLaterFragment watchlaterfragment)
    {
        return watchlaterfragment.Y;
    }

    static void a(WatchLaterFragment watchlaterfragment, Video video)
    {
        a a1 = com.google.android.apps.youtube.common.a.a.a(watchlaterfragment.c, new cf(watchlaterfragment, video));
        watchlaterfragment.e.c(video.editUri, a1);
    }

    static aw b(WatchLaterFragment watchlaterfragment)
    {
        return watchlaterfragment.h;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.bK, viewgroup, false);
        aa = ad.a(c, a.ai());
        aa.a(p.fg, new ce(this));
        Y = ag.d(c, f, aa);
        Z = et.a(c, Y);
        i = new ie(c, (PagedView)layoutinflater.findViewById(j.gn), Z, d, h, true, c.N(), true, WatchFeature.WATCH_LATER, c.P(), com.google.android.apps.youtube.core.Analytics.VideoCategory.WatchLater);
        ab = RemoteControlContextualMenuController.a(ac, aa, Z, h, WatchFeature.WATCH_LATER, c.P());
        if (bundle != null)
        {
            i.a(bundle.getBundle("watch_later_helper"));
        }
        return layoutinflater;
    }

    public final CharSequence a()
    {
        return a(p.aj);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = G().d();
        b = j();
        g = a.aT();
        e = a.f();
        f = a.aw();
        h = a.aO();
        ac = a.W();
        d = e.q();
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
        if (i != null)
        {
            bundle.putBundle("watch_later_helper", i.d());
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
        if (g.b())
        {
            i.a(new GDataRequest[] {
                e.a().k()
            });
        }
        ab.b();
    }
}
