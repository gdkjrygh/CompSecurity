// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.weather.commons.share.ShareableUrl;
import com.weather.commons.video.FeedType;
import com.weather.commons.video2.VideoMessage;
import com.weather.commons.video2.dsx.Tags;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsVideoRecorder

public class LocalyticsVideo2SummaryRecorder extends LocalyticsVideoRecorder
{

    public LocalyticsVideo2SummaryRecorder()
    {
    }

    private void recordDetails(long l, long l1, long l2)
    {
        if (l > 0L && l1 >= 0L)
        {
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_LENGTH_BUCKETED, LocalyticsBuckets.TimeSpentInMinutes.lookup(TimeUnit.SECONDS.toMinutes(l)));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_LENGTH_RAW, String.valueOf(l));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.TOTAL_TIME_WATCHED_BUCKETED, LocalyticsBuckets.TimeSpentInSeconds.lookup(l1 + l2));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.TOTAL_TIME_WATCHED_RAW, String.valueOf(l1 + l2));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_TIME_SPENT_OUTSIDE_ADS, String.valueOf(l1));
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_TIME_SPENT_DURING_ADS, String.valueOf(l2));
            l = (100L * l1) / l;
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_MILESTONE, LocalyticsBuckets.PercentageWatched.lookup(l));
        }
    }

    public void incrementStreamFailures()
    {
        incrementValue(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_STREAM_FAILURE_COUNT);
    }

    public volatile void recordClickMainFeedVideo(String s, FeedType feedtype)
    {
        super.recordClickMainFeedVideo(s, feedtype);
    }

    public void recordExitAfterClick(long l, long l1, long l2, boolean flag)
    {
        recordDetails(l, l1, l2);
        LocalyticsVideoTags.VideoSummaryTagName videosummarytagname = LocalyticsVideoTags.VideoSummaryTagName.REASON_FOR_VIDEO_EXIT;
        String s;
        if (flag)
        {
            s = LocalyticsAttributeValues.AttributeValue.REASONS_FOR_EXIT_USER_EXITED_DURING_AD.getAttributeValue();
        } else
        {
            s = LocalyticsAttributeValues.AttributeValue.REASONS_FOR_EXIT_USER_EXITED.getAttributeValue();
        }
        putValueIfAbsent(videosummarytagname, s);
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_COMPLETED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
    }

    public void recordExitAfterVideoClick(long l, long l1, long l2)
    {
        recordDetails(l, l1, l2);
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.REASON_FOR_VIDEO_EXIT, LocalyticsAttributeValues.AttributeValue.REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_COMPLETED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
    }

    public void recordFullScreen()
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_FULL_SCREEN, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void recordShare(ShareableUrl shareableurl)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_SHARE, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_SHARE_TITLE, shareableurl.getTitle());
    }

    public volatile void recordStartMethod(LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        super.recordStartMethod(attributevalue);
    }

    public void recordVideoAttributes(VideoMessage videomessage)
    {
        recordVideoIdTitle(videomessage);
        if (videomessage.getPlaylistId() != null)
        {
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_PLAYLIST, videomessage.getPlaylistId());
        }
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_COLLECTION, videomessage.getCollectionId());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_PROVIDER, videomessage.getProvider());
        if (videomessage.getTags().hasDmaLocale())
        {
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_DMA_LOCALE, videomessage.getTags().getDmaLocale());
        }
    }

    public void recordVideoCompletion(long l, long l1)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_COMPLETED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_LENGTH_BUCKETED, LocalyticsBuckets.TimeSpentInMinutes.lookup(TimeUnit.SECONDS.toMinutes(l)));
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_LENGTH_RAW, String.valueOf(l));
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.TOTAL_TIME_WATCHED_BUCKETED, LocalyticsBuckets.TimeSpentInSeconds.lookup(l + l1));
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.TOTAL_TIME_WATCHED_RAW, String.valueOf(l + l1));
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_TIME_SPENT_OUTSIDE_ADS, String.valueOf(l));
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_TIME_SPENT_DURING_ADS, String.valueOf(l1));
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_MILESTONE, LocalyticsBuckets.PercentageWatched.lookup(100L));
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.REASON_FOR_VIDEO_EXIT, LocalyticsAttributeValues.AttributeValue.REASONS_FOR_EXIT_VIDEO_COMPLETED.getAttributeValue());
    }

    public volatile void recordVideoDeeplink()
    {
        super.recordVideoDeeplink();
    }

    public void recordVideoFail(String s)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_COMPLETED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.REASON_FOR_VIDEO_EXIT, LocalyticsAttributeValues.AttributeValue.REASONS_FOR_EXIT_ERROR_ENCOUNTERED.getAttributeValue());
        if (s != null)
        {
            putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_EXIT_ERROR_REASON, s);
        }
    }

    public void recordVideoIdTitle(VideoMessage videomessage)
    {
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_ID, videomessage.getId());
        putValueIfAbsent(LocalyticsVideoTags.VideoSummaryTagName.VIDEO_TITLE, videomessage.getTitle());
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

    public volatile void setPreviousScreenTag(LocalyticsTags.ScreenName screenname)
    {
        super.setPreviousScreenTag(screenname);
    }

    public volatile void setPreviousScreenTag(String s)
    {
        super.setPreviousScreenTag(s);
    }
}
