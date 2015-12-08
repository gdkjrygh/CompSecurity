// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractTable, SparseImmutableTable, ImmutableList, ImmutableSet, 
//            Tables, Table, Iterables, RegularImmutableTable, 
//            SingletonImmutableTable, ImmutableMap, ImmutableCollection, UnmodifiableIterator, 
//            Lists

public abstract class ImmutableTable extends AbstractTable
{
    public static final class Builder
    {

        private final List cells = Lists.newArrayList();
        private Comparator columnComparator;
        private Comparator rowComparator;

        public ImmutableTable build()
        {
            switch (cells.size())
            {
            default:
                return RegularImmutableTable.forCells(cells, rowComparator, columnComparator);

            case 0: // '\0'
                return ImmutableTable.of();

            case 1: // '\001'
                return new SingletonImmutableTable((Table.Cell)Iterables.getOnlyElement(cells));
            }
        }

        public Builder orderColumnsBy(Comparator comparator)
        {
            columnComparator = (Comparator)Preconditions.checkNotNull(comparator);
            return this;
        }

        public Builder orderRowsBy(Comparator comparator)
        {
            rowComparator = (Comparator)Preconditions.checkNotNull(comparator);
            return this;
        }

        public Builder put(Table.Cell cell)
        {
            if (cell instanceof Tables.ImmutableCell)
            {
                Preconditions.checkNotNull(cell.getRowKey());
                Preconditions.checkNotNull(cell.getColumnKey());
                Preconditions.checkNotNull(cell.getValue());
                cells.add(cell);
                return this;
            } else
            {
                put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
                return this;
            }
        }

        public Builder put(Object obj, Object obj1, Object obj2)
        {
            cells.add(ImmutableTable.cellOf(obj, obj1, obj2));
            return this;
        }

        public Builder putAll(Table table)
        {
            for (table = table.cellSet().iterator(); table.hasNext(); put((Table.Cell)table.next())) { }
            return this;
        }

        public Builder()
        {
        }
    }


    private static final ImmutableTable EMPTY = new SparseImmutableTable(ImmutableList.of(), ImmutableSet.of(), ImmutableSet.of());

    ImmutableTable()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    static Table.Cell cellOf(Object obj, Object obj1, Object obj2)
    {
        return Tables.immutableCell(Preconditions.checkNotNull(obj), Preconditions.checkNotNull(obj1), Preconditions.checkNotNull(obj2));
    }

    public static ImmutableTable copyOf(Table table)
    {
        if (table instanceof ImmutableTable)
        {
            return (ImmutableTable)table;
        }
        ImmutableSet.Builder builder1;
        switch (table.size())
        {
        default:
            builder1 = ImmutableSet.builder();
            Table.Cell cell;
            for (table = table.cellSet().iterator(); table.hasNext(); builder1.add(cellOf(cell.getRowKey(), cell.getColumnKey(), cell.getValue())))
            {
                cell = (Table.Cell)table.next();
            }

            break;

        case 0: // '\0'
            return of();

        case 1: // '\001'
            table = (Table.Cell)Iterables.getOnlyElement(table.cellSet());
            return of(table.getRowKey(), table.getColumnKey(), table.getValue());
        }
        return RegularImmutableTable.forCells(builder1.build());
    }

    public static ImmutableTable of()
    {
        return EMPTY;
    }

    public static ImmutableTable of(Object obj, Object obj1, Object obj2)
    {
        return new SingletonImmutableTable(obj, obj1, obj2);
    }

    final UnmodifiableIterator cellIterator()
    {
        throw new AssertionError("should never be called");
    }

    volatile Iterator cellIterator()
    {
        return cellIterator();
    }

    public ImmutableSet cellSet()
    {
        return (ImmutableSet)super.cellSet();
    }

    public volatile Set cellSet()
    {
        return cellSet();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableMap column(Object obj)
    {
        Preconditions.checkNotNull(obj);
        return (ImmutableMap)MoreObjects.firstNonNull((ImmutableMap)columnMap().get(obj), ImmutableMap.of());
    }

    public volatile Map column(Object obj)
    {
        return column(obj);
    }

    public ImmutableSet columnKeySet()
    {
        return columnMap().keySet();
    }

    public volatile Set columnKeySet()
    {
        return columnKeySet();
    }

    public abstract ImmutableMap columnMap();

    public volatile Map columnMap()
    {
        return columnMap();
    }

    public boolean contains(Object obj, Object obj1)
    {
        return get(obj, obj1) != null;
    }

    public volatile boolean containsColumn(Object obj)
    {
        return super.containsColumn(obj);
    }

    public volatile boolean containsRow(Object obj)
    {
        return super.containsRow(obj);
    }

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    abstract ImmutableSet createCellSet();

    volatile Set createCellSet()
    {
        return createCellSet();
    }

    abstract ImmutableCollection createValues();

    volatile Collection createValues()
    {
        return createValues();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Object get(Object obj, Object obj1)
    {
        return super.get(obj, obj1);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public final Object put(Object obj, Object obj1, Object obj2)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Table table)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableMap row(Object obj)
    {
        Preconditions.checkNotNull(obj);
        return (ImmutableMap)MoreObjects.firstNonNull((ImmutableMap)rowMap().get(obj), ImmutableMap.of());
    }

    public volatile Map row(Object obj)
    {
        return row(obj);
    }

    public ImmutableSet rowKeySet()
    {
        return rowMap().keySet();
    }

    public volatile Set rowKeySet()
    {
        return rowKeySet();
    }

    public abstract ImmutableMap rowMap();

    public volatile Map rowMap()
    {
        return rowMap();
    }

    public volatile String toString()
    {
        return super.toString();
    }

    public ImmutableCollection values()
    {
        return (ImmutableCollection)super.values();
    }

    public volatile Collection values()
    {
        return values();
    }

    final Iterator valuesIterator()
    {
        throw new AssertionError("should never be called");
    }

}
