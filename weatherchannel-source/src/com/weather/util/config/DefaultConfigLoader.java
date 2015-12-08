// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;

import android.content.Context;
import android.util.Log;
import com.google.common.base.Strings;
import com.weather.util.io.IOUtil;
import com.weather.util.prefs.Prefs;

// Referenced classes of package com.weather.util.config:
//            ConfigException, ConfigParser

public class DefaultConfigLoader
{

    private static final String TAG = "DefaultConfigLoader";
    private final Enum configStoreKey;
    private final Context context;
    private final int defaultConfigResourceId;
    private final ConfigParser parser;
    private final Prefs preferences;

    public DefaultConfigLoader(ConfigParser configparser, Prefs prefs, Enum enum, Context context1, int i)
    {
        parser = configparser;
        preferences = prefs;
        configStoreKey = enum;
        context = context1;
        defaultConfigResourceId = i;
    }

    private Object getConfigFromDefault()
        throws ConfigException
    {
        String s = IOUtil.getStringFromFile(context, defaultConfigResourceId);
        if (Strings.isNullOrEmpty(s))
        {
            throw new ConfigException((new StringBuilder()).append("Unable to load default config file. context=").append(context).append(", defaultConfigResourceId=").append(defaultConfigResourceId).toString());
        } else
        {
            return parser.parse(s);
        }
    }

    private Object getConfigFromPreferences()
    {
        Object obj = preferences.getString(configStoreKey, "");
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            return null;
        }
        try
        {
            obj = parser.parse(((String) (obj)));
        }
        catch (ClassCastException classcastexception)
        {
            Log.w("DefaultConfigLoader", "Error parsing previous config file", classcastexception);
            return null;
        }
        catch (ConfigException configexception)
        {
            Log.w("DefaultConfigLoader", "Error parsing previous config file", configexception);
            return null;
        }
        return obj;
    }

    public Object load()
        throws ConfigException
    {
        Object obj1 = getConfigFromPreferences();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = getConfigFromDefault();
        }
        return obj;
    }
}
