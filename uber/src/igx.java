// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import sun.misc.Unsafe;

abstract class igx extends igv
{

    private static final long e = iho.a(igx, "producerIndex");
    private volatile long producerIndex;

    public igx(int i)
    {
        super(i);
    }

    protected final long b()
    {
        return producerIndex;
    }

    protected final boolean b(long l, long l1)
    {
        return iho.a.compareAndSwapLong(this, e, l, l1);
    }

}
