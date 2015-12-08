// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api:
//            s

final class u
    implements b
{

    final s a;

    private u(s s1)
    {
        a = s1;
        super();
    }

    u(s s1, byte byte0)
    {
        this(s1);
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("Error loading DefaultThumbnailLoader", exception);
        s.a(a, s.d(a));
        s.a(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Page)obj1;
        Video video;
        for (obj1 = ((Page) (obj)).entries.iterator(); ((Iterator) (obj1)).hasNext(); com.google.android.apps.youtube.api.s.b(a).add(video))
        {
            video = (Video)((Iterator) (obj1)).next();
        }

        if (((Page) (obj)).entries.isEmpty() || ((Page) (obj)).nextUri == null)
        {
            s.a(a, null);
        } else
        {
            s.a(a, GDataRequest.a(((Page) (obj)).nextUri, s.c(a)));
        }
        if (s.d(a) < com.google.android.apps.youtube.api.s.b(a).size())
        {
            s.a(a, s.d(a));
            s.a(a, (Video)com.google.android.apps.youtube.api.s.b(a).get(s.d(a)));
            return;
        } else
        {
            s.e(a);
            return;
        }
    }
}
