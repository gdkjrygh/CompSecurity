// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import hny;

public class <init> extends Enum
    implements hny
{

    private static final PING_UPDATE_INTERVAL_MS $VALUES[];
    public static final PING_UPDATE_INTERVAL_MS COORDINATE_SYSTEM;
    public static final PING_UPDATE_INTERVAL_MS DISABLE_CALLING;
    public static final PING_UPDATE_INTERVAL_MS DISABLE_SPOTIFY_LINK_AND_UNLINK;
    public static final PING_UPDATE_INTERVAL_MS DISABLE_TEXT_MESSAGING;
    public static final PING_UPDATE_INTERVAL_MS DISABLE_VEHICLE_INVENTORY_VIEW;
    public static final PING_UPDATE_INTERVAL_MS EMERGENCY_NUMBER;
    public static final PING_UPDATE_INTERVAL_MS ENABLE_EXPERIMENTS_RIDER;
    public static final PING_UPDATE_INTERVAL_MS ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY;
    public static final PING_UPDATE_INTERVAL_MS ENABLE_MUSIC_BAR;
    public static final PING_UPDATE_INTERVAL_MS ENABLE_NETWORK_MONITORING;
    public static final PING_UPDATE_INTERVAL_MS ENABLE_SESSION_ANALYTICS;
    public static final PING_UPDATE_INTERVAL_MS ENABLE_SOS_INDIA_RIDER;
    public static final PING_UPDATE_INTERVAL_MS ENABLE_UPFRONT_PRICING_V1;
    public static final PING_UPDATE_INTERVAL_MS PING_UPDATE_INTERVAL_MS;
    public static final PING_UPDATE_INTERVAL_MS RIDER;
    public static final PING_UPDATE_INTERVAL_MS USE_TRIP_LEGS;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/ubercab/client/core/model/Shape_AppConfig$Property, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        DISABLE_CALLING = new Shape_AppConfig.Property("DISABLE_CALLING", 0) {

            public final String toString()
            {
                return "disableCalling";
            }

        };
        DISABLE_SPOTIFY_LINK_AND_UNLINK = new Shape_AppConfig.Property("DISABLE_SPOTIFY_LINK_AND_UNLINK", 1) {

            public final String toString()
            {
                return "disableSpotifyLinkAndUnlink";
            }

        };
        DISABLE_TEXT_MESSAGING = new Shape_AppConfig.Property("DISABLE_TEXT_MESSAGING", 2) {

            public final String toString()
            {
                return "disableTextMessaging";
            }

        };
        ENABLE_EXPERIMENTS_RIDER = new Shape_AppConfig.Property("ENABLE_EXPERIMENTS_RIDER", 3) {

            public final String toString()
            {
                return "enableExperimentsRider";
            }

        };
        ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY = new Shape_AppConfig.Property("ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY", 4) {

            public final String toString()
            {
                return "enableHearingImpairedDriverAccessibility";
            }

        };
        ENABLE_NETWORK_MONITORING = new Shape_AppConfig.Property("ENABLE_NETWORK_MONITORING", 5) {

            public final String toString()
            {
                return "enableNetworkMonitoring";
            }

        };
        ENABLE_SESSION_ANALYTICS = new Shape_AppConfig.Property("ENABLE_SESSION_ANALYTICS", 6) {

            public final String toString()
            {
                return "enableSessionAnalytics";
            }

        };
        ENABLE_SOS_INDIA_RIDER = new Shape_AppConfig.Property("ENABLE_SOS_INDIA_RIDER", 7) {

            public final String toString()
            {
                return "enableSosIndiaRider";
            }

        };
        USE_TRIP_LEGS = new Shape_AppConfig.Property("USE_TRIP_LEGS", 8) {

            public final String toString()
            {
                return "useTripLegs";
            }

        };
        RIDER = new Shape_AppConfig.Property("RIDER", 9) {

            public final String toString()
            {
                return "rider";
            }

        };
        COORDINATE_SYSTEM = new Shape_AppConfig.Property("COORDINATE_SYSTEM", 10) {

            public final String toString()
            {
                return "coordinateSystem";
            }

        };
        EMERGENCY_NUMBER = new Shape_AppConfig.Property("EMERGENCY_NUMBER", 11) {

            public final String toString()
            {
                return "emergencyNumber";
            }

        };
        DISABLE_VEHICLE_INVENTORY_VIEW = new Shape_AppConfig.Property("DISABLE_VEHICLE_INVENTORY_VIEW", 12) {

            public final String toString()
            {
                return "disableVehicleInventoryView";
            }

        };
        ENABLE_MUSIC_BAR = new Shape_AppConfig.Property("ENABLE_MUSIC_BAR", 13) {

            public final String toString()
            {
                return "enableMusicBar";
            }

        };
        ENABLE_UPFRONT_PRICING_V1 = new Shape_AppConfig.Property("ENABLE_UPFRONT_PRICING_V1", 14) {

            public final String toString()
            {
                return "enableUpfrontPricingV1";
            }

        };
        PING_UPDATE_INTERVAL_MS = new Shape_AppConfig.Property("PING_UPDATE_INTERVAL_MS", 15) {

            public final String toString()
            {
                return "pingUpdateIntervalMs";
            }

        };
        $VALUES = (new .VALUES[] {
            DISABLE_CALLING, DISABLE_SPOTIFY_LINK_AND_UNLINK, DISABLE_TEXT_MESSAGING, ENABLE_EXPERIMENTS_RIDER, ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY, ENABLE_NETWORK_MONITORING, ENABLE_SESSION_ANALYTICS, ENABLE_SOS_INDIA_RIDER, USE_TRIP_LEGS, RIDER, 
            COORDINATE_SYSTEM, EMERGENCY_NUMBER, DISABLE_VEHICLE_INVENTORY_VIEW, ENABLE_MUSIC_BAR, ENABLE_UPFRONT_PRICING_V1, PING_UPDATE_INTERVAL_MS
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
