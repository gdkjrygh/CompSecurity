// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.apps.youtube.app:
//            an

final class ap
    implements b
{

    final an a;
    private final b b;

    public ap(an an1, b b1)
    {
        a = an1;
        super();
        b = (b)c.a(b1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (GDataRequest)obj;
        b.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (GDataRequest)obj;
        obj1 = (Page)obj1;
        Object obj2 = an.a(a, ((GDataRequest) (obj)));
        if (((Page) (obj1)).entries.isEmpty())
        {
            an.a(a, ((GDataRequest) (obj)), b);
            return;
        }
        Video video;
        for (Iterator iterator = ((Page) (obj1)).entries.iterator(); iterator.hasNext(); an.a(a).putIfAbsent(video.id, com.google.android.apps.youtube.app.an.b()))
        {
            video = (Video)iterator.next();
        }

        if (((Page) (obj1)).nextUri != null)
        {
            b.a(obj, obj1);
            return;
        } else
        {
            obj2 = Uri.parse((new StringBuilder("/myfeed/users/")).append(((String) (obj2))).toString());
            obj1 = new Page(((Page) (obj1)).totalResults, ((Page) (obj1)).elementsPerPage, ((Page) (obj1)).startIndex, ((Page) (obj1)).previousUri, ((Uri) (obj2)), ((Page) (obj1)).entries);
            b.a(obj, obj1);
            return;
        }
    }
}
