// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

// Referenced classes of package com.weather.util.config:
//            ConfigParser, ConfigException

public class PropertiesParser
    implements ConfigParser
{

    public static final PropertiesParser INSTANCE = new PropertiesParser();

    private PropertiesParser()
    {
    }

    public volatile Object parse(String s)
        throws ConfigException
    {
        return parse(s);
    }

    public Properties parse(String s)
        throws ConfigException
    {
        Properties properties;
        properties = new Properties();
        properties.load(new StringReader(s));
        return properties;
        s;
_L2:
        throw new ConfigException("Unable to parse properties", s);
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
