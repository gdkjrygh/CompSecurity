// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.a;


// Referenced classes of package org.a.c.a:
//            d

class f
{

    public final d a;
    public final double b;

    private f(d d1, double d2)
    {
        a = d1;
        b = d2;
    }

    public static final f a(d d1, double d2)
    {
        return new f(d1, Math.abs(d1.doubleValue() - d2));
    }

    public String toString()
    {
        return a.toString();
    }
}
