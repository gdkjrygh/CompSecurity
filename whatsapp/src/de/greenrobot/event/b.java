// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package de.greenrobot.event:
//            i, g, e

final class b
{

    private static final List b = new ArrayList();
    b a;
    Object c;
    e d;

    private b(Object obj, e e)
    {
        c = obj;
        d = e;
    }

    static b a(e e, Object obj)
    {
        List list = b;
        list;
        JVM INSTR monitorenter ;
        int j = b.size();
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        b b1;
        b1 = (b)b.remove(j - 1);
        b1.c = obj;
        b1.d = e;
        b1.a = null;
        list;
        JVM INSTR monitorexit ;
        return b1;
        list;
        JVM INSTR monitorexit ;
        return new b(obj, e);
        e;
        list;
        JVM INSTR monitorexit ;
        throw e;
    }

    static void a(b b1)
    {
        boolean flag = i.a;
        b1.c = null;
        b1.d = null;
        b1.a = null;
        synchronized (b)
        {
            if (b.size() < 10000)
            {
                b.add(b1);
            }
        }
        if (g.n)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            i.a = flag;
        }
        return;
        b1;
        list;
        JVM INSTR monitorexit ;
        throw b1;
    }

}
