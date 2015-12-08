// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.cache;

import android.content.Context;

// Referenced classes of package io.fabric.sdk.android.services.cache:
//            AbstractValueCache, ValueCache

public class MemoryValueCache extends AbstractValueCache
{

    private Object value;

    public MemoryValueCache()
    {
        this(null);
    }

    public MemoryValueCache(ValueCache valuecache)
    {
        super(valuecache);
    }

    protected void cacheValue(Context context, Object obj)
    {
        value = obj;
    }

    protected void doInvalidate(Context context)
    {
        value = null;
    }

    protected Object getCached(Context context)
    {
        return value;
    }
}
