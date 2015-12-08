// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.chat;

import com.weather.commons.analytics.Attribute;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.checkin.LocalyticsCheckinAttributes;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.analytics.chat:
//            LocalyticsChatAttributes, LocalyticsChatAttributeValues

public class ChatSummaryRecorder extends LocalyticsRecorder
{

    private static final String TAG = "ChatSummaryRecorder";
    private final LocalyticsHandler localyticsHandler;

    public ChatSummaryRecorder()
    {
        localyticsHandler = LocalyticsHandler.getInstance();
    }

    public ChatSummaryRecorder(LocalyticsHandler localyticshandler)
    {
        localyticsHandler = localyticshandler;
    }

    private void cameraFailed(Attribute attribute)
    {
        LogUtil.d("ChatSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: cameraFailed %s", new Object[] {
            attribute.getName()
        });
        putValueIfAbsent(LocalyticsChatAttributes.CAMERA_FAILED, attribute.getName());
    }

    private void setPreviousScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname)
    {
        putValueIfAbsent(LocalyticsCheckinAttributes.PREVIOUS_SCREEN, screenname.getName());
    }

    public void addMessage()
    {
        LogUtil.d("ChatSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: add message", new Object[0]);
        putValueIfAbsent(LocalyticsChatAttributes.ADD_MESSAGE, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void cameraCancelled()
    {
        cameraFailed(LocalyticsChatAttributeValues.PICTURE_CANCELLED);
    }

    public void cameraFileError()
    {
        cameraFailed(LocalyticsChatAttributeValues.PICTURE_FILE_ERROR);
    }

    public void cameraUnknownError()
    {
        cameraFailed(LocalyticsChatAttributeValues.PICTURE_ERROR);
    }

    public void incrementShareAttempt()
    {
        LogUtil.d("ChatSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: SHARE_ATTEMPT", new Object[0]);
        incrementValue(LocalyticsChatAttributes.SHARE_ATTEMPT);
    }

    public void photoType()
    {
        LogUtil.d("ChatSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: PHOTO_TYPE", new Object[0]);
        putValueIfAbsent(LocalyticsChatAttributes.PHOTO_TYPE, LocalyticsChatAttributeValues.CAMERA_UNKNOWN.getName());
    }

    public void socialPlatform(Attribute attribute)
    {
        LogUtil.d("ChatSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: SOCIAL_PLATFORM %s", new Object[] {
            attribute.getName()
        });
        putValueIfAbsent(LocalyticsChatAttributes.SOCIAL_PLATFORM, attribute.getName());
    }

    public void tag()
    {
        LogUtil.d("ChatSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "submit share event", new Object[0]);
        setPreviousScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.SOCIAL_MODULE);
        putValueIfAbsent(LocalyticsChatAttributes.MODULE, LocalyticsChatAttributeValues.SOCIAL.getName());
        localyticsHandler.tagSummaryEvent(LocalyticsEvent.SHARE);
        clearData();
    }
}
