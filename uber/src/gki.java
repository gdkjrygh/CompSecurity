// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

public final class gki
{

    public static int a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).size();
        } else
        {
            return gkj.a(iterable.iterator());
        }
    }

    public static Iterable a(Iterable iterable, int i)
    {
        gjz.a(iterable);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        return new _cls3(iterable, i);
    }

    public static Iterable a(Iterable iterable, gjv gjv)
    {
        gjz.a(iterable);
        gjz.a(gjv);
        return new _cls2(iterable, gjv);
    }

    public static Iterable a(Iterable iterable, gka gka)
    {
        gjz.a(iterable);
        gjz.a(gka);
        return new _cls1(iterable, gka);
    }

    public static Object a(Iterable iterable, Object obj)
    {
        return gkj.a(iterable.iterator(), obj);
    }

    private static Object a(List list)
    {
        return list.get(list.size() - 1);
    }

    public static Object b(Iterable iterable)
    {
        if (iterable instanceof List)
        {
            iterable = (List)iterable;
            if (iterable.isEmpty())
            {
                throw new NoSuchElementException();
            } else
            {
                return a(iterable);
            }
        } else
        {
            return gkj.b(iterable.iterator());
        }
    }

    public static boolean b(Iterable iterable, gka gka)
    {
        return gkj.b(iterable.iterator(), gka);
    }

    public static boolean c(Iterable iterable, gka gka)
    {
        return gkj.c(iterable.iterator(), gka);
    }

    public static gjy d(Iterable iterable, gka gka)
    {
        return gkj.d(iterable.iterator(), gka);
    }

    public static int e(Iterable iterable, gka gka)
    {
        return gkj.e(iterable.iterator(), gka);
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
