// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.storesearch;

import java.util.Collections;
import java.util.Map;

public class StoreMapMapping
{

    public final Map mapping;

    public StoreMapMapping(Map map)
    {
        mapping = Collections.unmodifiableMap(map);
    }
}
