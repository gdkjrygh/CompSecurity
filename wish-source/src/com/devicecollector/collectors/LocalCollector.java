// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import com.devicecollector.DataCollection;
import com.devicecollector.util.HashUtils;
import com.devicecollector.util.JSONUtils;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

// Referenced classes of package com.devicecollector.collectors:
//            CollectorEnum, SoftErrorCode

public class LocalCollector
{
    private static final class DeviceIDType extends Enum
    {

        private static final DeviceIDType $VALUES[];
        public static final DeviceIDType ANDROID_ID;
        public static final DeviceIDType ANDROID_SERIAL;
        public static final DeviceIDType MAC_HASH;
        public static final DeviceIDType UID;

        public static DeviceIDType valueOf(String s)
        {
            return (DeviceIDType)Enum.valueOf(com/devicecollector/collectors/LocalCollector$DeviceIDType, s);
        }

        public static DeviceIDType[] values()
        {
            return (DeviceIDType[])$VALUES.clone();
        }

        static 
        {
            ANDROID_ID = new DeviceIDType("ANDROID_ID", 0);
            ANDROID_SERIAL = new DeviceIDType("ANDROID_SERIAL", 1);
            MAC_HASH = new DeviceIDType("MAC_HASH", 2);
            UID = new DeviceIDType("UID", 3);
            $VALUES = (new DeviceIDType[] {
                ANDROID_ID, ANDROID_SERIAL, MAC_HASH, UID
            });
        }

        private DeviceIDType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String KOUNT_KEY = "lic";
    private static final String KOUNT_PREF_FILE = "k_prefs";
    private Context context;
    private DataCollection dataCollection;

    public LocalCollector(Activity activity, DataCollection datacollection)
    {
        dataCollection = datacollection;
        context = activity.getApplicationContext();
    }

    private String getPersistedDeviceCookies()
    {
        String s = null;
        SharedPreferences sharedpreferences = context.getSharedPreferences("k_prefs", 0);
        if (sharedpreferences != null)
        {
            s = sharedpreferences.getString("lic", null);
        }
        return s;
    }

