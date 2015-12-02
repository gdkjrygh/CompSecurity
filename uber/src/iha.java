// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import sun.misc.Unsafe;

abstract class iha extends ihc
{

    protected static final long d = iho.a(iha, "consumerIndex");
    private volatile long consumerIndex;

    public iha(int i)
    {
        super(i);
    }

    protected final long a()
    {
        return consumerIndex;
    }

    protected final boolean a(long l, long l1)
    {
        return iho.a.compareAndSwapLong(this, d, l, l1);
    }

}
