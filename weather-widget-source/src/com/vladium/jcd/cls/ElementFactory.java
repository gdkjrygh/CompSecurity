// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;


// Referenced classes of package com.vladium.jcd.cls:
//            AttributeCollection, ConstantCollection, FieldCollection, InterfaceCollection, 
//            MethodCollection, IAttributeCollection, IConstantCollection, IFieldCollection, 
//            IInterfaceCollection, IMethodCollection

public abstract class ElementFactory
{

    public ElementFactory()
    {
    }

    public static IAttributeCollection newAttributeCollection(int i)
    {
        return new AttributeCollection(i);
    }

    public static IConstantCollection newConstantCollection(int i)
    {
        return new ConstantCollection(i);
    }

    public static IFieldCollection newFieldCollection(int i)
    {
        return new FieldCollection(i);
    }

    public static IInterfaceCollection newInterfaceCollection(int i)
    {
        return new InterfaceCollection(i);
    }

    public static IMethodCollection newMethodCollection(int i)
    {
        return new MethodCollection(i);
    }
}
