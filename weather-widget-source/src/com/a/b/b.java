// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.b;


// Referenced classes of package com.a.b:
//            c

public abstract class b extends c
{

    public b(String s)
    {
        super(java/lang/Integer, s);
    }

    public abstract void a(Object obj, int i);

    public final void a(Object obj, Integer integer)
    {
        a(obj, Integer.valueOf(integer.intValue()));
    }

    public volatile void a(Object obj, Object obj1)
    {
        a(obj, (Integer)obj1);
    }
}
