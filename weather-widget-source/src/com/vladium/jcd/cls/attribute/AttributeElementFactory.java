// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;


// Referenced classes of package com.vladium.jcd.cls.attribute:
//            ExceptionHandlerTable, IExceptionHandlerTable

public abstract class AttributeElementFactory
{

    private AttributeElementFactory()
    {
    }

    public static IExceptionHandlerTable newExceptionHandlerTable(int i)
    {
        return new ExceptionHandlerTable(i);
    }
}
