// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Table, StandardTable, RowSortedTable, AbstractTable, 
//            Iterators, Maps, Collections2, ForwardingTable

public final class Tables
{
    static abstract class AbstractCell
        implements Table.Cell
    {

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof Table.Cell)
                {
                    if (!Objects.equal(getRowKey(), ((Table.Cell) (obj = (Table.Cell)obj)).getRowKey()) || !Objects.equal(getColumnKey(), ((Table.Cell) (obj)).getColumnKey()) || !Objects.equal(getValue(), ((Table.Cell) (obj)).getValue()))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                getRowKey(), getColumnKey(), getValue()
            });
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(getRowKey()));
            String s1 = String.valueOf(String.valueOf(getColumnKey()));
            String s2 = String.valueOf(String.valueOf(getValue()));
            return (new StringBuilder(s.length() + 4 + s1.length() + s2.length())).append("(").append(s).append(",").append(s1).append(")=").append(s2).toString();
        }

        AbstractCell()
        {
        }
    }

    static final class ImmutableCell extends AbstractCell
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object columnKey;
        private final Object rowKey;
        private final Object value;

        public Object getColumnKey()
        {
            return columnKey;
        }

        public Object getRowKey()
        {
            return rowKey;
        }

        public Object getValue()
        {
            return value;
        }

        ImmutableCell(Object obj, Object obj1, Object obj2)
        {
            rowKey = obj;
            columnKey = obj1;
            value = obj2;
        }
    }

    private static class TransformedTable extends AbstractTable
    {

        final Table fromTable;
        final Function function;

        Function cellFunction()
        {
            return new Function() {

                final TransformedTable this$0;

                public Table.Cell apply(Table.Cell cell)
                {
                    return Tables.immutableCell(cell.getRowKey(), cell.getColumnKey(), function.apply(cell.getValue()));
                }

                public volatile Object apply(Object obj)
                {
                    return apply((Table.Cell)obj);
                }

            
            {
                this$0 = TransformedTable.this;
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

                final TransformedTable this$0;

                public volatile Object apply(Object obj)
                {
                    return apply((Map)obj);
                }

                public Map apply(Map map)
                {
                    return Maps.transformValues(map, function);
                }

            
            {
                this$0 = TransformedTable.this;
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

                final TransformedTable this$0;

                public volatile Object apply(Object obj)
                {
                    return apply((Map)obj);
                }

                public Map apply(Map map)
                {
                    return Maps.transformValues(map, function);
                }

            
            {
                this$0 = TransformedTable.this;
                super();
            }
            };
            return Maps.transformValues(fromTable.rowMap(), function1);
        }

        public int size()
        {
            return fromTable.size();
        }

        TransformedTable(Table table, Function function1)
        {
            fromTable = (Table)Preconditions.checkNotNull(table);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }

    private static class TransposeTable extends AbstractTable
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


        TransposeTable(Table table)
        {
            original = (Table)Preconditions.checkNotNull(table);
        }
    }

    static final class UnmodifiableRowSortedMap extends UnmodifiableTable
        implements RowSortedTable
    {

        private static final long serialVersionUID = 0L;

        protected RowSortedTable _mthdelegate()
        {
            return (RowSortedTable)super._mthdelegate();
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
            Function function = Tables.unmodifiableWrapper();
            return Collections.unmodifiableSortedMap(Maps.transformValues(_mthdelegate().rowMap(), function));
        }

        public UnmodifiableRowSortedMap(RowSortedTable rowsortedtable)
        {
            super(rowsortedtable);
        }
    }

    private static class UnmodifiableTable extends ForwardingTable
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Table _flddelegate;

        public Set cellSet()
        {
            return Collections.unmodifiableSet(super.cellSet());
        }

        public void clear()
        {
            throw new UnsupportedOperationException();
        }

        public Map column(Object obj)
        {
            return Collections.unmodifiableMap(super.column(obj));
        }

        public Set columnKeySet()
        {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        public Map columnMap()
        {
            Function function = Tables.unmodifiableWrapper();
            return Collections.unmodifiableMap(Maps.transformValues(super.columnMap(), function));
        }

        protected Table _mthdelegate()
        {
            return _flddelegate;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
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
            throw new UnsupportedOperationException();
        }

        public Map row(Object obj)
        {
            return Collections.unmodifiableMap(super.row(obj));
        }

        public Set rowKeySet()
        {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        public Map rowMap()
        {
            Function function = Tables.unmodifiableWrapper();
            return Collections.unmodifiableMap(Maps.transformValues(super.rowMap(), function));
        }

        public Collection values()
        {
            return Collections.unmodifiableCollection(super.values());
        }

        UnmodifiableTable(Table table)
        {
            _flddelegate = (Table)Preconditions.checkNotNull(table);
        }
    }


    private static final Function UNMODIFIABLE_WRAPPER = new Function() {

        public volatile Object apply(Object obj)
        {
            return apply((Map)obj);
        }

        public Map apply(Map map)
        {
            return Collections.unmodifiableMap(map);
        }

    };

    private Tables()
    {
    }

    static boolean equalsImpl(Table table, Object obj)
    {
        if (obj == table)
        {
            return true;
        }
        if (obj instanceof Table)
        {
            obj = (Table)obj;
            return table.cellSet().equals(((Table) (obj)).cellSet());
        } else
        {
            return false;
        }
    }

    public static Table.Cell immutableCell(Object obj, Object obj1, Object obj2)
    {
        return new ImmutableCell(obj, obj1, obj2);
    }

    public static Table newCustomTable(Map map, Supplier supplier)
    {
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkNotNull(supplier);
        return new StandardTable(map, supplier);
    }

    public static Table transformValues(Table table, Function function)
    {
        return new TransformedTable(table, function);
    }

    public static Table transpose(Table table)
    {
        if (table instanceof TransposeTable)
        {
            return ((TransposeTable)table).original;
        } else
        {
            return new TransposeTable(table);
        }
    }

    public static RowSortedTable unmodifiableRowSortedTable(RowSortedTable rowsortedtable)
    {
        return new UnmodifiableRowSortedMap(rowsortedtable);
    }

    public static Table unmodifiableTable(Table table)
    {
        return new UnmodifiableTable(table);
    }

    private static Function unmodifiableWrapper()
    {
        return UNMODIFIABLE_WRAPPER;
    }


}
