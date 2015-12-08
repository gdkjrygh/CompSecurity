// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.d;

import a.a.a.d;
import a.a.a.f;

abstract class a
{

    protected final a.a.a.a a;
    protected final f b;
    protected final String c;
    protected final String d[];
    protected final Thread e = Thread.currentThread();

    protected a(a.a.a.a a1, String s, String as[])
    {
        a = a1;
        b = new f(a1);
        c = s;
        d = as;
    }

    protected static String[] a(Object aobj[])
    {
        int j = aobj.length;
        String as[] = new String[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return as;
            }
            Object obj = aobj[i];
            if (obj != null)
            {
                as[i] = obj.toString();
            } else
            {
                as[i] = null;
            }
            i++;
        } while (true);
    }

    protected void a()
    {
        if (Thread.currentThread() != e)
        {
            throw new d("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        } else
        {
            return;
        }
    }

    public void a(int i, Object obj)
    {
        a();
        if (obj != null)
        {
            d[i] = obj.toString();
            return;
        } else
        {
            d[i] = null;
            return;
        }
    }
}
