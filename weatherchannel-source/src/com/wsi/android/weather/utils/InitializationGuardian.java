// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import com.wsi.android.framework.settings.ConfigurationManager;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.ui.utils.StringsHelper;
import com.wsi.android.weather.ui.MapApplication;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.wsi.android.weather.utils:
//            DataLayerAccessor

public class InitializationGuardian
{

    protected final String TAG = getClass().getSimpleName();
    protected boolean initialized;
    protected MapApplication mapApp;

    public InitializationGuardian(MapApplication mapapplication)
    {
        mapApp = mapapplication;
    }

    public void attemptInit()
    {
        Iterator iterator = ((ActivityManager)mapApp.getSystemService("activity")).getRunningAppProcesses().iterator();
_L2:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        if (iterator.hasNext())
        {
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
            if (runningappprocessinfo.pid != Process.myPid() || !mapApp.getPackageName().equals(runningappprocessinfo.processName))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (ConfigInfo.DEBUG)
            {
                Log.d(TAG, (new StringBuilder()).append("process: name = ").append(runningappprocessinfo.processName).append("; pid = ").append(runningappprocessinfo.pid).toString());
                Log.d(TAG, "main process - init required");
            }
        }
        if (onPreAppInit())
        {
            performAppInit();
        }
_L3:
        return;
        if (runningappprocessinfo.pid != Process.myPid() || mapApp.getPackageName().equals(runningappprocessinfo.processName)) goto _L2; else goto _L1
_L1:
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("process: name = ").append(runningappprocessinfo.processName).append("; pid = ").append(runningappprocessinfo.pid).toString());
            Log.d(TAG, "worker process - no init required");
            return;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected ConfigurationManager createMapAppConfigurationManager(MapApplication mapapplication)
    {
        return new ConfigurationManager(mapapplication);
    }

    public boolean isInitialized()
    {
        return initialized;
    }

    protected void onPostAppInit()
    {
    }

    protected boolean onPreAppInit()
    {
        return true;
    }

    protected void performAppInit()
    {
        ConfigurationManager configurationmanager = createMapAppConfigurationManager(mapApp);
        configurationmanager.initApplicationAndSkinSettings();
        DataLayerAccessor datalayeraccessor = performDataLayerInit(configurationmanager);
        mapApp.setDataLayerAccessor(datalayeraccessor);
        StringsHelper.init(configurationmanager.getSettingsAccessor());
        mapApp.setConfigManager(configurationmanager);
        performCustomComponentsInit(configurationmanager);
        initialized = true;
        onPostAppInit();
    }

    protected void performCustomComponentsInit(ConfigurationManager configurationmanager)
    {
    }

    protected DataLayerAccessor performDataLayerInit(ConfigurationManager configurationmanager)
    {
        return new DataLayerAccessor(configurationmanager);
    }
}
