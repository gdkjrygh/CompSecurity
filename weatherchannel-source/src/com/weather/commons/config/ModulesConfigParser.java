// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.weather.util.config.ConfigException;
import com.weather.util.config.ConfigParser;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.config:
//            ModulesConfig

public class ModulesConfigParser
    implements ConfigParser
{

    public ModulesConfigParser()
    {
    }

    public ModulesConfig parse(String s)
        throws ConfigException
    {
        try
        {
            s = new ModulesConfig(new JSONObject(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ConfigException("Invalid modules config", s);
        }
        return s;
    }

    public volatile Object parse(String s)
        throws ConfigException
    {
        return parse(s);
    }
}
