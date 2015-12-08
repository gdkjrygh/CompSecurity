// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.a:
//            p, w, aa, j, 
//            m, ab, t, b

public class k extends Thread
{

    private final BlockingQueue a;
    private final j b;
    private final b c;
    private final w d;
    private volatile boolean e;

    public k(BlockingQueue blockingqueue, j j1, b b1, w w1)
    {
        e = false;
        a = blockingqueue;
        b = j1;
        c = b1;
        d = w1;
    }

    private void a(p p1, aa aa1)
    {
        aa1 = p1.a(aa1);
        d.a(p1, aa1);
    }

    public void a()
    {
        e = true;
        interrupt();
    }

    public void run()
    {
        Process.setThreadPriority(10);
_L2:
        Object obj;
        aa aa1;
        try
        {
            obj = (p)a.take();
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
        ((p) (obj)).a("network-queue-take");
        if (((p) (obj)).h())
        {
            ((p) (obj)).b("network-discard-cancelled");
            continue; /* Loop/switch isn't completed */
        }
        int i = android.os.Build.VERSION.SDK_INT;
        Object obj1 = b.a(((p) (obj)));
        ((p) (obj)).a("network-http-complete");
        if (((m) (obj1)).d && ((p) (obj)).w())
        {
            ((p) (obj)).b("not-modified");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((p) (obj)).a(((m) (obj1)));
            ((p) (obj)).a("network-parse-complete");
            if (((p) (obj)).r() && ((t) (obj1)).b != null)
            {
                c.a(((p) (obj)).e(), ((t) (obj1)).b);
                ((p) (obj)).a("network-cache-written");
            }
            ((p) (obj)).v();
            d.a(((p) (obj)), ((t) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            a(((p) (obj)), aa1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ab.a(((Throwable) (obj1)), "Unhandled exception %s", new Object[] {
                ((Exception) (obj1)).toString()
            });
            d.a(((p) (obj)), new aa(((Throwable) (obj1))));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
