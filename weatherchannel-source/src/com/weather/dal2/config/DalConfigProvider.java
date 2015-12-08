// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.config;

import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.dal2.config:
//            DalConfig

public interface DalConfigProvider
{

    public abstract DalConfig getDalConfig()
        throws ConfigException;
}
