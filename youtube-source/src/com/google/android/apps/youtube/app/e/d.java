// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.e;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.datalib.legacy.model.be;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.youtube.app.e:
//            b, a

final class d
    implements b
{

    final com.google.android.apps.youtube.app.e.b a;
    private final GDataRequest b;
    private final b c;
    private final AtomicInteger d;
    private final ConcurrentHashMap e;
    private final List f;
    private final Map g;

    public d(com.google.android.apps.youtube.app.e.b b1, GDataRequest gdatarequest, b b2, int i, List list, Map map)
    {
        a = b1;
        super();
        b = gdatarequest;
        c = b2;
        f = list;
        g = map;
        d = new AtomicInteger(i);
        e = new ConcurrentHashMap(i);
    }

    private void a()
    {
        if (d.decrementAndGet() == 0)
        {
            L.f("Last thumbnail received");
            ArrayList arraylist = new ArrayList(f.size());
            Iterator iterator = f.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Video video = (Video)iterator.next();
                Object obj;
                be be1;
                if (com.google.android.apps.youtube.app.e.b.a(a))
                {
                    obj = video.hqThumbnailUri;
                } else
                {
                    obj = video.defaultThumbnailUri;
                }
                obj = (Bitmap)e.get(obj);
                be1 = (be)g.get(video.id);
                if (obj != null && be1 != null && !TextUtils.isEmpty(video.id))
                {
                    arraylist.add(new a(video, ((Bitmap) (obj)), be1.a));
                }
            } while (true);
            c.a(b, arraylist);
        }
    }

    public final void a(Object obj, Exception exception)
    {
        L.b("widget thumbnail error", exception);
        a();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Uri)obj;
        obj1 = (Bitmap)obj1;
        L.a();
        int i = ((Bitmap) (obj1)).getHeight();
        int j = (int)((float)i * 0.75F);
        obj1 = Bitmap.createBitmap(((Bitmap) (obj1)), 0, (i - j) / 2, ((Bitmap) (obj1)).getWidth(), j);
        e.put(obj, obj1);
        a();
    }
}
