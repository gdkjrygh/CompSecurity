// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.weather.commons.video.FeedType;
import com.weather.commons.video.VideoMessage;
import com.weather.commons.video.vast.ContentContainer;
import com.weather.commons.video.vast.Vast;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsVideoRecorder

public class LocalyticsVideoSummaryRecorder extends LocalyticsVideoRecorder
{

    LocalyticsVideoSummaryRecorder()
    {
    }

    public volatile void recordClickMainFeedVideo(String s, FeedType feedtype)
    {
        super.recordClickMainFeedVideo(s, feedtype);
    }

    public void recordExitAfterVideoClick(Vast vast, long l)
    {
        if (vast != null)
        {
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_LENGTH_BUCKETED, LocalyticsBuckets.TimeSpentInMinutes.lookup(TimeUnit.SECONDS.toMinutes(vast.getContent().getContentLength())));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_LENGTH_RAW, String.valueOf(vast.getContent().getContentLength()));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.TOTAL_TIME_WATCHED_BUCKETED, LocalyticsBuckets.TimeSpentInSeconds.lookup(l));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.TOTAL_TIME_WATCHED_RAW, String.valueOf(l));
            l = (100L * l) / (long)vast.getContent().getContentLength();
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_MILESTONE, LocalyticsBuckets.PercentageWatched.lookup(l));
        }
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.REASON_FOR_VIDEO_EXIT, LocalyticsAttributeValues.AttributeValue.REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_COMPLETED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
    }

    public void recordFullScreen()
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_FULL_SCREEN, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void recordShare(VideoMessage videomessage)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_SHARE, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_SHARE_TITLE, videomessage.getTitle());
    }

    public volatile void recordStartMethod(LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        super.recordStartMethod(attributevalue);
    }

    public void recordTotalAdLength(int i)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.AD_TIME_SPENT, LocalyticsBuckets.TimeSpentInMinutes.lookup(TimeUnit.SECONDS.toMinutes(i / 1000)));
    }

    public void recordVideoClick()
    {
        setPreviousScreenTag(LocalyticsAttributeValues.AttributeValue.PREVIOUS_SCREEN_VIDEO_PAGE.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_START_METHOD, LocalyticsAttributeValues.AttributeValue.REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO.getAttributeValue());
    }

    public void recordVideoCompletion(Vast vast)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_COMPLETED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        if (vast != null)
        {
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_LENGTH_BUCKETED, LocalyticsBuckets.TimeSpentInMinutes.lookup(TimeUnit.SECONDS.toMinutes(vast.getContent().getContentLength())));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_LENGTH_RAW, String.valueOf(vast.getContent().getContentLength()));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.TOTAL_TIME_WATCHED_BUCKETED, LocalyticsBuckets.TimeSpentInSeconds.lookup(vast.getContent().getPayloadLength()));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.TOTAL_TIME_WATCHED_RAW, String.valueOf(vast.getContent().getPayloadLength()));
        }
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_MILESTONE, LocalyticsBuckets.PercentageWatched.lookup(100L));
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.REASON_FOR_VIDEO_EXIT, LocalyticsAttributeValues.AttributeValue.REASONS_FOR_EXIT_VIDEO_COMPLETED.getAttributeValue());
    }

    public void recordVideoDeeplink()
    {
        setPreviousScreenTag(LocalyticsTags.ScreenName.DEEP_LINK.getName());
    }

    public void recordVideoIdTitleCategory(VideoMessage videomessage, String s)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_ID, videomessage.getClipid());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_TITLE, videomessage.getTitle());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_CATEGORY, s);
    }

    public void recordVideoPause()
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_PAUSED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        incrementValue(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_PAUSE_COUNT);
    }

    public volatile void recordVideoResume()
    {
        super.recordVideoResume();
    }

    public void recordVideoStartAfterVideoCompletion()
    {
        setPreviousScreenTag(LocalyticsAttributeValues.AttributeValue.PREVIOUS_SCREEN_VIDEO_PAGE.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_START_METHOD, LocalyticsAttributeValues.AttributeValue.VIDEO_START_METHOD_AUTO.getAttributeValue());
    }

    public volatile void setPreviousScreenTag(LocalyticsTags.ScreenName screenname)
    {
        super.setPreviousScreenTag(screenname);
    }

    public void setPreviousScreenTag(String s)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoCommonTags.PREVIOUS_SCREEN, s);
    }
}
