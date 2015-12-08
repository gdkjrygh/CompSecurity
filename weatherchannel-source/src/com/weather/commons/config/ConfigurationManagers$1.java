// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.weather.util.config.ConfigManager;

// Referenced classes of package com.weather.commons.config:
//            ConfigurationManagers

static final class val.manager
    implements Runnable
{

    final ConfigManager val$manager;

    public void run()
    {
        val$manager.updateConfig();
    }

    (ConfigManager configmanager)
    {
        val$manager = configmanager;
        super();
    }
}
