// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableTable, ImmutableMap, ImmutableSet, ImmutableCollection

class SingletonImmutableTable extends ImmutableTable
{

    final Object singleColumnKey;
    final Object singleRowKey;
    final Object singleValue;

    SingletonImmutableTable(Table.Cell cell)
    {
        this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
    }

    SingletonImmutableTable(Object obj, Object obj1, Object obj2)
    {
        singleRowKey = Preconditions.checkNotNull(obj);
        singleColumnKey = Preconditions.checkNotNull(obj1);
        singleValue = Preconditions.checkNotNull(obj2);
    }

    public ImmutableMap column(Object obj)
    {
        Preconditions.checkNotNull(obj);
        if (containsColumn(obj))
        {
            return ImmutableMap.of(singleRowKey, singleValue);
        } else
        {
            return ImmutableMap.of();
        }
    }

    public volatile Map column(Object obj)
    {
        return column(obj);
    }

    public ImmutableMap columnMap()
    {
        return ImmutableMap.of(singleColumnKey, ImmutableMap.of(singleRowKey, singleValue));
    }

    public volatile Map columnMap()
    {
        return columnMap();
    }

    ImmutableSet createCellSet()
    {
        return ImmutableSet.of(cellOf(singleRowKey, singleColumnKey, singleValue));
    }

    volatile Set createCellSet()
    {
        return createCellSet();
    }

    ImmutableCollection createValues()
    {
        return ImmutableSet.of(singleValue);
    }

    volatile Collection createValues()
    {
        return createValues();
    }

    public ImmutableMap rowMap()
    {
        return ImmutableMap.of(singleRowKey, ImmutableMap.of(singleColumnKey, singleValue));
    }

    public volatile Map rowMap()
    {
        return rowMap();
    }

    public int size()
    {
        return 1;
    }
}
