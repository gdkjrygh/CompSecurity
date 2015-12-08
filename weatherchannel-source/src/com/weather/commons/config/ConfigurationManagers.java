// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.ads.AdSize;
import com.google.common.base.Preconditions;
import com.weather.ads2.config.AdConfig;
import com.weather.ads2.config.AdConfigParser;
import com.weather.ads2.config.AdConfigProvider;
import com.weather.ads2.config.FactualConfig;
import com.weather.ads2.config.FactualConfigParser;
import com.weather.beacons.config.BeaconConfig;
import com.weather.beacons.config.BeaconConfigParser;
import com.weather.dal2.config.DalConfig;
import com.weather.dal2.config.DalConfigParser;
import com.weather.dal2.config.DalConfigProvider;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.config.ConfigException;
import com.weather.util.config.ConfigFileSettings;
import com.weather.util.config.ConfigFiles;
import com.weather.util.config.ConfigManager;
import com.weather.util.config.DefaultConfigLoader;
import com.weather.util.config.PropertiesParser;
import com.weather.util.intent.MimeType;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.EnumMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.commons.config:
//            ConfigPrefs, ModulesConfigParser, FlagshipConfigParser, LayersConfigParser, 
//            ConfigRefreshBroadcastReceiver, ActivitiesConfig, ModulesConfig, FlagshipConfig, 
//            LayersConfig

