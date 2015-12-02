// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;


// Referenced classes of package com.ubercab.rider.realtime.model:
//            TripDriverCapabilities, TripDriverLocation

public interface TripDriver
{

    public static final String STATUS_ACCEPTED = "Accepted";
    public static final String STATUS_ARRIVING = "Arrived";
    public static final String STATUS_DRIVING_CLIENT = "DrivingClient";

    public abstract TripDriverCapabilities getCapabilities();

    public abstract boolean getDisplayCompany();

    public abstract String getId();

    public abstract boolean getIsAccessibilityTripViewEnabled();

    public abstract boolean getIsCallButtonEnabled();

    public abstract TripDriverLocation getLocation();

    public abstract String getMobile();

    public abstract String getMobileCountryIso2();

    public abstract String getMobileDigits();

    public abstract String getName();

    public abstract String getPartnerCompany();

    public abstract String getPictureUrl();

    public abstract float getRating();

    public abstract String getStatus();

    public abstract String getUuid();
}
