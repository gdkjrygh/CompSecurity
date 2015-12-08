// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import com.weather.util.config.ConfigException;
import com.weather.util.config.ConfigParser;
import org.json.JSONException;

// Referenced classes of package com.weather.ads2.config:
//            FactualConfig

public class FactualConfigParser
    implements ConfigParser
{

    public FactualConfigParser()
    {
    }

    public FactualConfig parse(String s)
        throws ConfigException
    {
        try
        {
            s = new FactualConfig(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ConfigException("Unable to parse factual config", s);
        }
        return s;
    }

    public volatile Object parse(String s)
        throws ConfigException
    {
        return parse(s);
    }
}
