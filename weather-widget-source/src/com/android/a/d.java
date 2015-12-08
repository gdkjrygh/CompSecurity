// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.a:
//            ab, b, p, c, 
//            m, w, t, e

public class d extends Thread
{

    private static final boolean a;
    private final BlockingQueue b;
    private final BlockingQueue c;
    private final b d;
    private final w e;
    private volatile boolean f;

    public d(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, b b1, w w1)
    {
        f = false;
        b = blockingqueue;
        c = blockingqueue1;
        d = b1;
        e = w1;
    }

    static BlockingQueue a(d d1)
    {
        return d1.c;
    }

    public void a()
    {
        f = true;
        interrupt();
    }

    public void run()
    {
        if (a)
        {
            ab.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        d.a();
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
                        obj = (p)b.take();
                        ((p) (obj)).a("cache-queue-take");
                        if (!((p) (obj)).h())
                        {
                            break label0;
                        }
                        ((p) (obj)).b("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!f);
            return;
        }
        c c1 = d.a(((p) (obj)).e());
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((p) (obj)).a("cache-miss");
        c.put(obj);
          goto _L1
label1:
        {
            if (!c1.a())
            {
                break label1;
            }
            ((p) (obj)).a("cache-hit-expired");
            ((p) (obj)).a(c1);
            c.put(obj);
        }
          goto _L1
        t t1;
label2:
        {
            ((p) (obj)).a("cache-hit");
            t1 = ((p) (obj)).a(new m(c1.a, c1.f));
            ((p) (obj)).a("cache-hit-parsed");
            if (c1.b())
            {
                break label2;
            }
            e.a(((p) (obj)), t1);
        }
          goto _L1
        ((p) (obj)).a("cache-hit-refresh-needed");
        ((p) (obj)).a(c1);
        t1.d = true;
        e.a(((p) (obj)), t1, new e(this, ((p) (obj))));
          goto _L1
    }

    static 
    {
        a = ab.b;
    }
}
