// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;


public class CachedObject
{

    private long cacheTime;
    private Object object;

    public CachedObject(long l, Object obj)
    {
        cacheTime = l;
        object = obj;
    }

    public long getCacheTime()
    {
        return cacheTime;
    }

    public Object getObject()
    {
        return object;
    }
}
