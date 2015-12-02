// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import sun.misc.Unsafe;

abstract class ihf extends ihb
{

    protected static final long e = iho.a(ihf, "producerIndex");
    private volatile long producerIndex;

    public ihf(int i)
    {
        super(i);
    }

    protected final long b()
    {
        return producerIndex;
    }

    protected final void d(long l)
    {
        iho.a.putOrderedLong(this, e, l);
    }

}
