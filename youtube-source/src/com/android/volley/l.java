// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

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

// Referenced classes of package com.android.volley:
//            e, i, Request, r, 
//            c, a, h, p

public final class l
{

    private AtomicInteger a;
    private final Map b;
    private final Set c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final a f;
    private final h g;
    private final p h;
    private i i[];
    private c j;

    public l(a a1, h h1)
    {
        this(a1, h1, 4);
    }

    private l(a a1, h h1, int k)
    {
        this(a1, h1, 4, ((p) (new e(new Handler(Looper.getMainLooper())))));
    }

    private l(a a1, h h1, int k, p p)
    {
        a = new AtomicInteger();
        b = new HashMap();
        c = new HashSet();
        d = new PriorityBlockingQueue();
        e = new PriorityBlockingQueue();
        f = a1;
        g = h1;
        i = new i[k];
        h = p;
    }

    public final Request a(Request request)
    {
        request.a(this);
        synchronized (c)
        {
            c.add(request);
        }
        request.a(a.incrementAndGet());
        request.a("add-to-queue");
        if (!request.m())
        {
            e.add(request);
            return request;
        }
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = request.d();
        if (!b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_175;
        }
        queue = (Queue)b.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(request);
        b.put(s, obj);
        if (r.b)
        {
            r.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return request;
        request;
        throw request;
        b.put(s, null);
        d.add(request);
          goto _L1
    }

    public final void a()
    {
        boolean flag = false;
        if (j != null)
        {
            j.a();
        }
        for (int i1 = 0; i1 < i.length; i1++)
        {
            if (i[i1] != null)
            {
                i[i1].a();
            }
        }

        j = new c(d, e, f, h);
        j.start();
        for (int j1 = ((flag) ? 1 : 0); j1 < i.length; j1++)
        {
            i k = new i(e, g, f, h);
            i[j1] = k;
            k.start();
        }

    }

    final void b(Request request)
    {
        Queue queue;
        synchronized (c)
        {
            c.remove(request);
        }
        if (!request.m()) goto _L2; else goto _L1
_L1:
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        request = request.d();
        queue = (Queue)b.remove(request);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (r.b)
        {
            r.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), request
            });
        }
        d.addAll(queue);
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
        request;
        throw request;
    }
}
