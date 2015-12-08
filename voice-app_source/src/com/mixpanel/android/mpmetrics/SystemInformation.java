// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class SystemInformation
{

    private static final String LOGTAG = "MixpanelAPI.SysInfo";
    private final Integer mAppVersionCode;
    private final String mAppVersionName;
    private final Context mContext;
    private final DisplayMetrics mDisplayMetrics;
    private final Boolean mHasNFC;
    private final Boolean mHasTelephony;

    public SystemInformation(Context context)
    {
        Object obj;
        Object obj2;
        PackageManager packagemanager;
        mContext = context;
        packagemanager = mContext.getPackageManager();
        obj = null;
        obj2 = null;
        context = ((Context) (obj));
        Object obj3 = packagemanager.getPackageInfo(mContext.getPackageName(), 0);
        context = ((Context) (obj));
        obj = ((PackageInfo) (obj3)).versionName;
        context = ((Context) (obj));
        int i = ((PackageInfo) (obj3)).versionCode;
        obj2 = Integer.valueOf(i);
        context = ((Context) (obj));
        obj = obj2;
_L1:
        mAppVersionName = context;
        mAppVersionCode = ((Integer) (obj));
        context = packagemanager.getClass();
        obj3 = null;
        context = context.getMethod("hasSystemFeature", new Class[] {
            java/lang/String
        });
        obj3 = context;
_L3:
        Object obj4;
        Object obj5 = null;
        obj = null;
        context = null;
        obj4 = null;
        obj2 = obj4;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        context = obj5;
        obj2 = obj;
        obj = (Boolean)((Method) (obj3)).invoke(packagemanager, new Object[] {
            "android.hardware.nfc"
        });
        context = ((Context) (obj));
        obj2 = obj;
        obj3 = (Boolean)((Method) (obj3)).invoke(packagemanager, new Object[] {
            "android.hardware.telephony"
        });
        obj2 = obj3;
        context = ((Context) (obj));
_L2:
        mHasNFC = context;
        mHasTelephony = ((Boolean) (obj2));
        mDisplayMetrics = new DisplayMetrics();
        ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getMetrics(mDisplayMetrics);
        return;
        Object obj1;
        obj1;
        Log.w("MixpanelAPI.SysInfo", "System information constructed with a context that apparently doesn't exist.");
        obj1 = obj2;
          goto _L1
        obj1;
        Log.w("MixpanelAPI.SysInfo", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
        obj2 = obj4;
          goto _L2
        context;
        Log.w("MixpanelAPI.SysInfo", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
        context = ((Context) (obj2));
        obj2 = obj4;
          goto _L2
        context;
          goto _L3
    }

    public Integer getAppVersionCode()
    {
        return mAppVersionCode;
    }

    public String getAppVersionName()
    {
        return mAppVersionName;
    }

    public String getBluetoothVersion()
    {
        String s = null;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            s = "none";
            if (android.os.Build.VERSION.SDK_INT >= 18 && mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))
            {
                s = "ble";
            } else
            if (mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth"))
            {
                return "classic";
            }
        }
        return s;
    }

    public String getCurrentNetworkOperator()
    {
        String s = null;
        TelephonyManager telephonymanager = (TelephonyManager)mContext.getSystemService("phone");
        if (telephonymanager != null)
        {
            s = telephonymanager.getNetworkOperatorName();
        }
        return s;
    }

    public DisplayMetrics getDisplayMetrics()
    {
        return mDisplayMetrics;
    }

    public String getPhoneRadioType()
    {
        TelephonyManager telephonymanager = (TelephonyManager)mContext.getSystemService("phone");
        if (telephonymanager == null) goto _L2; else goto _L1
_L1:
        telephonymanager.getPhoneType();
        JVM INSTR tableswitch 0 3: default 52
    //                   0 54
    //                   1 57
    //                   2 60
    //                   3 63;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return null;
_L3:
        return "none";
_L4:
        return "gsm";
_L5:
        return "cdma";
_L6:
        return "sip";
    }

    public boolean hasNFC()
    {
        return mHasNFC.booleanValue();
    }

    public boolean hasTelephony()
    {
        return mHasTelephony.booleanValue();
    }

    public Boolean isBluetoothEnabled()
    {
        Boolean boolean1 = null;
        BluetoothAdapter bluetoothadapter;
        boolean flag;
        try
        {
            bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        }
        catch (SecurityException securityexception)
        {
            return null;
        }
        if (bluetoothadapter == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        flag = bluetoothadapter.isEnabled();
        boolean1 = Boolean.valueOf(flag);
        return boolean1;
    }

    public Boolean isWifiConnected()
    {
        Boolean boolean1 = null;
        if (mContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            boolean1 = Boolean.valueOf(((ConnectivityManager)mContext.getSystemService("connectivity")).getNetworkInfo(1).isConnected());
        }
        return boolean1;
    }
}
