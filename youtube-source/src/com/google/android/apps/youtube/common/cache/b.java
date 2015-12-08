// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import android.util.FloatMath;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            a

public class b
    implements a
{

    final LinkedHashMap a;
    private final int b;

    public b(int i)
    {
        b = i;
        a = new InMemoryLruCache._cls1(this, (int)FloatMath.ceil((float)i / 0.75F) + 1, 0.75F, true);
    }

    static int a(b b1)
    {
        return b1.b;
    }

    public Object a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(obj);
        obj = a.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(d1);
        Iterator iterator = a.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (d1.a(iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_58;
        d1;
        throw d1;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(obj);
        c.a(obj1);
        a.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public Object b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(obj);
        obj = a.remove(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = a.toString();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
