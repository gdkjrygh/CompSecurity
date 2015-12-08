// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Cut, DiscreteDomain, BoundType

private static final class n extends Cut
{

    private static final n INSTANCE = new <init>();
    private static final long serialVersionUID = 0L;

    private Object readResolve()
    {
        return INSTANCE;
    }

    Cut canonical(DiscreteDomain discretedomain)
    {
        try
        {
            discretedomain = Cut.belowValue(discretedomain.minValue());
        }
        // Misplaced declaration of an exception variable
        catch (DiscreteDomain discretedomain)
        {
            return this;
        }
        return discretedomain;
    }

    public int compareTo(Cut cut)
    {
        return cut != this ? -1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Cut)obj);
    }

    void describeAsLowerBound(StringBuilder stringbuilder)
    {
        stringbuilder.append("(-\u221E");
    }

    void describeAsUpperBound(StringBuilder stringbuilder)
    {
        throw new AssertionError();
    }

    Comparable endpoint()
    {
        throw new IllegalStateException("range unbounded on this side");
    }

    Comparable greatestValueBelow(DiscreteDomain discretedomain)
    {
        throw new AssertionError();
    }

    boolean isLessThan(Comparable comparable)
    {
        return true;
    }

    Comparable leastValueAbove(DiscreteDomain discretedomain)
    {
        return discretedomain.minValue();
    }

    public String toString()
    {
        return "-\u221E";
    }

    BoundType typeAsLowerBound()
    {
        throw new IllegalStateException();
    }

    BoundType typeAsUpperBound()
    {
        throw new AssertionError("this statement should be unreachable");
    }

    Cut withLowerBoundType(BoundType boundtype, DiscreteDomain discretedomain)
    {
        throw new IllegalStateException();
    }

    Cut withUpperBoundType(BoundType boundtype, DiscreteDomain discretedomain)
    {
        throw new AssertionError("this statement should be unreachable");
    }



    private n()
    {
        super(null);
    }
}
