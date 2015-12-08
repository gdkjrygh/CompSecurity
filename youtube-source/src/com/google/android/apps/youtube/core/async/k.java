// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, l

public final class k
    implements af
{

    private final long a = 5000L;
    private final af b;
    private final AtomicLong c;
    private final b d;
    private final ScheduledExecutorService e;

    public k(af af1, b b1, AtomicLong atomiclong, long l1, ScheduledExecutorService scheduledexecutorservice)
    {
        b = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        c = (AtomicLong)com.google.android.apps.youtube.common.fromguava.c.a(atomiclong);
        boolean flag;
        if (5000L > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "delay cannot be negative or zero");
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        e = (ScheduledExecutorService)com.google.android.apps.youtube.common.fromguava.c.a(scheduledexecutorservice);
    }

    static af a(k k1)
    {
        return k1.b;
    }

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        long l1 = d.a() - c.get();
        if (l1 >= a)
        {
            l1 = 0L;
        } else
        {
            l1 = a - l1;
        }
        if (l1 > 0L)
        {
            e.schedule(new l(this, obj, b1), l1, TimeUnit.MILLISECONDS);
            return;
        } else
        {
            b.a(obj, b1);
            return;
        }
    }
}
