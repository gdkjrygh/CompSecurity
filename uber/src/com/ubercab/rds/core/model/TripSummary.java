// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_TripSummary

public abstract class TripSummary
    implements Parcelable
{

    public TripSummary()
    {
    }

    public static TripSummary create()
    {
        return new Shape_TripSummary();
    }

    public abstract String getClientName();

    public abstract String getDate();

    public abstract String getDistance();

    public abstract String getDriverName();

    public abstract String getDriverPictureUrl();

    public abstract int getDriverRating();

    public abstract String getDropoffAddress();

    public abstract String getDuration();

    public abstract String getFareLocalString();

    public abstract String getId();

    public abstract boolean getIsCashTrip();

    public abstract boolean getIsSurgeTrip();

    public abstract String getMake();

    public abstract String getMapUrl();

    public abstract String getModel();

    public abstract String getPickupAddress();

    public abstract String getRouteMapUrl();

    public abstract String getStatus();

    public abstract String getTerritoryId();

    public abstract String getVehicleImageUrl();

    public abstract TripSummary setClientName(String s);

    public abstract TripSummary setDate(String s);

    public abstract TripSummary setDistance(String s);

    public abstract TripSummary setDriverName(String s);

    public abstract TripSummary setDriverPictureUrl(String s);

    public abstract TripSummary setDriverRating(int i);

    public abstract TripSummary setDropoffAddress(String s);

    public abstract TripSummary setDuration(String s);

    public abstract TripSummary setFareLocalString(String s);

    public abstract TripSummary setId(String s);

    public abstract TripSummary setIsCashTrip(boolean flag);

    public abstract TripSummary setIsSurgeTrip(boolean flag);

    public abstract TripSummary setMake(String s);

    public abstract TripSummary setMapUrl(String s);

    public abstract TripSummary setModel(String s);

    public abstract TripSummary setPickupAddress(String s);

    public abstract TripSummary setRouteMapUrl(String s);

    public abstract TripSummary setStatus(String s);

    public abstract TripSummary setTerritoryId(String s);

    public abstract TripSummary setVehicleImageUrl(String s);
}
