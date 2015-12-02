// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            Fare, Tagline

public interface VehicleView
{

    public static final String CONFIRMATION_TYPE_FARE_ESTIMATE_TAGLINE = "FareEstimateTagline";
    public static final String DESTINATION_HIDDEN = "hidden";
    public static final String DESTINATION_OPTIONAL = "optional";
    public static final String DESTINATION_PREFERRED = "preferred";
    public static final String DESTINATION_REQUIRED_NOT_EDITABLE = "requiredNotEditable";

    public abstract boolean getAllowCredits();

    public abstract String getAllowCreditsError();

    public abstract boolean getAllowFareEstimate();

    public abstract boolean getAllowRidepool();

    public abstract boolean getAllowedToSurge();

    public abstract int getCapacity();

    public abstract String getCapacityTagline();

    public abstract String getConfirmPickupButtonString();

    public abstract String getConfirmationType();

    public abstract String getDescription();

    public abstract String getDestinationEntry();

    public abstract String getDisplayName();

    public abstract boolean getEnableVehicleInventoryView();

    public abstract Fare getFare();

    public abstract String getFareDetailsUrl();

    public abstract String getFareMessage();

    public abstract String getGroupDisplayName();

    public abstract String getGroupId();

    public abstract String getHijackSavingTagline();

    public abstract String getHijackSharingTagline();

    public abstract String getHijackTipTagline();

    public abstract String getHijackVehicleViewId();

    public abstract String getId();

    public abstract boolean getIsCashOnly();

    public abstract boolean getIsInspecting();

    public abstract String getLinkedVehicleViewId();

    public abstract List getMapImages();

    public abstract int getMaxFareSplits();

    public abstract String getMinFareTitle();

    public abstract List getMonoImages();

    public abstract String getNoneAvailableString();

    public abstract String getParentId();

    public abstract String getPermittedPaymentMethodsError();

    public abstract String getPickupButtonString();

    public abstract String getPickupEtaString();

    public abstract String getProductGroupUuid();

    public abstract String getRequestPickupButtonString();

    public abstract String getRidePoolOption();

    public abstract String getSetPickupLocationString();

    public abstract String getSharingTagline();

    public abstract String getSurgeTitle();

    public abstract Tagline getTagline();

    public abstract String getUuid();

    public abstract boolean isDestinationEnabled();

    public abstract boolean isDestinationPreferred();

    public abstract boolean isDestinationRequired();
}
