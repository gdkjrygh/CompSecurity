// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;


// Referenced classes of package com.vladium.jcd.cls:
//            IClassDefVisitor, ClassDef, IAttributeCollection, IConstantCollection, 
//            IFieldCollection, IInterfaceCollection, IMethodCollection

public abstract class AbstractClassDefVisitor
    implements IClassDefVisitor
{

    public AbstractClassDefVisitor()
    {
    }

    public Object visit(ClassDef classdef, Object obj)
    {
        visit(classdef.getConstants(), obj);
        visit(classdef.getInterfaces(), obj);
        visit(classdef.getFields(), obj);
        visit(classdef.getMethods(), obj);
        visit(classdef.getAttributes(), obj);
        return obj;
    }

    public Object visit(IAttributeCollection iattributecollection, Object obj)
    {
        return obj;
    }

    public Object visit(IConstantCollection iconstantcollection, Object obj)
    {
        return obj;
    }

    public Object visit(IFieldCollection ifieldcollection, Object obj)
    {
        return obj;
    }

    public Object visit(IInterfaceCollection iinterfacecollection, Object obj)
    {
        return obj;
    }

    public Object visit(IMethodCollection imethodcollection, Object obj)
    {
        return obj;
    }
}
