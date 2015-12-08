// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.google.common.base.Preconditions;
import com.weather.commons.video2.ThumbnailSize;
import com.weather.commons.video2.VideoMessage;
import com.weather.util.parsing.ValidationException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.video2.dsx:
//            VideoAsset, Config, AdsMetrics, Flags, 
//            Tags

public class ListVideo
    implements VideoMessage
{

    private static final String FIELD_NAME_CONFIG = "_config";
    private final Config config;
    private final VideoAsset videoAsset;

    private ListVideo(VideoAsset videoasset, Config config1)
    {
        videoAsset = (VideoAsset)Preconditions.checkNotNull(videoasset);
        config = config1;
    }

    public static ListVideo fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        Preconditions.checkNotNull(jsonobject);
        JSONObject jsonobject1 = jsonobject.optJSONObject("_config");
        VideoAsset videoasset = VideoAsset.fromJson(jsonobject);
        if (jsonobject1 == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = Config.fromJson(jsonobject1);
        }
        return new ListVideo(videoasset, jsonobject);
    }

    public AdsMetrics getAdsMetrics()
    {
        return videoAsset.getAdsMetrics();
    }

    public String getCollectionId()
    {
        return videoAsset.getCollectionId();
    }

    public String getDescription()
    {
        return videoAsset.getDescription();
    }

    public String getDuration()
    {
        return videoAsset.getDuration();
    }

    public long getExpiresTime()
    {
        return videoAsset.getExpiresTime();
    }

    public Flags getFlags()
    {
        return videoAsset.getFlags();
    }

    public String getId()
    {
        return videoAsset.getId();
    }

    public String getLocaleGlob()
    {
        return videoAsset.getLocaleGlob();
    }

    public String getPlaylistId()
    {
        if (config != null)
        {
            return config.getPlaylist();
        } else
        {
            return null;
        }
    }

    public String getProvider()
    {
        return videoAsset.getProvider();
    }

    public Tags getTags()
    {
        return videoAsset.getTags();
    }

    public String getTeaserTitle()
    {
        String s;
        if (config == null)
        {
            s = null;
        } else
        {
            s = config.getTeaserTitle();
        }
        if (s != null)
        {
            return s;
        } else
        {
            return videoAsset.getTeaserTitle();
        }
    }

    public String getThumbnailUrl(ThumbnailSize thumbnailsize)
    {
        String s;
        if (config == null)
        {
            s = null;
        } else
        {
            s = config.getThumbnailUrl(thumbnailsize);
        }
        if (s != null)
        {
            return s;
        } else
        {
            return videoAsset.getThumbnailUrl(thumbnailsize);
        }
    }

    public String getTitle()
    {
        return videoAsset.getTitle();
    }

    public String getUrl(String s)
    {
        return videoAsset.getUrl(s);
    }

    public List getVideoStreamInfo(boolean flag)
    {
        return videoAsset.getVideoStreamInfo(flag);
    }

    public boolean isLive()
    {
        return videoAsset.isLive();
    }

    public String toString()
    {
        return (new StringBuilder()).append("ListVideo{videoAsset=").append(videoAsset).append(", config=").append(config).append('}').toString();
    }
}
