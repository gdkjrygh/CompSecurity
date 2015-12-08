// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;


// Referenced classes of package com.a.a:
//            o

class p extends o
{

    float d;

    p(float f1)
    {
        a = f1;
        b = Float.TYPE;
    }

    p(float f1, float f2)
    {
        a = f1;
        d = f2;
        b = Float.TYPE;
        c = true;
    }

    public void a(Object obj)
    {
        if (obj != null && obj.getClass() == java/lang/Float)
        {
            d = ((Float)obj).floatValue();
            c = true;
        }
    }

    public Object b()
    {
        return Float.valueOf(d);
    }

    public Object clone()
    {
        return g();
    }

    public o e()
    {
        return g();
    }

    public float f()
    {
        return d;
    }

    public p g()
    {
        p p1 = new p(c(), d);
        p1.a(d());
        return p1;
    }
}
