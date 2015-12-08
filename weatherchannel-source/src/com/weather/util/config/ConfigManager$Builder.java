// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;

import android.content.Context;
import com.google.common.base.Preconditions;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.prefs.Prefs;

// Referenced classes of package com.weather.util.config:
//            ConfigManager, ConfigParser, ConfigFileSettings

public static final class contentType
{

    private Enum configStoreKey;
    private String contentType;
    private Context context;
    private int defaultConfigResourceId;
    private boolean defaultConfigResourceIdSet;
    private ConfigParser parser;
    private Prefs preferences;
    private ConfigFileSettings settings;

    public ConfigManager build()
    {
        boolean flag1 = true;
        Context context1;
        ConfigParser configparser;
        Prefs prefs;
        Enum enum;
        boolean flag;
        if (settings != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Settings is a required parameter");
        Preconditions.checkState(defaultConfigResourceIdSet, "DefaultConfigResourceId is a required parameter");
        if (preferences != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Preferences is a required parameter");
        if (configStoreKey != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "ConfigStoreKey is a required parameter");
        if (parser != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Parser is a required parameter");
        configparser = parser;
        prefs = preferences;
        enum = configStoreKey;
        if (context == null)
        {
            context1 = AbstractTwcApplication.getRootContext();
        } else
        {
            context1 = context;
        }
        return new ConfigManager(configparser, prefs, enum, context1, defaultConfigResourceId, settings, contentType, null);
    }

    public contentType setConfigStoreKey(Enum enum)
    {
        configStoreKey = (Enum)Preconditions.checkNotNull(enum);
        return this;
    }

    public ull setContentType(String s)
    {
        contentType = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public ull setContext(Context context1)
    {
        context = (Context)Preconditions.checkNotNull(context1);
        return this;
    }

    public ull setDefaultConfigResourceId(int i)
    {
        defaultConfigResourceId = i;
        defaultConfigResourceIdSet = true;
        return this;
    }

    public defaultConfigResourceIdSet setParser(ConfigParser configparser)
    {
        parser = (ConfigParser)Preconditions.checkNotNull(configparser);
        return this;
    }

    public ull setPreferences(Prefs prefs)
    {
        preferences = (Prefs)Preconditions.checkNotNull(prefs);
        return this;
    }

    public ull setSettings(ConfigFileSettings configfilesettings)
    {
        settings = (ConfigFileSettings)Preconditions.checkNotNull(configfilesettings);
        return this;
    }

    public ()
    {
        contentType = "application/json";
    }
}
