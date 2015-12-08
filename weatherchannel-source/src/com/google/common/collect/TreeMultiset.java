// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractSortedMultiset, GeneralRange, BoundType, Ordering, 
//            Iterables, Serialization, CollectPreconditions, SortedMultiset, 
//            Multisets

public final class TreeMultiset extends AbstractSortedMultiset
    implements Serializable
{
    private static abstract class Aggregate extends Enum
    {

        private static final Aggregate $VALUES[];
        public static final Aggregate DISTINCT;
        public static final Aggregate SIZE;

        public static Aggregate valueOf(String s)
        {
            return (Aggregate)Enum.valueOf(com/google/common/collect/TreeMultiset$Aggregate, s);
        }

        public static Aggregate[] values()
        {
            return (Aggregate[])$VALUES.clone();
        }

        abstract int nodeAggregate(AvlNode avlnode);

        abstract long treeAggregate(AvlNode avlnode);

        static 
        {
            SIZE = new Aggregate("SIZE", 0) {

                int nodeAggregate(AvlNode avlnode)
                {
                    return avlnode.elemCount;
                }

                long treeAggregate(AvlNode avlnode)
                {
                    if (avlnode == null)
                    {
                        return 0L;
                    } else
                    {
                        return avlnode.totalCount;
                    }
                }

            };
            DISTINCT = new Aggregate("DISTINCT", 1) {

                int nodeAggregate(AvlNode avlnode)
                {
                    return 1;
                }

                long treeAggregate(AvlNode avlnode)
                {
                    if (avlnode == null)
                    {
                        return 0L;
                    } else
                    {
                        return (long)avlnode.distinctElements;
                    }
                }

            };
            $VALUES = (new Aggregate[] {
                SIZE, DISTINCT
            });
        }

        private Aggregate(String s, int i)
        {
            super(s, i);
        }

    }

    private static final class AvlNode extends Multisets.AbstractEntry
    {

        private int distinctElements;
        private final Object elem;
        private int elemCount;
        private int height;
        private AvlNode left;
        private AvlNode pred;
        private AvlNode right;
        private AvlNode succ;
        private long totalCount;

        private AvlNode addLeftChild(Object obj, int i)
        {
            left = new AvlNode(obj, i);
            TreeMultiset.successor(pred, left, this);
            height = Math.max(2, height);
            distinctElements = distinctElements + 1;
            totalCount = totalCount + (long)i;
            return this;
        }

        private AvlNode addRightChild(Object obj, int i)
        {
            right = new AvlNode(obj, i);
            TreeMultiset.successor(this, right, succ);
            height = Math.max(2, height);
            distinctElements = distinctElements + 1;
            totalCount = totalCount + (long)i;
            return this;
        }

        private int balanceFactor()
        {
            return height(left) - height(right);
        }

        private AvlNode ceiling(Comparator comparator1, Object obj)
        {
            int i = comparator1.compare(obj, elem);
            if (i >= 0) goto _L2; else goto _L1
_L1:
            if (left != null) goto _L4; else goto _L3
_L3:
            return this;
_L4:
            return (AvlNode)MoreObjects.firstNonNull(left.ceiling(comparator1, obj), this);
_L2:
            if (i != 0)
            {
                if (right == null)
                {
                    comparator1 = null;
                } else
                {
                    comparator1 = right.ceiling(comparator1, obj);
                }
                return comparator1;
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        private AvlNode deleteMe()
        {
            int i = elemCount;
            elemCount = 0;
            TreeMultiset.successor(pred, succ);
            if (left == null)
            {
                return right;
            }
            if (right == null)
            {
                return left;
            }
            if (left.height >= right.height)
            {
                AvlNode avlnode = pred;
                avlnode.left = left.removeMax(avlnode);
                avlnode.right = right;
                avlnode.distinctElements = distinctElements - 1;
                avlnode.totalCount = totalCount - (long)i;
                return avlnode.rebalance();
            } else
            {
                AvlNode avlnode1 = succ;
                avlnode1.right = right.removeMin(avlnode1);
                avlnode1.left = left;
                avlnode1.distinctElements = distinctElements - 1;
                avlnode1.totalCount = totalCount - (long)i;
                return avlnode1.rebalance();
            }
        }

        private AvlNode floor(Comparator comparator1, Object obj)
        {
            int i = comparator1.compare(obj, elem);
            if (i <= 0) goto _L2; else goto _L1
_L1:
            if (right != null) goto _L4; else goto _L3
_L3:
            return this;
_L4:
            return (AvlNode)MoreObjects.firstNonNull(right.floor(comparator1, obj), this);
_L2:
            if (i != 0)
            {
                if (left == null)
                {
                    comparator1 = null;
                } else
                {
                    comparator1 = left.floor(comparator1, obj);
                }
                return comparator1;
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        private static int height(AvlNode avlnode)
        {
            if (avlnode == null)
            {
                return 0;
            } else
            {
                return avlnode.height;
            }
        }

        private AvlNode rebalance()
        {
            switch (balanceFactor())
            {
            default:
                recomputeHeight();
                return this;

            case -2: 
                if (right.balanceFactor() > 0)
                {
                    right = right.rotateRight();
                }
                return rotateLeft();

            case 2: // '\002'
                break;
            }
            if (left.balanceFactor() < 0)
            {
                left = left.rotateLeft();
            }
            return rotateRight();
        }

        private void recompute()
        {
            recomputeMultiset();
            recomputeHeight();
        }

        private void recomputeHeight()
        {
            height = Math.max(height(left), height(right)) + 1;
        }

        private void recomputeMultiset()
        {
            distinctElements = TreeMultiset.distinctElements(left) + 1 + TreeMultiset.distinctElements(right);
            totalCount = (long)elemCount + totalCount(left) + totalCount(right);
        }

        private AvlNode removeMax(AvlNode avlnode)
        {
            if (right == null)
            {
                return left;
            } else
            {
                right = right.removeMax(avlnode);
                distinctElements = distinctElements - 1;
                totalCount = totalCount - (long)avlnode.elemCount;
                return rebalance();
            }
        }

        private AvlNode removeMin(AvlNode avlnode)
        {
            if (left == null)
            {
                return right;
            } else
            {
                left = left.removeMin(avlnode);
                distinctElements = distinctElements - 1;
                totalCount = totalCount - (long)avlnode.elemCount;
                return rebalance();
            }
        }

        private AvlNode rotateLeft()
        {
            AvlNode avlnode;
            boolean flag;
            if (right != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            avlnode = right;
            right = avlnode.left;
            avlnode.left = this;
            avlnode.totalCount = totalCount;
            avlnode.distinctElements = distinctElements;
            recompute();
            avlnode.recomputeHeight();
            return avlnode;
        }

        private AvlNode rotateRight()
        {
            AvlNode avlnode;
            boolean flag;
            if (left != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            avlnode = left;
            left = avlnode.right;
            avlnode.right = this;
            avlnode.totalCount = totalCount;
            avlnode.distinctElements = distinctElements;
            recompute();
            avlnode.recomputeHeight();
            return avlnode;
        }

        private static long totalCount(AvlNode avlnode)
        {
            if (avlnode == null)
            {
                return 0L;
            } else
            {
                return avlnode.totalCount;
            }
        }

        AvlNode add(Comparator comparator1, Object obj, int i, int ai[])
        {
            int j = comparator1.compare(obj, elem);
            if (j >= 0) goto _L2; else goto _L1
_L1:
            AvlNode avlnode = left;
            if (avlnode != null) goto _L4; else goto _L3
_L3:
            ai[0] = 0;
            comparator1 = addLeftChild(obj, i);
_L6:
            return comparator1;
_L4:
            j = avlnode.height;
            left = avlnode.add(comparator1, obj, i, ai);
            if (ai[0] == 0)
            {
                distinctElements = distinctElements + 1;
            }
            totalCount = totalCount + (long)i;
            comparator1 = this;
            if (left.height != j)
            {
                return rebalance();
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (j > 0)
            {
                AvlNode avlnode1 = right;
                if (avlnode1 == null)
                {
                    ai[0] = 0;
                    return addRightChild(obj, i);
                }
                int k = avlnode1.height;
                right = avlnode1.add(comparator1, obj, i, ai);
                if (ai[0] == 0)
                {
                    distinctElements = distinctElements + 1;
                }
                totalCount = totalCount + (long)i;
                comparator1 = this;
                if (right.height != k)
                {
                    return rebalance();
                }
            } else
            {
                ai[0] = elemCount;
                boolean flag;
                if ((long)elemCount + (long)i <= 0x7fffffffL)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
                elemCount = elemCount + i;
                totalCount = totalCount + (long)i;
                return this;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public int count(Comparator comparator1, Object obj)
        {
            int i = comparator1.compare(obj, elem);
            if (i >= 0) goto _L2; else goto _L1
_L1:
            if (left != null) goto _L4; else goto _L3
_L3:
            return 0;
_L4:
            return left.count(comparator1, obj);
_L2:
            if (i > 0)
            {
                if (right != null)
                {
                    return right.count(comparator1, obj);
                }
            } else
            {
                return elemCount;
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        public int getCount()
        {
            return elemCount;
        }

        public Object getElement()
        {
            return elem;
        }

        AvlNode remove(Comparator comparator1, Object obj, int i, int ai[])
        {
            AvlNode avlnode;
            int j;
            j = comparator1.compare(obj, elem);
            if (j >= 0)
            {
                break MISSING_BLOCK_LABEL_115;
            }
            avlnode = left;
            if (avlnode != null) goto _L2; else goto _L1
_L1:
            ai[0] = 0;
_L4:
            return this;
_L2:
            left = avlnode.remove(comparator1, obj, i, ai);
            if (ai[0] > 0)
            {
                if (i >= ai[0])
                {
                    distinctElements = distinctElements - 1;
                    totalCount = totalCount - (long)ai[0];
                } else
                {
                    totalCount = totalCount - (long)i;
                }
            }
            if (ai[0] == 0) goto _L4; else goto _L3
_L3:
            return rebalance();
            if (j > 0)
            {
                AvlNode avlnode1 = right;
                if (avlnode1 == null)
                {
                    ai[0] = 0;
                    return this;
                }
                right = avlnode1.remove(comparator1, obj, i, ai);
                if (ai[0] > 0)
                {
                    if (i >= ai[0])
                    {
                        distinctElements = distinctElements - 1;
                        totalCount = totalCount - (long)ai[0];
                    } else
                    {
                        totalCount = totalCount - (long)i;
                    }
                }
                return rebalance();
            }
            ai[0] = elemCount;
            if (i >= elemCount)
            {
                return deleteMe();
            } else
            {
                elemCount = elemCount - i;
                totalCount = totalCount - (long)i;
                return this;
            }
        }

        AvlNode setCount(Comparator comparator1, Object obj, int i, int j, int ai[])
        {
            int k = comparator1.compare(obj, elem);
            if (k >= 0) goto _L2; else goto _L1
_L1:
            AvlNode avlnode = left;
            if (avlnode != null) goto _L4; else goto _L3
_L3:
            ai[0] = 0;
            comparator1 = this;
            if (i == 0)
            {
                comparator1 = this;
                if (j > 0)
                {
                    comparator1 = addLeftChild(obj, j);
                }
            }
_L18:
            return comparator1;
_L4:
            left = avlnode.setCount(comparator1, obj, i, j, ai);
            if (ai[0] != i) goto _L6; else goto _L5
_L5:
            if (j != 0 || ai[0] == 0) goto _L8; else goto _L7
_L7:
            distinctElements = distinctElements - 1;
_L9:
            totalCount = totalCount + (long)(j - ai[0]);
_L6:
            return rebalance();
_L8:
            if (j > 0 && ai[0] == 0)
            {
                distinctElements = distinctElements + 1;
            }
            if (true) goto _L9; else goto _L2
_L2:
            if (k <= 0) goto _L11; else goto _L10
_L10:
            AvlNode avlnode1 = right;
            if (avlnode1 == null)
            {
                ai[0] = 0;
                comparator1 = this;
                if (i == 0)
                {
                    comparator1 = this;
                    if (j > 0)
                    {
                        return addRightChild(obj, j);
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            right = avlnode1.setCount(comparator1, obj, i, j, ai);
            if (ai[0] != i) goto _L13; else goto _L12
_L12:
            if (j != 0 || ai[0] == 0) goto _L15; else goto _L14
_L14:
            distinctElements = distinctElements - 1;
_L16:
            totalCount = totalCount + (long)(j - ai[0]);
_L13:
            return rebalance();
_L15:
            if (j > 0 && ai[0] == 0)
            {
                distinctElements = distinctElements + 1;
            }
            if (true) goto _L16; else goto _L11
_L11:
            ai[0] = elemCount;
            comparator1 = this;
            if (i == elemCount)
            {
                if (j == 0)
                {
                    return deleteMe();
                } else
                {
                    totalCount = totalCount + (long)(j - elemCount);
                    elemCount = j;
                    return this;
                }
            }
            if (true) goto _L18; else goto _L17
_L17:
        }

        AvlNode setCount(Comparator comparator1, Object obj, int i, int ai[])
        {
            int j = comparator1.compare(obj, elem);
            if (j >= 0) goto _L2; else goto _L1
_L1:
            AvlNode avlnode = left;
            if (avlnode != null) goto _L4; else goto _L3
_L3:
            ai[0] = 0;
            comparator1 = this;
            if (i > 0)
            {
                comparator1 = addLeftChild(obj, i);
            }
_L9:
            return comparator1;
_L4:
            left = avlnode.setCount(comparator1, obj, i, ai);
            if (i != 0 || ai[0] == 0) goto _L6; else goto _L5
_L5:
            distinctElements = distinctElements - 1;
_L7:
            totalCount = totalCount + (long)(i - ai[0]);
            return rebalance();
_L6:
            if (i > 0 && ai[0] == 0)
            {
                distinctElements = distinctElements + 1;
            }
            if (true) goto _L7; else goto _L2
_L2:
            if (j <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
label0:
            {
                avlnode = right;
                if (avlnode != null)
                {
                    break label0;
                }
                ai[0] = 0;
                comparator1 = this;
                if (i > 0)
                {
                    return addRightChild(obj, i);
                }
            }
            if (true) goto _L9; else goto _L8
            right = avlnode.setCount(comparator1, obj, i, ai);
            if (i != 0 || ai[0] == 0) goto _L11; else goto _L10
_L10:
            distinctElements = distinctElements - 1;
_L12:
            totalCount = totalCount + (long)(i - ai[0]);
            return rebalance();
_L11:
            if (i > 0 && ai[0] == 0)
            {
                distinctElements = distinctElements + 1;
            }
            if (true) goto _L12; else goto _L8
_L8:
            ai[0] = elemCount;
            if (i == 0)
            {
                return deleteMe();
            } else
            {
                totalCount = totalCount + (long)(i - elemCount);
                elemCount = i;
                return this;
            }
        }

        public String toString()
        {
            return Multisets.immutableEntry(getElement(), getCount()).toString();
        }




/*
        static AvlNode access$1102(AvlNode avlnode, AvlNode avlnode1)
        {
            avlnode.pred = avlnode1;
            return avlnode1;
        }

*/










/*
        static AvlNode access$902(AvlNode avlnode, AvlNode avlnode1)
        {
            avlnode.succ = avlnode1;
            return avlnode1;
        }

*/

        AvlNode(Object obj, int i)
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
            elem = obj;
            elemCount = i;
            totalCount = i;
            distinctElements = 1;
            height = 1;
            left = null;
            right = null;
        }
    }

    private static final class Reference
    {

        private Object value;

        public void checkAndSet(Object obj, Object obj1)
        {
            if (value != obj)
            {
                throw new ConcurrentModificationException();
            } else
            {
                value = obj1;
                return;
            }
        }

        public Object get()
        {
            return value;
        }

        private Reference()
        {
        }

    }


    private static final long serialVersionUID = 1L;
    private final transient AvlNode header;
    private final transient GeneralRange range;
    private final transient Reference rootReference;

    TreeMultiset(Reference reference, GeneralRange generalrange, AvlNode avlnode)
    {
        super(generalrange.comparator());
        rootReference = reference;
        range = generalrange;
        header = avlnode;
    }

    TreeMultiset(Comparator comparator1)
    {
        super(comparator1);
        range = GeneralRange.all(comparator1);
        header = new AvlNode(null, 1);
        successor(header, header);
        rootReference = new Reference();
    }

    private long aggregateAboveRange(Aggregate aggregate, AvlNode avlnode)
    {
        if (avlnode == null)
        {
            return 0L;
        }
        int i = comparator().compare(range.getUpperEndpoint(), avlnode.elem);
        if (i > 0)
        {
            return aggregateAboveRange(aggregate, avlnode.right);
        }
        static class _cls4
        {

            static final int $SwitchMap$com$google$common$collect$BoundType[];

            static 
            {
                $SwitchMap$com$google$common$collect$BoundType = new int[BoundType.values().length];
                try
                {
                    $SwitchMap$com$google$common$collect$BoundType[BoundType.OPEN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$common$collect$BoundType[BoundType.CLOSED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (i == 0)
        {
            switch (_cls4..SwitchMap.com.google.common.collect.BoundType[range.getUpperBoundType().ordinal()])
            {
            default:
                throw new AssertionError();

            case 1: // '\001'
                return (long)aggregate.nodeAggregate(avlnode) + aggregate.treeAggregate(avlnode.right);

            case 2: // '\002'
                return aggregate.treeAggregate(avlnode.right);
            }
        } else
        {
            return aggregate.treeAggregate(avlnode.right) + (long)aggregate.nodeAggregate(avlnode) + aggregateAboveRange(aggregate, avlnode.left);
        }
    }

    private long aggregateBelowRange(Aggregate aggregate, AvlNode avlnode)
    {
        if (avlnode == null)
        {
            return 0L;
        }
        int i = comparator().compare(range.getLowerEndpoint(), avlnode.elem);
        if (i < 0)
        {
            return aggregateBelowRange(aggregate, avlnode.left);
        }
        if (i == 0)
        {
            switch (_cls4..SwitchMap.com.google.common.collect.BoundType[range.getLowerBoundType().ordinal()])
            {
            default:
                throw new AssertionError();

            case 1: // '\001'
                return (long)aggregate.nodeAggregate(avlnode) + aggregate.treeAggregate(avlnode.left);

            case 2: // '\002'
                return aggregate.treeAggregate(avlnode.left);
            }
        } else
        {
            return aggregate.treeAggregate(avlnode.left) + (long)aggregate.nodeAggregate(avlnode) + aggregateBelowRange(aggregate, avlnode.right);
        }
    }

    private long aggregateForEntries(Aggregate aggregate)
    {
        AvlNode avlnode = (AvlNode)rootReference.get();
        long l1 = aggregate.treeAggregate(avlnode);
        long l = l1;
        if (range.hasLowerBound())
        {
            l = l1 - aggregateBelowRange(aggregate, avlnode);
        }
        l1 = l;
        if (range.hasUpperBound())
        {
            l1 = l - aggregateAboveRange(aggregate, avlnode);
        }
        return l1;
    }

    public static TreeMultiset create()
    {
        return new TreeMultiset(Ordering.natural());
    }

    public static TreeMultiset create(Iterable iterable)
    {
        TreeMultiset treemultiset = create();
        Iterables.addAll(treemultiset, iterable);
        return treemultiset;
    }

    public static TreeMultiset create(Comparator comparator1)
    {
        if (comparator1 == null)
        {
            return new TreeMultiset(Ordering.natural());
        } else
        {
            return new TreeMultiset(comparator1);
        }
    }

    static int distinctElements(AvlNode avlnode)
    {
        if (avlnode == null)
        {
            return 0;
        } else
        {
            return avlnode.distinctElements;
        }
    }

    private AvlNode firstNode()
    {
        if ((AvlNode)rootReference.get() != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!range.hasLowerBound()) goto _L4; else goto _L3
_L3:
        AvlNode avlnode1;
        Object obj;
        obj = range.getLowerEndpoint();
        avlnode1 = ((AvlNode)rootReference.get()).ceiling(comparator(), obj);
        if (avlnode1 == null) goto _L1; else goto _L5
_L5:
        AvlNode avlnode;
        avlnode = avlnode1;
        if (range.getLowerBoundType() == BoundType.OPEN)
        {
            avlnode = avlnode1;
            if (comparator().compare(obj, avlnode1.getElement()) == 0)
            {
                avlnode = avlnode1.succ;
            }
        }
_L7:
        AvlNode avlnode2;
label0:
        {
            if (avlnode != header)
            {
                avlnode2 = avlnode;
                if (range.contains(avlnode.getElement()))
                {
                    break label0;
                }
            }
            avlnode2 = null;
        }
        return avlnode2;
_L4:
        avlnode = header.succ;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private AvlNode lastNode()
    {
        if ((AvlNode)rootReference.get() != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!range.hasUpperBound()) goto _L4; else goto _L3
_L3:
        AvlNode avlnode1;
        Object obj;
        obj = range.getUpperEndpoint();
        avlnode1 = ((AvlNode)rootReference.get()).floor(comparator(), obj);
        if (avlnode1 == null) goto _L1; else goto _L5
_L5:
        AvlNode avlnode;
        avlnode = avlnode1;
        if (range.getUpperBoundType() == BoundType.OPEN)
        {
            avlnode = avlnode1;
            if (comparator().compare(obj, avlnode1.getElement()) == 0)
            {
                avlnode = avlnode1.pred;
            }
        }
_L7:
        AvlNode avlnode2;
label0:
        {
            if (avlnode != header)
            {
                avlnode2 = avlnode;
                if (range.contains(avlnode.getElement()))
                {
                    break label0;
                }
            }
            avlnode2 = null;
        }
        return avlnode2;
_L4:
        avlnode = header.pred;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        Object obj = (Comparator)objectinputstream.readObject();
        Serialization.getFieldSetter(com/google/common/collect/AbstractSortedMultiset, "comparator").set(this, obj);
        Serialization.getFieldSetter(com/google/common/collect/TreeMultiset, "range").set(this, GeneralRange.all(((Comparator) (obj))));
        Serialization.getFieldSetter(com/google/common/collect/TreeMultiset, "rootReference").set(this, new Reference());
        obj = new AvlNode(null, 1);
        Serialization.getFieldSetter(com/google/common/collect/TreeMultiset, "header").set(this, obj);
        successor(((AvlNode) (obj)), ((AvlNode) (obj)));
        Serialization.populateMultiset(this, objectinputstream);
    }

    private static void successor(AvlNode avlnode, AvlNode avlnode1)
    {
        avlnode.succ = avlnode1;
        avlnode1.pred = avlnode;
    }

    private static void successor(AvlNode avlnode, AvlNode avlnode1, AvlNode avlnode2)
    {
        successor(avlnode, avlnode1);
        successor(avlnode1, avlnode2);
    }

    private Multiset.Entry wrapEntry(final AvlNode baseEntry)
    {
        return new Multisets.AbstractEntry() {

            final TreeMultiset this$0;
            final AvlNode val$baseEntry;

            public int getCount()
            {
                int j = baseEntry.getCount();
                int i = j;
                if (j == 0)
                {
                    i = count(getElement());
                }
                return i;
            }

            public Object getElement()
            {
                return baseEntry.getElement();
            }

            
            {
                this$0 = TreeMultiset.this;
                baseEntry = avlnode;
                super();
            }
        };
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(elementSet().comparator());
        Serialization.writeMultiset(this, objectoutputstream);
    }

    public int add(Object obj, int i)
    {
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0)
        {
            return count(obj);
        }
        Preconditions.checkArgument(range.contains(obj));
        AvlNode avlnode = (AvlNode)rootReference.get();
        if (avlnode == null)
        {
            comparator().compare(obj, obj);
            obj = new AvlNode(obj, i);
            successor(header, ((AvlNode) (obj)), header);
            rootReference.checkAndSet(avlnode, obj);
            return 0;
        } else
        {
            int ai[] = new int[1];
            obj = avlnode.add(comparator(), obj, i, ai);
            rootReference.checkAndSet(avlnode, obj);
            return ai[0];
        }
    }

    public volatile boolean add(Object obj)
    {
        return super.add(obj);
    }

    public volatile boolean addAll(Collection collection)
    {
        return super.addAll(collection);
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile Comparator comparator()
    {
        return super.comparator();
    }

    public volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    public int count(Object obj)
    {
        AvlNode avlnode;
        avlnode = (AvlNode)rootReference.get();
        if (!range.contains(obj))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (avlnode == null)
        {
            return 0;
        }
        int i = avlnode.count(comparator(), obj);
        return i;
        obj;
        return 0;
        obj;
        return 0;
    }

    Iterator descendingEntryIterator()
    {
        return new Iterator() {

            AvlNode current;
            Multiset.Entry prevEntry;
            final TreeMultiset this$0;

            public boolean hasNext()
            {
                if (current == null)
                {
                    return false;
                }
                if (range.tooLow(current.getElement()))
                {
                    current = null;
                    return false;
                } else
                {
                    return true;
                }
            }

            public Multiset.Entry next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                }
                Multiset.Entry entry = wrapEntry(current);
                prevEntry = entry;
                if (current.pred == header)
                {
                    current = null;
                    return entry;
                } else
                {
                    current = current.pred;
                    return entry;
                }
            }

            public volatile Object next()
            {
                return next();
            }

            public void remove()
            {
                boolean flag;
                if (prevEntry != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CollectPreconditions.checkRemove(flag);
                setCount(prevEntry.getElement(), 0);
                prevEntry = null;
            }

            
            {
                this$0 = TreeMultiset.this;
                super();
                current = lastNode();
                prevEntry = null;
            }
        };
    }

    public volatile SortedMultiset descendingMultiset()
    {
        return super.descendingMultiset();
    }

    int distinctElements()
    {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.DISTINCT));
    }

    public volatile NavigableSet elementSet()
    {
        return super.elementSet();
    }

    Iterator entryIterator()
    {
        return new Iterator() {

            AvlNode current;
            Multiset.Entry prevEntry;
            final TreeMultiset this$0;

            public boolean hasNext()
            {
                if (current == null)
                {
                    return false;
                }
                if (range.tooHigh(current.getElement()))
                {
                    current = null;
                    return false;
                } else
                {
                    return true;
                }
            }

            public Multiset.Entry next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                }
                Multiset.Entry entry = wrapEntry(current);
                prevEntry = entry;
                if (current.succ == header)
                {
                    current = null;
                    return entry;
                } else
                {
                    current = current.succ;
                    return entry;
                }
            }

            public volatile Object next()
            {
                return next();
            }

            public void remove()
            {
                boolean flag;
                if (prevEntry != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CollectPreconditions.checkRemove(flag);
                setCount(prevEntry.getElement(), 0);
                prevEntry = null;
            }

            
            {
                this$0 = TreeMultiset.this;
                super();
                current = firstNode();
            }
        };
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Multiset.Entry firstEntry()
    {
        return super.firstEntry();
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public SortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        return new TreeMultiset(rootReference, range.intersect(GeneralRange.upTo(comparator(), obj, boundtype)), header);
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public volatile Iterator iterator()
    {
        return super.iterator();
    }

    public volatile Multiset.Entry lastEntry()
    {
        return super.lastEntry();
    }

    public volatile Multiset.Entry pollFirstEntry()
    {
        return super.pollFirstEntry();
    }

    public volatile Multiset.Entry pollLastEntry()
    {
        return super.pollLastEntry();
    }

    public int remove(Object obj, int i)
    {
        boolean flag;
        flag = false;
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = count(obj);
_L4:
        return j;
_L2:
        AvlNode avlnode;
        int ai[];
        avlnode = (AvlNode)rootReference.get();
        ai = new int[1];
        j = ((flag) ? 1 : 0);
        if (range.contains(obj))
        {
            j = ((flag) ? 1 : 0);
            if (avlnode != null)
            {
                try
                {
                    obj = avlnode.remove(comparator(), obj, i, ai);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return 0;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return 0;
                }
                rootReference.checkAndSet(avlnode, obj);
                return ai[0];
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile boolean removeAll(Collection collection)
    {
        return super.removeAll(collection);
    }

    public volatile boolean retainAll(Collection collection)
    {
        return super.retainAll(collection);
    }

    public int setCount(Object obj, int i)
    {
        boolean flag = true;
        CollectPreconditions.checkNonnegative(i, "count");
        if (!range.contains(obj))
        {
            if (i != 0)
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
        } else
        {
            AvlNode avlnode = (AvlNode)rootReference.get();
            if (avlnode == null)
            {
                if (i > 0)
                {
                    add(obj, i);
                    return 0;
                }
            } else
            {
                int ai[] = new int[1];
                obj = avlnode.setCount(comparator(), obj, i, ai);
                rootReference.checkAndSet(avlnode, obj);
                return ai[0];
            }
        }
        return 0;
    }

    public boolean setCount(Object obj, int i, int j)
    {
        CollectPreconditions.checkNonnegative(j, "newCount");
        CollectPreconditions.checkNonnegative(i, "oldCount");
        Preconditions.checkArgument(range.contains(obj));
        AvlNode avlnode = (AvlNode)rootReference.get();
        if (avlnode == null)
        {
            if (i == 0)
            {
                if (j > 0)
                {
                    add(obj, j);
                }
                return true;
            } else
            {
                return false;
            }
        }
        int ai[] = new int[1];
        obj = avlnode.setCount(comparator(), obj, i, j, ai);
        rootReference.checkAndSet(avlnode, obj);
        boolean flag;
        if (ai[0] == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public int size()
    {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.SIZE));
    }

    public volatile SortedMultiset subMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        return super.subMultiset(obj, boundtype, obj1, boundtype1);
    }

    public SortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        return new TreeMultiset(rootReference, range.intersect(GeneralRange.downTo(comparator(), obj, boundtype)), header);
    }

    public volatile String toString()
    {
        return super.toString();
    }







}
