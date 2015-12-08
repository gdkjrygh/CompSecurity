// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.log.alerts;

import org.json.JSONException;
import org.json.JSONObject;

public interface CurLocDataLogEntry
{

    public static final String DEVICELAT = "deviceLat";
    public static final String DEVICELNG = "deviceLng";
    public static final String TIMESTAMP = "timestamp";

    public abstract double getDeviceLatitude();

    public abstract double getDeviceLongitude();

    public abstract long getTimestamp();

    public abstract JSONObject toJsonObject()
        throws JSONException;
}
