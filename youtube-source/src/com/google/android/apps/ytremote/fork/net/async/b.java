// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            c

public class b
    implements Comparable
{

    static final boolean a;
    private static final AtomicInteger b = new AtomicInteger();
    private final int c;
    private final long d;
    private final long e;
    private final c f;
    private final Object g;

    public b(long l, long l1, c c1, Object obj)
    {
        c = b.getAndIncrement();
        if (!a && l1 <= 0L)
        {
            throw new AssertionError();
        }
        if (!a && l < l1)
        {
            throw new AssertionError();
        }
        if (!a && c1 == null)
        {
            throw new AssertionError();
        } else
        {
            d = l;
            e = l1;
            f = c1;
            g = obj;
            return;
        }
    }

    public final long a()
    {
        return d;
    }

    public final c b()
    {
        return f;
    }

    public final Object c()
    {
        return g;
    }

    public int compareTo(Object obj)
    {
        obj = (b)obj;
        if (d >= ((b) (obj)).d)
        {
            if (d > ((b) (obj)).d)
            {
                return 1;
            }
            if (c >= ((b) (obj)).c)
            {
                if (c > ((b) (obj)).c)
                {
                    return 1;
                }
                if (!a && this != obj)
                {
                    throw new AssertionError();
                } else
                {
                    return 0;
                }
            }
        }
        return -1;
    }

    public String toString()
    {
        return (new StringBuilder("Expiration-time(")).append(d).append(") = ").append(d - e).append(" + Creation-time(").append(e).append("); time is msec since epoch, hash code = ").append(Integer.toHexString(hashCode())).toString();
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/ytremote/fork/net/async/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
