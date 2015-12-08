// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.android.volley:
//            r, t

final class s
{

    public static final boolean a;
    private final List b = new ArrayList();
    private boolean c;

    s()
    {
        c = false;
    }

    public final void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        c = true;
        i = b.size();
        if (i != 0) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L9:
        if (l > 0L) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        l = ((t)b.get(0)).c;
        l = ((t)b.get(b.size() - 1)).c - l;
        continue; /* Loop/switch isn't completed */
_L4:
        long l1;
        l1 = ((t)b.get(0)).c;
        r.b("(%-4d ms) %s", new Object[] {
            Long.valueOf(l), s1
        });
        s1 = b.iterator();
        l = l1;
_L6:
        if (!s1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        t t1 = (t)s1.next();
        l1 = t1.c;
        r.b("(+%-4d) [%2d] %s", new Object[] {
            Long.valueOf(l1 - l), Long.valueOf(t1.b), t1.a
        });
        l = l1;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L3; else goto _L7
_L7:
        s1;
        throw s1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            throw new IllegalStateException("Marker added to finished log");
        }
        break MISSING_BLOCK_LABEL_24;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        b.add(new t(s1, l, SystemClock.elapsedRealtime()));
        this;
        JVM INSTR monitorexit ;
    }

    protected final void finalize()
    {
        if (!c)
        {
            a("Request on the loose");
            r.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    static 
    {
        a = r.b;
    }
}
