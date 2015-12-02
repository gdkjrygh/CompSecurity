// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.internal.model;

import com.ubercab.crash.model.App;
import com.ubercab.crash.model.Carrier;
import com.ubercab.crash.model.Device;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.ubercab.crash.internal.model:
//            Shape_Request

public abstract class Request
{

    public Request()
    {
    }

    public static Request create(String s, Long long1, String s1, Device device, App app)
    {
        return (new Shape_Request()).setCrashUuid(s).setCrashTime(long1).setCommitHash(s1).setDevice(device).setApp(app);
    }

    public abstract List getAnalyticsLogs();

    public abstract App getApp();

    public abstract Carrier getCarrier();

    public abstract String getCity();

    public abstract String getCommitHash();

    public abstract List getConsoleLogs();

    public abstract String getCrashDump();

    public abstract Long getCrashTime();

    public abstract String getCrashUuid();

    public abstract Device getDevice();

    public abstract Set getExperiments();

    public abstract Double getLastMeasuredLat();

    public abstract Double getLastMeasuredLng();

    public abstract List getNetworkLogs();

    public abstract String getUserUuid();

    public abstract Request setAnalyticsLogs(List list);

    public abstract Request setApp(App app);

    public abstract Request setCarrier(Carrier carrier);

    public abstract Request setCity(String s);

    public abstract Request setCommitHash(String s);

    public abstract Request setConsoleLogs(List list);

    public abstract Request setCrashDump(String s);

    public abstract Request setCrashTime(Long long1);

    public abstract Request setCrashUuid(String s);

    public abstract Request setDevice(Device device);

    public abstract Request setExperiments(Set set);

    public abstract Request setLastMeasuredLat(Double double1);

    public abstract Request setLastMeasuredLng(Double double1);

    public abstract Request setNetworkLogs(List list);

    public abstract Request setUserUuid(String s);
}
