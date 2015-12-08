// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.sessionm;

import com.sessionm.api.SessionM;
import com.sessionm.api.User;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

public final class SessionMUtils
{

    private static final String MODULE_VIDEO_SUFFIX = "_module_video";
    private static final String PLAYLIST_VIDEO_SUFFIX = "_playlist_video";
    public static final String SESSIONM_ACTION_FUTURE_RADAR = "future_radar";
    public static final String SESSIONM_ACTION_READ_NEWS_ARTICLE = "read_article";
    public static final String SESSIONM_ACTION_WATCH_BREAKING_NEWS_MODULE_VIDEO = "breaking_news_module_video";
    public static final String SESSIONM_ACTION_WATCH_BREAKING_NEWS_VIDEO_IN_PLAYLIST = "breaking_news_playlist_video";
    public static final String SESSIONM_ACTION_WATCH_HURRICANE_MODULE_VIDEO = "hurricane_module_video";
    public static final String SESSIONM_ACTION_WATCH_HURRICANE_VIDEO_IN_PLAYLIST = "hurricane_playlist_video";
    public static final String SESSIONM_ACTION_WATCH_MUST_SEE = "must_see_video";
    public static final String SESSIONM_ACTION_WATCH_RIGHT_NOW_MODULE_VIDEO = "right_now_module_video";
    public static final String SESSIONM_ACTION_WATCH_RIGHT_NOW_VIDEO_IN_PLAYLIST = "right_now_playlist_video";
    public static final String SESSIONM_ACTION_WATCH_VIDEO_MODULE_VIDEO = "video_module_video";
    public static final String SESSIONM_ACTION_WATCH_VIDEO_MODULE_VIDEO_IN_PLAYLIST = "video_playlist_video";
    public static final String SESSIONM_ACTION_WIDGET_LAUNCH = "widget_app_launch";
    public static final String SESSIONM_ACTION_WP_SIGN_UP = "weather_profile_signup";
    public static final String SESSIONM_BREAKINGNEWS_SIGN_UP = "breakingnews_alert_signup";
    public static final String SESSIONM_LAUNCH_FROM_PUSH_NOTIFICATION = "launch_app_from_push_notification";
    public static final String SESSIONM_LIGHTNING_ALERT_SIGN_UP = "lightning_alert_signup";
    public static final String SESSIONM_RAIN_SNOW_ALERT_SIGN_UP = "rain_snow_alert_signup";
    public static final String SESSIONM_REAL_TIME_RAIN_ALERT_SIGN_UP = "real_time_rain_alert_signup";
    public static final String SESSIONM_SEVERE_ALERT_SIGN_UP = "severe_alert_signup";
    private static final String TAG = "SessionMUtils";

    private SessionMUtils()
    {
    }

    public static boolean isActive()
    {
        return LocaleUtil.isDeviceInUSEnglish();
    }

    public static void logAction(String s)
    {
        LogUtil.d("SessionMUtils", LoggingMetaTags.TWC_SESSION_M, "logAction: action=%s", new Object[] {
            s
        });
        SessionM.getInstance().logAction(s);
    }

    public static void logAction(String s, int i)
    {
        LogUtil.d("SessionMUtils", LoggingMetaTags.TWC_SESSION_M, "logAction: action=%s, times=%s", new Object[] {
            s, Integer.valueOf(i)
        });
        SessionM.getInstance().logAction(s, i);
    }

    public static void logAction(String s, String s1)
    {
        LogUtil.d("SessionMUtils", LoggingMetaTags.TWC_SESSION_M, "logAction: action=%s", new Object[] {
            s1
        });
        SessionM.getInstance().logAction(s1);
    }

    public static void syncOptOut()
    {
        boolean flag = false;
        SessionM sessionm = SessionM.getInstance();
        Prefs prefs = TwcPrefs.getInstance();
        if (sessionm.getSessionState() == com.sessionm.api.SessionM.State.STARTED_ONLINE)
        {
            if (sessionm.getUser().isOptedOut() || prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, false))
            {
                flag = true;
            }
            if (!prefs.contains(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT) || flag)
            {
                prefs.putBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, flag);
            }
        }
    }
}
