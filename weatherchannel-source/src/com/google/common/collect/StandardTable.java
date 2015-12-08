// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractTable, Maps, Iterators, Tables, 
//            AbstractIterator, AbstractMapEntry, Sets, Lists, 
//            ForwardingMapEntry, Collections2

class StandardTable extends AbstractTable
    implements Serializable
{
    private class CellIterator
        implements Iterator
    {

        Iterator columnIterator;
        java.util.Map.Entry rowEntry;
        final Iterator rowIterator;
        final StandardTable this$0;

        public boolean hasNext()
        {
            return rowIterator.hasNext() || columnIterator.hasNext();
        }

        public Table.Cell next()
        {
            if (!columnIterator.hasNext())
            {
                rowEntry = (java.util.Map.Entry)rowIterator.next();
                columnIterator = ((Map)rowEntry.getValue()).entrySet().iterator();
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)columnIterator.next();
            return Tables.immutableCell(rowEntry.getKey(), entry.getKey(), entry.getValue());
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            columnIterator.remove();
            if (((Map)rowEntry.getValue()).isEmpty())
            {
                rowIterator.remove();
            }
        }

        private CellIterator()
        {
            this$0 = StandardTable.this;
            super();
            rowIterator = backingMap.entrySet().iterator();
            columnIterator = Iterators.emptyModifiableIterator();
        }

    }

    private class Column extends Maps.ImprovedAbstractMap
    {

        final Object columnKey;
        final StandardTable this$0;

        public boolean containsKey(Object obj)
        {
            return contains(obj, columnKey);
        }

        Set createEntrySet()
        {
            return new EntrySet();
        }

        Set createKeySet()
        {
            return new KeySet();
        }

        Collection createValues()
        {
            return new Values();
        }

        public Object get(Object obj)
        {
            return StandardTable.this.get(obj, columnKey);
        }

        public Object put(Object obj, Object obj1)
        {
            return StandardTable.this.put(obj, columnKey, obj1);
        }

        public Object remove(Object obj)
        {
            return StandardTable.this.remove(obj, columnKey);
        }

        boolean removeFromColumnIf(Predicate predicate)
        {
            boolean flag = false;
            Iterator iterator = backingMap.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Map map = (Map)entry.getValue();
                Object obj = map.get(columnKey);
                if (obj != null && predicate.apply(Maps.immutableEntry(entry.getKey(), obj)))
                {
                    map.remove(columnKey);
                    boolean flag1 = true;
                    flag = flag1;
                    if (map.isEmpty())
                    {
                        iterator.remove();
                        flag = flag1;
                    }
                }
            } while (true);
            return flag;
        }

        Column(Object obj)
        {
            this$0 = StandardTable.this;
            super();
            columnKey = Preconditions.checkNotNull(obj);
        }
    }

    private class Column.EntrySet extends Sets.ImprovedAbstractSet
    {

        final Column this$1;

        public void clear()
        {
            removeFromColumnIf(Predicates.alwaysTrue());
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return containsMapping(((java.util.Map.Entry) (obj)).getKey(), columnKey, ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public boolean isEmpty()
        {
            return !containsColumn(columnKey);
        }

        public Iterator iterator()
        {
            return new Column.EntrySetIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return removeMapping(((java.util.Map.Entry) (obj)).getKey(), columnKey, ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public boolean retainAll(Collection collection)
        {
            return removeFromColumnIf(Predicates.not(Predicates.in(collection)));
        }

        public int size()
        {
            int i = 0;
            Iterator iterator1 = backingMap.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                if (((Map)iterator1.next()).containsKey(columnKey))
                {
                    i++;
                }
            } while (true);
            return i;
        }

        private Column.EntrySet()
        {
            this$1 = Column.this;
            super();
        }

    }

    private class Column.EntrySetIterator extends AbstractIterator
    {

        final Iterator iterator;
        final Column this$1;

        protected volatile Object computeNext()
        {
            return computeNext();
        }

        protected java.util.Map.Entry computeNext()
        {
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (((Map)entry.getValue()).containsKey(columnKey))
                {
                    return entry. new AbstractMapEntry() {

                        final Column.EntrySetIterator this$2;
                        final java.util.Map.Entry val$entry;

                        public Object getKey()
                        {
                            return entry.getKey();
                        }

                        public Object getValue()
                        {
                            return ((Map)entry.getValue()).get(columnKey);
                        }

                        public Object setValue(Object obj)
                        {
                            return ((Map)entry.getValue()).put(columnKey, Preconditions.checkNotNull(obj));
                        }

            
            {
                this$2 = final_entrysetiterator;
                entry = java.util.Map.Entry.this;
                super();
            }
                    };
                }
            }
            return (java.util.Map.Entry)endOfData();
        }

        private Column.EntrySetIterator()
        {
            this$1 = Column.this;
            super();
            iterator = backingMap.entrySet().iterator();
        }

    }

    private class Column.KeySet extends Maps.KeySet
    {

        final Column this$1;

        public boolean contains(Object obj)
        {
            return StandardTable.this.contains(obj, columnKey);
        }

        public boolean remove(Object obj)
        {
            return StandardTable.this.remove(obj, columnKey) != null;
        }

        public boolean retainAll(Collection collection)
        {
            return removeFromColumnIf(Maps.keyPredicateOnEntries(Predicates.not(Predicates.in(collection))));
        }

        Column.KeySet()
        {
            this$1 = Column.this;
            super(Column.this);
        }
    }

    private class Column.Values extends Maps.Values
    {

        final Column this$1;

        public boolean remove(Object obj)
        {
            return obj != null && removeFromColumnIf(Maps.valuePredicateOnEntries(Predicates.equalTo(obj)));
        }

        public boolean removeAll(Collection collection)
        {
            return removeFromColumnIf(Maps.valuePredicateOnEntries(Predicates.in(collection)));
        }

        public boolean retainAll(Collection collection)
        {
            return removeFromColumnIf(Maps.valuePredicateOnEntries(Predicates.not(Predicates.in(collection))));
        }

        Column.Values()
        {
            this$1 = Column.this;
            super(Column.this);
        }
    }

    private class ColumnKeyIterator extends AbstractIterator
    {

        Iterator entryIterator;
        final Iterator mapIterator;
        final Map seen;
        final StandardTable this$0;

        protected Object computeNext()
        {
            do
            {
                if (entryIterator.hasNext())
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)entryIterator.next();
                    if (!seen.containsKey(entry.getKey()))
                    {
                        seen.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                } else
                if (mapIterator.hasNext())
                {
                    entryIterator = ((Map)mapIterator.next()).entrySet().iterator();
                } else
                {
                    return endOfData();
                }
            } while (true);
        }

        private ColumnKeyIterator()
        {
            this$0 = StandardTable.this;
            super();
            seen = (Map)factory.get();
            mapIterator = backingMap.values().iterator();
            entryIterator = Iterators.emptyIterator();
        }

    }

    private class ColumnKeySet extends TableSet
    {

        final StandardTable this$0;

        public boolean contains(Object obj)
        {
            return containsColumn(obj);
        }

        public Iterator iterator()
        {
            return createColumnKeyIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj != null) goto _L2; else goto _L1
_L1:
            boolean flag1 = false;
_L4:
            return flag1;
_L2:
            boolean flag = false;
            Iterator iterator1 = backingMap.values().iterator();
            do
            {
                flag1 = flag;
                if (!iterator1.hasNext())
                {
                    continue;
                }
                Map map = (Map)iterator1.next();
                if (map.keySet().remove(obj))
                {
                    boolean flag2 = true;
                    flag = flag2;
                    if (map.isEmpty())
                    {
                        iterator1.remove();
                        flag = flag2;
                    }
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = backingMap.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Map map = (Map)iterator1.next();
                if (Iterators.removeAll(map.keySet().iterator(), collection))
                {
                    boolean flag1 = true;
                    flag = flag1;
                    if (map.isEmpty())
                    {
                        iterator1.remove();
                        flag = flag1;
                    }
                }
            } while (true);
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = backingMap.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Map map = (Map)iterator1.next();
                if (map.keySet().retainAll(collection))
                {
                    boolean flag1 = true;
                    flag = flag1;
                    if (map.isEmpty())
                    {
                        iterator1.remove();
                        flag = flag1;
                    }
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return Iterators.size(iterator());
        }

        private ColumnKeySet()
        {
            this$0 = StandardTable.this;
            super();
        }

    }

    private class ColumnMap extends Maps.ImprovedAbstractMap
    {

        final StandardTable this$0;

        public boolean containsKey(Object obj)
        {
            return containsColumn(obj);
        }

        public Set createEntrySet()
        {
            return new ColumnMapEntrySet();
        }

        Collection createValues()
        {
            return new ColumnMapValues();
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Map get(Object obj)
        {
            if (containsColumn(obj))
            {
                return column(obj);
            } else
            {
                return null;
            }
        }

        public Set keySet()
        {
            return columnKeySet();
        }

        public volatile Object remove(Object obj)
        {
            return remove(obj);
        }

        public Map remove(Object obj)
        {
            if (containsColumn(obj))
            {
                return removeColumn(obj);
            } else
            {
                return null;
            }
        }

        private ColumnMap()
        {
            this$0 = StandardTable.this;
            super();
        }

    }

    class ColumnMap.ColumnMapEntrySet extends TableSet
    {

        final ColumnMap this$1;

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                if (containsColumn(((java.util.Map.Entry) (obj)).getKey()))
                {
                    Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                    return get(obj1).equals(((java.util.Map.Entry) (obj)).getValue());
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return Maps.asMapEntryIterator(columnKeySet(), new Function() {

                final ColumnMap.ColumnMapEntrySet this$2;

                public volatile Object apply(Object obj)
                {
                    return apply(obj);
                }

                public Map apply(Object obj)
                {
                    return column(obj);
                }

            
            {
                this$2 = ColumnMap.ColumnMapEntrySet.this;
                super();
            }
            });
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = (java.util.Map.Entry)obj;
                removeColumn(((java.util.Map.Entry) (obj)).getKey());
                return true;
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            return Sets.removeAllImpl(this, collection.iterator());
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = iterator1.next();
                if (!collection.contains(Maps.immutableEntry(obj, column(obj))))
                {
                    removeColumn(obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return columnKeySet().size();
        }

        ColumnMap.ColumnMapEntrySet()
        {
            this$1 = ColumnMap.this;
            super();
        }
    }

    private class ColumnMap.ColumnMapValues extends Maps.Values
    {

        final ColumnMap this$1;

        public boolean remove(Object obj)
        {
            for (Iterator iterator = entrySet().iterator(); iterator.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (((Map)entry.getValue()).equals(obj))
                {
                    removeColumn(entry.getKey());
                    return true;
                }
            }

            return false;
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = iterator.next();
                if (collection.contains(column(obj)))
                {
                    removeColumn(obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = iterator.next();
                if (!collection.contains(column(obj)))
                {
                    removeColumn(obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        ColumnMap.ColumnMapValues()
        {
            this$1 = ColumnMap.this;
            super(ColumnMap.this);
        }
    }

    class Row extends Maps.ImprovedAbstractMap
    {

        Map backingRowMap;
        final Object rowKey;
        final StandardTable this$0;

        Map backingRowMap()
        {
            if (backingRowMap == null || backingRowMap.isEmpty() && backingMap.containsKey(rowKey))
            {
                Map map = computeBackingRowMap();
                backingRowMap = map;
                return map;
            } else
            {
                return backingRowMap;
            }
        }

        public void clear()
        {
            Map map = backingRowMap();
            if (map != null)
            {
                map.clear();
            }
            maintainEmptyInvariant();
        }

        Map computeBackingRowMap()
        {
            return (Map)backingMap.get(rowKey);
        }

        public boolean containsKey(Object obj)
        {
            Map map = backingRowMap();
            return obj != null && map != null && Maps.safeContainsKey(map, obj);
        }

        protected Set createEntrySet()
        {
            return new RowEntrySet();
        }

        public Object get(Object obj)
        {
            Map map = backingRowMap();
            if (obj != null && map != null)
            {
                return Maps.safeGet(map, obj);
            } else
            {
                return null;
            }
        }

        void maintainEmptyInvariant()
        {
            if (backingRowMap() != null && backingRowMap.isEmpty())
            {
                backingMap.remove(rowKey);
                backingRowMap = null;
            }
        }

        public Object put(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            if (backingRowMap != null && !backingRowMap.isEmpty())
            {
                return backingRowMap.put(obj, obj1);
            } else
            {
                return StandardTable.this.put(rowKey, obj, obj1);
            }
        }

        public Object remove(Object obj)
        {
            Map map = backingRowMap();
            if (map == null)
            {
                return null;
            } else
            {
                obj = Maps.safeRemove(map, obj);
                maintainEmptyInvariant();
                return obj;
            }
        }

        Row(Object obj)
        {
            this$0 = StandardTable.this;
            super();
            rowKey = Preconditions.checkNotNull(obj);
        }
    }

    private final class Row.RowEntrySet extends Maps.EntrySet
    {

        final Row this$1;

        public Iterator iterator()
        {
            Map map1 = backingRowMap();
            if (map1 == null)
            {
                return Iterators.emptyModifiableIterator();
            } else
            {
                return map1.entrySet().iterator(). new Iterator() {

                    final Row.RowEntrySet this$2;
                    final Iterator val$iterator;

                    public boolean hasNext()
                    {
                        return iterator.hasNext();
                    }

                    public volatile Object next()
                    {
                        return next();
                    }

                    public java.util.Map.Entry next()
                    {
                        return ((java.util.Map.Entry)iterator.next()). new ForwardingMapEntry() {

                            final Row.RowEntrySet._cls1 this$3;
                            final java.util.Map.Entry val$entry;

                            protected volatile Object _mthdelegate()
                            {
                                return _mthdelegate();
                            }

                            protected java.util.Map.Entry _mthdelegate()
                            {
                                return entry;
                            }

                            public boolean equals(Object obj)
                            {
                                return standardEquals(obj);
                            }

                            public Object setValue(Object obj)
                            {
                                return super.setValue(Preconditions.checkNotNull(obj));
                            }

            
            {
                this$3 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                        };
                    }

                    public void remove()
                    {
                        iterator.remove();
                        maintainEmptyInvariant();
                    }

            
            {
                this$2 = final_rowentryset;
                iterator = Iterator.this;
                super();
            }
                };
            }
        }

        Map map()
        {
            return Row.this;
        }

        public int size()
        {
            Map map1 = backingRowMap();
            if (map1 == null)
            {
                return 0;
            } else
            {
                return map1.size();
            }
        }

        private Row.RowEntrySet()
        {
            this$1 = Row.this;
            super();
        }

    }

    class RowMap extends Maps.ImprovedAbstractMap
    {

        final StandardTable this$0;

        public boolean containsKey(Object obj)
        {
            return containsRow(obj);
        }

        protected Set createEntrySet()
        {
            return new EntrySet();
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Map get(Object obj)
        {
            if (containsRow(obj))
            {
                return row(obj);
            } else
            {
                return null;
            }
        }

        public volatile Object remove(Object obj)
        {
            return remove(obj);
        }

        public Map remove(Object obj)
        {
            if (obj == null)
            {
                return null;
            } else
            {
                return (Map)backingMap.remove(obj);
            }
        }

        RowMap()
        {
            this$0 = StandardTable.this;
            super();
        }
    }

    class RowMap.EntrySet extends TableSet
    {

        final RowMap this$1;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                flag = flag1;
                if (((java.util.Map.Entry) (obj)).getKey() != null)
                {
                    flag = flag1;
                    if (((java.util.Map.Entry) (obj)).getValue() instanceof Map)
                    {
                        flag = flag1;
                        if (Collections2.safeContains(backingMap.entrySet(), obj))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public Iterator iterator()
        {
            return Maps.asMapEntryIterator(backingMap.keySet(), new Function() {

                final RowMap.EntrySet this$2;

                public volatile Object apply(Object obj)
                {
                    return apply(obj);
                }

                public Map apply(Object obj)
                {
                    return row(obj);
                }

            
            {
                this$2 = RowMap.EntrySet.this;
                super();
            }
            });
        }

        public boolean remove(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                flag = flag1;
                if (((java.util.Map.Entry) (obj)).getKey() != null)
                {
                    flag = flag1;
                    if (((java.util.Map.Entry) (obj)).getValue() instanceof Map)
                    {
                        flag = flag1;
                        if (backingMap.entrySet().remove(obj))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public int size()
        {
            return backingMap.size();
        }

        RowMap.EntrySet()
        {
            this$1 = RowMap.this;
            super();
        }
    }

    private abstract class TableSet extends Sets.ImprovedAbstractSet
    {

        final StandardTable this$0;

        public void clear()
        {
            backingMap.clear();
        }

        public boolean isEmpty()
        {
            return backingMap.isEmpty();
        }

        private TableSet()
        {
            this$0 = StandardTable.this;
            super();
        }

    }


    private static final long serialVersionUID = 0L;
    final Map backingMap;
    private transient Set columnKeySet;
    private transient ColumnMap columnMap;
    final Supplier factory;
    private transient Map rowMap;

    StandardTable(Map map, Supplier supplier)
    {
        backingMap = map;
        factory = supplier;
    }

    private boolean containsMapping(Object obj, Object obj1, Object obj2)
    {
        return obj2 != null && obj2.equals(get(obj, obj1));
    }

    private Map getOrCreate(Object obj)
    {
        Map map1 = (Map)backingMap.get(obj);
        Map map = map1;
        if (map1 == null)
        {
            map = (Map)factory.get();
            backingMap.put(obj, map);
        }
        return map;
    }

    private Map removeColumn(Object obj)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        Iterator iterator = backingMap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj1 = ((Map)entry.getValue()).remove(obj);
            if (obj1 != null)
            {
                linkedhashmap.put(entry.getKey(), obj1);
                if (((Map)entry.getValue()).isEmpty())
                {
                    iterator.remove();
                }
            }
        } while (true);
        return linkedhashmap;
    }

    private boolean removeMapping(Object obj, Object obj1, Object obj2)
    {
        if (containsMapping(obj, obj1, obj2))
        {
            remove(obj, obj1);
            return true;
        } else
        {
            return false;
        }
    }

    Iterator cellIterator()
    {
        return new CellIterator();
    }

    public Set cellSet()
    {
        return super.cellSet();
    }

    public void clear()
    {
        backingMap.clear();
    }

    public Map column(Object obj)
    {
        return new Column(obj);
    }

    public Set columnKeySet()
    {
        Set set = columnKeySet;
        Object obj = set;
        if (set == null)
        {
            obj = new ColumnKeySet();
            columnKeySet = ((Set) (obj));
        }
        return ((Set) (obj));
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
        return obj != null && obj1 != null && super.contains(obj, obj1);
    }

    public boolean containsColumn(Object obj)
    {
        if (obj != null)
        {
            Iterator iterator = backingMap.values().iterator();
            while (iterator.hasNext()) 
            {
                if (Maps.safeContainsKey((Map)iterator.next(), obj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsRow(Object obj)
    {
        return obj != null && Maps.safeContainsKey(backingMap, obj);
    }

    public boolean containsValue(Object obj)
    {
        return obj != null && super.containsValue(obj);
    }

    Iterator createColumnKeyIterator()
    {
        return new ColumnKeyIterator();
    }

    Map createRowMap()
    {
        return new RowMap();
    }

    public Object get(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return null;
        } else
        {
            return super.get(obj, obj1);
        }
    }

    public boolean isEmpty()
    {
        return backingMap.isEmpty();
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        Preconditions.checkNotNull(obj2);
        return getOrCreate(obj).put(obj1, obj2);
    }

    public Object remove(Object obj, Object obj1)
    {
        Object obj3 = null;
        Object obj2 = obj3;
        if (obj != null)
        {
            if (obj1 == null)
            {
                obj2 = obj3;
            } else
            {
                Map map = (Map)Maps.safeGet(backingMap, obj);
                obj2 = obj3;
                if (map != null)
                {
                    obj1 = map.remove(obj1);
                    obj2 = obj1;
                    if (map.isEmpty())
                    {
                        backingMap.remove(obj);
                        return obj1;
                    }
                }
            }
        }
        return obj2;
    }

    public Map row(Object obj)
    {
        return new Row(obj);
    }

    public Set rowKeySet()
    {
        return rowMap().keySet();
    }

    public Map rowMap()
    {
        Map map1 = rowMap;
        Map map = map1;
        if (map1 == null)
        {
            map = createRowMap();
            rowMap = map;
        }
        return map;
    }

    public int size()
    {
        int i = 0;
        for (Iterator iterator = backingMap.values().iterator(); iterator.hasNext();)
        {
            i += ((Map)iterator.next()).size();
        }

        return i;
    }

    public Collection values()
    {
        return super.values();
    }



}
