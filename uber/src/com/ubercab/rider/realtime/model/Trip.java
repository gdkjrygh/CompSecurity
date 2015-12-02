// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            Location, TripDriver, DynamicPickup, TripEntity, 
//            TripExpenseInfo, TripExtraPaymentData, TripFareChange, FareSplit, 
//            TripVehicle, TripLeg

public interface Trip
{

    public static final String PROMO_STRING_KEY = "promoString";
    public static final String STATE_UBERPOOL_MATCHED = "UberPoolMatched";
    public static final String STATE_UBERPOOL_MATCHING = "UberPoolMatching";
    public static final String STATE_UBERPOOL_NOT_MATCHED = "UberPoolNotMatched";
    public static final String STATUS_STRING_KEY = "statusString";

    public abstract boolean getCanShareETA();

    public abstract boolean getCanSplitFare();

    public abstract String getCancelDialog();

    public abstract int getCurrentLegIndex();

    public abstract String getCurrentLegStatus();

    public abstract String getCurrentRoute();

    public abstract Location getDestination();

    public abstract String getDestinationSetBy();

    public abstract TripDriver getDriver();

    public abstract DynamicPickup getDynamicPickup();

    public abstract Map getEntities();

    public abstract TripEntity getEntity(String s);

    public abstract int getEta();

    public abstract String getEtaString();

    public abstract String getEtaStringShort();

    public abstract int getEtaToDestination();

    public abstract TripExpenseInfo getExpenseInfo();

    public abstract TripExtraPaymentData getExtraPaymentData();

    public abstract Map getExtraStates();

    public abstract TripFareChange getFareChange();

    public abstract List getFareEstimateRange();

    public abstract String getFareEstimateString();

    public abstract FareSplit getFareSplit();

    public abstract List getFeedbackTypes();

    public abstract boolean getIsZeroTolerance();

    public abstract List getLegs();

    public abstract List getLegsBetweenCurrentLegAndPickup(String s);

    public abstract Location getLocation(String s);

    public abstract Map getLocations();

    public abstract String getPaymentProfileUUID();

    public abstract Location getPickupLocation();

    public abstract List getRemainingLegs();

    public abstract String getRouteToDestination();

    public abstract String getShareUrl();

    public abstract boolean getUseCredits();

    public abstract String getUuid();

    public abstract TripVehicle getVehicle();

    public abstract int getVehicleViewId();

    public abstract boolean isClientPartOfTripDuringLeg(String s, TripLeg tripleg);

    public abstract boolean isLegForClient(TripLeg tripleg, String s);
}
