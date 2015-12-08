// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            FilteredEntryMultimap, Iterators, AbstractIterator, Multimap, 
//            Maps

class this._cls1 extends this._cls1
{

    final iterator this$1;

    public Iterator iterator()
    {
        return new AbstractIterator() {

            final Iterator backingIterator;
            final FilteredEntryMultimap.AsMap._cls2 this$2;

            protected volatile Object computeNext()
            {
                return computeNext();
            }

            protected java.util.Map.Entry computeNext()
            {
                while (backingIterator.hasNext()) 
                {
                    Object obj1 = (java.util.Map.Entry)backingIterator.next();
                    Object obj = ((java.util.Map.Entry) (obj1)).getKey();
                    obj1 = FilteredEntryMultimap.filterCollection((Collection)((java.util.Map.Entry) (obj1)).getValue(), new FilteredEntryMultimap.ValuePredicate(this$0, obj));
                    if (!((Collection) (obj1)).isEmpty())
                    {
                        return Maps.immutableEntry(obj, obj1);
                    }
                }
                return (java.util.Map.Entry)endOfData();
            }

            
            {
                this$2 = FilteredEntryMultimap.AsMap._cls2.this;
                super();
                backingIterator = unfiltered.asMap().entrySet().iterator();
            }
        };
    }

    Map map()
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
        return Iterators.size(iterator());
    }

    ed()
    {
        this$1 = this._cls1.this;
        super();
    }
}
