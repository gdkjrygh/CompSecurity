// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;


// Referenced classes of package com.vladium.jcd.cls:
//            ClassDef, IAttributeCollection, IConstantCollection, IFieldCollection, 
//            IInterfaceCollection, IMethodCollection

public interface IClassDefVisitor
{

    public abstract Object visit(ClassDef classdef, Object obj);

    public abstract Object visit(IAttributeCollection iattributecollection, Object obj);

    public abstract Object visit(IConstantCollection iconstantcollection, Object obj);

    public abstract Object visit(IFieldCollection ifieldcollection, Object obj);

    public abstract Object visit(IInterfaceCollection iinterfacecollection, Object obj);

    public abstract Object visit(IMethodCollection imethodcollection, Object obj);
}
