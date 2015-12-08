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
//            AbstractTable, Tables, Table, Iterators, 
//            Maps, Collections2

private static class function extends AbstractTable
{

    final Table fromTable;
    final Function function;

    Function cellFunction()
    {
        return new Function() {

            final Tables.TransformedTable this$0;

            public Table.Cell apply(Table.Cell cell)
            {
                return Tables.immutableCell(cell.getRowKey(), cell.getColumnKey(), function.apply(cell.getValue()));
            }

            public volatile Object apply(Object obj)
            {
                return apply((Table.Cell)obj);
            }

            
            {
                this$0 = Tables.TransformedTable.this;
                super();
            }
        };
    }

    Iterator cellIterator()
    {
        return Iterators.transform(fromTable.cellSet().iterator(), cellFunction());
    }

    public void clear()
    {
        fromTable.clear();
    }

    public Map column(Object obj)
    {
        return Maps.transformValues(fromTable.column(obj), function);
    }

    public Set columnKeySet()
    {
        return fromTable.columnKeySet();
    }

    public Map columnMap()
    {
        Function function1 = new Function() {

            final Tables.TransformedTable this$0;

            public volatile Object apply(Object obj)
            {
                return apply((Map)obj);
            }

            public Map apply(Map map)
            {
                return Maps.transformValues(map, function);
            }

            
            {
                this$0 = Tables.TransformedTable.this;
                super();
            }
        };
        return Maps.transformValues(fromTable.columnMap(), function1);
    }

    public boolean contains(Object obj, Object obj1)
    {
        return fromTable.contains(obj, obj1);
    }

    Collection createValues()
    {
        return Collections2.transform(fromTable.values(), function);
    }

    public Object get(Object obj, Object obj1)
    {
        if (contains(obj, obj1))
        {
            return function.apply(fromTable.get(obj, obj1));
        } else
        {
            return null;
        }
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        throw new UnsupportedOperationException();
    }

    public void putAll(Table table)
    {
        throw new UnsupportedOperationException();
    }

    public Object remove(Object obj, Object obj1)
    {
        if (contains(obj, obj1))
        {
            return function.apply(fromTable.remove(obj, obj1));
        } else
        {
            return null;
        }
    }

    public Map row(Object obj)
    {
        return Maps.transformValues(fromTable.row(obj), function);
    }

    public Set rowKeySet()
    {
        return fromTable.rowKeySet();
    }

    public Map rowMap()
    {
        Function function1 = new Function() {

            final Tables.TransformedTable this$0;

            public volatile Object apply(Object obj)
            {
                return apply((Map)obj);
            }

            public Map apply(Map map)
            {
                return Maps.transformValues(map, function);
            }

            
            {
                this$0 = Tables.TransformedTable.this;
                super();
            }
        };
        return Maps.transformValues(fromTable.rowMap(), function1);
    }

    public int size()
    {
        return fromTable.size();
    }

    _cls3.this._cls0(Table table, Function function1)
    {
        fromTable = (Table)Preconditions.checkNotNull(table);
        function = (Function)Preconditions.checkNotNull(function1);
    }
}
