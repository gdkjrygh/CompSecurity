// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.settings;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.ui.utils.ResourceUtils;
import com.wsi.android.weather.ui.MapApplication;
import com.wsi.android.weather.utils.settings.AppSettings;
import com.wsi.android.weather.utils.settings.MapSettingsAccessor;
import com.wsi.android.weather.utils.settings.MapSkinSettings;
import com.wsi.android.weather.utils.settings.WarningStyleSettings;
import java.io.FileNotFoundException;
import org.xmlpull.v1.XmlPullParserException;

public class ConfigurationManager
{

    private static final String APP_CONFIG_RES_NAME = "app_config";
    protected static final String KEY_BUNDLE_CONFIG_UPDATE = "bundle_config_updated";
    private static final String SKIN_RES_NAME = "skin";
    protected final String TAG = getClass().getSimpleName();
    protected MapApplication mapApp;
    protected MapSettingsAccessor settingsAccessor;

    public ConfigurationManager(MapApplication mapapplication)
    {
        mapApp = mapapplication;
    }

    private void checkResourceId(int i, String s)
    {
        if (-1 == i)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    private MapSkinSettings createSkinSettingsFromXmlConfig()
    {
        int i = getSkinSettingsResourceId();
        checkResourceId(i, "invalid configuration: invalid skin.xml");
        MapSkinSettings mapskinsettings;
        try
        {
            mapskinsettings = createSkinSettings(i);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            if (ConfigInfo.DEBUG)
            {
                Log.e(TAG, "Failed to find the skin config XML.", notfoundexception);
            }
            return null;
        }
        return mapskinsettings;
    }

    private WarningStyleSettings createWarningStyleSettings()
    {
        return new WarningStyleSettings();
    }

    private void initialyReadApplicationSettings()
    {
        AppSettings appsettings = createAppSettingsFromMasterConfig();
        if (updateAppConfigFromBundleFile(appsettings, getOverrideConfigInternalFileName()))
        {
            if (isBundleConfigUpdated())
            {
                setShowConfigUpdateMessage(true);
                setBundleConfigUpdated(false);
            }
        } else
        {
            updateAppConfigFromDefaultResource(appsettings);
        }
        appsettings.checkTesseraInitialized();
        appsettings.initRasterLayers();
        validateAppConfig(appsettings);
        settingsAccessor.setAppSettings(appsettings);
    }

    private boolean updateAppConfigFromDefaultResource(AppSettings appsettings)
    {
        int i = getAppConfigDefautResourceId();
        checkResourceId(i, "app_config.xml is missing");
        try
        {
            appsettings.updateSettingsFromXmlResource(i);
        }
        // Misplaced declaration of an exception variable
        catch (AppSettings appsettings)
        {
            return false;
        }
        return true;
    }

    protected AppSettings createAppSettings(int i)
        throws android.content.res.Resources.NotFoundException, XmlPullParserException
    {
        return new AppSettings(i, mapApp);
    }

    protected AppSettings createAppSettingsFromMasterConfig()
    {
        AppSettings appsettings = createAppSettings(com.wsi.android.weather.R.raw.master_config);
        return appsettings;
        Object obj;
        obj;
        if (ConfigInfo.DEBUG)
        {
            Log.e(TAG, "Failed to find the application master config XML.", ((Throwable) (obj)));
        }
_L2:
        return null;
        obj;
        if (ConfigInfo.DEBUG)
        {
            Log.e(TAG, "Failed to parse the application master config XML.", ((Throwable) (obj)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected MapSettingsAccessor createSettingsAccessor(MapSkinSettings mapskinsettings, WarningStyleSettings warningstylesettings)
    {
        return new MapSettingsAccessor(mapApp, mapskinsettings, warningstylesettings);
    }

    protected MapSkinSettings createSkinSettings(int i)
    {
        return new MapSkinSettings(i, mapApp);
    }

    protected int getAppConfigDefautResourceId()
    {
        return ResourceUtils.getResourceId(com/wsi/android/weather/R$raw, "app_config", -1);
    }

    protected String getOverrideConfigInternalFileName()
    {
        return (new StringBuilder()).append("bundle_app_config_").append(mapApp.getAppVersion()).append(".xml").toString();
    }

    public MapSettingsAccessor getSettingsAccessor()
    {
        return settingsAccessor;
    }

    protected int getSkinSettingsResourceId()
    {
        return ResourceUtils.getResourceId(com/wsi/android/weather/R$raw, "skin", -1);
    }

    public void initApplicationAndSkinSettings()
    {
        MapSkinSettings mapskinsettings = createSkinSettingsFromXmlConfig();
        if (mapskinsettings == null)
        {
            throw new IllegalStateException("invalid configuration: invalid skin.xml");
        }
        WarningStyleSettings warningstylesettings = createWarningStyleSettings();
        if (warningstylesettings == null)
        {
            throw new IllegalStateException("invalid configuration: invalid WnW styles xml");
        } else
        {
            settingsAccessor = createSettingsAccessor(mapskinsettings, warningstylesettings);
            initialyReadApplicationSettings();
            return;
        }
    }

    protected boolean isBundleConfigUpdated()
    {
        return PreferenceManager.getDefaultSharedPreferences(mapApp).getBoolean("bundle_config_updated", false);
    }

    protected void setBundleConfigUpdated(boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(mapApp).edit().putBoolean("bundle_config_updated", flag).commit();
    }

    protected void setShowConfigUpdateMessage(boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(mapApp).edit().putBoolean(mapApp.getString(com.wsi.android.weather.R.string.show_conf_update_message_prefs_key), flag).commit();
    }

    public void stop()
    {
    }

    protected boolean updateAppConfigFromBundleFile(AppSettings appsettings, String s)
    {
        appsettings.updateSettingsFromXmlFile(s);
        return true;
        appsettings;
        if (ConfigInfo.DEBUG)
        {
            Log.e(TAG, "Failed to parse the alternative configuration file stored to the internal memory.", appsettings);
        }
_L2:
        return false;
        appsettings;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void validateAppConfig(AppSettings appsettings)
    {
        if (appsettings == null)
        {
            throw new IllegalStateException("invalid configuration: invalid app_config.xml");
        } else
        {
            return;
        }
    }
}
