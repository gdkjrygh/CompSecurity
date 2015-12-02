// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igz extends ihd
{

    public igz(int i)
    {
        super(i);
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
        Object aobj[] = c;
        long l = b;
        long l1 = b();
        long l2 = a(l1);
        if (b(aobj, l2) != null)
        {
            if (l1 - a() > l)
            {
                return false;
            }
            while (b(aobj, l2) != null) ;
        }
        a(aobj, l2, obj);
        d(1L + l1);
        return true;
    }

    public final Object peek()
    {
        long l = c();
        Object obj;
        do
        {
            long l1 = a();
            if (l1 >= l)
            {
                long l2 = b();
                if (l1 >= l2)
                {
                    return null;
                }
                e(l2);
            }
            obj = c(a(l1));
        } while (obj == null);
        return obj;
    }

    public final Object poll()
    {
        long l = c();
        long l1;
        do
        {
            l1 = a();
            if (l1 >= l)
            {
                long l2 = b();
                if (l1 >= l2)
                {
                    return null;
                }
                e(l2);
            }
        } while (!a(l1, 1L + l1));
        l = a(l1);
        Object aobj[] = c;
        Object obj = a(aobj, l);
        b(aobj, l, null);
        return obj;
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
