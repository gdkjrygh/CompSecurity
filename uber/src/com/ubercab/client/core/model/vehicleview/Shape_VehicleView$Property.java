// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;

import hny;

public class <init> extends Enum
    implements hny
{

    private static final SUPPRESS_SURGE_U_I $VALUES[];
    public static final SUPPRESS_SURGE_U_I ALLOW_CREDITS;
    public static final SUPPRESS_SURGE_U_I ALLOW_CREDITS_ERROR;
    public static final SUPPRESS_SURGE_U_I ALLOW_FARE_ESTIMATE;
    public static final SUPPRESS_SURGE_U_I ALLOW_RIDEPOOL;
    public static final SUPPRESS_SURGE_U_I CAPACITY;
    public static final SUPPRESS_SURGE_U_I CAPACITY_TAGLINE;
    public static final SUPPRESS_SURGE_U_I CONFIRMATION_TYPE;
    public static final SUPPRESS_SURGE_U_I CONFIRM_PICKUP_BUTTON_STRING;
    public static final SUPPRESS_SURGE_U_I DESCRIPTION;
    public static final SUPPRESS_SURGE_U_I DESTINATION_ENTRY;
    public static final SUPPRESS_SURGE_U_I DISPLAY_NAME;
    public static final SUPPRESS_SURGE_U_I ENABLE_VEHICLE_INVENTORY_VIEW;
    public static final SUPPRESS_SURGE_U_I FARE;
    public static final SUPPRESS_SURGE_U_I FARE_DETAILS_URL;
    public static final SUPPRESS_SURGE_U_I FARE_MESSAGE;
    public static final SUPPRESS_SURGE_U_I GROUP_DISPLAY_NAME;
    public static final SUPPRESS_SURGE_U_I GROUP_ID;
    public static final SUPPRESS_SURGE_U_I HIJACK_SAVING_TAGLINE;
    public static final SUPPRESS_SURGE_U_I HIJACK_SHARING_TAGLINE;
    public static final SUPPRESS_SURGE_U_I HIJACK_TIP_TAGLINE;
    public static final SUPPRESS_SURGE_U_I HIJACK_VEHICLE_VIEW_ID;
    public static final SUPPRESS_SURGE_U_I ID;
    public static final SUPPRESS_SURGE_U_I IS_CASH_ONLY;
    public static final SUPPRESS_SURGE_U_I IS_DESTINATION_REQUIRED;
    public static final SUPPRESS_SURGE_U_I IS_INSPECTING;
    public static final SUPPRESS_SURGE_U_I LINKED_VEHICLE_VIEW_ID;
    public static final SUPPRESS_SURGE_U_I MAP_IMAGES;
    public static final SUPPRESS_SURGE_U_I MAX_FARE_SPLITS;
    public static final SUPPRESS_SURGE_U_I MIN_FARE_TITLE;
    public static final SUPPRESS_SURGE_U_I MONO_IMAGES;
    public static final SUPPRESS_SURGE_U_I NONE_AVAILABLE_STRING;
    public static final SUPPRESS_SURGE_U_I PARENT_ID;
    public static final SUPPRESS_SURGE_U_I PERMITTED_PAYMENT_METHODS_ERROR;
    public static final SUPPRESS_SURGE_U_I PICKUP_BUTTON_STRING;
    public static final SUPPRESS_SURGE_U_I PICKUP_ETA_STRING;
    public static final SUPPRESS_SURGE_U_I PRODUCT_GROUP_UUID;
    public static final SUPPRESS_SURGE_U_I REQUEST_PICKUP_BUTTON_STRING;
    public static final SUPPRESS_SURGE_U_I RIDE_POOL_OPTION;
    public static final SUPPRESS_SURGE_U_I SET_PICKUP_LOCATION_STRING;
    public static final SUPPRESS_SURGE_U_I SHARING_TAGLINE;
    public static final SUPPRESS_SURGE_U_I SUPPRESS_SURGE_U_I;
    public static final SUPPRESS_SURGE_U_I SURGE_TITLE;
    public static final SUPPRESS_SURGE_U_I TAGLINE;
    public static final SUPPRESS_SURGE_U_I UUID;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/ubercab/client/core/model/vehicleview/Shape_VehicleView$Property, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        ALLOW_CREDITS = new Shape_VehicleView.Property("ALLOW_CREDITS", 0) {

            public final String toString()
            {
                return "allowCredits";
            }

        };
        ALLOW_FARE_ESTIMATE = new Shape_VehicleView.Property("ALLOW_FARE_ESTIMATE", 1) {

            public final String toString()
            {
                return "allowFareEstimate";
            }

        };
        ALLOW_RIDEPOOL = new Shape_VehicleView.Property("ALLOW_RIDEPOOL", 2) {

            public final String toString()
            {
                return "allowRidepool";
            }

        };
        IS_CASH_ONLY = new Shape_VehicleView.Property("IS_CASH_ONLY", 3) {

            public final String toString()
            {
                return "isCashOnly";
            }

        };
        IS_INSPECTING = new Shape_VehicleView.Property("IS_INSPECTING", 4) {

            public final String toString()
            {
                return "isInspecting";
            }

        };
        CAPACITY = new Shape_VehicleView.Property("CAPACITY", 5) {

            public final String toString()
            {
                return "capacity";
            }

        };
        MAX_FARE_SPLITS = new Shape_VehicleView.Property("MAX_FARE_SPLITS", 6) {

            public final String toString()
            {
                return "maxFareSplits";
            }

        };
        ALLOW_CREDITS_ERROR = new Shape_VehicleView.Property("ALLOW_CREDITS_ERROR", 7) {

            public final String toString()
            {
                return "allowCreditsError";
            }

        };
        CONFIRM_PICKUP_BUTTON_STRING = new Shape_VehicleView.Property("CONFIRM_PICKUP_BUTTON_STRING", 8) {

            public final String toString()
            {
                return "confirmPickupButtonString";
            }

        };
        DESCRIPTION = new Shape_VehicleView.Property("DESCRIPTION", 9) {

            public final String toString()
            {
                return "description";
            }

        };
        DESTINATION_ENTRY = new Shape_VehicleView.Property("DESTINATION_ENTRY", 10) {

            public final String toString()
            {
                return "destinationEntry";
            }

        };
        DISPLAY_NAME = new Shape_VehicleView.Property("DISPLAY_NAME", 11) {

            public final String toString()
            {
                return "displayName";
            }

        };
        FARE_DETAILS_URL = new Shape_VehicleView.Property("FARE_DETAILS_URL", 12) {

            public final String toString()
            {
                return "fareDetailsUrl";
            }

        };
        FARE_MESSAGE = new Shape_VehicleView.Property("FARE_MESSAGE", 13) {

            public final String toString()
            {
                return "fareMessage";
            }

        };
        GROUP_DISPLAY_NAME = new Shape_VehicleView.Property("GROUP_DISPLAY_NAME", 14) {

            public final String toString()
            {
                return "groupDisplayName";
            }

        };
        GROUP_ID = new Shape_VehicleView.Property("GROUP_ID", 15) {

            public final String toString()
            {
                return "groupId";
            }

        };
        ID = new Shape_VehicleView.Property("ID", 16) {

            public final String toString()
            {
                return "id";
            }

        };
        MIN_FARE_TITLE = new Shape_VehicleView.Property("MIN_FARE_TITLE", 17) {

            public final String toString()
            {
                return "minFareTitle";
            }

        };
        NONE_AVAILABLE_STRING = new Shape_VehicleView.Property("NONE_AVAILABLE_STRING", 18) {

            public final String toString()
            {
                return "noneAvailableString";
            }

        };
        PARENT_ID = new Shape_VehicleView.Property("PARENT_ID", 19) {

            public final String toString()
            {
                return "parentId";
            }

        };
        PERMITTED_PAYMENT_METHODS_ERROR = new Shape_VehicleView.Property("PERMITTED_PAYMENT_METHODS_ERROR", 20) {

            public final String toString()
            {
                return "permittedPaymentMethodsError";
            }

        };
        PICKUP_BUTTON_STRING = new Shape_VehicleView.Property("PICKUP_BUTTON_STRING", 21) {

            public final String toString()
            {
                return "pickupButtonString";
            }

        };
        PICKUP_ETA_STRING = new Shape_VehicleView.Property("PICKUP_ETA_STRING", 22) {

            public final String toString()
            {
                return "pickupEtaString";
            }

        };
        REQUEST_PICKUP_BUTTON_STRING = new Shape_VehicleView.Property("REQUEST_PICKUP_BUTTON_STRING", 23) {

            public final String toString()
            {
                return "requestPickupButtonString";
            }

        };
        RIDE_POOL_OPTION = new Shape_VehicleView.Property("RIDE_POOL_OPTION", 24) {

            public final String toString()
            {
                return "ridePoolOption";
            }

        };
        SET_PICKUP_LOCATION_STRING = new Shape_VehicleView.Property("SET_PICKUP_LOCATION_STRING", 25) {

            public final String toString()
            {
                return "setPickupLocationString";
            }

        };
        SURGE_TITLE = new Shape_VehicleView.Property("SURGE_TITLE", 26) {

            public final String toString()
            {
                return "surgeTitle";
            }

        };
        UUID = new Shape_VehicleView.Property("UUID", 27) {

            public final String toString()
            {
                return "uuid";
            }

        };
        MAP_IMAGES = new Shape_VehicleView.Property("MAP_IMAGES", 28) {

            public final String toString()
            {
                return "mapImages";
            }

        };
        MONO_IMAGES = new Shape_VehicleView.Property("MONO_IMAGES", 29) {

            public final String toString()
            {
                return "monoImages";
            }

        };
        FARE = new Shape_VehicleView.Property("FARE", 30) {

            public final String toString()
            {
                return "fare";
            }

        };
        TAGLINE = new Shape_VehicleView.Property("TAGLINE", 31) {

            public final String toString()
            {
                return "tagline";
            }

        };
        CAPACITY_TAGLINE = new Shape_VehicleView.Property("CAPACITY_TAGLINE", 32) {

            public final String toString()
            {
                return "capacityTagline";
            }

        };
        CONFIRMATION_TYPE = new Shape_VehicleView.Property("CONFIRMATION_TYPE", 33) {

            public final String toString()
            {
                return "confirmationType";
            }

        };
        LINKED_VEHICLE_VIEW_ID = new Shape_VehicleView.Property("LINKED_VEHICLE_VIEW_ID", 34) {

            public final String toString()
            {
                return "linkedVehicleViewId";
            }

        };
        HIJACK_VEHICLE_VIEW_ID = new Shape_VehicleView.Property("HIJACK_VEHICLE_VIEW_ID", 35) {

            public final String toString()
            {
                return "hijackVehicleViewId";
            }

        };
        PRODUCT_GROUP_UUID = new Shape_VehicleView.Property("PRODUCT_GROUP_UUID", 36) {

            public final String toString()
            {
                return "productGroupUuid";
            }

        };
        SHARING_TAGLINE = new Shape_VehicleView.Property("SHARING_TAGLINE", 37) {

            public final String toString()
            {
                return "sharingTagline";
            }

        };
        HIJACK_SAVING_TAGLINE = new Shape_VehicleView.Property("HIJACK_SAVING_TAGLINE", 38) {

            public final String toString()
            {
                return "hijackSavingTagline";
            }

        };
        HIJACK_SHARING_TAGLINE = new Shape_VehicleView.Property("HIJACK_SHARING_TAGLINE", 39) {

            public final String toString()
            {
                return "hijackSharingTagline";
            }

        };
        HIJACK_TIP_TAGLINE = new Shape_VehicleView.Property("HIJACK_TIP_TAGLINE", 40) {

            public final String toString()
            {
                return "hijackTipTagline";
            }

        };
        ENABLE_VEHICLE_INVENTORY_VIEW = new Shape_VehicleView.Property("ENABLE_VEHICLE_INVENTORY_VIEW", 41) {

            public final String toString()
            {
                return "enableVehicleInventoryView";
            }

        };
        IS_DESTINATION_REQUIRED = new Shape_VehicleView.Property("IS_DESTINATION_REQUIRED", 42) {

            public final String toString()
            {
                return "isDestinationRequired";
            }

        };
        SUPPRESS_SURGE_U_I = new Shape_VehicleView.Property("SUPPRESS_SURGE_U_I", 43) {

            public final String toString()
            {
                return "suppressSurgeUI";
            }

        };
        $VALUES = (new .VALUES[] {
            ALLOW_CREDITS, ALLOW_FARE_ESTIMATE, ALLOW_RIDEPOOL, IS_CASH_ONLY, IS_INSPECTING, CAPACITY, MAX_FARE_SPLITS, ALLOW_CREDITS_ERROR, CONFIRM_PICKUP_BUTTON_STRING, DESCRIPTION, 
            DESTINATION_ENTRY, DISPLAY_NAME, FARE_DETAILS_URL, FARE_MESSAGE, GROUP_DISPLAY_NAME, GROUP_ID, ID, MIN_FARE_TITLE, NONE_AVAILABLE_STRING, PARENT_ID, 
            PERMITTED_PAYMENT_METHODS_ERROR, PICKUP_BUTTON_STRING, PICKUP_ETA_STRING, REQUEST_PICKUP_BUTTON_STRING, RIDE_POOL_OPTION, SET_PICKUP_LOCATION_STRING, SURGE_TITLE, UUID, MAP_IMAGES, MONO_IMAGES, 
            FARE, TAGLINE, CAPACITY_TAGLINE, CONFIRMATION_TYPE, LINKED_VEHICLE_VIEW_ID, HIJACK_VEHICLE_VIEW_ID, PRODUCT_GROUP_UUID, SHARING_TAGLINE, HIJACK_SAVING_TAGLINE, HIJACK_SHARING_TAGLINE, 
            HIJACK_TIP_TAGLINE, ENABLE_VEHICLE_INVENTORY_VIEW, IS_DESTINATION_REQUIRED, SUPPRESS_SURGE_U_I
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }

    _cls9(String s, int i, _cls9 _pcls9)
    {
        this(s, i);
    }
}
