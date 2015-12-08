// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            VolleyError, Request, p, h, 
//            j, r, m, a

public final class i extends Thread
{

    private final BlockingQueue a;
    private final h b;
    private final a c;
    private final p d;
    private volatile boolean e;

    public i(BlockingQueue blockingqueue, h h1, a a1, p p1)
    {
        e = false;
        a = blockingqueue;
        b = h1;
        c = a1;
        d = p1;
    }

    public final void a()
    {
        e = true;
        interrupt();
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        VolleyError volleyerror;
        VolleyError volleyerror1;
        try
        {
            obj = (Request)a.take();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (e)
            {
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        ((Request) (obj)).a("network-queue-take");
        if (((Request) (obj)).g())
        {
            ((Request) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            TrafficStats.setThreadStatsTag(((Request) (obj)).b());
        }
        Object obj1 = b.a(((Request) (obj)));
        ((Request) (obj)).a("network-http-complete");
        if (((j) (obj1)).d && ((Request) (obj)).r())
        {
            ((Request) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((Request) (obj)).a(((j) (obj1)));
            ((Request) (obj)).a("network-parse-complete");
            if (((Request) (obj)).m() && ((m) (obj1)).b != null)
            {
                Object obj2 = c;
                ((Request) (obj)).d();
                obj2 = ((m) (obj1)).b;
                ((Request) (obj)).a("network-cache-written");
            }
            ((Request) (obj)).q();
            d.a(((Request) (obj)), ((m) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            volleyerror1 = ((Request) (obj)).a(volleyerror);
            d.a(((Request) (obj)), volleyerror1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            r.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            d.a(((Request) (obj)), new VolleyError(((Throwable) (obj1))));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
