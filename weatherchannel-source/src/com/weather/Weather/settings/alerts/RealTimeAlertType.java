// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import com.weather.commons.push.ProductType;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.device.LocaleUtil;

public final class RealTimeAlertType extends Enum
{

    private static final RealTimeAlertType $VALUES[];
    public static final RealTimeAlertType LIGHTNING_STRIKES;
    public static final RealTimeAlertType REAL_TIME_RAIN;

    private RealTimeAlertType(String s, int i)
    {
        super(s, i);
    }

    public static RealTimeAlertType valueOf(String s)
    {
        return (RealTimeAlertType)Enum.valueOf(com/weather/Weather/settings/alerts/RealTimeAlertType, s);
    }

    public static RealTimeAlertType[] values()
    {
        return (RealTimeAlertType[])$VALUES.clone();
    }

    int getDisclaimerResourceId()
    {
        static class _cls1
        {

            static final int $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[];

            static 
            {
                $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType = new int[RealTimeAlertType.values().length];
                try
                {
                    $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[RealTimeAlertType.REAL_TIME_RAIN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[RealTimeAlertType.LIGHTNING_STRIKES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f070292;
        }
    }

    com.weather.util.prefs.TwcPrefs.Keys getLightPreferenceKey()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERT_LIGHT;

        case 2: // '\002'
            return com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERT_LIGHT;
        }
    }

    com.weather.commons.analytics.LocalyticsTags.ScreenName getLocalyticsScreenName()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return com.weather.commons.analytics.LocalyticsTags.ScreenName.REAL_TIME_RAIN_ALERTS;

        case 2: // '\002'
            return com.weather.commons.analytics.LocalyticsTags.ScreenName.LIGHTNING_STRIKES_ALERTS;
        }
    }

    com.weather.commons.analytics.LocalyticsTags.Tags getLocalyticsTag()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            SavedLocation savedlocation = FollowMe.getInstance().getLocation();
            if (savedlocation != null && !savedlocation.getCountryCode().equals("US"))
            {
                return com.weather.commons.analytics.LocalyticsTags.Tags.INTERNATIONAL_REAL_TIME_RAIN_ALERT;
            } else
            {
                return com.weather.commons.analytics.LocalyticsTags.Tags.REAL_TIME_RAIN_ALERT;
            }

        case 2: // '\002'
            return com.weather.commons.analytics.LocalyticsTags.Tags.LIGHTNING_STRIKES_ALERT;
        }
    }

    com.weather.util.prefs.TwcPrefs.Keys getPreferenceKey()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS;

        case 2: // '\002'
            return com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERTS;
        }
    }

    ProductType getProductType()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return ProductType.PRODUCT_REAL_TIME_RAIN;

        case 2: // '\002'
            return ProductType.PRODUCT_LIGHTNING_STRIKES;
        }
    }

    com.weather.util.prefs.TwcPrefs.Keys getSoundPreferenceKey()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERT_SOUND;

        case 2: // '\002'
            return com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERT_SOUND;
        }
    }

    int getTitleResourceId()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f070205;

        case 2: // '\002'
            return 0x7f0701fe;
        }
    }

    com.weather.util.prefs.TwcPrefs.Keys getVibrationPreferenceKey()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERT_VIBRATION;

        case 2: // '\002'
            return com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERT_VIBRATION;
        }
    }

    boolean isLoginRequiredToEnableAlert()
    {
        switch (_cls1..SwitchMap.com.weather.Weather.settings.alerts.RealTimeAlertType[ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            return LocaleUtil.isDeviceInUS();

        case 2: // '\002'
            return true;
        }
    }

    static 
    {
        REAL_TIME_RAIN = new RealTimeAlertType("REAL_TIME_RAIN", 0);
        LIGHTNING_STRIKES = new RealTimeAlertType("LIGHTNING_STRIKES", 1);
        $VALUES = (new RealTimeAlertType[] {
            REAL_TIME_RAIN, LIGHTNING_STRIKES
        });
    }
}
