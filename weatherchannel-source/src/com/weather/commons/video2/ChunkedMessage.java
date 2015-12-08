// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.weather.commons.video2.dsx.AdsMetrics;
import com.weather.commons.video2.dsx.Tags;
import java.util.List;

// Referenced classes of package com.weather.commons.video2:
//            VideoMessage, RangedQuery, ThumbnailSize

public class ChunkedMessage
    implements VideoMessage
{

    private final RangedQuery rangedQuery;
    private final VideoMessage videoMessage;

    public ChunkedMessage(RangedQuery rangedquery, VideoMessage videomessage)
    {
        videoMessage = videomessage;
        rangedQuery = rangedquery;
    }

    public AdsMetrics getAdsMetrics()
    {
        return videoMessage.getAdsMetrics();
    }

    public String getCollectionId()
    {
        return videoMessage.getCollectionId();
    }

    public String getDescription()
    {
        return videoMessage.getDescription();
    }

    public String getDuration()
    {
        return videoMessage.getDuration();
    }

    public String getId()
    {
        return videoMessage.getId();
    }

    public String getLocaleGlob()
    {
        return videoMessage.getLocaleGlob();
    }

    public String getPlaylistId()
    {
        return videoMessage.getPlaylistId();
    }

    public String getProvider()
    {
        return videoMessage.getProvider();
    }

    public RangedQuery getRangedQuery()
    {
        return rangedQuery;
    }

    public Tags getTags()
    {
        return videoMessage.getTags();
    }

    public String getTeaserTitle()
    {
        return videoMessage.getTeaserTitle();
    }

    public String getThumbnailUrl(ThumbnailSize thumbnailsize)
    {
        return videoMessage.getThumbnailUrl(thumbnailsize);
    }

    public String getTitle()
    {
        return videoMessage.getTitle();
    }

    public String getUrl(String s)
    {
        return videoMessage.getUrl(s);
    }

    public List getVideoStreamInfo(boolean flag)
    {
        return videoMessage.getVideoStreamInfo(flag);
    }

    public boolean isLive()
    {
        return videoMessage.isLive();
    }

    public String toString()
    {
        return (new StringBuilder()).append("ChunkedMessage{videoMessage=").append(videoMessage).append(", rangedQuery=").append(rangedQuery).append('}').toString();
    }
}
