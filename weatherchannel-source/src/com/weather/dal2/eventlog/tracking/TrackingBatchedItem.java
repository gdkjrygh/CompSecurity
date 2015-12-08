// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.tracking;

import android.util.Log;
import com.weather.dal2.eventlog.batch.Batchable;
import com.weather.dal2.locations.SavedLocation;
import org.json.JSONException;
import org.json.JSONObject;

public class TrackingBatchedItem
    implements Batchable
{

    public static final String ACCURACY = "accuracy";
    public static final String ADDRESS = "address";
    public static final String COUNTRY_CODE = "countryCode";
    public static final String DMA = "dma";
    public static final String LAT = "lat";
    public static final String LNG = "lon";
    public static final String POSTAL_CODE = "postalCode";
    public static final String PRESSURE = "pressure";
    private static final String TAG = "TrackBatchedItem";
    public static final String TIME = "timestamp";
    public static final String TZ = "tz";
    private final double accuracy;
    private final String address;
    private final String countryCode;
    private final Integer dma;
    private final double lat;
    private final double lng;
    private final String postalCode;
    private final Double pressure;
    private final long time;
    private final long tz;

    public TrackingBatchedItem(double d, double d1, double d2, SavedLocation savedlocation, 
            Double double1)
    {
        int i = 0;
        super();
        time = System.currentTimeMillis();
        pressure = double1;
        lat = d;
        lng = d1;
        accuracy = d2;
        if (savedlocation != null)
        {
            tz = savedlocation.getGmtDiff();
            address = savedlocation.getAddress();
            postalCode = savedlocation.getZipCode();
            double1 = savedlocation.getDma();
            if (double1 != null)
            {
                i = double1.intValue();
            }
            dma = Integer.valueOf(i);
            countryCode = savedlocation.getCountryCode();
            return;
        } else
        {
            address = null;
            postalCode = null;
            dma = Integer.valueOf(0);
            tz = 0L;
            countryCode = null;
            return;
        }
    }

    public TrackingBatchedItem(JSONObject jsonobject)
        throws JSONException
    {
        Object obj1 = null;
        super();
        time = jsonobject.getLong("timestamp");
        lat = jsonobject.getDouble("lat");
        lng = jsonobject.getDouble("lon");
        accuracy = jsonobject.getDouble("accuracy");
        tz = jsonobject.getInt("tz");
        dma = Integer.valueOf(jsonobject.getInt("dma"));
        Object obj;
        if (jsonobject.has("address"))
        {
            obj = jsonobject.getString("address");
        } else
        {
            obj = null;
        }
        address = ((String) (obj));
        if (jsonobject.has("pressure"))
        {
            obj = Double.valueOf(jsonobject.getDouble("pressure"));
        } else
        {
            obj = null;
        }
        pressure = ((Double) (obj));
        if (jsonobject.has("postalCode"))
        {
            obj = jsonobject.getString("postalCode");
        } else
        {
            obj = null;
        }
        postalCode = ((String) (obj));
        obj = obj1;
        if (jsonobject.has("countryCode"))
        {
            obj = jsonobject.getString("countryCode");
        }
        countryCode = ((String) (obj));
    }

    private void appendToJsonIfNotNull(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        if (s1 != null && !s1.isEmpty())
        {
            jsonobject.put(s, s1);
        }
    }

    double getAccuracy()
    {
        return accuracy;
    }

    double getLat()
    {
        return lat;
    }

    double getLng()
    {
        return lng;
    }

    long getTime()
    {
        return time;
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("timestamp", getTime());
        jsonobject.put("lat", getLat());
        jsonobject.put("lon", getLng());
        jsonobject.put("accuracy", getAccuracy());
        jsonobject.put("tz", tz);
        jsonobject.put("dma", dma);
        if (pressure != null)
        {
            jsonobject.put("pressure", pressure);
        }
        appendToJsonIfNotNull(jsonobject, "address", address);
        appendToJsonIfNotNull(jsonobject, "postalCode", postalCode);
        appendToJsonIfNotNull(jsonobject, "countryCode", countryCode);
        return jsonobject;
    }

    public String toString()
    {
        String s;
        try
        {
            s = toJson().toString();
        }
        catch (JSONException jsonexception)
        {
            Log.w("TrackBatchedItem", (new StringBuilder()).append("Unable to build JSON object: ").append(jsonexception).toString());
            return "";
        }
        return s;
    }

    // Unreferenced inner class com/weather/dal2/eventlog/tracking/TrackingBatchedItem$TrackBatchedItemFactory
    /* block-local class not found */
    class TrackBatchedItemFactory {}

}
