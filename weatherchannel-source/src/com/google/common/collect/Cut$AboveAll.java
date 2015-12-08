// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


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

    public int compareTo(Cut cut)
    {
        return cut != this ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Cut)obj);
    }

    void describeAsLowerBound(StringBuilder stringbuilder)
    {
        throw new AssertionError();
    }

    void describeAsUpperBound(StringBuilder stringbuilder)
    {
        stringbuilder.append("+\u221E)");
    }

    Comparable endpoint()
    {
        throw new IllegalStateException("range unbounded on this side");
    }

    Comparable greatestValueBelow(DiscreteDomain discretedomain)
    {
        return discretedomain.maxValue();
    }

    boolean isLessThan(Comparable comparable)
    {
        return false;
    }

    Comparable leastValueAbove(DiscreteDomain discretedomain)
    {
        throw new AssertionError();
    }

    public String toString()
    {
        return "+\u221E";
    }

    BoundType typeAsLowerBound()
    {
        throw new AssertionError("this statement should be unreachable");
    }

    BoundType typeAsUpperBound()
    {
        throw new IllegalStateException();
    }

    Cut withLowerBoundType(BoundType boundtype, DiscreteDomain discretedomain)
    {
        throw new AssertionError("this statement should be unreachable");
    }

    Cut withUpperBoundType(BoundType boundtype, DiscreteDomain discretedomain)
    {
        throw new IllegalStateException();
    }



    private n()
    {
        super(null);
    }
}
