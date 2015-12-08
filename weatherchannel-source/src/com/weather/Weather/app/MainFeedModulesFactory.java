// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.weather.Weather.ads.AdModule;
import com.weather.Weather.airport.AirportModule;
import com.weather.Weather.boat.BoatAndBeachModule;
import com.weather.Weather.checkin.CheckinModule;
import com.weather.Weather.checkin.SocialLocalyticsModuleHandler;
import com.weather.Weather.checkin.SocialModule;
import com.weather.Weather.feed.Module;
import com.weather.Weather.feed.ModulesFactory;
import com.weather.Weather.flu.FluModule;
import com.weather.Weather.hourly.HourlyModule;
import com.weather.Weather.hurricane.HurricaneCentralModule;
import com.weather.Weather.hurricane.HurricaneCentralModuleLocalyticsHandler;
import com.weather.Weather.map.DDILocalyticsModuleHandler;
import com.weather.Weather.map.DrivingDifficultyIndexModule;
import com.weather.Weather.map.MapModule;
import com.weather.Weather.map.MapModuleHandler;
import com.weather.Weather.news.BreakingNowModule;
import com.weather.Weather.news.NewsModule;
import com.weather.Weather.pollen.HealthLocalyticsModuleHandler;
import com.weather.Weather.pollen.PollenModule;
import com.weather.Weather.rightnow.RightNowModule;
import com.weather.Weather.ski.SkiModule;
import com.weather.Weather.tenday.ForecastLocalyticsModuleHandler;
import com.weather.Weather.tenday.TenDayModule;
import com.weather.Weather.twcpresents.TwcPresentsModule;
import com.weather.Weather.video2.VideoModule;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;
import com.weather.commons.analytics.feed.LocalyticsModuleViewedAttribute;
import com.weather.commons.analytics.feed.MainFeedLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.tropical.StormTrackImageFetcher;
import com.weather.commons.video2.VideoUtil;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.ui.UIUtil;

// Referenced classes of package com.weather.Weather.app:
//            MainFeedAdLocalyticsModuleHandler

public final class MainFeedModulesFactory extends ModulesFactory
{

    private final boolean enableHurricaneCentral;

    public MainFeedModulesFactory(boolean flag)
    {
        enableHurricaneCentral = flag;
    }

