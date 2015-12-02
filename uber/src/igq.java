// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import sun.misc.Unsafe;

public abstract class igq extends igr
{

    protected static final int a;
    private static final long d;
    private static final int e;
    protected final long b;
    protected final Object c[];

    public igq(int i)
    {
        i = igy.a(i);
        b = i - 1;
        c = (Object[])new Object[(i << a) + 64];
    }

    private static long a(long l, long l1)
    {
        return d + ((l & l1) << e);
    }

    protected static Object a(Object aobj[], long l)
    {
        return iho.a.getObject(((Object) (aobj)), l);
    }

    protected static void a(Object aobj[], long l, Object obj)
    {
        iho.a.putObject(((Object) (aobj)), l, obj);
    }

    protected static Object b(Object aobj[], long l)
    {
        return iho.a.getObjectVolatile(((Object) (aobj)), l);
    }

    protected static void b(Object aobj[], long l, Object obj)
    {
        iho.a.putOrderedObject(((Object) (aobj)), l, obj);
    }

    protected final long a(long l)
    {
        return a(l, b);
    }

    protected final void a(long l, Object obj)
    {
        a(c, l, obj);
    }

    protected final Object b(long l)
    {
        return a(c, l);
    }

    protected final Object c(long l)
    {
        return b(c, l);
    }

    public void clear()
    {
        while (poll() != null || !isEmpty()) ;
    }

    public Iterator iterator()
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        a = Integer.getInteger("sparse.shift", 0).intValue();
        int i = iho.a.arrayIndexScale([Ljava/lang/Object;);
        if (4 == i)
        {
            e = a + 2;
        } else
        if (8 == i)
        {
            e = a + 3;
        } else
        {
            throw new IllegalStateException("Unknown pointer size");
        }
        d = iho.a.arrayBaseOffset([Ljava/lang/Object;) + (32 << e - a);
    }
}
