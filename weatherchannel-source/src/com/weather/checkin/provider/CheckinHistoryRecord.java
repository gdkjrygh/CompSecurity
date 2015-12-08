// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.checkin.provider;

import com.google.common.base.Preconditions;

public class CheckinHistoryRecord
{

    private final String id;
    private final String imagePath;
    private final double latitude;
    private final String locationName;
    private final double longitude;
    private final Integer temperatureCelsius;
    private final Integer temperatureFahrenheit;
    private final long timestamp;
    private final byte userIconCode;

    public CheckinHistoryRecord(String s, byte byte0, double d, double d1, String s1, 
            Integer integer, Integer integer1, long l, String s2)
    {
        locationName = s1;
        imagePath = s2;
        id = (String)Preconditions.checkNotNull(s);
        userIconCode = byte0;
        latitude = d;
        longitude = d1;
        temperatureFahrenheit = integer;
        temperatureCelsius = integer1;
        timestamp = l;
    }

    public CheckinHistoryRecord addImage(String s)
    {
        return new CheckinHistoryRecord(id, userIconCode, latitude, longitude, locationName, temperatureFahrenheit, temperatureCelsius, timestamp, s);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CheckinHistoryRecord)obj;
            if (Double.compare(((CheckinHistoryRecord) (obj)).latitude, latitude) != 0)
            {
                return false;
            }
            if (Double.compare(((CheckinHistoryRecord) (obj)).longitude, longitude) != 0)
            {
                return false;
            }
            if (timestamp != ((CheckinHistoryRecord) (obj)).timestamp)
            {
                return false;
            }
            if (userIconCode != ((CheckinHistoryRecord) (obj)).userIconCode)
            {
                return false;
            }
            if (!locationName.equals(((CheckinHistoryRecord) (obj)).locationName))
            {
                return false;
            }
            if (!id.equals(((CheckinHistoryRecord) (obj)).id))
            {
                return false;
            }
            if (temperatureCelsius == null ? ((CheckinHistoryRecord) (obj)).temperatureCelsius != null : !temperatureCelsius.equals(((CheckinHistoryRecord) (obj)).temperatureCelsius))
            {
                return false;
            }
            if (temperatureFahrenheit == null ? ((CheckinHistoryRecord) (obj)).temperatureFahrenheit != null : !temperatureFahrenheit.equals(((CheckinHistoryRecord) (obj)).temperatureFahrenheit))
            {
                return false;
            }
            if (imagePath == null ? ((CheckinHistoryRecord) (obj)).imagePath != null : !imagePath.equals(((CheckinHistoryRecord) (obj)).imagePath))
            {
                return false;
            }
        }
        return true;
    }

    public String getId()
    {
        return id;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public String getLocationName()
    {
        return locationName;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public Integer getTemperatureCelsius()
    {
        return temperatureCelsius;
    }

    public Integer getTemperatureFahrenheit()
    {
        return temperatureFahrenheit;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public byte getUserIconCode()
    {
        return userIconCode;
    }

    public int hashCode()
    {
        int k = 0;
        int l = id.hashCode();
        byte byte0 = userIconCode;
        long l1 = Double.doubleToLongBits(latitude);
        int i1 = (int)(l1 >>> 32 ^ l1);
        l1 = Double.doubleToLongBits(longitude);
        int j1 = (int)(l1 >>> 32 ^ l1);
        int k1 = locationName.hashCode();
        int i;
        int j;
        if (temperatureFahrenheit != null)
        {
            i = temperatureFahrenheit.hashCode();
        } else
        {
            i = 0;
        }
        if (temperatureCelsius != null)
        {
            j = temperatureCelsius.hashCode();
        } else
        {
            j = 0;
        }
        if (imagePath != null)
        {
            k = imagePath.hashCode();
        }
        return (((((((l * 31 + byte0) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + i) * 31 + j) * 31 + k) * 31 + (int)(timestamp ^ timestamp >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder()).append("CheckinHistoryRecord{id='").append(id).append('\'').append(", userIconCode=").append(userIconCode).append(", latitude=").append(latitude).append(", longitude=").append(longitude).append(", locationName='").append(locationName).append('\'').append(", temperatureFahrenheit=").append(temperatureFahrenheit).append(", temperatureCelsius=").append(temperatureCelsius).append(", timestamp=").append(timestamp).append(", imagePath='").append(imagePath).append('\'').append('}').toString();
    }
}
