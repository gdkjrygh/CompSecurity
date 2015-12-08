// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap, BiMap, ForwardingSet, Maps, 
//            CollectPreconditions, ForwardingMapEntry

abstract class AbstractBiMap extends ForwardingMap
    implements BiMap, Serializable
{
    private class EntrySet extends ForwardingSet
    {

        final Set esDelegate;
        final AbstractBiMap this$0;

        public void clear()
        {
            AbstractBiMap.this.clear();
        }

        public boolean contains(Object obj)
        {
            return Maps.containsEntryImpl(_mthdelegate(), obj);
        }

        public boolean containsAll(Collection collection)
        {
            return standardContainsAll(collection);
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return esDelegate;
        }

        public Iterator iterator()
        {
            return esDelegate.iterator(). new Iterator() {

                java.util.Map.Entry entry;
                final EntrySet this$1;
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
                    entry = (java.util.Map.Entry)iterator.next();
                    return entry. new ForwardingMapEntry() {

                        final EntrySet._cls1 this$2;
                        final java.util.Map.Entry val$finalEntry;

                        protected volatile Object _mthdelegate()
                        {
                            return _mthdelegate();
                        }

                        protected java.util.Map.Entry _mthdelegate()
                        {
                            return finalEntry;
                        }

                        public Object setValue(Object obj)
                        {
                            Preconditions.checkState(contains(this), "entry no longer in map");
                            if (Objects.equal(obj, getValue()))
                            {
                                return obj;
                            }
                            Object obj1;
                            boolean flag;
                            if (!containsValue(obj))
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            Preconditions.checkArgument(flag, "value already present: %s", new Object[] {
                                obj
                            });
                            obj1 = finalEntry.setValue(obj);
                            Preconditions.checkState(Objects.equal(obj, get(getKey())), "entry no longer in map");
                            updateInverseMap(getKey(), true, obj1, obj);
                            return obj1;
                        }

            
            {
                this$2 = final__pcls1;
                finalEntry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

                public void remove()
                {
                    Object obj;
                    boolean flag;
                    if (entry != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    CollectPreconditions.checkRemove(flag);
                    obj = entry.getValue();
                    iterator.remove();
                    removeFromInverseMap(obj);
                }

            
            {
                this$1 = final_entryset;
                iterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (!esDelegate.contains(obj))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                inverse._flddelegate.remove(((java.util.Map.Entry) (obj)).getValue());
                esDelegate.remove(obj);
                return true;
            }
        }

        public boolean removeAll(Collection collection)
        {
            return standardRemoveAll(collection);
        }

        public boolean retainAll(Collection collection)
        {
            return standardRetainAll(collection);
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        private EntrySet()
        {
            this$0 = AbstractBiMap.this;
            super();
            esDelegate = _flddelegate.entrySet();
        }

    }

    private static class Inverse extends AbstractBiMap
    {

        private static final long serialVersionUID = 0L;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            setInverse((AbstractBiMap)objectinputstream.readObject());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeObject(inverse());
        }

        Object checkKey(Object obj)
        {
            return inverse.checkValue(obj);
        }

        Object checkValue(Object obj)
        {
            return inverse.checkKey(obj);
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        Object readResolve()
        {
            return inverse().inverse();
        }

        public volatile Collection values()
        {
            return values();
        }

        private Inverse(Map map, AbstractBiMap abstractbimap)
        {
            super(map, abstractbimap, null);
        }

    }

    private class KeySet extends ForwardingSet
    {

        final AbstractBiMap this$0;

        public void clear()
        {
            AbstractBiMap.this.clear();
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return _flddelegate.keySet();
        }

        public Iterator iterator()
        {
            return Maps.keyIterator(entrySet().iterator());
        }

        public boolean remove(Object obj)
        {
            if (!contains(obj))
            {
                return false;
            } else
            {
                removeFromBothMaps(obj);
                return true;
            }
        }

        public boolean removeAll(Collection collection)
        {
            return standardRemoveAll(collection);
        }

        public boolean retainAll(Collection collection)
        {
            return standardRetainAll(collection);
        }

        private KeySet()
        {
            this$0 = AbstractBiMap.this;
            super();
        }

    }

    private class ValueSet extends ForwardingSet
    {

        final AbstractBiMap this$0;
        final Set valuesDelegate;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return valuesDelegate;
        }

        public Iterator iterator()
        {
            return Maps.valueIterator(entrySet().iterator());
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        public String toString()
        {
            return standardToString();
        }

        private ValueSet()
        {
            this$0 = AbstractBiMap.this;
            super();
            valuesDelegate = inverse.keySet();
        }

    }


    private static final long serialVersionUID = 0L;
    private transient Map _flddelegate;
    private transient Set entrySet;
    transient AbstractBiMap inverse;
    private transient Set keySet;
    private transient Set valueSet;

    private AbstractBiMap(Map map, AbstractBiMap abstractbimap)
    {
        _flddelegate = map;
        inverse = abstractbimap;
    }


    AbstractBiMap(Map map, Map map1)
    {
        setDelegates(map, map1);
    }

    private Object putInBothMaps(Object obj, Object obj1, boolean flag)
    {
        checkKey(obj);
        checkValue(obj1);
        boolean flag1 = containsKey(obj);
        if (flag1 && Objects.equal(obj1, get(obj)))
        {
            return obj1;
        }
        Object obj2;
        if (flag)
        {
            inverse().remove(obj1);
        } else
        {
            if (!containsValue(obj1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "value already present: %s", new Object[] {
                obj1
            });
        }
        obj2 = _flddelegate.put(obj, obj1);
        updateInverseMap(obj, flag1, obj2, obj1);
        return obj2;
    }

    private Object removeFromBothMaps(Object obj)
    {
        obj = _flddelegate.remove(obj);
        removeFromInverseMap(obj);
        return obj;
    }

    private void removeFromInverseMap(Object obj)
    {
        inverse._flddelegate.remove(obj);
    }

    private void updateInverseMap(Object obj, boolean flag, Object obj1, Object obj2)
    {
        if (flag)
        {
            removeFromInverseMap(obj1);
        }
        inverse._flddelegate.put(obj2, obj);
    }

    Object checkKey(Object obj)
    {
        return obj;
    }

    Object checkValue(Object obj)
    {
        return obj;
    }

    public void clear()
    {
        _flddelegate.clear();
        inverse._flddelegate.clear();
    }

    public boolean containsValue(Object obj)
    {
        return inverse.containsKey(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return _flddelegate;
    }

    public Set entrySet()
    {
        Set set = entrySet;
        Object obj = set;
        if (set == null)
        {
            obj = new EntrySet();
            entrySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Object forcePut(Object obj, Object obj1)
    {
        return putInBothMaps(obj, obj1, true);
    }

    public BiMap inverse()
    {
        return inverse;
    }

    public Set keySet()
    {
        Set set = keySet;
        Object obj = set;
        if (set == null)
        {
            obj = new KeySet();
            keySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Object put(Object obj, Object obj1)
    {
        return putInBothMaps(obj, obj1, false);
    }

    public void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Object remove(Object obj)
    {
        if (containsKey(obj))
        {
            return removeFromBothMaps(obj);
        } else
        {
            return null;
        }
    }

    void setDelegates(Map map, Map map1)
    {
        boolean flag1 = true;
        boolean flag;
        if (_flddelegate == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (inverse == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkArgument(map1.isEmpty());
        if (map != map1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        _flddelegate = map;
        inverse = new Inverse(map1, this);
    }

    void setInverse(AbstractBiMap abstractbimap)
    {
        inverse = abstractbimap;
    }

    public volatile Collection values()
    {
        return values();
    }

    public Set values()
    {
        Set set = valueSet;
        Object obj = set;
        if (set == null)
        {
            obj = new ValueSet();
            valueSet = ((Set) (obj));
        }
        return ((Set) (obj));
    }




}
