// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ag;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.RemoteControlContextualMenuController;
import com.google.android.apps.youtube.app.ui.SubscribeHelper;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.apps.youtube.app.ui.do;
import com.google.android.apps.youtube.app.ui.et;
import com.google.android.apps.youtube.app.ui.f;
import com.google.android.apps.youtube.app.ui.g;
import com.google.android.apps.youtube.app.ui.gf;
import com.google.android.apps.youtube.app.ui.gj;
import com.google.android.apps.youtube.app.ui.ie;
import com.google.android.apps.youtube.app.ui.j;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.datalib.legacy.model.Branding;
import com.google.android.apps.youtube.datalib.legacy.model.Channel;
import com.google.android.youtube.e;
import com.google.android.youtube.i;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            TabbedMultiFeedFragment, s, m, n, 
//            p, o, q

public class ChannelFragment extends TabbedMultiFeedFragment
    implements gf, j
{

    private af Y;
    private Analytics Z;
    private am aa;
    private ak ab;
    private q ac;
    private Branding ad;
    private boolean ae;
    private boolean af;
    private et ag;
    private et ah;
    private et ai;
    private UserProfile aj;
    private Channel ak;
    private ie al;
    private do am;
    private View an;
    private g ao;
    private f ap;
    private SubscribeHelper aq;
    private gj ar;
    private boolean as;
    private an at;
    private RemoteControlContextualMenuController au;
    private RemoteControlContextualMenuController av;
    private Bundle aw;
    private com.google.android.apps.youtube.app.remote.ax ax;
    private String b;
    private Resources d;
    private ax e;
    private bj f;
    private com.google.android.apps.youtube.core.aw g;
    private bc h;
    private af i;

    public ChannelFragment()
    {
    }

    private void P()
    {
        h.h(b, com.google.android.apps.youtube.common.a.a.a(c, new s(this, (byte)0)));
    }

    private void Q()
    {
        al.a(new GDataRequest[] {
            h.a().b(aj.uploadsUri)
        });
        al.a(new m(this));
    }

    private void R()
    {
        am.a(new GDataRequest[] {
            h.a().f(aj.playlistsUri)
        });
        am.a(new n(this));
    }

    private void S()
    {
        ap.a(new GDataRequest[] {
            h.a().d(aj.activityUri)
        });
        ap.a(new com.google.android.apps.youtube.app.fragments.p(this));
    }

    private void T()
    {
        int i1 = d.getInteger(k.m);
        if (ag != null)
        {
            ag.a(i1);
        }
        if (ah != null)
        {
            ah.a(i1);
        }
        if (ai != null)
        {
            ai.a(i1);
        }
    }

    private void U()
    {
        if (ae && af)
        {
            N();
        }
    }

    static Analytics a(ChannelFragment channelfragment)
    {
        return channelfragment.Z;
    }

    static UserProfile a(ChannelFragment channelfragment, UserProfile userprofile)
    {
        channelfragment.aj = userprofile;
        return userprofile;
    }

    static Channel a(ChannelFragment channelfragment, Channel channel)
    {
        channelfragment.ak = channel;
        return channel;
    }

    static void a(ChannelFragment channelfragment, com.google.android.apps.youtube.core.ui.PagedView.State state)
    {
        channelfragment.a(state);
    }

    static void a(ChannelFragment channelfragment, Branding branding)
    {
        if (!channelfragment.ae)
        {
            channelfragment.ad = branding;
            channelfragment.ae = true;
            if (channelfragment.ao != null)
            {
                channelfragment.ao.a(branding);
            }
            channelfragment.U();
        }
    }

    private void a(g g1)
    {
        g1.a(aq.d(), aq.c());
    }

    private void a(com.google.android.apps.youtube.core.ui.PagedView.State state)
    {
        if (!af && com.google.android.apps.youtube.core.ui.PagedView.State.LOADING != state)
        {
            af = true;
            U();
        }
    }

    static am b(ChannelFragment channelfragment)
    {
        return channelfragment.aa;
    }

    private void b(g g1)
    {
        if (g1 != null)
        {
            g1.a(d.getBoolean(e.a), d.getFraction(i.a, 1, 1));
        }
    }

    static UserProfile c(ChannelFragment channelfragment)
    {
        return channelfragment.aj;
    }

    static SubscribeHelper d(ChannelFragment channelfragment)
    {
        return channelfragment.aq;
    }

    static ie e(ChannelFragment channelfragment)
    {
        return channelfragment.al;
    }

    static void f(ChannelFragment channelfragment)
    {
        channelfragment.Q();
    }

    static do g(ChannelFragment channelfragment)
    {
        return channelfragment.am;
    }

    static void h(ChannelFragment channelfragment)
    {
        channelfragment.R();
    }

    static f i(ChannelFragment channelfragment)
    {
        return channelfragment.ap;
    }

    static void j(ChannelFragment channelfragment)
    {
        channelfragment.S();
    }

    static View k(ChannelFragment channelfragment)
    {
        return channelfragment.an;
    }

    static g l(ChannelFragment channelfragment)
    {
        return channelfragment.ao;
    }

    static q m(ChannelFragment channelfragment)
    {
        return channelfragment.ac;
    }

    static bc n(ChannelFragment channelfragment)
    {
        return channelfragment.h;
    }

    static Channel o(ChannelFragment channelfragment)
    {
        return channelfragment.ak;
    }

    protected final com.google.android.apps.youtube.core.a.a a(PagedListView pagedlistview, int i1)
    {
        com.google.android.apps.youtube.app.ui.v v1;
        com.google.android.apps.youtube.app.adapter.af af2;
        Object obj1;
        g g1;
        switch (i1)
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            pagedlistview.setEmptyText(c.getString(p.cU));
            com.google.android.apps.youtube.app.ui.v v = com.google.android.apps.youtube.app.ui.ad.a(c, e.ai());
            com.google.android.apps.youtube.app.adapter.af af1 = com.google.android.apps.youtube.app.adapter.ag.b(c, f, v);
            ag = et.a(c, af1);
            T();
            al = new ie(c, pagedlistview, ag, i, g, false, aa, false, WatchFeature.GUIDE_CHANNEL_UPLOADS, Z, com.google.android.apps.youtube.core.Analytics.VideoCategory.ChannelUploads);
            if (aw != null)
            {
                al.a(aw.getBundle("uploads_helper"));
            }
            if (aj != null)
            {
                Q();
            } else
            {
                al.f();
            }
            au = RemoteControlContextualMenuController.a(at, v, ag, g, WatchFeature.CHANNEL_UPLOAD, Z);
            au.c();
            return af1;

        case 2: // '\002'
            pagedlistview.setEmptyText(c.getString(p.cR));
            Object obj = com.google.android.apps.youtube.app.ui.ad.a(c);
            obj = com.google.android.apps.youtube.app.adapter.ag.a(c, f, ((com.google.android.apps.youtube.app.ui.v) (obj)), false);
            ah = et.a(c, ((com.google.android.apps.youtube.core.a.a) (obj)));
            T();
            am = new do(c, pagedlistview, ah, Y, g, aa);
            if (aw != null)
            {
                am.a(aw.getBundle("playlists_helper"));
            }
            if (aj != null)
            {
                R();
            } else
            {
                am.f();
            }
            return ((com.google.android.apps.youtube.core.a.a) (obj));

        case 0: // '\0'
            pagedlistview.setEmptyText(c.getString(p.cN));
            v1 = com.google.android.apps.youtube.app.ui.ad.b(c, e.ai());
            af2 = com.google.android.apps.youtube.app.adapter.ag.a(c, f, h, v1);
            obj1 = LayoutInflater.from(c).inflate(l.Z, pagedlistview, false);
            g1 = new g(c, ((View) (obj1)), f, g, aa);
            g1.a(this);
            b(g1);
            break;
        }
        if (aj != null)
        {
            g1.a(aj);
            if (ae)
            {
                g1.a(ad);
            }
        }
        obj1 = Pair.create(obj1, g1);
        an = (View)((Pair) (obj1)).first;
        ao = (g)((Pair) (obj1)).second;
        pagedlistview.a(an);
        ai = et.a(c, af2);
        T();
        ap = new o(this, c, pagedlistview, ai, h, g, true);
        if (aw != null)
        {
            ap.a(aw.getBundle("events_helper"));
        }
        if (aj != null)
        {
            S();
        } else
        {
            ap.f();
        }
        av = RemoteControlContextualMenuController.a(at, v1, ai, g, Z);
        av.c();
        return af2;
    }

    public final CharSequence a()
    {
        if (ak == null)
        {
            return null;
        } else
        {
            return ak.title;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = (String)com.google.android.apps.youtube.common.fromguava.c.a(((Bundle)com.google.android.apps.youtube.common.fromguava.c.a(h())).getString("channel_username"));
        d = c.getResources();
        e = G().d();
        f = e.aw();
        h = e.f();
        i = h.l();
        Y = h.p();
        g = e.aO();
        Z = e.ba();
        aa = c.N();
        ab = e.aV();
        at = e.W();
        ax = new com.google.android.apps.youtube.app.remote.ax(c, h, at, g, aa, e.aT(), e.b().k());
        ax.a(WatchFeature.PLAYLISTS);
        aq = new SubscribeHelper(c, Z, ab, e.aT(), e.bk(), h, g, e.bf(), this);
        aq.a("ChannelLayer");
        ar = c;
        as = false;
        ac = new q(this, (byte)0);
        ad = null;
        ae = false;
        af = false;
        aw = bundle;
        P();
    }

    public final void a(com.google.android.apps.youtube.app.ui.SubscribeHelper.SubscriptionStatus subscriptionstatus)
    {
        boolean flag;
        flag = false;
        if (subscriptionstatus == com.google.android.apps.youtube.app.ui.SubscribeHelper.SubscriptionStatus.SUBSCRIBED || subscriptionstatus == com.google.android.apps.youtube.app.ui.SubscribeHelper.SubscriptionStatus.NOT_SUBSCRIBED)
        {
            flag = as;
            as = false;
        }
        if (ao != null)
        {
            a(ao);
        }
        break MISSING_BLOCK_LABEL_41;
        if (subscriptionstatus != com.google.android.apps.youtube.app.ui.SubscribeHelper.SubscriptionStatus.WORKING && flag && ar != null)
        {
            if (subscriptionstatus == com.google.android.apps.youtube.app.ui.SubscribeHelper.SubscriptionStatus.SUBSCRIBED)
            {
                ar.a(aq.e());
                return;
            }
            if (subscriptionstatus == com.google.android.apps.youtube.app.ui.SubscribeHelper.SubscriptionStatus.NOT_SUBSCRIBED)
            {
                ar.a(aj.uri);
                return;
            }
        }
        return;
    }

    protected final void b(int i1)
    {
        super.b(i1);
        switch (i1)
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            a(al.h());
            return;

        case 2: // '\002'
            a(am.h());
            return;

        case 0: // '\0'
            a(ap.h());
            a(ao);
            return;
        }
    }

    protected final String c(int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return c.getString(p.dD);

        case 2: // '\002'
            return c.getString(p.dC);

        case 0: // '\0'
            return c.getString(p.dB);
        }
    }

    public final void d()
    {
        super.d();
        T();
        if (aj != null)
        {
            aq.a();
        } else
        {
            P();
        }
        if (!ae)
        {
            M();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (al != null)
        {
            bundle.putBundle("uploads_helper", al.d());
        }
        if (am != null)
        {
            bundle.putBundle("playlists_helper", am.d());
        }
        if (ap != null)
        {
            bundle.putBundle("events_helper", ap.d());
        }
        aw = null;
    }

    public final void i_()
    {
        as = true;
        aq.b();
    }

    protected final int j_()
    {
        return 3;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        T();
        b(ao);
    }

    public final void r()
    {
        super.r();
        if (au != null)
        {
            au.b();
        }
        if (av != null)
        {
            av.b();
        }
    }

    public final void t()
    {
        super.t();
        if (au != null)
        {
            au.a();
        }
        if (av != null)
        {
            av.a();
        }
    }
}
