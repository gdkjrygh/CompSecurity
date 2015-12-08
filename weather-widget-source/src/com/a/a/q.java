// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;


// Referenced classes of package com.a.a:
//            o

class q extends o
{

    int d;

    q(float f1)
    {
        a = f1;
        b = Integer.TYPE;
    }

    q(float f1, int i)
    {
        a = f1;
        d = i;
        b = Integer.TYPE;
        c = true;
    }

    public void a(Object obj)
    {
        if (obj != null && obj.getClass() == java/lang/Integer)
        {
            d = ((Integer)obj).intValue();
            c = true;
        }
    }

    public Object b()
    {
        return Integer.valueOf(d);
    }

    public Object clone()
    {
        return g();
    }

    public o e()
    {
        return g();
    }

    public int f()
    {
        return d;
    }

    public q g()
    {
        q q1 = new q(c(), d);
        q1.a(d());
        return q1;
    }
}
