// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.weather.commons.video.FeedType;
import com.weather.commons.video2.VideoMessage;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsVideoRecorder

public class LocalyticsVideo2DetailRecorder extends LocalyticsVideoRecorder
{

    public LocalyticsVideo2DetailRecorder()
    {
    }

    public volatile void recordClickMainFeedVideo(String s, FeedType feedtype)
    {
        super.recordClickMainFeedVideo(s, feedtype);
    }

    public void recordIsScrolled()
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoDetailsTagName.VIDEO_SCROLL_ACTION, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void recordShare(VideoMessage videomessage)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoDetailsTagName.VIDEO_SHARE, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoDetailsTagName.VIDEO_SHARE_TITLE, videomessage.getId());
    }

    public volatile void recordStartMethod(LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        super.recordStartMethod(attributevalue);
    }

    public void recordTimeSpentInVideos(long l)
    {
        l = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - l);
        putValueIfAbsent(LocalyticsVideoTags.VideoDetailsTagName.TIME_SPENT, LocalyticsBuckets.TimeSpentInMinutes.lookup(l));
    }

    public volatile void recordVideoDeeplink()
    {
        super.recordVideoDeeplink();
    }

    public volatile void recordVideoResume()
    {
        super.recordVideoResume();
    }

    public volatile void setPreviousScreenTag(LocalyticsTags.ScreenName screenname)
    {
        super.setPreviousScreenTag(screenname);
    }

    public volatile void setPreviousScreenTag(String s)
    {
        super.setPreviousScreenTag(s);
    }
}
