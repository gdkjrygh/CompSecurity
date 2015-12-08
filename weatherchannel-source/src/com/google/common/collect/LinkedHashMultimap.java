// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractSetMultimap, CollectPreconditions, Maps, Multimap, 
//            Multiset, ImmutableEntry, Hashing

public final class LinkedHashMultimap extends AbstractSetMultimap
{
    static final class ValueEntry extends ImmutableEntry
        implements ValueSetLink
    {

        ValueEntry nextInValueBucket;
        ValueEntry predecessorInMultimap;
        ValueSetLink predecessorInValueSet;
        final int smearedValueHash;
        ValueEntry successorInMultimap;
        ValueSetLink successorInValueSet;

        public ValueEntry getPredecessorInMultimap()
        {
            return predecessorInMultimap;
        }

        public ValueSetLink getPredecessorInValueSet()
        {
            return predecessorInValueSet;
        }

        public ValueEntry getSuccessorInMultimap()
        {
            return successorInMultimap;
        }

        public ValueSetLink getSuccessorInValueSet()
        {
            return successorInValueSet;
        }

        boolean matchesValue(Object obj, int i)
        {
            return smearedValueHash == i && Objects.equal(getValue(), obj);
        }

        public void setPredecessorInMultimap(ValueEntry valueentry)
        {
            predecessorInMultimap = valueentry;
        }

        public void setPredecessorInValueSet(ValueSetLink valuesetlink)
        {
            predecessorInValueSet = valuesetlink;
        }

        public void setSuccessorInMultimap(ValueEntry valueentry)
        {
            successorInMultimap = valueentry;
        }

        public void setSuccessorInValueSet(ValueSetLink valuesetlink)
        {
            successorInValueSet = valuesetlink;
        }

        ValueEntry(Object obj, Object obj1, int i, ValueEntry valueentry)
        {
            super(obj, obj1);
            smearedValueHash = i;
            nextInValueBucket = valueentry;
        }
    }

