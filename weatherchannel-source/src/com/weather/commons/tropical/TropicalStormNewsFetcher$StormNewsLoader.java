// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheLoader;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.exceptions.DalException;
import com.weather.util.config.ConfigException;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.tropical:
//            TropicalStormNewsFetcher

private static final class <init> extends CacheLoader
{

    private final ConfigurationManagers configurationManagers;

    public volatile Object load(Object obj)
        throws Exception
    {
        return load((String)obj);
    }

    public List load(String s)
        throws DalException, JSONException, ConfigException
    {
        return TropicalStormNewsFetcher.access$200(configurationManagers.getFlagshipConfig().stormNewsUrl.replace("{STORM_ID}", s));
    }

    private (ConfigurationManagers configurationmanagers)
    {
        configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
    }

    configurationManagers(ConfigurationManagers configurationmanagers, configurationManagers configurationmanagers1)
    {
        this(configurationmanagers);
    }
}
