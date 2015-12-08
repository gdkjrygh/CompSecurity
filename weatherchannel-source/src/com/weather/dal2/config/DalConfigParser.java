// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.config;

import com.weather.util.config.ConfigException;
import com.weather.util.config.ConfigParser;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.config:
//            DalConfig

public class DalConfigParser
    implements ConfigParser
{

    public DalConfigParser()
    {
    }

    public DalConfig parse(String s)
        throws ConfigException
    {
        try
        {
            s = new DalConfig(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ConfigException("Invalid DalConfig", s);
        }
        return s;
    }

    public volatile Object parse(String s)
        throws ConfigException
    {
        return parse(s);
    }
}
