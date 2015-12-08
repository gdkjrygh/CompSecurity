// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            LinkedHashMultimap, Hashing, CollectPreconditions

final class y extends y
    implements ink
{

    private ink firstEntry;
    y hashTable[];
    private final Object key;
    private ink lastEntry;
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
            y ay[] = new y[hashTable.length * 2];
            hashTable = ay;
            int i = ay.length;
            for (ink ink = firstEntry; ink != this; ink = ink.getSuccessorInValueSet())
            {
                y y = (y)ink;
                int j = y.smearedValueHash & i - 1;
                y.nextInValueBucket = ay[j];
                ay[j] = y;
            }

        }
    }

    public boolean add(Object obj)
    {
        int i = Hashing.smearedHash(obj);
        int j = i & mask();
        y y1 = hashTable[j];
        for (y y = y1; y != null; y = y.nextInValueBucket)
        {
            if (y.matchesValue(obj, i))
            {
                return false;
            }
        }

        obj = new y(key, obj, i, y1);
        LinkedHashMultimap.access$200(lastEntry, ((ink) (obj)));
        LinkedHashMultimap.access$200(((ink) (obj)), this);
        LinkedHashMultimap.access$400(LinkedHashMultimap.access$300(LinkedHashMultimap.this).getPredecessorInMultimap(), ((y) (obj)));
        LinkedHashMultimap.access$400(((y) (obj)), LinkedHashMultimap.access$300(LinkedHashMultimap.this));
        hashTable[j] = ((y) (obj));
        size = size + 1;
        modCount = modCount + 1;
        rehashIfNecessary();
        return true;
    }

    public void clear()
    {
        Arrays.fill(hashTable, null);
        size = 0;
        for (ink ink = firstEntry; ink != this; ink = ink.getSuccessorInValueSet())
        {
            LinkedHashMultimap.access$600((y)ink);
        }

        LinkedHashMultimap.access$200(this, this);
        modCount = modCount + 1;
    }

    public boolean contains(Object obj)
    {
        int i = Hashing.smearedHash(obj);
        for (y y = hashTable[mask() & i]; y != null; y = y.nextInValueBucket)
        {
            if (y.matchesValue(obj, i))
            {
                return true;
            }
        }

        return false;
    }

    public ink getPredecessorInValueSet()
    {
        return lastEntry;
    }

    public ink getSuccessorInValueSet()
    {
        return firstEntry;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            int expectedModCount;
            LinkedHashMultimap.ValueSetLink nextEntry;
            final LinkedHashMultimap.ValueSet this$1;
            LinkedHashMultimap.ValueEntry toRemove;

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
                return nextEntry != LinkedHashMultimap.ValueSet.this;
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    LinkedHashMultimap.ValueEntry valueentry = (LinkedHashMultimap.ValueEntry)nextEntry;
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
                LinkedHashMultimap.ValueSet.this.remove(toRemove.getValue());
                expectedModCount = modCount;
                toRemove = null;
            }

            
            {
                this$1 = LinkedHashMultimap.ValueSet.this;
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
        y y1 = null;
        for (y y = hashTable[j]; y != null; y = y.nextInValueBucket)
        {
            if (y.matchesValue(obj, i))
            {
                if (y1 == null)
                {
                    hashTable[j] = y.nextInValueBucket;
                } else
                {
                    y1.nextInValueBucket = y.nextInValueBucket;
                }
                LinkedHashMultimap.access$500(y);
                LinkedHashMultimap.access$600(y);
                size = size - 1;
                modCount = modCount + 1;
                return true;
            }
            y1 = y;
        }

        return false;
    }

    public void setPredecessorInValueSet(ink ink)
    {
        lastEntry = ink;
    }

    public void setSuccessorInValueSet(ink ink)
    {
        firstEntry = ink;
    }

    public int size()
    {
        return size;
    }



    modCount(Object obj, int i)
    {
        this$0 = LinkedHashMultimap.this;
        super();
        size = 0;
        modCount = 0;
        key = obj;
        firstEntry = this;
        lastEntry = this;
        hashTable = new y[Hashing.closedTableSize(i, 1.0D)];
    }
}
