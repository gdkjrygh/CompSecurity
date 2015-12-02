// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.ubercab.client.core.model:
//            AppConfig, RiderAppConfig

public final class Shape_AppConfig extends AppConfig
{

    private static final Set SHAPE_PROPERTIES;
    private String coordinateSystem;
    private Boolean disableCalling;
    private Boolean disableSpotifyLinkAndUnlink;
    private Boolean disableTextMessaging;
    private Boolean disableVehicleInventoryView;
    private Integer emergencyNumber;
    private Boolean enableExperimentsRider;
    private Boolean enableHearingImpairedDriverAccessibility;
    private Boolean enableMusicBar;
    private Boolean enableNetworkMonitoring;
    private Boolean enableSessionAnalytics;
    private Boolean enableSosIndiaRider;
    private Boolean enableUpfrontPricingV1;
    private Long pingUpdateIntervalMs;
    private RiderAppConfig rider;
    private Boolean useTripLegs;

    Shape_AppConfig()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AppConfig)obj;
            if (((AppConfig) (obj)).getDisableCalling() == null ? getDisableCalling() != null : !((AppConfig) (obj)).getDisableCalling().equals(getDisableCalling()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getDisableSpotifyLinkAndUnlink() == null ? getDisableSpotifyLinkAndUnlink() != null : !((AppConfig) (obj)).getDisableSpotifyLinkAndUnlink().equals(getDisableSpotifyLinkAndUnlink()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getDisableTextMessaging() == null ? getDisableTextMessaging() != null : !((AppConfig) (obj)).getDisableTextMessaging().equals(getDisableTextMessaging()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getEnableExperimentsRider() == null ? getEnableExperimentsRider() != null : !((AppConfig) (obj)).getEnableExperimentsRider().equals(getEnableExperimentsRider()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getEnableHearingImpairedDriverAccessibility() == null ? getEnableHearingImpairedDriverAccessibility() != null : !((AppConfig) (obj)).getEnableHearingImpairedDriverAccessibility().equals(getEnableHearingImpairedDriverAccessibility()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getEnableNetworkMonitoring() == null ? getEnableNetworkMonitoring() != null : !((AppConfig) (obj)).getEnableNetworkMonitoring().equals(getEnableNetworkMonitoring()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getEnableSessionAnalytics() == null ? getEnableSessionAnalytics() != null : !((AppConfig) (obj)).getEnableSessionAnalytics().equals(getEnableSessionAnalytics()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getEnableSosIndiaRider() == null ? getEnableSosIndiaRider() != null : !((AppConfig) (obj)).getEnableSosIndiaRider().equals(getEnableSosIndiaRider()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getUseTripLegs() == null ? getUseTripLegs() != null : !((AppConfig) (obj)).getUseTripLegs().equals(getUseTripLegs()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getRider() == null ? getRider() != null : !((AppConfig) (obj)).getRider().equals(getRider()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getCoordinateSystem() == null ? getCoordinateSystem() != null : !((AppConfig) (obj)).getCoordinateSystem().equals(getCoordinateSystem()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getEmergencyNumber() == null ? getEmergencyNumber() != null : !((AppConfig) (obj)).getEmergencyNumber().equals(getEmergencyNumber()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getDisableVehicleInventoryView() == null ? getDisableVehicleInventoryView() != null : !((AppConfig) (obj)).getDisableVehicleInventoryView().equals(getDisableVehicleInventoryView()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getEnableMusicBar() == null ? getEnableMusicBar() != null : !((AppConfig) (obj)).getEnableMusicBar().equals(getEnableMusicBar()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getEnableUpfrontPricingV1() == null ? getEnableUpfrontPricingV1() != null : !((AppConfig) (obj)).getEnableUpfrontPricingV1().equals(getEnableUpfrontPricingV1()))
            {
                return false;
            }
            if (((AppConfig) (obj)).getPingUpdateIntervalMs() == null ? getPingUpdateIntervalMs() != null : !((AppConfig) (obj)).getPingUpdateIntervalMs().equals(getPingUpdateIntervalMs()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getCoordinateSystem()
    {
        return (String)onGet(Property.COORDINATE_SYSTEM, coordinateSystem);
    }

    public final Boolean getDisableCalling()
    {
        return (Boolean)onGet(Property.DISABLE_CALLING, disableCalling);
    }

    public final Boolean getDisableSpotifyLinkAndUnlink()
    {
        return (Boolean)onGet(Property.DISABLE_SPOTIFY_LINK_AND_UNLINK, disableSpotifyLinkAndUnlink);
    }

    public final Boolean getDisableTextMessaging()
    {
        return (Boolean)onGet(Property.DISABLE_TEXT_MESSAGING, disableTextMessaging);
    }

    final Boolean getDisableVehicleInventoryView()
    {
        return (Boolean)onGet(Property.DISABLE_VEHICLE_INVENTORY_VIEW, disableVehicleInventoryView);
    }

    public final Integer getEmergencyNumber()
    {
        return (Integer)onGet(Property.EMERGENCY_NUMBER, emergencyNumber);
    }

    public final Boolean getEnableExperimentsRider()
    {
        return (Boolean)onGet(Property.ENABLE_EXPERIMENTS_RIDER, enableExperimentsRider);
    }

    public final Boolean getEnableHearingImpairedDriverAccessibility()
    {
        return (Boolean)onGet(Property.ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY, enableHearingImpairedDriverAccessibility);
    }

    final Boolean getEnableMusicBar()
    {
        return (Boolean)onGet(Property.ENABLE_MUSIC_BAR, enableMusicBar);
    }

    public final Boolean getEnableNetworkMonitoring()
    {
        return (Boolean)onGet(Property.ENABLE_NETWORK_MONITORING, enableNetworkMonitoring);
    }

    public final Boolean getEnableSessionAnalytics()
    {
        return (Boolean)onGet(Property.ENABLE_SESSION_ANALYTICS, enableSessionAnalytics);
    }

    public final Boolean getEnableSosIndiaRider()
    {
        return (Boolean)onGet(Property.ENABLE_SOS_INDIA_RIDER, enableSosIndiaRider);
    }

    final Boolean getEnableUpfrontPricingV1()
    {
        return (Boolean)onGet(Property.ENABLE_UPFRONT_PRICING_V1, enableUpfrontPricingV1);
    }

    public final Long getPingUpdateIntervalMs()
    {
        return (Long)onGet(Property.PING_UPDATE_INTERVAL_MS, pingUpdateIntervalMs);
    }

    public final RiderAppConfig getRider()
    {
        return (RiderAppConfig)onGet(Property.RIDER, rider);
    }

    public final Boolean getUseTripLegs()
    {
        return (Boolean)onGet(Property.USE_TRIP_LEGS, useTripLegs);
    }

    public final int hashCode()
    {
        int l3 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        if (disableCalling == null)
        {
            i = 0;
        } else
        {
            i = disableCalling.hashCode();
        }
        if (disableSpotifyLinkAndUnlink == null)
        {
            j = 0;
        } else
        {
            j = disableSpotifyLinkAndUnlink.hashCode();
        }
        if (disableTextMessaging == null)
        {
            k = 0;
        } else
        {
            k = disableTextMessaging.hashCode();
        }
        if (enableExperimentsRider == null)
        {
            l = 0;
        } else
        {
            l = enableExperimentsRider.hashCode();
        }
        if (enableHearingImpairedDriverAccessibility == null)
        {
            i1 = 0;
        } else
        {
            i1 = enableHearingImpairedDriverAccessibility.hashCode();
        }
        if (enableNetworkMonitoring == null)
        {
            j1 = 0;
        } else
        {
            j1 = enableNetworkMonitoring.hashCode();
        }
        if (enableSessionAnalytics == null)
        {
            k1 = 0;
        } else
        {
            k1 = enableSessionAnalytics.hashCode();
        }
        if (enableSosIndiaRider == null)
        {
            l1 = 0;
        } else
        {
            l1 = enableSosIndiaRider.hashCode();
        }
        if (useTripLegs == null)
        {
            i2 = 0;
        } else
        {
            i2 = useTripLegs.hashCode();
        }
        if (rider == null)
        {
            j2 = 0;
        } else
        {
            j2 = rider.hashCode();
        }
        if (coordinateSystem == null)
        {
            k2 = 0;
        } else
        {
            k2 = coordinateSystem.hashCode();
        }
        if (emergencyNumber == null)
        {
            l2 = 0;
        } else
        {
            l2 = emergencyNumber.hashCode();
        }
        if (disableVehicleInventoryView == null)
        {
            i3 = 0;
        } else
        {
            i3 = disableVehicleInventoryView.hashCode();
        }
        if (enableMusicBar == null)
        {
            j3 = 0;
        } else
        {
            j3 = enableMusicBar.hashCode();
        }
        if (enableUpfrontPricingV1 == null)
        {
            k3 = 0;
        } else
        {
            k3 = enableUpfrontPricingV1.hashCode();
        }
        if (pingUpdateIntervalMs != null)
        {
            l3 = pingUpdateIntervalMs.hashCode();
        }
        return (k3 ^ (j3 ^ (i3 ^ (l2 ^ (k2 ^ (j2 ^ (i2 ^ (l1 ^ (k1 ^ (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l3;
    }

    public final AppConfig setCoordinateSystem(String s)
    {
        String s1 = coordinateSystem;
        coordinateSystem = (String)beforeSet(Property.COORDINATE_SYSTEM, s1, s);
        afterSet(Property.COORDINATE_SYSTEM, s1, s);
        return this;
    }

    public final AppConfig setDisableCalling(Boolean boolean1)
    {
        Boolean boolean2 = disableCalling;
        disableCalling = (Boolean)beforeSet(Property.DISABLE_CALLING, boolean2, boolean1);
        afterSet(Property.DISABLE_CALLING, boolean2, boolean1);
        return this;
    }

    public final AppConfig setDisableSpotifyLinkAndUnlink(Boolean boolean1)
    {
        Boolean boolean2 = disableSpotifyLinkAndUnlink;
        disableSpotifyLinkAndUnlink = (Boolean)beforeSet(Property.DISABLE_SPOTIFY_LINK_AND_UNLINK, boolean2, boolean1);
        afterSet(Property.DISABLE_SPOTIFY_LINK_AND_UNLINK, boolean2, boolean1);
        return this;
    }

    public final AppConfig setDisableTextMessaging(Boolean boolean1)
    {
        Boolean boolean2 = disableTextMessaging;
        disableTextMessaging = (Boolean)beforeSet(Property.DISABLE_TEXT_MESSAGING, boolean2, boolean1);
        afterSet(Property.DISABLE_TEXT_MESSAGING, boolean2, boolean1);
        return this;
    }

    public final AppConfig setDisableVehicleInventoryView(Boolean boolean1)
    {
        Boolean boolean2 = disableVehicleInventoryView;
        disableVehicleInventoryView = (Boolean)beforeSet(Property.DISABLE_VEHICLE_INVENTORY_VIEW, boolean2, boolean1);
        afterSet(Property.DISABLE_VEHICLE_INVENTORY_VIEW, boolean2, boolean1);
        return this;
    }

    public final AppConfig setEmergencyNumber(Integer integer)
    {
        Integer integer1 = emergencyNumber;
        emergencyNumber = (Integer)beforeSet(Property.EMERGENCY_NUMBER, integer1, integer);
        afterSet(Property.EMERGENCY_NUMBER, integer1, integer);
        return this;
    }

    public final AppConfig setEnableExperimentsRider(Boolean boolean1)
    {
        Boolean boolean2 = enableExperimentsRider;
        enableExperimentsRider = (Boolean)beforeSet(Property.ENABLE_EXPERIMENTS_RIDER, boolean2, boolean1);
        afterSet(Property.ENABLE_EXPERIMENTS_RIDER, boolean2, boolean1);
        return this;
    }

    public final AppConfig setEnableHearingImpairedDriverAccessibility(Boolean boolean1)
    {
        Boolean boolean2 = enableHearingImpairedDriverAccessibility;
        enableHearingImpairedDriverAccessibility = (Boolean)beforeSet(Property.ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY, boolean2, boolean1);
        afterSet(Property.ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY, boolean2, boolean1);
        return this;
    }

    final AppConfig setEnableMusicBar(Boolean boolean1)
    {
        Boolean boolean2 = enableMusicBar;
        enableMusicBar = (Boolean)beforeSet(Property.ENABLE_MUSIC_BAR, boolean2, boolean1);
        afterSet(Property.ENABLE_MUSIC_BAR, boolean2, boolean1);
        return this;
    }

    public final AppConfig setEnableNetworkMonitoring(Boolean boolean1)
    {
        Boolean boolean2 = enableNetworkMonitoring;
        enableNetworkMonitoring = (Boolean)beforeSet(Property.ENABLE_NETWORK_MONITORING, boolean2, boolean1);
        afterSet(Property.ENABLE_NETWORK_MONITORING, boolean2, boolean1);
        return this;
    }

    public final AppConfig setEnableSessionAnalytics(Boolean boolean1)
    {
        Boolean boolean2 = enableSessionAnalytics;
        enableSessionAnalytics = (Boolean)beforeSet(Property.ENABLE_SESSION_ANALYTICS, boolean2, boolean1);
        afterSet(Property.ENABLE_SESSION_ANALYTICS, boolean2, boolean1);
        return this;
    }

    public final AppConfig setEnableSosIndiaRider(Boolean boolean1)
    {
        Boolean boolean2 = enableSosIndiaRider;
        enableSosIndiaRider = (Boolean)beforeSet(Property.ENABLE_SOS_INDIA_RIDER, boolean2, boolean1);
        afterSet(Property.ENABLE_SOS_INDIA_RIDER, boolean2, boolean1);
        return this;
    }

    final AppConfig setEnableUpfrontPricingV1(Boolean boolean1)
    {
        Boolean boolean2 = enableUpfrontPricingV1;
        enableUpfrontPricingV1 = (Boolean)beforeSet(Property.ENABLE_UPFRONT_PRICING_V1, boolean2, boolean1);
        afterSet(Property.ENABLE_UPFRONT_PRICING_V1, boolean2, boolean1);
        return this;
    }

    public final AppConfig setPingUpdateIntervalMs(Long long1)
    {
        Long long2 = pingUpdateIntervalMs;
        pingUpdateIntervalMs = (Long)beforeSet(Property.PING_UPDATE_INTERVAL_MS, long2, long1);
        afterSet(Property.PING_UPDATE_INTERVAL_MS, long2, long1);
        return this;
    }

    public final AppConfig setRider(RiderAppConfig riderappconfig)
    {
        RiderAppConfig riderappconfig1 = rider;
        rider = (RiderAppConfig)beforeSet(Property.RIDER, riderappconfig1, riderappconfig);
        afterSet(Property.RIDER, riderappconfig1, riderappconfig);
        return this;
    }

    public final AppConfig setUseTripLegs(Boolean boolean1)
    {
        Boolean boolean2 = useTripLegs;
        useTripLegs = (Boolean)beforeSet(Property.USE_TRIP_LEGS, boolean2, boolean1);
        afterSet(Property.USE_TRIP_LEGS, boolean2, boolean1);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("AppConfig{disableCalling=")).append(disableCalling).append(", disableSpotifyLinkAndUnlink=").append(disableSpotifyLinkAndUnlink).append(", disableTextMessaging=").append(disableTextMessaging).append(", enableExperimentsRider=").append(enableExperimentsRider).append(", enableHearingImpairedDriverAccessibility=").append(enableHearingImpairedDriverAccessibility).append(", enableNetworkMonitoring=").append(enableNetworkMonitoring).append(", enableSessionAnalytics=").append(enableSessionAnalytics).append(", enableSosIndiaRider=").append(enableSosIndiaRider).append(", useTripLegs=").append(useTripLegs).append(", rider=").append(rider).append(", coordinateSystem=").append(coordinateSystem).append(", emergencyNumber=").append(emergencyNumber).append(", disableVehicleInventoryView=").append(disableVehicleInventoryView).append(", enableMusicBar=").append(enableMusicBar).append(", enableUpfrontPricingV1=").append(enableUpfrontPricingV1).append(", pingUpdateIntervalMs=").append(pingUpdateIntervalMs).append("}").toString();
    }

    static 
    {
        SHAPE_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Property[] {
            Property.DISABLE_CALLING, Property.DISABLE_SPOTIFY_LINK_AND_UNLINK, Property.DISABLE_TEXT_MESSAGING, Property.ENABLE_EXPERIMENTS_RIDER, Property.ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY, Property.ENABLE_NETWORK_MONITORING, Property.ENABLE_SESSION_ANALYTICS, Property.ENABLE_SOS_INDIA_RIDER, Property.USE_TRIP_LEGS, Property.RIDER, 
            Property.COORDINATE_SYSTEM, Property.EMERGENCY_NUMBER, Property.DISABLE_VEHICLE_INVENTORY_VIEW, Property.ENABLE_MUSIC_BAR, Property.ENABLE_UPFRONT_PRICING_V1, Property.PING_UPDATE_INTERVAL_MS
        })));
    }

    private class Property extends Enum
        implements hny
    {

        private static final Property $VALUES[];
        public static final Property COORDINATE_SYSTEM;
        public static final Property DISABLE_CALLING;
        public static final Property DISABLE_SPOTIFY_LINK_AND_UNLINK;
        public static final Property DISABLE_TEXT_MESSAGING;
        public static final Property DISABLE_VEHICLE_INVENTORY_VIEW;
        public static final Property EMERGENCY_NUMBER;
        public static final Property ENABLE_EXPERIMENTS_RIDER;
        public static final Property ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY;
        public static final Property ENABLE_MUSIC_BAR;
        public static final Property ENABLE_NETWORK_MONITORING;
        public static final Property ENABLE_SESSION_ANALYTICS;
        public static final Property ENABLE_SOS_INDIA_RIDER;
        public static final Property ENABLE_UPFRONT_PRICING_V1;
        public static final Property PING_UPDATE_INTERVAL_MS;
        public static final Property RIDER;
        public static final Property USE_TRIP_LEGS;

        public static Property valueOf(String s)
        {
            return (Property)Enum.valueOf(com/ubercab/client/core/model/Shape_AppConfig$Property, s);
        }

        public static Property[] values()
        {
            return (Property[])$VALUES.clone();
        }

        static 
        {
            DISABLE_CALLING = new Property("DISABLE_CALLING", 0) {

                public final String toString()
                {
                    return "disableCalling";
                }

            };
            DISABLE_SPOTIFY_LINK_AND_UNLINK = new Property("DISABLE_SPOTIFY_LINK_AND_UNLINK", 1) {

                public final String toString()
                {
                    return "disableSpotifyLinkAndUnlink";
                }

            };
            DISABLE_TEXT_MESSAGING = new Property("DISABLE_TEXT_MESSAGING", 2) {

                public final String toString()
                {
                    return "disableTextMessaging";
                }

            };
            ENABLE_EXPERIMENTS_RIDER = new Property("ENABLE_EXPERIMENTS_RIDER", 3) {

                public final String toString()
                {
                    return "enableExperimentsRider";
                }

            };
            ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY = new Property("ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY", 4) {

                public final String toString()
                {
                    return "enableHearingImpairedDriverAccessibility";
                }

            };
            ENABLE_NETWORK_MONITORING = new Property("ENABLE_NETWORK_MONITORING", 5) {

                public final String toString()
                {
                    return "enableNetworkMonitoring";
                }

            };
            ENABLE_SESSION_ANALYTICS = new Property("ENABLE_SESSION_ANALYTICS", 6) {

                public final String toString()
                {
                    return "enableSessionAnalytics";
                }

            };
            ENABLE_SOS_INDIA_RIDER = new Property("ENABLE_SOS_INDIA_RIDER", 7) {

                public final String toString()
                {
                    return "enableSosIndiaRider";
                }

            };
            USE_TRIP_LEGS = new Property("USE_TRIP_LEGS", 8) {

                public final String toString()
                {
                    return "useTripLegs";
                }

            };
            RIDER = new Property("RIDER", 9) {

                public final String toString()
                {
                    return "rider";
                }

            };
            COORDINATE_SYSTEM = new Property("COORDINATE_SYSTEM", 10) {

                public final String toString()
                {
                    return "coordinateSystem";
                }

            };
            EMERGENCY_NUMBER = new Property("EMERGENCY_NUMBER", 11) {

                public final String toString()
                {
                    return "emergencyNumber";
                }

            };
            DISABLE_VEHICLE_INVENTORY_VIEW = new Property("DISABLE_VEHICLE_INVENTORY_VIEW", 12) {

                public final String toString()
                {
                    return "disableVehicleInventoryView";
                }

            };
            ENABLE_MUSIC_BAR = new Property("ENABLE_MUSIC_BAR", 13) {

                public final String toString()
                {
                    return "enableMusicBar";
                }

            };
            ENABLE_UPFRONT_PRICING_V1 = new Property("ENABLE_UPFRONT_PRICING_V1", 14) {

                public final String toString()
                {
                    return "enableUpfrontPricingV1";
                }

            };
            PING_UPDATE_INTERVAL_MS = new Property("PING_UPDATE_INTERVAL_MS", 15) {

                public final String toString()
                {
                    return "pingUpdateIntervalMs";
                }

            };
            $VALUES = (new Property[] {
                DISABLE_CALLING, DISABLE_SPOTIFY_LINK_AND_UNLINK, DISABLE_TEXT_MESSAGING, ENABLE_EXPERIMENTS_RIDER, ENABLE_HEARING_IMPAIRED_DRIVER_ACCESSIBILITY, ENABLE_NETWORK_MONITORING, ENABLE_SESSION_ANALYTICS, ENABLE_SOS_INDIA_RIDER, USE_TRIP_LEGS, RIDER, 
                COORDINATE_SYSTEM, EMERGENCY_NUMBER, DISABLE_VEHICLE_INVENTORY_VIEW, ENABLE_MUSIC_BAR, ENABLE_UPFRONT_PRICING_V1, PING_UPDATE_INTERVAL_MS
            });
        }

        private Property(String s, int i)
        {
            super(s, i);
        }

    }

}
