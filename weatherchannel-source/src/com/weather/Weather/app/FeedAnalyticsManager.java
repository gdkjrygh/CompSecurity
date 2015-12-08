// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.feed.LocalyticsFeedNavigationMethod;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.DailyWeather;
import com.weather.commons.facade.DailyWeatherFacade;
import com.weather.commons.facade.PrecipitationRoundedValue;
import com.weather.commons.facade.WeatherAlert;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.facade.WeatherDataManager;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.weather.Weather.app:
//            FlagshipApplication

public final class FeedAnalyticsManager
{

    private static final String TAG = "FeedAnalyticsManager";
    private boolean active;
    private final TwcBus bus;
    private final LocalyticsHandler localyticsHandler;
    private final LocationManager locationManager;
    private final AtomicBoolean waitingForInitialLocationChange = new AtomicBoolean(true);

    public FeedAnalyticsManager(TwcBus twcbus, LocalyticsHandler localyticshandler, LocationManager locationmanager)
    {
        localyticsHandler = (LocalyticsHandler)Preconditions.checkNotNull(localyticshandler);
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
        locationManager = (LocationManager)Preconditions.checkNotNull(locationmanager);
    }

    private void setFollowMeAttributes()
    {
        MainFeedSummaryRecorder mainfeedsummaryrecorder = localyticsHandler.getMainFeedSummaryRecorder();
        LocalyticsRecorder localyticsrecorder = localyticsHandler.getMainFeedWeatherSummaryRecorder();
        String s11 = "";
        String s13 = "";
        String s15 = "";
        String s17 = "";
        String s19 = "";
        String s21 = "";
        String s = "";
        String s9 = "";
        String s10 = "";
        Object obj1 = locationManager.getFollowMeLocation();
        String s2 = s17;
        String s3 = s19;
        String s4 = s21;
        String s5 = s11;
        String s6 = s15;
        String s7 = s;
        String s8 = s9;
        String s1 = s10;
        Object obj = s13;
        if (LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            s2 = s17;
            s3 = s19;
            s4 = s21;
            s5 = s11;
            s6 = s15;
            s7 = s;
            s8 = s9;
            s1 = s10;
            obj = s13;
            if (obj1 != null)
            {
                String s12 = Strings.nullToEmpty(((SavedLocation) (obj1)).getNickname());
                String s14 = Strings.nullToEmpty(((SavedLocation) (obj1)).getZipCode());
                String s16 = Strings.nullToEmpty(((SavedLocation) (obj1)).getState());
                String s18 = Strings.nullToEmpty(((SavedLocation) (obj1)).getCity());
                String s20 = Strings.nullToEmpty(((SavedLocation) (obj1)).getCountryCode());
                obj = FlagshipApplication.getInstance().getWeatherDataManager().getCurrentWeatherFacade(((SavedLocation) (obj1)));
                String s22 = ((CurrentWeatherFacade) (obj)).getPhrase();
                if (((CurrentWeatherFacade) (obj)).getWeatherAlertsFacade() == null)
                {
                    obj = null;
                } else
                {
                    obj = ((CurrentWeatherFacade) (obj)).getWeatherAlertsFacade().getAlertsList();
                }
                if (obj != null)
                {
                    s = String.valueOf(((WeatherAlert)((List) (obj)).get(0)).getSeverity());
                }
                obj1 = FlagshipApplication.getInstance().getWeatherDataManager().getDailyWeatherFacade(((SavedLocation) (obj1)));
                s2 = s18;
                s3 = s20;
                s4 = s22;
                s5 = s12;
                s6 = s16;
                s7 = s;
                s8 = s9;
                s1 = s10;
                obj = s14;
                if (obj1 != null)
                {
                    s2 = s18;
                    s3 = s20;
                    s4 = s22;
                    s5 = s12;
                    s6 = s16;
                    s7 = s;
                    s8 = s9;
                    s1 = s10;
                    obj = s14;
                    if (((DailyWeatherFacade) (obj1)).dailyWeatherList.size() > 1)
                    {
                        obj = (DailyWeather)((DailyWeatherFacade) (obj1)).dailyWeatherList.get(1);
                        s8 = ((DailyWeather) (obj)).getDayHeadline();
                        s1 = ((DailyWeather) (obj)).getDayPrecipitation().format();
                        obj = s14;
                        s7 = s;
                        s6 = s16;
                        s5 = s12;
                        s4 = s22;
                        s3 = s20;
                        s2 = s18;
                    }
                }
            }
        }
        mainfeedsummaryrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_ZIP_CODE, ((String) (obj)));
        mainfeedsummaryrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_STATE, s6);
        localyticsrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_LOCATION, s5);
        localyticsrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_CITY, s2);
        localyticsrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_STATE, s6);
        localyticsrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_COUNTRY_CODE, s3);
        localyticsrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_CURRENT_CONDTION, s4);
        localyticsrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_THREAT_LEVEL, s7);
        localyticsrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_CONDITION_TOMORROW, s8);
        localyticsrecorder.putValue(LocalyticsMainFeedTag.FOLLOW_ME_PRECIPITATION_TOMORROW, s1);
    }

    private void setLocationAttributes()
    {
        MainFeedSummaryRecorder mainfeedsummaryrecorder = localyticsHandler.getMainFeedSummaryRecorder();
        Object obj = locationManager.getCurrentLocation();
        if (obj != null)
        {
            mainfeedsummaryrecorder.putValue(LocalyticsMainFeedTag.LOCATION_NAME, ((SavedLocation) (obj)).getPresentationName());
            boolean flag1 = locationManager.isFollowMeAsCurrent();
            LocalyticsMainFeedTag localyticsmainfeedtag;
            boolean flag;
            if (flag1 || ((SavedLocation) (obj)).equals(locationManager.getFollowMeLocation()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            localyticsmainfeedtag = LocalyticsMainFeedTag.LOCATION_TYPE;
            if (flag1)
            {
                obj = com.weather.commons.analytics.LocalyticsAttributeValues.LocationType.FOLLOW_ME.getAttributeValue();
            } else
            {
                obj = com.weather.commons.analytics.LocalyticsAttributeValues.LocationType.FIXED.getAttributeValue();
            }
            mainfeedsummaryrecorder.putValue(localyticsmainfeedtag, ((String) (obj)));
            localyticsmainfeedtag = LocalyticsMainFeedTag.LOCATION_IS_CURRENT;
            if (flag)
            {
                obj = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
            } else
            {
                obj = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
            }
            mainfeedsummaryrecorder.putValue(localyticsmainfeedtag, ((String) (obj)));
        }
    }

    private void tagSummaryEvent()
    {
        setFollowMeAttributes();
        localyticsHandler.tagSummaryEvent(LocalyticsEvent.APP_FEED_SUMMARY);
        localyticsHandler.tagSummaryEvent(LocalyticsEvent.APP_FEED_WEATHER_SUMMARY);
    }

    public void onFeedPause()
    {
        if (!active)
        {
            return;
        } else
        {
            active = false;
            bus.unregister(this);
            tagSummaryEvent();
            return;
        }
    }

    public void onFeedResume()
    {
        active = true;
        waitingForInitialLocationChange.set(true);
        localyticsHandler.getMainFeedSummaryRecorder().startMinuteStopwatch(LocalyticsMainFeedTag.TIME_SPENT);
        bus.register(this);
    }

    public void onLocationChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        currentlocationchangeevent = currentlocationchangeevent.getCause();
        LogUtil.d("FeedAnalyticsManager", LoggingMetaTags.TWC_LOCALYTICS, "onLocationChange: '%s'", new Object[] {
            currentlocationchangeevent
        });
        if (waitingForInitialLocationChange.getAndSet(false)) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[];

            static 
            {
                $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause = new int[com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.values().length];
                try
                {
                    $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.USER_SELECTED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.FOLLOW_ME.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_DELETED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.APP_RESTORE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.weather.dal2.locations.CurrentLocationChangeEvent.Cause[currentlocationchangeevent.ordinal()];
        JVM INSTR tableswitch 1 6: default 80
    //                   1 108
    //                   2 164
    //                   3 171
    //                   4 178
    //                   5 185
    //                   6 185;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L8
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cause for change event ").append(currentlocationchangeevent).toString());
_L4:
        currentlocationchangeevent = LocalyticsFeedNavigationMethod.LOCATION_LIST;
_L10:
        if (currentlocationchangeevent != null)
        {
            tagSummaryEvent();
            MainFeedSummaryRecorder mainfeedsummaryrecorder = localyticsHandler.getMainFeedSummaryRecorder();
            mainfeedsummaryrecorder.putValueIfAbsent(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.MAIN_FEED.getName());
            mainfeedsummaryrecorder.startMinuteStopwatch(LocalyticsMainFeedTag.TIME_SPENT);
            mainfeedsummaryrecorder.putValueIfAbsent(LocalyticsMainFeedTag.NAVIGATION_METHOD, currentlocationchangeevent.getAttributeValue());
        }
_L2:
        setLocationAttributes();
        return;
_L5:
        currentlocationchangeevent = LocalyticsFeedNavigationMethod.FOLLOW_ME;
        continue; /* Loop/switch isn't completed */
_L6:
        currentlocationchangeevent = LocalyticsFeedNavigationMethod.SEARCH;
        continue; /* Loop/switch isn't completed */
_L7:
        currentlocationchangeevent = LocalyticsFeedNavigationMethod.LOCATION_MANAGER;
        continue; /* Loop/switch isn't completed */
_L8:
        currentlocationchangeevent = null;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
