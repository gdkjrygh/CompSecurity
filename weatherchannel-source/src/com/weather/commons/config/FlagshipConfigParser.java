// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.weather.dal2.TwcDataServer;
import com.weather.util.config.ConfigException;
import com.weather.util.config.ConfigParser;
import com.weather.util.parsing.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.config:
//            FlagshipConfig

public class FlagshipConfigParser
    implements ConfigParser
{

    public FlagshipConfigParser()
    {
    }

    public FlagshipConfig parse(String s)
        throws ConfigException
    {
        s = new FlagshipConfig(new JSONObject(s), TwcDataServer.getApiKey());
        return s;
        s;
_L2:
        throw new ConfigException("Invalid flagship config", s);
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile Object parse(String s)
        throws ConfigException
    {
        return parse(s);
    }
}
