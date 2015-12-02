// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import sun.misc.Unsafe;

public abstract class igs extends igq
{

    private static final long e;
    private static final int f;
    protected final long d[];

    public igs(int i)
    {
        super(i);
        i = (int)(b + 1L);
        d = new long[(i << a) + 64];
        for (long l = 0L; l < (long)i; l++)
        {
            a(d, d(l), l);
        }

    }

    protected static long a(long al[], long l)
    {
        return iho.a.getLongVolatile(al, l);
    }

    protected static void a(long al[], long l, long l1)
    {
        iho.a.putOrderedLong(al, l, l1);
    }

    protected final long d(long l)
    {
        return e + ((b & l) << f);
    }

    static 
    {
        if (8 == iho.a.arrayIndexScale([J))
        {
            f = a + 3;
            e = iho.a.arrayBaseOffset([J) + (32 << f - a);
            return;
        } else
        {
            throw new IllegalStateException("Unexpected long[] element size");
        }
    }
}
