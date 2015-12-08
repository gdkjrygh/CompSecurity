// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;


// Referenced classes of package com.google.c.b:
//            n, w, aa

public static class b
{

    getValue a[];
    int b;

    private void a(int i)
    {
        if (i > a.length)
        {
            a = (a[])w.b(a, a(a.length, i));
        }
    }

    public a a(Object obj, Object obj1)
    {
        a(b + 1);
        obj = n.c(obj, obj1);
        obj1 = a;
        int i = b;
        b = i + 1;
        obj1[i] = obj;
        return this;
    }

    public n a()
    {
        switch (b)
        {
        default:
            return new aa(b, a);

        case 0: // '\0'
            return n.h();

        case 1: // '\001'
            return n.b(a[0].getKey(), a[0].getValue());
        }
    }

    public ()
    {
        this(4);
    }

    <init>(int i)
    {
        a = new a[i];
        b = 0;
    }
}
