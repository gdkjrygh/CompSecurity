// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.text.Html;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.core.utils.m;
import com.google.android.apps.youtube.datalib.legacy.model.Channel;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            gf, ge, gd, gg, 
//            gi, gh, gc, gb

public final class SubscribeHelper
{

    private final Activity a;
    private final YouTubeApplication b;
    private final Analytics c;
    private final ak d;
    private final l e;
    private final aa f;
    private final bc g;
    private final a h;
    private final aw i;
    private final gf j;
    private final b k;
    private final b l;
    private UserProfile m;
    private Channel n;
    private String o;
    private SubscriptionStatus p;
    private SubscriptionStatus q;
    private SubscriptionStatus r;
    private Subscription s;
    private Uri t;
    private Dialog u;

    public SubscribeHelper(Activity activity, Analytics analytics, ak ak1, l l1, aa aa1, bc bc1, aw aw1, 
            a a1, gf gf1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        c = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        d = (ak)com.google.android.apps.youtube.common.fromguava.c.a(ak1);
        e = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        f = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        g = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        i = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        h = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        j = (gf)com.google.android.apps.youtube.common.fromguava.c.a(gf1);
        b = (YouTubeApplication)activity.getApplication();
        k = com.google.android.apps.youtube.common.a.a.a(activity, new ge(this, (byte)0));
        l = com.google.android.apps.youtube.common.a.a.a(activity, new gd(this, (byte)0));
        q = SubscriptionStatus.WORKING;
    }

    static Uri a(SubscribeHelper subscribehelper, Uri uri)
    {
        subscribehelper.t = uri;
        return uri;
    }

    static SubscriptionStatus a(SubscribeHelper subscribehelper, SubscriptionStatus subscriptionstatus)
    {
        subscribehelper.p = subscriptionstatus;
        return subscriptionstatus;
    }

    static Channel a(SubscribeHelper subscribehelper, Channel channel)
    {
        subscribehelper.n = channel;
        return channel;
    }

    static Subscription a(SubscribeHelper subscribehelper, Subscription subscription)
    {
        subscribehelper.s = subscription;
        return subscription;
    }

    private void a(SubscriptionStatus subscriptionstatus)
    {
        r = q;
        q = subscriptionstatus;
        j.a(q);
    }

    static void a(SubscribeHelper subscribehelper)
    {
        subscribehelper.f();
    }

    public static void a(Analytics analytics, String s1, int i1, boolean flag)
    {
        String s2;
        if (flag)
        {
            s2 = "UnsubscribeFromChannel";
        } else
        {
            s2 = "SubscribeToChannel";
        }
        analytics.b(s2);
        if (i1 >= 0 && !flag)
        {
            analytics.a("SubscribeDetails", s1, i1);
        }
    }

    static void b(SubscribeHelper subscribehelper)
    {
        subscribehelper.j();
    }

    static void b(SubscribeHelper subscribehelper, SubscriptionStatus subscriptionstatus)
    {
        subscribehelper.a(subscriptionstatus);
    }

    static aw c(SubscribeHelper subscribehelper)
    {
        return subscribehelper.i;
    }

    static void d(SubscribeHelper subscribehelper)
    {
        subscribehelper.i();
    }

    static a e(SubscribeHelper subscribehelper)
    {
        return subscribehelper.h;
    }

    static Activity f(SubscribeHelper subscribehelper)
    {
        return subscribehelper.a;
    }

    private void f()
    {
        if (m == null)
        {
            return;
        } else
        {
            a(c, o, b.v(), false);
            g.m(m.username, com.google.android.apps.youtube.common.a.a.a(a, new gg(this, (byte)0)));
            return;
        }
    }

    static Uri g(SubscribeHelper subscribehelper)
    {
        return subscribehelper.t;
    }

    private boolean g()
    {
        return n != null && n.paidContent;
    }

    static bc h(SubscribeHelper subscribehelper)
    {
        return subscribehelper.g;
    }

    private boolean h()
    {
        return m != null && e.b() && m.username.equals(d.d());
    }

