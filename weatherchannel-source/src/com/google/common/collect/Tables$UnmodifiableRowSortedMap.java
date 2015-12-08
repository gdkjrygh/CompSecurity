// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            RowSortedTable, Tables, Maps, Table

static final class  extends 
    implements RowSortedTable
{

    private static final long serialVersionUID = 0L;

    protected RowSortedTable _mthdelegate()
    {
        return (RowSortedTable)super.e();
    }

    protected volatile Table _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile Set rowKeySet()
    {
        return rowKeySet();
    }

    public SortedSet rowKeySet()
    {
        return Collections.unmodifiableSortedSet(_mthdelegate().rowKeySet());
    }

    public volatile Map rowMap()
    {
        return rowMap();
    }

    public SortedMap rowMap()
    {
        com.google.common.base.Function function = Tables.access$000();
        return Collections.unmodifiableSortedMap(Maps.transformValues(_mthdelegate().rowMap(), function));
    }

    public (RowSortedTable rowsortedtable)
    {
        super(rowsortedtable);
    }
}
