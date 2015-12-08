// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.UUID;

public class AnalyticsRequest
{
    private class Analytics
    {

        private String mKind;
        final AnalyticsRequest this$0;

        public Analytics(String s)
        {
            this$0 = AnalyticsRequest.this;
            super();
            mKind = s;
        }
    }

    private class Meta
    {

        private String mAndroidId;
        private String mDeviceAppGeneratedPersistentUuid;
        private String mDeviceManufacturer;
        private String mDeviceModel;
        private String mDeviceNetworkType;
        private String mDeviceRooted;
        private String mDeviceScreenOrientation;
        private String mIntegrationType;
        private String mIsSimulator;
        private String mMerchantAppId;
        private String mMerchantAppName;
        private String mMerchantAppVersion;
        private String mPlatform;
        private String mPlatformVersion;
        private String mSdkVersion;
        private String mUserInterfaceOrientation;
        final AnalyticsRequest this$0;

        private String detectEmulator()
        {
            if ("google_sdk".equalsIgnoreCase(Build.PRODUCT) || "sdk".equalsIgnoreCase(Build.PRODUCT) || "Genymotion".equalsIgnoreCase(Build.MANUFACTURER))
            {
                return "true";
            } else
            {
                return "false";
            }
        }

        private String getAppName(ApplicationInfo applicationinfo, PackageManager packagemanager)
        {
            if (applicationinfo != null)
            {
                return (String)packagemanager.getApplicationLabel(applicationinfo);
            } else
            {
                return "ApplicationNameUnknown";
            }
        }

        private String getAppVersion(PackageManager packagemanager, String s)
        {
            try
            {
                packagemanager = packagemanager.getPackageInfo(s, 0).versionName;
            }
            // Misplaced declaration of an exception variable
            catch (PackageManager packagemanager)
            {
                return "VersionUnknown";
            }
            return packagemanager;
        }

        private String getNetworkType(Context context)
        {
            return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo().getTypeName();
        }

        private String getUUID(Context context)
        {
            SharedPreferences sharedpreferences = context.getSharedPreferences("BraintreeApi", 0);
            String s = sharedpreferences.getString("braintreeUUID", null);
            context = s;
            if (s == null)
            {
                context = UUID.randomUUID().toString().replace("-", "");
                sharedpreferences.edit().putString("braintreeUUID", context).apply();
            }
            return context;
        }

        private String getUserOrientation(Context context)
        {
            switch (context.getResources().getConfiguration().orientation)
            {
            default:
                return "Unknown";

            case 1: // '\001'
                return "Portrait";

            case 2: // '\002'
                return "Landscape";
            }
        }

        private String isDeviceRooted()
        {
            boolean flag;
            boolean flag3 = false;
            String s = Build.TAGS;
            boolean flag1;
            boolean flag2;
            if (s != null && s.contains("test-keys"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            try
            {
                flag2 = (new File("/system/app/Superuser.apk")).exists();
            }
            catch (Exception exception)
            {
                flag2 = false;
            }
            s = (new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[] {
                "/system/xbin/which", "su"
            }).getInputStream()))).readLine();
            if (s != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
_L2:
label0:
            {
                if (!flag1 && !flag2)
                {
                    flag2 = flag3;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                flag2 = true;
            }
            return Boolean.toString(flag2);
            Exception exception1;
            exception1;
            flag = false;
            if (true) goto _L2; else goto _L1
_L1:
        }

        protected Meta(Context context, String s)
        {
            this$0 = AnalyticsRequest.this;
            super();
            String s1 = context.getPackageName();
            PackageManager packagemanager = context.getPackageManager();
            try
            {
                analyticsrequest = packagemanager.getApplicationInfo(s1, 0);
            }
            // Misplaced declaration of an exception variable
            catch (AnalyticsRequest analyticsrequest)
            {
                analyticsrequest = null;
            }
            mPlatform = "Android";
            mPlatformVersion = Integer.toString(android.os.Build.VERSION.SDK_INT);
            mSdkVersion = "1.6.5-paypal-browser-switch-3-SNAPSHOT";
            mMerchantAppId = s1;
            mMerchantAppName = getAppName(AnalyticsRequest.this, packagemanager);
            mMerchantAppVersion = getAppVersion(packagemanager, s1);
            mDeviceRooted = isDeviceRooted();
            mDeviceManufacturer = Build.MANUFACTURER;
            mDeviceModel = Build.MODEL;
            mDeviceNetworkType = getNetworkType(context);
            mAndroidId = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            mDeviceAppGeneratedPersistentUuid = getUUID(context);
            mIsSimulator = detectEmulator();
            mIntegrationType = s;
            mUserInterfaceOrientation = getUserOrientation(context);
        }
    }


    public Analytics mAnalytics[];
    public Meta mMeta;

    public AnalyticsRequest(Context context, String s, String s1)
    {
        mAnalytics = (new Analytics[] {
            new Analytics(s)
        });
        mMeta = new Meta(context, s1);
    }

    public String toJson()
    {
        return (new Gson()).toJson(this);
    }
}
