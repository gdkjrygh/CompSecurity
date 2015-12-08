// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;


// Referenced classes of package com.a.a:
//            am

public class k
    implements am
{

    public k()
    {
    }

    public Float a(float f, Number number, Number number1)
    {
        float f1 = number.floatValue();
        return Float.valueOf(f1 + (number1.floatValue() - f1) * f);
    }

    public volatile Object a(float f, Object obj, Object obj1)
    {
        return a(f, (Number)obj, (Number)obj1);
    }
}
