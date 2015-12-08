// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import sun.misc.Unsafe;

// Referenced classes of package com.google.common.cache:
//            Striped64

static final class value
{

    private static final Unsafe UNSAFE;
    private static final long valueOffset;
    volatile long p0;
    volatile long p1;
    volatile long p2;
    volatile long p3;
    volatile long p4;
    volatile long p5;
    volatile long p6;
    volatile long q0;
    volatile long q1;
    volatile long q2;
    volatile long q3;
    volatile long q4;
    volatile long q5;
    volatile long q6;
    volatile long value;

    final boolean cas(long l, long l1)
    {
        return UNSAFE.compareAndSwapLong(this, valueOffset, l, l1);
    }

    static 
    {
        try
        {
            UNSAFE = Striped64.access$000();
            valueOffset = UNSAFE.objectFieldOffset(com/google/common/cache/Striped64$Cell.getDeclaredField("value"));
        }
        catch (Exception exception)
        {
            throw new Error(exception);
        }
    }

    (long l)
    {
        value = l;
    }
}
