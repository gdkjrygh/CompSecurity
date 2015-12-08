// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.cls.constant.CONSTANT_info;
import com.vladium.jcd.compiler.IClassFormatOutput;

// Referenced classes of package com.vladium.jcd.cls:
//            IClassDefVisitor

public interface IConstantCollection
    extends Cloneable, IClassFormatOutput
{
    public static interface IConstantComparator
    {

        public abstract boolean equals(CONSTANT_info constant_info);
    }

    public static interface IConstantIterator
    {

        public abstract CONSTANT_info nextConstant();

        public abstract int nextIndex();

        public abstract CONSTANT_info set(CONSTANT_info constant_info);
    }


    public abstract void accept(IClassDefVisitor iclassdefvisitor, Object obj);

    public abstract int add(CONSTANT_info constant_info);

    public abstract Object clone();

    public abstract int find(int i, IConstantComparator iconstantcomparator);

    public abstract int findCONSTANT_Utf8(String s);

    public abstract CONSTANT_info get(int i);

    public abstract IConstantIterator iterator();

    public abstract CONSTANT_info set(int i, CONSTANT_info constant_info);

    public abstract int size();
}
