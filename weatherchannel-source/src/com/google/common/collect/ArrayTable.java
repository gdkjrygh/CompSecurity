// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractTable, ImmutableList, Table, ImmutableMap, 
//            ImmutableSet, AbstractIndexedListIterator, AbstractMapEntry

public final class ArrayTable extends AbstractTable
    implements Serializable
{
    private static abstract class ArrayMap extends Maps.ImprovedAbstractMap
    {

        private final ImmutableMap keyIndex;

        public void clear()
        {
            throw new UnsupportedOperationException();
        }

        public boolean containsKey(Object obj)
        {
            return keyIndex.containsKey(obj);
        }

        protected Set createEntrySet()
        {
            return new Maps.EntrySet() {

                final ArrayMap this$0;

                public Iterator iterator()
                {
                    return new AbstractIndexedListIterator(size()) {

                        final ArrayMap._cls1 this$1;

                        protected volatile Object get(int i)
                        {
                            return get(i);
                        }

                        protected java.util.Map.Entry get(int i)
                        {
                            return i. new AbstractMapEntry() {

                                final ArrayMap._cls1._cls1 this$2;
                                final int val$index;

                                public Object getKey()
                                {
                                    return ArrayMap.this.getKey(index);
                                }

                                public Object getValue()
                                {
                                    return ArrayMap.this.getValue(index);
                                }

                                public Object setValue(Object obj)
                                {
                                    return ArrayMap.this.setValue(index, obj);
                                }

            
            {
                this$2 = final__pcls1;
                index = I.this;
                super();
            }
                            };
                        }

            
            {
                this$1 = ArrayMap._cls1.this;
                super(i);
            }
                    };
                }

                Map map()
                {
                    return ArrayMap.this;
                }

            
            {
                this$0 = ArrayMap.this;
                super();
            }
            };
        }

        public Object get(Object obj)
        {
            obj = (Integer)keyIndex.get(obj);
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
            return keyIndex.keySet().asList().get(i);
        }

        abstract String getKeyRole();

        abstract Object getValue(int i);

        public boolean isEmpty()
        {
            return keyIndex.isEmpty();
        }

        public Set keySet()
        {
            return keyIndex.keySet();
        }

        public Object put(Object obj, Object obj1)
        {
            Object obj2 = (Integer)keyIndex.get(obj);
            if (obj2 == null)
            {
                obj1 = String.valueOf(String.valueOf(getKeyRole()));
                obj = String.valueOf(String.valueOf(obj));
                obj2 = String.valueOf(String.valueOf(keyIndex.keySet()));
                throw new IllegalArgumentException((new StringBuilder(((String) (obj1)).length() + 9 + ((String) (obj)).length() + ((String) (obj2)).length())).append(((String) (obj1))).append(" ").append(((String) (obj))).append(" not in ").append(((String) (obj2))).toString());
            } else
            {
                return setValue(((Integer) (obj2)).intValue(), obj1);
            }
        }

        public Object remove(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        abstract Object setValue(int i, Object obj);

        public int size()
        {
            return keyIndex.size();
        }

        private ArrayMap(ImmutableMap immutablemap)
        {
            keyIndex = immutablemap;
        }

    }

    private class Column extends ArrayMap
    {

        final int columnIndex;
        final ArrayTable this$0;

        String getKeyRole()
        {
            return "Row";
        }

        Object getValue(int i)
        {
            return at(i, columnIndex);
        }

        Object setValue(int i, Object obj)
        {
            return set(i, columnIndex, obj);
        }

        Column(int i)
        {
            this$0 = ArrayTable.this;
            super(rowKeyToIndex);
            columnIndex = i;
        }
    }

    private class ColumnMap extends ArrayMap
    {

        final ArrayTable this$0;

        String getKeyRole()
        {
            return "Column";
        }

        volatile Object getValue(int i)
        {
            return getValue(i);
        }

        Map getValue(int i)
        {
            return new Column(i);
        }

        public volatile Object put(Object obj, Object obj1)
        {
            return put(obj, (Map)obj1);
        }

        public Map put(Object obj, Map map)
        {
            throw new UnsupportedOperationException();
        }

        volatile Object setValue(int i, Object obj)
        {
            return setValue(i, (Map)obj);
        }

        Map setValue(int i, Map map)
        {
            throw new UnsupportedOperationException();
        }

        private ColumnMap()
        {
            this$0 = ArrayTable.this;
            super(columnKeyToIndex);
        }

    }

    private class Row extends ArrayMap
    {

        final int rowIndex;
        final ArrayTable this$0;

        String getKeyRole()
        {
            return "Column";
        }

        Object getValue(int i)
        {
            return at(rowIndex, i);
        }

        Object setValue(int i, Object obj)
        {
            return set(rowIndex, i, obj);
        }

        Row(int i)
        {
            this$0 = ArrayTable.this;
            super(columnKeyToIndex);
            rowIndex = i;
        }
    }

    private class RowMap extends ArrayMap
    {

        final ArrayTable this$0;

        String getKeyRole()
        {
            return "Row";
        }

        volatile Object getValue(int i)
        {
            return getValue(i);
        }

        Map getValue(int i)
        {
            return new Row(i);
        }

        public volatile Object put(Object obj, Object obj1)
        {
            return put(obj, (Map)obj1);
        }

        public Map put(Object obj, Map map)
        {
            throw new UnsupportedOperationException();
        }

        volatile Object setValue(int i, Object obj)
        {
            return setValue(i, (Map)obj);
        }

        Map setValue(int i, Map map)
        {
            throw new UnsupportedOperationException();
        }

        private RowMap()
        {
            this$0 = ArrayTable.this;
            super(rowKeyToIndex);
        }

    }


    private static final long serialVersionUID = 0L;
    private final Object array[][];
    private final ImmutableMap columnKeyToIndex;
    private final ImmutableList columnList;
    private transient ColumnMap columnMap;
    private final ImmutableMap rowKeyToIndex;
    private final ImmutableList rowList;
    private transient RowMap rowMap;

    private ArrayTable(ArrayTable arraytable)
    {
        rowList = arraytable.rowList;
        columnList = arraytable.columnList;
        rowKeyToIndex = arraytable.rowKeyToIndex;
        columnKeyToIndex = arraytable.columnKeyToIndex;
        Object aobj[][] = (Object[][])(Object[][])Array.newInstance(java/lang/Object, new int[] {
            rowList.size(), columnList.size()
        });
        array = aobj;
        eraseAll();
        for (int i = 0; i < rowList.size(); i++)
        {
            System.arraycopy(((Object) (arraytable.array[i])), 0, ((Object) (aobj[i])), 0, arraytable.array[i].length);
        }

    }

    private ArrayTable(Table table)
    {
        this(((Iterable) (table.rowKeySet())), ((Iterable) (table.columnKeySet())));
        putAll(table);
    }

    private ArrayTable(Iterable iterable, Iterable iterable1)
    {
        boolean flag1 = true;
        super();
        rowList = ImmutableList.copyOf(iterable);
        columnList = ImmutableList.copyOf(iterable1);
        boolean flag;
        if (!rowList.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (!columnList.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        rowKeyToIndex = index(rowList);
        columnKeyToIndex = index(columnList);
        array = (Object[][])(Object[][])Array.newInstance(java/lang/Object, new int[] {
            rowList.size(), columnList.size()
        });
        eraseAll();
    }

    public static ArrayTable create(Table table)
    {
        if (table instanceof ArrayTable)
        {
            return new ArrayTable((ArrayTable)table);
        } else
        {
            return new ArrayTable(table);
        }
    }

    public static ArrayTable create(Iterable iterable, Iterable iterable1)
    {
        return new ArrayTable(iterable, iterable1);
    }

    private static ImmutableMap index(List list)
    {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (int i = 0; i < list.size(); i++)
        {
            builder.put(list.get(i), Integer.valueOf(i));
        }

        return builder.build();
    }

    public Object at(int i, int j)
    {
        Preconditions.checkElementIndex(i, rowList.size());
        Preconditions.checkElementIndex(j, columnList.size());
        return array[i][j];
    }

    Iterator cellIterator()
    {
        return new AbstractIndexedListIterator(size()) {

            final ArrayTable this$0;

            protected Table.Cell get(int i)
            {
                return i. new Tables.AbstractCell() {

                    final int columnIndex;
                    final int rowIndex;
                    final _cls1 this$1;
                    final int val$index;

                    public Object getColumnKey()
                    {
                        return columnList.get(columnIndex);
                    }

                    public Object getRowKey()
                    {
                        return rowList.get(rowIndex);
                    }

                    public Object getValue()
                    {
                        return at(rowIndex, columnIndex);
                    }

            
            {
                this$1 = final__pcls1;
                index = I.this;
                super();
                rowIndex = index / columnList.size();
                columnIndex = index % columnList.size();
            }
                };
            }

            protected volatile Object get(int i)
            {
                return get(i);
            }

            
            {
                this$0 = ArrayTable.this;
                super(i);
            }
        };
    }

    public Set cellSet()
    {
        return super.cellSet();
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    public Map column(Object obj)
    {
        Preconditions.checkNotNull(obj);
        obj = (Integer)columnKeyToIndex.get(obj);
        if (obj == null)
        {
            return ImmutableMap.of();
        } else
        {
            return new Column(((Integer) (obj)).intValue());
        }
    }

    public ImmutableList columnKeyList()
    {
        return columnList;
    }

    public ImmutableSet columnKeySet()
    {
        return columnKeyToIndex.keySet();
    }

    public volatile Set columnKeySet()
    {
        return columnKeySet();
    }

    public Map columnMap()
    {
        ColumnMap columnmap1 = columnMap;
        ColumnMap columnmap = columnmap1;
        if (columnmap1 == null)
        {
            columnmap = new ColumnMap();
            columnMap = columnmap;
        }
        return columnmap;
    }

    public boolean contains(Object obj, Object obj1)
    {
        return containsRow(obj) && containsColumn(obj1);
    }

    public boolean containsColumn(Object obj)
    {
        return columnKeyToIndex.containsKey(obj);
    }

    public boolean containsRow(Object obj)
    {
        return rowKeyToIndex.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        Object aobj[][] = array;
        int k = aobj.length;
        for (int i = 0; i < k; i++)
        {
            Object aobj1[] = aobj[i];
            int l = aobj1.length;
            for (int j = 0; j < l; j++)
            {
                if (Objects.equal(obj, aobj1[j]))
                {
                    return true;
                }
            }

        }

        return false;
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public Object erase(Object obj, Object obj1)
    {
        obj = (Integer)rowKeyToIndex.get(obj);
        obj1 = (Integer)columnKeyToIndex.get(obj1);
        if (obj == null || obj1 == null)
        {
            return null;
        } else
        {
            return set(((Integer) (obj)).intValue(), ((Integer) (obj1)).intValue(), null);
        }
    }

    public void eraseAll()
    {
        Object aobj[][] = array;
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Arrays.fill(aobj[i], null);
        }

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
            return at(((Integer) (obj)).intValue(), ((Integer) (obj1)).intValue());
        }
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        Integer integer = (Integer)rowKeyToIndex.get(obj);
        boolean flag;
        if (integer != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Row %s not in %s", new Object[] {
            obj, rowList
        });
        obj = (Integer)columnKeyToIndex.get(obj1);
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Column %s not in %s", new Object[] {
            obj1, columnList
        });
        return set(integer.intValue(), ((Integer) (obj)).intValue(), obj2);
    }

    public void putAll(Table table)
    {
        super.putAll(table);
    }

    public Object remove(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public Map row(Object obj)
    {
        Preconditions.checkNotNull(obj);
        obj = (Integer)rowKeyToIndex.get(obj);
        if (obj == null)
        {
            return ImmutableMap.of();
        } else
        {
            return new Row(((Integer) (obj)).intValue());
        }
    }

    public ImmutableList rowKeyList()
    {
        return rowList;
    }

    public ImmutableSet rowKeySet()
    {
        return rowKeyToIndex.keySet();
    }

    public volatile Set rowKeySet()
    {
        return rowKeySet();
    }

    public Map rowMap()
    {
        RowMap rowmap1 = rowMap;
        RowMap rowmap = rowmap1;
        if (rowmap1 == null)
        {
            rowmap = new RowMap();
            rowMap = rowmap;
        }
        return rowmap;
    }

    public Object set(int i, int j, Object obj)
    {
        Preconditions.checkElementIndex(i, rowList.size());
        Preconditions.checkElementIndex(j, columnList.size());
        Object obj1 = array[i][j];
        array[i][j] = obj;
        return obj1;
    }

    public int size()
    {
        return rowList.size() * columnList.size();
    }

    public Object[][] toArray(Class class1)
    {
        class1 = ((Class) ((Object[][])(Object[][])Array.newInstance(class1, new int[] {
            rowList.size(), columnList.size()
        })));
        for (int i = 0; i < rowList.size(); i++)
        {
            System.arraycopy(((Object) (array[i])), 0, class1[i], 0, array[i].length);
        }

        return class1;
    }

    public volatile String toString()
    {
        return super.toString();
    }

    public Collection values()
    {
        return super.values();
    }




}
