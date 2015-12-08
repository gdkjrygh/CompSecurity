// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import com.google.common.collect.ImmutableList;
import java.util.List;

public final class Tags
{

    private final List keywords;
    private final List storms;

    public Tags()
    {
        this(((List) (ImmutableList.of())), ((List) (ImmutableList.of())));
    }

    public Tags(List list, List list1)
    {
        keywords = ImmutableList.copyOf(list);
        storms = ImmutableList.copyOf(list1);
    }

    public List getKeywords()
    {
        return ImmutableList.copyOf(keywords);
    }

    public List getStorms()
    {
        return ImmutableList.copyOf(storms);
    }
}
