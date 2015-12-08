// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.internal.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.arubanetworks.meridian.log.MeridianLogger;
import java.util.Locale;

// Referenced classes of package com.arubanetworks.meridian.internal.util:
//            Strings

public class Dev
{

    private static final MeridianLogger a = MeridianLogger.forTag("Dev");
    private static Dev b;
    private final float c;
    private final float d;
    private final DisplayMetrics e;

    private Dev(Context context)
    {
        e = context.getResources().getDisplayMetrics();
        c = e.density;
        d = e.scaledDensity;
    }

    private static boolean a(Context context, String s)
    {
        PackageManager packagemanager = context.getPackageManager();
        return packagemanager != null && packagemanager.checkPermission(s, context.getPackageName()) == 0;
    }

    private static boolean b(Context context, String s)
    {
        return context.getPackageManager() != null && context.getPackageManager().hasSystemFeature(s);
    }

    public static Dev get()
    {
        if (b == null)
        {
            throw new RuntimeException("You must call Dev.init(context) first");
        } else
        {
            return b;
        }
    }

    public static String getLanguageCode()
    {
        String s1 = Locale.getDefault().getLanguage();
        String s = s1;
        if (s1.equals("iw"))
        {
            s = "he";
        }
        String s2 = Locale.getDefault().getCountry();
        s1 = s;
        if (s2 != null)
        {
            s1 = s;
            if (s2.length() > 0)
            {
                s1 = (new StringBuilder()).append(s).append("-").append(s2).toString().toLowerCase(Locale.US);
            }
        }
        return s1;
    }

    public static int getOpenGLMajorVersion(Context context)
    {
        int j;
        boolean flag;
        flag = true;
        context = context.getPackageManager().getSystemAvailableFeatures();
        j = ((flag) ? 1 : 0);
        if (context == null) goto _L2; else goto _L1
_L1:
        j = ((flag) ? 1 : 0);
        if (context.length <= 0) goto _L2; else goto _L3
_L3:
        int i;
        int k;
        k = context.length;
        i = 0;
_L8:
        j = ((flag) ? 1 : 0);
        if (i >= k) goto _L2; else goto _L4
_L4:
        Object obj = context[i];
        if (((FeatureInfo) (obj)).name != null) goto _L6; else goto _L5
_L5:
        j = ((flag) ? 1 : 0);
        if (((FeatureInfo) (obj)).reqGlEsVersion != 0)
        {
            j = (((FeatureInfo) (obj)).reqGlEsVersion & 0xffff0000) >> 16;
        }
_L2:
        return j;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean hasBLE(Context context)
    {
        return android.os.Build.VERSION.SDK_INT >= 18 && b(context, "android.hardware.bluetooth_le");
    }

    public static boolean hasBLEPermission(Context context)
    {
        return a(context, "android.permission.BLUETOOTH") && a(context, "android.permission.BLUETOOTH_ADMIN");
    }

    public static boolean hasGPS(Context context)
    {
        return b(context, "android.hardware.location.gps");
    }

    public static boolean hasWiFi(Context context)
    {
        return b(context, "android.hardware.wifi");
    }

    public static boolean hasWiFiPermission(Context context)
    {
        return a(context, "android.permission.ACCESS_WIFI_STATE") && a(context, "android.permission.CHANGE_WIFI_STATE");
    }

    public static void init(Context context)
    {
        if (b != null)
        {
            throw new RuntimeException("Dev has already been initialized");
        } else
        {
            b = new Dev(context);
            return;
        }
    }

    public static boolean isBluetoothEnabled(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            context = ((BluetoothManager)context.getSystemService("bluetooth")).getAdapter();
        } else
        {
            context = BluetoothAdapter.getDefaultAdapter();
        }
        if (context == null)
        {
            return false;
        }
        switch (context.getState())
        {
        case 11: // '\013'
        case 12: // '\f'
        default:
            return true;

        case 10: // '\n'
        case 13: // '\r'
            return false;
        }
    }

    public static boolean isLocationEnabled(Context context)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            int i;
            try
            {
                i = android.provider.Settings.Secure.getInt(context.getContentResolver(), "location_mode");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.i("Location mode not found in Settings", context);
                return true;
            }
            if (i == 0)
            {
                flag = false;
            }
        } else
        if (Strings.isNullOrEmpty(android.provider.Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed")))
        {
            return false;
        }
        return flag;
    }

    public static boolean isWiFiEnabled(Context context)
    {
        context = (WifiManager)context.getSystemService("wifi");
        return context != null && context.isWifiEnabled();
    }

    public int dpToPix(float f)
    {
        return (int)TypedValue.applyDimension(1, f, e);
    }

    public float pixToDp(int i)
    {
        return (float)(int)(((float)i - 0.5F) / c);
    }

}
