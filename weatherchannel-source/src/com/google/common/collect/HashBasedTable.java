// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, CollectPreconditions, Maps, Table

public class HashBasedTable extends StandardTable
{
    private static class Factory
        implements Supplier, Serializable
    {

        private static final long serialVersionUID = 0L;
        final int expectedSize;

        public volatile Object get()
        {
            return get();
        }

        public Map get()
        {
            return Maps.newHashMapWithExpectedSize(expectedSize);
        }

        Factory(int i)
        {
            expectedSize = i;
        }
    }


    private static final long serialVersionUID = 0L;

    HashBasedTable(Map map, Factory factory)
    {
        super(map, factory);
    }

    public static HashBasedTable create()
    {
        return new HashBasedTable(new HashMap(), new Factory(0));
    }

    public static HashBasedTable create(int i, int j)
    {
        CollectPreconditions.checkNonnegative(j, "expectedCellsPerRow");
        return new HashBasedTable(Maps.newHashMapWithExpectedSize(i), new Factory(j));
    }

    public static HashBasedTable create(Table table)
    {
        HashBasedTable hashbasedtable = create();
        hashbasedtable.putAll(table);
        return hashbasedtable;
    }

    public volatile Set cellSet()
    {
        return super.cellSet();
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile Map column(Object obj)
    {
        return super.column(obj);
    }

    public volatile Set columnKeySet()
    {
        return super.columnKeySet();
    }

    public volatile Map columnMap()
    {
        return super.columnMap();
    }

    public boolean contains(Object obj, Object obj1)
    {
        return super.contains(obj, obj1);
    }

    public boolean containsColumn(Object obj)
    {
        return super.containsColumn(obj);
    }

    public boolean containsRow(Object obj)
    {
        return super.containsRow(obj);
    }

    public boolean containsValue(Object obj)
    {
        return super.containsValue(obj);
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public Object get(Object obj, Object obj1)
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

    public volatile Object put(Object obj, Object obj1, Object obj2)
    {
        return super.put(obj, obj1, obj2);
    }

    public volatile void putAll(Table table)
    {
        super.putAll(table);
    }

    public Object remove(Object obj, Object obj1)
    {
        return super.remove(obj, obj1);
    }

    public volatile Map row(Object obj)
    {
        return super.row(obj);
    }

    public volatile Set rowKeySet()
    {
        return super.rowKeySet();
    }

    public volatile Map rowMap()
    {
        return super.rowMap();
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }

    public volatile Collection values()
    {
        return super.values();
    }
}
