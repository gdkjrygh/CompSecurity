// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.walmartlabs.utils.LocationMath;

public abstract class StoreData
{

    public double distanceFromSource;

    public StoreData()
    {
        distanceFromSource = -1D;
    }

    public abstract String getAddressStreetLine();

    public String getCity()
    {
        return "";
    }

    public abstract String getCityStateZip();

    public abstract String getDescription();

    public double getDistanceFromSourceInMetres()
    {
        return distanceFromSource * 1609.3399999999999D;
    }

    public abstract String getId();

    public abstract double getLatitude();

    public abstract double getLongitude();

    public String getState()
    {
        return "";
    }

    public abstract boolean hasService(String s);

    public void setSourceCoordinates(double d, double d1)
    {
        distanceFromSource = LocationMath.computeDistance(d, d1, getLatitude(), getLongitude(), 'M');
    }
}
