// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.security.MessageDigest;

public class Constants
{

    public static String ANDROID_VERSION = null;
    public static String APP_PACKAGE = null;
    public static String APP_VERSION = null;
    public static String APP_VERSION_NAME = null;
    public static final String BASE_URL = "https://sdk.hockeyapp.net/";
    public static String CRASH_IDENTIFIER = null;
    public static String FILES_PATH = null;
    public static String PHONE_MANUFACTURER = null;
    public static String PHONE_MODEL = null;
    public static final String SDK_NAME = "HockeySDK";
    public static final String SDK_VERSION = "3.5.0";
    public static final String TAG = "HockeyApp";

    public Constants()
    {
    }

    private static String bytesToHex(byte abyte0[])
    {
        char ac[] = "0123456789ABCDEF".toCharArray();
        char ac1[] = new char[abyte0.length * 2];
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            ac1[i * 2] = ac[j >>> 4];
            ac1[i * 2 + 1] = ac[j & 0xf];
        }

        return (new String(ac1)).replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5");
    }

    private static String createSalt(Context context)
    {
        String s1 = (new StringBuilder()).append("HA").append(Build.BOARD.length() % 10).append(Build.BRAND.length() % 10).append(Build.CPU_ABI.length() % 10).append(Build.PRODUCT.length() % 10).toString();
        String s = "";
        context = s;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            try
            {
                context = android/os/Build.getField("SERIAL").get(null).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = s;
            }
        }
        return (new StringBuilder()).append(s1).append(":").append(context).toString();
    }

    public static File getHockeyAppStorageDir()
    {
        File file = Environment.getExternalStorageDirectory();
        file = new File((new StringBuilder()).append(file.getAbsolutePath()).append("/").append("HockeyApp").toString());
        file.mkdirs();
        return file;
    }

    private static int loadBuildNumber(Context context, PackageManager packagemanager)
    {
        int i = 0;
        try
        {
            context = packagemanager.getApplicationInfo(context.getPackageName(), 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("HockeyApp", "Exception thrown when accessing the application info:");
            context.printStackTrace();
            return 0;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        i = context.getInt("buildNumber", 0);
        return i;
    }

    private static void loadCrashIdentifier(Context context)
    {
        String s;
        s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (APP_PACKAGE == null || s == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        s = (new StringBuilder()).append(APP_PACKAGE).append(":").append(s).append(":").append(createSalt(context)).toString();
        context = MessageDigest.getInstance("SHA-1");
        byte abyte0[] = s.getBytes("UTF-8");
        context.update(abyte0, 0, abyte0.length);
        CRASH_IDENTIFIER = bytesToHex(context.digest());
        return;
        context;
    }

    private static void loadFilesPath(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        try
        {
            context = context.getFilesDir();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("HockeyApp", "Exception thrown when accessing the files dir:");
            context.printStackTrace();
            return;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        FILES_PATH = context.getAbsolutePath();
    }

    public static void loadFromContext(Context context)
    {
        ANDROID_VERSION = android.os.Build.VERSION.RELEASE;
        PHONE_MODEL = Build.MODEL;
        PHONE_MANUFACTURER = Build.MANUFACTURER;
        loadFilesPath(context);
        loadPackageData(context);
        loadCrashIdentifier(context);
    }

    private static void loadPackageData(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        PackageInfo packageinfo;
        int i;
        try
        {
            PackageManager packagemanager = context.getPackageManager();
            packageinfo = packagemanager.getPackageInfo(context.getPackageName(), 0);
            APP_PACKAGE = packageinfo.packageName;
            APP_VERSION = (new StringBuilder()).append("").append(packageinfo.versionCode).toString();
            APP_VERSION_NAME = packageinfo.versionName;
            i = loadBuildNumber(context, packagemanager);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("HockeyApp", "Exception thrown when accessing the package info:");
            context.printStackTrace();
            return;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (i > packageinfo.versionCode)
        {
            APP_VERSION = (new StringBuilder()).append("").append(i).toString();
        }
    }

}
