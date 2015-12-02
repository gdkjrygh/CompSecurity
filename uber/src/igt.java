// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igt extends igu
{

    public igt(int i)
    {
        super(Math.max(2, i));
    }

    public final boolean isEmpty()
    {
        return a() == b();
    }

    public final boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Null is not a valid element");
        }
        long l3 = 1L + b;
        long al[] = d;
        long l = 0x7fffffffffffffffL;
        long l2;
        long l4;
        do
        {
            long l5;
label0:
            do
            {
                long l1;
                do
                {
                    l4 = b();
                    l1 = d(l4);
                    l5 = a(al, l1) - l4;
                    if (l5 != 0L)
                    {
                        continue label0;
                    }
                } while (!b(l4, 1L + l4));
                a(a(l4), obj);
                a(al, l1, 1L + l4);
                return true;
            } while (l5 >= 0L || l4 - l3 > l);
            l2 = a();
            l = l2;
        } while (l4 - l3 > l2);
        return false;
    }

    public final Object peek()
    {
        Object obj;
        long l;
        do
        {
            l = a();
            obj = b(a(l));
        } while (obj == null && l != b());
        return obj;
    }

    public final Object poll()
    {
        long al[] = d;
        long l = -1L;
        long l2;
        long l3;
        do
        {
            long l4;
label0:
            do
            {
                long l1;
                do
                {
                    l3 = a();
                    l1 = d(l3);
                    l4 = a(al, l1) - (1L + l3);
                    if (l4 != 0L)
                    {
                        continue label0;
                    }
                } while (!a(l3, 1L + l3));
                l = a(l3);
                Object obj = b(l);
                a(l, null);
                a(al, l1, l3 + b + 1L);
                return obj;
            } while (l4 >= 0L || l3 < l);
            l2 = b();
            l = l2;
        } while (l3 != l2);
        return null;
    }

    public final int size()
    {
        long l = a();
        do
        {
            long l2 = b();
            long l1 = a();
            if (l == l1)
            {
                return (int)(l2 - l1);
            }
            l = l1;
        } while (true);
    }
}
