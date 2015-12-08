// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataResponseException;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.legacy.model.be;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.apps.youtube.app:
//            an

final class ao
    implements b
{

    final an a;
    private final GDataRequest b;
    private final b c;
    private final HashMap d;
    private int e;
    private final ArrayList f;
    private Exception g;
    private Exception h;
    private final ArrayList i = new ArrayList();
    private final int j;

    public ao(an an1, b b1, GDataRequest gdatarequest, HashMap hashmap, int k)
    {
        a = an1;
        super();
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        b = (GDataRequest)com.google.android.apps.youtube.common.fromguava.c.a(gdatarequest);
        d = (HashMap)com.google.android.apps.youtube.common.fromguava.c.a(hashmap);
        j = k;
        e = hashmap.size();
        f = new ArrayList(e);
    }

    private void a()
    {
label0:
        {
            e = e - 1;
            if (e == 0)
            {
                ArrayList arraylist = f;
                ArrayList arraylist1 = i;
                int k = 0;
label1:
                for (boolean flag = false; !flag; k++)
                {
                    Iterator iterator = arraylist.iterator();
                    flag = true;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            continue label1;
                        }
                        Object obj = (List)iterator.next();
                        if (k < ((List) (obj)).size())
                        {
                            obj = (Video)((List) (obj)).get(k);
                            if (!arraylist1.contains(obj))
                            {
                                arraylist1.add(obj);
                            }
                            flag = false;
                        }
                    } while (true);
                }

                f.clear();
                if (i.size() <= 0)
                {
                    break label0;
                }
                c.a(b, new Page(i.size(), i.size(), j, null, null, i));
                if (g != null)
                {
                    c.a(b, new Exception("some feed sources failed", g));
                }
            }
            return;
        }
        b b1 = c;
        GDataRequest gdatarequest = b;
        Exception exception;
        if (g != null)
        {
            exception = g;
        } else
        {
            exception = h;
        }
        b1.a(gdatarequest, new Exception("all feed sources failed", exception));
    }

    private void a(GDataRequest gdatarequest, Page page)
    {
        this;
        JVM INSTR monitorenter ;
        gdatarequest = (be)d.get(gdatarequest);
        Video video;
        for (Iterator iterator = page.entries.iterator(); iterator.hasNext(); an.a(a).putIfAbsent(video.id, gdatarequest))
        {
            video = (Video)iterator.next();
        }

        break MISSING_BLOCK_LABEL_69;
        gdatarequest;
        throw gdatarequest;
        f.add(page.entries);
        a();
        this;
        JVM INSTR monitorexit ;
    }

    private void a(Exception exception)
    {
        this;
        JVM INSTR monitorenter ;
        if (!(exception instanceof GDataResponseException) || !((GDataResponseException)exception).containsYouTubeSignupRequiredError())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        L.e((new StringBuilder("onError in the feed: ")).append(exception.getMessage()).append(" but it's youtube_signup_required (or equivalent), ignoring").toString());
        h = exception;
_L1:
        a();
        this;
        JVM INSTR monitorexit ;
        return;
        L.e((new StringBuilder("onError in the feed: ")).append(exception.getMessage()).toString());
        g = exception;
          goto _L1
        exception;
        throw exception;
    }

    public final volatile void a(Object obj, Exception exception)
    {
        a(exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        a((GDataRequest)obj, (Page)obj1);
    }
}
