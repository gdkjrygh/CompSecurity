// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import android.util.FloatMath;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.d;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            b, k

public final class j extends b
{

    final Map b;
    private final ReferenceQueue c = new ReferenceQueue();

    public j(int i)
    {
        super(i);
        b = new HashMap((int)FloatMath.ceil((float)i / 0.75F) + 1, 0.75F);
    }

    public final Object a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = super.a(obj);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return obj1;
_L2:
        k k1 = (k)b.get(obj);
        if (k1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = k1.get();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        super.a(obj, obj1);
        b.remove(obj);
        obj = obj1;
_L4:
        obj1 = obj;
        if (true) goto _L1; else goto _L3
        obj;
        throw obj;
_L3:
        obj = obj1;
          goto _L4
    }

    public final void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        super.a(d1);
        Iterator iterator = b.keySet().iterator();
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
        break MISSING_BLOCK_LABEL_60;
        d1;
        throw d1;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        super.a(obj, obj1);
        i = b.size();
_L1:
        obj = (k)c.poll();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        b.remove(k.a(((k) (obj))));
          goto _L1
        obj;
        throw obj;
        int l = i - b.size();
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        L.e((new StringBuilder()).append(l).append(" out of ").append(i).append(" soft entries purged. SoftMap size is now ").append(b.size()).toString());
        this;
        JVM INSTR monitorexit ;
    }

    public final Object b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = super.b(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        b.put(obj, new k(obj, obj1, c));
        this;
        JVM INSTR monitorexit ;
        return obj1;
        obj;
        throw obj;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(b.toString()).toString();
    }
}