    private HashMap getProxyPeircingInfo()
    {
        HashMap hashmap;
        hashmap = new HashMap();
        if (android.os.Build.VERSION.SDK_INT <= 8)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        Log.d("PROXY_PEIRCE", "[LocalCollector]Newer API...");
        Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
_L4:
        NetworkInterface networkinterface;
        byte abyte0[];
        do
        {
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break MISSING_BLOCK_LABEL_203;
                }
                networkinterface = (NetworkInterface)enumeration.nextElement();
            } while (!networkinterface.isUp());
            Log.d("NETWORK", (new StringBuilder()).append("[LocalCollector]NETWORK:").append(networkinterface.getName()).append(":").append(networkinterface.isVirtual()).toString());
            abyte0 = networkinterface.getHardwareAddress();
        } while (abyte0 == null);
        StringBuffer stringbuffer;
        int j;
        stringbuffer = new StringBuffer();
        j = abyte0.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append(String.format("%02X", new Object[] {
            Byte.valueOf(abyte0[i])
        }));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        hashmap.put(networkinterface.getName(), stringbuffer.toString());
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        dataCollection.addError(CollectorEnum.MAC_ADDRESS, SoftErrorCode.SERVICE_UNAVAILABLE);
        Log.d("network_mac", "[LocalCollector]Bad socket connection, skipping");
        return hashmap;
        obj;
        dataCollection.addError(CollectorEnum.MAC_ADDRESS, SoftErrorCode.PERMISSION_DENIED);
        Log.d("network_mac", "[LocalCollector]Permission Denied, skipping");
        return hashmap;
    }

    private HashMap getWifiMacInfo()
    {
        HashMap hashmap = new HashMap();
        WifiInfo wifiinfo;
        try
        {
            wifiinfo = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
        }
        catch (SecurityException securityexception)
        {
            Log.d("wifi_mac", "[LocalCollector]WIFI PERMISSION DENIED");
            return hashmap;
        }
        if (wifiinfo == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (wifiinfo.getMacAddress() == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        hashmap.put("wifi_mac", wifiinfo.getMacAddress().replace(":", ""));
        return hashmap;
        Log.d("wifi_mac", "[LocalCollector]WIFI not enabled, skipping");
        return hashmap;
    }

    private void saveDeviceCookies(String s)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("k_prefs", 0).edit();
        editor.putString("lic", s);
        editor.commit();
    }

    public void collectDeviceId()
    {
        String s2 = getPersistedDeviceCookies();
        HashMap hashmap = new HashMap();
        String s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        Log.d("LocalCollector", (new StringBuilder()).append("ANDROID_ID:").append(s).toString());
        hashmap.put(DeviceIDType.ANDROID_ID.name(), HashUtils.convertToSha256Hash((new StringBuilder()).append(DeviceIDType.ANDROID_ID.name()).append(s).toString()));
        if (android.os.Build.VERSION.SDK_INT > 8)
        {
            hashmap.put(DeviceIDType.ANDROID_SERIAL.name(), HashUtils.convertToSha256Hash((new StringBuilder()).append(DeviceIDType.ANDROID_SERIAL.name()).append(Build.SERIAL).toString()));
        }
        s = getMacArray();
        if (s != null)
        {
            hashmap.put(DeviceIDType.MAC_HASH.name(), HashUtils.convertToSha256Hash((new StringBuilder()).append(DeviceIDType.MAC_HASH.name()).append(s).toString()));
        }
        String s1 = null;
        s = s1;
        if (s2 != null)
        {
            s = s1;
            if (s2.contains(DeviceIDType.UID.name()))
            {
                try
                {
                    int i = s2.indexOf(DeviceIDType.UID.name()) + DeviceIDType.UID.name().length() + 3;
                    s = s2.substring(i, s2.indexOf('"', i));
                }
                catch (IndexOutOfBoundsException indexoutofboundsexception)
                {
                    indexoutofboundsexception = s1;
                }
            }
        }
        s1 = s;
        if (s == null)
        {
            s1 = HashUtils.convertToSha256Hash((new StringBuilder()).append(DeviceIDType.UID.name()).append(UUID.randomUUID().toString()).toString());
        }
        hashmap.put(DeviceIDType.UID.name(), s1);
        if (hashmap.size() == 0)
        {
            dataCollection.addError(CollectorEnum.DEVICE_COOKIE, SoftErrorCode.UNEXPECTED);
            return;
        }
        s = JSONUtils.JSONifyMap(hashmap);
        dataCollection.addMobileData(com.devicecollector.DataCollection.PostElement.DEVICE_COOKIE, s);
        if (s2 != null && s2.length() > 0)
        {
            dataCollection.addMobileData(com.devicecollector.DataCollection.PostElement.OLD_DEVICE_COOKIE, s2);
        }
        saveDeviceCookies(s);
    }

    public void collectOptionalInfo()
    {
        dataCollection.addMobileData(com.devicecollector.DataCollection.PostElement.OS_VERSION, android.os.Build.VERSION.RELEASE);
    }

    public void collectRequiredInfo()
    {
        dataCollection.addMobileData(com.devicecollector.DataCollection.PostElement.SDK_TYPE, "A");
        dataCollection.addMobileData(com.devicecollector.DataCollection.PostElement.SDK_VERSION, "2.5");
        dataCollection.addMobileData(com.devicecollector.DataCollection.PostElement.MOBILE_MODEL, Build.FINGERPRINT);
    }

    public String getMacArray()
    {
        HashMap hashmap = getWifiMacInfo();
        hashmap.putAll(getProxyPeircingInfo());
        Object obj = new TreeSet(hashmap.values());
        if (((SortedSet) (obj)).size() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder("{");
            String s;
            for (obj = ((SortedSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append((new StringBuilder()).append(s).append(",").toString()))
            {
                s = (String)((Iterator) (obj)).next();
            }

            stringbuilder.append("}");
            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }
}
