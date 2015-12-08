// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            FilteredEntryMultimap, Multiset, Multisets

class this._cls1 extends this._cls1
{

    final removeEntriesIf this$1;

    private boolean removeEntriesIf(final Predicate predicate)
    {
        return FilteredEntryMultimap.this.removeEntriesIf(new Predicate() {

            final FilteredEntryMultimap.Keys._cls1 this$2;
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
                this$2 = FilteredEntryMultimap.Keys._cls1.this;
                predicate = predicate1;
                super();
            }
        });
    }

    public Iterator iterator()
    {
        return tryIterator();
    }

    Multiset multiset()
    {
        return this._cls1.this;
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

    _cls1.val.predicate()
    {
        this$1 = this._cls1.this;
        super();
    }
}
