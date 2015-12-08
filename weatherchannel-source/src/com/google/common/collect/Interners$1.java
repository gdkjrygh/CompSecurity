// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            Interner, Interners

static final class val.map
    implements Interner
{

    final ConcurrentMap val$map;

    public Object intern(Object obj)
    {
        Object obj1 = val$map.putIfAbsent(Preconditions.checkNotNull(obj), obj);
        if (obj1 == null)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    (ConcurrentMap concurrentmap)
    {
        val$map = concurrentmap;
        super();
    }
}
