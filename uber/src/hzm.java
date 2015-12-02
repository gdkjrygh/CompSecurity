// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class hzm extends hzx
{

    private hzx a;

    public hzm(hzx hzx1)
    {
        if (hzx1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = hzx1;
            return;
        }
    }

    public final hzm a(hzx hzx1)
    {
        if (hzx1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = hzx1;
            return this;
        }
    }

    public final hzx a()
    {
        return a;
    }

    public final hzx clearDeadline()
    {
        return a.clearDeadline();
    }

    public final hzx clearTimeout()
    {
        return a.clearTimeout();
    }

    public final long deadlineNanoTime()
    {
        return a.deadlineNanoTime();
    }

    public final hzx deadlineNanoTime(long l)
    {
        return a.deadlineNanoTime(l);
    }

    public final boolean hasDeadline()
    {
        return a.hasDeadline();
    }

    public final void throwIfReached()
    {
        a.throwIfReached();
    }

    public final hzx timeout(long l, TimeUnit timeunit)
    {
        return a.timeout(l, timeunit);
    }

    public final long timeoutNanos()
    {
        return a.timeoutNanos();
    }
}
