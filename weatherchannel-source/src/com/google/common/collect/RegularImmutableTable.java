// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableTable, ImmutableSet, ImmutableList, Lists, 
//            DenseImmutableTable, SparseImmutableTable, ImmutableCollection, UnmodifiableIterator, 
//            ImmutableAsList

abstract class RegularImmutableTable extends ImmutableTable
{
    private final class CellSet extends ImmutableSet
    {

        final RegularImmutableTable this$0;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Table.Cell)
            {
                obj = (Table.Cell)obj;
                Object obj1 = get(((Table.Cell) (obj)).getRowKey(), ((Table.Cell) (obj)).getColumnKey());
                flag = flag1;
                if (obj1 != null)
                {
                    flag = flag1;
                    if (obj1.equals(((Table.Cell) (obj)).getValue()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        ImmutableList createAsList()
        {
            return new ImmutableAsList() {

                final CellSet this$1;

                ImmutableCollection delegateCollection()
                {
                    return CellSet.this;
                }

                public Table.Cell get(int i)
                {
                    return getCell(i);
                }

                public volatile Object get(int i)
                {
                    return get(i);
                }

            
            {
                this$1 = CellSet.this;
                super();
            }
            };
        }

        boolean isPartialView()
        {
            return false;
        }

        public UnmodifiableIterator iterator()
        {
            return asList().iterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return RegularImmutableTable.this.size();
        }

        private CellSet()
        {
            this$0 = RegularImmutableTable.this;
            super();
        }

    }

    private final class Values extends ImmutableList
    {

        final RegularImmutableTable this$0;

        public Object get(int i)
        {
            return getValue(i);
        }

        boolean isPartialView()
        {
            return true;
        }

        public int size()
        {
            return RegularImmutableTable.this.size();
        }

        private Values()
        {
            this$0 = RegularImmutableTable.this;
            super();
        }

    }


    RegularImmutableTable()
    {
    }

    static RegularImmutableTable forCells(Iterable iterable)
    {
        return forCellsInternal(iterable, null, null);
    }

    static RegularImmutableTable forCells(List list, Comparator comparator, Comparator comparator1)
    {
        Preconditions.checkNotNull(list);
        if (comparator != null || comparator1 != null)
        {
            Collections.sort(list, new Comparator(comparator, comparator1) {

                final Comparator val$columnComparator;
                final Comparator val$rowComparator;

                public int compare(Table.Cell cell, Table.Cell cell1)
                {
                    boolean flag = false;
                    int i;
                    if (rowComparator == null)
                    {
                        i = 0;
                    } else
                    {
                        i = rowComparator.compare(cell.getRowKey(), cell1.getRowKey());
                    }
                    if (i != 0)
                    {
                        return i;
                    }
                    if (columnComparator == null)
                    {
                        i = ((flag) ? 1 : 0);
                    } else
                    {
                        i = columnComparator.compare(cell.getColumnKey(), cell1.getColumnKey());
                    }
                    return i;
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((Table.Cell)obj, (Table.Cell)obj1);
                }

            
            {
                rowComparator = comparator;
                columnComparator = comparator1;
                super();
            }
            });
        }
        return forCellsInternal(list, comparator, comparator1);
    }

    private static final RegularImmutableTable forCellsInternal(Iterable iterable, Comparator comparator, Comparator comparator1)
    {
        Object obj = ImmutableSet.builder();
        ImmutableSet.Builder builder = ImmutableSet.builder();
        ImmutableList immutablelist = ImmutableList.copyOf(iterable);
        Table.Cell cell;
        for (iterable = immutablelist.iterator(); iterable.hasNext(); builder.add(cell.getColumnKey()))
        {
            cell = (Table.Cell)iterable.next();
            ((ImmutableSet.Builder) (obj)).add(cell.getRowKey());
        }

        obj = ((ImmutableSet.Builder) (obj)).build();
        iterable = ((Iterable) (obj));
        if (comparator != null)
        {
            iterable = Lists.newArrayList(((Iterable) (obj)));
            Collections.sort(iterable, comparator);
            iterable = ImmutableSet.copyOf(iterable);
        }
        obj = builder.build();
        comparator = ((Comparator) (obj));
        if (comparator1 != null)
        {
            comparator = Lists.newArrayList(((Iterable) (obj)));
            Collections.sort(comparator, comparator1);
            comparator = ImmutableSet.copyOf(comparator);
        }
        if ((long)immutablelist.size() > ((long)iterable.size() * (long)comparator.size()) / 2L)
        {
            return new DenseImmutableTable(immutablelist, iterable, comparator);
        } else
        {
            return new SparseImmutableTable(immutablelist, iterable, comparator);
        }
    }

    final ImmutableSet createCellSet()
    {
        if (isEmpty())
        {
            return ImmutableSet.of();
        } else
        {
            return new CellSet();
        }
    }

    volatile Set createCellSet()
    {
        return createCellSet();
    }

    final ImmutableCollection createValues()
    {
        if (isEmpty())
        {
            return ImmutableList.of();
        } else
        {
            return new Values();
        }
    }

    volatile Collection createValues()
    {
        return createValues();
    }

    abstract Table.Cell getCell(int i);

    abstract Object getValue(int i);
}