public class ConfigurationManagers
    implements AdConfigProvider, DalConfigProvider
{
    public static class AlarmScheduler
    {

        public void cancel(Intent intent, int i, Context context, AlarmManager alarmmanager)
        {
            alarmmanager.cancel(PendingIntent.getBroadcast(context, i, intent, 0));
        }

        public void restartRepeating(Intent intent, int i, long l, Context context, AlarmManager alarmmanager)
        {
            intent = PendingIntent.getBroadcast(context, i, intent, 0);
            alarmmanager.cancel(intent);
            alarmmanager.setInexactRepeating(3, SystemClock.elapsedRealtime() + l, l, intent);
        }

        public AlarmScheduler()
        {
        }
    }


    private static final String ADS_CONFIG = "ads";
    private static final String ADS_TEST_CONFIG = "ads_test";
    private static final String ALLERGY_MODULE_CONFIG = "allergyModules";
    private static final String APPRATING_CONFIG = "appRating";
    private static final String BEACONS_CONFIG = "beacons";
    private static final String COLD_FLU_MODULE_CONFIG = "coldFluModules";
    private static final String DAL_CONFIG = "dal";
    private static final String FACTUAL_CONFIG = "factual";
    private static final String FILES_CONFIG = "configFiles";
    private static final String FLAGSHIP_CONFIG = "flagship";
    private static final String HURRICANE_CENTRAL_MODULE_CONFIG = "hurricaneModules";
    private static final ConfigurationManagers INSTANCE = create();
    private static final String LAYERS_CONFIG = "layersMashup";
    private static final String MODULE_CONFIG = "modules";
    private static final String TAG = "ConfigurationManagers";
    private volatile ConfigManager adConfigManager;
    private final ConfigManager adProdConfigManager;
    private final ConfigManager adTestConfigManager;
    private final AlarmScheduler alarmScheduler;
    private final ConfigManager allergyModulesManager;
    private final ConfigManager appRatingConfigManager;
    private final ConfigManager beaconConfigManager;
    private final ConfigManager coldFluModulesManager;
    private final ConfigManager configFilesConfigManager;
    private final ConfigManager dalConfigManager;
    private final ConfigManager factualConfigManager;
    private final ConfigManager flagshipConfigManager;
    private final ConfigManager hurricaneCentralModuleManager;
    private final ConfigManager layersConfigManager;
    private final Map managerMap = new EnumMap(com/weather/commons/config/ConfigPrefs$Keys);
    private final ConfigManager modulesConfigManager;
    private final Prefs twcPrefs;

    ConfigurationManagers(Prefs prefs, AlarmScheduler alarmscheduler, Context context, Prefs prefs1)
        throws ConfigException
    {
        alarmScheduler = alarmscheduler;
        twcPrefs = prefs1;
        boolean flag = prefs1.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.TEST_MODE, false);
        boolean flag1 = prefs1.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.QA_CONFIG_ENABLED, false);
        int i;
        if (flag && flag1)
        {
            i = com.weather.commons.R.raw.config_files_test;
        } else
        {
            i = com.weather.commons.R.raw.config_files;
        }
        alarmscheduler = (ConfigFiles)(new DefaultConfigLoader(ConfigFiles.PARSER, prefs, ConfigPrefs.Keys.CONFIG_FILE_CONFIG, context, i)).load();
        configFilesConfigManager = buildConfigFilesConfigManager(alarmscheduler, prefs, context);
        modulesConfigManager = buildModulesConfigManager(alarmscheduler, prefs, context);
        hurricaneCentralModuleManager = buildHurricaneModulesConfigManager(alarmscheduler, prefs, context);
        allergyModulesManager = buildAllergyModulesConfigManager(alarmscheduler, prefs, context);
        coldFluModulesManager = buildColdFluModulesConfigManager(alarmscheduler, prefs, context);
        appRatingConfigManager = buildAppRatingConfigManager(alarmscheduler, prefs, context);
        adProdConfigManager = buildAdProdConfigManager(alarmscheduler);
        adTestConfigManager = buildAdTestConfigManager(alarmscheduler);
        dalConfigManager = buildDalConfigManager(alarmscheduler);
        factualConfigManager = buildFactualConfigManager(alarmscheduler);
        flagshipConfigManager = buildFlagshipConfigManager(alarmscheduler, prefs, context);
        beaconConfigManager = buildBeaconConfigManager(alarmscheduler, prefs, context);
        layersConfigManager = buildLayersConfigManager(alarmscheduler, prefs, context);
        managerMap.put(ConfigPrefs.Keys.CONFIG_FILE_CONFIG, configFilesConfigManager);
        managerMap.put(ConfigPrefs.Keys.MODULE_CONFIG, modulesConfigManager);
        managerMap.put(ConfigPrefs.Keys.HURRICANE_MODULE_CONFIG, hurricaneCentralModuleManager);
        managerMap.put(ConfigPrefs.Keys.ALLERGY_MODULE_CONFIG, allergyModulesManager);
        managerMap.put(ConfigPrefs.Keys.COLD_FLU_MODULE_CONFIG, coldFluModulesManager);
        managerMap.put(ConfigPrefs.Keys.APP_RATING_CONFIG, appRatingConfigManager);
        managerMap.put(ConfigPrefs.Keys.AD_CONFIG, adProdConfigManager);
        managerMap.put(ConfigPrefs.Keys.AD_TEST_CONFIG, adTestConfigManager);
        managerMap.put(ConfigPrefs.Keys.DAL_CONFIG, dalConfigManager);
        managerMap.put(ConfigPrefs.Keys.FACTUAL_CONFIG, factualConfigManager);
        managerMap.put(ConfigPrefs.Keys.FLAGSHIP_CONFIG, flagshipConfigManager);
        managerMap.put(ConfigPrefs.Keys.BEACON_CONFIG, beaconConfigManager);
        managerMap.put(ConfigPrefs.Keys.LAYERS_CONFIG, layersConfigManager);
        flag1 = prefs1.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.AD_TEST_ENABLED, false);
        if (flag && flag1)
        {
            prefs = adTestConfigManager;
        } else
        {
            prefs = adProdConfigManager;
        }
        adConfigManager = prefs;
    }

    private static ConfigManager buildAdProdConfigManager(ConfigFiles configfiles)
    {
        int i = com.weather.commons.R.raw.android_ads_prod_500;
        return ConfigManager.builder().setParser(new AdConfigParser()).setPreferences(ConfigPrefs.getInstance()).setSettings(configfiles.getSettingsFor("ads")).setDefaultConfigResourceId(i).setConfigStoreKey(ConfigPrefs.Keys.AD_CONFIG).build();
    }

    private static ConfigManager buildAdTestConfigManager(ConfigFiles configfiles)
    {
        int i = com.weather.commons.R.raw.android_ads_test_500;
        return ConfigManager.builder().setParser(new AdConfigParser()).setPreferences(ConfigPrefs.getInstance()).setSettings(configfiles.getSettingsFor("ads_test")).setDefaultConfigResourceId(i).setConfigStoreKey(ConfigPrefs.Keys.AD_TEST_CONFIG).build();
    }

    private ConfigManager buildAllergyModulesConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        return ConfigManager.builder().setParser(new ModulesConfigParser()).setPreferences(prefs).setSettings(configfiles.getSettingsFor("allergyModules")).setDefaultConfigResourceId(com.weather.commons.R.raw.allergy_modules_config).setConfigStoreKey(ConfigPrefs.Keys.ALLERGY_MODULE_CONFIG).setContext(context).build();
    }

    private static ConfigManager buildAppRatingConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        return ConfigManager.builder().setParser(PropertiesParser.INSTANCE).setPreferences(prefs).setSettings(configfiles.getSettingsFor("appRating")).setDefaultConfigResourceId(com.weather.commons.R.raw.properties_app_ratings_v5).setConfigStoreKey(ConfigPrefs.Keys.APP_RATING_CONFIG).setContentType(MimeType.TEXT_PLAIN.getMimeString()).setContext(context).build();
    }

    private static ConfigManager buildBeaconConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        return ConfigManager.builder().setParser(new BeaconConfigParser()).setPreferences(prefs).setSettings(configfiles.getSettingsFor("beacons")).setDefaultConfigResourceId(com.weather.commons.R.raw.beacon_config).setConfigStoreKey(ConfigPrefs.Keys.BEACON_CONFIG).setContext(context).build();
    }

    private ConfigManager buildColdFluModulesConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        return ConfigManager.builder().setParser(new ModulesConfigParser()).setPreferences(prefs).setSettings(configfiles.getSettingsFor("coldFluModules")).setDefaultConfigResourceId(com.weather.commons.R.raw.cold_flu_modules_config).setConfigStoreKey(ConfigPrefs.Keys.COLD_FLU_MODULE_CONFIG).setContext(context).build();
    }

    private static ConfigManager buildConfigFilesConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        int i = com.weather.commons.R.raw.config_files;
        return ConfigManager.builder().setParser(ConfigFiles.PARSER).setPreferences(prefs).setSettings(configfiles.getSettingsFor("configFiles")).setDefaultConfigResourceId(i).setConfigStoreKey(ConfigPrefs.Keys.CONFIG_FILE_CONFIG).setContext(context).build();
    }

    private static ConfigManager buildDalConfigManager(ConfigFiles configfiles)
    {
        return ConfigManager.builder().setParser(new DalConfigParser()).setPreferences(ConfigPrefs.getInstance()).setSettings(configfiles.getSettingsFor("dal")).setDefaultConfigResourceId(com.weather.commons.R.raw.dal_config).setConfigStoreKey(ConfigPrefs.Keys.DAL_CONFIG).build();
    }

    private static ConfigManager buildFactualConfigManager(ConfigFiles configfiles)
    {
        return ConfigManager.builder().setParser(new FactualConfigParser()).setPreferences(ConfigPrefs.getInstance()).setSettings(configfiles.getSettingsFor("factual")).setDefaultConfigResourceId(com.weather.commons.R.raw.factual_audience_map).setConfigStoreKey(ConfigPrefs.Keys.FACTUAL_CONFIG).build();
    }

    private static ConfigManager buildFlagshipConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        return ConfigManager.builder().setParser(new FlagshipConfigParser()).setPreferences(prefs).setSettings(configfiles.getSettingsFor("flagship")).setDefaultConfigResourceId(com.weather.commons.R.raw.flagship_config).setConfigStoreKey(ConfigPrefs.Keys.FLAGSHIP_CONFIG).setContext(context).build();
    }

    private ConfigManager buildHurricaneModulesConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        return ConfigManager.builder().setParser(new ModulesConfigParser()).setPreferences(prefs).setSettings(configfiles.getSettingsFor("hurricaneModules")).setDefaultConfigResourceId(com.weather.commons.R.raw.hurricane_modules_config).setConfigStoreKey(ConfigPrefs.Keys.HURRICANE_MODULE_CONFIG).setContext(context).build();
    }

    private static ConfigManager buildLayersConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        return ConfigManager.builder().setParser(new LayersConfigParser()).setPreferences(prefs).setSettings(configfiles.getSettingsFor("layersMashup")).setDefaultConfigResourceId(com.weather.commons.R.raw.map_layers_config).setConfigStoreKey(ConfigPrefs.Keys.LAYERS_CONFIG).setContext(context).build();
    }

    private ConfigManager buildModulesConfigManager(ConfigFiles configfiles, Prefs prefs, Context context)
    {
        return ConfigManager.builder().setParser(new ModulesConfigParser()).setPreferences(prefs).setSettings(configfiles.getSettingsFor("modules")).setDefaultConfigResourceId(com.weather.commons.R.raw.modules_config).setConfigStoreKey(ConfigPrefs.Keys.MODULE_CONFIG).setContext(context).build();
    }

    private static ConfigurationManagers create()
    {
        ConfigurationManagers configurationmanagers;
        try
        {
            configurationmanagers = new ConfigurationManagers(ConfigPrefs.getInstance(), new AlarmScheduler(), AbstractTwcApplication.getRootContext(), TwcPrefs.getInstance());
        }
        catch (ConfigException configexception)
        {
            Log.e("ConfigurationManagers", "Unable to load configuration file for how to manage configuration files", configexception);
            return null;
        }
        return configurationmanagers;
    }

    private ConfigManager getConfigurationManager(ConfigPrefs.Keys keys)
    {
        ConfigManager configmanager = (ConfigManager)managerMap.get(keys);
        if (configmanager == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown configuration: ").append(keys).toString());
        } else
        {
            return configmanager;
        }
    }

    public static ConfigurationManagers getInstance()
    {
        boolean flag;
        if (INSTANCE != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "There was an error creating ConfigurationManagers");
        return INSTANCE;
    }

    private void scheduleUpdate(AlarmManager alarmmanager, Context context, ConfigPrefs.Keys keys)
    {
        Intent intent = new Intent(context, com/weather/commons/config/ConfigRefreshBroadcastReceiver);
        intent.putExtra("CONFIG_TO_UPDATE", keys);
        ConfigManager configmanager = getConfigurationManager(keys);
        if (configmanager.settings.refreshRateHours == null)
        {
            alarmScheduler.cancel(intent, keys.ordinal(), context, alarmmanager);
            return;
        } else
        {
            long l = TimeUnit.HOURS.toMillis(configmanager.settings.refreshRateHours.intValue());
            alarmScheduler.restartRepeating(intent, keys.ordinal(), l, context, alarmmanager);
            return;
        }
    }

    private static void updateConfig(Executor executor, ConfigManager configmanager)
    {
        executor.execute(new Runnable(configmanager) {

            final ConfigManager val$manager;

            public void run()
            {
                manager.updateConfig();
            }

            
            {
                manager = configmanager;
                super();
            }
        });
    }

    public ActivitiesConfig getActivitiesConfig()
    {
        ActivitiesConfig activitiesconfig;
        try
        {
            activitiesconfig = new ActivitiesConfig(getModulesConfig());
        }
        catch (ConfigException configexception)
        {
            Log.w("ConfigurationManagers", "activitiesConfig is stubbed", configexception);
            return new ActivitiesConfig(null);
        }
        return activitiesconfig;
    }

    public AdConfig getAdConfig()
        throws ConfigException
    {
        return (AdConfig)adConfigManager.getConfig();
    }

    public ModulesConfig getAllergyModulesConfig()
        throws ConfigException
    {
        return (ModulesConfig)allergyModulesManager.getConfig();
    }

    public Properties getAppRatingConfig()
        throws ConfigException
    {
        return (Properties)appRatingConfigManager.getConfig();
    }

    public BeaconConfig getBeaconConfig()
        throws ConfigException
    {
        return (BeaconConfig)beaconConfigManager.getConfig();
    }

    public ModulesConfig getColdFluModulesConfig()
        throws ConfigException
    {
        return (ModulesConfig)coldFluModulesManager.getConfig();
    }

    public DalConfig getDalConfig()
        throws ConfigException
    {
        return (DalConfig)dalConfigManager.getConfig();
    }

    public AdSize getDefaultAdSize(Context context)
    {
        context = context.getString(com.weather.commons.R.string.default_ad_size);
        if ("BANNER".equals(context))
        {
            return AdSize.BANNER;
        }
        if ("LARGE_BANNER".equals(context))
        {
            return AdSize.LARGE_BANNER;
        }
        if ("MEDIUM_BANNER".equals(context))
        {
            return AdSize.MEDIUM_RECTANGLE;
        }
        if ("FULL_BANNER".equals(context))
        {
            return AdSize.FULL_BANNER;
        }
        if ("LEADERBOARD".equals(context))
        {
            return AdSize.LEADERBOARD;
        } else
        {
            Log.w("ConfigurationManagers", (new StringBuilder()).append("System configured with unknown ad size: ").append(context).append("; defaulting to banner").toString());
            return AdSize.BANNER;
        }
    }

    public FactualConfig getFactualConfig()
        throws ConfigException
    {
        return (FactualConfig)factualConfigManager.getConfig();
    }

    public FlagshipConfig getFlagshipConfig()
        throws ConfigException
    {
        return (FlagshipConfig)flagshipConfigManager.getConfig();
    }

    public ModulesConfig getHurricaneModulesConfig()
        throws ConfigException
    {
        return (ModulesConfig)hurricaneCentralModuleManager.getConfig();
    }

    public LayersConfig getLayersConfig()
        throws ConfigException
    {
        return (LayersConfig)layersConfigManager.getConfig();
    }

    public ModulesConfig getModulesConfig()
        throws ConfigException
    {
        return (ModulesConfig)modulesConfigManager.getConfig();
    }

    public boolean isAdTestModeEnabled()
    {
        return adConfigManager == adTestConfigManager;
    }

    public void scheduleUpdates()
    {
        scheduleUpdates(AbstractTwcApplication.getRootContext());
    }

    public void scheduleUpdates(Context context)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        ConfigPrefs.Keys akeys[] = ConfigPrefs.Keys.values();
        int j = akeys.length;
        for (int i = 0; i < j; i++)
        {
            scheduleUpdate(alarmmanager, context, akeys[i]);
        }

    }

    public void setAdTestModeEnabled(boolean flag)
    {
        ConfigManager configmanager;
        if (flag)
        {
            configmanager = adTestConfigManager;
        } else
        {
            configmanager = adProdConfigManager;
        }
        adConfigManager = configmanager;
        twcPrefs.putBoolean(com.weather.util.prefs.TwcPrefs.Keys.AD_TEST_ENABLED, flag);
    }

    public void updateConfig(ConfigPrefs.Keys keys)
    {
        getConfigurationManager(keys).updateConfig();
    }

    public void updateConfig(Executor executor)
    {
        updateConfig(executor, configFilesConfigManager);
        updateConfig(executor, flagshipConfigManager);
        updateConfig(executor, modulesConfigManager);
        updateConfig(executor, hurricaneCentralModuleManager);
        updateConfig(executor, allergyModulesManager);
        updateConfig(executor, coldFluModulesManager);
        updateConfig(executor, appRatingConfigManager);
        updateConfig(executor, adProdConfigManager);
        updateConfig(executor, adTestConfigManager);
        updateConfig(executor, dalConfigManager);
        updateConfig(executor, factualConfigManager);
        updateConfig(executor, beaconConfigManager);
        updateConfig(executor, layersConfigManager);
    }

}
