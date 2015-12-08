// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.cache.CacheLoader;
import com.weather.dal2.exceptions.DalException;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.tropical:
//            TropicalStormNewsFetcher

private static final class <init> extends CacheLoader
{

    public volatile Object load(Object obj)
        throws Exception
    {
        return load((String)obj);
    }

    public List load(String s)
        throws DalException, JSONException
    {
        return TropicalStormNewsFetcher.access$200(s);
    }

    private I()
    {
    }

    I(I i)
    {
        this();
    }
}
