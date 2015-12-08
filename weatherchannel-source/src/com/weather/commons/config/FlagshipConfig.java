// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video2.QueryRange;
import com.weather.util.config.DsxServerUtil;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import com.weather.util.time.TimeOfDay;
import com.weather.util.time.TimeOfDayBuilder;
import com.weather.util.time.TimeOfDayRange;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FlagshipConfig
{

    static final String ASSET_URL = "articleBaseUrl";
    static final String BREAKINGNEWS_URL = "breakingNews";
    static final String BREATHING_MAP_DEFAULT_URL = "http://i.imwx.com/images/maps/pt_BR/health/forresp_720x486.jpg";
    static final String BREATHING_MAP_URL = "breathingMapUrl";
    static final String BURDA_VIDEO_ORDEREDLIST_URL = "burdaVideoOrderedList";
    static final String BURDA_VIDEO_ORDEREDLIST_URL_DEFAULT = "http://{DSX_SERVER}.weather.com/cms/v4/orderedlist/de_DE/mobile/video/%1$s?api={API_KEY}";
    static final String CABLE_PROVIDER_SIGNUP_TEXT_VERSION = "cableProviderSignupTextVersion";
    static final int CABLE_PROVIDER_SIGNUP_TEXT_VERSION_DEFAULT = 1;
    static final String CONTENT_MODE_DEFAULT_URL = "http://{DSX_SERVER}.weather.com/cms/v1/settings/content-mode?api={API_KEY}";
    static final String CONTENT_MODE_URL = "contentModeUrl";
    static final String DENSE_FOG_SHARE_DEFAULT_URL = "http://www.weather.com";
    static final String DENSE_FOG_SHARE_URL = "denseFogAlertShareUrl";
    static final String ENABLE_FLU_MODULE = "enableFluModule";
    static final boolean ENABLE_FLU_MODULE_DEFAULT = false;
    static final String EXTREME_COLD_SHARE_DEFAULT_URL = "http://www.weather.com";
    static final String EXTREME_COLD_SHARE_URL = "extremeColdAlertShareUrl";
    static final String EXTREME_HEAT_ALERT_SHARE_DEFAULT_URL = "http://www.weather.com";
    static final String EXTREME_HEAT_ALERT_SHARE_URL = "extremeHeatAlertShareUrl";
    static final String FEATURE_ENABLED_IMAVIDEO = "featureEnableImaVideo";
    static final boolean FEATURE_ENABLED_IMAVIDEO_DEFAULT = true;
    static final String GRASS_POLLEN_MAP_DEFAULT_URL = "http://i.imwx.com/images/maps/pt_BR/health/grass_pol_720x486.jpg";
    static final String GRASS_POLLEN_MAP_URL = "grassPollenMapUrl";
    static final String HEAVY_RAIN_ALERT_SHARE_DEFAULT_URL = "http://www.weather.com";
    static final String HEAVY_RAIN_ALERT_SHARE_URL = "heavyRainShareUrl";
    static final String HEAVY_SNOWFALL_SHARE_DEFAULT_URL = "http://www.weather.com";
    static final String HEAVY_SNOWFALL_SHARE_URL = "heavySnowfallAlertShareUrl";
    static final String HIGH_WIND_ALERT_SHARE_DEFAULT_URL = "http://www.weather.com";
    static final String HIGH_WIND_ALERT_SHARE_URL = "highWindAlertShareUrl";
    static final String HURRICANE_CENTRAL_ENABLED = "hurricaneCentralEnabled";
    static final String HURRICANE_NEWS_DEFAULT_URL = "http://{DSX_SERVER}.weather.com/cms/v1/a/?api={API_KEY}&pg=0%2C10&q=type%3A%24in%28%27article%27%29%3Btags.keyword%3A%24in%28%27hurricane%27%29&sort=-lastmodifieddate";
    static final String HURRICANE_NEWS_URL = "hurricaneNewsUrl";
    static final String HURRICANE_SAFETY_DEFAULT_URL = "http://www.weather.com/safety/hurricane";
    static final String HURRICANE_SAFETY_URL = "hurricaneSafetyUrl";
    static final String ICE_SHARE_DEFAULT_URL = "http://www.weather.com";
    static final String ICE_SHARE_URL = "iceAlertShareUrl";
    static final String IMAVIDEO_USE_ABR = "imaVideoUseAbr_v2";
    static final boolean IMAVIDEO_USE_ABR_DEFAULT = true;
    static final String LOCAL_US_FEED_URL = "localUsFeedUrl";
    static final String LOCAL_VIDEO_DISPLAY_RANGES = "localForecastVideoTimes";
    static final String MOLD_MAP_DEFAULT_URL = "http://i.imwx.com/images/maps/pt_BR/health/mold_spore_720x486.jpg";
    static final String MOLD_MAP_URL = "moldMapUrl";
    static final int MUST_SEE_FORECAST_VIDEO_DEFAULT_POSITION = 0;
    static final String MUST_SEE_FORECAST_VIDEO_POSITION = "mustSeeForecastVideoPosition";
    static final String MUST_SEE_INTL_VIDEO_FEED_URL = "mustSeeIntlVideoFeedUrl";
    static final String MUST_SEE_VIDEO_FEED_URL = "mustSeeVideoFeedUrl";
    static final String NATIONAL_US_FEED_URL = "nationalUsFeedUrl";
    static final String NEWS_ARTICLE_SLIDESHOW_DEFAULT_URL = "http://{DSX_SERVER}.weather.com/cms/assets/slideshow";
    static final String NEWS_ARTICLE_SLIDESHOW_URL = "newsArticleSlideshowUrl";
    static final String NEWS_SHARE_DEFAULT_URL = "http://www.weather.com%s";
    static final String NEWS_SHARE_URL = "newsShareUrl";
    static final String NHC_DETAILS_DEFAULT_URL = "http://{DSX_SERVER}.weather.com/wxd/v1/TropicalBulletins";
    static final String NHC_DETAILS_URL = "nhcDDetailsUrl";
    static final String ON_TV_VIDEO_FEED_URL = "onTvVideoFeedUrl";
    static final String PAST_POLLEN_DEFAULT_URL = "http://{DSX_SERVER}.weather.com/wxd/v2/PastPollen/en_US/";
    static final String PAST_POLLEN_URL = "pastPollenUrl";
    static final String POLLEN_SHARE_DEFAULT_URL = "http://www.weather.com/health/pollen/forecast/%s";
    static final String POLLEN_SHARE_URL = "pollenShareUrl";
    static final String RAINSNOW_ALERT_SHARE_DEFAULT_URL = "http://www.weather.com/weather/today/%s";
    static final String RAINSNOW_ALERT_SHARE_URL = "rainSnowShareUrl";
    static final String REAL_TIME_ALERT_SHARE_DEFAULT_URL = "http://www.weather.com/weather/map/interactive/l/%s";
    static final String REAL_TIME_ALERT_SHARE_URL = "realTimeAlertShareUrl";
    static final String RED_CROSS_DEFAULT_URL = "http://redcross.org/mobile/";
    static final String RED_CROSS_URL = "redCrossUrl";
    static final String REGIONAL_US_FEED_URL = "regionalUsFeedUrl";
    static final String SEVERE_ALERT_SHARE_DEFAULT_URL = "http://www.weather.com/weather/today/%s";
    static final String SEVERE_ALERT_SHARE_URL = "severeAlertShareUrl";
    static final String SHOW_CABLE_PROVIDER_SIGNUP_SCREEN = "showCableProviderSignupScreen";
    static final boolean SHOW_CABLE_PROVIDER_SIGNUP_SCREEN_DEFAULT = false;
    public static final String STORM_DATA_BASE_URL = "tropicalStormDataUrl";
    static final String STORM_DATA_DEFAULT_BASE_URL = "http://{DSX_SERVER}.weather.com/";
    static final String STORM_NEWS_DEFAULT_URL = "http://dsx.weather.com/cms/v1/a?api={API_KEY}&pg=0%2C10&q=type%3A%24in%28%27article%27%29%3Btags.storm%3A%24in%28%27{STORM_ID}%27%29&sort=-lastmodifieddate";
    static final String STORM_NEWS_URL = "stormNewsUrl";
    static final String THUNDERSTORM_ALERT_SHARE_DEFAULT_URL = "http://www.weather.com";
    static final String THUNDERSTORM_ALERT_SHARE_URL = "thunderStormShareUrl";
    static final String TIME_OF_DAY_HOUR = "hour";
    static final String TIME_OF_DAY_MINUTE = "minute";
    static final String TIME_RANGE_END = "end";
    static final String TIME_RANGE_START = "start";
    static final String TOPSTORY_URL = "topStoryUrl";
    static final String TREE_POLLEN_MAP_DEFAULT_URL = "http://i.imwx.com/images/maps/pt_BR/health/tree_pol_720x486.jpg";
    static final String TREE_POLLEN_MAP_URL = "treePollenMapUrl";
    static final String TROPICAL_UPDATE_NEWS_DEFAULT_URL = "http://{DSX_SERVER}.weather.com/cms/v1/a/?api={API_KEY}&pg=0%2C10&q=type%3A%24in%28%27article%27%29%3Btags.keyword%3A%24in%28%27TropicalUpdate%27%29&sort=-lastmodifieddate";
    static final String TROPICAL_UPDATE_NEWS_URL = "tropicalUpdateNewsUrl";
    public static final String TWC_DEFAULT_URL = "http://www.weather.com";
    static final String TWC_PRESENTS_URL = "twcPresentsUrl";
    static final String UPS_CHANNEL_SUFFIX = "upsChannelSuffix";
    static final String UPS_DSX_SERVER = "upsDsxServer";
    static final String VIDEO_ASSET_QUERY_URL = "videoQueryUrl_v2";
    static final String VIDEO_ASSET_QUERY_URL_DEFAULT = "http://{DSX_SERVER}.weather.com/cms/v1/a?api={API_KEY}&pg=%2$d%%2C%3$d&q=type%%3A%%24in%%28%%27video%%27%%29%1$s&sort=-lastmodifieddate";
    static final String VIDEO_DEDUPED_COLLECTION_URL = "videoDedupedCollectionUrl";
    static final String VIDEO_DEDUPED_COLLECTION_URL_DEFAULT = "http://{DSX_SERVER}.weather.com/cms/v1/videos/dedupedCollections/mobile/%1$s/%2$s,%3$s?api={API_KEY}";
    static final String VIDEO_DMA_URL = "videoDmaUrl";
    static final String VIDEO_DMA_URL_DEFAULT = "http://{DSX_SERVER}.weather.com/cms/v1/videoList/mobile/%1$s?api={API_KEY}";
    static final String VIDEO_GUID = "videoGUID";
    static final String VIDEO_ORDEREDLIST_URL = "videoOrderedList";
    static final String VIDEO_ORDEREDLIST_URL_DEFAULT = "http://{DSX_SERVER}.weather.com/cms/v1/orderedlist/mobile/video/%1$s?api={API_KEY}";
    static final String VIDEO_PROGRAMMING_URL = "videoProgramming";
    static final String VIDEO_PROGRAMMING_URL_DEFAULT = "http://{DSX_SERVER}.weather.com/cms/v1/list/mobile/%1$s/video/app?api={API_KEY}";
    static final String VIDEO_SHARE_CLIP_URL = "videoShareClipUrl";
    static final String WEATHER_IMAGES = "weatherImages";
    static final String WEATHER_IMAGE_CUT = "weatherImageCut";
    static final String WEATHER_NODES_IMAGE_DEFAULT_URL = "http://dsx.weather.com/cms/a/";
    static final String WEATHER_NODES_IMAGE_URL = "wxNodeImageUrl";
    static final String WEB_MAP_URL = "webMapUrl";
    static final String WEED_POLLEN_MAP_DEFAULT_URL = "http://i.imwx.com/images/maps/pt_BR/health/rag_pol_720x486.jpg";
    static final String WEED_POLLEN_MAP_URL = "weedPollenMapUrl";
    static final String WORLD_VIDEO_FEED_URL = "worldVideoFeedUrl";
    private final String apiKey;
    public final String assetUrl;
    public final String breakingNews;
    public final String breathingMapUrl;
    public final String burdaVideoOrderedListUrl;
    public final int cableProviderSignupTextVersion;
    public final String contentModeUrl;
    public final String denseFogAlertShareUrl;
    public final boolean enableFluModule;
    public final String extremeColdAlertShareUrl;
    public final String extremeHeatAlertShareUrl;
    public final boolean featureEnabledImaVideo;
    public final String grassPollenMapUrl;
    public final String heavyRainAlertShareUrl;
    public final String heavySnowfallAlertShareUrl;
    public final String highWindAlertShareUrl;
    public final boolean hurricaneCentralEnabled;
    public final String hurricaneNewsUrl;
    public final String hurricaneSafetyUrl;
    public final String iceAlertShareUrl;
    public final String localUsFeedUrl;
    private final List localVideoRanges;
    public final String moldMapUrl;
    public final int mustSeeForecastVideoPosition;
    public final String mustSeeIntlVideoFeedUrl;
    public final String mustSeeVideoFeedUrl;
    public final String nationalUsFeedUrl;
    public final String newsArticleSlideshowUrl;
    public final String newsShareUrl;
    public final String nhcDetailsUrl;
    public final String onTvVideoFeedUrl;
    public final String pastPollenUrl;
    public final String pollenShareUrl;
    public final String rainsnowShareUrl;
    public final String realTimeAlertShareUrl;
    public final String redCrossUrl;
    public final String regionalUsFeedUrl;
    public final String severeAlertShareUrl;
    public final boolean shouldImaVideoUseAbr;
    public final boolean showCableProviderSignupScreen;
    public final String stormNewsUrl;
    public final String thunderstormAlertShareUrl;
    public final String topStoryUrl;
    public final String treePollenMapUrl;
    public final String tropicalStormDataUrl;
    public final String tropicalUpdateNewsUrl;
    public final String twcPresents;
    public final String upsChannelSuffix;
    public final String upsDsxServer;
    final String videoAssetQueryUrl;
    final String videoDedupedCollectionUrlFormat;
    public final String videoDmaUrlFormat;
    public final String videoGUID;
    public final String videoOrderedListUrl;
    public final String videoProgrammingUrl;
    public final String videoShareClipUrl;
    public final String weatherImageCut;
    public final String weatherImages;
    public final String webMapUrl;
    public final String weedPollenMapUrl;
    public final String worldVideoFeedUrl;
    public final String wxNodeImageUrl;

    public FlagshipConfig(JSONObject jsonobject, String s)
        throws JSONException, ValidationException
    {
        apiKey = s;
        assetUrl = replaceApiKeyAndServer(jsonobject.getString("articleBaseUrl"));
        topStoryUrl = replaceApiKeyAndServer(jsonobject.getString("topStoryUrl"));
        breakingNews = replaceApiKeyAndServer(jsonobject.getString("breakingNews"));
        weatherImages = replaceApiKeyAndServer(jsonobject.getString("weatherImages"));
        weatherImageCut = replaceApiKeyAndServer(jsonobject.getString("weatherImageCut"));
        upsDsxServer = replaceApiKeyAndServer(jsonobject.getString("upsDsxServer"));
        mustSeeVideoFeedUrl = replaceApiKeyAndServer(jsonobject.getString("mustSeeVideoFeedUrl"));
        worldVideoFeedUrl = replaceApiKeyAndServer(jsonobject.getString("worldVideoFeedUrl"));
        onTvVideoFeedUrl = replaceApiKeyAndServer(jsonobject.getString("onTvVideoFeedUrl"));
        localUsFeedUrl = replaceApiKeyAndServer(jsonobject.getString("localUsFeedUrl"));
        regionalUsFeedUrl = replaceApiKeyAndServer(jsonobject.getString("regionalUsFeedUrl"));
        nationalUsFeedUrl = replaceApiKeyAndServer(jsonobject.getString("nationalUsFeedUrl"));
        mustSeeIntlVideoFeedUrl = replaceApiKeyAndServer(jsonobject.getString("mustSeeIntlVideoFeedUrl"));
        pollenShareUrl = replaceApiKeyAndServer(jsonobject.optString("pollenShareUrl", "http://www.weather.com/health/pollen/forecast/%s"));
        severeAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("severeAlertShareUrl", "http://www.weather.com/weather/today/%s"));
        rainsnowShareUrl = replaceApiKeyAndServer(jsonobject.optString("rainSnowShareUrl", "http://www.weather.com/weather/today/%s"));
        realTimeAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("realTimeAlertShareUrl", "http://www.weather.com/weather/map/interactive/l/%s"));
        heavyRainAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("heavyRainShareUrl", "http://www.weather.com"));
        thunderstormAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("thunderStormShareUrl", "http://www.weather.com"));
        extremeHeatAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("extremeHeatAlertShareUrl", "http://www.weather.com"));
        highWindAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("highWindAlertShareUrl", "http://www.weather.com"));
        denseFogAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("denseFogAlertShareUrl", "http://www.weather.com"));
        extremeColdAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("extremeColdAlertShareUrl", "http://www.weather.com"));
        heavySnowfallAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("heavySnowfallAlertShareUrl", "http://www.weather.com"));
        iceAlertShareUrl = replaceApiKeyAndServer(jsonobject.optString("iceAlertShareUrl", "http://www.weather.com"));
        twcPresents = replaceApiKeyAndServer(jsonobject.getString("twcPresentsUrl"));
        videoShareClipUrl = replaceApiKeyAndServer(jsonobject.optString("videoShareClipUrl", "http://www.weather.com/video/%s"));
        videoGUID = replaceApiKeyAndServer(jsonobject.optString("videoGUID", "/681f29c5-81eb-4229-9801-ebe21531a57c/"));
        newsShareUrl = replaceApiKeyAndServer(jsonobject.optString("newsShareUrl", "http://www.weather.com%s"));
        upsChannelSuffix = jsonobject.optString("upsChannelSuffix", "");
        webMapUrl = jsonobject.optString("webMapUrl", "http://weather.com/mobile/android/maps4_2_2/webmaps.html");
        mustSeeForecastVideoPosition = jsonobject.optInt("mustSeeForecastVideoPosition", 0);
        redCrossUrl = jsonobject.optString("redCrossUrl", "http://redcross.org/mobile/");
        stormNewsUrl = replaceApiKeyAndServer(jsonobject.optString("stormNewsUrl", "http://dsx.weather.com/cms/v1/a?api={API_KEY}&pg=0%2C10&q=type%3A%24in%28%27article%27%29%3Btags.storm%3A%24in%28%27{STORM_ID}%27%29&sort=-lastmodifieddate"));
        hurricaneNewsUrl = replaceApiKeyAndServer(jsonobject.optString("hurricaneNewsUrl", "http://{DSX_SERVER}.weather.com/cms/v1/a/?api={API_KEY}&pg=0%2C10&q=type%3A%24in%28%27article%27%29%3Btags.keyword%3A%24in%28%27hurricane%27%29&sort=-lastmodifieddate"));
        tropicalUpdateNewsUrl = replaceApiKeyAndServer(jsonobject.optString("tropicalUpdateNewsUrl", "http://{DSX_SERVER}.weather.com/cms/v1/a/?api={API_KEY}&pg=0%2C10&q=type%3A%24in%28%27article%27%29%3Btags.keyword%3A%24in%28%27TropicalUpdate%27%29&sort=-lastmodifieddate"));
        wxNodeImageUrl = jsonobject.optString("wxNodeImageUrl", "http://dsx.weather.com/cms/a/");
        contentModeUrl = replaceApiKeyAndServer(jsonobject.optString("contentModeUrl", "http://{DSX_SERVER}.weather.com/cms/v1/settings/content-mode?api={API_KEY}"));
        pastPollenUrl = replaceApiKeyAndServer(jsonobject.optString("pastPollenUrl", "http://{DSX_SERVER}.weather.com/wxd/v2/PastPollen/en_US/"));
        newsArticleSlideshowUrl = replaceApiKeyAndServer(jsonobject.optString("newsArticleSlideshowUrl", "http://{DSX_SERVER}.weather.com/cms/assets/slideshow"));
        s = replaceApiKeyAndServer(jsonobject.optString("tropicalStormDataUrl", "http://{DSX_SERVER}.weather.com/"));
        Object obj = replaceApiKeyAndServer(jsonobject.optString("hurricaneSafetyUrl", "http://www.weather.com/safety/hurricane"));
        String s1 = replaceApiKeyAndServer(jsonobject.optString("nhcDDetailsUrl", "http://{DSX_SERVER}.weather.com/wxd/v1/TropicalBulletins"));
        tropicalStormDataUrl = Validation.validateWebUrl("tropicalStormDataUrl", s);
        hurricaneSafetyUrl = Validation.validateWebUrl("hurricaneSafetyUrl", ((String) (obj)));
        nhcDetailsUrl = Validation.validateWebUrl("nhcDDetailsUrl", s1);
        hurricaneCentralEnabled = jsonobject.optBoolean("hurricaneCentralEnabled");
        s = ImmutableList.builder();
        obj = jsonobject.optJSONArray("localForecastVideoTimes");
        if (obj != null)
        {
            int j = ((JSONArray) (obj)).length();
            for (int i = 0; i < j; i++)
            {
                JSONObject jsonobject1 = ((JSONArray) (obj)).getJSONObject(i);
                s.add(TimeOfDayRange.closedOpen(extraTimeOfDay(jsonobject1.getJSONObject("start")), extraTimeOfDay(jsonobject1.getJSONObject("end")), TimeUnit.MINUTES));
            }

        }
        localVideoRanges = s.build();
        featureEnabledImaVideo = jsonobject.optBoolean("featureEnableImaVideo", true);
        shouldImaVideoUseAbr = jsonobject.optBoolean("imaVideoUseAbr_v2", true);
        videoOrderedListUrl = replaceApiKeyAndServer(jsonobject.optString("videoOrderedList", "http://{DSX_SERVER}.weather.com/cms/v1/orderedlist/mobile/video/%1$s?api={API_KEY}"));
        videoDedupedCollectionUrlFormat = replaceApiKeyAndServer(jsonobject.optString("videoDedupedCollectionUrl", "http://{DSX_SERVER}.weather.com/cms/v1/videos/dedupedCollections/mobile/%1$s/%2$s,%3$s?api={API_KEY}"));
        videoProgrammingUrl = replaceApiKeyAndServer(jsonobject.optString("videoProgramming", "http://{DSX_SERVER}.weather.com/cms/v1/list/mobile/%1$s/video/app?api={API_KEY}"));
        videoAssetQueryUrl = replaceApiKeyAndServer(jsonobject.optString("videoQueryUrl_v2", "http://{DSX_SERVER}.weather.com/cms/v1/a?api={API_KEY}&pg=%2$d%%2C%3$d&q=type%%3A%%24in%%28%%27video%%27%%29%1$s&sort=-lastmodifieddate"));
        videoDmaUrlFormat = replaceApiKeyAndServer(jsonobject.optString("videoDmaUrl", "http://{DSX_SERVER}.weather.com/cms/v1/videoList/mobile/%1$s?api={API_KEY}"));
        burdaVideoOrderedListUrl = replaceApiKeyAndServer(jsonobject.optString("burdaVideoOrderedList", "http://{DSX_SERVER}.weather.com/cms/v4/orderedlist/de_DE/mobile/video/%1$s?api={API_KEY}"));
        showCableProviderSignupScreen = jsonobject.optBoolean("showCableProviderSignupScreen", false);
        enableFluModule = jsonobject.optBoolean("enableFluModule", false);
        cableProviderSignupTextVersion = jsonobject.optInt("cableProviderSignupTextVersion", 1);
        treePollenMapUrl = jsonobject.optString("treePollenMapUrl", "http://i.imwx.com/images/maps/pt_BR/health/tree_pol_720x486.jpg");
        grassPollenMapUrl = jsonobject.optString("grassPollenMapUrl", "http://i.imwx.com/images/maps/pt_BR/health/grass_pol_720x486.jpg");
        weedPollenMapUrl = jsonobject.optString("weedPollenMapUrl", "http://i.imwx.com/images/maps/pt_BR/health/rag_pol_720x486.jpg");
        breathingMapUrl = jsonobject.optString("breathingMapUrl", "http://i.imwx.com/images/maps/pt_BR/health/forresp_720x486.jpg");
        moldMapUrl = jsonobject.optString("moldMapUrl", "http://i.imwx.com/images/maps/pt_BR/health/mold_spore_720x486.jpg");
    }

    private TimeOfDay extraTimeOfDay(JSONObject jsonobject)
        throws JSONException
    {
        return TimeOfDay.builder().setHours(jsonobject.getInt("hour")).setMinutes(jsonobject.getInt("minute")).build();
    }

    private String replaceApiKeyAndServer(String s)
    {
        return (String)Preconditions.checkNotNull(DsxServerUtil.appendDsxServer(s.replace("{API_KEY}", apiKey)));
    }

    public String getAssetRequestUrl(String s)
    {
        return String.format(Locale.US, assetUrl, new Object[] {
            s
        });
    }

    public Collection getLocalVideoRanges()
    {
        return ImmutableList.copyOf(localVideoRanges);
    }

    public String getVideoDedupedCollectionUrl(String s, QueryRange queryrange)
    {
        return String.format(Locale.US, videoDedupedCollectionUrlFormat, new Object[] {
            s, Integer.valueOf(queryrange.getStart()), Integer.valueOf(queryrange.getCount())
        });
    }

    public String getVideoQueryUrl(String s, QueryRange queryrange)
    {
        return String.format(Locale.US, videoAssetQueryUrl, new Object[] {
            s, Integer.valueOf(queryrange.getStart()), Integer.valueOf(queryrange.getCount())
        });
    }
}
