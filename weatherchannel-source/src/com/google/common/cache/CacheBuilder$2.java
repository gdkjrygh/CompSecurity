// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Supplier;

// Referenced classes of package com.google.common.cache:
//            CacheBuilder

static final class tatsCounter
    implements Supplier
{

    public tatsCounter get()
    {
        return new impleStatsCounter();
    }

    public volatile Object get()
    {
        return get();
    }

    tatsCounter()
    {
    }
}
