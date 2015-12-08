// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, TreeRangeMap, Range, Cut

private static final class value extends AbstractMapEntry
{

    private final Range range;
    private final Object value;

    public boolean contains(Comparable comparable)
    {
        return range.contains(comparable);
    }

    public Range getKey()
    {
        return range;
    }

    public volatile Object getKey()
    {
        return getKey();
    }

    Cut getLowerBound()
    {
        return range.lowerBound;
    }

    Cut getUpperBound()
    {
        return range.upperBound;
    }

    public Object getValue()
    {
        return value;
    }

    (Cut cut, Cut cut1, Object obj)
    {
        this(Range.create(cut, cut1), obj);
    }

    <init>(Range range1, Object obj)
    {
        range = range1;
        value = obj;
    }
}
