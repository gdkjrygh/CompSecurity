// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.android.a:
//            g, k, p, ab, 
//            d, b, j, w

public class s
{

    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final b f;
    private final j g;
    private final w h;
    private k i[];
    private d j;

    public s(b b1, j j1)
    {
        this(b1, j1, 4);
    }

    public s(b b1, j j1, int l)
    {
        this(b1, j1, l, ((w) (new g(new Handler(Looper.getMainLooper())))));
    }

    public s(b b1, j j1, int l, w w)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        f = b1;
        g = j1;
        i = new k[l];
        h = w;
    }

    public p a(p p1)
    {
        p1.a(this);
        synchronized (c)
        {
            c.add(p1);
        }
        p1.a(c());
        p1.a("add-to-queue");
        if (!p1.r())
        {
            e.add(p1);
            return p1;
        }
        break MISSING_BLOCK_LABEL_62;
        p1;
        set;
        JVM INSTR monitorexit ;
        throw p1;
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s1;
        s1 = p1.e();
        if (!b.containsKey(s1))
        {
            break MISSING_BLOCK_LABEL_172;
        }
        queue = (Queue)b.get(s1);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(p1);
        b.put(s1, obj);
        if (ab.b)
        {
            ab.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s1
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return p1;
        p1;
        map;
        JVM INSTR monitorexit ;
        throw p1;
        b.put(s1, null);
        d.add(p1);
          goto _L1
    }

    public void a()
    {
        b();
        j = new d(d, e, f, h);
        j.start();
        int l = 0;
        do
        {
            if (l >= i.length)
            {
                return;
            }
            k k1 = new k(e, g, f, h);
            i[l] = k1;
            k1.start();
            l++;
        } while (true);
    }

    public void b()
    {
        if (j != null)
        {
            j.a();
        }
        int l = 0;
        do
        {
            if (l >= i.length)
            {
                return;
            }
            if (i[l] != null)
            {
                i[l].a();
            }
            l++;
        } while (true);
    }

    void b(p p1)
    {
        synchronized (c)
        {
            c.remove(p1);
        }
        if (!p1.r()) goto _L2; else goto _L1
_L1:
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        Queue queue;
        p1 = p1.e();
        queue = (Queue)b.remove(p1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (ab.b)
        {
            ab.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), p1
            });
        }
        d.addAll(queue);
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
        p1;
        obj;
        JVM INSTR monitorexit ;
        throw p1;
        p1;
        obj;
        JVM INSTR monitorexit ;
        throw p1;
    }

    public int c()
    {
        return a.incrementAndGet();
    }
}
