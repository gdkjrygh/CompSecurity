// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            Ordering, CollectPreconditions

public final class MinMaxPriorityQueue extends AbstractQueue
{
    public static final class Builder
    {

        private static final int UNSET_EXPECTED_SIZE = -1;
        private final Comparator comparator;
        private int expectedSize;
        private int maximumSize;

        private Ordering ordering()
        {
            return Ordering.from(comparator);
        }

        public MinMaxPriorityQueue create()
        {
            return create(((Iterable) (Collections.emptySet())));
        }

        public MinMaxPriorityQueue create(Iterable iterable)
        {
            MinMaxPriorityQueue minmaxpriorityqueue = new MinMaxPriorityQueue(this, MinMaxPriorityQueue.initialQueueSize(expectedSize, maximumSize, iterable));
            for (iterable = iterable.iterator(); iterable.hasNext(); minmaxpriorityqueue.offer(iterable.next())) { }
            return minmaxpriorityqueue;
        }

        public Builder expectedSize(int i)
        {
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            expectedSize = i;
            return this;
        }

        public Builder maximumSize(int i)
        {
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            maximumSize = i;
            return this;
        }



        private Builder(Comparator comparator1)
        {
            expectedSize = -1;
            maximumSize = 0x7fffffff;
            comparator = (Comparator)Preconditions.checkNotNull(comparator1);
        }

    }

    private class Heap
    {

        final Ordering ordering;
        Heap otherHeap;
        final MinMaxPriorityQueue this$0;

        private int getGrandparentIndex(int i)
        {
            return getParentIndex(getParentIndex(i));
        }

        private int getLeftChildIndex(int i)
        {
            return i * 2 + 1;
        }

        private int getParentIndex(int i)
        {
            return (i - 1) / 2;
        }

        private int getRightChildIndex(int i)
        {
            return i * 2 + 2;
        }

        private boolean verifyIndex(int i)
        {
            while (getLeftChildIndex(i) < size && compareElements(i, getLeftChildIndex(i)) > 0 || getRightChildIndex(i) < size && compareElements(i, getRightChildIndex(i)) > 0 || i > 0 && compareElements(i, getParentIndex(i)) > 0 || i > 2 && compareElements(getGrandparentIndex(i), i) > 0) 
            {
                return false;
            }
            return true;
        }

        void bubbleUp(int i, Object obj)
        {
            int j = crossOverUp(i, obj);
            Heap heap;
            if (j == i)
            {
                heap = this;
            } else
            {
                i = j;
                heap = otherHeap;
            }
            heap.bubbleUpAlternatingLevels(i, obj);
        }

        int bubbleUpAlternatingLevels(int i, Object obj)
        {
            do
            {
                Object obj1;
                int j;
label0:
                {
                    if (i > 2)
                    {
                        j = getGrandparentIndex(i);
                        obj1 = elementData(j);
                        if (ordering.compare(obj1, obj) > 0)
                        {
                            break label0;
                        }
                    }
                    queue[i] = obj;
                    return i;
                }
                queue[i] = obj1;
                i = j;
            } while (true);
        }

        int compareElements(int i, int j)
        {
            return ordering.compare(elementData(i), elementData(j));
        }

        int crossOver(int i, Object obj)
        {
            int j = findMinChild(i);
            if (j > 0 && ordering.compare(elementData(j), obj) < 0)
            {
                queue[i] = elementData(j);
                queue[j] = obj;
                return j;
            } else
            {
                return crossOverUp(i, obj);
            }
        }

