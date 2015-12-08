// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import java.io.Serializable;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Range, DiscreteDomain, BoundType

abstract class Cut
    implements Comparable, Serializable
{
    private static final class AboveAll extends Cut
    {

        private static final AboveAll INSTANCE = new AboveAll();
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



        private AboveAll()
        {
            super(null);
        }
    }

    private static final class AboveValue extends Cut
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
            return compareTo((Cut)obj);
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
            static class _cls1
            {

                static final int $SwitchMap$com$google$common$collect$BoundType[];

                static 
                {
                    $SwitchMap$com$google$common$collect$BoundType = new int[BoundType.values().length];
                    try
                    {
                        $SwitchMap$com$google$common$collect$BoundType[BoundType.CLOSED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$google$common$collect$BoundType[BoundType.OPEN.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.google.common.collect.BoundType[boundtype.ordinal()])
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
            switch (_cls1..SwitchMap.com.google.common.collect.BoundType[boundtype.ordinal()])
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

        AboveValue(Comparable comparable)
        {
            super((Comparable)Preconditions.checkNotNull(comparable));
        }
    }

    private static final class BelowAll extends Cut
    {

        private static final BelowAll INSTANCE = new BelowAll();
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



        private BelowAll()
        {
            super(null);
        }
    }

    private static final class BelowValue extends Cut
    {

        private static final long serialVersionUID = 0L;

        public volatile int compareTo(Object obj)
        {
            return compareTo((Cut)obj);
        }

        void describeAsLowerBound(StringBuilder stringbuilder)
        {
            stringbuilder.append('[').append(endpoint);
        }

        void describeAsUpperBound(StringBuilder stringbuilder)
        {
            stringbuilder.append(endpoint).append(')');
        }

        Comparable greatestValueBelow(DiscreteDomain discretedomain)
        {
            return discretedomain.previous(endpoint);
        }

        public int hashCode()
        {
            return endpoint.hashCode();
        }

        boolean isLessThan(Comparable comparable)
        {
            return Range.compareOrThrow(endpoint, comparable) <= 0;
        }

        Comparable leastValueAbove(DiscreteDomain discretedomain)
        {
            return endpoint;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(endpoint));
            return (new StringBuilder(s.length() + 2)).append("\\").append(s).append("/").toString();
        }

        BoundType typeAsLowerBound()
        {
            return BoundType.CLOSED;
        }

        BoundType typeAsUpperBound()
        {
            return BoundType.OPEN;
        }

        Cut withLowerBoundType(BoundType boundtype, DiscreteDomain discretedomain)
        {
            Object obj = this;
            switch (_cls1..SwitchMap.com.google.common.collect.BoundType[boundtype.ordinal()])
            {
            default:
                throw new AssertionError();

            case 2: // '\002'
                boundtype = discretedomain.previous(endpoint);
                if (boundtype == null)
                {
                    boundtype = Cut.belowAll();
                } else
                {
                    boundtype = new AboveValue(boundtype);
                }
                obj = boundtype;
                // fall through

            case 1: // '\001'
                return ((Cut) (obj));
            }
        }

        Cut withUpperBoundType(BoundType boundtype, DiscreteDomain discretedomain)
        {
            switch (_cls1..SwitchMap.com.google.common.collect.BoundType[boundtype.ordinal()])
            {
            default:
                throw new AssertionError();

            case 1: // '\001'
                boundtype = discretedomain.previous(endpoint);
                if (boundtype == null)
                {
                    return Cut.aboveAll();
                } else
                {
                    return new AboveValue(boundtype);
                }

            case 2: // '\002'
                return this;
            }
        }

        BelowValue(Comparable comparable)
        {
            super((Comparable)Preconditions.checkNotNull(comparable));
        }
    }


    private static final long serialVersionUID = 0L;
    final Comparable endpoint;

    Cut(Comparable comparable)
    {
        endpoint = comparable;
    }

    static Cut aboveAll()
    {
        return AboveAll.INSTANCE;
    }

    static Cut aboveValue(Comparable comparable)
    {
        return new AboveValue(comparable);
    }

    static Cut belowAll()
    {
        return BelowAll.INSTANCE;
    }

    static Cut belowValue(Comparable comparable)
    {
        return new BelowValue(comparable);
    }

    Cut canonical(DiscreteDomain discretedomain)
    {
        return this;
    }

    public int compareTo(Cut cut)
    {
        int i;
        if (cut == belowAll())
        {
            i = 1;
        } else
        {
            if (cut == aboveAll())
            {
                return -1;
            }
            int j = Range.compareOrThrow(endpoint, cut.endpoint);
            i = j;
            if (j == 0)
            {
                return Booleans.compare(this instanceof AboveValue, cut instanceof AboveValue);
            }
        }
        return i;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Cut)obj);
    }

    abstract void describeAsLowerBound(StringBuilder stringbuilder);

    abstract void describeAsUpperBound(StringBuilder stringbuilder);

    Comparable endpoint()
    {
        return endpoint;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Cut)
        {
            obj = (Cut)obj;
            int i;
            try
            {
                i = compareTo(((Cut) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (i == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    abstract Comparable greatestValueBelow(DiscreteDomain discretedomain);

    abstract boolean isLessThan(Comparable comparable);

    abstract Comparable leastValueAbove(DiscreteDomain discretedomain);

    abstract BoundType typeAsLowerBound();

    abstract BoundType typeAsUpperBound();

    abstract Cut withLowerBoundType(BoundType boundtype, DiscreteDomain discretedomain);

    abstract Cut withUpperBoundType(BoundType boundtype, DiscreteDomain discretedomain);
}
