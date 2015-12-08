// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.mixpanel.android.surveys.SurveyActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class ConfigurationChecker
{

    public static String LOGTAG = "MixpanelAPI.ConfigurationChecker";

    ConfigurationChecker()
    {
    }

    public static boolean checkBasicConfiguration(Context context)
    {
        if (context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) != 0)
        {
            Log.w(LOGTAG, "Package does not have permission android.permission.INTERNET - Mixpanel will not work at all!");
            Log.i(LOGTAG, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean checkPushConfiguration(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8) goto _L2; else goto _L1
_L1:
        Log.i(LOGTAG, (new StringBuilder("Mixpanel push notifications not supported in SDK ")).append(android.os.Build.VERSION.SDK_INT).toString());
_L4:
        return false;
_L2:
        String s;
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        s = context.getPackageName();
        String s1 = (new StringBuilder(String.valueOf(s))).append(".permission.C2D_MESSAGE").toString();
        try
        {
            packagemanager.getPermissionInfo(s1, 4096);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(LOGTAG, (new StringBuilder("Application does not define permission ")).append(s1).toString());
            Log.i(LOGTAG, (new StringBuilder("You will need to add the following lines to your application manifest:\n<permission android:name=\"")).append(s).append(".permission.C2D_MESSAGE\" android:protectionLevel=\"signature\" />\n").append("<uses-permission android:name=\"").append(s).append(".permission.C2D_MESSAGE\" />").toString());
            return false;
        }
        if (packagemanager.checkPermission("com.google.android.c2dm.permission.RECEIVE", s) != 0)
        {
            Log.w(LOGTAG, "Package does not have permission com.google.android.c2dm.permission.RECEIVE");
            Log.i(LOGTAG, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"com.google.android.c2dm.permission.RECEIVE\" />");
            return false;
        }
        if (packagemanager.checkPermission("android.permission.INTERNET", s) != 0)
        {
            Log.w(LOGTAG, "Package does not have permission android.permission.INTERNET");
            Log.i(LOGTAG, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        }
        if (packagemanager.checkPermission("android.permission.WAKE_LOCK", s) != 0)
        {
            Log.w(LOGTAG, "Package does not have permission android.permission.WAKE_LOCK");
            Log.i(LOGTAG, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.WAKE_LOCK\" />");
            return false;
        }
        if (packagemanager.checkPermission("android.permission.GET_ACCOUNTS", s) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(LOGTAG, "Package does not have permission android.permission.GET_ACCOUNTS");
        Log.i(LOGTAG, "Android versions below 4.1 require GET_ACCOUNTS to receive Mixpanel push notifications.\nDevices with later OS versions will still be able to receive messages, but if you'd like to support older devices, you'll need to add the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.GET_ACCOUNTS\" />");
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L4; else goto _L3
_L3:
        Object obj;
        boolean flag;
        ActivityInfo aactivityinfo[];
        try
        {
            obj = packagemanager.getPackageInfo(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(LOGTAG, (new StringBuilder("Could not get receivers for package ")).append(s).toString());
            return false;
        }
        aactivityinfo = ((PackageInfo) (obj)).receivers;
        if (aactivityinfo == null || aactivityinfo.length == 0)
        {
            Log.w(LOGTAG, (new StringBuilder("No receiver for package ")).append(s).toString());
            Log.i(LOGTAG, (new StringBuilder("You can fix this with the following into your <application> tag:\n")).append(samplePushConfigurationMessage(s)).toString());
            return false;
        }
        obj = new HashSet();
        int j = aactivityinfo.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                if (((Set) (obj)).isEmpty())
                {
                    Log.w(LOGTAG, "No receiver allowed to receive com.google.android.c2dm.permission.SEND");
                    Log.i(LOGTAG, (new StringBuilder("You can fix by pasting the following into the <application> tag in your AndroidManifest.xml:\n")).append(samplePushConfigurationMessage(s)).toString());
                    return false;
                }
                break;
            }
            ActivityInfo activityinfo = aactivityinfo[i];
            if ("com.google.android.c2dm.permission.SEND".equals(activityinfo.permission))
            {
                ((Set) (obj)).add(activityinfo.name);
            }
            i++;
        } while (true);
        if (!checkReceiver(context, ((Set) (obj)), "com.google.android.c2dm.intent.RECEIVE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
        flag = true;
_L6:
        boolean flag1 = true;
        if (!checkReceiver(context, ((Set) (obj)), "com.google.android.c2dm.intent.REGISTRATION"))
        {
            Log.i(LOGTAG, "(You can still receive push notifications on Lollipop/API 21 or greater with this configuration)");
            flag1 = false;
        }
        if (flag || flag1)
        {
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        Log.w(LOGTAG, "Google Play Services aren't included in your build- push notifications won't work on Lollipop/API 21 or greater");
        Log.i(LOGTAG, "You can fix this by adding com.google.android.gms:play-services as a dependency of your gradle or maven project");
          goto _L6
    }

    private static boolean checkReceiver(Context context, Set set, String s)
    {
        Object obj = context.getPackageManager();
        context = context.getPackageName();
        Intent intent = new Intent(s);
        intent.setPackage(context);
        obj = ((PackageManager) (obj)).queryBroadcastReceivers(intent, 32);
        if (((List) (obj)).isEmpty())
        {
            Log.w(LOGTAG, (new StringBuilder("No receivers for action ")).append(s).toString());
            Log.i(LOGTAG, (new StringBuilder("You can fix by pasting the following into the <application> tag in your AndroidManifest.xml:\n")).append(samplePushConfigurationMessage(context)).toString());
            return false;
        }
        context = ((List) (obj)).iterator();
        do
        {
            if (!context.hasNext())
            {
                return true;
            }
            s = ((ResolveInfo)context.next()).activityInfo.name;
        } while (set.contains(s));
        Log.w(LOGTAG, (new StringBuilder("Receiver ")).append(s).append(" is not set with permission com.google.android.c2dm.permission.SEND").toString());
        Log.i(LOGTAG, "Please add the attribute 'android:permission=\"com.google.android.c2dm.permission.SEND\"' to your <receiver> tag");
        return false;
    }

    public static boolean checkSurveyActivityAvailable(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return false;
        }
        Intent intent = new Intent(context, com/mixpanel/android/surveys/SurveyActivity);
        intent.addFlags(0x10000000);
        intent.addFlags(0x20000);
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() == 0)
        {
            Log.w(LOGTAG, (new StringBuilder(String.valueOf(com/mixpanel/android/surveys/SurveyActivity.getName()))).append(" is not registered as an activity in your application, so surveys can't be shown.").toString());
            Log.i(LOGTAG, "Please add the child tag <activity android:name=\"com.mixpanel.android.surveys.SurveyActivity\" /> to your <application> tag.");
            return false;
        } else
        {
            return true;
        }
    }

    private static String samplePushConfigurationMessage(String s)
    {
        return (new StringBuilder("<receiver android:name=\"com.mixpanel.android.mpmetrics.GCMReceiver\"\n          android:permission=\"com.google.android.c2dm.permission.SEND\" >\n    <intent-filter>\n       <action android:name=\"com.google.android.c2dm.intent.RECEIVE\" />\n       <action android:name=\"com.google.android.c2dm.intent.REGISTRATION\" />\n       <category android:name=\"")).append(s).append("\" />\n").append("    </intent-filter>\n").append("</receiver>").toString();
    }

}
