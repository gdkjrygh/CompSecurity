// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            TripPendingRatingDriver, Location, TripExtraPaymentData, TripVehicle, 
//            VehicleView

public interface TripPendingRating
{

    public abstract TripPendingRatingDriver getDriver();

    public abstract long getDropoffEpoch();

    public abstract Location getDropoffLocation();

    public abstract String getDropoffTimestamp();

    public abstract TripExtraPaymentData getExtraPaymentData();

    public abstract String getFareBilledToCardString();

    public abstract String getFareString();

    public abstract String getFareSummaryPromoTagline();

    public abstract float getFareValue();

    public abstract List getFeedbackTags();

    public abstract List getFeedbackTypes();

    public abstract int getFeedbackUIVersion();

    public abstract String getId();

    public abstract List getItems();

    public abstract String getMarketplace();

    public abstract String getPaymentProfileId();

    public abstract String getPaymentProfileUUID();

    public abstract boolean getShowLostItemsDriverContact();

    public abstract TripVehicle getVehicle();

    public abstract VehicleView getVehicleView();
}
