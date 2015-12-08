// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.ui;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import com.weather.util.app.AbstractTwcApplication;
import com.wsi.android.framework.settings.ConfigurationManager;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.ui.utils.ApplicationFacilities;
import com.wsi.android.framework.ui.utils.ServerActivityIndicator;
import com.wsi.android.framework.ui.utils.UnitsConvertor;
import com.wsi.android.framework.wxdata.geodata.controller.GeoFeaturesPool;
import com.wsi.android.framework.wxdata.tiles.tessera.TileMapsPool;
import com.wsi.android.framework.wxdata.utils.IOUtils;
import com.wsi.android.framework.wxdata.utils.tessera.tessera30.settings.TesseraLayerSettingsPool;
import com.wsi.android.weather.utils.DataLayerAccessor;
import com.wsi.android.weather.utils.InitializationGuardian;
import com.wsi.android.weather.utils.settings.MapSettingsAccessor;
import com.wsi.android.weather.utils.settings.Tessera;

public class MapApplication extends AbstractTwcApplication
{

    private static String appName;
    private static String appVersion;
    protected final String TAG = getClass().getSimpleName();
    private ConfigurationManager configManager;
    private DataLayerAccessor dataLayerAccessor;
    private GeoFeaturesPool geoFeaturesPool;
    private InitializationGuardian initGuardian;
    private TesseraLayerSettingsPool tesseraLayerSettingsPool;
    private TileMapsPool tileMapsPool;

    public MapApplication()
    {
    }

    protected InitializationGuardian createAppInitializationGuardian()
    {
        return new InitializationGuardian(this);
    }

    public String getAppName()
    {
        this;
        JVM INSTR monitorenter ;
        if (appName != null) goto _L2; else goto _L1
_L1:
        Object obj = getPackageManager().getApplicationLabel(getApplicationInfo());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj = ((CharSequence) (obj)).toString();
_L3:
        appName = ((String) (obj));
_L2:
        obj = appName;
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        obj = "";
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }

    public String getAppVersion()
    {
        if (appVersion == null)
        {
            appVersion = "";
            try
            {
                appVersion = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Log.e(TAG, "Cannot get the application version info", namenotfoundexception);
            }
        }
        return appVersion;
    }

    public ConfigurationManager getConfigManager()
    {
        return configManager;
    }

    public DataLayerAccessor getDataLayerAccessor()
    {
        return dataLayerAccessor;
    }

    public GeoFeaturesPool getGeoFeaturesPool()
    {
        if (geoFeaturesPool == null)
        {
            geoFeaturesPool = new GeoFeaturesPool(getSettingsAccessor().getTesseraConfiguration().getVersion().getGeoFeaturesPoolSize());
        }
        return geoFeaturesPool;
    }

    public InitializationGuardian getInitGuardian()
    {
        return initGuardian;
    }

    public MapSettingsAccessor getSettingsAccessor()
    {
        return configManager.getSettingsAccessor();
    }

    public TesseraLayerSettingsPool getTesseraLayerSettingsPool()
    {
        if (tesseraLayerSettingsPool == null)
        {
            tesseraLayerSettingsPool = new TesseraLayerSettingsPool(getSettingsAccessor().getTesseraConfiguration().getVersion().getTesseraLayerSettingsPoolSize());
        }
        return tesseraLayerSettingsPool;
    }

    public TileMapsPool getTileMapsPool()
    {
        if (tileMapsPool == null)
        {
            tileMapsPool = new TileMapsPool(getSettingsAccessor().getTesseraConfiguration().getVersion().getTileMapsPoolSize());
        }
        return tileMapsPool;
    }

    public void onCreate()
    {
        Context context = getApplicationContext();
        onPreApplicationCreate();
        super.onCreate();
        IOUtils.init(context);
        ApplicationFacilities.getInstance().setServerActivityIndicator(new ServerActivityIndicator(this, getAppName(), getString(com.wsi.android.weather.R.string.downloading_layer_tiles_status_mes), getString(com.wsi.android.weather.R.string.receiving_weather_data_status_mes), getString(com.wsi.android.weather.R.string.updating_geo_overlay_data_status_mes)));
        UnitsConvertor.setScreenDensity(context.getResources().getDisplayMetrics().density);
        initGuardian = createAppInitializationGuardian();
        initGuardian.attemptInit();
    }

    protected void onPreApplicationCreate()
    {
        ConfigInfo.updateDebugState(getApplicationContext().getApplicationInfo());
    }

    public void setConfigManager(ConfigurationManager configurationmanager)
    {
        configManager = configurationmanager;
    }

    public void setDataLayerAccessor(DataLayerAccessor datalayeraccessor)
    {
        dataLayerAccessor = datalayeraccessor;
    }
}
