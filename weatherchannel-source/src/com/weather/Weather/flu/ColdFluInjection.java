// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.flu;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.feed.FeedAdConfig;
import com.weather.Weather.feed.ModulesFactory;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.ModulesConfig;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.Weather.flu:
//            ColdFluModuleFactory

public class ColdFluInjection
{

    public ColdFluInjection()
    {
    }

    public Supplier provideAdConfigSupplier()
    {
        return new Supplier() {

            final ColdFluInjection this$0;

            public FeedAdConfig get()
            {
                return new FeedAdConfig(100, 100, ImmutableList.of());
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = ColdFluInjection.this;
                super();
            }
        };
    }

    public Supplier provideModulesConfigProvider()
    {
        return new Supplier() {

            final ColdFluInjection this$0;

            public ModulesConfig get()
            {
                ModulesConfig modulesconfig;
                try
                {
                    modulesconfig = ConfigurationManagers.getInstance().getColdFluModulesConfig();
                }
                catch (ConfigException configexception)
                {
                    throw new IllegalStateException("Cold and Flu not configured yet", configexception);
                }
                return modulesconfig;
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = ColdFluInjection.this;
                super();
            }
        };
    }

    public ModulesFactory provideModulesFactory()
    {
        return new ColdFluModuleFactory();
    }
}
