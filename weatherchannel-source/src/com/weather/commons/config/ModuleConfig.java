// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.util.json.JsonUtil;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ModuleConfig
{
    public static class Builder
    {

        private String adSlotName;
        private Map additionalParameters;
        private Map adjacentAdParameters;
        private String beacon;
        private String description;
        private String feedId;
        private String id;
        private boolean isHideable;
        private boolean isSponsored;
        private String type;
        private String url;
        private String version;

        public ModuleConfig build()
        {
            return new ModuleConfig(id, description, adSlotName, beacon, type, adjacentAdParameters, version, url, isSponsored, isHideable, feedId, additionalParameters);
        }

        public Builder setAdSlotName(String s)
        {
            adSlotName = s;
            return this;
        }

        public Builder setAdditionalParameters(Map map)
        {
            additionalParameters = ImmutableMap.copyOf(map);
            return this;
        }

        public Builder setAdjacentAdParameters(Map map)
        {
            adjacentAdParameters = ImmutableMap.copyOf(map);
            return this;
        }

        public Builder setBeacon(String s)
        {
            beacon = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            description = s;
            return this;
        }

        public Builder setFeedId(String s)
        {
            feedId = s;
            return this;
        }

        public Builder setId(String s)
        {
            id = s;
            return this;
        }

        public Builder setIsHideable(boolean flag)
        {
            isHideable = flag;
            return this;
        }

        public Builder setIsSponsored(boolean flag)
        {
            isSponsored = flag;
            return this;
        }

        public Builder setType(String s)
        {
            type = s;
            return this;
        }

        public Builder setUrl(String s)
        {
            url = s;
            return this;
        }

        public Builder setVersion(String s)
        {
            version = s;
            return this;
        }

        private Builder()
        {
            adjacentAdParameters = ImmutableMap.of();
            additionalParameters = ImmutableMap.of();
        }

    }


    public static final String AD = "AdModule";
    public static final String AIRPORT = "airport";
    public static final String ALLERGY_FORECAST = "allergy_forecast";
    public static final String ALLERGY_HERO = "allergy_hero";
    public static final String ALLERGY_MAP = "allergy_map";
    public static final String BOAT = "boat";
    public static final String BREAKING_NEWS = "breaking-news";
    public static final String CHECKIN = "check-in";
    public static final String COLD_FLU_HERO = "cold_flu_hero";
    public static final String COLD_FLU_HISTORY = "cold_flu_history";
    public static final String CURRENT_CONDITIONS = "current-conditions";
    public static final String DEEPLINK = "deeplink";
    public static final String DRIVING_DIFFICULTY = "driving-difficulty";
    public static final String FLU = "flu";
    public static final String HOURLY = "hourly";
    public static final String HURRICANES_BULLETINS = "hurricanes_bulletins";
    public static final String HURRICANE_CENTRAL = "hurricane";
    public static final String HURRICANE_VIDEO = "hurricane_video";
    public static final String MAP = "map";
    public static final String MODULE_ID = "com.weather.moduleId";
    public static final String MOLD_SLIDER = "mold_slider";
    public static final String NEWS = "news";
    public static final String NEWS_2 = "news_second";
    public static final String NEWS_3 = "news_third";
    public static final String NWS_ALERT = "nws_alert";
    public static final String POLLEN = "pollen";
    public static final String SAFETY = "safety";
    public static final String SKI = "ski";
    public static final String SOCIAL = "social";
    public static final String TEN_DAY = "ten-day";
    public static final String TOP = "top";
    public static final String TROPICAL_OUTLOOK = "tropical-outlook";
    public static final String TROPICAL_UPDATE_NEWS = "tropical_update_news";
    public static final String TWC_PRESENTS = "twcpresents";
    public static final String VIDEO = "video";
    public static final String VIDEO_3 = "video3";
    public static final String VIDEO_4 = "video4";
    public final String adSlotName;
    private final Map additionalParameters;
    public final Map adjacentAdParameters;
    public final String beacon;
    public final String description;
    private final String feedId;
    public final String id;
    public final boolean isHideable;
    public final boolean isSponsored;
    public final String type;
    public final String url;
    public final String version;

    ModuleConfig(String s, String s1, String s2, String s3, String s4, Map map, String s5, 
            String s6, boolean flag, boolean flag1, String s7, Map map1)
    {
        id = (String)Preconditions.checkNotNull(s);
        description = (String)Preconditions.checkNotNull(s1);
        adSlotName = (String)Preconditions.checkNotNull(s2);
        beacon = s3;
        type = (String)Preconditions.checkNotNull(s4);
        adjacentAdParameters = ImmutableMap.copyOf(map);
        additionalParameters = ImmutableMap.copyOf(map1);
        version = s5;
        url = s6;
        isSponsored = flag;
        isHideable = flag1;
        feedId = s7;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static Builder builder(ModuleConfig moduleconfig)
    {
        return (new Builder()).setId(moduleconfig.id).setDescription(moduleconfig.description).setAdSlotName(moduleconfig.adSlotName).setBeacon(moduleconfig.beacon).setType(moduleconfig.type).setAdjacentAdParameters(moduleconfig.adjacentAdParameters).setAdditionalParameters(moduleconfig.additionalParameters).setVersion(moduleconfig.version).setUrl(moduleconfig.url).setIsSponsored(moduleconfig.isSponsored).setIsHideable(moduleconfig.isHideable).setFeedId(moduleconfig.feedId);
    }

    public static ModuleConfig createConfigForAd(String s)
    {
        return (new Builder()).setId("AdModule").setDescription((new StringBuilder()).append("ad for ").append(s).toString()).setAdSlotName(s).setType("ad").build();
    }

    private static Map extractAdditionalParameters(JSONObject jsonobject)
    {
        Map map = JsonUtil.getFieldsAsStringObjectMap(jsonobject, "additionalParameters", null);
        jsonobject = map;
        if (map == null)
        {
            jsonobject = ImmutableMap.of();
        }
        return jsonobject;
    }

    private static Map extractAdjacentAdParameters(JSONObject jsonobject)
    {
        Map map = JsonUtil.getFieldsAsStringMap(jsonobject, "adjacentAdParameters", null);
        jsonobject = map;
        if (map == null)
        {
            jsonobject = ImmutableMap.of();
        }
        return jsonobject;
    }

    public static ModuleConfig fromJson(JSONObject jsonobject)
        throws JSONException
    {
        String s = null;
        String s1 = jsonobject.getString("type");
        Builder builder1 = builder().setId(jsonobject.getString("id")).setVersion(jsonobject.optString("version", null)).setDescription(jsonobject.getString("description")).setType(s1).setAdSlotName(jsonobject.getString("adSlot")).setBeacon(jsonobject.optString("beacon"));
        if (s1.equals("html"))
        {
            s = jsonobject.getString("url");
        }
        return builder1.setUrl(s).setIsSponsored(jsonobject.optBoolean("sponsored")).setIsHideable(jsonobject.optBoolean("hideable")).setAdjacentAdParameters(extractAdjacentAdParameters(jsonobject)).setAdditionalParameters(extractAdditionalParameters(jsonobject)).build();
    }

    public Map getAdditionalParameters()
    {
        return ImmutableMap.copyOf(additionalParameters);
    }

    public String getFeedId()
    {
        return feedId;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ModuleConfig{id='").append(id).append('\'').append(", description='").append(description).append('\'').append(", adSlotName='").append(adSlotName).append('\'').append(", beacon='").append(beacon).append('\'').append(", type='").append(type).append('\'').append(", url='").append(url).append('\'').append(", adjacentAdParameters=").append(adjacentAdParameters).append(", version='").append(version).append('\'').append(", isSponsored=").append(isSponsored).append(", isHideable=").append(isHideable).append(", feedId=").append(feedId).append('}').toString();
    }
}
