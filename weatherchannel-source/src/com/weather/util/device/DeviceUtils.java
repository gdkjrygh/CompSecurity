// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.device;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.util.device:
//            RmidUtils

public final class DeviceUtils
{
    public static final class NetworkClass extends Enum
    {

        private static final NetworkClass $VALUES[];
        public static final NetworkClass FOUR_G;
        public static final NetworkClass THREE_G;
        public static final NetworkClass TWO_G;
        public static final NetworkClass UNKNOWN;

        public static NetworkClass valueOf(String s)
        {
            return (NetworkClass)Enum.valueOf(com/weather/util/device/DeviceUtils$NetworkClass, s);
        }

        public static NetworkClass[] values()
        {
            return (NetworkClass[])$VALUES.clone();
        }

        static 
        {
            TWO_G = new NetworkClass("TWO_G", 0);
            THREE_G = new NetworkClass("THREE_G", 1);
            FOUR_G = new NetworkClass("FOUR_G", 2);
            UNKNOWN = new NetworkClass("UNKNOWN", 3);
            $VALUES = (new NetworkClass[] {
                TWO_G, THREE_G, FOUR_G, UNKNOWN
            });
        }

        private NetworkClass(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class NetworkType extends Enum
    {

        private static final NetworkType $VALUES[];
        public static final NetworkType MOBILE;
        public static final NetworkType UNKNOWN;
        public static final NetworkType WIFI;

        public static NetworkType valueOf(String s)
        {
            return (NetworkType)Enum.valueOf(com/weather/util/device/DeviceUtils$NetworkType, s);
        }

        public static NetworkType[] values()
        {
            return (NetworkType[])$VALUES.clone();
        }

        static 
        {
            WIFI = new NetworkType("WIFI", 0);
            MOBILE = new NetworkType("MOBILE", 1);
            UNKNOWN = new NetworkType("UNKNOWN", 2);
            $VALUES = (new NetworkType[] {
                WIFI, MOBILE, UNKNOWN
            });
        }

        private NetworkType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "DeviceUtils";

    private DeviceUtils()
    {
    }

    public static Float getBatteryLevel()
    {
        Object obj = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        obj = AbstractTwcApplication.getRootContext().registerReceiver(null, ((IntentFilter) (obj)));
        if (obj == null)
        {
            return null;
        } else
        {
            int i = ((Intent) (obj)).getIntExtra("level", -1);
            int j = ((Intent) (obj)).getIntExtra("scale", -1);
            return Float.valueOf((float)i / (float)j);
        }
    }

    public static String getCarrierInfo(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
    }

    public static NetworkClass getNetworkClass(Context context)
    {
        switch (((TelephonyManager)context.getSystemService("phone")).getNetworkType())
        {
        default:
            return NetworkClass.UNKNOWN;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 7: // '\007'
        case 11: // '\013'
            return NetworkClass.TWO_G;

        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            return NetworkClass.THREE_G;

        case 13: // '\r'
            return NetworkClass.FOUR_G;
        }
    }

    public static String getUUID(Context context)
    {
        String s = ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
        context = s;
        if (s == null)
        {
            context = Build.SERIAL;
        }
        return context;
    }

    public static String getUuidDigest(Context context)
    {
        return RmidUtils.getSHA1(getUUID(context));
    }

    public static boolean isBatteryChargedOrCharging(double d)
    {
        Float float1 = getBatteryLevel();
        return float1 == null || (double)float1.floatValue() >= d || isCharging();
    }

    public static boolean isCharging()
    {
        Object obj = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        obj = AbstractTwcApplication.getRootContext().registerReceiver(null, ((IntentFilter) (obj)));
        int i;
        if (obj == null)
        {
            i = 1;
        } else
        {
            i = ((Intent) (obj)).getIntExtra("status", -1);
        }
        return i == 2 || i == 5;
    }

    public static boolean isNetworkAvailable(Context context)
    {
        boolean flag1 = false;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        boolean flag = flag1;
        if (context != null)
        {
            context = context.getActiveNetworkInfo();
            flag = flag1;
            if (context != null)
            {
                flag = context.isConnectedOrConnecting();
            }
        }
        return flag;
    }

    public static boolean isNetworkConnected(Context context)
    {
        boolean flag1 = false;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        boolean flag = flag1;
        if (context != null)
        {
            context = context.getActiveNetworkInfo();
            flag = flag1;
            if (context != null)
            {
                flag = context.isConnected();
            }
        }
        return flag;
    }

    public static boolean isOnExternalPower(Context context)
    {
        if (context == null)
        {
            return false;
        }
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (context == null)
        {
            i = 1;
        } else
        {
            i = context.getIntExtra("plugged", -1);
        }
        if (i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        LogUtil.d("DeviceUtils", LoggingMetaTags.TWC_GENERAL, "isOnExternalPower: usb=%s, ac=%s", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        return flag2;
    }

    public static boolean isOnMobile(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            return false;
        }
        context = context.getNetworkInfo(0);
        if (context == null)
        {
            return false;
        } else
        {
            boolean flag = context.isConnectedOrConnecting();
            LogUtil.d("DeviceUtils", LoggingMetaTags.TWC_GENERAL, "isOnMobile: isConnectedOrConnecting=%s", new Object[] {
                Boolean.valueOf(flag)
            });
            return flag;
        }
    }

    public static boolean isOnWifi(Context context)
    {
        if (context == null)
        {
            return false;
        }
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            return false;
        }
        context = context.getNetworkInfo(1);
        if (context == null)
        {
            return false;
        } else
        {
            boolean flag = context.isConnectedOrConnecting();
            LogUtil.d("DeviceUtils", LoggingMetaTags.TWC_GENERAL, "isOnWifi: isConnectedOrConnecting=%s", new Object[] {
                Boolean.valueOf(flag)
            });
            return flag;
        }
    }

    public static boolean isScreenOn()
    {
        return ((PowerManager)AbstractTwcApplication.getRootContext().getSystemService("power")).isScreenOn();
    }
}
