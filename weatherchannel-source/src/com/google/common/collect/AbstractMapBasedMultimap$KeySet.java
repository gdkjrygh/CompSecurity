// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, Iterators, CollectPreconditions

private class this._cls0 extends this._cls0
{

    final AbstractMapBasedMultimap this$0;

    public void clear()
    {
        Iterators.clear(iterator());
    }

    public boolean containsAll(Collection collection)
    {
        return map().keySet().containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return this == obj || map().keySet().equals(obj);
    }

    public int hashCode()
    {
        return map().keySet().hashCode();
    }

    public Iterator iterator()
    {
        return new Iterator() {

            java.util.Map.Entry entry;
            final AbstractMapBasedMultimap.KeySet this$1;
            final Iterator val$entryIterator;

            public boolean hasNext()
            {
                return entryIterator.hasNext();
            }

            public Object next()
            {
                entry = (java.util.Map.Entry)entryIterator.next();
                return entry.getKey();
            }

            public void remove()
            {
                Collection collection;
                boolean flag;
                if (entry != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CollectPreconditions.checkRemove(flag);
                collection = (Collection)entry.getValue();
                entryIterator.remove();
                AbstractMapBasedMultimap.access$220(this$0, collection.size());
                collection.clear();
            }

            
            {
                this$1 = AbstractMapBasedMultimap.KeySet.this;
                entryIterator = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        int i = 0;
        obj = (Collection)map().remove(obj);
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, i);
        }
        return i > 0;
    }

    _cls1.val.entryIterator(Map map)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(map);
    }
}
