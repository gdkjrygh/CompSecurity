// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.log.alerts;

import android.location.Location;
import com.google.common.base.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.util.log.alerts:
//            CurLocDataLogEntry

public class AlertLogEntry
    implements CurLocDataLogEntry
{

    public static final String ALERTLAT = "alertLat";
    public static final String ALERTLNG = "alertLng";
    public static final String ALERTTYPE = "alertType";
    public static final String ENDPOINT = "endPointId";
    public static final String GCMTOKEN = "gcmToken";
    public static final String PAYLOAD = "payload";
    public static final String USERID = "userId";
    private final double alertLat;
    private final double alertLng;
    private final String alertType;
    private final double deviceLat;
    private final double deviceLng;
    private final String endPointId;
    private final String gcmToken;
    private final String payload;
    private final long timestamp;
    private final String userId;

    public AlertLogEntry(Location location, Location location1, long l, String s, String s1, String s2, 
            String s3, String s4)
    {
        Preconditions.checkNotNull(location);
        Preconditions.checkNotNull(location1);
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        Preconditions.checkNotNull(s2);
        Preconditions.checkNotNull(s3);
        Preconditions.checkNotNull(s4);
        alertLat = location.getLatitude();
        deviceLat = location1.getLatitude();
        deviceLng = location1.getLongitude();
        alertLng = location.getLongitude();
        timestamp = l;
        alertType = s;
        payload = s1;
        gcmToken = s2;
        userId = s3;
        endPointId = s4;
    }

    public AlertLogEntry(JSONObject jsonobject)
        throws JSONException
    {
        alertLat = jsonobject.getDouble("alertLat");
        deviceLat = jsonobject.getDouble("deviceLat");
        deviceLng = jsonobject.getDouble("deviceLng");
        alertLng = jsonobject.getDouble("alertLng");
        timestamp = jsonobject.getLong("timestamp");
        alertType = jsonobject.getString("alertType");
        payload = jsonobject.getString("payload");
        gcmToken = jsonobject.getString("gcmToken");
        userId = jsonobject.getString("userId");
        endPointId = jsonobject.getString("endPointId");
    }

    public double getAlertLatitude()
    {
        return alertLat;
    }

    public double getAlertLongitude()
    {
        return alertLng;
    }

    public String getAlertType()
    {
        return alertType;
    }

    public double getDeviceLatitude()
    {
        return deviceLat;
    }

    public double getDeviceLongitude()
    {
        return deviceLng;
    }

    public Integer getDistanceToAlertLocation()
    {
        Object obj = null;
        if (hasDistance())
        {
            obj = new Location("from");
            ((Location) (obj)).setLatitude(deviceLat);
            ((Location) (obj)).setLongitude(deviceLng);
            Location location = new Location("to");
            location.setLatitude(alertLat);
            location.setLongitude(alertLng);
            obj = Integer.valueOf((int)((Location) (obj)).distanceTo(location));
        }
        return ((Integer) (obj));
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public String getUserId()
    {
        return userId;
    }

    public boolean hasDistance()
    {
        return alertType.equals("followme-precip") || alertType.equals("followme-lightning");
    }

    public JSONObject toJsonObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("deviceLat", deviceLat);
        jsonobject.put("deviceLng", deviceLng);
        jsonobject.put("alertLat", alertLat);
        jsonobject.put("alertLng", alertLng);
        jsonobject.put("timestamp", timestamp);
        jsonobject.put("alertType", alertType);
        jsonobject.put("payload", payload);
        jsonobject.put("gcmToken", gcmToken);
        jsonobject.put("userId", userId);
        jsonobject.put("endPointId", endPointId);
        return jsonobject;
    }
}
