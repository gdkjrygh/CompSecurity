// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.checkin;

import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.analytics.checkin:
//            LocalyticsCheckinAttributes

public class CheckInSocialWeatherSummaryRecorder extends LocalyticsRecorder
{

    private static final String TAG = "CheckInSocialWeatherSummaryRecorder";
    private final LocalyticsHandler localyticsHandler;

    public CheckInSocialWeatherSummaryRecorder()
    {
        localyticsHandler = LocalyticsHandler.getInstance();
    }

    public CheckInSocialWeatherSummaryRecorder(LocalyticsHandler localyticshandler)
    {
        localyticsHandler = localyticshandler;
    }

    private void setPreviousScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname)
    {
        putValueIfAbsent(LocalyticsCheckinAttributes.PREVIOUS_SCREEN, screenname.getName());
    }

    private void submitEventIfHaveAttributes()
    {
        if (hasAttributes())
        {
            LogUtil.d("CheckInSocialWeatherSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: submit social weather reported", new Object[0]);
            setPreviousScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.SOCIAL_MODULE);
            localyticsHandler.tagEvent(LocalyticsEvent.SOCIAL_WEATHER_REPORTED, getAttributesMap());
        }
    }

    public void clickedWeatherCheckin()
    {
        LogUtil.d("CheckInSocialWeatherSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: clickedWeatherCheckin", new Object[0]);
        putValueIfAbsent(LocalyticsCheckinAttributes.USER_CLICKED_WEATHER_CHECKIN, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void incrementPhotosTaken()
    {
        LogUtil.d("CheckInSocialWeatherSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: incrementPhotosTaken", new Object[0]);
        incrementValue(LocalyticsCheckinAttributes.ADDED_PHOTOS);
    }

    public void incrementPhotosTakenFailed()
    {
        LogUtil.d("CheckInSocialWeatherSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: incrementPhotosTakenFailed", new Object[0]);
        incrementValue(LocalyticsCheckinAttributes.ADDED_PHOTOS_FAILED);
    }

    public void incrementPhotosTakenFailedBecauseOfCheckinPath()
    {
        LogUtil.d("CheckInSocialWeatherSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: incrementPhotosTakenFailedBecauseOfCheckinPath", new Object[0]);
        incrementValue(LocalyticsCheckinAttributes.ADDED_PHOTOS_FAILED_CHECKIN_PATH);
    }

    public void incrementWeatherCheckinFailed()
    {
        LogUtil.d("CheckInSocialWeatherSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: incrementWeatherCheckinFailed", new Object[0]);
        incrementValue(LocalyticsCheckinAttributes.FAILED_SUBMIT_WEATHER_CHECKIN);
    }

    public void submittedWeatherCheckin()
    {
        LogUtil.d("CheckInSocialWeatherSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: submittedWeatherCheckin", new Object[0]);
        putValueIfAbsent(LocalyticsCheckinAttributes.USER_SUBMITTED_WEATHER_CHECKIN, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void tagEventIfHaveAttributesAndClearData()
    {
        submitEventIfHaveAttributes();
        clearData();
    }

    public void userViewedWeatherHistory()
    {
        LogUtil.d("CheckInSocialWeatherSummaryRecorder", LoggingMetaTags.TWC_SOCIAL, "localytics tag: userViewedWeatherHistory", new Object[0]);
        putValueIfAbsent(LocalyticsCheckinAttributes.USER_VIEWED_WEATHER_HISTORY, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }
}
