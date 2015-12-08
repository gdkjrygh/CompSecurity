// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;

public class ManifestUtils
{

    public ManifestUtils()
    {
    }

    public static void checkRequiredPermission(String s)
    {
        if (-1 == UAirship.getPackageManager().checkPermission(s, UAirship.getPackageName()))
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required permission: ").append(s).toString());
        }
    }

    public static ActivityInfo getActivityInfo(Class class1)
    {
        class1 = new ComponentName(UAirship.getPackageName(), class1.getCanonicalName());
        try
        {
            class1 = UAirship.getPackageManager().getActivityInfo(class1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static ComponentInfo getProviderInfo(String s)
    {
        return UAirship.getPackageManager().resolveContentProvider(s, 0);
    }

    public static ComponentInfo getReceiverInfo(Class class1)
    {
        class1 = new ComponentName(UAirship.getPackageName(), class1.getCanonicalName());
        try
        {
            class1 = UAirship.getPackageManager().getReceiverInfo(class1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static ComponentInfo getServiceInfo(Class class1)
    {
        class1 = new ComponentName(UAirship.getPackageName(), class1.getCanonicalName());
        try
        {
            class1 = UAirship.getPackageManager().getServiceInfo(class1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }
}
