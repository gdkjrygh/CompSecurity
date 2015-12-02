// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.param;

import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.request.param:
//            Shape_DeviceData

public abstract class DeviceData
{

    public DeviceData()
    {
    }

    public static DeviceData create()
    {
        return new Shape_DeviceData();
    }

    public abstract String getAndroidId();

    public abstract double getBatteryLevel();

    public abstract String getBatteryStatus();

    public abstract String getCarrier();

    public abstract String getCarrierMcc();

    public abstract String getCarrierMnc();

    public abstract float getCourse();

    public abstract String getCpuAbi();

    public abstract double getDeviceAltitude();

    public abstract Map getDeviceIds();

    public abstract double getDeviceLatitude();

    public abstract double getDeviceLongitude();

    public abstract String getDeviceModel();

    public abstract String getDeviceOs();

    public abstract float getHorizontalAccuracy();

    public abstract String getImsi();

    public abstract String getIpAddress();

    public abstract String getPhoneNumber();

    public abstract String getSimSerial();

    public abstract float getSpeed();

    public abstract String getVersion();

    public abstract boolean isEmulator();

    public abstract boolean isLocationServiceEnabled();

    public abstract boolean isMockGpsOn();

    public abstract boolean isRooted();

    public abstract boolean isUnknownSources();

    public abstract boolean isWifiConnected();

    public abstract DeviceData setAndroidId(String s);

    public abstract DeviceData setBatteryLevel(double d);

    public abstract DeviceData setBatteryStatus(String s);

    public abstract DeviceData setCarrier(String s);

    public abstract DeviceData setCarrierMcc(String s);

    public abstract DeviceData setCarrierMnc(String s);

    public abstract DeviceData setCourse(float f);

    public abstract DeviceData setCpuAbi(String s);

    public abstract DeviceData setDeviceAltitude(double d);

    public abstract DeviceData setDeviceIds(Map map);

    public abstract DeviceData setDeviceLatitude(double d);

    public abstract DeviceData setDeviceLongitude(double d);

    public abstract DeviceData setDeviceModel(String s);

    public abstract DeviceData setDeviceOs(String s);

    public abstract DeviceData setEmulator(boolean flag);

    public abstract DeviceData setHorizontalAccuracy(float f);

    public abstract DeviceData setImsi(String s);

    public abstract DeviceData setIpAddress(String s);

    public abstract DeviceData setLocationServiceEnabled(boolean flag);

    public abstract DeviceData setMockGpsOn(boolean flag);

    public abstract DeviceData setPhoneNumber(String s);

    public abstract DeviceData setRooted(boolean flag);

    public abstract DeviceData setSimSerial(String s);

    public abstract DeviceData setSpeed(float f);

    public abstract DeviceData setUnknownSources(boolean flag);

    public abstract DeviceData setVersion(String s);

    public abstract DeviceData setWifiConnected(boolean flag);
}
