// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.settings;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsGeneralSettingsAttribute extends Enum
    implements Attribute
{

    private static final LocalyticsGeneralSettingsAttribute $VALUES[];
    public static final LocalyticsGeneralSettingsAttribute ABOUT_THIS_APP_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute ACCOUNT_SETTINGS_OPENED;
    public static final LocalyticsGeneralSettingsAttribute AD_CHOICES_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute FEEDBACK_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute FOLLOW_ME_FORECAST_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute LOGOUT_LOGIN_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute ONGOING_TEMPERATURE_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute PRIVACY_POLICY_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute SESSION_M_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute TERMS_OF_USE_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute UNITS_OF_MEASURE_CHANGED;
    public static final LocalyticsGeneralSettingsAttribute UNITS_OF_MEASURE_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute VIEW_YOUR_MPOINTS_CLICKED;
    public static final LocalyticsGeneralSettingsAttribute WEATHER_ALERTS_CLICKED;
    private final String attributeName;
    private final String defaultValue;

    private LocalyticsGeneralSettingsAttribute(String s, int i, String s1)
    {
        this(s, i, s1, null);
    }

    private LocalyticsGeneralSettingsAttribute(String s, int i, String s1, String s2)
    {
        super(s, i);
        attributeName = s1;
        defaultValue = s2;
    }

    public static LocalyticsGeneralSettingsAttribute valueOf(String s)
    {
        return (LocalyticsGeneralSettingsAttribute)Enum.valueOf(com/weather/commons/analytics/settings/LocalyticsGeneralSettingsAttribute, s);
    }

    public static LocalyticsGeneralSettingsAttribute[] values()
    {
        return (LocalyticsGeneralSettingsAttribute[])$VALUES.clone();
    }

    public String getDefaultValue()
    {
        return defaultValue;
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        ACCOUNT_SETTINGS_OPENED = new LocalyticsGeneralSettingsAttribute("ACCOUNT_SETTINGS_OPENED", 0, "opened account settings", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        LOGOUT_LOGIN_CLICKED = new LocalyticsGeneralSettingsAttribute("LOGOUT_LOGIN_CLICKED", 1, "touched log out/in");
        WEATHER_ALERTS_CLICKED = new LocalyticsGeneralSettingsAttribute("WEATHER_ALERTS_CLICKED", 2, "touched weather alerts", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        UNITS_OF_MEASURE_CLICKED = new LocalyticsGeneralSettingsAttribute("UNITS_OF_MEASURE_CLICKED", 3, "touched units of measure", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        UNITS_OF_MEASURE_CHANGED = new LocalyticsGeneralSettingsAttribute("UNITS_OF_MEASURE_CHANGED", 4, "changed units of measure");
        ONGOING_TEMPERATURE_CLICKED = new LocalyticsGeneralSettingsAttribute("ONGOING_TEMPERATURE_CLICKED", 5, "touched on-going temperature", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        FOLLOW_ME_FORECAST_CLICKED = new LocalyticsGeneralSettingsAttribute("FOLLOW_ME_FORECAST_CLICKED", 6, "touched follow me forecast");
        SESSION_M_CLICKED = new LocalyticsGeneralSettingsAttribute("SESSION_M_CLICKED", 7, "touched session m");
        VIEW_YOUR_MPOINTS_CLICKED = new LocalyticsGeneralSettingsAttribute("VIEW_YOUR_MPOINTS_CLICKED", 8, "touched view your mPOINTS", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        ABOUT_THIS_APP_CLICKED = new LocalyticsGeneralSettingsAttribute("ABOUT_THIS_APP_CLICKED", 9, "touched about this app", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        TERMS_OF_USE_CLICKED = new LocalyticsGeneralSettingsAttribute("TERMS_OF_USE_CLICKED", 10, "touched terms of use", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        PRIVACY_POLICY_CLICKED = new LocalyticsGeneralSettingsAttribute("PRIVACY_POLICY_CLICKED", 11, "touched privacy policy", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        FEEDBACK_CLICKED = new LocalyticsGeneralSettingsAttribute("FEEDBACK_CLICKED", 12, "touched feedback", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        AD_CHOICES_CLICKED = new LocalyticsGeneralSettingsAttribute("AD_CHOICES_CLICKED", 13, "touched ad choices", com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        $VALUES = (new LocalyticsGeneralSettingsAttribute[] {
            ACCOUNT_SETTINGS_OPENED, LOGOUT_LOGIN_CLICKED, WEATHER_ALERTS_CLICKED, UNITS_OF_MEASURE_CLICKED, UNITS_OF_MEASURE_CHANGED, ONGOING_TEMPERATURE_CLICKED, FOLLOW_ME_FORECAST_CLICKED, SESSION_M_CLICKED, VIEW_YOUR_MPOINTS_CLICKED, ABOUT_THIS_APP_CLICKED, 
            TERMS_OF_USE_CLICKED, PRIVACY_POLICY_CLICKED, FEEDBACK_CLICKED, AD_CHOICES_CLICKED
        });
    }
}
