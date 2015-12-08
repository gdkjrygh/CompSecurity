// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            ad, l

public final class YouTubePlayerEvents
{

    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public YouTubePlayerEvents()
    {
    }

    public final void a(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Handler)iterator.next()).sendEmptyMessage(i)) { }
    }

    public final void a(int i, int j)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); Message.obtain((Handler)iterator.next(), 8, i, j).sendToTarget()) { }
    }

    public final void a(Handler handler)
    {
        a.add(handler);
    }

    public final void a(ad ad1, int i)
    {
        boolean flag = true;
        com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream formatstream = ad1.a();
        com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream formatstream1 = ad1.b();
        if (ad1.c() != 1)
        {
            flag = false;
        }
        ad1 = new l(formatstream, formatstream1, flag, ad1.d(), i);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); Message.obtain((Handler)iterator.next(), 13, ad1).sendToTarget()) { }
    }

    public final void a(Exception exception)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); Message.obtain((Handler)iterator.next(), 8, exception).sendToTarget()) { }
    }

    public final void b(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); Message.obtain((Handler)iterator.next(), 9, i, 0).sendToTarget()) { }
    }

    public final void b(int i, int j)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); Message.obtain((Handler)iterator.next(), 12, i, j).sendToTarget()) { }
    }

    public final boolean b(Handler handler)
    {
        return a.remove(handler);
    }

    public final void c(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); Message.obtain((Handler)iterator.next(), 10, i, 0).sendToTarget()) { }
    }

    public final void d(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); Message.obtain((Handler)iterator.next(), 15, i, 0).sendToTarget()) { }
    }
}