    private Module chooseVideoModule(String s, Context context, ModuleConfig moduleconfig, LocalyticsHandler localyticshandler, Handler handler)
    {
        localyticshandler = new ClickableLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.VIDEO_MODULE, LocalyticsModuleViewedAttribute.VIDEO, LocalyticsFeedButton.VIDEO, localyticshandler, handler);
        if (VideoUtil.useImaVideoFeature())
        {
            if (s.equals("video3"))
            {
                s = com.weather.Weather.video2.VideoModule.ModuleType.TYPE_3_UP;
            } else
            {
                s = com.weather.Weather.video2.VideoModule.ModuleType.TYPE_4_UP;
            }
            return new VideoModule(context, moduleconfig, handler, localyticshandler, s);
        }
        if (s.equals("video3"))
        {
            s = com.weather.Weather.video.VideoModule.ModuleType.TYPE_3_UP;
        } else
        {
            s = com.weather.Weather.video.VideoModule.ModuleType.TYPE_4_UP;
        }
        return new com.weather.Weather.video.VideoModule(context, moduleconfig, handler, localyticshandler, s);
    }

    private ModuleConfig updateConfig(ModuleConfig moduleconfig, com.weather.Weather.feed.ModulesManager.ModuleConfigOverride moduleconfigoverride)
    {
        String s;
        byte byte0;
        s = moduleconfig.id;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 72
    //                   -1815339889: 215
    //                   -816678120: 155
    //                   -816678119: 170
    //                   178691037: 185
    //                   1536840714: 200
    //                   1989514625: 230;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        byte0;
        JVM INSTR tableswitch 0 5: default 112
    //                   0 245
    //                   1 245
    //                   2 251
    //                   3 257
    //                   4 263
    //                   5 271;
           goto _L8 _L9 _L9 _L10 _L11 _L12 _L13
_L8:
        s = moduleconfig.id;
_L14:
        boolean flag;
        if (moduleconfigoverride == null)
        {
            moduleconfigoverride = null;
        } else
        {
            moduleconfigoverride = moduleconfigoverride.isHideable(s);
        }
        if (moduleconfigoverride == null)
        {
            flag = moduleconfig.isHideable;
        } else
        {
            flag = moduleconfigoverride.booleanValue();
        }
        return ModuleConfig.builder(moduleconfig).setIsHideable(flag).setId(s).setFeedId("mainFeed").build();
_L3:
        if (s.equals("video3"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        if (s.equals("video4"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        if (s.equals("breaking-news"))
        {
            byte0 = 2;
        }
          goto _L1
_L6:
        if (s.equals("check-in"))
        {
            byte0 = 3;
        }
          goto _L1
_L2:
        if (s.equals("AdModule"))
        {
            byte0 = 4;
        }
          goto _L1
_L7:
        if (s.equals("driving-difficulty"))
        {
            byte0 = 5;
        }
          goto _L1
_L9:
        s = "video";
          goto _L14
_L10:
        s = "news";
          goto _L14
_L11:
        s = "social";
          goto _L14
_L12:
        s = moduleconfig.adSlotName;
          goto _L14
_L13:
        s = "map";
          goto _L14
    }

    public Module makeModule(Context context, Handler handler, ModuleConfig moduleconfig, com.weather.Weather.feed.ModulesManager.ModuleConfigOverride moduleconfigoverride)
    {
        Object obj;
        Object obj1;
        byte byte0;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(handler);
        Preconditions.checkNotNull(moduleconfig);
        obj1 = moduleconfig;
        obj = obj1;
        if (!enableHurricaneCentral)
        {
            obj = obj1;
            if ("hurricane".equals(moduleconfig.id))
            {
                obj = ModuleConfig.builder(moduleconfig).setId("map").build();
            }
        }
        moduleconfigoverride = updateConfig(((ModuleConfig) (obj)), moduleconfigoverride);
        obj1 = LocalyticsHandler.getInstance();
        obj = ((ModuleConfig) (obj)).id;
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 19: default 252
    //                   -1815339889: 646
    //                   -1429184020: 346
    //                   -1211426191: 362
    //                   -991666997: 493
    //                   -982667096: 476
    //                   -897050771: 561
    //                   -816678120: 378
    //                   -816678119: 394
    //                   101487: 510
    //                   107868: 426
    //                   113937: 527
    //                   3029312: 612
    //                   3377875: 410
    //                   178691037: 595
    //                   213619345: 442
    //                   270737752: 629
    //                   1536840714: 544
    //                   1656418188: 578
    //                   1989514625: 459;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_646;
_L21:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return new TenDayModule(context, moduleconfigoverride, handler, new ForecastLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.TEN_DAY_MODULE, LocalyticsModuleViewedAttribute.TEN_DAY, LocalyticsFeedButton.EXTENDED_FORECAST, LocalyticsFeedButton.WEEKEND_FORECAST, ((LocalyticsHandler) (obj1)), handler));

        case 1: // '\001'
            return new HourlyModule(context, moduleconfigoverride, handler, new ClickableLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HOURLY_MODULE, LocalyticsModuleViewedAttribute.HOURLY, LocalyticsFeedButton.HOURLY_MORE, ((LocalyticsHandler) (obj1)), handler));

        case 2: // '\002'
        case 3: // '\003'
            return chooseVideoModule(moduleconfig.id, context, moduleconfigoverride, ((LocalyticsHandler) (obj1)), handler);

        case 4: // '\004'
            return new NewsModule(context, moduleconfigoverride, handler, new ClickableLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.NEWS_MODULE, LocalyticsModuleViewedAttribute.NEWS, LocalyticsFeedButton.NEWS_ARTICLE, ((LocalyticsHandler) (obj1)), handler));

        case 5: // '\005'
            return new MapModule(context, moduleconfigoverride, handler, new ClickableLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.MAP_MODULE, LocalyticsModuleViewedAttribute.MAP, LocalyticsFeedButton.RADAR_MORE, ((LocalyticsHandler) (obj1)), handler));

        case 6: // '\006'
            return new HurricaneCentralModule(context, moduleconfigoverride, handler, new HurricaneCentralModuleLocalyticsHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.MAP_MODULE, com.weather.commons.analytics.LocalyticsTags.ScreenName.MAIN_FEED, LocalyticsModuleViewedAttribute.HURRICANE, LocalyticsFeedButton.HURRICANE_CENTRAL, ((LocalyticsHandler) (obj1)), handler), new StormTrackImageFetcher(Picasso.with(context), context));

        case 7: // '\007'
            return new DrivingDifficultyIndexModule(context, moduleconfigoverride, handler, new DDILocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.DDI_MODULE, LocalyticsModuleViewedAttribute.MAP, ((LocalyticsHandler) (obj1)), handler), new MapModuleHandler());

        case 8: // '\b'
            return new PollenModule(context, moduleconfigoverride, handler, new HealthLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HEALTH_MODULE, LocalyticsModuleViewedAttribute.HEALTH, ((LocalyticsHandler) (obj1)), handler));

        case 9: // '\t'
            return new AirportModule(context, moduleconfigoverride, handler, new MainFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.AIRPORT_MODULE, LocalyticsModuleViewedAttribute.AIRPORT, ((LocalyticsHandler) (obj1)), handler));

        case 10: // '\n'
            return new FluModule(context, moduleconfigoverride, handler, new MainFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.FLU_MODULE, LocalyticsModuleViewedAttribute.FLU, ((LocalyticsHandler) (obj1)), handler));

        case 11: // '\013'
            return new SkiModule(context, moduleconfigoverride, handler, new MainFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.SKI_MODULE, LocalyticsModuleViewedAttribute.SKI, ((LocalyticsHandler) (obj1)), handler));

        case 12: // '\f'
            if (UIUtil.isAmazonMobile(AbstractTwcApplication.getRootContext()))
            {
                return null;
            } else
            {
                return new CheckinModule(context, moduleconfigoverride, handler, new SocialLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.SOCIAL_MODULE, LocalyticsModuleViewedAttribute.SOCIAL, LocalyticsFeedButton.SOCIAL_PHOTO, LocalyticsFeedButton.SOCIAL_CHECKIN, ((LocalyticsHandler) (obj1)), handler));
            }

        case 13: // '\r'
            if (UIUtil.isAmazonMobile(AbstractTwcApplication.getRootContext()))
            {
                return null;
            } else
            {
                return new SocialModule(context, moduleconfigoverride, handler, new SocialLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.SOCIAL_MODULE, LocalyticsModuleViewedAttribute.SOCIAL, LocalyticsFeedButton.SOCIAL_PHOTO, LocalyticsFeedButton.SOCIAL_CHECKIN, ((LocalyticsHandler) (obj1)), handler));
            }

        case 14: // '\016'
            return new RightNowModule(context, moduleconfigoverride, handler, new ClickableLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.RIGHT_NOW_MODULE, LocalyticsModuleViewedAttribute.RIGHT_NOW, LocalyticsFeedButton.RIGHT_NOW_VIDEO, ((LocalyticsHandler) (obj1)), handler));

        case 15: // '\017'
            if (BreakingNowModule.isBreakingAvailable())
            {
                return new BreakingNowModule(context, moduleconfigoverride, handler, new ClickableLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.BREAKING_NOW_MODULE, LocalyticsModuleViewedAttribute.BREAKING_NEWS, LocalyticsFeedButton.BREAKING_NEWS_ARTICLE, ((LocalyticsHandler) (obj1)), handler));
            } else
            {
                return null;
            }

        case 16: // '\020'
            return new BoatAndBeachModule(context, moduleconfigoverride, handler, new MainFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.BOAT_BEACH_MODULE, LocalyticsModuleViewedAttribute.BOAT_AND_BEACH, ((LocalyticsHandler) (obj1)), handler));

        case 17: // '\021'
            return new TwcPresentsModule(context, moduleconfigoverride, handler, new ClickableLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.OUR_FAVORITE_THINGS_MODULE, LocalyticsModuleViewedAttribute.FAVORITE_THINGS, LocalyticsFeedButton.FAVORITE_THINGS, ((LocalyticsHandler) (obj1)), handler));

        case 18: // '\022'
            return new AdModule(context, moduleconfigoverride, handler, new MainFeedAdLocalyticsModuleHandler(LocalyticsHandler.getInstance()));
        }