    final class ValueSet extends Sets.ImprovedAbstractSet
        implements ValueSetLink
    {

        private ValueSetLink firstEntry;
        ValueEntry hashTable[];
        private final Object key;
        private ValueSetLink lastEntry;
        private int modCount;
        private int size;
        final LinkedHashMultimap this$0;

        private int mask()
        {
            return hashTable.length - 1;
        }

        private void rehashIfNecessary()
        {
            if (Hashing.needsResizing(size, hashTable.length, 1.0D))
            {
                ValueEntry avalueentry[] = new ValueEntry[hashTable.length * 2];
                hashTable = avalueentry;
                int i = avalueentry.length;
                for (ValueSetLink valuesetlink = firstEntry; valuesetlink != this; valuesetlink = valuesetlink.getSuccessorInValueSet())
                {
                    ValueEntry valueentry = (ValueEntry)valuesetlink;
                    int j = valueentry.smearedValueHash & i - 1;
                    valueentry.nextInValueBucket = avalueentry[j];
                    avalueentry[j] = valueentry;
                }

            }
        }

        public boolean add(Object obj)
        {
            int i = Hashing.smearedHash(obj);
            int j = i & mask();
            ValueEntry valueentry1 = hashTable[j];
            for (ValueEntry valueentry = valueentry1; valueentry != null; valueentry = valueentry.nextInValueBucket)
            {
                if (valueentry.matchesValue(obj, i))
                {
                    return false;
                }
            }

            obj = new ValueEntry(key, obj, i, valueentry1);
            LinkedHashMultimap.succeedsInValueSet(lastEntry, ((ValueSetLink) (obj)));
            LinkedHashMultimap.succeedsInValueSet(((ValueSetLink) (obj)), this);
            LinkedHashMultimap.succeedsInMultimap(multimapHeaderEntry.getPredecessorInMultimap(), ((ValueEntry) (obj)));
            LinkedHashMultimap.succeedsInMultimap(((ValueEntry) (obj)), multimapHeaderEntry);
            hashTable[j] = ((ValueEntry) (obj));
            size = size + 1;
            modCount = modCount + 1;
            rehashIfNecessary();
            return true;
        }

        public void clear()
        {
            Arrays.fill(hashTable, null);
            size = 0;
            for (ValueSetLink valuesetlink = firstEntry; valuesetlink != this; valuesetlink = valuesetlink.getSuccessorInValueSet())
            {
                LinkedHashMultimap.deleteFromMultimap((ValueEntry)valuesetlink);
            }

            LinkedHashMultimap.succeedsInValueSet(this, this);
            modCount = modCount + 1;
        }

        public boolean contains(Object obj)
        {
            int i = Hashing.smearedHash(obj);
            for (ValueEntry valueentry = hashTable[mask() & i]; valueentry != null; valueentry = valueentry.nextInValueBucket)
            {
                if (valueentry.matchesValue(obj, i))
                {
                    return true;
                }
            }

            return false;
        }

        public ValueSetLink getPredecessorInValueSet()
        {
            return lastEntry;
        }

        public ValueSetLink getSuccessorInValueSet()
        {
            return firstEntry;
        }

        public Iterator iterator()
        {
            return new Iterator() {

                int expectedModCount;
                ValueSetLink nextEntry;
                final ValueSet this$1;
                ValueEntry toRemove;

                private void checkForComodification()
                {
                    if (modCount != expectedModCount)
                    {
                        throw new ConcurrentModificationException();
                    } else
                    {
                        return;
                    }
                }

                public boolean hasNext()
                {
                    checkForComodification();
                    return nextEntry != ValueSet.this;
                }

                public Object next()
                {
                    if (!hasNext())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        ValueEntry valueentry = (ValueEntry)nextEntry;
                        Object obj = valueentry.getValue();
                        toRemove = valueentry;
                        nextEntry = valueentry.getSuccessorInValueSet();
                        return obj;
                    }
                }

                public void remove()
                {
                    checkForComodification();
                    boolean flag;
                    if (toRemove != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    CollectPreconditions.checkRemove(flag);
                    ValueSet.this.remove(toRemove.getValue());
                    expectedModCount = modCount;
                    toRemove = null;
                }

            
            {
                this$1 = ValueSet.this;
                super();
                nextEntry = firstEntry;
                expectedModCount = modCount;
            }
            };
        }

        public boolean remove(Object obj)
        {
            int i = Hashing.smearedHash(obj);
            int j = i & mask();
            ValueEntry valueentry1 = null;
            for (ValueEntry valueentry = hashTable[j]; valueentry != null; valueentry = valueentry.nextInValueBucket)
            {
                if (valueentry.matchesValue(obj, i))
                {
                    if (valueentry1 == null)
                    {
                        hashTable[j] = valueentry.nextInValueBucket;
                    } else
                    {
                        valueentry1.nextInValueBucket = valueentry.nextInValueBucket;
                    }
                    LinkedHashMultimap.deleteFromValueSet(valueentry);
                    LinkedHashMultimap.deleteFromMultimap(valueentry);
                    size = size - 1;
                    modCount = modCount + 1;
                    return true;
                }
                valueentry1 = valueentry;
            }

            return false;
        }

        public void setPredecessorInValueSet(ValueSetLink valuesetlink)
        {
            lastEntry = valuesetlink;
        }

        public void setSuccessorInValueSet(ValueSetLink valuesetlink)
        {
            firstEntry = valuesetlink;
        }

        public int size()
        {
            return size;
        }



        ValueSet(Object obj, int i)
        {
            this$0 = LinkedHashMultimap.this;
            super();
            size = 0;
            modCount = 0;
            key = obj;
            firstEntry = this;
            lastEntry = this;
            hashTable = new ValueEntry[Hashing.closedTableSize(i, 1.0D)];
        }
    }

    private static interface ValueSetLink
    {

        public abstract ValueSetLink getPredecessorInValueSet();

        public abstract ValueSetLink getSuccessorInValueSet();

        public abstract void setPredecessorInValueSet(ValueSetLink valuesetlink);

        public abstract void setSuccessorInValueSet(ValueSetLink valuesetlink);
    }


    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    static final double VALUE_SET_LOAD_FACTOR = 1D;
    private static final long serialVersionUID = 1L;
    private transient ValueEntry multimapHeaderEntry;
    transient int valueSetCapacity;

    private LinkedHashMultimap(int i, int j)
    {
        super(new LinkedHashMap(i));
        valueSetCapacity = 2;
        CollectPreconditions.checkNonnegative(j, "expectedValuesPerKey");
        valueSetCapacity = j;
        multimapHeaderEntry = new ValueEntry(null, null, 0, null);
        succeedsInMultimap(multimapHeaderEntry, multimapHeaderEntry);
    }

    public static LinkedHashMultimap create()
    {
        return new LinkedHashMultimap(16, 2);
    }

