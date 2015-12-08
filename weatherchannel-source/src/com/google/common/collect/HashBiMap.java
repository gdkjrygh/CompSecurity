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
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            BiMap, Hashing, CollectPreconditions, Serialization, 
//            ImmutableEntry, AbstractMapEntry

public final class HashBiMap extends AbstractMap
    implements BiMap, Serializable
{
    private static final class BiEntry extends ImmutableEntry
    {

        final int keyHash;
        BiEntry nextInKToVBucket;
        BiEntry nextInVToKBucket;
        final int valueHash;

        BiEntry(Object obj, int i, Object obj1, int j)
        {
            super(obj, obj1);
            keyHash = i;
            valueHash = j;
        }
    }

    private final class EntrySet extends Maps.EntrySet
    {

        final HashBiMap this$0;

        public Iterator iterator()
        {
            return new Itr() {

                final EntrySet this$1;

                volatile Object output(BiEntry bientry)
                {
                    return output(bientry);
                }

                java.util.Map.Entry output(BiEntry bientry)
                {
                    return new MapEntry(bientry);
                }

            
            {
                this$1 = EntrySet.this;
                super();
            }
            };
        }

        Map map()
        {
            return HashBiMap.this;
        }

        private EntrySet()
        {
            this$0 = HashBiMap.this;
            super();
        }

    }

    class EntrySet._cls1.MapEntry extends AbstractMapEntry
    {

        BiEntry _flddelegate;
        final EntrySet._cls1 this$2;

        public Object getKey()
        {
            return _flddelegate.key;
        }

        public Object getValue()
        {
            return _flddelegate.value;
        }

        public Object setValue(Object obj)
        {
            Object obj1 = _flddelegate.value;
            int i = HashBiMap.hash(obj);
            if (i == _flddelegate.valueHash && Objects.equal(obj, obj1))
            {
                return obj;
            }
            boolean flag;
            if (seekByValue(obj, i) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "value already present: %s", new Object[] {
                obj
            });
            delete(_flddelegate);
            obj = new BiEntry(_flddelegate.key, _flddelegate.keyHash, obj, i);
            insert(((BiEntry) (obj)));
            expectedModCount = modCount;
            if (toRemove == _flddelegate)
            {
                toRemove = ((BiEntry) (obj));
            }
            _flddelegate = ((BiEntry) (obj));
            return obj1;
        }

        EntrySet._cls1.MapEntry(BiEntry bientry)
        {
            this$2 = EntrySet._cls1.this;
            super();
            _flddelegate = bientry;
        }
    }

    private final class Inverse extends AbstractMap
        implements BiMap, Serializable
    {

        final HashBiMap this$0;

        public void clear()
        {
            forward().clear();
        }

        public boolean containsKey(Object obj)
        {
            return forward().containsValue(obj);
        }

        public Set entrySet()
        {
            return new Maps.EntrySet() {

                final Inverse this$1;

                public Iterator iterator()
                {
                    return new Itr() {

                        final Inverse._cls1 this$2;

                        volatile Object output(BiEntry bientry)
                        {
                            return output(bientry);
                        }

                        java.util.Map.Entry output(BiEntry bientry)
                        {
                            return new InverseEntry(bientry);
                        }

            
            {
                this$2 = Inverse._cls1.this;
                super();
            }
                    };
                }

                Map map()
                {
                    return Inverse.this;
                }

            
            {
                this$1 = Inverse.this;
                super();
            }
            };
        }

        public Object forcePut(Object obj, Object obj1)
        {
            return putInverse(obj, obj1, true);
        }

        BiMap forward()
        {
            return HashBiMap.this;
        }

        public Object get(Object obj)
        {
            obj = seekByValue(obj, HashBiMap.hash(obj));
            if (obj == null)
            {
                return null;
            } else
            {
                return ((BiEntry) (obj)).key;
            }
        }

        public BiMap inverse()
        {
            return forward();
        }

        public Set keySet()
        {
            return new InverseKeySet();
        }

        public Object put(Object obj, Object obj1)
        {
            return putInverse(obj, obj1, false);
        }

        public Object remove(Object obj)
        {
            obj = seekByValue(obj, HashBiMap.hash(obj));
            if (obj == null)
            {
                return null;
            } else
            {
                delete(((BiEntry) (obj)));
                return ((BiEntry) (obj)).key;
            }
        }

        public int size()
        {
            return HashBiMap.this.size;
        }

        public volatile Collection values()
        {
            return values();
        }

        public Set values()
        {
            return forward().keySet();
        }

        Object writeReplace()
        {
            return new InverseSerializedForm(HashBiMap.this);
        }

        private Inverse()
        {
            this$0 = HashBiMap.this;
            super();
        }

    }

    class Inverse._cls1._cls1.InverseEntry extends AbstractMapEntry
    {

        BiEntry _flddelegate;
        final Inverse._cls1._cls1 this$3;

        public Object getKey()
        {
            return _flddelegate.value;
        }

        public Object getValue()
        {
            return _flddelegate.key;
        }

        public Object setValue(Object obj)
        {
            Object obj1 = _flddelegate.key;
            int i = HashBiMap.hash(obj);
            if (i == _flddelegate.keyHash && Objects.equal(obj, obj1))
            {
                return obj;
            }
            boolean flag;
            if (seekByKey(obj, i) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "value already present: %s", new Object[] {
                obj
            });
            delete(_flddelegate);
            obj = new BiEntry(obj, i, _flddelegate.value, _flddelegate.valueHash);
            insert(((BiEntry) (obj)));
            expectedModCount = modCount;
            return obj1;
        }

        Inverse._cls1._cls1.InverseEntry(BiEntry bientry)
        {
            this$3 = Inverse._cls1._cls1.this;
            super();
            _flddelegate = bientry;
        }
    }

    private final class Inverse.InverseKeySet extends Maps.KeySet
    {

        final Inverse this$1;

        public Iterator iterator()
        {
            return new Itr() {

                final Inverse.InverseKeySet this$2;

                Object output(BiEntry bientry)
                {
                    return bientry.value;
                }

            
            {
                this$2 = Inverse.InverseKeySet.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            obj = seekByValue(obj, HashBiMap.hash(obj));
            if (obj == null)
            {
                return false;
            } else
            {
                delete(((BiEntry) (obj)));
                return true;
            }
        }

        Inverse.InverseKeySet()
        {
            this$1 = Inverse.this;
            super(Inverse.this);
        }
    }

    private static final class InverseSerializedForm
        implements Serializable
    {

        private final HashBiMap bimap;

        Object readResolve()
        {
            return bimap.inverse();
        }

        InverseSerializedForm(HashBiMap hashbimap)
        {
            bimap = hashbimap;
        }
    }

    abstract class Itr
        implements Iterator
    {

        int expectedModCount;
        BiEntry next;
        int nextBucket;
        final HashBiMap this$0;
        BiEntry toRemove;

        private void checkForConcurrentModification()
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
            checkForConcurrentModification();
            if (next != null)
            {
                return true;
            }
_L3:
            if (nextBucket < hashTableKToV.length)
            {
                if (hashTableKToV[nextBucket] != null)
                {
                    BiEntry abientry[] = hashTableKToV;
                    int i = nextBucket;
                    nextBucket = i + 1;
                    next = abientry[i];
                    return true;
                }
            } else
            {
                return false;
            }
            if (true) goto _L2; else goto _L1
_L2:
            nextBucket = nextBucket + 1;
            if (true) goto _L3; else goto _L1
_L1:
        }

        public Object next()
        {
            checkForConcurrentModification();
            if (!hasNext())
            {
                throw new NoSuchElementException();
            } else
            {
                BiEntry bientry = next;
                next = bientry.nextInKToVBucket;
                toRemove = bientry;
                return output(bientry);
            }
        }

        abstract Object output(BiEntry bientry);

        public void remove()
        {
            checkForConcurrentModification();
            boolean flag;
            if (toRemove != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            CollectPreconditions.checkRemove(flag);
            delete(toRemove);
            expectedModCount = modCount;
            toRemove = null;
        }

        Itr()
        {
            this$0 = HashBiMap.this;
            super();
            nextBucket = 0;
            next = null;
            toRemove = null;
            expectedModCount = modCount;
        }
    }

    private final class KeySet extends Maps.KeySet
    {

        final HashBiMap this$0;

        public Iterator iterator()
        {
            return new Itr() {

                final KeySet this$1;

                Object output(BiEntry bientry)
                {
                    return bientry.key;
                }

            
            {
                this$1 = KeySet.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            obj = seekByKey(obj, HashBiMap.hash(obj));
            if (obj == null)
            {
                return false;
            } else
            {
                delete(((BiEntry) (obj)));
                return true;
            }
        }

        KeySet()
        {
            this$0 = HashBiMap.this;
            super(HashBiMap.this);
        }
    }


    private static final double LOAD_FACTOR = 1D;
    private static final long serialVersionUID = 0L;
    private transient BiEntry hashTableKToV[];
    private transient BiEntry hashTableVToK[];
    private transient BiMap inverse;
    private transient int mask;
    private transient int modCount;
    private transient int size;

    private HashBiMap(int i)
    {
        init(i);
    }

    public static HashBiMap create()
    {
        return create(16);
    }

    public static HashBiMap create(int i)
    {
        return new HashBiMap(i);
    }

    public static HashBiMap create(Map map)
    {
        HashBiMap hashbimap = create(map.size());
        hashbimap.putAll(map);
        return hashbimap;
    }

    private BiEntry[] createTable(int i)
    {
        return new BiEntry[i];
    }

    private void delete(BiEntry bientry)
    {
        BiEntry bientry1;
        BiEntry bientry2;
        int i;
        i = bientry.keyHash & mask;
        bientry2 = null;
        bientry1 = hashTableKToV[i];
_L3:
        if (bientry1 != bientry) goto _L2; else goto _L1
_L1:
        if (bientry2 == null)
        {
            hashTableKToV[i] = bientry.nextInKToVBucket;
        } else
        {
            bientry2.nextInKToVBucket = bientry.nextInKToVBucket;
        }
        i = bientry.valueHash & mask;
        bientry2 = null;
        bientry1 = hashTableVToK[i];
_L4:
        if (bientry1 == bientry)
        {
            if (bientry2 == null)
            {
                hashTableVToK[i] = bientry.nextInVToKBucket;
            } else
            {
                bientry2.nextInVToKBucket = bientry.nextInVToKBucket;
            }
            size = size - 1;
            modCount = modCount + 1;
            return;
        }
        break MISSING_BLOCK_LABEL_135;
_L2:
        bientry2 = bientry1;
        bientry1 = bientry1.nextInKToVBucket;
          goto _L3
        bientry2 = bientry1;
        bientry1 = bientry1.nextInVToKBucket;
          goto _L4
    }

    private static int hash(Object obj)
    {
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        return Hashing.smear(i);
    }

    private void init(int i)
    {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        i = Hashing.closedTableSize(i, 1.0D);
        hashTableKToV = createTable(i);
        hashTableVToK = createTable(i);
        mask = i - 1;
        modCount = 0;
        size = 0;
    }

    private void insert(BiEntry bientry)
    {
        int i = bientry.keyHash & mask;
        bientry.nextInKToVBucket = hashTableKToV[i];
        hashTableKToV[i] = bientry;
        i = bientry.valueHash & mask;
        bientry.nextInVToKBucket = hashTableVToK[i];
        hashTableVToK[i] = bientry;
        size = size + 1;
        modCount = modCount + 1;
    }

    private Object put(Object obj, Object obj1, boolean flag)
    {
label0:
        {
            int i = hash(obj);
            int j = hash(obj1);
            BiEntry bientry = seekByKey(obj, i);
            if (bientry != null && j == bientry.valueHash && Objects.equal(obj1, bientry.value))
            {
                return obj1;
            }
            BiEntry bientry1 = seekByValue(obj1, j);
            if (bientry1 != null)
            {
                if (!flag)
                {
                    break label0;
                }
                delete(bientry1);
            }
            if (bientry != null)
            {
                delete(bientry);
            }
            insert(new BiEntry(obj, i, obj1, j));
            rehashIfNecessary();
            if (bientry == null)
            {
                obj = null;
            } else
            {
                obj = bientry.value;
            }
            return obj;
        }
        obj = String.valueOf(String.valueOf(obj1));
        throw new IllegalArgumentException((new StringBuilder(((String) (obj)).length() + 23)).append("value already present: ").append(((String) (obj))).toString());
    }

    private Object putInverse(Object obj, Object obj1, boolean flag)
    {
label0:
        {
            int i = hash(obj);
            int j = hash(obj1);
            BiEntry bientry = seekByValue(obj, i);
            if (bientry != null && j == bientry.keyHash && Objects.equal(obj1, bientry.key))
            {
                return obj1;
            }
            BiEntry bientry1 = seekByKey(obj1, j);
            if (bientry1 != null)
            {
                if (!flag)
                {
                    break label0;
                }
                delete(bientry1);
            }
            if (bientry != null)
            {
                delete(bientry);
            }
            insert(new BiEntry(obj1, j, obj, i));
            rehashIfNecessary();
            if (bientry == null)
            {
                obj = null;
            } else
            {
                obj = bientry.key;
            }
            return obj;
        }
        obj = String.valueOf(String.valueOf(obj1));
        throw new IllegalArgumentException((new StringBuilder(((String) (obj)).length() + 23)).append("value already present: ").append(((String) (obj))).toString());
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        int i = Serialization.readCount(objectinputstream);
        init(i);
        Serialization.populateMap(this, objectinputstream, i);
    }

    private void rehashIfNecessary()
    {
        BiEntry abientry[] = hashTableKToV;
        if (Hashing.needsResizing(size, abientry.length, 1.0D))
        {
            int i = abientry.length * 2;
            hashTableKToV = createTable(i);
            hashTableVToK = createTable(i);
            mask = i - 1;
            size = 0;
            for (int j = 0; j < abientry.length; j++)
            {
                BiEntry bientry1;
                for (BiEntry bientry = abientry[j]; bientry != null; bientry = bientry1)
                {
                    bientry1 = bientry.nextInKToVBucket;
                    insert(bientry);
                }

            }

            modCount = modCount + 1;
        }
    }

    private BiEntry seekByKey(Object obj, int i)
    {
        for (BiEntry bientry = hashTableKToV[mask & i]; bientry != null; bientry = bientry.nextInKToVBucket)
        {
            if (i == bientry.keyHash && Objects.equal(obj, bientry.key))
            {
                return bientry;
            }
        }

        return null;
    }

    private BiEntry seekByValue(Object obj, int i)
    {
        for (BiEntry bientry = hashTableVToK[mask & i]; bientry != null; bientry = bientry.nextInVToKBucket)
        {
            if (i == bientry.valueHash && Objects.equal(obj, bientry.value))
            {
                return bientry;
            }
        }

        return null;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        Serialization.writeMap(this, objectoutputstream);
    }

    public void clear()
    {
        size = 0;
        Arrays.fill(hashTableKToV, null);
        Arrays.fill(hashTableVToK, null);
        modCount = modCount + 1;
    }

    public boolean containsKey(Object obj)
    {
        return seekByKey(obj, hash(obj)) != null;
    }

    public boolean containsValue(Object obj)
    {
        return seekByValue(obj, hash(obj)) != null;
    }

    public Set entrySet()
    {
        return new EntrySet();
    }

    public Object forcePut(Object obj, Object obj1)
    {
        return put(obj, obj1, true);
    }

    public Object get(Object obj)
    {
        obj = seekByKey(obj, hash(obj));
        if (obj == null)
        {
            return null;
        } else
        {
            return ((BiEntry) (obj)).value;
        }
    }

    public BiMap inverse()
    {
        if (inverse == null)
        {
            Inverse inverse1 = new Inverse();
            inverse = inverse1;
            return inverse1;
        } else
        {
            return inverse;
        }
    }

    public Set keySet()
    {
        return new KeySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return put(obj, obj1, false);
    }

    public Object remove(Object obj)
    {
        obj = seekByKey(obj, hash(obj));
        if (obj == null)
        {
            return null;
        } else
        {
            delete(((BiEntry) (obj)));
            return ((BiEntry) (obj)).value;
        }
    }

    public int size()
    {
        return size;
    }

    public volatile Collection values()
    {
        return values();
    }

    public Set values()
    {
        return inverse().keySet();
    }









}
