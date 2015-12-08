// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Range

public interface RangeSet
{

    public abstract void add(Range range);

    public abstract void addAll(RangeSet rangeset);

    public abstract Set asRanges();

    public abstract void clear();

    public abstract RangeSet complement();

    public abstract boolean contains(Comparable comparable);

    public abstract boolean encloses(Range range);

    public abstract boolean enclosesAll(RangeSet rangeset);

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract boolean isEmpty();

    public abstract Range rangeContaining(Comparable comparable);

    public abstract void remove(Range range);

    public abstract void removeAll(RangeSet rangeset);

    public abstract Range span();

    public abstract RangeSet subRangeSet(Range range);

    public abstract String toString();
}
