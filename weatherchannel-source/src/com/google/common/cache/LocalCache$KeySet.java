// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.cache:
//            LocalCache

final class tCacheSet extends tCacheSet
{

    final LocalCache this$0;

    public boolean contains(Object obj)
    {
        return map.containsKey(obj);
    }

    public Iterator iterator()
    {
        return new ator(LocalCache.this);
    }

    public boolean remove(Object obj)
    {
        return map.remove(obj) != null;
    }

    ator(ConcurrentMap concurrentmap)
    {
        this$0 = LocalCache.this;
        super(LocalCache.this, concurrentmap);
    }
}