        int crossOverUp(int i, Object obj)
        {
            if (i == 0)
            {
                queue[0] = obj;
                return 0;
            }
            int k = getParentIndex(i);
            Object obj2 = elementData(k);
            Object obj1 = obj2;
            int j = k;
            if (k != 0)
            {
                int l = getRightChildIndex(getParentIndex(k));
                obj1 = obj2;
                j = k;
                if (l != k)
                {
                    obj1 = obj2;
                    j = k;
                    if (getLeftChildIndex(l) >= size)
                    {
                        Object obj3 = elementData(l);
                        obj1 = obj2;
                        j = k;
                        if (ordering.compare(obj3, obj2) < 0)
                        {
                            j = l;
                            obj1 = obj3;
                        }
                    }
                }
            }
            if (ordering.compare(obj1, obj) < 0)
            {
                queue[i] = obj1;
                queue[j] = obj;
                return j;
            } else
            {
                queue[i] = obj;
                return i;
            }
        }

        int fillHoleAt(int i)
        {
            do
            {
                int j = findMinGrandChild(i);
                if (j > 0)
                {
                    queue[i] = elementData(j);
                    i = j;
                } else
                {
                    return i;
                }
            } while (true);
        }

        int findMin(int i, int j)
        {
            if (i < size) goto _L2; else goto _L1
_L1:
            int l = -1;
_L4:
            return l;
_L2:
            int k;
            int i1;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            i1 = Math.min(i, size - j);
            k = i;
            i++;
            l = k;
            if (i < i1 + j)
            {
                l = k;
                if (compareElements(i, k) < 0)
                {
                    l = i;
                }
                i++;
                k = l;
                break MISSING_BLOCK_LABEL_50;
            }
            continue; /* Loop/switch isn't completed */
            if (true) goto _L4; else goto _L3
_L3:
        }

        int findMinChild(int i)
        {
            return findMin(getLeftChildIndex(i), 2);
        }

        int findMinGrandChild(int i)
        {
            i = getLeftChildIndex(i);
            if (i < 0)
            {
                return -1;
            } else
            {
                return findMin(getLeftChildIndex(i), 4);
            }
        }

        int getCorrectLastElement(Object obj)
        {
            int i = getParentIndex(size);
            if (i != 0)
            {
                int j = getRightChildIndex(getParentIndex(i));
                if (j != i && getLeftChildIndex(j) >= size)
                {
                    Object obj1 = elementData(j);
                    if (ordering.compare(obj1, obj) < 0)
                    {
                        queue[j] = obj;
                        queue[size] = obj1;
                        return j;
                    }
                }
            }
            return size;
        }

        MoveDesc tryCrossOverAndBubbleUp(int i, int j, Object obj)
        {
            int k = crossOver(j, obj);
            if (k != j)
            {
                Object obj1;
                if (k < i)
                {
                    obj1 = elementData(i);
                } else
                {
                    obj1 = elementData(getParentIndex(i));
                }
                if (otherHeap.bubbleUpAlternatingLevels(k, obj) < i)
                {
                    return new MoveDesc(obj, obj1);
                }
            }
            return null;
        }


        Heap(Ordering ordering1)
        {
            this$0 = MinMaxPriorityQueue.this;
            super();
            ordering = ordering1;
        }
    }

    static class MoveDesc
    {

        final Object replaced;
        final Object toTrickle;

        MoveDesc(Object obj, Object obj1)
        {
            toTrickle = obj;
            replaced = obj1;
        }
    }

