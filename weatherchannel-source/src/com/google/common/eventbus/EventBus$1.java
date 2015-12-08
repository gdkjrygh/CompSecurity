// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.cache.CacheLoader;
import com.google.common.reflect.TypeToken;
import java.util.Set;

// Referenced classes of package com.google.common.eventbus:
//            EventBus

static final class peSet extends CacheLoader
{

    public volatile Object load(Object obj)
        throws Exception
    {
        return load((Class)obj);
    }

    public Set load(Class class1)
    {
        return TypeToken.of(class1).getTypes().rawTypes();
    }

    peSet()
    {
    }
}
