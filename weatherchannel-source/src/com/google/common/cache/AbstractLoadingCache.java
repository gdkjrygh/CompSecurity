// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            AbstractCache, LoadingCache

public abstract class AbstractLoadingCache extends AbstractCache
    implements LoadingCache
{

    protected AbstractLoadingCache()
    {
    }

    public final Object apply(Object obj)
    {
        return getUnchecked(obj);
    }

    public ImmutableMap getAll(Iterable iterable)
        throws ExecutionException
    {
        java.util.LinkedHashMap linkedhashmap = Maps.newLinkedHashMap();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj = iterable.next();
            if (!linkedhashmap.containsKey(obj))
            {
                linkedhashmap.put(obj, get(obj));
            }
        } while (true);
        return ImmutableMap.copyOf(linkedhashmap);
    }

    public Object getUnchecked(Object obj)
    {
        try
        {
            obj = get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new UncheckedExecutionException(((ExecutionException) (obj)).getCause());
        }
        return obj;
    }

    public void refresh(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
