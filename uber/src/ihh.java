// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import sun.misc.Unsafe;

public final class ihh extends ihm
{

    public ihh(int i)
    {
        super(i);
    }

    private long a()
    {
        return iho.a.getLongVolatile(this, f);
    }

    private long b()
    {
        return iho.a.getLongVolatile(this, e);
    }

    private void d(long l)
    {
        iho.a.putOrderedLong(this, f, l);
    }

    private void e(long l)
    {
        iho.a.putOrderedLong(this, e, l);
    }

    public final boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("null elements not allowed");
        }
        Object aobj[] = c;
        long l = producerIndex;
        long l1 = a(l);
        if (b(aobj, l1) != null)
        {
            return false;
        } else
        {
            d(l + 1L);
            b(aobj, l1, obj);
            return true;
        }
    }

    public final Object peek()
    {
        return c(a(consumerIndex));
    }

    public final Object poll()
    {
        long l = consumerIndex;
        long l1 = a(l);
        Object aobj[] = c;
        Object obj = b(aobj, l1);
        if (obj == null)
        {
            return null;
        } else
        {
            e(l + 1L);
            b(aobj, l1, null);
            return obj;
        }
    }

    public final int size()
    {
        long l = b();
        do
        {
            long l2 = a();
            long l1 = b();
            if (l == l1)
            {
                return (int)(l2 - l1);
            }
            l = l1;
        } while (true);
    }
}
