// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.utils.m;
import com.google.android.apps.youtube.datalib.innertube.v;
import com.google.android.apps.youtube.datalib.innertube.y;
import com.google.android.apps.youtube.datalib.innertube.z;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cn, co, LikeAction, cm

public final class cl
{

    private final Activity a;
    private final Analytics b;
    private final l c;
    private final aa d;
    private final aw e;
    private final v f;
    private final a g;

    public cl(Activity activity, Analytics analytics, l l1, aa aa1, v v1, aw aw1, a a1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        f = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        b = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        c = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        e = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        g = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
    }

    static aw a(cl cl1)
    {
        return cl1.e;
    }

    private void a(LikeAction likeaction, String s, byte abyte0[])
    {
        cn cn1 = new cn(this, likeaction, s);
        switch (com.google.android.apps.youtube.app.ui.co.a[likeaction.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            likeaction = f.a();
            likeaction.a(abyte0);
            likeaction.b(s);
            f.a(likeaction, cn1);
            return;

        case 2: // '\002'
            likeaction = f.b();
            likeaction.a(abyte0);
            likeaction.b(s);
            f.a(likeaction, cn1);
            return;

        case 3: // '\003'
            likeaction = f.c();
            break;
        }
        likeaction.a(abyte0);
        likeaction.b(s);
        f.a(likeaction, cn1);
    }

    static void a(cl cl1, LikeAction likeaction, String s, byte abyte0[])
    {
        cl1.a(likeaction, s, abyte0);
    }

    static Activity b(cl cl1)
    {
        return cl1.a;
    }

    static a c(cl cl1)
    {
        return cl1.g;
    }

    public final void a(LikeAction likeaction, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(likeaction);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        b.b(likeaction.toString());
        if (c.b())
        {
            a(likeaction, s, z.a);
            return;
        } else
        {
            d.a(a, new cm(this, likeaction, s));
            return;
        }
    }

    public final void a(String s, String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        b.b("Share Playlist");
        m.b(a, s, s1);
    }
}
