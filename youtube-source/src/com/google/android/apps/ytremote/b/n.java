// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import android.util.Log;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            j

final class n
    implements Runnable
{

    final j a;

    n(j j1)
    {
        a = j1;
        super();
    }

    public final void run()
    {
        Iterator iterator;
        long l;
        iterator = j.a(a).iterator();
        l = 9400L;
_L2:
        Object obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (Future)iterator.next();
        long l1;
        l1 = System.currentTimeMillis();
        ((Future) (obj1)).get(l, TimeUnit.MILLISECONDS);
        l1 = Math.max(0L, l - (System.currentTimeMillis() - l1));
        l = l1;
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.w(j.a(), "Error waiting for reading device response task to complete", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.w(j.a(), "Error waiting for reading device response task to complete", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        TimeoutException timeoutexception;
        timeoutexception;
        Log.w(j.a(), "Timed out waiting for device response");
        ((Future) (obj1)).cancel(true);
        if (true) goto _L2; else goto _L1
_L1:
        Object obj = new ArrayList();
        Iterator iterator1 = j.b(a).keySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            String s1 = (String)iterator1.next();
            YouTubeDevice youtubedevice = (YouTubeDevice)j.b(a).get(s1);
            if (!j.c(a).containsKey(youtubedevice))
            {
                ((List) (obj)).add(s1);
            }
        } while (true);
        String s;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); j.b(a).remove(s))
        {
            s = (String)((Iterator) (obj)).next();
        }

        j.d(a).clear();
        j.c(a).clear();
        j.e(a).clear();
        j.a(a, false);
        return;
    }
}
