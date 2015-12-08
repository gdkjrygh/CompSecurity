// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            RegularImmutableTable, ImmutableSet, ImmutableMap, ImmutableList, 
//            ImmutableMapEntrySet, UnmodifiableIterator, AbstractIterator, Maps

final class DenseImmutableTable extends RegularImmutableTable
{
    private final class Column extends ImmutableArrayMap
    {

        private final int columnIndex;
        final DenseImmutableTable this$0;

        Object getValue(int i)
        {
            return values[i][columnIndex];
        }

        boolean isPartialView()
        {
            return true;
        }

        ImmutableMap keyToIndex()
        {
            return rowKeyToIndex;
        }

        Column(int i)
        {
            this$0 = DenseImmutableTable.this;
            super(columnCounts[i]);
            columnIndex = i;
        }
    }

    private final class ColumnMap extends ImmutableArrayMap
    {

        final DenseImmutableTable this$0;

        volatile Object getValue(int i)
        {
            return getValue(i);
        }

        Map getValue(int i)
        {
            return new Column(i);
        }

        boolean isPartialView()
        {
            return false;
        }

        ImmutableMap keyToIndex()
        {
            return columnKeyToIndex;
        }

        private ColumnMap()
        {
            this$0 = DenseImmutableTable.this;
            super(columnCounts.length);
        }

    }

    private static abstract class ImmutableArrayMap extends ImmutableMap
    {

        private final int size;

        private boolean isFull()
        {
            return size == keyToIndex().size();
        }

        ImmutableSet createEntrySet()
        {
            return new ImmutableMapEntrySet() {

                final ImmutableArrayMap this$0;

                public UnmodifiableIterator iterator()
                {
                    return new AbstractIterator() {

                        private int index;
                        private final int maxIndex;
                        final ImmutableArrayMap._cls1 this$1;

                        protected volatile Object computeNext()
                        {
                            return computeNext();
                        }

                        protected java.util.Map.Entry computeNext()
                        {
                            for (index = index + 1; index < maxIndex; index = index + 1)
                            {
                                Object obj = getValue(index);
                                if (obj != null)
                                {
                                    return Maps.immutableEntry(getKey(index), obj);
                                }
                            }

                            return (java.util.Map.Entry)endOfData();
                        }

            
            {
                this$1 = ImmutableArrayMap._cls1.this;
                super();
                index = -1;
                maxIndex = keyToIndex().size();
            }
                    };
                }

                public volatile Iterator iterator()
                {
                    return iterator();
                }

                ImmutableMap map()
                {
                    return ImmutableArrayMap.this;
                }

            
            {
                this$0 = ImmutableArrayMap.this;
                super();
            }
            };
        }

        ImmutableSet createKeySet()
        {
            if (isFull())
            {
                return keyToIndex().keySet();
            } else
            {
                return super.createKeySet();
            }
        }

        public Object get(Object obj)
        {
            obj = (Integer)keyToIndex().get(obj);
            if (obj == null)
            {
                return null;
            } else
            {
                return getValue(((Integer) (obj)).intValue());
            }
        }

        Object getKey(int i)
        {
            return keyToIndex().keySet().asList().get(i);
        }

        abstract Object getValue(int i);

        abstract ImmutableMap keyToIndex();

        public int size()
        {
            return size;
        }

        ImmutableArrayMap(int i)
        {
            size = i;
        }
    }

    private final class Row extends ImmutableArrayMap
    {

        private final int rowIndex;
        final DenseImmutableTable this$0;

        Object getValue(int i)
        {
            return values[rowIndex][i];
        }

        boolean isPartialView()
        {
            return true;
        }

        ImmutableMap keyToIndex()
        {
            return columnKeyToIndex;
        }

        Row(int i)
        {
            this$0 = DenseImmutableTable.this;
            super(rowCounts[i]);
            rowIndex = i;
        }
    }

    private final class RowMap extends ImmutableArrayMap
    {

        final DenseImmutableTable this$0;

        volatile Object getValue(int i)
        {
            return getValue(i);
        }

        Map getValue(int i)
        {
            return new Row(i);
        }

        boolean isPartialView()
        {
            return false;
        }

        ImmutableMap keyToIndex()
        {
            return rowKeyToIndex;
        }

        private RowMap()
        {
            this$0 = DenseImmutableTable.this;
            super(rowCounts.length);
        }

    }


    private final int columnCounts[];
    private final ImmutableMap columnKeyToIndex;
    private final ImmutableMap columnMap = new ColumnMap();
    private final int iterationOrderColumn[];
    private final int iterationOrderRow[];
    private final int rowCounts[];
    private final ImmutableMap rowKeyToIndex;
    private final ImmutableMap rowMap = new RowMap();
    private final Object values[][];

    DenseImmutableTable(ImmutableList immutablelist, ImmutableSet immutableset, ImmutableSet immutableset1)
    {
        values = (Object[][])(Object[][])Array.newInstance(java/lang/Object, new int[] {
            immutableset.size(), immutableset1.size()
        });
        rowKeyToIndex = makeIndex(immutableset);
        columnKeyToIndex = makeIndex(immutableset1);
        rowCounts = new int[rowKeyToIndex.size()];
        columnCounts = new int[columnKeyToIndex.size()];
        immutableset = new int[immutablelist.size()];
        immutableset1 = new int[immutablelist.size()];
        int i = 0;
        while (i < immutablelist.size()) 
        {
            Table.Cell cell = (Table.Cell)immutablelist.get(i);
            Object obj = cell.getRowKey();
            Object obj1 = cell.getColumnKey();
            int j = ((Integer)rowKeyToIndex.get(obj)).intValue();
            int k = ((Integer)columnKeyToIndex.get(obj1)).intValue();
            int ai[];
            boolean flag;
            if (values[j][k] == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "duplicate key: (%s, %s)", new Object[] {
                obj, obj1
            });
            values[j][k] = cell.getValue();
            ai = rowCounts;
            ai[j] = ai[j] + 1;
            ai = columnCounts;
            ai[k] = ai[k] + 1;
            immutableset[i] = j;
            immutableset1[i] = k;
            i++;
        }
        iterationOrderRow = immutableset;
        iterationOrderColumn = immutableset1;
    }

    private static ImmutableMap makeIndex(ImmutableSet immutableset)
    {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i = 0;
        for (immutableset = immutableset.iterator(); immutableset.hasNext();)
        {
            builder.put(immutableset.next(), Integer.valueOf(i));
            i++;
        }

        return builder.build();
    }

    public ImmutableMap columnMap()
    {
        return columnMap;
    }

    public volatile Map columnMap()
    {
        return columnMap();
    }

    public Object get(Object obj, Object obj1)
    {
        obj = (Integer)rowKeyToIndex.get(obj);
        obj1 = (Integer)columnKeyToIndex.get(obj1);
        if (obj == null || obj1 == null)
        {
            return null;
        } else
        {
            return values[((Integer) (obj)).intValue()][((Integer) (obj1)).intValue()];
        }
    }

    Table.Cell getCell(int i)
    {
        int j = iterationOrderRow[i];
        i = iterationOrderColumn[i];
        return cellOf(rowKeySet().asList().get(j), columnKeySet().asList().get(i), values[j][i]);
    }

    Object getValue(int i)
    {
        return values[iterationOrderRow[i]][iterationOrderColumn[i]];
    }

    public ImmutableMap rowMap()
    {
        return rowMap;
    }

    public volatile Map rowMap()
    {
        return rowMap();
    }

    public int size()
    {
        return iterationOrderRow.length;
    }





}
