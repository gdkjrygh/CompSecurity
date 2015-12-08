// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.compiler.IClassFormatOutput;

// Referenced classes of package com.vladium.jcd.cls:
//            IClassDefVisitor

public interface IInterfaceCollection
    extends Cloneable, IClassFormatOutput
{

    public abstract void accept(IClassDefVisitor iclassdefvisitor, Object obj);

    public abstract int add(int i);

    public abstract Object clone();

    public abstract int get(int i);

    public abstract int set(int i, int j);

    public abstract int size();
}
