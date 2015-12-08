// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.commons.video2:
//            RangedQueryUrlBuilder, VideoManager, VideoCollectionChunkQuery, RangedQuery

static class Q
    implements RangedQueryUrlBuilder
{

    public volatile String getUrl(RangedQuery rangedquery, ConfigurationManagers configurationmanagers)
        throws ConfigException
    {
        return getUrl((VideoCollectionChunkQuery)rangedquery, configurationmanagers);
    }

    public String getUrl(VideoCollectionChunkQuery videocollectionchunkquery, ConfigurationManagers configurationmanagers)
        throws ConfigException
    {
        return configurationmanagers.getFlagshipConfig().getVideoDedupedCollectionUrl(videocollectionchunkquery.getCollectionName(), videocollectionchunkquery.getQueryRange());
    }

    Q()
    {
    }
}
