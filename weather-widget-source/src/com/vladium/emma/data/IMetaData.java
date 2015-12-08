// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import java.util.Iterator;

// Referenced classes of package com.vladium.emma.data:
//            IMergeable, ClassDescriptor, CoverageOptions

public interface IMetaData
    extends IMergeable
{

    public abstract boolean add(ClassDescriptor classdescriptor, boolean flag);

    public abstract CoverageOptions getOptions();

    public abstract boolean hasDescriptor(String s);

    public abstract boolean hasLineNumberData();

    public abstract boolean hasSrcFileData();

    public abstract Iterator iterator();

    public abstract Object lock();

    public abstract IMetaData shallowCopy();

    public abstract int size();
}
