// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, Hashing, CollectPreconditions, ImmutableMapEntry, 
//            ImmutableSet, ImmutableMapEntrySet, RegularImmutableAsList, ImmutableList, 
//            UnmodifiableIterator

final class RegularImmutableMap extends ImmutableMap
{
    private class EntrySet extends ImmutableMapEntrySet
    {

        final RegularImmutableMap this$0;

        ImmutableList createAsList()
        {
            return new RegularImmutableAsList(this, entries);
        }

        public UnmodifiableIterator iterator()
        {
            return asList().iterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        ImmutableMap map()
        {
            return RegularImmutableMap.this;
        }

        private EntrySet()
        {
            this$0 = RegularImmutableMap.this;
            super();
        }

    }

    private static final class NonTerminalMapEntry extends ImmutableMapEntry
    {

        private final ImmutableMapEntry nextInKeyBucket;

        ImmutableMapEntry getNextInKeyBucket()
        {
            return nextInKeyBucket;
        }

        ImmutableMapEntry getNextInValueBucket()
        {
            return null;
        }

        NonTerminalMapEntry(ImmutableMapEntry immutablemapentry, ImmutableMapEntry immutablemapentry1)
        {
            super(immutablemapentry);
            nextInKeyBucket = immutablemapentry1;
        }

        NonTerminalMapEntry(Object obj, Object obj1, ImmutableMapEntry immutablemapentry)
        {
            super(obj, obj1);
            nextInKeyBucket = immutablemapentry;
        }
    }


    private static final double MAX_LOAD_FACTOR = 1.2D;
    private static final long serialVersionUID = 0L;
    private final transient ImmutableMapEntry entries[];
    private final transient int mask;
    private final transient ImmutableMapEntry table[];

    RegularImmutableMap(int i, ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        entries = createEntryArray(i);
        int j = Hashing.closedTableSize(i, 1.2D);
        table = createEntryArray(j);
        mask = j - 1;
        j = 0;
        while (j < i) 
        {
            Object obj = aterminalentry[j];
            Object obj1 = ((ImmutableMapEntry.TerminalEntry) (obj)).getKey();
            int k = Hashing.smear(obj1.hashCode()) & mask;
            ImmutableMapEntry immutablemapentry = table[k];
            if (immutablemapentry != null)
            {
                obj = new NonTerminalMapEntry(((ImmutableMapEntry) (obj)), immutablemapentry);
            }
            table[k] = ((ImmutableMapEntry) (obj));
            entries[j] = ((ImmutableMapEntry) (obj));
            checkNoConflictInBucket(obj1, ((ImmutableMapEntry) (obj)), immutablemapentry);
            j++;
        }
    }

    transient RegularImmutableMap(ImmutableMapEntry.TerminalEntry aterminalentry[])
    {
        this(aterminalentry.length, aterminalentry);
    }

    RegularImmutableMap(java.util.Map.Entry aentry[])
    {
        int j = aentry.length;
        entries = createEntryArray(j);
        int i = Hashing.closedTableSize(j, 1.2D);
        table = createEntryArray(i);
        mask = i - 1;
        i = 0;
        while (i < j) 
        {
            Object obj = aentry[i];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            CollectPreconditions.checkEntryNotNull(obj1, obj);
            int k = Hashing.smear(obj1.hashCode()) & mask;
            ImmutableMapEntry immutablemapentry = table[k];
            if (immutablemapentry == null)
            {
                obj = new ImmutableMapEntry.TerminalEntry(obj1, obj);
            } else
            {
                obj = new NonTerminalMapEntry(obj1, obj, immutablemapentry);
            }
            table[k] = ((ImmutableMapEntry) (obj));
            entries[i] = ((ImmutableMapEntry) (obj));
            checkNoConflictInBucket(obj1, ((ImmutableMapEntry) (obj)), immutablemapentry);
            i++;
        }
    }

    private void checkNoConflictInBucket(Object obj, ImmutableMapEntry immutablemapentry, ImmutableMapEntry immutablemapentry1)
    {
        while (immutablemapentry1 != null) 
        {
            boolean flag;
            if (!obj.equals(immutablemapentry1.getKey()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkNoConflict(flag, "key", immutablemapentry, immutablemapentry1);
            immutablemapentry1 = immutablemapentry1.getNextInKeyBucket();
        }
    }

    private ImmutableMapEntry[] createEntryArray(int i)
    {
        return new ImmutableMapEntry[i];
    }

    ImmutableSet createEntrySet()
    {
        return new EntrySet();
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = Hashing.smear(obj.hashCode());
            int j = mask;
            ImmutableMapEntry immutablemapentry = table[i & j];
            while (immutablemapentry != null) 
            {
                if (obj.equals(immutablemapentry.getKey()))
                {
                    return immutablemapentry.getValue();
                }
                immutablemapentry = immutablemapentry.getNextInKeyBucket();
            }
        }
        return null;
    }

    boolean isPartialView()
    {
        return false;
    }

    public int size()
    {
        return entries.length;
    }

}
