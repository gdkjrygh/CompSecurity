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
//            FilteredEntryMultimap, Multimap, Maps

class this._cls1 extends this._cls1
{

    final triesIf this$1;

    public boolean remove(Object obj)
    {
label0:
        {
            if (!(obj instanceof Collection))
            {
                break label0;
            }
            obj = (Collection)obj;
            Iterator iterator = unfiltered.asMap().entrySet().iterator();
            java.util.ultimap ultimap;
            Object obj1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                ultimap = (java.util.)iterator.next();
                obj1 = ultimap.();
                obj1 = FilteredEntryMultimap.filterCollection((Collection)ultimap.filterCollection(), new dicate(_fld0, obj1));
            } while (((Collection) (obj1)).isEmpty() || !((Collection) (obj)).equals(obj1));
            if (((Collection) (obj1)).size() == ((Collection)ultimap.ultimap()).size())
            {
                iterator.remove();
            } else
            {
                ((Collection) (obj1)).clear();
            }
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection collection)
    {
        return removeEntriesIf(Maps.valuePredicateOnEntries(Predicates.in(collection)));
    }

    public boolean retainAll(Collection collection)
    {
        return removeEntriesIf(Maps.valuePredicateOnEntries(Predicates.not(Predicates.in(collection))));
    }

    dicate(Map map)
    {
        this$1 = this._cls1.this;
        super(map);
    }
}
