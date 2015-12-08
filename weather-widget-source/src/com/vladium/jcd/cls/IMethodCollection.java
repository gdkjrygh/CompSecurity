// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.compiler.IClassFormatOutput;

// Referenced classes of package com.vladium.jcd.cls:
//            IClassDefVisitor, Method_info, ClassDef

public interface IMethodCollection
    extends Cloneable, IClassFormatOutput
{

    public abstract void accept(IClassDefVisitor iclassdefvisitor, Object obj);

    public abstract int add(Method_info method_info);

    public abstract Object clone();

    public abstract Method_info get(int i);

    public abstract int[] get(ClassDef classdef, String s);

    public abstract Method_info remove(int i);

    public abstract Method_info set(int i, Method_info method_info);

    public abstract int size();
}
