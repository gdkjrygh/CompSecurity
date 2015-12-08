// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.ValueLoader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DeviceTokenLoader
    implements ValueLoader
{

    private static final String DIRFACTOR_DEVICE_TOKEN_PREFIX = "assets/com.crashlytics.android.beta/dirfactor-device-token=";

    public DeviceTokenLoader()
    {
    }

    String determineDeviceToken(ZipInputStream zipinputstream)
        throws IOException
    {
        do
        {
            Object obj = zipinputstream.getNextEntry();
            if (obj != null)
            {
                obj = ((ZipEntry) (obj)).getName();
                if (((String) (obj)).startsWith("assets/com.crashlytics.android.beta/dirfactor-device-token="))
                {
                    return ((String) (obj)).substring("assets/com.crashlytics.android.beta/dirfactor-device-token=".length(), ((String) (obj)).length() - 1);
                }
            } else
            {
                return "";
            }
        } while (true);
    }

    ZipInputStream getZipInputStreamOfAppApkFrom(Context context)
        throws android.content.pm.PackageManager.NameNotFoundException, FileNotFoundException
    {
        return new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir));
    }

    public volatile Object load(Context context)
        throws Exception
    {
        return load(context);
    }

    public String load(Context context)
        throws Exception
    {
        Object obj;
        Object obj1;
        Context context1;
        Context context2;
        String s;
        long l;
        l = System.nanoTime();
        s = "";
        context1 = null;
        context2 = null;
        obj = null;
        obj1 = null;
        context = getZipInputStreamOfAppApkFrom(context);
        obj1 = context;
        context1 = context;
        context2 = context;
        obj = context;
        String s1 = determineDeviceToken(context);
        obj1 = s1;
        obj = obj1;
        if (context != null)
        {
            double d;
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Fabric.getLogger().e("Beta", "Failed to close the APK file", context);
                obj = obj1;
                continue; /* Loop/switch isn't completed */
            }
            obj = obj1;
        }
_L2:
        d = (double)(System.nanoTime() - l) / 1000000D;
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Beta device token load took ").append(d).append("ms").toString());
        return ((String) (obj));
        context;
        obj = obj1;
        Fabric.getLogger().e("Beta", "Failed to find this app in the PackageManager", context);
        obj = s;
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ((ZipInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.getLogger().e("Beta", "Failed to close the APK file", context);
            obj = s;
            continue; /* Loop/switch isn't completed */
        }
        obj = s;
        continue; /* Loop/switch isn't completed */
        context;
        obj = context1;
        Fabric.getLogger().e("Beta", "Failed to find the APK file", context);
        obj = s;
        if (context1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            context1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.getLogger().e("Beta", "Failed to close the APK file", context);
            obj = s;
            continue; /* Loop/switch isn't completed */
        }
        obj = s;
        continue; /* Loop/switch isn't completed */
        context;
        obj = context2;
        Fabric.getLogger().e("Beta", "Failed to read the APK file", context);
        obj = s;
        if (context2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        context2.close();
        obj = s;
        continue; /* Loop/switch isn't completed */
        context;
        Fabric.getLogger().e("Beta", "Failed to close the APK file", context);
        obj = s;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (obj != null)
        {
            try
            {
                ((ZipInputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                Fabric.getLogger().e("Beta", "Failed to close the APK file", ioexception);
            }
        }
        throw context;
    }
}
