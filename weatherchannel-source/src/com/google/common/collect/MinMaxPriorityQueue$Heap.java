// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            MinMaxPriorityQueue, Ordering

private class ordering
{

    final Ordering ordering;
    esc otherHeap;
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
        while (getLeftChildIndex(i) < MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this) && compareElements(i, getLeftChildIndex(i)) > 0 || getRightChildIndex(i) < MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this) && compareElements(i, getRightChildIndex(i)) > 0 || i > 0 && compareElements(i, getParentIndex(i)) > 0 || i > 2 && compareElements(getGrandparentIndex(i), i) > 0) 
        {
            return false;
        }
        return true;
    }

    void bubbleUp(int i, Object obj)
    {
        int j = crossOverUp(i, obj);
        getGrandparentIndex getgrandparentindex;
        if (j == i)
        {
            getgrandparentindex = this;
        } else
        {
            i = j;
            getgrandparentindex = otherHeap;
        }
        getgrandparentindex.bubbleUpAlternatingLevels(i, obj);
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
                MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[i] = obj;
                return i;
            }
            MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[i] = obj1;
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
            MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[i] = elementData(j);
            MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[j] = obj;
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
            MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[0] = obj;
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
                if (getLeftChildIndex(l) >= MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this))
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
            MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[i] = obj1;
            MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[j] = obj;
            return j;
        } else
        {
            MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[i] = obj;
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
                MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[i] = elementData(j);
                i = j;
            } else
            {
                return i;
            }
        } while (true);
    }

    int findMin(int i, int j)
    {
        if (i < MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this)) goto _L2; else goto _L1
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
        i1 = Math.min(i, MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this) - j);
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
        int i = getParentIndex(MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this));
        if (i != 0)
        {
            int j = getRightChildIndex(getParentIndex(i));
            if (j != i && getLeftChildIndex(j) >= MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this))
            {
                Object obj1 = elementData(j);
                if (ordering.compare(obj1, obj) < 0)
                {
                    MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[j] = obj;
                    MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this)] = obj1;
                    return j;
                }
            }
        }
        return MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this);
    }

    esc tryCrossOverAndBubbleUp(int i, int j, Object obj)
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
                return new esc(obj, obj1);
            }
        }
        return null;
    }


    esc(Ordering ordering1)
    {
        this$0 = MinMaxPriorityQueue.this;
        super();
        ordering = ordering1;
    }
}
