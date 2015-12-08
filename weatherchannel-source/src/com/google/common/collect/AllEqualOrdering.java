// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Ordering, ImmutableList, Lists

final class AllEqualOrdering extends Ordering
    implements Serializable
{

    static final AllEqualOrdering INSTANCE = new AllEqualOrdering();
    private static final long serialVersionUID = 0L;

    AllEqualOrdering()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    public int compare(Object obj, Object obj1)
    {
        return 0;
    }

    public ImmutableList immutableSortedCopy(Iterable iterable)
    {
        return ImmutableList.copyOf(iterable);
    }

    public Ordering reverse()
    {
        return this;
    }

    public List sortedCopy(Iterable iterable)
    {
        return Lists.newArrayList(iterable);
    }

    public String toString()
    {
        return "Ordering.allEqual()";
    }

}
