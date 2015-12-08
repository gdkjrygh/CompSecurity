// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ui.gj;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, m, s, o, 
//            p, ae

public final class ChannelStoreItemRendererFactory extends g
{

    private final Handler a;
    private final WeakHashMap b = new WeakHashMap();
    private final Context c;
    private final l d;
    private final YouTubeApplication e;
    private final a f;
    private final Analytics g;
    private final bc h;
    private final am i;
    private final aw j;
    private final m k = new m(this, (byte)0);
    private final Map l = new HashMap();
    private final Map m = new HashMap();
    private final Map n = new HashMap();
    private final gj o;
    private final Activity p;
    private boolean q;
    private boolean r;

    public ChannelStoreItemRendererFactory(Context context, Analytics analytics, bc bc1, l l1, YouTubeApplication youtubeapplication, a a1, am am, 
            aw aw, gj gj1, Activity activity)
    {
        c = context;
        g = analytics;
        h = bc1;
        j = aw;
        d = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        e = youtubeapplication;
        f = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        i = am;
        a = new Handler(context.getMainLooper());
        o = gj1;
        p = activity;
    }

    static Uri a(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, Subscription subscription)
    {
        return channelstoreitemrendererfactory.b(subscription);
    }

    static m a(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.k;
    }

    static void a(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, s s1, UserProfile userprofile)
    {
        channelstoreitemrendererfactory.l.put(userprofile.uri, State.WORKING);
        channelstoreitemrendererfactory.o.b(userprofile.uri);
        channelstoreitemrendererfactory.a(s1, userprofile);
    }

    static void a(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, s s1, UserProfile userprofile, Uri uri)
    {
        channelstoreitemrendererfactory.l.put(userprofile.uri, State.SUBSCRIBED);
        channelstoreitemrendererfactory.m.put(userprofile.selfUri, uri);
        channelstoreitemrendererfactory.a(s1, userprofile);
    }

    static void a(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, UserProfile userprofile, s s1)
    {
        channelstoreitemrendererfactory.a(userprofile, s1);
    }

    private void a(s s1, UserProfile userprofile)
    {
        if (s.b(s1) == userprofile)
        {
            com.google.android.apps.youtube.app.adapter.s.a(s1);
            return;
        } else
        {
            b();
            return;
        }
    }

    private void a(UserProfile userprofile, s s1)
    {
        if (n.containsKey(Uri.parse(c(userprofile.uri))))
        {
            l.put(userprofile.uri, State.SUBSCRIBED);
        } else
        {
            l.put(userprofile.uri, State.UNSUBSCRIBED);
        }
        com.google.android.apps.youtube.app.adapter.s.a(s1);
    }

    private Uri b(Subscription subscription)
    {
        return Uri.parse(c(subscription.channelUri));
    }

    private void b()
    {
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); com.google.android.apps.youtube.app.adapter.s.a((s)iterator.next())) { }
    }

    static void b(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, s s1, UserProfile userprofile)
    {
        channelstoreitemrendererfactory.l.put(userprofile.uri, State.UNSUBSCRIBED);
        channelstoreitemrendererfactory.m.remove(userprofile.selfUri);
        channelstoreitemrendererfactory.a(s1, userprofile);
    }

    static boolean b(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.r;
    }

    private static String c(Uri uri)
    {
        return uri.toString().toLowerCase().replaceFirst("https", "http");
    }

    static Map c(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.l;
    }

    private void c()
    {
        h.w().a(h.a().n(), com.google.android.apps.youtube.common.a.a.a(p, new o(this, (byte)0)));
    }

    static Context d(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.c;
    }

    private void d(Uri uri)
    {
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            s s1 = (s)iterator.next();
            if (s.b(s1).uri.equals(uri))
            {
                com.google.android.apps.youtube.app.adapter.s.a(s1);
            }
        } while (true);
    }

    static l e(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.d;
    }

    static Activity f(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.p;
    }

    static bc g(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.h;
    }

    static YouTubeApplication h(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.e;
    }

    static Analytics i(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.g;
    }

    static Handler j(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.a;
    }

    static Map k(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.m;
    }

    static a l(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.f;
    }

    static gj m(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.o;
    }

    static aw n(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.j;
    }

    static am o(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.i;
    }

    static Map p(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        return channelstoreitemrendererfactory.n;
    }

    static void q(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        Iterator iterator = channelstoreitemrendererfactory.b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            s s1 = (s)iterator.next();
            if (s.b(s1) != null && channelstoreitemrendererfactory.l.get(s.b(s1).uri) != State.WORKING)
            {
                channelstoreitemrendererfactory.a(s.b(s1), s1);
            }
        } while (true);
        channelstoreitemrendererfactory.r = true;
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        view = new s(this, view, (byte)0);
        b.put(view, null);
        if (!q && d.b())
        {
            q = true;
            c();
        }
        return view;
    }

    public final void a()
    {
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Uri uri = s.b((s)iterator.next()).uri;
            if (l.get(uri) != State.WORKING)
            {
                l.remove(uri);
            }
        } while (true);
        r = false;
        b();
        c();
    }

    public final void a(Uri uri)
    {
        n.remove(c(uri));
        l.put(uri, State.UNSUBSCRIBED);
        d(uri);
    }

    public final void a(Uri uri, String s1)
    {
        s1 = State.valueOf(s1);
        l.put(uri, s1);
        d(uri);
    }

    public final void a(s s1, UserProfile userprofile, UserProfile userprofile1, Uri uri)
    {
        h.e(uri, com.google.android.apps.youtube.common.a.e.a(a, new p(this, s1, userprofile, userprofile1)));
    }

    public final void a(Subscription subscription)
    {
        n.put(b(subscription), subscription);
        l.put(b(subscription), State.SUBSCRIBED);
        d(b(subscription));
    }

    public final void b(Uri uri)
    {
        l.put(uri, State.WORKING);
        d(uri);
    }

    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State SUBSCRIBED;
        public static final State UNSUBSCRIBED;
        public static final State WORKING;

        public static State valueOf(String s1)
        {
            return (State)Enum.valueOf(com/google/android/apps/youtube/app/adapter/ChannelStoreItemRendererFactory$State, s1);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            WORKING = new State("WORKING", 0);
            SUBSCRIBED = new State("SUBSCRIBED", 1);
            UNSUBSCRIBED = new State("UNSUBSCRIBED", 2);
            $VALUES = (new State[] {
                WORKING, SUBSCRIBED, UNSUBSCRIBED
            });
        }

        private State(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
