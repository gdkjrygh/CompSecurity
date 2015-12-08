// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import android.os.SystemClock;
import com.localytics.android.Localytics;
import com.weather.commons.analytics.chat.ChatSummaryRecorder;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsSummaryRecorder;
import com.weather.commons.analytics.ups.LocalyticsUpsLoginSummaryRecorder;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSummaryRecorder;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsRecorder, LocalyticsEvent, LocalyticsRecorders, LocalyticsVideo2DetailRecorder, 
//            LocalyticsVideo2SummaryRecorder, LocalyticsVideoDetailRecorder, LocalyticsVideoSummaryRecorder, Event, 
//            Attribute, Screen

public class LocalyticsHandler
{

    private static final LocalyticsHandler INSTANCE = new LocalyticsHandler();
    private static final String TAG = "LocalyticsHandler";
    private final ConcurrentMap summaryRecorders = new ConcurrentHashMap();

    LocalyticsHandler()
    {
    }

    public static LocalyticsHandler getInstance()
    {
        return INSTANCE;
    }

    private LocalyticsRecorder putSummaryRecorderIfAbsent(String s, LocalyticsRecorder localyticsrecorder)
    {
        s = (LocalyticsRecorder)summaryRecorders.putIfAbsent(s, localyticsrecorder);
        if (s == null)
        {
            return localyticsrecorder;
        } else
        {
            return s;
        }
    }

    public void clearSummaryRecorders()
    {
        summaryRecorders.clear();
    }

    public LocalyticsRecorder getAllergyFeedSummaryRecorder()
    {
        return putSummaryRecorderIfAbsent(LocalyticsEvent.ALLERGY_FEED_SUMMARY.getName(), LocalyticsRecorders.createAllergyFeedSummaryRecorder());
    }

    public ChatSummaryRecorder getChatSummaryRecorder()
    {
        return (ChatSummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.SHARE.getName(), new ChatSummaryRecorder());
    }

    public LocalyticsRecorder getColdFluFeedSummaryRecorder()
    {
        return putSummaryRecorderIfAbsent(LocalyticsEvent.COLD_FLU_FEED_SUMMARY.getName(), LocalyticsRecorders.createColdFluFeedSummaryRecorder());
    }

    public LocalyticsGeneralSettingsSummaryRecorder getGeneralSettingsSummaryRecorder()
    {
        return (LocalyticsGeneralSettingsSummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.GENERAL_SETTINGS_SUMMARY.getName(), new LocalyticsGeneralSettingsSummaryRecorder());
    }

    public LocalyticsRecorder getHurricaneCentralFeedSummaryRecorder()
    {
        return putSummaryRecorderIfAbsent(LocalyticsEvent.HC_FEED_SUMMARY.getName(), LocalyticsRecorders.createHurricaneCentralFeedRecorder());
    }

    public LocalyticsRecorder getHurricaneCentralMapSummaryRecorder()
    {
        return putSummaryRecorderIfAbsent(LocalyticsEvent.HC_MAP.getName(), LocalyticsRecorders.createHurricaneCentralMapRecorder());
    }

    public HurricaneCentralSummaryRecorder getHurricaneCentralSummaryRecorder()
    {
        return (HurricaneCentralSummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.HURRICANE_CENTRAL_SUMMARY.getName(), new HurricaneCentralSummaryRecorder());
    }

    public LocalyticsVideo2DetailRecorder getLocalyticsVideo2DetailRecorder()
    {
        return (LocalyticsVideo2DetailRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.VIDEO_DETAILS.getName(), new LocalyticsVideo2DetailRecorder());
    }

    public LocalyticsVideo2SummaryRecorder getLocalyticsVideo2SummaryRecorder()
    {
        return (LocalyticsVideo2SummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.VIDEO_SUMMARY.getName(), new LocalyticsVideo2SummaryRecorder());
    }

    public LocalyticsVideoDetailRecorder getLocalyticsVideoDetailRecorder()
    {
        return (LocalyticsVideoDetailRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.VIDEO_DETAILS.getName(), new LocalyticsVideoDetailRecorder());
    }

