// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.common.collect.ImmutableList;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.config.ModulesConfig;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.Weather.feed:
//            Module

public abstract class ModulesFactory
{

    private final String TAG = getClass().getSimpleName();

    public ModulesFactory()
    {
    }

    private boolean hasDDIModule(ModulesConfig modulesconfig)
    {
        for (modulesconfig = modulesconfig.moduleConfigs.iterator(); modulesconfig.hasNext();)
        {
            if ("driving-difficulty".equals(((ModuleConfig)modulesconfig.next()).id))
            {
                return true;
            }
        }

        return false;
    }

    public abstract Module makeModule(Context context, Handler handler, ModuleConfig moduleconfig, ModulesManager.ModuleConfigOverride moduleconfigoverride);

    public List makeModules(Context context, Handler handler, ModulesConfig modulesconfig, ModulesManager.ModuleConfigOverride moduleconfigoverride)
    {
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        boolean flag = hasDDIModule(modulesconfig);
        modulesconfig = modulesconfig.moduleConfigs.iterator();
        do
        {
            if (!modulesconfig.hasNext())
            {
                break;
            }
            ModuleConfig moduleconfig = (ModuleConfig)modulesconfig.next();
            Module module = makeModule(context, handler, moduleconfig, moduleconfigoverride);
            if (module != null)
            {
                if (flag)
                {
                    if (!"map".equals(moduleconfig.id))
                    {
                        LogUtil.d(TAG, LoggingMetaTags.TWC_UI, "makeModules module.id=%s, moduleConfig=%s, configOverride=%s", new Object[] {
                            module.getId(), moduleconfig, moduleconfigoverride
                        });
                        builder.add(module);
                    }
                } else
                {
                    LogUtil.d(TAG, LoggingMetaTags.TWC_UI, "makeModules module.id=%s, moduleConfig=%s, configOverride=%s", new Object[] {
                        module.getId(), moduleconfig, moduleconfigoverride
                    });
                    builder.add(module);
                }
            } else
            {
                Log.w(TAG, (new StringBuilder()).append("Module ").append(moduleconfig.id).append(" is of unknown type and will be skipped").toString());
            }
        } while (true);
        return builder.build();
    }
}
