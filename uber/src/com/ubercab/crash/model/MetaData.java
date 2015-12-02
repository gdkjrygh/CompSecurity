// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;

import java.util.Set;

// Referenced classes of package com.ubercab.crash.model:
//            Shape_MetaData, Carrier, Device

public abstract class MetaData
{

    public MetaData()
    {
    }

    public static MetaData create(ApplicationName applicationname, String s, String s1, String s2, String s3, String s4, Long long1, Double double1, 
            Double double2, String s5)
    {
        return (new Shape_MetaData()).setAppType(applicationname).setAppId(s).setUserUuid(s1).setTimestamp(long1).setLatitude(double1).setLongitude(double2).setCity(s5).setCrashedVersion(s2).setBuildSku(s3).setCommitHash(s4);
    }

    public abstract String getAppId();

    public abstract ApplicationName getAppType();

    public abstract String getBuildSku();

    public abstract Carrier getCarrier();

    public abstract String getCity();

    public abstract String getCommitHash();

    public abstract String getCrashedVersion();

    public abstract Device getDevice();

    public abstract Set getExperiments();

    public abstract Double getLatitude();

    public abstract Double getLongitude();

    public abstract Long getTimestamp();

    public abstract String getUserUuid();

    abstract MetaData setAppId(String s);

    abstract MetaData setAppType(ApplicationName applicationname);

    abstract MetaData setBuildSku(String s);

    public abstract MetaData setCarrier(Carrier carrier);

    abstract MetaData setCity(String s);

    abstract MetaData setCommitHash(String s);

    abstract MetaData setCrashedVersion(String s);

    public abstract MetaData setDevice(Device device);

    public abstract MetaData setExperiments(Set set);

    abstract MetaData setLatitude(Double double1);

    abstract MetaData setLongitude(Double double1);

    abstract MetaData setTimestamp(Long long1);

    abstract MetaData setUserUuid(String s);
}
