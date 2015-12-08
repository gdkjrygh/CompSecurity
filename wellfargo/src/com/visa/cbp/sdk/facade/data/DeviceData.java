// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.visa.cbp.sdk.facade.VisaPaymentSDKImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import rrrrrr.grgrgr;
import rrrrrr.grrgrg;
import rrrrrr.lpllpl;
import rrrrrr.lppllp;
import rrrrrr.pplllp;
import rrrrrr.rgrgrg;
import uuuuuu.nuuuuu;

public class DeviceData
{

    public static int b042804280428042804280428 = 2;
    public static int b042804280428042804280428 = 0;
    public static int b042804280428042804280428 = 1;
    public static int b042804280428042804280428 = 29;
    private String ID;
    private String IMEI;
    private String androidID;
    private String blueToothAddress;
    private String bootloader;
    private String brand;
    private String cpuABI;
    private String cpuABI2;
    private String device;
    private String deviceName;
    private transient String dfpSessionID;
    private String display;
    private String fingerprint;
    private String hardware;
    private String host;
    private String incremental;
    private String manufacturer;
    private String model;
    private String networkOperator;
    private String networkOperatorName;
    private int networkType;
    private String product;
    private String radioVersion;
    private String release;
    private String sdk;
    private String sdkINT;
    private String serial;
    private String simOperator;
    private String simSerialNumber;
    private long time;
    private String wifiMacAddress;

