// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.registry;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.walmart.android.data.AppConfig;
import com.walmart.android.wmservice.AppConfigManager;

public final class RegistryStatus extends Enum
{

    private static final RegistryStatus $VALUES[];
    public static final RegistryStatus DISABLED_MAINTENANCE;
    public static final RegistryStatus DISABLED_NEEDS_APP_UPDATE;
    public static final RegistryStatus ENABLED;

    private RegistryStatus(String s, int i)
    {
        super(s, i);
    }

    public static RegistryStatus get(Context context)
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (isRegistryDisabled(appconfig))
        {
            return DISABLED_MAINTENANCE;
        }
        if (isRegistryDisabledForAppVersion(context, appconfig))
        {
            return DISABLED_NEEDS_APP_UPDATE;
        } else
        {
            return ENABLED;
        }
    }

    private static boolean isRegistryDisabled(AppConfig appconfig)
    {
        return appconfig != null && appconfig.registryDisabled;
    }

    private static boolean isRegistryDisabledForAppVersion(Context context, AppConfig appconfig)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (appconfig != null)
        {
            int i;
            try
            {
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                i = 0;
            }
            flag = flag1;
            if (i < appconfig.registryMinVersion)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static RegistryStatus valueOf(String s)
    {
        return (RegistryStatus)Enum.valueOf(com/walmart/android/app/registry/RegistryStatus, s);
    }

    public static RegistryStatus[] values()
    {
        return (RegistryStatus[])$VALUES.clone();
    }

    static 
    {
        ENABLED = new RegistryStatus("ENABLED", 0);
        DISABLED_MAINTENANCE = new RegistryStatus("DISABLED_MAINTENANCE", 1);
        DISABLED_NEEDS_APP_UPDATE = new RegistryStatus("DISABLED_NEEDS_APP_UPDATE", 2);
        $VALUES = (new RegistryStatus[] {
            ENABLED, DISABLED_MAINTENANCE, DISABLED_NEEDS_APP_UPDATE
        });
    }
}
