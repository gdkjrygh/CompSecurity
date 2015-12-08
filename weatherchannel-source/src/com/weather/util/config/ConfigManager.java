// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;

import android.content.Context;
import android.net.TrafficStats;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;
import com.weather.util.prefs.Prefs;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.weather.util.config:
//            ConfigException, DefaultConfigLoader, ConfigFileSettings, ConfigParser

public class ConfigManager
{
    public static final class Builder
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
            return new ConfigManager(configparser, prefs, enum, context1, defaultConfigResourceId, settings, contentType);
        }

        public Builder setConfigStoreKey(Enum enum)
        {
            configStoreKey = (Enum)Preconditions.checkNotNull(enum);
            return this;
        }

        public Builder setContentType(String s)
        {
            contentType = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public Builder setContext(Context context1)
        {
            context = (Context)Preconditions.checkNotNull(context1);
            return this;
        }

        public Builder setDefaultConfigResourceId(int i)
        {
            defaultConfigResourceId = i;
            defaultConfigResourceIdSet = true;
            return this;
        }

        public Builder setParser(ConfigParser configparser)
        {
            parser = (ConfigParser)Preconditions.checkNotNull(configparser);
            return this;
        }

        public Builder setPreferences(Prefs prefs)
        {
            preferences = (Prefs)Preconditions.checkNotNull(prefs);
            return this;
        }

        public Builder setSettings(ConfigFileSettings configfilesettings)
        {
            settings = (ConfigFileSettings)Preconditions.checkNotNull(configfilesettings);
            return this;
        }

        public Builder()
        {
            contentType = "application/json";
        }
    }


    private static final String TAG = "ConfigManager";
    private final AtomicReference configObject;
    private final Enum configStoreKey;
    private final String contentType;
    private final Context context;
    private final int defaultConfigResourceId;
    private final ConfigParser parser;
    private final Prefs preferences;
    public final ConfigFileSettings settings;

    private ConfigManager(ConfigParser configparser, Prefs prefs, Enum enum, Context context1, int i, ConfigFileSettings configfilesettings, String s)
    {
        configObject = new AtomicReference();
        parser = configparser;
        preferences = prefs;
        configStoreKey = enum;
        context = context1;
        defaultConfigResourceId = i;
        settings = configfilesettings;
        contentType = s;
    }


    public static Builder builder()
    {
        return new Builder();
    }

    private String getRemoteConfiguration(URL url)
    {
        HttpRequest httprequest;
        HttpRequest httprequest1;
        TrafficStats.setThreadStatsTag(57345);
        httprequest1 = null;
        httprequest = null;
        HttpRequest httprequest2 = HttpRequest.get(url);
        httprequest = httprequest2;
        httprequest1 = httprequest2;
        httprequest2.acceptCharset("UTF-8").accept(contentType).acceptGzipEncoding().uncompress(true);
        httprequest = httprequest2;
        httprequest1 = httprequest2;
        String s = httprequest2.body();
        com.weather.util.net.HttpRequest.HttpRequestException httprequestexception1;
        if (httprequest2 != null)
        {
            try
            {
                httprequest2.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (URL url) { }
        }
        TrafficStats.clearThreadStatsTag();
        return s;
        httprequestexception1;
        httprequest1 = httprequest;
        Log.w("ConfigManager", (new StringBuilder()).append("getRemoteConfiguration failed with exception. location=").append(url).append(", e=").append(httprequestexception1.getClass().getSimpleName()).append(':').append(httprequestexception1.getMessage()).toString());
        if (httprequest != null)
        {
            try
            {
                httprequest.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (URL url) { }
        }
        TrafficStats.clearThreadStatsTag();
        return "";
        url;
        if (httprequest1 != null)
        {
            try
            {
                httprequest1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw url;
    }

    private void saveConfiguration(String s)
    {
        if (!s.equals(preferences.getString(configStoreKey, "")))
        {
            preferences.putString(configStoreKey, s);
        }
    }

    public Object getConfig()
        throws ConfigException
    {
        Object obj = configObject.get();
        if (obj != null)
        {
            return obj;
        } else
        {
            Object obj1 = (new DefaultConfigLoader(parser, preferences, configStoreKey, context, defaultConfigResourceId)).load();
            configObject.compareAndSet(null, obj1);
            return configObject.get();
        }
    }

    public void updateConfig()
    {
        if (!LogUtil.isLoggable(LoggingMetaTags.TWC_NO_REMOTE_CONFIG, 2)) goto _L2; else goto _L1
_L1:
        LogUtil.v("ConfigManager", LoggingMetaTags.TWC_NO_REMOTE_CONFIG, "Remote configs suppressed, configStoreKey=%s, %s is set to VERBOSE", new Object[] {
            configStoreKey, LoggingMetaTags.TWC_NO_REMOTE_CONFIG
        });
_L4:
        return;
_L2:
        if (settings.remoteResourceLocation == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        String s = getRemoteConfiguration(settings.remoteResourceLocation);
        if (Strings.isNullOrEmpty(s)) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = parser.parse(s);
        if (!settings.updateImmediately)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        configObject.set(obj);
_L5:
        Exception exception;
        Log.i("ConfigManager", (new StringBuilder()).append("Updated config for configStoreKey=").append(configStoreKey).append(" from ").append(settings.remoteResourceLocation).toString());
        saveConfiguration(s);
        return;
        try
        {
            configObject.compareAndSet(null, obj);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Log.e("ConfigManager", (new StringBuilder()).append("Error retrieving configuration from remote location=").append(settings.remoteResourceLocation).toString(), exception);
            return;
        }
          goto _L5
        Log.i("ConfigManager", (new StringBuilder()).append("No remote config loaded, no remoteResourceLocation for configStoreKey=").append(configStoreKey).toString());
        return;
    }
}
