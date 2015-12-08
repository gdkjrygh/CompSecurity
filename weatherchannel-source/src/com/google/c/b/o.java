// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;


// Referenced classes of package com.google.c.b:
//            l, d

abstract class o extends l
{
    static final class a extends o
    {

        o a()
        {
            return null;
        }

        a(Object obj, Object obj1)
        {
            super(obj, obj1);
        }
    }


    o(o o1)
    {
        super(o1.getKey(), o1.getValue());
    }

    o(Object obj, Object obj1)
    {
        super(obj, obj1);
        d.a(obj, obj1);
    }

    abstract o a();
}
