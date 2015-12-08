// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;


public abstract class EnvironmentOrmCommon
{

    public EnvironmentOrmCommon()
    {
    }

    public abstract String getCarrier();

    public abstract String getDeviceID();

    public abstract Long getEnvTime();

    public abstract String getID();

    public abstract String getLanguage();

    public abstract String getManufacturer();

    public abstract String getMemory();

    public abstract String getModel();

    public abstract String getOSName();

    public abstract String getOSVersion();

    public abstract String getSDKVersion();

    public abstract String getTimeZone();

    public abstract void setCarrier(String s);

    public abstract void setDeviceID(String s);

    public abstract void setEnvTime(Long long1);

    public abstract void setID(String s);

    public abstract void setLanguage(String s);

    public abstract void setManufacturer(String s);

    public abstract void setMemory(String s);

    public abstract void setModel(String s);

    public abstract void setOSName(String s);

    public abstract void setOSVersion(String s);

    public abstract void setSDKVersion(String s);

    public abstract void setTimeZone(String s);
}
