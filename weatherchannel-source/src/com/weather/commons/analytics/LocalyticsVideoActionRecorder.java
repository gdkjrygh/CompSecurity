// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.weather.commons.video2.VideoMessage;
import com.weather.commons.video2.dsx.Tags;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsHandler, LocalyticsEvent, Attribute, Event

public class LocalyticsVideoActionRecorder
{

    private final LocalyticsHandler handler;

    public LocalyticsVideoActionRecorder()
    {
        this(LocalyticsHandler.getInstance());
    }

    public LocalyticsVideoActionRecorder(LocalyticsHandler localyticshandler)
    {
        handler = localyticshandler;
    }

    private void put(Map map, Attribute attribute, String s)
    {
        map.put(attribute, s);
    }

    private void recordAdDetails(Map map, String s)
    {
        put(map, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_AD_TITLE, s);
    }

    private void recordVideoDetails(Map map, VideoMessage videomessage)
    {
        put(map, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_ID, videomessage.getId());
        put(map, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_TITLE, videomessage.getTitle());
        if (videomessage.getPlaylistId() != null)
        {
            put(map, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_PLAYLIST, videomessage.getPlaylistId());
        }
        put(map, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_COLLECTION, videomessage.getCollectionId());
        put(map, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_PROVIDER, videomessage.getProvider());
        if (videomessage.getTags().hasDmaLocale())
        {
            put(map, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_DMA_LOCALE, videomessage.getTags().getDmaLocale());
        }
    }

    private void recordVideoDetails(Map map, VideoMessage videomessage, LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        put(map, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_START_METHOD, attributevalue.getAttributeValue());
        recordVideoDetails(map, videomessage);
    }

    private void tagVideoEvent(Event event, VideoMessage videomessage, LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        HashMap hashmap = new HashMap();
        recordVideoDetails(hashmap, videomessage, attributevalue);
        handler.tagEvent(event, hashmap);
    }

    public void recordAdComplete(VideoMessage videomessage, LocalyticsAttributeValues.AttributeValue attributevalue, String s)
    {
        HashMap hashmap = new HashMap();
        recordVideoDetails(hashmap, videomessage, attributevalue);
        recordAdDetails(hashmap, s);
        handler.tagEvent(LocalyticsEvent.VIDEO_AD_COMPLETE, hashmap);
    }

    public void recordAdStart(VideoMessage videomessage, LocalyticsAttributeValues.AttributeValue attributevalue, String s)
    {
        HashMap hashmap = new HashMap();
        recordVideoDetails(hashmap, videomessage, attributevalue);
        recordAdDetails(hashmap, s);
        handler.tagEvent(LocalyticsEvent.VIDEO_AD_START, hashmap);
    }

    public void recordStreamFailure(VideoMessage videomessage, String s)
    {
        HashMap hashmap = new HashMap();
        recordVideoDetails(hashmap, videomessage);
        put(hashmap, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_STREAM_FAILURE_VARIANT_NAME, s);
        handler.tagEvent(LocalyticsEvent.VIDEO_STREAM_FAILURE, hashmap);
    }

    public void recordVideoAttempt(VideoMessage videomessage, LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        tagVideoEvent(LocalyticsEvent.VIDEO_ATTEMPT, videomessage, attributevalue);
    }

    public void recordVideoComplete(VideoMessage videomessage, LocalyticsAttributeValues.AttributeValue attributevalue, boolean flag)
    {
        HashMap hashmap = new HashMap();
        recordVideoDetails(hashmap, videomessage, attributevalue);
        put(hashmap, LocalyticsVideoTags.VideoSummaryTagName.VIDEO_AD_STARTED, LocalyticsAttributeValues.AttributeValue.getYesNo(flag).getAttributeValue());
        handler.tagEvent(LocalyticsEvent.VIDEO_COMPLETE, hashmap);
    }

    public void recordVideoStart(VideoMessage videomessage, LocalyticsAttributeValues.AttributeValue attributevalue)
    {
        tagVideoEvent(LocalyticsEvent.VIDEO_START, videomessage, attributevalue);
    }
}
