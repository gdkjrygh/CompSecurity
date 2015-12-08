// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            Range

public interface RangeMap
{

    public abstract Map asMapOfRanges();

    public abstract void clear();

    public abstract boolean equals(Object obj);

    public abstract Object get(Comparable comparable);

    public abstract java.util.Map.Entry getEntry(Comparable comparable);

    public abstract int hashCode();

    public abstract void put(Range range, Object obj);

    public abstract void putAll(RangeMap rangemap);

    public abstract void remove(Range range);

    public abstract Range span();

    public abstract RangeMap subRangeMap(Range range);

    public abstract String toString();
}
