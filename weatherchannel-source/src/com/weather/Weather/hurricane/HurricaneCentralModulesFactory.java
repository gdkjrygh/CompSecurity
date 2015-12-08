// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.Preconditions;
import com.weather.Weather.ads.AdModule;
import com.weather.Weather.feed.Module;
import com.weather.Weather.feed.ModulesFactory;
import com.weather.Weather.hurricane.modules.HurricaneBulletinsModule;
import com.weather.Weather.hurricane.modules.HurricaneVideoModule;
import com.weather.Weather.hurricane.modules.SafetyModule;
import com.weather.Weather.hurricane.modules.SafetyModuleLocalyticsHandler;
import com.weather.Weather.hurricane.modules.StormTrackLocalyticsModuleHandler;
import com.weather.Weather.hurricane.modules.StormTrackModule;
import com.weather.Weather.hurricane.modules.TropicalNewsModule;
import com.weather.Weather.hurricane.modules.TropicalNwsModule;
import com.weather.Weather.hurricane.modules.TropicalOutlookModule;
import com.weather.Weather.hurricane.modules.TropicalUpdateNewsModule;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.hurricane.ClickableHurricaneCentralFeedLocalyticsModuleHandler;
import com.weather.commons.analytics.hurricane.HurricaneCentralFeedLocalyticsModuleHandler;
import com.weather.commons.analytics.hurricane.HurricaneModuleViewedAttribute;
import com.weather.commons.config.ModuleConfig;

// Referenced classes of package com.weather.Weather.hurricane:
//            HurricaneVideoModuleLocalyticsHandler

public class HurricaneCentralModulesFactory extends ModulesFactory
{

    public HurricaneCentralModulesFactory()
    {
    }

    private ModuleConfig updateConfig(ModuleConfig moduleconfig, com.weather.Weather.feed.ModulesManager.ModuleConfigOverride moduleconfigoverride)
    {
        String s;
        byte byte0;
        boolean flag;
        if (moduleconfigoverride == null)
        {
            moduleconfigoverride = null;
        } else
        {
            moduleconfigoverride = moduleconfigoverride.isHideable(moduleconfig.id);
        }
        if (moduleconfigoverride == null)
        {
            flag = moduleconfig.isHideable;
        } else
        {
            flag = moduleconfigoverride.booleanValue();
        }
        moduleconfigoverride = ModuleConfig.builder(moduleconfig).setFeedId("hurricaneFeed").setIsHideable(flag);
        s = moduleconfig.id;
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch -1815339889 -1815339889: default 60
    //                   -1815339889 110;
           goto _L1 _L2
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 80
    //                   0 125;
           goto _L3 _L4
_L3:
        moduleconfig = moduleconfigoverride;
_L5:
        return moduleconfig.build();
_L2:
        if (s.equals("AdModule"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        moduleconfig = moduleconfigoverride.setId(moduleconfig.adSlotName);
          goto _L5
    }

    public Module makeModule(Context context, Handler handler, ModuleConfig moduleconfig, com.weather.Weather.feed.ModulesManager.ModuleConfigOverride moduleconfigoverride)
    {
        LocalyticsHandler localyticshandler;
        byte byte0;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(handler);
        Preconditions.checkNotNull(moduleconfig);
        moduleconfigoverride = updateConfig(moduleconfig, moduleconfigoverride);
        localyticshandler = LocalyticsHandler.getInstance();
        moduleconfig = moduleconfig.id;
        byte0 = -1;
        moduleconfig.hashCode();
        JVM INSTR lookupswitch 11: default 140
    //                   -1815339889: 217
    //                   -1046537297: 277
    //                   -909893934: 232
    //                   107868: 202
    //                   3377875: 292
    //                   743885051: 324
    //                   1098520909: 356
    //                   1115721966: 340
    //                   1542506052: 247
    //                   1554019168: 308
    //                   1780881575: 262;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_356;
_L13:
    /* block-local class not found */
    class HurricaneAdLocalyticsModuleHandler {}

        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return new StormTrackModule(context, moduleconfigoverride, handler, new StormTrackLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_STORM_TRACK_MODULE, HurricaneModuleViewedAttribute.STORM_TRACK, localyticshandler, handler, com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_FEED));

        case 1: // '\001'
            return new AdModule(context, moduleconfigoverride, handler, new HurricaneAdLocalyticsModuleHandler(null));

        case 2: // '\002'
            return new SafetyModule(context, moduleconfigoverride, handler, new SafetyModuleLocalyticsHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_SAFETY_MODULE, HurricaneModuleViewedAttribute.SAFETY, localyticshandler, handler, LocalyticsEvent.HC_RED_CROSS, LocalyticsEvent.HC_SAFETY));

        case 3: // '\003'
            return new TropicalOutlookModule(context, moduleconfigoverride, handler, new HurricaneCentralFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_TROPICAL_OUTLOOKS_MODULE, HurricaneModuleViewedAttribute.TROPICAL_OUTLOOKS, localyticshandler, handler));

