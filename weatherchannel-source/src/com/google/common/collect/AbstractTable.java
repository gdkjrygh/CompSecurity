// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Table, Iterators, Maps, Tables, 
//            Collections2, TransformedIterator

abstract class AbstractTable
    implements Table
{
    class CellSet extends AbstractSet
    {

        final AbstractTable this$0;

        public void clear()
        {
            AbstractTable.this.clear();
        }

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Table.Cell)
            {
                obj = (Table.Cell)obj;
                Map map = (Map)Maps.safeGet(rowMap(), ((Table.Cell) (obj)).getRowKey());
                flag = flag1;
                if (map != null)
                {
                    flag = flag1;
                    if (Collections2.safeContains(map.entrySet(), Maps.immutableEntry(((Table.Cell) (obj)).getColumnKey(), ((Table.Cell) (obj)).getValue())))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public Iterator iterator()
        {
            return cellIterator();
        }

        public boolean remove(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Table.Cell)
            {
                obj = (Table.Cell)obj;
                Map map = (Map)Maps.safeGet(rowMap(), ((Table.Cell) (obj)).getRowKey());
                flag = flag1;
                if (map != null)
                {
                    flag = flag1;
                    if (Collections2.safeRemove(map.entrySet(), Maps.immutableEntry(((Table.Cell) (obj)).getColumnKey(), ((Table.Cell) (obj)).getValue())))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int size()
        {
            return AbstractTable.this.size();
        }

        CellSet()
        {
            this$0 = AbstractTable.this;
            super();
        }
    }

    class Values extends AbstractCollection
    {

        final AbstractTable this$0;

        public void clear()
        {
            AbstractTable.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsValue(obj);
        }

        public Iterator iterator()
        {
            return valuesIterator();
        }

        public int size()
        {
            return AbstractTable.this.size();
        }

        Values()
        {
            this$0 = AbstractTable.this;
            super();
        }
    }


    private transient Set cellSet;
    private transient Collection values;

    AbstractTable()
    {
    }

    abstract Iterator cellIterator();

    public Set cellSet()
    {
        Set set1 = cellSet;
        Set set = set1;
        if (set1 == null)
        {
            set = createCellSet();
            cellSet = set;
        }
        return set;
    }

    public void clear()
    {
        Iterators.clear(cellSet().iterator());
    }

    public Set columnKeySet()
    {
        return columnMap().keySet();
    }

    public boolean contains(Object obj, Object obj1)
    {
        obj = (Map)Maps.safeGet(rowMap(), obj);
        return obj != null && Maps.safeContainsKey(((Map) (obj)), obj1);
    }

    public boolean containsColumn(Object obj)
    {
        return Maps.safeContainsKey(columnMap(), obj);
    }

    public boolean containsRow(Object obj)
    {
        return Maps.safeContainsKey(rowMap(), obj);
    }

    public boolean containsValue(Object obj)
    {
        for (Iterator iterator = rowMap().values().iterator(); iterator.hasNext();)
        {
            if (((Map)iterator.next()).containsValue(obj))
            {
                return true;
            }
        }

        return false;
    }

    Set createCellSet()
    {
        return new CellSet();
    }

    Collection createValues()
    {
        return new Values();
    }

    public boolean equals(Object obj)
    {
        return Tables.equalsImpl(this, obj);
    }

    public Object get(Object obj, Object obj1)
    {
        obj = (Map)Maps.safeGet(rowMap(), obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return Maps.safeGet(((Map) (obj)), obj1);
        }
    }

    public int hashCode()
    {
        return cellSet().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        return row(obj).put(obj1, obj2);
    }

    public void putAll(Table table)
    {
        Table.Cell cell;
        for (table = table.cellSet().iterator(); table.hasNext(); put(cell.getRowKey(), cell.getColumnKey(), cell.getValue()))
        {
            cell = (Table.Cell)table.next();
        }

    }

    public Object remove(Object obj, Object obj1)
    {
        obj = (Map)Maps.safeGet(rowMap(), obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return Maps.safeRemove(((Map) (obj)), obj1);
        }
    }

    public Set rowKeySet()
    {
        return rowMap().keySet();
    }

    public String toString()
    {
        return rowMap().toString();
    }

    public Collection values()
    {
        Collection collection1 = values;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createValues();
            values = collection;
        }
        return collection;
    }

    Iterator valuesIterator()
    {
        return new TransformedIterator(cellSet().iterator()) {

            final AbstractTable this$0;

            Object transform(Table.Cell cell)
            {
                return cell.getValue();
            }

            volatile Object transform(Object obj)
            {
                return transform((Table.Cell)obj);
            }

            
            {
                this$0 = AbstractTable.this;
                super(iterator);
            }
        };
    }
}
