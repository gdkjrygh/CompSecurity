// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AppRequestData;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.CreateAppSpiCall;
import io.fabric.sdk.android.services.settings.IconRequest;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import io.fabric.sdk.android.services.settings.UpdateAppSpiCall;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package io.fabric.sdk.android:
//            Kit, Fabric, Logger, KitInfo

class Onboarding extends Kit
{

    private static final String BINARY_BUILD_TYPE = "binary";
    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private String applicationLabel;
    private String installerPackageName;
    private final Future kitsFinder;
    private PackageInfo packageInfo;
    private PackageManager packageManager;
    private String packageName;
    private final Collection providedKits;
    private final HttpRequestFactory requestFactory = new DefaultHttpRequestFactory();
    private String targetAndroidSdkVersion;
    private String versionCode;
    private String versionName;

    public Onboarding(Future future, Collection collection)
    {
        kitsFinder = future;
        providedKits = collection;
    }

    private AppRequestData buildAppRequest(IconRequest iconrequest, Collection collection)
    {
        Object obj = getContext();
        String s = (new ApiKey()).getValue(((Context) (obj)));
        obj = CommonUtils.createInstanceIdFrom(new String[] {
            CommonUtils.resolveBuildId(((Context) (obj)))
        });
        int i = DeliveryMechanism.determineFrom(installerPackageName).getId();
        return new AppRequestData(s, getIdManager().getAppIdentifier(), versionName, versionCode, ((String) (obj)), applicationLabel, i, targetAndroidSdkVersion, "0", iconrequest, collection);
    }

    private boolean performAutoConfigure(String s, AppSettingsData appsettingsdata, Collection collection)
    {
        boolean flag = true;
        if (!"new".equals(appsettingsdata.status)) goto _L2; else goto _L1
_L1:
        if (!performCreateApp(s, appsettingsdata, collection)) goto _L4; else goto _L3
_L3:
        flag = Settings.getInstance().loadSettingsSkippingCache();
_L6:
        return flag;
_L4:
        Fabric.getLogger().e("Fabric", "Failed to create app with Crashlytics service.", null);
        return false;
_L2:
        if ("configured".equals(appsettingsdata.status))
        {
            return Settings.getInstance().loadSettingsSkippingCache();
        }
        if (appsettingsdata.updateRequired)
        {
            Fabric.getLogger().d("Fabric", "Server says an update is required - forcing a full App update.");
            performUpdateApp(s, appsettingsdata, collection);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean performCreateApp(String s, AppSettingsData appsettingsdata, Collection collection)
    {
        s = buildAppRequest(IconRequest.build(getContext(), s), collection);
        return (new CreateAppSpiCall(this, getOverridenSpiEndpoint(), appsettingsdata.url, requestFactory)).invoke(s);
    }

    private boolean performUpdateApp(AppSettingsData appsettingsdata, IconRequest iconrequest, Collection collection)
    {
        iconrequest = buildAppRequest(iconrequest, collection);
        return (new UpdateAppSpiCall(this, getOverridenSpiEndpoint(), appsettingsdata.url, requestFactory)).invoke(iconrequest);
    }

    private boolean performUpdateApp(String s, AppSettingsData appsettingsdata, Collection collection)
    {
        return performUpdateApp(appsettingsdata, IconRequest.build(getContext(), s), collection);
    }

    private SettingsData retrieveSettingsData()
    {
        SettingsData settingsdata;
        try
        {
            Settings.getInstance().initialize(this, idManager, requestFactory, versionCode, versionName, getOverridenSpiEndpoint()).loadSettingsData();
            settingsdata = Settings.getInstance().awaitSettingsData();
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("Fabric", "Error dealing with settings", exception);
            return null;
        }
        return settingsdata;
    }

    protected Boolean doInBackground()
    {
        String s;
        SettingsData settingsdata;
        boolean flag;
        boolean flag1;
        s = CommonUtils.getAppIconHashOrNull(getContext());
        flag1 = false;
        settingsdata = retrieveSettingsData();
        flag = flag1;
        if (settingsdata == null) goto _L2; else goto _L1
_L1:
        if (kitsFinder == null) goto _L4; else goto _L3
_L3:
        Object obj = (Map)kitsFinder.get();
_L5:
        obj = mergeKits(((Map) (obj)), providedKits);
        flag = performAutoConfigure(s, settingsdata.appData, ((Map) (obj)).values());
_L2:
        return Boolean.valueOf(flag);
_L4:
        obj = new HashMap();
          goto _L5
        Exception exception;
        exception;
        Fabric.getLogger().e("Fabric", "Error performing auto configuration.", exception);
        flag = flag1;
          goto _L2
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    public String getIdentifier()
    {
        return "io.fabric.sdk.android:fabric";
    }

    String getOverridenSpiEndpoint()
    {
        return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
    }

    public String getVersion()
    {
        return "1.3.6.79";
    }

    Map mergeKits(Map map, Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Kit kit = (Kit)collection.next();
            if (!map.containsKey(kit.getIdentifier()))
            {
                map.put(kit.getIdentifier(), new KitInfo(kit.getIdentifier(), kit.getVersion(), "binary"));
            }
        } while (true);
        return map;
    }

    protected boolean onPreExecute()
    {
        installerPackageName = getIdManager().getInstallerPackageName();
        packageManager = getContext().getPackageManager();
        packageName = getContext().getPackageName();
        packageInfo = packageManager.getPackageInfo(packageName, 0);
        versionCode = Integer.toString(packageInfo.versionCode);
        if (packageInfo.versionName != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        String s = "0.0";
_L1:
        try
        {
            versionName = s;
            applicationLabel = packageManager.getApplicationLabel(getContext().getApplicationInfo()).toString();
            targetAndroidSdkVersion = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Fabric.getLogger().e("Fabric", "Failed init", namenotfoundexception);
            return false;
        }
        return true;
        s = packageInfo.versionName;
          goto _L1
    }
}
