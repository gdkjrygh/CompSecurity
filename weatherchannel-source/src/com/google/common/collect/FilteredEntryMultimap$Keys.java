// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            FilteredEntryMultimap, CollectPreconditions, Multimap, Multiset, 
//            Multisets

class this._cls0 extends this._cls0
{

    final FilteredEntryMultimap this$0;

    public Set entrySet()
    {
        return new Multisets.EntrySet() {

            final FilteredEntryMultimap.Keys this$1;

            private boolean removeEntriesIf(Predicate predicate)
            {
                return FilteredEntryMultimap.this.removeEntriesIf(predicate. new Predicate() {

                    final _cls1 this$2;
                    final Predicate val$predicate;

                    public volatile boolean apply(Object obj)
                    {
                        return apply((java.util.Map.Entry)obj);
                    }

                    public boolean apply(java.util.Map.Entry entry)
                    {
                        return predicate.apply(Multisets.immutableEntry(entry.getKey(), ((Collection)entry.getValue()).size()));
                    }

            
            {
                this$2 = final__pcls1;
                predicate = Predicate.this;
                super();
            }
                });
            }

            public Iterator iterator()
            {
                return entryIterator();
            }

            Multiset multiset()
            {
                return FilteredEntryMultimap.Keys.this;
            }

            public boolean removeAll(Collection collection)
            {
                return removeEntriesIf(Predicates.in(collection));
            }

            public boolean retainAll(Collection collection)
            {
                return removeEntriesIf(Predicates.not(Predicates.in(collection)));
            }

            public int size()
            {
                return keySet().size();
            }

            
            {
                this$1 = FilteredEntryMultimap.Keys.this;
                super();
            }
        };
    }

    public int remove(Object obj, int i)
    {
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i != 0) goto _L2; else goto _L1
_L1:
        int k = count(obj);
_L4:
        return k;
_L2:
        Object obj1 = (Collection)unfiltered.asMap().get(obj);
        if (obj1 == null)
        {
            return 0;
        }
        int j = 0;
        obj1 = ((Collection) (obj1)).iterator();
        do
        {
            k = j;
            if (!((Iterator) (obj1)).hasNext())
            {
                continue;
            }
            Object obj2 = ((Iterator) (obj1)).next();
            if (FilteredEntryMultimap.access$000(FilteredEntryMultimap.this, obj, obj2))
            {
                int l = j + 1;
                j = l;
                if (l <= i)
                {
                    ((Iterator) (obj1)).remove();
                    j = l;
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    _cls1.this._cls1()
    {
        this$0 = FilteredEntryMultimap.this;
        super(FilteredEntryMultimap.this);
    }
}
