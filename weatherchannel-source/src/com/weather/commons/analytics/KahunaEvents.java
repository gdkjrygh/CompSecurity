// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.kahuna.sdk.IKahuna;
import com.kahuna.sdk.Kahuna;
import com.weather.dal2.locations.SavedLocation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class KahunaEvents
{
    static class KahunaWrapper
    {

        public void setUserAttributes(Map map)
        {
            Kahuna.getInstance().setUserAttributes(map);
        }

        public void trackEvent(String s)
        {
            Kahuna.getInstance().trackEvent(s);
        }

        KahunaWrapper()
        {
        }
    }


    private static final String FALSE = "False";
    private static final KahunaEvents INSTANCE = new KahunaEvents();
    private static final String REGISTERED = "registered";
    private static final String TRUE = "True";
    private volatile KahunaWrapper kahunaWrapper;

    private KahunaEvents()
    {
        kahunaWrapper = new KahunaWrapper();
    }

    private String formatDate(Date date)
    {
        return (new SimpleDateFormat("yyyy-MM-dd", Locale.US)).format(date);
    }

    public static KahunaEvents getInstance()
    {
        return INSTANCE;
    }

    public void addLocation(SavedLocation savedlocation)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("last_location_state", savedlocation.getState());
        hashmap.put("last_location_country", savedlocation.getCountryCode());
        hashmap.put("last_location", savedlocation.getCity());
        setUserAttributes(hashmap);
        trackEvent("add_location");
    }

    public void loggedIn(boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s;
        if (flag)
        {
            s = "True";
        } else
        {
            s = "False";
        }
        hashmap.put("registered", s);
        setUserAttributes(hashmap);
        trackEvent("login");
    }

    public void readNews(Date date, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("last_news_date", formatDate(date));
        hashmap.put("last_news_category", s);
        hashmap.put("last_news_link", s1);
        hashmap.put("last_news_read", s2);
        setUserAttributes(hashmap);
        trackEvent("read_news");
    }

    public void setAlerts(boolean flag)
    {
        if (flag)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("alert_set_location", "settings");
            setUserAttributes(hashmap);
            trackEvent("set-alerts");
        }
    }

    public void setBreakingNewsAlerts(boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s;
        if (flag)
        {
            s = "True";
        } else
        {
            s = "False";
        }
        hashmap.put("breaking_news", s);
        setUserAttributes(hashmap);
    }

    public void setDailyRainAlert(int i, int j, boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("daily_rain_locations_selected", Integer.toString(i));
        hashmap.put("daily_rain_locations_deselected", Integer.toString(j));
        String s;
        if (flag)
        {
            s = "True";
        } else
        {
            s = "False";
        }
        hashmap.put("daily_rain", s);
        setUserAttributes(hashmap);
    }

    void setKahunaWrapper(KahunaWrapper kahunawrapper)
    {
        kahunaWrapper = kahunawrapper;
    }

    public void setLighteningAlerts(boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s;
        if (flag)
        {
            s = "True";
        } else
        {
            s = "False";
        }
        hashmap.put("lightning", s);
        setUserAttributes(hashmap);
    }

    public void setLoggedInAttribute(boolean flag, String s)
    {
        HashMap hashmap = new HashMap();
        String s1;
        if (flag)
        {
            s1 = "True";
        } else
        {
            s1 = "False";
        }
        hashmap.put("registered", s1);
        hashmap.put("version", s);
        setUserAttributes(hashmap);
    }

    public void setPollenAlert(int i, int j, boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s;
        if (flag)
        {
            s = "True";
        } else
        {
            s = "False";
        }
        hashmap.put("pollen", s);
        hashmap.put("pollen_locations_selected", Integer.toString(i));
        hashmap.put("pollen_locations_deselected", Integer.toString(j));
        setUserAttributes(hashmap);
    }

    public void setRealTimeRain(boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s;
        if (flag)
        {
            s = "True";
        } else
        {
            s = "False";
        }
        hashmap.put("rain", s);
        setUserAttributes(hashmap);
    }

    public void setSevereAlert(int i, int j, boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s;
        if (flag)
        {
            s = "True";
        } else
        {
            s = "False";
        }
        hashmap.put("severe_weather", s);
        hashmap.put("severe_locations_selected", Integer.toString(i));
        hashmap.put("severe_locations_deselected", Integer.toString(j));
        setUserAttributes(hashmap);
    }

    public void setUserAttributes(Map map)
    {
        kahunaWrapper.setUserAttributes(map);
    }

    public void signUp()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("registered", "True");
        setUserAttributes(hashmap);
        trackEvent("signup");
    }

    public void startVideo(Date date, String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("last_video_watched", s);
        hashmap.put("last_video_date", formatDate(date));
        hashmap.put("last_video_category", s1);
        setUserAttributes(hashmap);
        trackEvent("video_start");
    }

    public void toggleFollowMe(SavedLocation savedlocation, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (savedlocation != null)
        {
            hashmap.put("follow_me_state", savedlocation.getState());
            hashmap.put("follow_me_location", savedlocation.getCity());
            hashmap.put("follow_me_country", savedlocation.getCountryCode());
        }
        if (flag)
        {
            savedlocation = "True";
        } else
        {
            savedlocation = "False";
        }
        hashmap.put("follow_me_toggle", savedlocation);
        setUserAttributes(hashmap);
    }

    public void trackEvent(String s)
    {
        kahunaWrapper.trackEvent(s);
    }

    public void viewMaps(Date date, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("last_map_layer", s);
        hashmap.put("last_map_date", formatDate(date));
        setUserAttributes(hashmap);
        trackEvent("maps");
    }

}
