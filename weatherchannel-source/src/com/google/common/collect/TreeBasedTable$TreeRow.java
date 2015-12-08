// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            TreeBasedTable

private class t extends t
    implements SortedMap
{

    final Object lowerBound;
    final TreeBasedTable this$0;
    final Object upperBound;
    transient SortedMap wholeRow;

    volatile Map backingRowMap()
    {
        return backingRowMap();
    }

    SortedMap backingRowMap()
    {
        return (SortedMap)super.ngRowMap();
    }

    public Comparator comparator()
    {
        return columnComparator();
    }

    int compare(Object obj, Object obj1)
    {
        return comparator().compare(obj, obj1);
    }

    volatile Map computeBackingRowMap()
    {
        return computeBackingRowMap();
    }

    SortedMap computeBackingRowMap()
    {
        SortedMap sortedmap1 = wholeRow();
        if (sortedmap1 != null)
        {
            SortedMap sortedmap = sortedmap1;
            if (lowerBound != null)
            {
                sortedmap = sortedmap1.tailMap(lowerBound);
            }
            sortedmap1 = sortedmap;
            if (upperBound != null)
            {
                sortedmap1 = sortedmap.headMap(upperBound);
            }
            return sortedmap1;
        } else
        {
            return null;
        }
    }

    public boolean containsKey(Object obj)
    {
        return rangeContains(obj) && super.insKey(obj);
    }

    public Object firstKey()
    {
        if (backingRowMap() == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return backingRowMap().firstKey();
        }
    }

    public SortedMap headMap(Object obj)
    {
        Preconditions.checkArgument(rangeContains(Preconditions.checkNotNull(obj)));
        return new <init>(rowKey, lowerBound, obj);
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public SortedSet keySet()
    {
        return new >(this);
    }

    public Object lastKey()
    {
        if (backingRowMap() == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return backingRowMap().lastKey();
        }
    }

    void maintainEmptyInvariant()
    {
        if (wholeRow() != null && wholeRow.isEmpty())
        {
            backingMap.remove(rowKey);
            wholeRow = null;
            backingRowMap = null;
        }
    }

    public Object put(Object obj, Object obj1)
    {
        Preconditions.checkArgument(rangeContains(Preconditions.checkNotNull(obj)));
        return super.(obj, obj1);
    }

    boolean rangeContains(Object obj)
    {
        return obj != null && (lowerBound == null || compare(lowerBound, obj) <= 0) && (upperBound == null || compare(upperBound, obj) > 0);
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        boolean flag;
        if (rangeContains(Preconditions.checkNotNull(obj)) && rangeContains(Preconditions.checkNotNull(obj1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new <init>(rowKey, obj, obj1);
    }

    public SortedMap tailMap(Object obj)
    {
        Preconditions.checkArgument(rangeContains(Preconditions.checkNotNull(obj)));
        return new <init>(rowKey, obj, upperBound);
    }

    SortedMap wholeRow()
    {
        if (wholeRow == null || wholeRow.isEmpty() && backingMap.containsKey(rowKey))
        {
            wholeRow = (SortedMap)backingMap.get(rowKey);
        }
        return wholeRow;
    }

    (Object obj)
    {
        this(obj, null, null);
    }

    <init>(Object obj, Object obj1, Object obj2)
    {
        this$0 = TreeBasedTable.this;
        super(TreeBasedTable.this, obj);
        lowerBound = obj1;
        upperBound = obj2;
        boolean flag;
        if (obj1 == null || obj2 == null || compare(obj1, obj2) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }
}
