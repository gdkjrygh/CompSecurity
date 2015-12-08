// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.br;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.core.ui.l;
import com.google.android.youtube.k;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            TabbedMultiFeedFragment, ac, ad

public class LiveFragment extends TabbedMultiFeedFragment
{

    private l Y;
    private l Z;
    private Bundle aa;
    private ax b;
    private bj d;
    private aw e;
    private h f;
    private bc g;
    private et h;
    private et i;

    public LiveFragment()
    {
    }

    private void P()
    {
        int j = c.getResources().getInteger(k.m);
        if (h != null)
        {
            h.a(j);
        }
        if (i != null)
        {
            i.a(j);
        }
    }

    protected final a a(PagedListView pagedlistview, int j)
    {
        Object obj;
        switch (j)
        {
        default:
            throw new IllegalArgumentException();

        case 0: // '\0'
            com.google.android.apps.youtube.app.adapter.af af = ag.a(c.getBaseContext(), g, d, f, null);
            h = et.a(c, af);
            P();
            Y = new br(c, pagedlistview, h, g, e, c.N(), new ac(this));
            if (aa != null)
            {
                Y.a(aa.getBundle("live_now_helper"));
            }
            Y.a(new GDataRequest[] {
                g.a().h()
            });
            return af;

        case 1: // '\001'
            obj = ad.a(c, b.ai());
            obj = ag.a(c.getBaseContext(), g, d, f, ((com.google.android.apps.youtube.app.ui.v) (obj)));
            i = et.a(c, ((a) (obj)));
            P();
            Z = new br(c, pagedlistview, i, g, e, c.N(), new com.google.android.apps.youtube.app.fragments.ad(this));
            break;
        }
        if (aa != null)
        {
            Z.a(aa.getBundle("recent_helper"));
        }
        Z.a(new GDataRequest[] {
            g.a().i()
        });
        return ((a) (obj));
    }

    public final CharSequence a()
    {
        return c.getString(p.cm);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aa = bundle;
        b = G().d();
        d = b.aw();
        f = b.aX();
        g = b.f();
        e = b.aO();
    }

    protected final String c(int j)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException();

        case 0: // '\0'
            return c.getBaseContext().getString(p.cq);

        case 1: // '\001'
            return c.getBaseContext().getString(p.eR);
        }
    }

    public final void d()
    {
        super.d();
        P();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (Y != null)
        {
            bundle.putBundle("live_now_helper", Y.d());
        }
        if (Z != null)
        {
            bundle.putBundle("recent_helper", Z.d());
        }
        aa = null;
    }

    protected final int j_()
    {
        return 2;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        P();
    }
}
