// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.e;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.apps.youtube.app.e:
//            b, d

final class c
    implements b
{

    final com.google.android.apps.youtube.app.e.b a;
    private final b b;
    private final List c = new ArrayList();

    public c(com.google.android.apps.youtube.app.e.b b1, b b2)
    {
        a = b1;
        super();
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b2);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (GDataRequest)obj;
        b.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        GDataRequest gdatarequest = (GDataRequest)obj;
        obj1 = (Page)obj1;
        L.f((new StringBuilder("widget gets ")).append(((Page) (obj1)).entries.size()).append(" videos").toString());
        Iterator iterator = ((Page) (obj1)).entries.iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                Video video1 = (Video)iterator.next();
                if (com.google.android.apps.youtube.app.e.b.a(a))
                {
                    obj = video1.hqThumbnailUri;
                } else
                {
                    obj = video1.defaultThumbnailUri;
                }
            } while (obj == null || !com.google.android.apps.youtube.app.e.b.b(a).containsKey(video1.id));
            c.add(video1);
        } while (c.size() != com.google.android.apps.youtube.app.e.b.c(a));
        if (c.size() < com.google.android.apps.youtube.app.e.b.d(a) && ((Page) (obj1)).nextUri != null)
        {
            com.google.android.apps.youtube.app.e.b.e(a).a(GDataRequest.a(((Page) (obj1)).nextUri, gdatarequest), this);
        } else
        {
            if (c.isEmpty())
            {
                b.a(gdatarequest, new Exception("Unable to load any teasers"));
                return;
            }
            obj = new d(a, gdatarequest, b, c.size(), c, com.google.android.apps.youtube.app.e.b.b(a));
            obj1 = c.iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                Video video = (Video)((Iterator) (obj1)).next();
                if (com.google.android.apps.youtube.app.e.b.a(a))
                {
                    com.google.android.apps.youtube.app.e.b.f(a).a(video.hqThumbnailUri, ((b) (obj)));
                } else
                {
                    com.google.android.apps.youtube.app.e.b.f(a).a(video.defaultThumbnailUri, ((b) (obj)));
                }
            }
        }
    }
}
