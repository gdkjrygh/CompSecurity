// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

// Referenced classes of package com.google.common.collect:
//            AbstractSortedKeySortedSetMultimap, Ordering, Serialization, Sets, 
//            Multimap, Multiset

public class TreeMultimap extends AbstractSortedKeySortedSetMultimap
{

    private static final long serialVersionUID = 0L;
    private transient Comparator keyComparator;
    private transient Comparator valueComparator;

    TreeMultimap(Comparator comparator, Comparator comparator1)
    {
        super(new TreeMap(comparator));
        keyComparator = comparator;
        valueComparator = comparator1;
    }

    private TreeMultimap(Comparator comparator, Comparator comparator1, Multimap multimap)
    {
        this(comparator, comparator1);
        putAll(multimap);
    }

    public static TreeMultimap create()
    {
        return new TreeMultimap(Ordering.natural(), Ordering.natural());
    }

    public static TreeMultimap create(Multimap multimap)
    {
        return new TreeMultimap(Ordering.natural(), Ordering.natural(), multimap);
    }

    public static TreeMultimap create(Comparator comparator, Comparator comparator1)
    {
        return new TreeMultimap((Comparator)Preconditions.checkNotNull(comparator), (Comparator)Preconditions.checkNotNull(comparator1));
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        keyComparator = (Comparator)Preconditions.checkNotNull((Comparator)objectinputstream.readObject());
        valueComparator = (Comparator)Preconditions.checkNotNull((Comparator)objectinputstream.readObject());
        setMap(new TreeMap(keyComparator));
        Serialization.populateMultimap(this, objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(keyComparator());
        objectoutputstream.writeObject(valueComparator());
        Serialization.writeMultimap(this, objectoutputstream);
    }

    public volatile Map asMap()
    {
        return asMap();
    }

    public NavigableMap asMap()
    {
        return (NavigableMap)super.asMap();
    }

    public volatile SortedMap asMap()
    {
        return asMap();
    }

    volatile Map backingMap()
    {
        return backingMap();
    }

    NavigableMap backingMap()
    {
        return (NavigableMap)super.backingMap();
    }

    volatile SortedMap backingMap()
    {
        return backingMap();
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile boolean containsEntry(Object obj, Object obj1)
    {
        return super.containsEntry(obj, obj1);
    }

    public volatile boolean containsKey(Object obj)
    {
        return super.containsKey(obj);
    }

    public volatile boolean containsValue(Object obj)
    {
        return super.containsValue(obj);
    }

    volatile Map createAsMap()
    {
        return createAsMap();
    }

    NavigableMap createAsMap()
    {
        return new AbstractMapBasedMultimap.NavigableAsMap(this, backingMap());
    }

    volatile Collection createCollection()
    {
        return createCollection();
    }

    Collection createCollection(Object obj)
    {
        if (obj == null)
        {
            keyComparator().compare(obj, obj);
        }
        return super.createCollection(obj);
    }

    volatile Set createCollection()
    {
        return createCollection();
    }

    SortedSet createCollection()
    {
        return new TreeSet(valueComparator);
    }

    NavigableSet createKeySet()
    {
        return new AbstractMapBasedMultimap.NavigableKeySet(this, backingMap());
    }

    volatile Set createKeySet()
    {
        return createKeySet();
    }

    public volatile Set entries()
    {
        return super.entries();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public NavigableSet get(Object obj)
    {
        return (NavigableSet)super.get(obj);
    }

    public volatile Set get(Object obj)
    {
        return get(obj);
    }

    public volatile SortedSet get(Object obj)
    {
        return get(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public Comparator keyComparator()
    {
        return keyComparator;
    }

    public NavigableSet keySet()
    {
        return (NavigableSet)super.keySet();
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public volatile SortedSet keySet()
    {
        return keySet();
    }

    public volatile Multiset keys()
    {
        return super.keys();
    }

    public volatile boolean put(Object obj, Object obj1)
    {
        return super.put(obj, obj1);
    }

    public volatile boolean putAll(Multimap multimap)
    {
        return super.putAll(multimap);
    }

    public volatile boolean putAll(Object obj, Iterable iterable)
    {
        return super.putAll(obj, iterable);
    }

    public volatile boolean remove(Object obj, Object obj1)
    {
        return super.remove(obj, obj1);
    }

    public volatile SortedSet removeAll(Object obj)
    {
        return super.removeAll(obj);
    }

    public volatile SortedSet replaceValues(Object obj, Iterable iterable)
    {
        return super.replaceValues(obj, iterable);
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }

    Collection unmodifiableCollectionSubclass(Collection collection)
    {
        return Sets.unmodifiableNavigableSet((NavigableSet)collection);
    }

    public Comparator valueComparator()
    {
        return valueComparator;
    }

    public volatile Collection values()
    {
        return super.values();
    }

    Collection wrapCollection(Object obj, Collection collection)
    {
        return new AbstractMapBasedMultimap.WrappedNavigableSet(this, obj, (NavigableSet)collection, null);
    }
}
