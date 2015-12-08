// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import java.util.HashMap;
import java.util.List;

public class SimpleMemoryCache
{

    private static final String KEY_PRODUCTS = "products";
    private static SimpleMemoryCache sInstance = null;
    private HashMap mObjectCache;

    private SimpleMemoryCache()
    {
        mObjectCache = new HashMap();
    }

    public static SimpleMemoryCache get()
    {
        com/walmartlabs/android/photo/util/SimpleMemoryCache;
        JVM INSTR monitorenter ;
        SimpleMemoryCache simplememorycache;
        if (sInstance == null)
        {
            sInstance = new SimpleMemoryCache();
        }
        simplememorycache = sInstance;
        com/walmartlabs/android/photo/util/SimpleMemoryCache;
        JVM INSTR monitorexit ;
        return simplememorycache;
        Exception exception;
        exception;
        throw exception;
    }

    public List getProducts()
    {
        if (mObjectCache.containsKey("products"))
        {
            return (List)mObjectCache.get("products");
        } else
        {
            return null;
        }
    }

    public void putProducts(List list)
    {
        mObjectCache.put("products", list);
    }

}
