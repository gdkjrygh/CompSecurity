// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.android.location.UberLatLng;

public final class ReverseGeocode
    implements com.ubercab.rider.realtime.model.ReverseGeocode
{

    private String id;
    private double latitude;
    private String longName;
    private double longitude;
    private String nickname;
    private String shortName;

    public ReverseGeocode()
    {
        id = "";
        latitude = 0.0D;
        longitude = 0.0D;
        nickname = "";
        shortName = "";
        longName = "";
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ReverseGeocode)obj;
            if (Double.compare(((ReverseGeocode) (obj)).latitude, latitude) != 0)
            {
                return false;
            }
            if (Double.compare(((ReverseGeocode) (obj)).longitude, longitude) != 0)
            {
                return false;
            }
            if (id == null ? ((ReverseGeocode) (obj)).id != null : !id.equals(((ReverseGeocode) (obj)).id))
            {
                return false;
            }
            if (longName == null ? ((ReverseGeocode) (obj)).longName != null : !longName.equals(((ReverseGeocode) (obj)).longName))
            {
                return false;
            }
            if (nickname == null ? ((ReverseGeocode) (obj)).nickname != null : !nickname.equals(((ReverseGeocode) (obj)).nickname))
            {
                return false;
            }
            if (shortName == null ? ((ReverseGeocode) (obj)).shortName != null : !shortName.equals(((ReverseGeocode) (obj)).shortName))
            {
                return false;
            }
        }
        return true;
    }

    public final String getId()
    {
        return id;
    }

    public final double getLatitude()
    {
        return latitude;
    }

    public final String getLongAddress()
    {
        return longName;
    }

    public final double getLongitude()
    {
        return longitude;
    }

    public final String getNickname()
    {
        return nickname;
    }

    public final String getShortAddress()
    {
        return shortName;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        int i1;
        int j1;
        long l1;
        if (id != null)
        {
            i = id.hashCode();
        } else
        {
            i = 0;
        }
        l1 = Double.doubleToLongBits(longitude);
        i1 = (int)(l1 ^ l1 >>> 32);
        l1 = Double.doubleToLongBits(latitude);
        j1 = (int)(l1 ^ l1 >>> 32);
        if (nickname != null)
        {
            j = nickname.hashCode();
        } else
        {
            j = 0;
        }
        if (shortName != null)
        {
            k = shortName.hashCode();
        } else
        {
            k = 0;
        }
        if (longName != null)
        {
            l = longName.hashCode();
        }
        return (k + (j + ((i * 31 + i1) * 31 + j1) * 31) * 31) * 31 + l;
    }

    final void setId(String s)
    {
        id = s;
    }

    final void setLatLng(UberLatLng uberlatlng)
    {
        latitude = uberlatlng.a();
        longitude = uberlatlng.b();
    }
}
