// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.ThumbnailRendererFactory;
import com.google.android.apps.youtube.app.adapter.h;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.bg;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.youtube.j;
import com.google.android.youtube.p;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            YouTubeActivity, m, l, k

public class PostPairingActivity extends YouTubeActivity
{

    private static final Map n;
    private l o;
    private bc p;
    private bj q;
    private com.google.android.apps.youtube.common.network.h r;
    private View s;
    private TextView t;
    private ImageView u;
    private h v;
    private an w;
    private RemoteControl x;
    private YouTubeApplication y;
    private View z;

    public PostPairingActivity()
    {
    }

    static RemoteControl a(PostPairingActivity postpairingactivity)
    {
        return postpairingactivity.x;
    }

    private void a(FeedItem feeditem)
    {
        a a1 = com.google.android.apps.youtube.common.a.a.a(this, new m(this, feeditem));
        switch (com.google.android.apps.youtube.app.honeycomb.phone.l.a[feeditem.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            p.a(15, a1);
            return;

        case 2: // '\002'
            p.d(15, a1);
            return;

        case 3: // '\003'
            p.b(15, a1);
            return;

        case 4: // '\004'
            p.c(15, a1);
            return;

        case 5: // '\005'
            p.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_POPULAR, null, y.s(), com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.TODAY, a1);
            return;

        case 6: // '\006'
            p.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_POPULAR, "Music", y.s(), com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.TODAY, a1);
            return;

        case 7: // '\007'
            p.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_POPULAR, null, null, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.TODAY, a1);
            break;
        }
    }

    static void a(PostPairingActivity postpairingactivity, FeedItem feeditem)
    {
        if (feeditem.position == FeedItem.values().length - 1)
        {
            L.c("We run out of feeds! How?");
            return;
        }
        FeedItem feeditem1 = (FeedItem)n.get(Integer.valueOf(feeditem.position + 1));
        feeditem = feeditem1;
        if (!postpairingactivity.o.b())
        {
            feeditem = feeditem1;
            if (feeditem1.isAccountFeed)
            {
                feeditem = FeedItem.POPULAR;
            }
        }
        postpairingactivity.a(feeditem);
    }

    static h b(PostPairingActivity postpairingactivity)
    {
        return postpairingactivity.v;
    }

    static TextView c(PostPairingActivity postpairingactivity)
    {
        return postpairingactivity.t;
    }

    static ImageView d(PostPairingActivity postpairingactivity)
    {
        return postpairingactivity.u;
    }

    static View e(PostPairingActivity postpairingactivity)
    {
        return postpairingactivity.z;
    }

    public final String d()
    {
        return null;
    }

    public void handleSignOutEvent(aj aj)
    {
        finish();
    }

    public void onBackPressed()
    {
        g();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.google.android.youtube.l.aL);
        b(p.fR);
        y = (YouTubeApplication)getApplication();
        bundle = y.d();
        q = bundle.aw();
        p = bundle.f();
        o = bundle.aT();
        r = bundle.aX();
        w = bundle.W();
        s = findViewById(j.bn);
        t = (TextView)s.findViewById(j.fF);
        u = (ImageView)s.findViewById(j.fy);
        z = s.findViewById(j.dl);
        v = (h)(new k(this, this, q, r, null)).a(u, null);
    }

    protected void onPause()
    {
        super.onPause();
        y.E().b(this);
    }

    protected void onResume()
    {
        super.onResume();
        y.E().a(this);
    }

    public void onStart()
    {
        super.onStart();
        x = w.e();
        if (x == null)
        {
            L.b("Ooops! We should be connected a route but that's not the case!");
            finish();
        } else
        {
            if (o.b())
            {
                a(FeedItem.WATCH_LATER);
            } else
            {
                a(FeedItem.POPULAR);
            }
            if (x.o() != null)
            {
                ((TextView)findViewById(j.dK)).setText(Html.fromHtml(getString(p.dI, new Object[] {
                    x.o().getScreenName()
                })));
                return;
            }
        }
    }

    static 
    {
        n = new HashMap();
        FeedItem afeeditem[] = FeedItem.values();
        int i1 = afeeditem.length;
        for (int i = 0; i < i1; i++)
        {
            FeedItem feeditem = afeeditem[i];
            n.put(Integer.valueOf(feeditem.position), feeditem);
        }

    }

    private class FeedItem extends Enum
    {

        private static final FeedItem $VALUES[];
        public static final FeedItem FAVORITES;
        public static final FeedItem HISTORY;
        public static final FeedItem MUSIC;
        public static final FeedItem POPULAR;
        public static final FeedItem POPULAR_WW;
        public static final FeedItem UPLOADS;
        public static final FeedItem WATCH_LATER;
        final WatchFeature feature;
        final boolean isAccountFeed;
        final int labelStringId;
        final int position;

        public static FeedItem valueOf(String s1)
        {
            return (FeedItem)Enum.valueOf(com/google/android/apps/youtube/app/honeycomb/phone/PostPairingActivity$FeedItem, s1);
        }

        public static FeedItem[] values()
        {
            return (FeedItem[])$VALUES.clone();
        }

        static 
        {
            WATCH_LATER = new FeedItem("WATCH_LATER", 0, 0, p.aj, WatchFeature.WATCH_LATER, true);
            FAVORITES = new FeedItem("FAVORITES", 1, 1, p.ad, WatchFeature.MY_FAVORITES, true);
            UPLOADS = new FeedItem("UPLOADS", 2, 2, p.ah, WatchFeature.MY_UPLOADS, true);
            HISTORY = new FeedItem("HISTORY", 3, 3, p.ai, WatchFeature.WATCH_HISTORY, true);
            POPULAR = new FeedItem("POPULAR", 4, 4, p.ci, WatchFeature.GUIDE_CATEGORY_POPULAR, false);
            MUSIC = new FeedItem("MUSIC", 5, 5, p.W, WatchFeature.GUIDE_CATEGORY_MUSIC, false);
            POPULAR_WW = new FeedItem("POPULAR_WW", 6, 6, p.ci, WatchFeature.GUIDE_CATEGORY_POPULAR, false);
            $VALUES = (new FeedItem[] {
                WATCH_LATER, FAVORITES, UPLOADS, HISTORY, POPULAR, MUSIC, POPULAR_WW
            });
        }

        private FeedItem(String s1, int i, int i1, int j1, WatchFeature watchfeature, boolean flag)
        {
            super(s1, i);
            position = i1;
            labelStringId = j1;
            feature = watchfeature;
            isAccountFeed = flag;
        }
    }

}
