// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.weather.commons.config.ConfigurationManagers;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.commons.video2:
//            RangedQuery

public interface RangedQueryUrlBuilder
{

    public abstract String getUrl(RangedQuery rangedquery, ConfigurationManagers configurationmanagers)
        throws ConfigException;
}
