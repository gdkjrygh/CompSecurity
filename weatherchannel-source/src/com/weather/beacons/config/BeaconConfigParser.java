// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.config;

import com.weather.util.config.ConfigException;
import com.weather.util.config.ConfigParser;
import org.json.JSONException;

// Referenced classes of package com.weather.beacons.config:
//            BeaconConfig

public class BeaconConfigParser
    implements ConfigParser
{

    public BeaconConfigParser()
    {
    }

    public BeaconConfig parse(String s)
        throws ConfigException
    {
        try
        {
            s = new BeaconConfig(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ConfigException("Invalid BeaconConfig", s);
        }
        return s;
    }

    public volatile Object parse(String s)
        throws ConfigException
    {
        return parse(s);
    }
}
