// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreensMonitor, YouTubeTvScreen

final class co
    implements b
{

    final YouTubeTvScreensMonitor a;

    private co(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        a = youtubetvscreensmonitor;
        super();
    }

    co(YouTubeTvScreensMonitor youtubetvscreensmonitor, byte byte0)
    {
        this(youtubetvscreensmonitor);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error loading available screens", exception);
    }

    public final void a(Object obj, Object obj1)
    {
        boolean flag1;
        flag1 = false;
        obj1 = (List)obj1;
        obj = YouTubeTvScreensMonitor.m(a);
        if (((CopyOnWriteArrayList) (obj)).size() == ((List) (obj1)).size()) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L7:
        if (flag) goto _L4; else goto _L3
_L3:
        obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = YouTubeTvScreensMonitor.m(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            YouTubeTvScreen youtubetvscreen1 = (YouTubeTvScreen)iterator.next();
            if (!((List) (obj1)).contains(youtubetvscreen1))
            {
                YouTubeTvScreensMonitor.d(a, youtubetvscreen1);
            }
        } while (true);
          goto _L5
        obj1;
        throw obj1;
_L2:
        int i = 0;
_L8:
        if (i >= ((CopyOnWriteArrayList) (obj)).size())
        {
            break MISSING_BLOCK_LABEL_152;
        }
        flag = flag1;
        if (!((YouTubeTvScreen)((CopyOnWriteArrayList) (obj)).get(i)).equals(((List) (obj1)).get(i))) goto _L7; else goto _L6
_L6:
        i++;
          goto _L8
        flag = true;
          goto _L7
_L5:
        YouTubeTvScreen youtubetvscreen;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor.b(a, youtubetvscreen))
        {
            youtubetvscreen = (YouTubeTvScreen)((Iterator) (obj1)).next();
        }

        obj;
        JVM INSTR monitorexit ;
_L4:
    }
}
