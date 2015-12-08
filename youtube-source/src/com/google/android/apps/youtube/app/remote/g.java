// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            e, au, YouTubeTvScreen

final class g
    implements Runnable
{

    final YouTubeTvScreen a;
    final e b;

    g(e e1, YouTubeTvScreen youtubetvscreen)
    {
        b = e1;
        a = youtubetvscreen;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = e.a(b).iterator(); iterator.hasNext(); ((au)iterator.next()).a(a)) { }
    }
}
