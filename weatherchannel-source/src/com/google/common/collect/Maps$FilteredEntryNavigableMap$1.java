// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, Iterators

class this._cls0 extends this._cls0
{

    final this._cls0 this$0;

    public boolean removeAll(Collection collection)
    {
        return Iterators.removeIf(cess._mth700(this._cls0.this).entrySet().iterator(), Predicates.and(cess._mth600(this._cls0.this), Maps.keyPredicateOnEntries(Predicates.in(collection))));
    }

    public boolean retainAll(Collection collection)
    {
        return Iterators.removeIf(cess._mth700(this._cls0.this).entrySet().iterator(), Predicates.and(cess._mth600(this._cls0.this), Maps.keyPredicateOnEntries(Predicates.not(Predicates.in(collection)))));
    }

    (NavigableMap navigablemap)
    {
        this$0 = this._cls0.this;
        super(navigablemap);
    }
}
