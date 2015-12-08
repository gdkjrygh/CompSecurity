// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            SortedMultisetBridge, SortedIterable, BoundType

public interface SortedMultiset
    extends SortedMultisetBridge, SortedIterable
{

    public abstract Comparator comparator();

    public abstract SortedMultiset descendingMultiset();

    public abstract NavigableSet elementSet();

    public abstract Set entrySet();

    public abstract Multiset.Entry firstEntry();

    public abstract SortedMultiset headMultiset(Object obj, BoundType boundtype);

    public abstract Iterator iterator();

    public abstract Multiset.Entry lastEntry();

    public abstract Multiset.Entry pollFirstEntry();

    public abstract Multiset.Entry pollLastEntry();

    public abstract SortedMultiset subMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1);

    public abstract SortedMultiset tailMultiset(Object obj, BoundType boundtype);
}
