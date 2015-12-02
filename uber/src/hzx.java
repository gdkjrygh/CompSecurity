// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class hzx
{

    public static final hzx NONE = new hzx() {

        public final hzx deadlineNanoTime(long l)
        {
            return this;
        }

        public final void throwIfReached()
        {
        }

        public final hzx timeout(long l, TimeUnit timeunit)
        {
            return this;
        }

    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public hzx()
    {
    }

    public hzx clearDeadline()
    {
        hasDeadline = false;
        return this;
    }

    public hzx clearTimeout()
    {
        timeoutNanos = 0L;
        return this;
    }

    public final hzx deadline(long l, TimeUnit timeunit)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("duration <= 0: ")).append(l).toString());
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        } else
        {
            return deadlineNanoTime(System.nanoTime() + timeunit.toNanos(l));
        }
    }

    public long deadlineNanoTime()
    {
        if (!hasDeadline)
        {
            throw new IllegalStateException("No deadline");
        } else
        {
            return deadlineNanoTime;
        }
    }

    public hzx deadlineNanoTime(long l)
    {
        hasDeadline = true;
        deadlineNanoTime = l;
        return this;
    }

    public boolean hasDeadline()
    {
        return hasDeadline;
    }

    public void throwIfReached()
    {
        if (Thread.interrupted())
        {
            throw new InterruptedIOException("thread interrupted");
        }
        if (hasDeadline && deadlineNanoTime - System.nanoTime() <= 0L)
        {
            throw new InterruptedIOException("deadline reached");
        } else
        {
            return;
        }
    }

    public hzx timeout(long l, TimeUnit timeunit)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("timeout < 0: ")).append(l).toString());
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        } else
        {
            timeoutNanos = timeunit.toNanos(l);
            return this;
        }
    }

    public long timeoutNanos()
    {
        return timeoutNanos;
    }

}
