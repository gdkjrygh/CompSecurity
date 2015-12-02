// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;

public final class duq
{

    private final Object a[];
    private int b;

    public duq(Class class1)
    {
        this(class1, (byte)0);
    }

    private duq(Class class1, byte byte0)
    {
        a = (Object[])(Object[])Array.newInstance(class1, 3);
        byte0 = 0;
_L2:
        if (byte0 >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        a[byte0] = class1.newInstance();
        byte0++;
        if (true) goto _L2; else goto _L1
        class1;
_L4:
        throw new RuntimeException("Failed to instantiate event", class1);
_L1:
        return;
        class1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Object a()
    {
        Object aobj[] = a;
        int i = b;
        b = i + 1;
        Object obj = aobj[i];
        if (b >= a.length)
        {
            b = 0;
        }
        return obj;
    }
}