    private class QueueIterator
        implements Iterator
    {

        private boolean canRemove;
        private int cursor;
        private int expectedModCount;
        private Queue forgetMeNot;
        private Object lastFromForgetMeNot;
        private List skipMe;
        final MinMaxPriorityQueue this$0;

        private boolean containsExact(Iterable iterable, Object obj)
        {
            for (iterable = iterable.iterator(); iterable.hasNext();)
            {
                if (iterable.next() == obj)
                {
                    return true;
                }
            }

            return false;
        }

        private int nextNotInSkipMe(int i)
        {
            int j = i;
            if (skipMe != null)
            {
                do
                {
                    j = i;
                    if (i >= size())
                    {
                        break;
                    }
                    j = i;
                    if (!containsExact(skipMe, elementData(i)))
                    {
                        break;
                    }
                    i++;
                } while (true);
            }
            return j;
        }

        void checkModCount()
        {
            if (modCount != expectedModCount)
            {
                throw new ConcurrentModificationException();
            } else
            {
                return;
            }
        }

        public boolean hasNext()
        {
            checkModCount();
            return nextNotInSkipMe(cursor + 1) < size() || forgetMeNot != null && !forgetMeNot.isEmpty();
        }

        public Object next()
        {
            checkModCount();
            int i = nextNotInSkipMe(cursor + 1);
            if (i < size())
            {
                cursor = i;
                canRemove = true;
                return elementData(cursor);
            }
            if (forgetMeNot != null)
            {
                cursor = size();
                lastFromForgetMeNot = forgetMeNot.poll();
                if (lastFromForgetMeNot != null)
                {
                    canRemove = true;
                    return lastFromForgetMeNot;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        public void remove()
        {
            CollectPreconditions.checkRemove(canRemove);
            checkModCount();
            canRemove = false;
            expectedModCount = expectedModCount + 1;
            if (cursor < size())
            {
                MoveDesc movedesc = removeAt(cursor);
                if (movedesc != null)
                {
                    if (forgetMeNot == null)
                    {
                        forgetMeNot = new ArrayDeque();
                        skipMe = new ArrayList(3);
                    }
                    forgetMeNot.add(movedesc.toTrickle);
                    skipMe.add(movedesc.replaced);
                }
                cursor = cursor - 1;
                return;
            } else
            {
                Preconditions.checkState(removeExact(lastFromForgetMeNot));
                lastFromForgetMeNot = null;
                return;
            }
        }

        boolean removeExact(Object obj)
        {
            for (int i = 0; i < size; i++)
            {
                if (queue[i] == obj)
                {
                    removeAt(i);
                    return true;
                }
            }

            return false;
        }

        private QueueIterator()
        {
            this$0 = MinMaxPriorityQueue.this;
            super();
            cursor = -1;
            expectedModCount = modCount;
        }

    }


    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 0x55555555;
    private static final int ODD_POWERS_OF_TWO = 0xaaaaaaaa;
    private final Heap maxHeap;
    final int maximumSize;
    private final Heap minHeap;
    private int modCount;
    private Object queue[];
    private int size;

    private MinMaxPriorityQueue(Builder builder, int i)
    {
        Ordering ordering = builder.ordering();
        minHeap = new Heap(ordering);
        maxHeap = new Heap(ordering.reverse());
        minHeap.otherHeap = maxHeap;
        maxHeap.otherHeap = minHeap;
        maximumSize = builder.maximumSize;
        queue = new Object[i];
    }


    private int calculateNewCapacity()
    {
        int i = queue.length;
        if (i < 64)
        {
            i = (i + 1) * 2;
        } else
        {
            i = IntMath.checkedMultiply(i / 2, 3);
        }
        return capAtMaximumSize(i, maximumSize);
    }

    private static int capAtMaximumSize(int i, int j)
    {
        return Math.min(i - 1, j) + 1;
    }

    public static MinMaxPriorityQueue create()
    {
        return (new Builder(Ordering.natural())).create();
    }

    public static MinMaxPriorityQueue create(Iterable iterable)
    {
        return (new Builder(Ordering.natural())).create(iterable);
    }

    public static Builder expectedSize(int i)
    {
        return (new Builder(Ordering.natural())).expectedSize(i);
    }

    private MoveDesc fillHole(int i, Object obj)
    {
        Heap heap = heapForIndex(i);
        int j = heap.fillHoleAt(i);
        int k = heap.bubbleUpAlternatingLevels(j, obj);
        if (k == j)
        {
            return heap.tryCrossOverAndBubbleUp(i, j, obj);
        }
        if (k < i)
        {
            return new MoveDesc(obj, elementData(i));
        } else
        {
            return null;
        }
    }

    private int getMaxElementIndex()
    {
        switch (size)
        {
        default:
            if (maxHeap.compareElements(1, 2) > 0)
            {
                break;
            }
            // fall through

        case 2: // '\002'
            return 1;

        case 1: // '\001'
            return 0;
        }
        return 2;
    }

    private void growIfNeeded()
    {
        if (size > queue.length)
        {
            Object aobj[] = new Object[calculateNewCapacity()];
            System.arraycopy(((Object) (queue)), 0, ((Object) (aobj)), 0, queue.length);
            queue = aobj;
        }
    }

    private Heap heapForIndex(int i)
    {
        if (isEvenLevel(i))
        {
            return minHeap;
        } else
        {
            return maxHeap;
        }
    }

    static int initialQueueSize(int i, int j, Iterable iterable)
    {
        if (i == -1)
        {
            i = 11;
        }
        int k = i;
        if (iterable instanceof Collection)
        {
            k = Math.max(i, ((Collection)iterable).size());
        }
        return capAtMaximumSize(k, j);
    }

    static boolean isEvenLevel(int i)
    {
        i++;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "negative index");
        return (0x55555555 & i) > (0xaaaaaaaa & i);
    }

    public static Builder maximumSize(int i)
    {
        return (new Builder(Ordering.natural())).maximumSize(i);
    }

    public static Builder orderedBy(Comparator comparator1)
    {
        return new Builder(comparator1);
    }

    private Object removeAndGet(int i)
    {
        Object obj = elementData(i);
        removeAt(i);
        return obj;
    }

    public boolean add(Object obj)
    {
        offer(obj);
        return true;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag = false;
        for (collection = collection.iterator(); collection.hasNext();)
        {
            offer(collection.next());
            flag = true;
        }

        return flag;
    }

    int capacity()
    {
        return queue.length;
    }

    public void clear()
    {
        for (int i = 0; i < size; i++)
        {
            queue[i] = null;
        }

        size = 0;
    }

    public Comparator comparator()
    {
        return minHeap.ordering;
    }

    Object elementData(int i)
    {
        return queue[i];
    }

    boolean isIntact()
    {
        for (int i = 1; i < size; i++)
        {
            if (!heapForIndex(i).verifyIndex(i))
            {
                return false;
            }
        }

        return true;
    }

    public Iterator iterator()
    {
        return new QueueIterator();
    }

    public boolean offer(Object obj)
    {
        Preconditions.checkNotNull(obj);
        modCount = modCount + 1;
        int i = size;
        size = i + 1;
        growIfNeeded();
        heapForIndex(i).bubbleUp(i, obj);
        return size <= maximumSize || pollLast() != obj;
    }

    public Object peek()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return elementData(0);
        }
    }

