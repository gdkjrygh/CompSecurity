// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import java.util.LinkedHashMap;

final class CacheMap extends LinkedHashMap
{

    private static final long serialVersionUID = 0x947261229844e341L;
    private final int maxEntries;

    CacheMap(int i)
    {
        super(20, 0.75F, true);
        maxEntries = i;
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > maxEntries;
    }
}
