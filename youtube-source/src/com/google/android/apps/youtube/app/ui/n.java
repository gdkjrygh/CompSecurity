// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.adapter.af;
import com.google.android.apps.youtube.app.adapter.br;
import com.google.android.apps.youtube.app.adapter.u;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.e;
import com.google.android.apps.youtube.core.a.l;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.k;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            o

public final class n extends l
    implements b
{

    private final com.google.android.apps.youtube.core.a.c b;
    private final br c;
    private final YouTubeApplication d;

    public n(Activity activity, com.google.android.apps.youtube.core.identity.l l1, com.google.android.apps.youtube.core.a.c c1, l l2, br br1, Resources resources, ChannelStoreOutline.Category category)
    {
        int i;
        super(new e[] {
            l2
        });
        d = (YouTubeApplication)activity.getApplication();
        b = (com.google.android.apps.youtube.core.a.c)com.google.android.apps.youtube.common.fromguava.c.a(c1, "listAdapterOutline cannot be null");
        c = (br)com.google.android.apps.youtube.common.fromguava.c.a(br1, "loadingOutline cannot be null");
        i = resources.getInteger(k.d) * resources.getInteger(k.c);
        com.google.android.apps.youtube.common.fromguava.c.a(l2);
        c1 = d.d().f();
        activity = com.google.android.apps.youtube.common.a.a.a(activity, this);
        if (!l1.b()) goto _L2; else goto _L1
_L1:
        com.google.android.apps.youtube.app.ui.o.a[category.ordinal()];
        JVM INSTR tableswitch 1 5: default 144
    //                   1 145
    //                   2 155
    //                   3 172
    //                   4 185
    //                   5 198;
           goto _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        return;
_L3:
        c1.e(i, activity);
        return;
_L4:
        c1.a(i, d.s(), activity);
        return;
_L5:
        c1.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.ChannelFeed.MOST_VIEWED, i, activity);
        return;
_L6:
        c1.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.ChannelFeed.MOST_SUBSCRIBED, i, activity);
        return;
_L7:
        c1.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.ChannelFeed.NOTEWORTHY, i, activity);
        return;
    }

    public final void a(Uri uri)
    {
        ((u)b.a()).a(uri);
    }

    public final void a(Uri uri, String s)
    {
        ((u)b.a()).a(uri, s);
    }

    public final void a(Subscription subscription)
    {
        ((u)b.a()).a(subscription);
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Page)obj1;
        c.a(false);
        ((af)b.a()).b(((Page) (obj)).entries);
    }

    public final void b(Uri uri)
    {
        ((u)b.a()).b(uri);
    }
}
