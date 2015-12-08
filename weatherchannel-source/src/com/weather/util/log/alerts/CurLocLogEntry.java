// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.log.alerts;

import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.util.log.alerts:
//            CurLocDataLogEntry

public class CurLocLogEntry
    implements CurLocDataLogEntry
{

    private final double lat;
    private final double lng;
    private final long timestamp;

    public CurLocLogEntry(double d, double d1, long l)
    {
        lat = d;
        lng = d1;
        timestamp = l;
    }

    public CurLocLogEntry(JSONObject jsonobject)
        throws JSONException
    {
        lat = jsonobject.getDouble("deviceLat");
        lng = jsonobject.getDouble("deviceLng");
        timestamp = (new Date()).getTime();
    }

    public double getDeviceLatitude()
    {
        return lat;
    }

    public double getDeviceLongitude()
    {
        return lng;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public JSONObject toJsonObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("deviceLat", lat);
        jsonobject.put("deviceLng", lng);
        jsonobject.put("timestamp", timestamp);
        return jsonobject;
    }
}
