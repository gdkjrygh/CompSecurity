// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            FilteredEntryMultimap, Maps

class this._cls1 extends this._cls1
{

    final triesIf this$1;

    public boolean remove(Object obj)
    {
        return move(obj) != null;
    }

    public boolean removeAll(Collection collection)
    {
        return removeEntriesIf(Maps.keyPredicateOnEntries(Predicates.in(collection)));
    }

    public boolean retainAll(Collection collection)
    {
        return removeEntriesIf(Maps.keyPredicateOnEntries(Predicates.not(Predicates.in(collection))));
    }

    (Map map)
    {
        this$1 = this._cls1.this;
        super(map);
    }
}
