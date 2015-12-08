// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;


public interface FileUploadPreferences
{

    public static final int BATTERY_USAGE_CHARGING_ONLY = 257;
    public static final int BATTERY_USAGE_UNRESTRICTED = 256;
    public static final int NETWORK_TYPE_ANY = 1;
    public static final int NETWORK_TYPE_WIFI_ONLY = 2;
    public static final int PREFERENCE_VALUE_UNKNOWN = 0;

    public abstract int getBatteryUsagePreference();

    public abstract int getNetworkTypePreference();

    public abstract boolean isRoamingAllowed();

    public abstract void setBatteryUsagePreference(int i);

    public abstract void setNetworkTypePreference(int i);

    public abstract void setRoamingAllowed(boolean flag);
}
