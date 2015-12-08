// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.SharedPreferences;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            SettingsController, SettingsCacheBehavior, CachedSettingsIo, SettingsJsonTransform, 
//            SettingsData, SettingsSpiCall, SettingsRequest

class DefaultSettingsController
    implements SettingsController
{

    private static final String LOAD_ERROR_MESSAGE = "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.";
    private static final String PREFS_BUILD_INSTANCE_IDENTIFIER = "existing_instance_identifier";
    private final CachedSettingsIo cachedSettingsIo;
    private final CurrentTimeProvider currentTimeProvider;
    private final Kit kit;
    private final PreferenceStore preferenceStore;
    private final SettingsJsonTransform settingsJsonTransform;
    private final SettingsRequest settingsRequest;
    private final SettingsSpiCall settingsSpiCall;

    public DefaultSettingsController(Kit kit1, SettingsRequest settingsrequest, CurrentTimeProvider currenttimeprovider, SettingsJsonTransform settingsjsontransform, CachedSettingsIo cachedsettingsio, SettingsSpiCall settingsspicall)
    {
        kit = kit1;
        settingsRequest = settingsrequest;
        currentTimeProvider = currenttimeprovider;
        settingsJsonTransform = settingsjsontransform;
        cachedSettingsIo = cachedsettingsio;
        settingsSpiCall = settingsspicall;
        preferenceStore = new PreferenceStoreImpl(kit);
    }

    private SettingsData getCachedSettingsData(SettingsCacheBehavior settingscachebehavior)
    {
        SettingsCacheBehavior settingscachebehavior1;
        Object obj;
        obj = null;
        settingscachebehavior1 = obj;
        if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingscachebehavior))
        {
            break MISSING_BLOCK_LABEL_185;
        }
        settingscachebehavior1 = obj;
        SettingsData settingsdata;
        JSONObject jsonobject;
        long l;
        try
        {
            jsonobject = cachedSettingsIo.readCachedSettings();
        }
        // Misplaced declaration of an exception variable
        catch (SettingsCacheBehavior settingscachebehavior)
        {
            Fabric.getLogger().e("Fabric", "Failed to get cached settings", settingscachebehavior);
            return settingscachebehavior1;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        settingscachebehavior1 = obj;
        settingsdata = settingsJsonTransform.buildFromJson(currentTimeProvider, jsonobject);
        if (settingsdata == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        settingscachebehavior1 = obj;
        logSettings(jsonobject, "Loaded cached settings: ");
        settingscachebehavior1 = obj;
        l = currentTimeProvider.getCurrentTimeMillis();
        settingscachebehavior1 = obj;
        if (SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingscachebehavior))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        settingscachebehavior1 = obj;
        if (settingsdata.isExpired(l))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        settingscachebehavior = settingsdata;
        settingscachebehavior1 = settingscachebehavior;
        Fabric.getLogger().d("Fabric", "Returning cached settings.");
        return settingscachebehavior;
        settingscachebehavior1 = obj;
        Fabric.getLogger().d("Fabric", "Cached settings have expired.");
        return null;
        settingscachebehavior1 = obj;
        Fabric.getLogger().e("Fabric", "Failed to transform cached settings data.", null);
        return null;
        settingscachebehavior1 = obj;
        Fabric.getLogger().d("Fabric", "No cached settings data found.");
        return null;
    }

    private void logSettings(JSONObject jsonobject, String s)
        throws JSONException
    {
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append(s).append(jsonobject.toString()).toString());
    }

    boolean buildInstanceIdentifierChanged()
    {
        return !getStoredBuildInstanceIdentifier().equals(getBuildInstanceIdentifierFromContext());
    }

    String getBuildInstanceIdentifierFromContext()
    {
        return CommonUtils.createInstanceIdFrom(new String[] {
            CommonUtils.resolveBuildId(kit.getContext())
        });
    }

    String getStoredBuildInstanceIdentifier()
    {
        return preferenceStore.get().getString("existing_instance_identifier", "");
    }

    public SettingsData loadSettingsData()
    {
        return loadSettingsData(SettingsCacheBehavior.USE_CACHE);
    }

    public SettingsData loadSettingsData(SettingsCacheBehavior settingscachebehavior)
    {
        Object obj;
        SettingsData settingsdata;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        settingsdata = obj1;
        obj = obj2;
        if (Fabric.isDebuggable())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        settingsdata = obj1;
        obj = obj2;
        if (!buildInstanceIdentifierChanged())
        {
            obj = obj2;
            JSONObject jsonobject;
            try
            {
                settingsdata = getCachedSettingsData(settingscachebehavior);
            }
            // Misplaced declaration of an exception variable
            catch (SettingsCacheBehavior settingscachebehavior)
            {
                Fabric.getLogger().e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", settingscachebehavior);
                return ((SettingsData) (obj));
            }
        }
        obj = settingsdata;
        if (settingsdata != null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        obj = settingsdata;
        jsonobject = settingsSpiCall.invoke(settingsRequest);
        obj = settingsdata;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        obj = settingsdata;
        settingscachebehavior = settingsJsonTransform.buildFromJson(currentTimeProvider, jsonobject);
        obj = settingscachebehavior;
        cachedSettingsIo.writeCachedSettings(((SettingsData) (settingscachebehavior)).expiresAtMillis, jsonobject);
        obj = settingscachebehavior;
        logSettings(jsonobject, "Loaded settings: ");
        obj = settingscachebehavior;
        setStoredBuildInstanceIdentifier(getBuildInstanceIdentifierFromContext());
        obj = settingscachebehavior;
        settingscachebehavior = ((SettingsCacheBehavior) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        settingscachebehavior = getCachedSettingsData(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        return settingscachebehavior;
    }

    boolean setStoredBuildInstanceIdentifier(String s)
    {
        android.content.SharedPreferences.Editor editor = preferenceStore.edit();
        editor.putString("existing_instance_identifier", s);
        return preferenceStore.save(editor);
    }
}