    public DeviceData()
    {
        Object obj2 = null;
        super();
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\337\215\211\217\377\u0496\215\211\217\377\u0496\u0496\215\211\217\377", '\275', '\002'), new Class[0]);
        Object obj1;
        Object obj3;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj = (WifiManager)obj;
        obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\305\223\227\225\245\u048E\u048E\u048E\u048E\223\227\225\245", 'P', '\263', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj1 = (Context)obj1;
        obj3 = rrrrrr/lpllpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF40\u030F\u030F\u030F\uFF0E\uFF12\uFF11\uFF0F\uFF0E\uFF12\uFF11\uFF0F\uFF0E\uFF12\uFF11\uFF0F", '^', '\304', '\0'), new Class[] {
            android/content/Context, java/lang/String
        });
        try
        {
            obj3 = ((Method) (obj3)).invoke(null, new Object[] {
                obj1, "android.permission.ACCESS_WIFI_STATE"
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if (((Boolean)obj3).booleanValue() && obj != null)
        {
            Object obj4 = android/net/wifi/WifiManager.getMethod(nuuuuu.b0417041704170417041704170417("\uFF85\uFF83\uFF92\uFF61\uFF8D\uFF8C\uFF8C\uFF83\uFF81\uFF92\uFF87\uFF8D\uFF8C\uFF67\uFF8C\uFF84\uFF8D", '\342', '\0'), new Class[0]);
            Object obj5;
            Object obj6;
            int i;
            int j;
            int k;
            try
            {
                obj = ((Method) (obj4)).invoke(obj, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            obj = (WifiInfo)obj;
        } else
        {
            obj = null;
        }
        obj4 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\351\u04B2\u04B2\267\273\271\311\u04B2\u04B2\267\273\271\311", '.', '\265', '\001'), new Class[0]);
        try
        {
            obj4 = ((Method) (obj4)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj4 = (TelephonyManager)obj4;
        obj5 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\356\u04B7\274\300\276\316\274\300\276\316\u04B7\u04B7\274\300\276\316", 'F', '\001'), new Class[0]);
        try
        {
            obj5 = ((Method) (obj5)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj5 = (BluetoothManager)obj5;
        obj6 = rrrrrr/lpllpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0153\u0522\u0522\u0522\u0121\u0125\u0124\u0122\u0121\u0125\u0124\u0122\u0121\u0125\u0124\u0122", 'm', '\204', '\003'), new Class[] {
            android/content/Context, java/lang/String
        });
        try
        {
            obj6 = ((Method) (obj6)).invoke(null, new Object[] {
                obj1, "android.permission.BLUETOOTH"
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj1 = obj2;
        if (((Boolean)obj6).booleanValue())
        {
            obj1 = obj2;
            if (obj5 != null)
            {
                obj1 = android/bluetooth/BluetoothManager.getMethod(nuuuuu.b0417041704170417041704170417("\u0178\u0176\u0185\u0152\u0175\u0172\u0181\u0185\u0176\u0183", '\032', '\367', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(obj5, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw ((InvocationTargetException) (obj)).getCause();
                }
                obj1 = (BluetoothAdapter)obj1;
            }
        }
        fingerprint = Build.FINGERPRINT;
        serial = Build.SERIAL;
        obj2 = android/telephony/TelephonyManager.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDA\uFFD8\uFFE7\uFFB7\uFFD8\uFFE9\uFFDC\uFFD6\uFFD8\uFFBC\uFFD7", '\215', '\0'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(obj4, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        IMEI = (String)obj2;
        incremental = android.os.Build.VERSION.INCREMENTAL;
        release = android.os.Build.VERSION.RELEASE;
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            obj2 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\004\u03CA\u03CA\uFFD2\uFFD6\uFFD4\uFFDA\u03CA\u03CA\uFFD2\uFFD6\uFFD4\uFFDA", '^', '\0'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b042804280428042804280428 = ((Integer)obj2).intValue();
            obj2 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6A\u0330\u0330\uFF38\uFF3C\uFF3A\uFF40\u0330\u0330\uFF38\uFF3C\uFF3A\uFF40", '|', '\003'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b042804280428042804280428 = ((Integer)obj2).intValue();
        }
        sdk = android.os.Build.VERSION.SDK;
        i = android.os.Build.VERSION.SDK_INT;
        obj2 = java/lang/Integer.getMethod(nuuuuu.b0417041704170417041704170417("\335\330\274\335\333\322\327\320", 'i', '\005'), new Class[] {
            Integer.TYPE
        });
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[] {
                Integer.valueOf(i)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        sdkINT = (String)obj2;
        obj2 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFE77\uFE45\uFE49\uFE47\uFE57\u0240\u0240\u0240\u0240\uFE45\uFE49\uFE47\uFE57", '\363', '\370', '\0'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj2 = (Context)obj2;
        obj5 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE8\uFFE6\uFFF5\uFFC4\uFFF0\uFFEF\uFFF5\uFFE6\uFFEF\uFFF5\uFFD3\uFFE6\uFFF4\uFFF0\uFFED\uFFF7\uFFE6\uFFF3", '\257', '0', '\001'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj5)).invoke(obj2, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        obj2 = (ContentResolver)obj2;
        obj5 = android/provider/Settings$Secure.getMethod(nuuuuu.b0417041704170417041704170417("\u010F\u010D\u011C\373\u011C\u011A\u0111\u0116\u010F", '8', '\006'), new Class[] {
            android/content/ContentResolver, java/lang/String
        });
        try
        {
            obj2 = ((Method) (obj5)).invoke(null, new Object[] {
                obj2, "android_id"
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        androidID = (String)obj2;
        if (obj != null)
        {
            obj2 = android/net/wifi/WifiInfo.getMethod(nuuuuu.b0417041704170417041704170417("XVe>RT2UUcVdd", '\024', '#', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj2)).invoke(obj, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            wifiMacAddress = (String)obj;
        }
        if (obj1 != null)
        {
            obj = android/bluetooth/BluetoothAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\u02EF\u02ED\u02FC\u02C9\u02EC\u02EC\u02FA\u02ED\u02FB\u02FB", '\330', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(obj1, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            blueToothAddress = (String)obj;
        }
        if (obj4 != null)
        {
            obj = android/telephony/TelephonyManager.getMethod(nuuuuu.b0417041704170417041704170417("dbqPfjLmbo^qlo", '\001', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(obj4, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            simOperator = (String)obj;
            obj = android/telephony/TelephonyManager.getMethod(nuuuuu.b0417041704170417041704170417("\u02B0\u02AE\u02BD\u029C\u02B2\u02B6\u029C\u02AE\u02BB\u02B2\u02AA\u02B5\u0297\u02BE\u02B6\u02AB\u02AE\u02BB", '\303', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(obj4, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            simSerialNumber = (String)obj;
            obj = android/telephony/TelephonyManager.getMethod(nuuuuu.b0417041704170417041704170417("\u01CA\u01C8\u01D7\u01B1\u01C8\u01D7\u01DA\u01D2\u01D5\u01CE\u01B2\u01D3\u01C8\u01D5\u01C4\u01D7\u01D2\u01D5\u01B1\u01C4\u01D0\u01C8", '\367', 'l', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(obj4, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            networkOperatorName = (String)obj;
            i = b042804280428042804280428;
            j = b042804280428042804280428;
            k = b042804280428042804280428;
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFDCB\uFD99\uFD9D\uFD9B\uFDA1\u0191\uFD99\uFD9D\uFD9B\uFDA1\u0191\u0191\uFD99\uFD9D\uFD9B\uFDA1", '\335', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            if ((k * (i + j)) % ((Integer)obj).intValue() != b042804280428042804280428)
            {
                b042804280428042804280428 = 8;
                b042804280428042804280428 = 41;
            }
            obj = android/telephony/TelephonyManager.getMethod(nuuuuu.b0417041704170417041704170417("\u015D\u015B\u016A\u0144\u015B\u016A\u016D\u0165\u0168\u0161\u0145\u0166\u015B\u0168\u0157\u016A\u0165\u0168", '{', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(obj4, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            networkOperator = (String)obj;
            obj = android/telephony/TelephonyManager.getMethod(nuuuuu.b0417041704170417041704170417("\uFD8B\uFD89\uFD98\uFD72\uFD89\uFD98\uFD9B\uFD93\uFD96\uFD8F\uFD78\uFD9D\uFD94\uFD89", '\364', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(obj4, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            networkType = ((Integer)obj).intValue();
        }
        bootloader = Build.BOOTLOADER;
        brand = Build.BRAND;
        device = Build.DEVICE;
        host = Build.HOST;
        ID = Build.ID;
        obj = android/os/Build.getMethod(nuuuuu.b0417041704170417041704170417("\t\013\032<\017\n\007\0018\013\034\035\007\001\0", 'n', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        radioVersion = (String)obj;
        product = Build.PRODUCT;
        time = Build.TIME;
        cpuABI = Build.CPU_ABI;
        cpuABI2 = Build.CPU_ABI2;
        display = Build.DISPLAY;
        manufacturer = Build.MANUFACTURER;
        hardware = Build.HARDWARE;
        model = Build.MODEL;
        deviceName = "";
        if (VisaPaymentSDKImpl.environment == null)
        {
            obj = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8C\u034B\uFF5A\uFF5E\uFF5C\uFF5B\uFF5A\uFF5E\uFF5C\uFF5B\u034B\u034B\uFF5A\uFF5E\uFF5C\uFF5B\u034B", '\326', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            dfpSessionID = (String)obj;
        } else
        {
            obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\302\220\224\222\342\u048B\u048B\u048B\u048B\220\224\222\342", '\240', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            obj = new lppllp((Context)obj);
            obj1 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0157\u0125\u0129\u0127\u012C\u0125\u0129\u0127\u012C\u0125\u0129\u0127\u012C\u051C\u051C\u051C", '\365', '\005'), new Class[0]);
            try
            {
                obj = ((Method) (obj1)).invoke(obj, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            obj = (rgrgrg)obj;
            if (obj != null)
            {
                obj1 = rrrrrr/rgrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\376\u04C3\u04C3\u04C3\314\320\316\323\314\320\316\323\u04C3", '\256', '\022', '\002'), new Class[0]);
                try
                {
                    obj = ((Method) (obj1)).invoke(obj, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw ((InvocationTargetException) (obj)).getCause();
                }
                dfpSessionID = (String)obj;
                return;
            }
        }
    }

    public static int b042804280428042804280428()
    {
        return 2;
    }

    public static int b042804280428042804280428()
    {
        return 1;
    }

    public static int b042804280428042804280428()
    {
        return 0;
    }

    public static int b042804280428042804280428()
    {
        return 99;
    }

    public String getAndroidID()
    {
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            b042804280428042804280428 = 35;
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("h\u042E\u042E6:8>\u042E\u042E6:8>", 'T', 'Z', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
        }
        return androidID;
    }

    public String getBlueToothAddress()
    {
        int i = b042804280428042804280428;
        int j = b042804280428042804280428;
        int k = b042804280428042804280428;
        int l = b042804280428042804280428;
        int i1 = b042804280428042804280428;
        Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\373\311\315\313\321\u04C1\u04C1\u04C1\311\315\313\321\311\315\313\321", '3', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((((Integer)obj).intValue() + i1) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            b042804280428042804280428 = 33;
            b042804280428042804280428 = 54;
        }
        if (((i + j) * k) % l != b042804280428042804280428)
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFE4F\u0215\u0215\uFE1D\uFE21\uFE1F\uFE25\u0215\u0215\uFE1D\uFE21\uFE1F\uFE25", '\261', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj1).intValue();
            b042804280428042804280428 = 59;
        }
        obj1 = blueToothAddress;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
label1:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
        return ((String) (obj1));
    }

    public String getBootloader()
    {
        int i = 5;
        do
        {
            int j;
            try
            {
                i /= 0;
            }
            catch (Exception exception1)
            {
                Object obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u02A8\u066E\u066E\u0276\u027A\u0278\u027E\u066E\u066E\u0276\u027A\u0278\u027E", '\302', '\006'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b042804280428042804280428 = ((Integer)obj1).intValue();
                try
                {
                    obj1 = bootloader;
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception)
                {
                    throw exception;
                }
                return ((String) (obj1));
            }
            j = b042804280428042804280428;
            switch ((j * (b042804280428042804280428 + j)) % b042804280428042804280428)
            {
            case 0: // '\0'
                if (false)
                {
                }
                break;

            default:
                b042804280428042804280428 = 32;
                Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u01C6\u058C\u058C\u0194\u0198\u0196\u019C\u058C\u058C\u0194\u0198\u0196\u019C", '\262', '\001'), new Class[0]);
                Exception exception;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b042804280428042804280428 = ((Integer)obj).intValue();
                break;
            }
        } while (true);
    }

    public String getBrand()
    {
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF37\u02FD\u02FD\uFF05\uFF09\uFF07\uFF0D\u02FD\u02FD\uFF05\uFF09\uFF07\uFF0D", '\271', 'r', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            Object obj1;
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            b042804280428042804280428 = 67;
        }
        obj = brand;
        i = b042804280428042804280428;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u0199\u055F\u055F\u0167\u016B\u0169\u016F\u055F\u055F\u0167\u016B\u0169\u016F", '\247', '\220', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE0\u03A6\u03A6\uFFAE\uFFB2\uFFB0\uFFB6\u03A6\u03A6\uFFAE\uFFB2\uFFB0\uFFB6", '\202', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            return ((String) (obj));
        }
    }

    public String getCpuABI()
    {
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    int i = b042804280428042804280428;
                    int j = b042804280428042804280428;
                    int k = b042804280428042804280428;
                    int l = b042804280428042804280428;
                    Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\004\u044EVRT^VRT^\u044E\u044EVRT^", 'f', '\002'), new Class[0]);
                    int i1;
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        throw invocationtargetexception.getCause();
                    }
                    if (((i + j) * k) % l != ((Integer)obj).intValue())
                    {
                        b042804280428042804280428 = 3;
                        b042804280428042804280428 = 70;
                    }
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        try
        {
            obj = cpuABI;
            i = b042804280428042804280428;
            j = b042804280428042804280428;
            k = b042804280428042804280428;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        try
        {
            l = b042804280428042804280428;
            i1 = b042804280428042804280428;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        b042804280428042804280428 = 22;
        b042804280428042804280428 = 46;
        return ((String) (obj));
    }

    public String getCpuABI2()
    {
        int i = b042804280428042804280428;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            int j = b042804280428042804280428;
            switch ((j * (b042804280428042804280428 + j)) % b042804280428042804280428)
            {
            default:
                Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\022\u03D8\u03D8\uFFE0\uFFE4\uFFE2\uFFE8\u03D8\u03D8\uFFE0\uFFE4\uFFE2\uFFE8", '\241', 'Q', '\001'), new Class[0]);
                Exception exception;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b042804280428042804280428 = ((Integer)obj).intValue();
                obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEE\u03B4\u03B4\uFFBC\uFFC0\uFFBE\uFFC4\u03B4\u03B4\uFFBC\uFFC0\uFFBE\uFFC4", '?', '\263', '\002'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b042804280428042804280428 = ((Integer)obj).intValue();
                // fall through

            case 0: // '\0'
                b042804280428042804280428 = 23;
                b042804280428042804280428 = 62;
                break;
            }
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            obj = cpuABI2;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        return ((String) (obj));
    }

    public String getDevice()
    {
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            b042804280428042804280428 = 45;
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u0185\u054B\u054B\u0153\u0157\u0155\u015B\u054B\u054B\u0153\u0157\u0155\u015B", 'a', '\006'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            int i;
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
        }
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        i = b042804280428042804280428;
        j = b042804280428042804280428;
        k = b042804280428042804280428;
        l = b042804280428042804280428;
label1:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break label1;

            case 1: // '\001'
                break;
            }
        } while (true);
        if (((i + j) * k) % l != b042804280428042804280428)
        {
            b042804280428042804280428 = 38;
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF12\u02D8\u02D8\uFEE0\uFEE4\uFEE2\uFEE8\u02D8\u02D8\uFEE0\uFEE4\uFEE2\uFEE8", '\250', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
        }
        return device;
    }

    public String getDeviceName()
    {
        int i = b042804280428042804280428;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u015E\u0524\u0524\u012C\u0130\u012E\u0134\u0524\u0524\u012C\u0130\u012E\u0134", '\374', '\005'), new Class[0]);
            Exception exception;
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("r\u0438\u0438@DBH\u0438\u0438@DBH", '\252', '\272', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        j = b042804280428042804280428;
        switch ((j * (b042804280428042804280428 + j)) % b042804280428042804280428)
        {
        default:
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\304\u048A\u048A\222\226\224\232\u048A\u048A\222\226\224\232", '\016', 'T', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            b042804280428042804280428 = 74;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            obj = deviceName;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        return ((String) (obj));
    }

    public String getDfpSessionID()
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            obj = dfpSessionID;
            i = b042804280428042804280428;
            j = b042804280428042804280428;
            k = b042804280428042804280428;
            l = b042804280428042804280428;
            i1 = b042804280428042804280428;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFECC\u0292\u0292\uFE9A\uFE9E\uFE9C\uFEA2\u0292\u0292\uFE9A\uFE9E\uFE9C\uFEA2", '\313', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        try
        {
            b042804280428042804280428 = i;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\026\u03DC\u03DC\uFFE4\uFFE8\uFFE6\uFFEC\u03DC\u03DC\uFFE4\uFFE8\uFFE6\uFFEC", '\f', '@', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b042804280428042804280428 = i;
        return ((String) (obj));
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        return ((String) (obj));
    }

    public String getDisplay()
    {
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        int i = b042804280428042804280428;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            b042804280428042804280428 = 83;
            b042804280428042804280428 = 43;
            break;

        case 0: // '\0'
            break;
        }
        String s;
        InvocationTargetException invocationtargetexception;
        Object obj;
        int j;
        int k;
        int l;
        try
        {
            s = display;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\232\u0460\u0460hljp\u0460\u0460hljp", 'e', '\235', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u013A\u0108\u010C\u010A\u0110\u0500\u0500\u0500\u0108\u010C\u010A\u0110\u0108\u010C\u010A\u0110", '\347', '\017', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u0126\u04EC\u04EC\364\370\366\374\u04EC\u04EC\364\370\366\374", ']', 'g', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        k = ((Integer)obj).intValue();
        l = b042804280428042804280428;
        InvocationTargetException invocationtargetexception1;
        try
        {
            if ((k * (i + j)) % l != b042804280428042804280428)
            {
                b042804280428042804280428 = 51;
                b042804280428042804280428 = 25;
            }
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return s;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
    }

    public String getFingerprint()
    {
        int i = b042804280428042804280428;
        String s;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            b042804280428042804280428 = 4;
            b042804280428042804280428 = 1;
            // fall through

        case 0: // '\0'
            s = fingerprint;
            break;
        }
label0:
        do
        {
            if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
            {
                b042804280428042804280428 = 46;
                b042804280428042804280428 = 6;
            }
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        return s;
    }

    public String getHardware()
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int j1;
        int l1;
        int i2;
        try
        {
            i = b042804280428042804280428;
            j = b042804280428042804280428;
            k = b042804280428042804280428;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        l = b042804280428042804280428;
        j1 = b042804280428042804280428;
        l1 = b042804280428042804280428;
        i2 = b042804280428042804280428;
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u022C\u05F2\u01FA\u01FE\u01FC\u0202\u01FA\u01FE\u01FC\u0202\u05F2\u05F2\u01FA\u01FE\u01FC\u0202", '\345', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((l + j1) * l1) % i2 != ((Integer)obj).intValue())
        {
            b042804280428042804280428 = 52;
            Object obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\225\u04DF\u04DF\307\303\305\317\u04DF\u04DF\307\303\305\317", '\367', '\002'), new Class[0]);
            Object obj2;
            int i1;
            int k1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj1).intValue();
        }
        i1 = b042804280428042804280428;
        k1 = b042804280428042804280428;
        if ((k * (i + j)) % i1 == k1)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        try
        {
            b042804280428042804280428 = 42;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\236\u0464\u0464lpnt\u0464\u0464lpnt", '<', '\005'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b042804280428042804280428 = i;
        obj1 = hardware;
        return ((String) (obj1));
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
    }

    public String getHost()
    {
        return host;
    }

    public String getID()
    {
        Object obj;
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            b042804280428042804280428 = 63;
            b042804280428042804280428 = 52;
        }
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            obj = ID;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        try
        {
            i = b042804280428042804280428;
            j = b042804280428042804280428;
            k = b042804280428042804280428;
            l = b042804280428042804280428;
            i1 = b042804280428042804280428;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\005\u044F\u044FWSU_\u044F\u044FWSU_", 'g', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b042804280428042804280428 = i;
        obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\375\u04B7\u04B7\257\253\255\247\u04B7\u04B7\257\253\255\247", '\237', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b042804280428042804280428 = i;
        return ((String) (obj));
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        return ((String) (obj));
    }

    public String getIMEI()
    {
        int i = b042804280428042804280428;
        int k = b042804280428042804280428;
        int l = b042804280428042804280428;
        int i1 = b042804280428042804280428;
        Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u02D5\u069B\u02A3\u02A7\u02A5\u02AB\u02A3\u02A7\u02A5\u02AB\u069B\u069B\u02A3\u02A7\u02A5\u02AB", '\321', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((i + k) * l) % i1 != ((Integer)obj).intValue())
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4C\u0312\u0312\uFF1A\uFF1E\uFF1C\uFF22\u0312\u0312\uFF1A\uFF1E\uFF1C\uFF22", '\213', '\003'), new Class[0]);
            Object obj2;
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj1).intValue();
            b042804280428042804280428 = 24;
        }
        try
        {
            obj1 = IMEI;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        j = b042804280428042804280428;
        switch ((j * (b042804280428042804280428 + j)) % b042804280428042804280428)
        {
        default:
            b042804280428042804280428 = 52;
            obj2 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF76\u033C\u033C\uFF44\uFF48\uFF46\uFF4C\u033C\u033C\uFF44\uFF48\uFF46\uFF4C", '\n', '\342', '\0'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042804280428042804280428 = ((Integer)obj2).intValue();
            // fall through

        case 0: // '\0'
            return ((String) (obj1));
        }
    }

    public String getIncremental()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public String getManufacturer()
    {
        int i = 0;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        catch (Exception exception) { }
        String s;
        try
        {
            b042804280428042804280428 = 19;
            s = manufacturer;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return s;
    }

    public String getModel()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public String getNetworkOperator()
    {
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF90\u0356\u0356\uFF5E\uFF62\uFF60\uFF66\u0356\u0356\uFF5E\uFF62\uFF60\uFF66", 'i', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA2\u0268\u0268\uFE70\uFE74\uFE72\uFE78\u0268\u0268\uFE70\uFE74\uFE72\uFE78", '\340', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
        }
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        return networkOperator;
    }

    public String getNetworkOperatorName()
    {
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u0320\u06E6\u06E6\u02EE\u02F2\u02F0\u02F6\u06E6\u06E6\u02EE\u02F2\u02F0\u02F6", '\352', '\006'), new Class[0]);
            Object obj1;
            Object obj2;
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            b042804280428042804280428 = 72;
        }
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        try
        {
            obj = networkOperatorName;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        i = b042804280428042804280428;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            obj2 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("A\u0407\u0407\017\023\021\027\u0407\u0407\017\023\021\027", 'd', '\205', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b042804280428042804280428 = ((Integer)obj2).intValue();
            obj2 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\337\u04A5\u04A5\255\261\257\265\u04A5\u04A5\255\261\257\265", '\223', '\026', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b042804280428042804280428 = ((Integer)obj2).intValue();
            // fall through

        case 0: // '\0'
            return ((String) (obj));
        }
    }

    public int getNetworkType()
    {
        int i = 4;
_L2:
        i /= 0;
        int k = b042804280428042804280428;
        switch ((k * (b042804280428042804280428 + k)) % b042804280428042804280428)
        {
        case 0: // '\0'
            if (false)
            {
            }
            break;

        default:
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u016E\u0534\u0534\u013C\u0140\u013E\u0144\u0534\u0534\u013C\u0140\u013E\u0144", '\206', '\001'), new Class[0]);
            Object obj1;
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFEB8\u027E\u027E\uFE86\uFE8A\uFE88\uFE8E\u027E\u027E\uFE86\uFE8A\uFE88\uFE8E", '\352', '\300', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            break;
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        b042804280428042804280428 = 39;
_L4:
        obj1 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\u0120\u0119\u0122\u011B\u0128\u011C", '\264', '\005'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        ((Integer)obj1).intValue();
        continue; /* Loop/switch isn't completed */
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u010C\u04D2\u04D2\332\336\334\342\u04D2\u04D2\332\336\334\342", '\252', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b042804280428042804280428 = ((Integer)obj1).intValue();
            try
            {
                j = networkType;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
            return j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getProduct()
    {
        Object obj;
        int i = b042804280428042804280428;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u01A0\u0566\u0566\u016E\u0172\u0170\u0176\u0566\u0566\u016E\u0172\u0170\u0176", 'j', '\006'), new Class[0]);
            Object obj1;
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            b042804280428042804280428 = 39;
            break;

        case 0: // '\0'
            break;
        }
        obj = product;
        try
        {
            j = b042804280428042804280428;
            k = b042804280428042804280428;
            l = b042804280428042804280428;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 124
    //                   0 195;
           goto _L1 _L2
_L1:
        obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u0218\u05DE\u05DE\u01E6\u01EA\u01E8\u01EE\u05DE\u05DE\u01E6\u01EA\u01E8\u01EE", '\222', '\006'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        try
        {
            b042804280428042804280428 = j;
            b042804280428042804280428 = 58;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return ((String) (obj));
        obj;
        throw obj;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
_L2:
        return ((String) (obj));
    }

    public String getRadioVersion()
    {
        Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFEEB\u02B1\u02B1\uFEB9\uFEBD\uFEBB\uFEC1\u02B1\u02B1\uFEB9\uFEBD\uFEBB\uFEC1", '}', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int i = ((Integer)obj).intValue();
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            j = b042804280428042804280428;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDB\u03A1\u03A1\uFFA9\uFFAD\uFFAB\uFFB1\u03A1\u03A1\uFFA9\uFFAD\uFFAB\uFFB1", '\207', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        k = ((Integer)obj).intValue();
        try
        {
            l = b042804280428042804280428;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\373\u04C1\u04C1\311\315\313\321\u04C1\u04C1\311\315\313\321", 'R', 'G', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        i1 = ((Integer)obj).intValue();
        j1 = b042804280428042804280428;
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\363\u04B9\u04B9\301\305\303\311\u04B9\u04B9\301\305\303\311", 'I', '\332', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if ((((Integer)obj).intValue() * (j1 + i1)) % b042804280428042804280428 != b042804280428042804280428)
        {
            b042804280428042804280428 = 72;
            b042804280428042804280428 = 71;
        }
        i1 = b042804280428042804280428;
        if ((k * (j + i)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFEAB\u0271\u0271\uFE79\uFE7D\uFE7B\uFE81\u0271\u0271\uFE79\uFE7D\uFE7B\uFE81", '\324', '\343', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042804280428042804280428 = i;
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFEB2\u0278\u0278\uFE80\uFE84\uFE82\uFE88\u0278\u0278\uFE80\uFE84\uFE82\uFE88", '\220', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042804280428042804280428 = i;
        obj = radioVersion;
        break MISSING_BLOCK_LABEL_351;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        return ((String) (obj));
    }

    public String getRelease()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public String getSdk()
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        return sdk;
    }

    public String getSdkINT()
    {
        int i = b042804280428042804280428;
        Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE6\uFFB4\uFFB8\uFFB6\uFFBC\u03AC\u03AC\u03AC\uFFB4\uFFB8\uFFB6\uFFBC\uFFB4\uFFB8\uFFB6\uFFBC", '|', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            b042804280428042804280428 = 1;
            Object obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\307\u048D\u048D\225\231\227\235\u048D\u048D\225\231\227\235", 'e', '\005'), new Class[0]);
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj1).intValue();
        }
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
label1:
                    switch (1)
                    {
                    case 0: // '\0'
                        break;

                    default:
label2:
                        while (true) 
                        {
                            switch (1)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label1;

                            case 1: // '\001'
                                break label2;
                            }
                        }
                        // fall through

                    case 1: // '\001'
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        j = b042804280428042804280428;
        switch ((j * (b042804280428042804280428 + j)) % b042804280428042804280428)
        {
        default:
            b042804280428042804280428 = 35;
            b042804280428042804280428 = 72;
            // fall through

        case 0: // '\0'
            return sdkINT;
        }
    }

    public String getSerial()
    {
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 == b042804280428042804280428)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        b042804280428042804280428 = 9;
        Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7B\u0341\u0341\uFF49\uFF4D\uFF4B\uFF51\u0341\u0341\uFF49\uFF4D\uFF4B\uFF51", '\347', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int i = ((Integer)obj).intValue();
        InvocationTargetException invocationtargetexception;
        try
        {
            b042804280428042804280428 = i;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            b042804280428042804280428 = 48;
            b042804280428042804280428 = 48;
        }
        try
        {
            obj = serial;
        }
        catch (Exception exception1)
        {
            try
            {
                throw exception1;
            }
            catch (Exception exception2)
            {
                throw exception2;
            }
        }
        return ((String) (obj));
        invocationtargetexception;
        throw invocationtargetexception.getCause();
    }

    public String getSimOperator()
    {
        int i = b042804280428042804280428;
        String s;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            b042804280428042804280428 = 83;
            b042804280428042804280428 = 20;
            // fall through

        case 0: // '\0'
            s = simOperator;
            break;
        }
        i = b042804280428042804280428;
        int j = b042804280428042804280428;
        int k = b042804280428042804280428;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        switch ((i * (j + i)) % k)
        {
        default:
            b042804280428042804280428 = 14;
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u01D0\u0596\u0596\u019E\u01A2\u01A0\u01A6\u0596\u0596\u019E\u01A2\u01A0\u01A6", '\267', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            return s;
        }
    }

    public String getSimSerialNumber()
    {
        int i = b042804280428042804280428;
        int j = b042804280428042804280428;
        int k = b042804280428042804280428;
        int l = b042804280428042804280428;
        switch ((l * (b042804280428042804280428 + l)) % b042804280428042804280428)
        {
        default:
            b042804280428042804280428 = 36;
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF91\u0357\u0357\uFF5F\uFF63\uFF61\uFF67\u0357\u0357\uFF5F\uFF63\uFF61\uFF67", '\336', '\r', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (((j + i) * k) % b042804280428042804280428 != b042804280428042804280428)
        {
            b042804280428042804280428 = 41;
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\335\u0497\u0497\217\213\215\207\u0497\u0497\217\213\215\207", '\277', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
        }
        obj = simSerialNumber;
        1;
        JVM INSTR tableswitch 0 1: default 184
    //                   0 161
    //                   1 211;
           goto _L1 _L2 _L3
_L2:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 236
    //                   0 263
    //                   1 161;
           goto _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_161;
_L7:
        return ((String) (obj));
    }

    public long getTime()
    {
        Object obj;
        InvocationTargetException invocationtargetexception;
        int i;
        int j;
        long l;
        try
        {
            i = b042804280428042804280428;
            j = b042804280428042804280428;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u0168\u0136\u013A\u0138\u013E\u052E\u0136\u013A\u0138\u013E\u052E\u052E\u0136\u013A\u0138\u013E", '\203', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((j + i) * i) % ((Integer)obj).intValue();
        JVM INSTR tableswitch 0 0: default 68
    //                   0 255;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_255;
_L1:
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u0146\u050C\u050C\u0114\u0118\u0116\u011C\u050C\u050C\u0114\u0118\u0116\u011C", '\344', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042804280428042804280428 = i;
        obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\245\u046B\u046Bswu{\u046B\u046Bswu{", 'f', '#', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042804280428042804280428 = i;
        if (((b042804280428042804280428 + b042804280428042804280428) * b042804280428042804280428) % b042804280428042804280428 != b042804280428042804280428)
        {
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\u0224\u05EA\u05EA\u01F2\u01F6\u01F4\u01FA\u05EA\u05EA\u01F2\u01F6\u01F4\u01FA", '\226', '\006'), new Class[0]);
            Object obj1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFEBB\u0281\u0281\uFE89\uFE8D\uFE8B\uFE91\u0281\u0281\uFE89\uFE8D\uFE8B\uFE91", '\215', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
        }
        l = time;
        return l;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj1;
        throw obj1;
    }

    public String getWifiMacAddress()
    {
        int i = b042804280428042804280428;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\034\u03E2\u03E2\uFFEA\uFFEE\uFFEC\uFFF2\u03E2\u03E2\uFFEA\uFFEE\uFFEC\uFFF2", 'F', '\0'), new Class[0]);
            Object obj1;
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            b042804280428042804280428 = 77;
            // fall through

        case 0: // '\0'
            j = b042804280428042804280428;
            break;
        }
        switch ((j * (b042804280428042804280428 + j)) % b042804280428042804280428)
        {
        default:
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\242\u0468\u0468ptrx\u0468\u0468ptrx", '@', '\005'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\000\u03C6\u03C6\uFFCE\uFFD2\uFFD0\uFFD6\u03C6\u03C6\uFFCE\uFFD2\uFFD0\uFFD6", 'E', '\247', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b042804280428042804280428 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            obj = wifiMacAddress;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        return ((String) (obj));
    }

    public void setDfpSessionID(String s)
    {
        dfpSessionID = s;
    }

    public String toString()
    {
        Object obj = new StringBuilder();
        Object obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("`oodmc", '\001', '\0'), new Class[] {
            java/lang/String
        });
        Method method;
        int i;
        int k;
        int l;
        long l1;
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                "DeviceData{serial='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = serial;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF53\uFF62\uFF62\uFF57\uFF60\uFF56", '\207', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCE\uFFDD\uFFDD\uFFD2\uFFDB\uFFD1", '\004', '\217', '\0'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFEE9\uFEF8\uFEF8\uFEED\uFEF6\uFEEC", '\376', 'z', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", androidID='"
            });
        }
        catch (InvocationTargetException invocationtargetexception4)
        {
            throw invocationtargetexception4.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = androidID;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\"33&-'", 'C', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        catch (InvocationTargetException invocationtargetexception5)
        {
            throw invocationtargetexception5.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB1\uFFC0\uFFC0\uFFB5\uFFBE\uFFB4", '4', '\344', '\002'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        catch (InvocationTargetException invocationtargetexception6)
        {
            throw invocationtargetexception6.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("y\210\210}\206|", '\325', '\275', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", IMEI='"
            });
        }
        catch (InvocationTargetException invocationtargetexception7)
        {
            throw invocationtargetexception7.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = IMEI;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\257\276\276\263\274\262", 'D', '\222', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u019D\u01AC\u01AC\u01A1\u01AA\u01A0", '\236', '\001'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("BQQFOE", 'C', '$', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", dfpSessionID='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = dfpSessionID;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u018D\u019C\u019C\u0191\u019A\u0190", 'd', '\006'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        catch (InvocationTargetException invocationtargetexception8)
        {
            throw invocationtargetexception8.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF68\uFF77\uFF77\uFF6C\uFF75\uFF6B", '\371', '\0'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        catch (InvocationTargetException invocationtargetexception9)
        {
            throw invocationtargetexception9.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0100\u010F\u010F\u0104\u010D\u0103", '6', 'i', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", fingerprint='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = fingerprint;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("_nnclb", '\320', '\316', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\326\345\345\332\343\331", 'u', '\005'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u014B\u015A\u015A\u014F\u0158\u014E", 'u', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", release='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = release;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\221\240\240\225\236\224", '0', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA3\uFFB2\uFFB2\uFFA7\uFFB0\uFFA6", '\276', '\0'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u01C3\u01D2\u01D2\u01C7\u01D0\u01C6", 'v', '\006'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", wifiMacAddress='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = wifiMacAddress;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\304\323\323\310\321\307", 'c', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFECF\uFEDE\uFEDE\uFED3\uFEDC\uFED2", '\311', '\003'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("P__T]S", '\021', '"', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", blueToothAddress='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = blueToothAddress;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDE\uFFED\uFFED\uFFE2\uFFEB\uFFE1", '\207', '\004', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF60\uFF6F\uFF6F\uFF64\uFF6D\uFF63", '\t', '\370', '\0'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDC\uFFEB\uFFEB\uFFE0\uFFE9\uFFDF", 'Z', '+', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", simSerialNumber='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        i = b042804280428042804280428;
        switch ((i * (b042804280428042804280428 + i)) % b042804280428042804280428)
        {
        default:
            b042804280428042804280428 = 38;
            b042804280428042804280428 = 56;
            // fall through

        case 0: // '\0'
            obj1 = simSerialNumber;
            break;
        }
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA4\uFFB3\uFFB3\uFFA8\uFFB1\uFFA7", '\275', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("s\202\202w\200v", '\325', '\303', '\002'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF73\uFF82\uFF82\uFF77\uFF80\uFF76", '\031', '\325', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", simOperator='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = simOperator;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\337\356\356\343\354\342", '*', '\006'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0131\u0140\u0140\u0135\u013E\u0134", '\n', '\306', '\003'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\244\265\265\240\253\241", '\305', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", bootloader='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = bootloader;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0171\u0180\u0180\u0175\u017E\u0174", '\210', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        catch (InvocationTargetException invocationtargetexception3)
        {
            throw invocationtargetexception3.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA1\uFFB0\uFFB0\uFFA5\uFFAE\uFFA4", '\274', '\004', '\0'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("=LLAJ@", '\301', '\235', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", brand='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = brand;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\211\230\230\215\226\214", '(', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417(".==2;1", '\200', 'M', '\001'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF6\005\005\uFFFA\003\uFFF9", '_', '\f', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", device='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = device;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB5\uFFC4\uFFC4\uFFB9\uFFC2\uFFB8", '2', 'z', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u02E9\u02F8\u02F8\u02ED\u02F6\u02EC", '\330', '\006'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF47\uFF56\uFF56\uFF4B\uFF54\uFF4A", '^', '\004'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", host='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = host;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u01CD\u01DC\u01DC\u01D1\u01DA\u01D0", '\277', '\255', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0145\u0154\u0154\u0149\u0152\u0148", '\360', '\f', '\002'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("_nnclb", '\035', '\033', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", ID='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = ID;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9B\uFFAA\uFFAA\uFF9F\uFFA8\uFF9E", 'B', '\004'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u021D\u022C\u022C\u0221\u022A\u0220", '\336', '\001'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFEF7\uFF06\uFF06\uFEFB\uFF04\uFEFA", '\265', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", sdk='"
            });
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = sdk;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\261\300\300\265\276\264", 'P', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\211\230\230\215\206\214", '\350', '\002'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("jyynwm", '\t', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", sdkINT='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = sdkINT;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\013\032\032\017\004\016", 'j', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u012D\u013C\u013C\u0131\u013A\u0130", '\314', '\005'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u01CF\u01DE\u01DE\u01D3\u01DC\u01D2", 'z', '\006'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", radioVersion='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = radioVersion;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0178\u0187\u0187\u017C\u0185\u017B", ']', '\006'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF86\uFF95\uFF95\uFF8A\uFF93\uFF89", 'I', '\004'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\241\260\260\245\256\244", '@', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", product='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = product;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("#22'0&", '\037', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEF\uFFFE\uFFFE\uFFF3\uFFFC\uFFF2", 'r', '\0'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0134\u0143\u0143\u0138\u0141\u0137", '\024', '\277', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", time="
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        l1 = time;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\367\u0106\u0106\373\u0104\372", '\226', '\005'), new Class[] {
            Long.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Long.valueOf(l1)
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFE48\uFE57\uFE57\uFE4C\uFE55\uFE4B", '\263', '\004'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", cpuABI='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = cpuABI;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0139\u0148\u0148\u013D\u0146\u013C", 'l', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\300\317\317\304\315\303", '\257', 'P', '\002'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\216\235\235\222\233\221", '<', '\017', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", cpuABI2='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = cpuABI2;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\001\020\020\005\016\004", '0', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA3\uFFB2\uFFB2\uFFA7\uFFB0\uFFA6", '\276', '\0'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\243\262\262\247\260\246", '\032', '(', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", display='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = display;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8D\uFF9C\uFF9C\uFF91\uFF9A\uFF90", '\021', '\303', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u01D2\u01E1\u01E1\u01D6\u01DF\u01D5", '{', '\006'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\253\272\272\257\270\256", '%', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                ", networkOperatorName='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = networkOperatorName;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0160\u016F\u016F\u0164\u016D\u0163", 'U', '\006'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u02E6\u02F5\u02F5\u02EA\u02F3\u02E9", '\327', '\006'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        i = b042804280428042804280428;
        k = b042804280428042804280428;
        l = b042804280428042804280428;
        obj1 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF57\uFF25\uFF29\uFF27\uFF2D\u031D\uFF25\uFF29\uFF27\uFF2D\u031D\u031D\uFF25\uFF29\uFF27\uFF2D", 'Y', '\004'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        if ((l * (i + k)) % ((Integer)obj1).intValue() != b042804280428042804280428)
        {
            Object obj2 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("O\u0415\u0415\035!\037%\u0415\u0415\035!\037%", 'n', '[', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception10;
            Method method1;
            int j;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception11)
            {
                throw invocationtargetexception11.getCause();
            }
            b042804280428042804280428 = ((Integer)obj2).intValue();
            obj2 = com/visa/cbp/sdk/facade/data/DeviceData.getMethod(nuuuuu.b0417041704170417041704170417("\036\u03E4\u03E4\uFFEC\uFFF0\uFFEE\uFFF4\u03E4\u03E4\uFFEC\uFFF0\uFFEE\uFFF4", '"', '\003'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception12)
            {
                throw invocationtargetexception12.getCause();
            }
            b042804280428042804280428 = ((Integer)obj2).intValue();
        }
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0201\u0210\u0210\u0205\u020E\u0204", '\320', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                ", networkOperator='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = networkOperator;
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF16\uFF25\uFF25\uFF1A\uFF23\uFF19", '\200', '\313', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method1.invoke(obj, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("n}}r{q", 'B', 'O', '\001'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\353\372\372\357\370\356", '\212', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                ", networkType="
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        j = networkType;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\001\020\020\005\016\004", '0', '\003'), new Class[] {
            Integer.TYPE
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                Integer.valueOf(j)
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("M\\\\QZP", '\n', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                ", incremental='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = incremental;
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF17\uFF26\uFF26\uFF1B\uFF24\uFF1A", '\245', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method1.invoke(obj, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6D\uFF7C\uFF7C\uFF71\uFF7A\uFF70", '\364', '\0'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("IXXMVL", '\327', '\277', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                ", manufacture='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = manufacturer;
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("}\214\214\201\212\200", '\016', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method1.invoke(obj, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("6EE:C9", '\251', '\324', '\002'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF41\uFF50\uFF50\uFF45\uFF4E\uFF44", '`', '\004'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                ", hardware='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = hardware;
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0106\u0115\u0115\u010A\u0113\u0109", '\245', '\005'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method1.invoke(obj, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0140\u014F\u014F\u0144\u014D\u0143", 'C', '\234', '\003'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF88\uFF97\uFF97\uFF8C\uFF95\uFF8B", 'K', '\216', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                ", model='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = model;
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\261\240\240\265\276\264", '\320', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method1.invoke(obj, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u01AD\u01BC\u01BC\u01B1\u01BA\u01B0", '\246', '\001'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("w\206\206{\204z", '\013', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                ", deviceName='"
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = deviceName;
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("YHH]V\\", '8', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method1.invoke(obj, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\003\022\022\007\020\006", '/', '\003'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                Character.valueOf('\'')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDF\uFFEE\uFFEE\uFFE3\uFFEC\uFFE2", 'A', '\003'), new Class[] {
            Character.TYPE
        });
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[] {
                Character.valueOf('}')
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("VQ5VTKPI", '>', ' ', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception10)
        {
            throw invocationtargetexception10.getCause();
        }
        return (String)obj;
    }
}
