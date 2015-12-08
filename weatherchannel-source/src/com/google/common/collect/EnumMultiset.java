// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultiset, WellBehavedMap, Iterables, Serialization

public final class EnumMultiset extends AbstractMapBasedMultiset
{

    private static final long serialVersionUID = 0L;
    private transient Class type;

    private EnumMultiset(Class class1)
    {
        super(WellBehavedMap.wrap(new EnumMap(class1)));
        type = class1;
    }

    public static EnumMultiset create(Class class1)
    {
        return new EnumMultiset(class1);
    }

    public static EnumMultiset create(Iterable iterable)
    {
        Object obj = iterable.iterator();
        Preconditions.checkArgument(((Iterator) (obj)).hasNext(), "EnumMultiset constructor passed empty Iterable");
        obj = new EnumMultiset(((Enum)((Iterator) (obj)).next()).getDeclaringClass());
        Iterables.addAll(((Collection) (obj)), iterable);
        return ((EnumMultiset) (obj));
    }

    public static EnumMultiset create(Iterable iterable, Class class1)
    {
        class1 = create(class1);
        Iterables.addAll(class1, iterable);
        return class1;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        type = (Class)objectinputstream.readObject();
        setBackingMap(WellBehavedMap.wrap(new EnumMap(type)));
        Serialization.populateMultiset(this, objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(type);
        Serialization.writeMultiset(this, objectoutputstream);
    }

    public volatile boolean addAll(Collection collection)
    {
        return super.addAll(collection);
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    public volatile int count(Object obj)
    {
        return super.count(obj);
    }

    public volatile Set elementSet()
    {
        return super.elementSet();
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public volatile Iterator iterator()
    {
        return super.iterator();
    }

    public volatile int remove(Object obj, int i)
    {
        return super.remove(obj, i);
    }

    public volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile boolean removeAll(Collection collection)
    {
        return super.removeAll(collection);
    }

    public volatile boolean retainAll(Collection collection)
    {
        return super.retainAll(collection);
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
