// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, Maps, Iterators, ForwardingMapEntry

class tNull extends actMap
{
    private final class RowEntrySet extends Maps.EntrySet
    {

        final StandardTable.Row this$1;

        public Iterator iterator()
        {
            Map map1 = backingRowMap();
            if (map1 == null)
            {
                return Iterators.emptyModifiableIterator();
            } else
            {
                return map1.entrySet().iterator(). new Iterator() {

                    final RowEntrySet this$2;
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

                            final RowEntrySet._cls1 this$3;
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
            return StandardTable.Row.this;
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

        private RowEntrySet()
        {
            this$1 = StandardTable.Row.this;
            super();
        }

        RowEntrySet(StandardTable._cls1 _pcls1)
        {
            this();
        }
    }


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
        return new RowEntrySet(null);
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

    RowEntrySet(Object obj)
    {
        this$0 = StandardTable.this;
        super();
        rowKey = Preconditions.checkNotNull(obj);
    }
}
