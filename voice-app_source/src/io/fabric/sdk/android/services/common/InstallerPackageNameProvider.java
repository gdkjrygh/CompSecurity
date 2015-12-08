// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.cache.ValueLoader;

public class InstallerPackageNameProvider
{

    private static final String NO_INSTALLER_PACKAGE_NAME = "";
    private final MemoryValueCache installerPackageNameCache = new MemoryValueCache();
    private final ValueLoader installerPackageNameLoader = new ValueLoader() {

        final InstallerPackageNameProvider this$0;

        public volatile Object load(Context context)
            throws Exception
        {
            return load(context);
        }

        public String load(Context context)
            throws Exception
        {
            String s = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            context = s;
            if (s == null)
            {
                context = "";
            }
            return context;
        }

            
            {
                this$0 = InstallerPackageNameProvider.this;
                super();
            }
    };

    public InstallerPackageNameProvider()
    {
    }

    public String getInstallerPackageName(Context context)
    {
        boolean flag;
        try
        {
            context = (String)installerPackageNameCache.get(context, installerPackageNameLoader);
            flag = "".equals(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.getLogger().e("Fabric", "Failed to determine installer package name", context);
            return null;
        }
        if (flag)
        {
            context = null;
        }
        return context;
    }
}
