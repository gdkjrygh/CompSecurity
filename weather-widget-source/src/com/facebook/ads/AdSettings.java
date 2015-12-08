// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.a.ag;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class AdSettings
{

    private static final String DEVICE_ID_HASH_PREFS_KEY = "deviceIdHash";
    private static final String PREFS_NAME = "FBAdPrefs";
    public static final String TAG = com/facebook/ads/AdSettings.getSimpleName();
    private static boolean childDirected = false;
    private static String deviceIdHash = null;
    private static final Collection emulatorProducts;
    static volatile boolean testDeviceNoticeDisplayed = false;
    private static final Collection testDevices = new HashSet();
    private static String urlPrefix = null;

    public AdSettings()
    {
    }

    public static void addTestDevice(String s)
    {
        testDevices.add(s);
    }

    public static void addTestDevices(Collection collection)
    {
        testDevices.addAll(collection);
    }

    public static void clearTestDevices()
    {
        testDevices.clear();
    }

    public static String getUrlPrefix()
    {
        return urlPrefix;
    }

    public static boolean isChildDirected()
    {
        return childDirected;
    }

    public static boolean isTestMode(Context context)
    {
        if (!emulatorProducts.contains(Build.PRODUCT))
        {
            if (deviceIdHash == null)
            {
                context = context.getSharedPreferences("FBAdPrefs", 0);
                deviceIdHash = context.getString("deviceIdHash", null);
                if (ag.a(deviceIdHash))
                {
                    deviceIdHash = ag.b(UUID.randomUUID().toString());
                    context.edit().putString("deviceIdHash", deviceIdHash).apply();
                }
            }
            if (!testDevices.contains(deviceIdHash))
            {
                printTestDeviceNotice(deviceIdHash);
                return false;
            }
        }
        return true;
    }

    private static void printTestDeviceNotice(String s)
    {
        if (testDeviceNoticeDisplayed)
        {
            return;
        } else
        {
            testDeviceNoticeDisplayed = true;
            Log.d(TAG, (new StringBuilder()).append("Test mode device hash: ").append(s).toString());
            Log.d(TAG, (new StringBuilder()).append("When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"").append(s).append("\");").toString());
            return;
        }
    }

    public static void setIsChildDirected(boolean flag)
    {
        childDirected = flag;
    }

    public static void setUrlPrefix(String s)
    {
        urlPrefix = s;
    }

    static 
    {
        emulatorProducts = new HashSet();
        emulatorProducts.add("sdk");
        emulatorProducts.add("google_sdk");
        emulatorProducts.add("vbox86p");
        emulatorProducts.add("vbox86tp");
    }
}
