// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ContiguousSet, Range, EmptyContiguousSet, Collections2, 
//            Cut, Sets, BoundType, DiscreteDomain, 
//            Ordering, UnmodifiableIterator, ImmutableSortedSet, AbstractSequentialIterator

final class RegularContiguousSet extends ContiguousSet
{
    private static final class SerializedForm
        implements Serializable
    {

        final DiscreteDomain domain;
        final Range range;

        private Object readResolve()
        {
            return new RegularContiguousSet(range, domain);
        }

        private SerializedForm(Range range1, DiscreteDomain discretedomain)
        {
            range = range1;
            domain = discretedomain;
        }

    }


    private static final long serialVersionUID = 0L;
    private final Range range;

    RegularContiguousSet(Range range1, DiscreteDomain discretedomain)
    {
        super(discretedomain);
        range = range1;
    }

    private static boolean equalsOrThrow(Comparable comparable, Comparable comparable1)
    {
        return comparable1 != null && Range.compareOrThrow(comparable, comparable1) == 0;
    }

    private ContiguousSet intersectionInCurrentDomain(Range range1)
    {
        if (range.isConnected(range1))
        {
            return ContiguousSet.create(range.intersection(range1), domain);
        } else
        {
            return new EmptyContiguousSet(domain);
        }
    }

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = range.contains((Comparable)obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public boolean containsAll(Collection collection)
    {
        return Collections2.containsAllImpl(this, collection);
    }

    public UnmodifiableIterator descendingIterator()
    {
        return new AbstractSequentialIterator(last()) {

            final Comparable first;
            final RegularContiguousSet this$0;

            protected Comparable computeNext(Comparable comparable)
            {
                if (RegularContiguousSet.equalsOrThrow(comparable, first))
                {
                    return null;
                } else
                {
                    return domain.previous(comparable);
                }
            }

            protected volatile Object computeNext(Object obj)
            {
                return computeNext((Comparable)obj);
            }

            
            {
                this$0 = RegularContiguousSet.this;
                super(comparable);
                first = RegularContiguousSet.this.first();
            }
        };
    }

    public volatile Iterator descendingIterator()
    {
        return descendingIterator();
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof RegularContiguousSet))
        {
            break; /* Loop/switch isn't completed */
        }
        RegularContiguousSet regularcontiguousset = (RegularContiguousSet)obj;
        if (!domain.equals(regularcontiguousset.domain))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!first().equals(regularcontiguousset.first()) || !last().equals(regularcontiguousset.last()))
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        return super.equals(obj);
    }

    public Comparable first()
    {
        return range.lowerBound.leastValueAbove(domain);
    }

    public volatile Object first()
    {
        return first();
    }

    public int hashCode()
    {
        return Sets.hashCodeImpl(this);
    }

    ContiguousSet headSetImpl(Comparable comparable, boolean flag)
    {
        return intersectionInCurrentDomain(Range.upTo(comparable, BoundType.forBoolean(flag)));
    }

    volatile ImmutableSortedSet headSetImpl(Object obj, boolean flag)
    {
        return headSetImpl((Comparable)obj, flag);
    }

    int indexOf(Object obj)
    {
        if (contains(obj))
        {
            return (int)domain.distance(first(), (Comparable)obj);
        } else
        {
            return -1;
        }
    }

    public ContiguousSet intersection(ContiguousSet contiguousset)
    {
        Preconditions.checkNotNull(contiguousset);
        Preconditions.checkArgument(domain.equals(contiguousset.domain));
        if (contiguousset.isEmpty())
        {
            return contiguousset;
        }
        Comparable comparable = (Comparable)Ordering.natural().max(first(), contiguousset.first());
        contiguousset = (Comparable)Ordering.natural().min(last(), contiguousset.last());
        if (comparable.compareTo(contiguousset) < 0)
        {
            contiguousset = ContiguousSet.create(Range.closed(comparable, contiguousset), domain);
        } else
        {
            contiguousset = new EmptyContiguousSet(domain);
        }
        return contiguousset;
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return new AbstractSequentialIterator(first()) {

            final Comparable last;
            final RegularContiguousSet this$0;

            protected Comparable computeNext(Comparable comparable)
            {
                if (RegularContiguousSet.equalsOrThrow(comparable, last))
                {
                    return null;
                } else
                {
                    return domain.next(comparable);
                }
            }

            protected volatile Object computeNext(Object obj)
            {
                return computeNext((Comparable)obj);
            }

            
            {
                this$0 = RegularContiguousSet.this;
                super(comparable);
                last = RegularContiguousSet.this.last();
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public Comparable last()
    {
        return range.upperBound.greatestValueBelow(domain);
    }

    public volatile Object last()
    {
        return last();
    }

    public Range range()
    {
        return range(BoundType.CLOSED, BoundType.CLOSED);
    }

    public Range range(BoundType boundtype, BoundType boundtype1)
    {
        return Range.create(range.lowerBound.withLowerBoundType(boundtype, domain), range.upperBound.withUpperBoundType(boundtype1, domain));
    }

    public int size()
    {
        long l = domain.distance(first(), last());
        if (l >= 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)l + 1;
        }
    }

    ContiguousSet subSetImpl(Comparable comparable, boolean flag, Comparable comparable1, boolean flag1)
    {
        if (comparable.compareTo(comparable1) == 0 && !flag && !flag1)
        {
            return new EmptyContiguousSet(domain);
        } else
        {
            return intersectionInCurrentDomain(Range.range(comparable, BoundType.forBoolean(flag), comparable1, BoundType.forBoolean(flag1)));
        }
    }

    volatile ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return subSetImpl((Comparable)obj, flag, (Comparable)obj1, flag1);
    }

    ContiguousSet tailSetImpl(Comparable comparable, boolean flag)
    {
        return intersectionInCurrentDomain(Range.downTo(comparable, BoundType.forBoolean(flag)));
    }

    volatile ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
    {
        return tailSetImpl((Comparable)obj, flag);
    }

    Object writeReplace()
    {
        return new SerializedForm(range, domain);
    }

}
