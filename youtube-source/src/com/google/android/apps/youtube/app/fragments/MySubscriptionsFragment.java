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
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.f;
import com.google.android.apps.youtube.app.ui.ie;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            TabbedMultiFeedFragment, ao, ap

public class MySubscriptionsFragment extends TabbedMultiFeedFragment
    implements android.view.View.OnClickListener
{

    private et Y;
    private et Z;
    private f aa;
    private ie ab;
    private af ac;
    private View ad;
    private boolean ae;
    private boolean af;
    private an ag;
    private RemoteControlContextualMenuController ah;
    private RemoteControlContextualMenuController ai;
    private Bundle aj;
    private ax b;
    private com.google.android.apps.youtube.core.identity.l d;
    private bj e;
    private aw f;
    private bc g;
    private Analytics h;
    private am i;

    public MySubscriptionsFragment()
    {
    }

    private void P()
    {
        ab.a(new GDataRequest[] {
            g.a().o()
        });
    }

    private void Q()
    {
        aa.a(new GDataRequest[] {
            g.a().p()
        });
    }

    private void R()
    {
        int i1 = c.getResources().getInteger(k.m);
        if (Z != null)
        {
            Z.a(i1);
        }
        if (Y != null)
        {
            Y.a(i1);
        }
    }

    private void S()
    {
        ViewGroup viewgroup;
        boolean flag;
        if (O() == 0)
        {
            flag = ae;
        } else
        {
            flag = af;
        }
        viewgroup = L();
        if (ad != null)
        {
            viewgroup.removeView(ad);
        }
        if (!flag)
        {
            return;
        }
        for (int i1 = 0; i1 < viewgroup.getChildCount(); i1++)
        {
            viewgroup.getChildAt(i1).setVisibility(8);
        }

        ad = LayoutInflater.from(c).inflate(l.bq, null);
        viewgroup.addView(ad, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ad.setVisibility(0);
        ad.findViewById(j.bs).setOnClickListener(this);
    }

    static void a(MySubscriptionsFragment mysubscriptionsfragment)
    {
        mysubscriptionsfragment.S();
    }

    static boolean a(MySubscriptionsFragment mysubscriptionsfragment, boolean flag)
    {
        mysubscriptionsfragment.ae = true;
        return true;
    }

    static Analytics b(MySubscriptionsFragment mysubscriptionsfragment)
    {
        return mysubscriptionsfragment.h;
    }

    static boolean b(MySubscriptionsFragment mysubscriptionsfragment, boolean flag)
    {
        mysubscriptionsfragment.af = true;
        return true;
    }

    static am c(MySubscriptionsFragment mysubscriptionsfragment)
    {
        return mysubscriptionsfragment.i;
    }

    protected final a a(PagedListView pagedlistview, int i1)
    {
        com.google.android.apps.youtube.app.ui.v v1;
        com.google.android.apps.youtube.app.adapter.af af2;
        switch (i1)
        {
        default:
            throw new IllegalArgumentException();

        case 0: // '\0'
            pagedlistview.setEmptyText(c.getString(p.cU));
            com.google.android.apps.youtube.app.ui.v v = com.google.android.apps.youtube.app.ui.ad.a(c, b.ai());
            com.google.android.apps.youtube.app.adapter.af af1 = com.google.android.apps.youtube.app.adapter.ag.b(c, e, v);
            Z = et.a(c, af1);
            R();
            ab = new ao(this, c, pagedlistview, Z, ac, f, false, i, false, WatchFeature.GUIDE_RIVER_UPLOADS, h, com.google.android.apps.youtube.core.Analytics.VideoCategory.ChannelUploads);
            if (aj != null)
            {
                ab.a(aj.getBundle("uploads_helper"));
            }
            if (d.b())
            {
                P();
            } else
            {
                ab.e();
            }
            ah = RemoteControlContextualMenuController.a(ag, v, Z, f, WatchFeature.GUIDE_RIVER_UPLOADS, h);
            ah.c();
            return af1;

        case 1: // '\001'
            pagedlistview.setEmptyText(c.getString(p.cN));
            v1 = com.google.android.apps.youtube.app.ui.ad.b(c, b.ai());
            af2 = com.google.android.apps.youtube.app.adapter.ag.a(c, g, e, v1);
            Y = et.a(c, af2);
            R();
            aa = new ap(this, c, pagedlistview, Y, g, f, true);
            break;
        }
        if (aj != null)
        {
            aa.a(aj.getBundle("events_helper"));
        }
        if (d.b())
        {
            Q();
        } else
        {
            aa.e();
        }
        ai = RemoteControlContextualMenuController.a(ag, v1, Y, f, h);
        return af2;
    }

    public final CharSequence a()
    {
        return c.getString(p.cf);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aj = bundle;
        b = G().d();
        d = b.aT();
        e = b.aw();
        g = b.f();
        f = b.aO();
        h = b.ba();
        i = c.N();
        ag = b.W();
        ac = g.l();
        if (d.b())
        {
            if (ab != null)
            {
                P();
            }
            if (aa != null)
            {
                Q();
            }
        }
    }

    protected final void b(int i1)
    {
        S();
    }

    protected final String c(int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException();

        case 0: // '\0'
            return c.getString(p.dD);

        case 1: // '\001'
            return c.getString(p.dB);
        }
    }

    public final void d()
    {
        super.d();
        R();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (ab != null)
        {
            bundle.putBundle("uploads_helper", ab.d());
        }
        if (aa != null)
        {
            bundle.putBundle("events_helper", aa.d());
        }
        aj = null;
    }

    protected final int j_()
    {
        return 2;
    }

    public void onClick(View view)
    {
        i.h();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        R();
        S();
    }

    public final void r()
    {
        super.r();
        if (ah != null)
        {
            ah.b();
        }
        if (ai != null)
        {
            ai.b();
        }
    }

    public final void t()
    {
        super.t();
        if (ah != null)
        {
            ah.a();
        }
        if (ai != null)
        {
            ai.a();
        }
    }
}
