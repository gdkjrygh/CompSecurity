// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.util;

import java.util.LinkedHashMap;

public class LRUMap extends LinkedHashMap
{

    protected final int _maxEntries;

    public LRUMap(int i, int j)
    {
        super(i, 0.8F, true);
        _maxEntries = j;
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > _maxEntries;
    }
}