    public Object peekFirst()
    {
        return peek();
    }

    public Object peekLast()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return elementData(getMaxElementIndex());
        }
    }

    public Object poll()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return removeAndGet(0);
        }
    }

    public Object pollFirst()
    {
        return poll();
    }

    public Object pollLast()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return removeAndGet(getMaxElementIndex());
        }
    }

    MoveDesc removeAt(int i)
    {
        MoveDesc movedesc = null;
        Preconditions.checkPositionIndex(i, size);
        modCount = modCount + 1;
        size = size - 1;
        if (size == i)
        {
            queue[size] = null;
        } else
        {
            Object obj = elementData(size);
            int j = heapForIndex(size).getCorrectLastElement(obj);
            Object obj1 = elementData(size);
            queue[size] = null;
            MoveDesc movedesc1 = fillHole(i, obj1);
            movedesc = movedesc1;
            if (j < i)
            {
                if (movedesc1 == null)
                {
                    return new MoveDesc(obj, obj1);
                } else
                {
                    return new MoveDesc(obj, movedesc1.replaced);
                }
            }
        }
        return movedesc;
    }

    public Object removeFirst()
    {
        return remove();
    }

    public Object removeLast()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            return removeAndGet(getMaxElementIndex());
        }
    }

    public int size()
    {
        return size;
    }

    public Object[] toArray()
    {
        Object aobj[] = new Object[size];
        System.arraycopy(((Object) (queue)), 0, ((Object) (aobj)), 0, size);
        return aobj;
    }



}
