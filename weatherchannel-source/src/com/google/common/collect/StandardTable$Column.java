// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, Maps, AbstractIterator, AbstractMapEntry

private class ll extends Map
{
    private class EntrySet extends Sets.ImprovedAbstractSet
    {

        final StandardTable.Column this$1;

        public void clear()
        {
            removeFromColumnIf(Predicates.alwaysTrue());
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return StandardTable.access$400(this$0, ((java.util.Map.Entry) (obj)).getKey(), columnKey, ((java.util.Map.Entry) (obj)).getValue());
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
            return new EntrySetIterator(null);
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return StandardTable.access$500(this$0, ((java.util.Map.Entry) (obj)).getKey(), columnKey, ((java.util.Map.Entry) (obj)).getValue());
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

        private EntrySet()
        {
            this$1 = StandardTable.Column.this;
            super();
        }

        EntrySet(StandardTable._cls1 _pcls1)
        {
            this();
        }
    }

    private class EntrySetIterator extends AbstractIterator
    {

        final Iterator iterator;
        final StandardTable.Column this$1;

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

                        final EntrySetIterator this$2;
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
   