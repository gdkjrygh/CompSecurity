// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.config;

import com.google.common.base.Preconditions;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.dal2.config:
//            DalConfigProvider, DalConfig

public class DalConfigManager
{

    public static final DalConfigManager INSTANCE = new DalConfigManager();
    private volatile DalConfigProvider dalConfigProvider;

    public DalConfigManager()
    {
    }

    private void checkInitializationState()
        throws ConfigException
    {
        if (dalConfigProvider == null)
        {
            throw new ConfigException("System not setup to retrieve DAL configurations");
        } else
        {
            return;
        }
    }

    public DalConfig getDalConfig()
    {
        DalConfig dalconfig;
        try
        {
            checkInitializationState();
            dalconfig = dalConfigProvider.getDalConfig();
        }
        catch (ConfigException configexception)
        {
            return new DalConfig();
        }
        return dalconfig;
    }

    public void setDalConfigProvider(DalConfigProvider dalconfigprovider)
    {
        dalConfigProvider = (DalConfigProvider)Preconditions.checkNotNull(dalconfigprovider);
    }

}
