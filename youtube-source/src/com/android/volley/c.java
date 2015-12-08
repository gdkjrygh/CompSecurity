// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            r, Request, a, p

public final class c extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final a d;
    private final p e;
    private volatile boolean f;

    public c(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, a a1, p p)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = a1;
        e = p;
    }

    public final void a()
    {
        f = true;
        interrupt();
    }

    public final void run()
    {
        if (a)
        {
            r.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        a a1 = d;
_L1:
        Object obj;
label0:
        {
            do
            {
                try
                {
                    do
                    {
                        obj = (Request)b.take();
                        ((Request) (obj)).a("cache-queue-take");
                        if (!((Request) (obj)).g())
                        {
                            break label0;
                        }
                        ((Request) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        a a2 = d;
        ((Request) (obj)).d();
        ((Request) (obj)).a("cache-miss");
        c.put(obj);
          goto _L1
    }

    static 
    {
        a = r.b;
    }
}