        case 4: // '\004'
            return new TropicalNwsModule(context, moduleconfigoverride, handler, new ClickableHurricaneCentralFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_NWS_ALERT_MODULE, HurricaneModuleViewedAttribute.NWS_ALERT, localyticshandler, handler, LocalyticsEvent.HC_NWS_ALERTS));

        case 5: // '\005'
            return new HurricaneBulletinsModule(context, moduleconfigoverride, handler, new HurricaneCentralFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_BULLETINS_MODULE_MODULE, HurricaneModuleViewedAttribute.BULLETINS_MODULE, localyticshandler, handler));

        case 6: // '\006'
            return new TropicalNewsModule(context, moduleconfigoverride, handler, new HurricaneCentralFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_NEWS_ONE_MODULE, HurricaneModuleViewedAttribute.NEWS_ONE, localyticshandler, handler), 0);

        case 7: // '\007'
            return new TropicalNewsModule(context, moduleconfigoverride, handler, new HurricaneCentralFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_NEWS_TWO_MODULE, HurricaneModuleViewedAttribute.NEWS_TWO, localyticshandler, handler), 1);

        case 8: // '\b'
            return new TropicalNewsModule(context, moduleconfigoverride, handler, new HurricaneCentralFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_NEWS_THREE_MODULE, HurricaneModuleViewedAttribute.NEWS_THREE, localyticshandler, handler), 2);

        case 9: // '\t'
            return new TropicalUpdateNewsModule(context, moduleconfigoverride, handler, new HurricaneCentralFeedLocalyticsModuleHandler(null, null, localyticshandler, handler));

        case 10: // '\n'
            return new HurricaneVideoModule(context, moduleconfigoverride, handler, new HurricaneVideoModuleLocalyticsHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.HC_VIDEO_MODULE, com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_FEED, HurricaneModuleViewedAttribute.VIDEO, localyticshandler, handler));
        }
_L5:
        if (moduleconfig.equals("map"))
        {
            byte0 = 0;
        }
          goto _L13
_L2:
        if (moduleconfig.equals("AdModule"))
        {
            byte0 = 1;
        }
          goto _L13
_L4:
        if (moduleconfig.equals("safety"))
        {
            byte0 = 2;
        }
          goto _L13
_L10:
        if (moduleconfig.equals("tropical-outlook"))
        {
            byte0 = 3;
        }
          goto _L13
_L12:
        if (moduleconfig.equals("nws_alert"))
        {
            byte0 = 4;
        }
          goto _L13
_L3:
        if (moduleconfig.equals("hurricanes_bulletins"))
        {
            byte0 = 5;
        }
          goto _L13
_L6:
        if (moduleconfig.equals("news"))
        {
            byte0 = 6;
        }
          goto _L13
_L11:
        if (moduleconfig.equals("news_second"))
        {
            byte0 = 7;
        }
          goto _L13
_L7:
        if (moduleconfig.equals("news_third"))
        {
            byte0 = 8;
        }
          goto _L13
_L9:
        if (moduleconfig.equals("tropical_update_news"))
        {
            byte0 = 9;
        }
          goto _L13
        if (moduleconfig.equals("hurricane_video"))
        {
            byte0 = 10;
        }
          goto _L13
    }
}
