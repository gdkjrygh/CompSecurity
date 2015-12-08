// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.MapMaker;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.util.concurrent:
//            Striped

static class supplier extends 
{

    final ConcurrentMap locks = (new MapMaker()).weakValues().makeMap();
    final int size;
    final Supplier supplier;

    public Object getAt(int i)
    {
        if (size != 0x7fffffff)
        {
            Preconditions.checkElementIndex(i, size());
        }
        Object obj = locks.get(Integer.valueOf(i));
        if (obj != null)
        {
            return obj;
        } else
        {
            Object obj1 = supplier.get();
            return MoreObjects.firstNonNull(locks.putIfAbsent(Integer.valueOf(i), obj1), obj1);
        }
    }

    public int size()
    {
        return size;
    }

    (int i, Supplier supplier1)
    {
        super(i);
        if (mask == -1)
        {
            i = 0x7fffffff;
        } else
        {
            i = mask + 1;
        }
        size = i;
        supplier = supplier1;
    }
}
