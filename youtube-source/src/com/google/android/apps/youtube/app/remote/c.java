// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.CloudScreen;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            b, a, YouTubeTvScreen

final class c
    implements b
{

    final YouTubeTvScreen a;
    final CloudScreen b;
    final com.google.android.apps.youtube.app.remote.b c;

    c(com.google.android.apps.youtube.app.remote.b b1, YouTubeTvScreen youtubetvscreen, CloudScreen cloudscreen)
    {
        c = b1;
        a = youtubetvscreen;
        b = cloudscreen;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.app.remote.a.a(c.b, b, null);
    }

    public final void a(Object obj, Object obj1)
    {
        for (obj = ((List)obj1).iterator(); ((Iterator) (obj)).hasNext();)
        {
            obj1 = (YouTubeTvScreen)((Iterator) (obj)).next();
            if (((YouTubeTvScreen) (obj1)).equals(a))
            {
                com.google.android.apps.youtube.app.remote.a.a(c.b, b, ((YouTubeTvScreen) (obj1)));
                return;
            }
        }

        com.google.android.apps.youtube.app.remote.a.a(c.b, b, null);
    }
}
