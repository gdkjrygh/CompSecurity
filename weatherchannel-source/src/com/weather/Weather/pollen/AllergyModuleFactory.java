// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.Preconditions;
import com.weather.Weather.ads.AdModule;
import com.weather.Weather.app.MainFeedAdLocalyticsModuleHandler;
import com.weather.Weather.feed.Module;
import com.weather.Weather.feed.ModulesFactory;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.allergy.AllergyFeedLocalyticsModuleHandler;
import com.weather.commons.analytics.allergy.AllergyModuleViewedAttribute;
import com.weather.commons.config.ModuleConfig;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyHeroModule, AllergyForecastModule, AllergyMapModule, MoldHumidityModule

public class AllergyModuleFactory extends ModulesFactory
{

    public AllergyModuleFactory()
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
        moduleconfigoverride = ModuleConfig.builder(moduleconfig).setFeedId("allergyFeed").setIsHideable(flag);
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
        JVM INSTR lookupswitch 5: default 92
    //                   -1815339889: 190
    //                   -1483451047: 130
    //                   -1322940454: 145
    //                   -572720602: 175
    //                   1199077405: 160;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_190;
_L7:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return new AllergyHeroModule(context, moduleconfigoverride, handler, new AllergyFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.ALLERGY_HERO_MODULE, AllergyModuleViewedAttribute.ALLERGY_HERO, localyticshandler, handler));

        case 1: // '\001'
            return new AllergyForecastModule(context, moduleconfigoverride, handler, new AllergyFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.ALLERGY_FORECAST_MODULE, AllergyModuleViewedAttribute.ALLERGY_FORECAST, localyticshandler, handler));

        case 2: // '\002'
            return new AllergyMapModule(context, moduleconfigoverride, handler, new AllergyFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.ALLERGY_MAP_MODULE, AllergyModuleViewedAttribute.ALLERGY_MAP, localyticshandler, handler));

        case 3: // '\003'
            return new MoldHumidityModule(context, moduleconfigoverride, handler, new AllergyFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.MOLD_SLIDER_MODULE, AllergyModuleViewedAttribute.MOLD_SLIDER_MAP, localyticshandler, handler));

        case 4: // '\004'
            return new AdModule(context, moduleconfigoverride, handler, new MainFeedAdLocalyticsModuleHandler(LocalyticsHandler.getInstance()));
        }
_L3:
        if (moduleconfig.equals("allergy_hero"))
        {
            byte0 = 0;
        }
          goto _L7
_L4:
        if (moduleconfig.equals("allergy_forecast"))
        {
            byte0 = 1;
        }
          goto _L7
_L6:
        if (moduleconfig.equals("allergy_map"))
        {
            byte0 = 2;
        }
          goto _L7
_L5:
        if (moduleconfig.equals("mold_slider"))
        {
            byte0 = 3;
        }
          goto _L7
        if (moduleconfig.equals("AdModule"))
        {
            byte0 = 4;
        }
          goto _L7
    }
}
