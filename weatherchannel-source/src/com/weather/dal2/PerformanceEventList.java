// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PerformanceEventList
{

    private final List eventsList;

    public PerformanceEventList(Collection collection)
    {
        eventsList = ImmutableList.copyOf(collection);
    }

    public List getPerformanceEventsList()
    {
        return Collections.unmodifiableList(eventsList);
    }
}
