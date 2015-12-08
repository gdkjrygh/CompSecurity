// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.weather.commons.share.ShareableUrl;
import com.weather.commons.video2.dsx.AdsMetrics;
import com.weather.commons.video2.dsx.Tags;
import com.weather.commons.video2.dsx.VideoStreamType;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;

// Referenced classes of package com.weather.commons.video2:
//            ThumbnailSize

public interface VideoMessage
    extends ShareableUrl
{
    public static class VideoStreamInfo
    {

        private static final String TAG = "VideoStreamInfo";
        public final VideoStreamType type;
        public final String url;
        public final String variantName;

        public String toString()
        {
            return (new StringBuilder()).append("VideoStreamInfo{url='").append(url).append('\'').append(", type=").append(type).append(", variantName='").append(variantName).append('\'').append('}').toString();
        }

        public VideoStreamInfo(String s, VideoStreamType videostreamtype, String s1)
        {
            url = (String)Preconditions.checkNotNull(s);
            type = (VideoStreamType)Preconditions.checkNotNull(videostreamtype);
            variantName = (String)Preconditions.checkNotNull(s1);
            LogUtil.d("VideoStreamInfo", LoggingMetaTags.TWC_VIDEOS, "%s", new Object[] {
                this
            });
        }
    }


    public static final String VIDEO_PROVIDER_DEFAULT = "unknown";

    public abstract AdsMetrics getAdsMetrics();

    public abstract String getCollectionId();

    public abstract String getDescription();

    public abstract String getDuration();

    public abstract String getId();

    public abstract String getLocaleGlob();

    public abstract String getPlaylistId();

    public abstract String getProvider();

    public abstract Tags getTags();

    public abstract String getTeaserTitle();

    public abstract String getThumbnailUrl(ThumbnailSize thumbnailsize);

    public abstract String getTitle();

    public abstract String getUrl(String s);

    public abstract List getVideoStreamInfo(boolean flag);

    public abstract boolean isLive();
}
