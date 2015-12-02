// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import hnx;
import hny;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_AppConfig, RiderAppConfig

public abstract class AppConfig extends hnx
{

    public static final String GEOPROJECTION_GCJ02 = "GCJ02";
    public static final String GEOPROJECTION_WGS84 = "WGS84";

    public AppConfig()
    {
    }

    public static AppConfig create()
    {
        return new Shape_AppConfig();
    }

    public abstract String getCoordinateSystem();

    public abstract Boolean getDisableCalling();

    public abstract Boolean getDisableSpotifyLinkAndUnlink();

    public abstract Boolean getDisableTextMessaging();

    abstract Boolean getDisableVehicleInventoryView();

    public abstract Integer getEmergencyNumber();

    public abstract Boolean getEnableExperimentsRider();

    public abstract Boolean getEnableHearingImpairedDriverAccessibility();

    abstract Boolean getEnableMusicBar();

    public abstract Boolean getEnableNetworkMonitoring();

    public abstract Boolean getEnableSessionAnalytics();

    public abstract Boolean getEnableSosIndiaRider();

    abstract Boolean getEnableUpfrontPricingV1();

    public boolean getExperimentsEnabled()
    {
        return getEnableExperimentsRider().booleanValue();
    }

    public boolean getMusicTrayEnabled()
    {
        return getEnableMusicBar().booleanValue();
    }

    public abstract Long getPingUpdateIntervalMs();

    public abstract RiderAppConfig getRider();

    public RiderAppConfig getRiderConfig()
    {
        return getRider();
    }

    public boolean getSpotifyLinkAndUnlinkDisabled()
    {
        return getDisableSpotifyLinkAndUnlink().booleanValue();
    }

    public abstract Boolean getUseTripLegs();

    public boolean getVehicleInventoryViewDisabled()
    {
        return getDisableVehicleInventoryView().booleanValue();
    }

    public boolean isCallingDisabled()
    {
        return getDisableCalling().booleanValue();
    }

    public boolean isNetworkMonitoringEnabled()
    {
        return getEnableNetworkMonitoring().booleanValue();
    }

    public boolean isSosIndiaEnabled()
    {
        return getEnableSosIndiaRider().booleanValue();
    }

    public boolean isTextMessagingDisabled()
    {
        return getDisableTextMessaging().booleanValue();
    }

    public boolean isUpfrontPricingEnabled()
    {
        return getEnableUpfrontPricingV1().booleanValue();
    }

    public boolean isUseTripLegsEnabled()
    {
        return getUseTripLegs().booleanValue();
    }

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        class _cls1
        {

            static final int $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[];

            static 
            {
                $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property = new int[Shape_AppConfig.Property.values().length];
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.DISABLE_CALLING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.DISABLE_TEXT_MESSAGING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.DISABLE_VEHICLE_INVENTORY_VIEW.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.ENABLE_EXPERIMENTS_RIDER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.ENABLE_MUSIC_BAR.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.ENABLE_NETWORK_MONITORING.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.ENABLE_SESSION_ANALYTICS.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.ENABLE_SOS_INDIA_RIDER.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.ENABLE_UPFRONT_PRICING_V1.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.DISABLE_SPOTIFY_LINK_AND_UNLINK.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_AppConfig$Property[Shape_AppConfig.Property.USE_TRIP_LEGS.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.ubercab.client.core.model.Shape_AppConfig.Property[((Shape_AppConfig.Property)hny).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return Boolean.valueOf(false);

        case 10: // '\n'
        case 11: // '\013'
            return Boolean.valueOf(true);
        }
    }

    public abstract AppConfig setCoordinateSystem(String s);

    public abstract AppConfig setDisableCalling(Boolean boolean1);

    public abstract AppConfig setDisableSpotifyLinkAndUnlink(Boolean boolean1);

    public abstract AppConfig setDisableTextMessaging(Boolean boolean1);

    public abstract AppConfig setDisableVehicleInventoryView(Boolean boolean1);

    public abstract AppConfig setEmergencyNumber(Integer integer);

    public abstract AppConfig setEnableExperimentsRider(Boolean boolean1);

    public abstract AppConfig setEnableHearingImpairedDriverAccessibility(Boolean boolean1);

    abstract AppConfig setEnableMusicBar(Boolean boolean1);

    public abstract AppConfig setEnableNetworkMonitoring(Boolean boolean1);

    public abstract AppConfig setEnableSessionAnalytics(Boolean boolean1);

    public abstract AppConfig setEnableSosIndiaRider(Boolean boolean1);

    abstract AppConfig setEnableUpfrontPricingV1(Boolean boolean1);

    public abstract AppConfig setPingUpdateIntervalMs(Long long1);

    public abstract AppConfig setRider(RiderAppConfig riderappconfig);

    public void setRiderConfig(RiderAppConfig riderappconfig)
    {
        setRider(riderappconfig);
    }

    public abstract AppConfig setUseTripLegs(Boolean boolean1);
}
