// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import sun.misc.Unsafe;

abstract class igu extends igw
{

    private static final long e = iho.a(igu, "consumerIndex");
    private volatile long consumerIndex;

    public igu(int i)
    {
        super(i);
    }

    protected final long a()
    {
        return consumerIndex;
    }

    protected final boolean a(long l, long l1)
    {
        return iho.a.compareAndSwapLong(this, e, l, l1);
    }

}