    private void i()
    {
        if (n != null && p != null)
        {
            a(p);
        }
    }

    static void i(SubscribeHelper subscribehelper)
    {
        subscribehelper.a(SubscriptionStatus.WORKING);
        if (subscribehelper.e.b())
        {
            a(subscribehelper.c, subscribehelper.o, subscribehelper.b.v(), true);
            if (subscribehelper.t == null)
            {
                subscribehelper.g.g(subscribehelper.m.username, com.google.android.apps.youtube.common.a.a.a(subscribehelper.a, new gi(subscribehelper, (byte)0)));
                return;
            } else
            {
                subscribehelper.g.e(subscribehelper.t, com.google.android.apps.youtube.common.a.a.a(subscribehelper.a, new gh(subscribehelper, (byte)0)));
                return;
            }
        } else
        {
            subscribehelper.j();
            return;
        }
    }

    private void j()
    {
        q = r;
        r = null;
        j.a(q);
    }

    private void k()
    {
        g.a(m.username);
        Uri uri = Uri.parse((new StringBuilder("http://m.youtube.com/offer_details?it=U&ii=")).append(m.channelId).toString());
        com.google.android.apps.youtube.core.utils.m.b(a, uri);
    }

    public final void a()
    {
        a(SubscriptionStatus.WORKING);
        a(m);
    }

    public final void a(UserProfile userprofile)
    {
        m = (UserProfile)com.google.android.apps.youtube.common.fromguava.c.a(userprofile);
        if (e.b())
        {
            g.g(userprofile.username, k);
        } else
        {
            p = SubscriptionStatus.NOT_SUBSCRIBED;
            i();
        }
        g.i(userprofile.channelId, l);
    }

    public final void a(String s1)
    {
        o = s1;
    }

    public final void b()
    {
        if (q == SubscriptionStatus.SUBSCRIBED)
        {
            if (g())
            {
                k();
                return;
            }
            if (u == null)
            {
                gc gc1 = new gc(this);
                u = (new com.google.android.apps.youtube.core.ui.aa(a)).setMessage(Html.fromHtml(a.getString(p.gn, new Object[] {
                    m.displayUsername
                }))).setPositiveButton(0x1040013, gc1).setNegativeButton(0x1040009, gc1).create();
            }
            u.show();
            return;
        }
        if (h())
        {
            ah.a(a, p.dE, 1);
            return;
        }
        if (g())
        {
            k();
            return;
        }
        a(SubscriptionStatus.WORKING);
        if (e.b())
        {
            f();
            return;
        } else
        {
            f.a(a, new gb(this));
            return;
        }
    }

    public final boolean c()
    {
        return !h();
    }

    public final SubscriptionStatus d()
    {
        return q;
    }

    public final Subscription e()
    {
        return s;
    }

    private class SubscriptionStatus extends Enum
    {

        private static final SubscriptionStatus $VALUES[];
        public static final SubscriptionStatus ERROR;
        public static final SubscriptionStatus NOT_SUBSCRIBED;
        public static final SubscriptionStatus SUBSCRIBED;
        public static final SubscriptionStatus WORKING;

        public static SubscriptionStatus valueOf(String s1)
        {
            return (SubscriptionStatus)Enum.valueOf(com/google/android/apps/youtube/app/ui/SubscribeHelper$SubscriptionStatus, s1);
        }

        public static SubscriptionStatus[] values()
        {
            return (SubscriptionStatus[])$VALUES.clone();
        }

        static 
        {
            SUBSCRIBED = new SubscriptionStatus("SUBSCRIBED", 0);
            NOT_SUBSCRIBED = new SubscriptionStatus("NOT_SUBSCRIBED", 1);
            WORKING = new SubscriptionStatus("WORKING", 2);
            ERROR = new SubscriptionStatus("ERROR", 3);
            $VALUES = (new SubscriptionStatus[] {
                SUBSCRIBED, NOT_SUBSCRIBED, WORKING, ERROR
            });
        }

        private SubscriptionStatus(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
