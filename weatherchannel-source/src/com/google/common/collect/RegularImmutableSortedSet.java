// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ImmutableList, Multiset, SortedIterables, 
//            Iterators, PeekingIterator, ImmutableSortedAsList, Ordering, 
//            SortedLists, UnmodifiableIterator

final class RegularImmutableSortedSet extends ImmutableSortedSet
{

    private final transient ImmutableList elements;

    RegularImmutableSortedSet(ImmutableList immutablelist, Comparator comparator)
    {
        super(comparator);
        elements = immutablelist;
        boolean flag;
        if (!immutablelist.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

    private int unsafeBinarySearch(Object obj)
        throws ClassCastException
    {
        return Collections.binarySearch(elements, obj, unsafeComparator());
    }

    public Object ceiling(Object obj)
    {
        int i = tailIndex(obj, true);
        if (i == size())
        {
            return null;
        } else
        {
            return elements.get(i);
        }
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            int i;
            try
            {
                i = unsafeBinarySearch(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (i >= 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean containsAll(Collection collection)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = collection;
        if (collection instanceof Multiset)
        {
            obj = ((Multiset)collection).elementSet();
        }
        if (SortedIterables.hasSameComparator(comparator(), ((Iterable) (obj))) && ((Collection) (obj)).size() > 1) goto _L2; else goto _L1
_L1:
        boolean flag = super.containsAll(((Collection) (obj)));
_L7:
        return flag;
_L2:
        PeekingIterator peekingiterator;
        peekingiterator = Iterators.peekingIterator(iterator());
        obj = ((Collection) (obj)).iterator();
        collection = ((Collection) (((Iterator) (obj)).next()));
_L4:
        int i;
        if (!peekingiterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        i = unsafeCompare(peekingiterator.peek(), collection);
        if (i < 0)
        {
            try
            {
                peekingiterator.next();
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        collection = ((Collection) (((Iterator) (obj)).next()));
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        if (i <= 0) goto _L4; else goto _L5
_L5:
        return false;
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    int copyIntoArray(Object aobj[], int i)
    {
        return elements.copyIntoArray(aobj, i);
    }

    ImmutableList createAsList()
    {
        return new ImmutableSortedAsList(this, elements);
    }

    ImmutableSortedSet createDescendingSet()
    {
        return new RegularImmutableSortedSet(elements.reverse(), Ordering.from(comparator).reverse());
    }

    public UnmodifiableIterator descendingIterator()
    {
        return elements.reverse().iterator();
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
        if (!(obj instanceof Set))
        {
            return false;
        }
        obj = (Set)obj;
        if (size() != ((Set) (obj)).size())
        {
            return false;
        }
        if (!SortedIterables.hasSameComparator(comparator, ((Iterable) (obj))))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj = ((Set) (obj)).iterator();
        UnmodifiableIterator unmodifiableiterator = iterator();
_L5:
        if (!unmodifiableiterator.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj1 = unmodifiableiterator.next();
        obj2 = ((Iterator) (obj)).next();
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        try
        {
            i = unsafeCompare(obj1, obj2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (i == 0) goto _L5; else goto _L4
_L4:
        return false;
        return containsAll(((Collection) (obj)));
    }

    public Object first()
    {
        return elements.get(0);
    }

    public Object floor(Object obj)
    {
        int i = headIndex(obj, true) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return elements.get(i);
        }
    }

    ImmutableSortedSet getSubSet(int i, int j)
    {
        if (i == 0 && j == size())
        {
            return this;
        }
        if (i < j)
        {
            return new RegularImmutableSortedSet(elements.subList(i, j), comparator);
        } else
        {
            return emptySet(comparator);
        }
    }

    int headIndex(Object obj, boolean flag)
    {
        ImmutableList immutablelist = elements;
        Object obj1 = Preconditions.checkNotNull(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        } else
        {
            obj = SortedLists.KeyPresentBehavior.FIRST_PRESENT;
        }
        return SortedLists.binarySearch(immutablelist, obj1, comparator, ((SortedLists.KeyPresentBehavior) (obj)), SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
    }

    ImmutableSortedSet headSetImpl(Object obj, boolean flag)
    {
        return getSubSet(0, headIndex(obj, flag));
    }

    public Object higher(Object obj)
    {
        int i = tailIndex(obj, false);
        if (i == size())
        {
            return null;
        } else
        {
            return elements.get(i);
        }
    }

    int indexOf(Object obj)
    {
        if (obj == null)
        {
            return -1;
        }
        int i;
        try
        {
            i = SortedLists.binarySearch(elements, obj, unsafeComparator(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.INVERTED_INSERTION_INDEX);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return -1;
        }
        if (i < 0)
        {
            i = -1;
        }
        return i;
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return elements.isPartialView();
    }

    public UnmodifiableIterator iterator()
    {
        return elements.iterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public Object last()
    {
        return elements.get(size() - 1);
    }

    public Object lower(Object obj)
    {
        int i = headIndex(obj, false) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return elements.get(i);
        }
    }

    public int size()
    {
        return elements.size();
    }

    ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return tailSetImpl(obj, flag).headSetImpl(obj1, flag1);
    }

    int tailIndex(Object obj, boolean flag)
    {
        ImmutableList immutablelist = elements;
        Object obj1 = Preconditions.checkNotNull(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = SortedLists.KeyPresentBehavior.FIRST_PRESENT;
        } else
        {
            obj = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        }
        return SortedLists.binarySearch(immutablelist, obj1, comparator, ((SortedLists.KeyPresentBehavior) (obj)), SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
    }

    ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
    {
        return getSubSet(tailIndex(obj, flag), size());
    }

    Comparator unsafeComparator()
    {
        return comparator;
    }
}
