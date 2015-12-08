// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.content.Context;
import android.os.Handler;
import com.weather.commons.config.ModuleConfig;
import dagger.ObjectGraph;

// Referenced classes of package com.weather.Weather.feed:
//            ModulesFactory, Module

public class InjectModuleFactory extends ModulesFactory
{

    private final ModulesFactory factoryDelegate;
    private final ObjectGraph objectGraph;

    public InjectModuleFactory(ModulesFactory modulesfactory, ObjectGraph objectgraph)
    {
        factoryDelegate = modulesfactory;
        objectGraph = objectgraph;
    }

    public Module makeModule(Context context, Handler handler, ModuleConfig moduleconfig, ModulesManager.ModuleConfigOverride moduleconfigoverride)
    {
        context = factoryDelegate.makeModule(context, handler, moduleconfig, moduleconfigoverride);
        if (context != null)
        {
            try
            {
                objectGraph.inject(context);
            }
            // Misplaced declaration of an exception variable
            catch (Handler handler)
            {
                return context;
            }
        }
        return context;
    }
}
