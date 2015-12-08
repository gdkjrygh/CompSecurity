// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;

class Variant
{

    private final String cacheKey;
    private final HttpCacheEntry entry;
    private final String variantKey;

    public Variant(String s, String s1, HttpCacheEntry httpcacheentry)
    {
        variantKey = s;
        cacheKey = s1;
        entry = httpcacheentry;
    }

    public String getCacheKey()
    {
        return cacheKey;
    }

    public HttpCacheEntry getEntry()
    {
        return entry;
    }

    public String getVariantKey()
    {
        return variantKey;
    }
}
