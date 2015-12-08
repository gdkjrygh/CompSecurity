// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            StandardTable, Maps

private class this._cls1 extends this._cls1
{

    final romColumnIf this$1;

    public boolean contains(Object obj)
    {
        return StandardTable.this.contains(obj, ey);
    }

    public boolean remove(Object obj)
    {
        return StandardTable.this.remove(obj, ey) != null;
    }

    public boolean retainAll(Collection collection)
    {
        return romColumnIf(Maps.keyPredicateOnEntries(Predicates.not(Predicates.in(collection))));
    }

    ()
    {
        this$1 = this._cls1.this;
        super(this._cls1.this);
    }
}