    public LocalyticsVideoSummaryRecorder getLocalyticsVideoSummaryRecorder()
    {
        return (LocalyticsVideoSummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.VIDEO_SUMMARY.getName(), new LocalyticsVideoSummaryRecorder());
    }

    public MainFeedSummaryRecorder getMainFeedSummaryRecorder()
    {
        return (MainFeedSummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.APP_FEED_SUMMARY.getName(), new MainFeedSummaryRecorder());
    }

    public LocalyticsRecorder getMainFeedWeatherSummaryRecorder()
    {
        return putSummaryRecorderIfAbsent(LocalyticsEvent.APP_FEED_WEATHER_SUMMARY.getName(), new LocalyticsRecorder());
    }

    public LocalyticsSessionSummaryRecorder getSessionSummaryRecorder()
    {
        return (LocalyticsSessionSummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.SESSION_SUMMARY.getName(), new LocalyticsSessionSummaryRecorder());
    }

    public LocalyticsRecorder getTropicalOutlookSummaryRecorder()
    {
        return putSummaryRecorderIfAbsent(LocalyticsEvent.HC_TROPICAL_OUTLOOK.getName(), LocalyticsRecorders.createTropicalOutlookRecorder());
    }

    public LocalyticsUpsLoginSummaryRecorder getUpsLoginSummaryRecorder()
    {
        return (LocalyticsUpsLoginSummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.UPS_LOGIN_SUMMARY.getName(), new LocalyticsUpsLoginSummaryRecorder());
    }

    public LocalyticsUpsSignupSummaryRecorder getUpsSignupSummaryRecorder()
    {
        return (LocalyticsUpsSignupSummaryRecorder)putSummaryRecorderIfAbsent(LocalyticsEvent.UPS_SIGNUP_SUMMARY.getName(), new LocalyticsUpsSignupSummaryRecorder());
    }

    public void requestUpload()
    {
        LogUtil.d("LocalyticsHandler", LoggingMetaTags.TWC_LOCALYTICS, "Set to upload %d", new Object[] {
            Long.valueOf(SystemClock.uptimeMillis())
        });
        Localytics.upload();
    }

    public void tagEvent(Event event)
    {
        Localytics.tagEvent(event.getName());
        LogUtil.d("LocalyticsHandler", LoggingMetaTags.TWC_LOCALYTICS, "Tagging Events: %s", new Object[] {
            event.getName()
        });
    }

    public void tagEvent(Event event, Map map)
    {
        HashMap hashmap = new HashMap(map.size());
        java.util.Map.Entry entry1;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); hashmap.put(((Attribute)entry1.getKey()).getName(), entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator.next();
        }

        Localytics.tagEvent(event.getName(), hashmap);
        if (LogUtil.isLoggable(LoggingMetaTags.TWC_LOCALYTICS, 3))
        {
            StringBuilder stringbuilder = new StringBuilder();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append(((Attribute)entry.getKey()).getName()).append('=').append((String)entry.getValue()).append(' '))
            {
                entry = (java.util.Map.Entry)map.next();
            }

            LogUtil.d("LocalyticsHandler", LoggingMetaTags.TWC_LOCALYTICS, "Tagging Events: %s with attributes %s", new Object[] {
                event.getName(), stringbuilder.toString()
            });
        }
    }

    public void tagScreen(Screen screen)
    {
        Localytics.tagScreen(screen.getName());
        LogUtil.d("LocalyticsHandler", LoggingMetaTags.TWC_LOCALYTICS, "Tagging Screen: %s", new Object[] {
            screen.getName()
        });
    }

    public void tagSummaryEvent(Event event)
    {
        LocalyticsRecorder localyticsrecorder = (LocalyticsRecorder)summaryRecorders.remove(event.getName());
        if (localyticsrecorder == null)
        {
            tagEvent(event);
            return;
        } else
        {
            tagEvent(event, localyticsrecorder.getAttributesMap());
            return;
        }
    }

}
