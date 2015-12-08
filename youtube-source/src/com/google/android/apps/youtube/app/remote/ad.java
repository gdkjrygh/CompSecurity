// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.media.d;
import android.support.v7.media.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.ytremote.backend.a.i;
import com.google.android.apps.ytremote.model.PairingCode;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            q, bk, YouTubeTvScreensMonitor, ae, 
//            YouTubeTvScreen, bg

public final class ad extends q
{

    private final Map a = new ConcurrentHashMap();
    private final Executor b;
    private final bk c;
    private final YouTubeTvScreensMonitor d;
    private final Context e;
    private com.google.android.apps.ytremote.backend.logic.c f;

    public ad(Context context, YouTubeTvScreensMonitor youtubetvscreensmonitor, bk bk1, Executor executor)
    {
        super(context, youtubetvscreensmonitor, true);
        e = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        c = (bk)com.google.android.apps.youtube.common.fromguava.c.a(bk1);
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        d = (YouTubeTvScreensMonitor)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreensmonitor);
    }

    private PairingCode c(String s)
    {
        if (!a.containsKey(s))
        {
            a.put(s, new PairingCode(UUID.randomUUID().toString()));
        }
        return (PairingCode)a.get(s);
    }

    protected final android.support.v7.media.c a(YouTubeTvScreen youtubetvscreen)
    {
        Bundle bundle = new Bundle();
        bundle.putString("pairingCode", c(c(youtubetvscreen)).toString());
        return d(youtubetvscreen).a("YouTube").a(bundle).a();
    }

    public final j a(String s)
    {
        YouTubeTvScreen youtubetvscreen = b(s);
        s = c(s);
        Context context = e;
        bk bk1 = c;
        YouTubeTvScreensMonitor youtubetvscreensmonitor = d;
        Executor executor = b;
        if (f == null)
        {
            f = new i();
        }
        return new ae(youtubetvscreen, s, context, bk1, youtubetvscreensmonitor, executor, f);
    }

    public final void a(bg bg)
    {
        b((YouTubeTvScreen)bg);
    }

    public final void b(YouTubeTvScreen youtubetvscreen)
    {
        a.remove(c(youtubetvscreen));
        super.b(youtubetvscreen);
    }

    protected final String f()
    {
        return "EXTERNAL_MDX_MEDIA_ROUTE_CONTROL_CATEGORY";
    }
}