    public static LinkedHashMultimap create(int i, int j)
    {
        return new LinkedHashMultimap(Maps.capacity(i), Maps.capacity(j));
    }

    public static LinkedHashMultimap create(Multimap multimap)
    {
        LinkedHashMultimap linkedhashmultimap = create(multimap.keySet().size(), 2);
        linkedhashmultimap.putAll(multimap);
        return linkedhashmultimap;
    }

    private static void deleteFromMultimap(ValueEntry valueentry)
    {
        succeedsInMultimap(valueentry.getPredecessorInMultimap(), valueentry.getSuccessorInMultimap());
    }

    private static void deleteFromValueSet(ValueSetLink valuesetlink)
    {
        succeedsInValueSet(valuesetlink.getPredecessorInValueSet(), valuesetlink.getSuccessorInValueSet());
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        multimapHeaderEntry = new ValueEntry(null, null, 0, null);
        succeedsInMultimap(multimapHeaderEntry, multimapHeaderEntry);
        valueSetCapacity = objectinputstream.readInt();
        int k = objectinputstream.readInt();
        LinkedHashMap linkedhashmap = new LinkedHashMap(Maps.capacity(k));
        for (int i = 0; i < k; i++)
        {
            Object obj = objectinputstream.readObject();
            linkedhashmap.put(obj, createCollection(obj));
        }

        k = objectinputstream.readInt();
        for (int j = 0; j < k; j++)
        {
            Object obj1 = objectinputstream.readObject();
            Object obj2 = objectinputstream.readObject();
            ((Collection)linkedhashmap.get(obj1)).add(obj2);
        }

        setMap(linkedhashmap);
    }

    private static void succeedsInMultimap(ValueEntry valueentry, ValueEntry valueentry1)
    {
        valueentry.setSuccessorInMultimap(valueentry1);
        valueentry1.setPredecessorInMultimap(valueentry);
    }

    private static void succeedsInValueSet(ValueSetLink valuesetlink, ValueSetLink valuesetlink1)
    {
        valuesetlink.setSuccessorInValueSet(valuesetlink1);
        valuesetlink1.setPredecessorInValueSet(valuesetlink);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeInt(valueSetCapacity);
        objectoutputstream.writeInt(keySet().size());
        for (Iterator iterator = keySet().iterator(); iterator.hasNext(); objectoutputstream.writeObject(iterator.next())) { }
        objectoutputstream.writeInt(size());
        java.util.Map.Entry entry;
        for (Iterator iterator1 = entries().iterator(); iterator1.hasNext(); objectoutputstream.writeObject(entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator1.next();
            objectoutputstream.writeObject(entry.getKey());
        }

    }

    public volatile Map asMap()
    {
        return super.asMap();
    }

    public void clear()
    {
        super.clear();
        succeedsInMultimap(multimapHeaderEntry, multimapHeaderEntry);
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

    volatile Collection createCollection()
    {
        return createCollection();
    }

    Collection createCollection(Object obj)
    {
        return new ValueSet(obj, valueSetCapacity);
    }

    Set createCollection()
    {
        return new LinkedHashSet(valueSetCapacity);
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return super.entries();
    }

    Iterator entryIterator()
    {
        return new Iterator() {

            ValueEntry nextEntry;
            final LinkedHashMultimap this$0;
            ValueEntry toRemove;

            public boolean hasNext()
            {
                return nextEntry != multimapHeaderEntry;
            }

            public volatile Object next()
            {
                return next();
            }

            public java.util.Map.Entry next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    ValueEntry valueentry = nextEntry;
                    toRemove = valueentry;
                    nextEntry = nextEntry.successorInMultimap;
                    return valueentry;
                }
            }

            public void remove()
            {
                boolean flag;
                if (toRemove != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CollectPreconditions.checkRemove(flag);
                LinkedHashMultimap.this.remove(toRemove.getKey(), toRemove.getValue());
                toRemove = null;
            }

            
            {
                this$0 = LinkedHashMultimap.this;
                super();
                nextEntry = multimapHeaderEntry.successorInMultimap;
            }
        };
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Set get(Object obj)
    {
        return super.get(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public volatile Set keySet()
    {
        return super.keySet();
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

    public volatile Set removeAll(Object obj)
    {
        return super.removeAll(obj);
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public Set replaceValues(Object obj, Iterable iterable)
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

    Iterator valueIterator()
    {
        return Maps.valueIterator(entryIterator());
    }

    public Collection values()
    {
        return super.values();
    }





}
