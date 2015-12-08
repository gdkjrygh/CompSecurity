// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, Multimaps, Multimap, Maps, 
//            CollectPreconditions, Multiset, TransformedIterator

static class multimap extends AbstractMultiset
{
    class KeysEntrySet extends Multisets.EntrySet
    {

        final Multimaps.Keys this$0;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Collection collection = (Collection)multimap.asMap().get(((Multiset.Entry) (obj)).getElement());
                flag = flag1;
                if (collection != null)
                {
                    flag = flag1;
                    if (collection.size() == ((Multiset.Entry) (obj)).getCount())
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public boolean isEmpty()
        {
            return multimap.isEmpty();
        }

        public Iterator iterator()
        {
            return entryIterator();
        }

        Multiset multiset()
        {
            return Multimaps.Keys.this;
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Collection collection = (Collection)multimap.asMap().get(((Multiset.Entry) (obj)).getElement());
                if (collection != null && collection.size() == ((Multiset.Entry) (obj)).getCount())
                {
                    collection.clear();
                    return true;
                }
            }
            return false;
        }

        public int size()
        {
            return distinctElements();
        }

        KeysEntrySet()
        {
            this$0 = Multimaps.Keys.this;
            super();
        }
    }


    final Multimap multimap;

    public void clear()
    {
        multimap.clear();
    }

    public boolean contains(Object obj)
    {
        return multimap.containsKey(obj);
    }

    public int count(Object obj)
    {
        obj = (Collection)Maps.safeGet(multimap.asMap(), obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Collection) (obj)).size();
        }
    }

    Set createEntrySet()
    {
        return new KeysEntrySet();
    }

    int distinctElements()
    {
        return multimap.asMap().size();
    }

    public Set elementSet()
    {
        return multimap.keySet();
    }

    Iterator entryIterator()
    {
        return new TransformedIterator(multimap.asMap().entrySet().iterator()) {

            final Multimaps.Keys this$0;

            Multiset.Entry transform(java.util.Map.Entry entry)
            {
                return entry. new Multisets.AbstractEntry() {

                    final _cls1 this$1;
                    final java.util.Map.Entry val$backingEntry;

                    public int getCount()
                    {
                        return ((Collection)backingEntry.getValue()).size();
                    }

                    public Object getElement()
                    {
                        return backingEntry.getKey();
                    }

            
            {
                this$1 = final__pcls1;
                backingEntry = java.util.Map.Entry.this;
                super();
            }
                };
            }

            volatile Object transform(Object obj)
            {
                return transform((java.util.Map.Entry)obj);
            }

            
            {
                this$0 = Multimaps.Keys.this;
                super(iterator1);
            }
        };
    }

    public Iterator iterator()
    {
        return Maps.keyIterator(multimap.entries().iterator());
    }

    public int remove(Object obj, int i)
    {
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = count(obj);
_L4:
        return j;
_L2:
        obj = (Collection)Maps.safeGet(multimap.asMap(), obj);
        if (obj == null)
        {
            return 0;
        }
        int l = ((Collection) (obj)).size();
        if (i >= l)
        {
            ((Collection) (obj)).clear();
            return l;
        }
        obj = ((Collection) (obj)).iterator();
        int k = 0;
        do
        {
            j = l;
            if (k >= i)
            {
                continue;
            }
            ((Iterator) (obj)).next();
            ((Iterator) (obj)).remove();
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    ator(Multimap multimap1)
    {
        multimap = multimap1;
    }
}
