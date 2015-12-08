// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.cls.attribute.Attribute_info;
import com.vladium.jcd.cls.attribute.InnerClassesAttribute_info;
import com.vladium.jcd.compiler.IClassFormatOutput;

// Referenced classes of package com.vladium.jcd.cls:
//            IClassDefVisitor

public interface IAttributeCollection
    extends Cloneable, IClassFormatOutput
{

    public abstract void accept(IClassDefVisitor iclassdefvisitor, Object obj);

    public abstract int add(Attribute_info attribute_info);

    public abstract Object clone();

    public abstract Attribute_info get(int i);

    public abstract InnerClassesAttribute_info getInnerClassesAttribute();

    public abstract boolean hasBridge();

    public abstract boolean hasSynthetic();

    public abstract long length();

    public abstract Attribute_info remove(int i);

    public abstract Attribute_info set(int i, Attribute_info attribute_info);

    public abstract int size();
}
