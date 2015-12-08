// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractTable, Tables, Table, Iterators

private static class l extends AbstractTable
{

    private static final Function TRANSPOSE_CELL = new Function() {

        public Table.Cell apply(Table.Cell cell)
        {
            return Tables.immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
        }

        public volatile Object apply(Object obj)
        {
            return apply((Table.Cell)obj);
        }

    };
    final Table original;

    Iterator cellIterator()
    {
        return Iterators.transform(original.cellSet().iterator(), TRANSPOSE_CELL);
    }

    public void clear()
    {
        original.clear();
    }

    public Map column(Object obj)
    {
        return original.row(obj);
    }

    public Set columnKeySet()
    {
        return original.rowKeySet();
    }

    public Map columnMap()
    {
        return original.rowMap();
    }

    public boolean contains(Object obj, Object obj1)
    {
        return original.contains(obj1, obj);
    }

    public boolean containsColumn(Object obj)
    {
        return original.containsRow(obj);
    }

    public boolean containsRow(Object obj)
    {
        return original.containsColumn(obj);
    }

    public boolean containsValue(Object obj)
    {
        return original.containsValue(obj);
    }

    public Object get(Object obj, Object obj1)
    {
        return original.get(obj1, obj);
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        return original.put(obj1, obj, obj2);
    }

    public void putAll(Table table)
    {
        original.putAll(Tables.transpose(table));
    }

    public Object remove(Object obj, Object obj1)
    {
        return original.remove(obj1, obj);
    }

    public Map row(Object obj)
    {
        return original.column(obj);
    }

    public Set rowKeySet()
    {
        return original.columnKeySet();
    }

    public Map rowMap()
    {
        return original.columnMap();
    }

    public int size()
    {
        return original.size();
    }

    public Collection values()
    {
        return original.values();
    }


    _cls1(Table table)
    {
        original = (Table)Preconditions.checkNotNull(table);
    }
}