_L3:
        if (((String) (obj)).equals("ten-day"))
        {
            byte0 = 0;
        }
          goto _L21
_L4:
        if (((String) (obj)).equals("hourly"))
        {
            byte0 = 1;
        }
          goto _L21
_L8:
        if (((String) (obj)).equals("video3"))
        {
            byte0 = 2;
        }
          goto _L21
_L9:
        if (((String) (obj)).equals("video4"))
        {
            byte0 = 3;
        }
          goto _L21
_L14:
        if (((String) (obj)).equals("news"))
        {
            byte0 = 4;
        }
          goto _L21
_L11:
        if (((String) (obj)).equals("map"))
        {
            byte0 = 5;
        }
          goto _L21
_L16:
        if (((String) (obj)).equals("hurricane"))
        {
            byte0 = 6;
        }
          goto _L21
_L20:
        if (((String) (obj)).equals("driving-difficulty"))
        {
            byte0 = 7;
        }
          goto _L21
_L6:
        if (((String) (obj)).equals("pollen"))
        {
            byte0 = 8;
        }
          goto _L21
_L5:
        if (((String) (obj)).equals("airport"))
        {
            byte0 = 9;
        }
          goto _L21
_L10:
        if (((String) (obj)).equals("flu"))
        {
            byte0 = 10;
        }
          goto _L21
_L12:
        if (((String) (obj)).equals("ski"))
        {
            byte0 = 11;
        }
          goto _L21
_L18:
        if (((String) (obj)).equals("check-in"))
        {
            byte0 = 12;
        }
          goto _L21
_L7:
        if (((String) (obj)).equals("social"))
        {
            byte0 = 13;
        }
          goto _L21
_L19:
        if (((String) (obj)).equals("current-conditions"))
        {
            byte0 = 14;
        }
          goto _L21
_L15:
        if (((String) (obj)).equals("breaking-news"))
        {
            byte0 = 15;
        }
          goto _L21
_L13:
        if (((String) (obj)).equals("boat"))
        {
            byte0 = 16;
        }
          goto _L21
_L17:
        if (((String) (obj)).equals("twcpresents"))
        {
            byte0 = 17;
        }
          goto _L21
        if (((String) (obj)).equals("AdModule"))
        {
            byte0 = 18;
        }
          goto _L21
    }
}
