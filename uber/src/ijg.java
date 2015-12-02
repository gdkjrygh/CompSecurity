// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseBooleanArray;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ijg
{

    static final List a = new CopyOnWriteArrayList();
    static final SparseBooleanArray b = new SparseBooleanArray();
    private static final ijj c = new _cls1();

    public static ijj a(String s)
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            ((iji)a.get(b.keyAt(i))).a(s);
        }

        return c;
    }

    public static void a(ijj ijj1)
    {
        if (ijj1 == null)
        {
            throw new NullPointerException("tree == null");
        }
        if (ijj1 == c)
        {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        if (ijj1 instanceof iji)
        {
            b.append(a.size(), true);
        }
        a.add(ijj1);
    }

    public static transient void a(String s, Object aobj[])
    {
        c.c(s, aobj);
    }

    public static transient void a(Throwable throwable, String s, Object aobj[])
    {
        c.c(throwable, s, aobj);
    }

    public static transient void b(String s, Object aobj[])
    {
        c.a(s, aobj);
    }

    public static transient void b(Throwable throwable, String s, Object aobj[])
    {
        c.a(throwable, s, aobj);
    }

    public static transient void c(String s, Object aobj[])
    {
        c.d(s, aobj);
    }

    public static transient void c(Throwable throwable, String s, Object aobj[])
    {
        c.d(throwable, s, aobj);
    }

    public static transient void d(String s, Object aobj[])
    {
        c.b(s, aobj);
    }

    public static transient void d(Throwable throwable, String s, Object aobj[])
    {
        c.b(throwable, s, aobj);
    }


    /* member class not found */
    class _cls1 {}

}
