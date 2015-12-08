// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            TreeMultiset, Multisets

private static final class right extends ry
{

    private int distinctElements;
    private final Object elem;
    private int elemCount;
    private int height;
    private ng left;
    private ng pred;
    private ng right;
    private ng succ;
    private long totalCount;

    private ry addLeftChild(Object obj, int i)
    {
        left = new <init>(obj, i);
        TreeMultiset.access$1700(pred, left, this);
        height = Math.max(2, height);
        distinctElements = distinctElements + 1;
        totalCount = totalCount + (long)i;
        return this;
    }

    private totalCount addRightChild(Object obj, int i)
    {
        right = new <init>(obj, i);
        TreeMultiset.access$1700(this, right, succ);
        height = Math.max(2, height);
        distinctElements = distinctElements + 1;
        totalCount = totalCount + (long)i;
        return this;
    }

    private int balanceFactor()
    {
        return height(left) - height(right);
    }

    private right ceiling(Comparator comparator, Object obj)
    {
        int i = comparator.compare(obj, elem);
        if (i >= 0) goto _L2; else goto _L1
_L1:
        if (left != null) goto _L4; else goto _L3
_L3:
        return this;
_L4:
        return (left)MoreObjects.firstNonNull(left.ceiling(comparator, obj), this);
_L2:
        if (i != 0)
        {
            if (right == null)
            {
                comparator = null;
            } else
            {
                comparator = right.ceiling(comparator, obj);
            }
            return comparator;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private ceiling deleteMe()
    {
        int i = elemCount;
        elemCount = 0;
        TreeMultiset.access$1800(pred, succ);
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
            ceiling ceiling1 = pred;
            ceiling1.left = left.removeMax(ceiling1);
            ceiling1.right = right;
            ceiling1.distinctElements = distinctElements - 1;
            ceiling1.totalCount = totalCount - (long)i;
            return ceiling1.rebalance();
        } else
        {
            ceiling ceiling2 = succ;
            ceiling2.right = right.removeMin(ceiling2);
            ceiling2.left = left;
            ceiling2.distinctElements = distinctElements - 1;
            ceiling2.totalCount = totalCount - (long)i;
            return ceiling2.rebalance();
        }
    }

    private rebalance floor(Comparator comparator, Object obj)
    {
        int i = comparator.compare(obj, elem);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        if (right != null) goto _L4; else goto _L3
_L3:
        return this;
_L4:
        return (right)MoreObjects.firstNonNull(right.floor(comparator, obj), this);
_L2:
        if (i != 0)
        {
            if (left == null)
            {
                comparator = null;
            } else
            {
                comparator = left.floor(comparator, obj);
            }
            return comparator;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static int height(floor floor1)
    {
        if (floor1 == null)
        {
            return 0;
        } else
        {
            return floor1.height;
        }
    }

    private height rebalance()
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

    private right removeMax(right right1)
    {
        if (right == null)
        {
            return left;
        } else
        {
            right = right.removeMax(right1);
            distinctElements = distinctElements - 1;
            totalCount = totalCount - (long)right1.elemCount;
            return rebalance();
        }
    }

    private rebalance removeMin(rebalance rebalance1)
    {
        if (left == null)
        {
            return right;
        } else
        {
            left = left.removeMin(rebalance1);
            distinctElements = distinctElements - 1;
            totalCount = totalCount - (long)rebalance1.elemCount;
            return rebalance();
        }
    }

    private rebalance rotateLeft()
    {
        rebalance rebalance1;
        boolean flag;
        if (right != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        rebalance1 = right;
        right = rebalance1.left;
        rebalance1.left = this;
        rebalance1.totalCount = totalCount;
        rebalance1.distinctElements = distinctElements;
        recompute();
        rebalance1.recomputeHeight();
        return rebalance1;
    }

    private recomputeHeight rotateRight()
    {
        recomputeHeight recomputeheight;
        boolean flag;
        if (left != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        recomputeheight = left;
        left = recomputeheight.right;
        recomputeheight.right = this;
        recomputeheight.totalCount = totalCount;
        recomputeheight.distinctElements = distinctElements;
        recompute();
        recomputeheight.recomputeHeight();
        return recomputeheight;
    }

    private static long totalCount(recomputeHeight recomputeheight)
    {
        if (recomputeheight == null)
        {
            return 0L;
        } else
        {
            return recomputeheight.totalCount;
        }
    }

    totalCount add(Comparator comparator, Object obj, int i, int ai[])
    {
        int j = comparator.compare(obj, elem);
        if (j >= 0) goto _L2; else goto _L1
_L1:
        totalCount totalcount = left;
        if (totalcount != null) goto _L4; else goto _L3
_L3:
        ai[0] = 0;
        comparator = addLeftChild(obj, i);
_L6:
        return comparator;
_L4:
        j = totalcount.height;
        left = totalcount.add(comparator, obj, i, ai);
        if (ai[0] == 0)
        {
            distinctElements = distinctElements + 1;
        }
        totalCount = totalCount + (long)i;
        comparator = this;
        if (left.height != j)
        {
            return rebalance();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (j > 0)
        {
            totalCount totalcount1 = right;
            if (totalcount1 == null)
            {
                ai[0] = 0;
                return addRightChild(obj, i);
            }
            int k = totalcount1.height;
            right = totalcount1.add(comparator, obj, i, ai);
            if (ai[0] == 0)
            {
                distinctElements = distinctElements + 1;
            }
            totalCount = totalCount + (long)i;
            comparator = this;
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

    public int count(Comparator comparator, Object obj)
    {
        int i = comparator.compare(obj, elem);
        if (i >= 0) goto _L2; else goto _L1
_L1:
        if (left != null) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return left.count(comparator, obj);
_L2:
        if (i > 0)
        {
            if (right != null)
            {
                return right.count(comparator, obj);
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

    elem remove(Comparator comparator, Object obj, int i, int ai[])
    {
        elem elem1;
        int j;
        j = comparator.compare(obj, elem);
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        elem1 = left;
        if (elem1 != null) goto _L2; else goto _L1
_L1:
        ai[0] = 0;
_L4:
        return this;
_L2:
        left = elem1.remove(comparator, obj, i, ai);
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
            elem elem2 = right;
            if (elem2 == null)
            {
                ai[0] = 0;
                return this;
            }
            right = elem2.remove(comparator, obj, i, ai);
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

    totalCount setCount(Comparator comparator, Object obj, int i, int j, int ai[])
    {
        int k = comparator.compare(obj, elem);
        if (k >= 0) goto _L2; else goto _L1
_L1:
        totalCount totalcount = left;
        if (totalcount != null) goto _L4; else goto _L3
_L3:
        ai[0] = 0;
        comparator = this;
        if (i == 0)
        {
            comparator = this;
            if (j > 0)
            {
                comparator = addLeftChild(obj, j);
            }
        }
_L18:
        return comparator;
_L4:
        left = totalcount.setCount(comparator, obj, i, j, ai);
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
        totalCount totalcount1 = right;
        if (totalcount1 == null)
        {
            ai[0] = 0;
            comparator = this;
            if (i == 0)
            {
                comparator = this;
                if (j > 0)
                {
                    return addRightChild(obj, j);
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        right = totalcount1.setCount(comparator, obj, i, j, ai);
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
        comparator = this;
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

    elemCount setCount(Comparator comparator, Object obj, int i, int ai[])
    {
        int j = comparator.compare(obj, elem);
        if (j >= 0) goto _L2; else goto _L1
_L1:
        elemCount elemcount = left;
        if (elemcount != null) goto _L4; else goto _L3
_L3:
        ai[0] = 0;
        comparator = this;
        if (i > 0)
        {
            comparator = addLeftChild(obj, i);
        }
_L9:
        return comparator;
_L4:
        left = elemcount.setCount(comparator, obj, i, ai);
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
            elemcount = right;
            if (elemcount != null)
            {
                break label0;
            }
            ai[0] = 0;
            comparator = this;
            if (i > 0)
            {
                return addRightChild(obj, i);
            }
        }
        if (true) goto _L9; else goto _L8
        right = elemcount.setCount(comparator, obj, i, ai);
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
        return Multisets.immutableEntry(getElement(), getCount()).ng();
    }




/*
    static ry access$1102(ry ry, ry ry1)
    {
        ry.pred = ry1;
        return ry1;
    }

*/










/*
    static pred access$902(pred pred1, pred pred2)
    {
        pred1.succ = pred2;
        return pred2;
    }

*/

    succ(Object obj, int i)
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
