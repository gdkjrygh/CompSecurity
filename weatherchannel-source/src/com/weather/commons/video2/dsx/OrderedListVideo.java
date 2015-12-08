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
//            CollectionData, VideoAsset, PlData, AdsMetrics, 
//            Flags, Tags

public class OrderedListVideo
    implements VideoMessage
{

    private static final String FIELD_NAME_COLLECTIONDATA = "_collectiondata";
    private static final String FIELD_NAME_PLDATA = "_pldata";
    private final CollectionData collectionData;
    private final PlData playlistData;
    private final VideoAsset videoAsset;

    private OrderedListVideo(CollectionData collectiondata, VideoAsset videoasset, PlData pldata)
    {
        collectionData = (CollectionData)Preconditions.checkNotNull(collectiondata);
        videoAsset = (VideoAsset)Preconditions.checkNotNull(videoasset);
        playlistData = pldata;
    }

    public static OrderedListVideo fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("_pldata");
        CollectionData collectiondata = CollectionData.fromJson(jsonobject.getJSONObject("_collectiondata"));
        VideoAsset videoasset = VideoAsset.fromJson(jsonobject);
        if (jsonobject1 == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = PlData.fromJson(jsonobject1);
        }
        return new OrderedListVideo(collectiondata, videoasset, jsonobject);
    }

    public AdsMetrics getAdsMetrics()
    {
        return videoAsset.getAdsMetrics();
    }

    public CollectionData getCollectionData()
    {
        return collectionData;
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
        if (playlistData != null)
        {
            return playlistData.getId();
        } else
        {
            return null;
        }
    }

    public String getPlaylistTitle()
    {
        if (playlistData != null)
        {
            return playlistData.getTitle();
        } else
        {
            return collectionData.getTitle();
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
        return videoAsset.getTeaserTitle();
    }

    public String getThumbnailUrl(ThumbnailSize thumbnailsize)
    {
        return videoAsset.getThumbnailUrl(thumbnailsize);
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
        return (new StringBuilder()).append("OrderedListVideo{collectionData=").append(collectionData).append(", videoAsset=").append(videoAsset).append(", playlistData=").append(playlistData).append('}').toString();
    }
}
