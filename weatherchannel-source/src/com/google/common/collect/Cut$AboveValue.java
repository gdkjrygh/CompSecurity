// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            Cut, Range, DiscreteDomain, BoundType

private static final class kNotNull extends Cut
{

    private static final long serialVersionUID = 0L;

    Cut canonical(DiscreteDomain discretedomain)
    {
        discretedomain = leastValueAbove(discretedomain);
        if (discretedomain != null)
        {
            return belowValue(discretedomain);
        } else
        {
            return Cut.aboveAll();
        }
    }

    public volatile int compareTo(Object obj)
    {
        return super.compareTo((Cut)obj);
    }

    void describeAsLowerBound(StringBuilder stringbuilder)
    {
        stringbuilder.append('(').append(endpoint);
    }

    void describeAsUpperBound(StringBuilder stringbuilder)
    {
        stringbuilder.append(endpoint).append(']');
    }

    Comparable greatestValueBelow(DiscreteDomain discretedomain)
    {
        return endpoint;
    }

    public int hashCode()
    {
        return ~endpoint.hashCode();
    }

    boolean isLessThan(Comparable comparable)
    {
        return Range.compareOrThrow(endpoint, comparable) < 0;
    }

    Comparable leastValueAbove(DiscreteDomain discretedomain)
    {
        return discretedomain.next(endpoint);
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(endpoint));
        return (new StringBuilder(s.length() + 2)).append("/").append(s).append("\\").toString();
    }

    BoundType typeAsLowerBound()
    {
        return BoundType.OPEN;
    }

    BoundType typeAsUpperBound()
    {
        return BoundType.CLOSED;
    }

    Cut withLowerBoundType(BoundType boundtype, DiscreteDomain discretedomain)
    {
        Object obj = this;
        switch (p.com.google.common.collect.BoundType[boundtype.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            boundtype = discretedomain.next(endpoint);
            if (boundtype == null)
            {
                boundtype = Cut.belowAll();
            } else
            {
                boundtype = belowValue(boundtype);
            }
            obj = boundtype;
            // fall through

        case 2: // '\002'
            return ((Cut) (obj));
        }
    }

    Cut withUpperBoundType(BoundType boundtype, DiscreteDomain discretedomain)
    {
        switch (p.com.google.common.collect.BoundType[boundtype.ordinal()])
        {
        default:
            throw new AssertionError();

        case 2: // '\002'
            boundtype = discretedomain.next(endpoint);
            if (boundtype == null)
            {
                return Cut.aboveAll();
            } else
            {
                return belowValue(boundtype);
            }

        case 1: // '\001'
            return this;
        }
    }

    (Comparable comparable)
    {
        super((Comparable)Preconditions.checkNotNull(comparable));
    }
}
