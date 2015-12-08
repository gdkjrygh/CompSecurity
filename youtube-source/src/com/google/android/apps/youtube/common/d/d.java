// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.d;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.common.d:
//            e, c, a, f, 
//            b

public final class d
{

    private static final Comparator a = new e();
    private final Map b;
    private final Map c = new ConcurrentHashMap();
    private final Executor d;
    private final Object e = new Object();

    public d(Map map, Executor executor)
    {
        b = (Map)com.google.android.apps.youtube.common.fromguava.c.a(map);
        d = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
    }

    static void a(d d1, b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        b1 = new ArrayList();
        Iterator iterator = d1.c.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.apps.youtube.common.d.c c1 = (com.google.android.apps.youtube.common.d.c)iterator.next();
            if (d1.b(c1))
            {
                b1.add(c1);
            }
        } while (true);
        Collections.sort(b1, a);
        for (d1 = b1.iterator(); d1.hasNext(); b1.a())
        {
            b1 = (com.google.android.apps.youtube.common.d.c)d1.next();
            L.e((new StringBuilder("Executing ConditionTask ")).append(b1.getClass().getCanonicalName()).toString());
        }

    }

    private boolean b(com.google.android.apps.youtube.common.d.c c1)
    {
        for (c1 = c1.b().iterator(); c1.hasNext();)
        {
            String s = (String)c1.next();
            if (!((a)b.get(s)).c())
            {
                return false;
            }
        }

        return true;
    }

    public final void a(com.google.android.apps.youtube.common.d.c c1)
    {
        boolean flag = true;
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator;
        String s;
        if (c1.b().isEmpty())
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "At least one required condition must be supplied.");
        iterator = c1.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_119;
            }
            s = (String)iterator.next();
        } while (b.containsKey(s));
        throw new IllegalArgumentException(String.format(Locale.US, "%s task requires non-existent condition: %s", new Object[] {
            c1.getClass().getCanonicalName(), s
        }));
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
        c.put(c1.getClass().getCanonicalName(), c1);
        obj;
        JVM INSTR monitorexit ;
    }

    public final void handleConditionReachedNotification(b b1)
    {
        d.execute(new f(this, b1));
    }

}
