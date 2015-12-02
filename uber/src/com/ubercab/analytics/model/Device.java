// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.analytics.model;

import android.content.Context;
import chn;
import cwt;
import cwy;
import java.util.Locale;
import java.util.MissingResourceException;

// Referenced classes of package com.ubercab.analytics.model:
//            Shape_Device

public abstract class Device
{

    public Device()
    {
    }

    public static Device create(Context context)
    {
        Shape_Device shape_device = new Shape_Device();
        shape_device.setCpuAbi(cwt.d());
        shape_device.setOs("android");
        shape_device.setId(cwt.a(context));
        shape_device.setOsVersion(cwt.e());
        shape_device.setModel(cwt.f());
        shape_device.setLanguage(getDeviceLanguage());
        shape_device.setRegionIso2(cwt.g());
        shape_device.setSerialNumber(cwt.c());
        shape_device.setCarrier(cwt.k(context));
        shape_device.setCarrierMcc(cwt.b(context));
        shape_device.setCarrierMnc(cwt.c(context));
        shape_device.setImeiNumber(cwt.f(context));
        shape_device.setVoiceover(cwt.l(context));
        shape_device.updateNetworkInfo(context);
        shape_device.updateBatteryInfo(context);
        shape_device.setUnknownSources(cwt.m(context));
        if (chn.c())
        {
            shape_device.setGooglePlayServicesStatus(cwy.a(context));
            shape_device.setGooglePlayServicesVersion(cwy.c(context));
        }
        return shape_device;
    }

    private static String getDeviceLanguage()
    {
        Object obj = Locale.getDefault();
        try
        {
            obj = ((Locale) (obj)).getLanguage();
        }
        catch (MissingResourceException missingresourceexception)
        {
            return null;
        }
        return ((String) (obj));
    }

    private void updateBatteryInfo(Context context)
    {
        setBatteryStatus(cwt.p(context));
        setBatteryLevel(cwt.q(context));
    }

    private void updateNetworkInfo(Context context)
    {
        setWifiConnected(cwt.n(context));
        setIpAddress(cwt.o(context));
    }

    abstract double getBatteryLevel();

    abstract String getBatteryStatus();

    abstract String getCarrier();

    abstract String getCarrierMcc();

    abstract String getCarrierMnc();

    abstract String getCpuAbi();

    abstract String getGooglePlayServicesStatus();

    abstract String getGooglePlayServicesVersion();

    abstract String getId();

    abstract String getImeiNumber();

    abstract String getIpAddress();

    abstract String getLanguage();

    abstract String getModel();

    abstract String getOs();

    abstract String getOsVersion();

    abstract String getRegionIso2();

    abstract String getSerialNumber();

    abstract boolean getUnknownSources();

    abstract boolean isVoiceover();

    abstract boolean isWifiConnected();

    abstract Device setBatteryLevel(double d);

    abstract Device setBatteryStatus(String s);

    abstract Device setCarrier(String s);

    abstract Device setCarrierMcc(String s);

    abstract Device setCarrierMnc(String s);

    abstract Device setCpuAbi(String s);

    abstract Device setGooglePlayServicesStatus(String s);

    abstract Device setGooglePlayServicesVersion(String s);

    abstract Device setId(String s);

    abstract Device setImeiNumber(String s);

    abstract Device setIpAddress(String s);

    abstract Device setLanguage(String s);

    abstract Device setModel(String s);

    abstract Device setOs(String s);

    abstract Device setOsVersion(String s);

    abstract Device setRegionIso2(String s);

    abstract Device setSerialNumber(String s);

    abstract Device setUnknownSources(boolean flag);

    abstract Device setVoiceover(boolean flag);

    abstract Device setWifiConnected(boolean flag);

    public void updateDevice(Context context)
    {
        updateNetworkInfo(context);
        updateBatteryInfo(context);
    }
}
