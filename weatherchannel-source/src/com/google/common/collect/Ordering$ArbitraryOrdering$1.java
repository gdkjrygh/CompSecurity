// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            Ordering

class this._cls0
    implements Function
{

    final AtomicInteger counter = new AtomicInteger(0);
    final apply this$0;

    public Integer apply(Object obj)
    {
        return Integer.valueOf(counter.getAndIncrement());
    }

    public volatile Object apply(Object obj)
    {
        return apply(obj);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
