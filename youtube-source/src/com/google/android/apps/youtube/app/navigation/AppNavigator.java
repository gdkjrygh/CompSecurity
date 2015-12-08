// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.navigation;

import android.net.Uri;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.tu;
import com.google.android.apps.youtube.app.GuideActivity;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.navigation.UnknownNavigationException;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.b;

// Referenced classes of package com.google.android.apps.youtube.app.navigation:
//            c, b, a, e, 
//            d

public final class AppNavigator
    implements a
{

    private final GuideActivity a;
    private final com.google.android.apps.youtube.common.c.a b;
    private final Origin c;

    public AppNavigator(GuideActivity guideactivity, com.google.android.apps.youtube.common.c.a a1)
    {
        this(guideactivity, a1, Origin.FROM_OTHER);
    }

    private AppNavigator(GuideActivity guideactivity, com.google.android.apps.youtube.common.c.a a1, Origin origin)
    {
        a = (GuideActivity)com.google.android.apps.youtube.common.fromguava.c.a(guideactivity);
        b = (com.google.android.apps.youtube.common.c.a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = origin;
    }

    public static AppNavigator a(GuideActivity guideactivity, com.google.android.apps.youtube.common.c.a a1)
    {
        return new AppNavigator(guideactivity, a1, Origin.FROM_GUIDE);
    }

    public static AppNavigator b(GuideActivity guideactivity, com.google.android.apps.youtube.common.c.a a1)
    {
        return new AppNavigator(guideactivity, a1, Origin.FROM_WATCH);
    }

    public static byte[] b(kz kz1)
    {
        if (kz1 != null && kz1.b != null)
        {
            return kz1.b;
        } else
        {
            return b.a;
        }
    }

    public final void a(kz kz1)
    {
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        com.google.android.apps.youtube.common.fromguava.c.a(a);
        boolean flag;
        boolean flag1;
        if (c == Origin.FROM_GUIDE)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (c != Origin.FROM_WATCH)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            if (kz1.n != null)
            {
                throw new UnknownNavigationException("Settings not supported");
            }
        }
        // Misplaced declaration of an exception variable
        catch (kz kz1)
        {
            ah.b(a, kz1.getMessage(), 1);
            return;
        }
        if (kz1.r == null) goto _L2; else goto _L1
_L1:
        Object obj = com.google.android.apps.youtube.app.navigation.c.a(a, kz1);
_L3:
        ((com.google.android.apps.youtube.app.navigation.b) (obj)).a();
        b.c(new com.google.android.apps.youtube.app.navigation.a(kz1, (byte)0));
        return;
_L2:
label0:
        {
            if (kz1.c == null)
            {
                break label0;
            }
            obj = com.google.android.apps.youtube.app.navigation.c.b(a, kz1, flag1);
        }
          goto _L3
label1:
        {
            if (kz1.q != null)
            {
                throw new UnknownNavigationException("Capture not supported");
            }
            if (kz1.m == null)
            {
                break label1;
            }
            obj = com.google.android.apps.youtube.app.navigation.c.b(a, kz1);
        }
          goto _L3
label2:
        {
            if (kz1.d != null)
            {
                throw new UnknownNavigationException("Create Channel not supported");
            }
            if (kz1.e == null)
            {
                break label2;
            }
            obj = d.a();
            ((PaneDescriptor) (obj)).setNavigationEndpoint(kz1);
            obj = new com.google.android.apps.youtube.app.navigation.c(a, ((PaneDescriptor) (obj)));
        }
          goto _L3
label3:
        {
            if (kz1.f != null)
            {
                throw new UnknownNavigationException("Capture not supported");
            }
            if (kz1.o == null)
            {
                break label3;
            }
            obj = com.google.android.apps.youtube.app.navigation.c.a(a, kz1, flag1);
        }
          goto _L3
label4:
        {
            if (kz1.t != null)
            {
                throw new UnknownNavigationException("MobileV2Playlist not supported");
            }
            if (kz1.p == null)
            {
                break label4;
            }
            obj = com.google.android.apps.youtube.app.navigation.c.c(a, kz1);
        }
          goto _L3
label5:
        {
            if (!p.a(a) || kz1.s == null)
            {
                break label5;
            }
            obj = d.i();
            ((PaneDescriptor) (obj)).setNavigationEndpoint(kz1);
            obj = new com.google.android.apps.youtube.app.navigation.c(a, ((PaneDescriptor) (obj)));
        }
          goto _L3
        Object obj1;
        if (!p.a(a) || kz1.w == null)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        obj = a;
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        obj1 = new PlaybackStartDescriptor(kz1, WatchFeature.OFFLINE);
        ((PlaybackStartDescriptor) (obj1)).setOffline(true);
        obj1 = new WatchDescriptor(((PlaybackStartDescriptor) (obj1)));
        flag1 = flag2;
        if (!flag)
        {
            flag1 = true;
        }
        ((WatchDescriptor) (obj1)).setKeepHistory(flag1);
        obj = new e(((android.app.Activity) (obj)), ((WatchDescriptor) (obj1)));
          goto _L3
label6:
        {
            if (kz1.j != null)
            {
                throw new UnknownNavigationException("Purchases not supported");
            }
            if (kz1.g == null)
            {
                break label6;
            }
            obj = com.google.android.apps.youtube.app.navigation.c.d(a, kz1);
        }
          goto _L3
label7:
        {
            if (kz1.l != null)
            {
                throw new UnknownNavigationException("Sign in not supported");
            }
            if (kz1.h != null)
            {
                throw new UnknownNavigationException("Subscription Manager not supported");
            }
            if (kz1.k == null)
            {
                break label7;
            }
            obj = Uri.parse(kz1.k.b);
            obj = new com.google.android.apps.youtube.app.navigation.d(a, ((Uri) (obj)));
        }
          goto _L3
        if (kz1.i == null && kz1.u == null)
        {
            break MISSING_BLOCK_LABEL_616;
        }
        obj = a;
        com.google.android.apps.youtube.common.fromguava.c.a(kz1);
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        obj1 = new WatchDescriptor(new PlaybackStartDescriptor(kz1, WatchFeature.NO_FEATURE));
        flag1 = flag3;
        if (!flag)
        {
            flag1 = true;
        }
        ((WatchDescriptor) (obj1)).setKeepHistory(flag1);
        obj = new e(((android.app.Activity) (obj)), ((WatchDescriptor) (obj1)));
          goto _L3
        throw new UnknownNavigationException("Unknown NavigationData encountered");
    }

    private class Origin extends Enum
    {

        private static final Origin $VALUES[];
        public static final Origin FROM_GUIDE;
        public static final Origin FROM_OTHER;
        public static final Origin FROM_WATCH;

        public static Origin valueOf(String s)
        {
            return (Origin)Enum.valueOf(com/google/android/apps/youtube/app/navigation/AppNavigator$Origin, s);
        }

        public static Origin[] values()
        {
            return (Origin[])$VALUES.clone();
        }

        static 
        {
            FROM_GUIDE = new Origin("FROM_GUIDE", 0);
            FROM_WATCH = new Origin("FROM_WATCH", 1);
            FROM_OTHER = new Origin("FROM_OTHER", 2);
            $VALUES = (new Origin[] {
                FROM_GUIDE, FROM_WATCH, FROM_OTHER
            });
        }

        private Origin(String s, int i)
        {
            super(s, i);
        }
    }

}
