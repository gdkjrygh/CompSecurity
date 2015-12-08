// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.flu;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.Preconditions;
import com.weather.Weather.ads.AdModule;
import com.weather.Weather.app.MainFeedAdLocalyticsModuleHandler;
import com.weather.Weather.feed.Module;
import com.weather.Weather.feed.ModulesFactory;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.allergy.ColdFluFeedLocalyticsModuleHandler;
import com.weather.commons.analytics.allergy.ColdFluModuleViewedAttribute;
import com.weather.commons.config.ModuleConfig;

// Referenced classes of package com.weather.Weather.flu:
//            ColdFluHeroModule, ColdFluHistoryModule

public class ColdFluModuleFactory extends ModulesFactory
{

    public ColdFluModuleFactory()
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
        moduleconfigoverride = ModuleConfig.builder(moduleconfig).setFeedId("coldFluFeed").setIsHideable(flag);
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
        JVM INSTR lookupswitch 3: default 76
    //                   -1815339889: 136
    //                   1462660293: 106
    //                   1785270249: 121;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_136;
_L5:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return new ColdFluHeroModule(context, moduleconfigoverride, handler, new ColdFluFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.COLD_FLU_HERO_MODULE, ColdFluModuleViewedAttribute.COLD_FLU_HERO, localyticshandler, handler));

        case 1: // '\001'
            return new ColdFluHistoryModule(context, moduleconfigoverride, handler, new ColdFluFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName.COLD_FLU_HERO_MODULE, ColdFluModuleViewedAttribute.COLD_FLU_HERO, localyticshandler, handler));

        case 2: // '\002'
            return new AdModule(context, moduleconfigoverride, handler, new MainFeedAdLocalyticsModuleHandler(LocalyticsHandler.getInstance()));
        }
_L3:
        if (moduleconfig.equals("cold_flu_hero"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (moduleconfig.equals("cold_flu_history"))
        {
            byte0 = 1;
        }
          goto _L5
        if (moduleconfig.equals("AdModule"))
        {
            byte0 = 2;
        }
          goto _L5
    }
}
