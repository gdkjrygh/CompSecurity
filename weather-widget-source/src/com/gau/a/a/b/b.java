// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.b;

import android.content.Context;
import com.gau.a.a.e;
import com.gau.a.a.f.a;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.gau.a.a.b:
//            k, c, d, a

public class b
    implements k
{

    private int a;
    private Map b;
    private Map c;
    private a d;

    public b()
    {
        a = 2;
        d = new a();
    }

    private int a()
    {
        if (b == null || b.isEmpty())
        {
            return 0;
        } else
        {
            return b.size();
        }
    }

    private com.gau.a.a.b.a b(com.gau.a.a.d.a a1, e e, Context context)
    {
        if (c == null)
        {
            c = new ConcurrentHashMap();
        }
        e = new c(a1, e, context);
        c.put(a1, (c)e);
        return e;
    }

    private void b(com.gau.a.a.b.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1 = (String)((d)a1).e();
        b.remove(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private com.gau.a.a.b.a c(com.gau.a.a.d.a a1, e e, Context context)
    {
        Object obj;
        String s;
        Iterator iterator;
        long l;
        obj = null;
        if (b == null)
        {
            b = new ConcurrentHashMap();
        }
        s = a1.j().getHost();
        if (b.containsKey(s))
        {
            obj = (d)b.get(s);
            if (a1.m())
            {
                a1.b(true);
                ((d) (obj)).a(a1, e);
                return ((com.gau.a.a.b.a) (obj));
            }
            if (((d) (obj)).b())
            {
                ((d) (obj)).a(a1, e);
                return ((com.gau.a.a.b.a) (obj));
            } else
            {
                a1.b(false);
                return b(a1, e, context);
            }
        }
        if (a() < a)
        {
            a1 = new d(a1, e, context, this);
            ((d)a1).a(d);
            ((d)a1).a(s);
            b.put(s, (d)a1);
            return a1;
        }
        iterator = b.entrySet().iterator();
        context = "";
        if (iterator == null)
        {
            return null;
        }
        l = 0L;
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        if (entry != null)
        {
            Object obj1 = (d)entry.getValue();
            if (obj1 != null)
            {
                long l1 = ((d) (obj1)).f();
                if (l1 > l)
                {
                    obj = (String)entry.getKey();
                    context = ((Context) (obj1));
                    l = l1;
                } else
                {
                    Object obj2 = obj;
                    obj = context;
                    context = ((Context) (obj2));
                }
                obj1 = obj;
                obj = context;
                context = ((Context) (obj1));
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        ((d)obj).a(a1, e);
        ((d)obj).a(s);
        b.remove(context);
        b.put(s, (d)obj);
        return ((com.gau.a.a.b.a) (obj));
    }

    public com.gau.a.a.b.a a(com.gau.a.a.d.a a1, e e, Context context)
    {
        if (!a1.n())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        a1.a(true);
        this;
        JVM INSTR monitorenter ;
        a1 = c(a1, e, context);
        this;
        JVM INSTR monitorexit ;
        return a1;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        return b(a1, e, context);
    }

    public void a(com.gau.a.a.b.a a1)
    {
        b(a1);
    }

    public void a(com.gau.a.a.d.a a1)
    {
        while (a1 == null || a1.n() || c == null || c.isEmpty()) 
        {
            return;
        }
        c.remove(a1);
    }
}
