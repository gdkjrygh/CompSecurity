// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            SettingsData, DefaultSettingsJsonTransform, DefaultCachedSettingsIo, DefaultSettingsSpiCall, 
//            DefaultSettingsController, SettingsRequest, SettingsController, SettingsCacheBehavior

public class Settings
{
    static class LazyHolder
    {

        private static final Settings INSTANCE = new Settings();



        LazyHolder()
        {
        }
    }

    public static interface SettingsAccess
    {

        public abstract Object usingSettings(SettingsData settingsdata);
    }


    public static final String SETTINGS_CACHE_FILENAME = "com.crashlytics.settings.json";
    private static final String SETTINGS_URL_FORMAT = "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings";
    private boolean initialized;
    private SettingsController settingsController;
    private final AtomicReference settingsData;
    private final CountDownLatch settingsDataLatch;

    private Settings()
    {
        settingsData = new AtomicReference();
        settingsDataLatch = new CountDownLatch(1);
        initialized = false;
    }


    public static Settings getInstance()
    {
        return LazyHolder.INSTANCE;
    }

    private void setSettingsData(SettingsData settingsdata)
    {
        settingsData.set(settingsdata);
        settingsDataLatch.countDown();
    }

    public SettingsData awaitSettingsData()
    {
        SettingsData settingsdata;
        try
        {
            settingsDataLatch.await();
            settingsdata = (SettingsData)settingsData.get();
        }
        catch (InterruptedException interruptedexception)
        {
            Fabric.getLogger().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
        return settingsdata;
    }

    public void clearSettings()
    {
        settingsData.set(null);
    }

    public Settings initialize(Kit kit, IdManager idmanager, HttpRequestFactory httprequestfactory, String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = initialized;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        if (settingsController == null)
        {
            android.content.Context context = kit.getContext();
            String s3 = idmanager.getAppIdentifier();
            String s4 = (new ApiKey()).getValue(context);
            String s5 = idmanager.getInstallerPackageName();
            SystemCurrentTimeProvider systemcurrenttimeprovider = new SystemCurrentTimeProvider();
            DefaultSettingsJsonTransform defaultsettingsjsontransform = new DefaultSettingsJsonTransform();
            DefaultCachedSettingsIo defaultcachedsettingsio = new DefaultCachedSettingsIo(kit);
            String s6 = CommonUtils.getAppIconHashOrNull(context);
            httprequestfactory = new DefaultSettingsSpiCall(kit, s2, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
                s3
            }), httprequestfactory);
            settingsController = new DefaultSettingsController(kit, new SettingsRequest(s4, idmanager.createIdHeaderValue(s4, s3), CommonUtils.createInstanceIdFrom(new String[] {
                CommonUtils.resolveBuildId(context)
            }), s1, s, DeliveryMechanism.determineFrom(s5).getId(), s6), systemcurrenttimeprovider, defaultsettingsjsontransform, defaultcachedsettingsio, httprequestfactory);
        }
        initialized = true;
        if (true) goto _L1; else goto _L3
_L3:
        kit;
        throw kit;
    }

    public boolean loadSettingsData()
    {
        this;
        JVM INSTR monitorenter ;
        SettingsData settingsdata;
        settingsdata = settingsController.loadSettingsData();
        setSettingsData(settingsdata);
        boolean flag;
        if (settingsdata != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean loadSettingsSkippingCache()
    {
        this;
        JVM INSTR monitorenter ;
        SettingsData settingsdata;
        settingsdata = settingsController.loadSettingsData(SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
        setSettingsData(settingsdata);
        if (settingsdata != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        Fabric.getLogger().e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        boolean flag;
        if (settingsdata != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void setSettingsController(SettingsController settingscontroller)
    {
        settingsController = settingscontroller;
    }

    public Object withSettings(SettingsAccess settingsaccess, Object obj)
    {
        SettingsData settingsdata = (SettingsData)settingsData.get();
        if (settingsdata == null)
        {
            return obj;
        } else
        {
            return settingsaccess.usingSettings(settingsdata);
        }
    }
}
