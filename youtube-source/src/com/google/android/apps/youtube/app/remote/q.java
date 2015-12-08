// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v7.media.d;
import android.support.v7.media.e;
import android.support.v7.media.f;
import android.support.v7.media.l;
import android.support.v7.media.s;
import android.util.Log;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bi, YouTubeTvScreensMonitor, YouTubeTvScreen, bg

public abstract class q extends f
    implements bi
{

    private final YouTubeTvScreensMonitor a;
    private final Map b = new ConcurrentHashMap();
    private final boolean c;

    public q(Context context, YouTubeTvScreensMonitor youtubetvscreensmonitor, boolean flag)
    {
        super(context);
        a = (YouTubeTvScreensMonitor)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreensmonitor, "youTubeTvScreenMonitor can not be null");
        c = flag;
        youtubetvscreensmonitor.a(this);
    }

    protected static String c(YouTubeTvScreen youtubetvscreen)
    {
        return String.valueOf(youtubetvscreen.getId().hashCode());
    }

    private void c(String s1)
    {
        if (c)
        {
            Log.d("YouTube MDX", s1);
        }
    }

    protected abstract android.support.v7.media.c a(YouTubeTvScreen youtubetvscreen);

    public void a(bg bg)
    {
        b((YouTubeTvScreen)bg);
    }

    protected final YouTubeTvScreen b(String s1)
    {
        return (YouTubeTvScreen)b.get(s1);
    }

    public final void b(e e1)
    {
        c((new StringBuilder("discoveryRequestChanged : ")).append(e1).toString());
        String s1 = f();
        if (e1 != null)
        {
            e1 = e1.a();
            if (e1 != null && e1.a().contains(s1))
            {
                a.b(s1);
                g();
                return;
            }
        }
        a.a(s1);
    }

    public void b(YouTubeTvScreen youtubetvscreen)
    {
        g();
    }

    public final void b(bg bg)
    {
        g();
    }

    protected final d d(YouTubeTvScreen youtubetvscreen)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory(f());
        return (new d(c(youtubetvscreen), youtubetvscreen.getScreenName())).a(intentfilter).a(1).e(1).a(true).d(100);
    }

    protected abstract String f();

    protected final void g()
    {
        Object obj1 = a.a();
        b.clear();
        Object obj = new ArrayList();
        YouTubeTvScreen youtubetvscreen;
        android.support.v7.media.c c1;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); b.put(c1.a(), youtubetvscreen))
        {
            youtubetvscreen = (YouTubeTvScreen)((Iterator) (obj1)).next();
            c1 = a(youtubetvscreen);
            ((ArrayList) (obj)).add(c1);
        }

        obj = (new l()).a(((java.util.Collection) (obj))).a();
        c((new StringBuilder("Publishing routes: ")).append(obj).toString());
        a(((android.support.v7.media.k) (obj)));
    }
}
