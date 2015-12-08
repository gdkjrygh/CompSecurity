// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, Iterators

class this._cls0 extends this._cls0
{

    final this._cls0 this$0;

    public Iterator iterator()
    {
        return Iterators.transform(omMap.entrySet().iterator(), Maps.asEntryToEntryFunction(ansformer));
    }

    Map map()
    {
        return this._cls0.this;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
