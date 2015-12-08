// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.common.util.concurrent:
//            AtomicLongMap

class this._cls0
    implements Function
{

    final AtomicLongMap this$0;

    public Long apply(AtomicLong atomiclong)
    {
        return Long.valueOf(atomiclong.get());
    }

    public volatile Object apply(Object obj)
    {
        return apply((AtomicLong)obj);
    }

    ()
    {
        this$0 = AtomicLongMap.this;
        super();
    }
}
