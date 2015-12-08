// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ImmutableRangeSet, Ordering, BoundType, 
//            Range, ImmutableList, ContiguousSet, DiscreteDomain, 
//            UnmodifiableIterator, AbstractIterator, Iterators

private final class domain extends ImmutableSortedSet
{

    private final DiscreteDomain domain;
    private transient Integer size;
    final ImmutableRangeSet this$0;

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            obj = (Comparable)obj;
            flag = ImmutableRangeSet.this.contains(((Comparable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public UnmodifiableIterator descendingIterator()
    {
        return new AbstractIterator() {

            Iterator elemItr;
            final Iterator rangeItr;
            final ImmutableRangeSet.AsSet this$1;

            protected Comparable computeNext()
            {
                while (!elemItr.hasNext()) 
                {
                    if (rangeItr.hasNext())
                    {
                        elemItr = ContiguousSet.create((Range)rangeItr.next(), domain).descendingIterator();
                    } else
                    {
                        return (Comparable)endOfData();
                    }
                }
                return (Comparable)elemItr.next();
            }

            protected volatile Object computeNext()
            {
                return computeNext();
            }

            
            {
                this$1 = ImmutableRangeSet.AsSet.this;
                super();
                rangeItr = ImmutableRangeSet.access$000(this$0).reverse().iterator();
                elemItr = Iterators.emptyIterator();
            }
        };
    }

    public volatile Iterator descendingIterator()
    {
        return descendingIterator();
    }

    ImmutableSortedSet headSetImpl(Comparable comparable, boolean flag)
    {
        return subSet(Range.upTo(comparable, BoundType.forBoolean(flag)));
    }

    volatile ImmutableSortedSet headSetImpl(Object obj, boolean flag)
    {
        return headSetImpl((Comparable)obj, flag);
    }

    int indexOf(Object obj)
    {
        if (contains(obj))
        {
            obj = (Comparable)obj;
            long l = 0L;
            for (Iterator iterator1 = ImmutableRangeSet.access$000(ImmutableRangeSet.this).iterator(); iterator1.hasNext();)
            {
                Range range = (Range)iterator1.next();
                if (range.contains(((Comparable) (obj))))
                {
                    return Ints.saturatedCast((long)ContiguousSet.create(range, domain).indexOf(obj) + l);
                }
                l += ContiguousSet.create(range, domain).size();
            }

            throw new AssertionError("impossible");
        } else
        {
            return -1;
        }
    }

    boolean isPartialView()
    {
        return ImmutableRangeSet.access$000(ImmutableRangeSet.this).isPartialView();
    }

    public UnmodifiableIterator iterator()
    {
        return new AbstractIterator() {

            Iterator elemItr;
            final Iterator rangeItr;
            final ImmutableRangeSet.AsSet this$1;

            protected Comparable computeNext()
            {
                while (!elemItr.hasNext()) 
                {
                    if (rangeItr.hasNext())
                    {
                        elemItr = ContiguousSet.create((Range)rangeItr.next(), domain).iterator();
                    } else
                    {
                        return (Comparable)endOfData();
                    }
                }
                return (Comparable)elemItr.next();
            }

            protected volatile Object computeNext()
            {
                return computeNext();
            }

            
            {
                this$1 = ImmutableRangeSet.AsSet.this;
                super();
                rangeItr = ImmutableRangeSet.access$000(this$0).iterator();
                elemItr = Iterators.emptyIterator();
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        Integer integer = size;
        Object obj = integer;
        if (integer == null)
        {
            long l = 0L;
            obj = ImmutableRangeSet.access$000(ImmutableRangeSet.this).iterator();
            long l1;
            do
            {
                l1 = l;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                l1 = l + (long)ContiguousSet.create((Range)((Iterator) (obj)).next(), domain).size();
                l = l1;
            } while (l1 < 0x7fffffffL);
            obj = Integer.valueOf(Ints.saturatedCast(l1));
            size = ((Integer) (obj));
        }
        return ((Integer) (obj)).intValue();
    }

    ImmutableSortedSet subSet(Range range)
    {
        return subRangeSet(range).asSet(domain);
    }

    ImmutableSortedSet subSetImpl(Comparable comparable, boolean flag, Comparable comparable1, boolean flag1)
    {
        if (!flag && !flag1 && Range.compareOrThrow(comparable, comparable1) == 0)
        {
            return ImmutableSortedSet.of();
        } else
        {
            return subSet(Range.range(comparable, BoundType.forBoolean(flag), comparable1, BoundType.forBoolean(flag1)));
        }
    }

    volatile ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return subSetImpl((Comparable)obj, flag, (Comparable)obj1, flag1);
    }

    ImmutableSortedSet tailSetImpl(Comparable comparable, boolean flag)
    {
        return subSet(Range.downTo(comparable, BoundType.forBoolean(flag)));
    }

    volatile ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
    {
        return tailSetImpl((Comparable)obj, flag);
    }

    public String toString()
    {
        return ImmutableRangeSet.access$000(ImmutableRangeSet.this).toString();
    }

    Object writeReplace()
    {
        return new erializedForm(ImmutableRangeSet.access$000(ImmutableRangeSet.this), domain);
    }


    _cls2.elemItr(DiscreteDomain discretedomain)
    {
        this$0 = ImmutableRangeSet.this;
        super(Ordering.natural());
        domain = discretedomain;
    }
}
