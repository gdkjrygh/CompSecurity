// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;


public final class AlertResponseField extends Enum
{

    private static final AlertResponseField $VALUES[];
    public static final AlertResponseField ARTICLE_ID;
    public static final AlertResponseField ARTICLE_URL;
    public static final AlertResponseField CARDINAL_DEGREES;
    public static final AlertResponseField CARDINAL_DIRECTION;
    public static final AlertResponseField CITY;
    public static final AlertResponseField COUNTRY;
    public static final AlertResponseField COUNTRY_CODE;
    public static final AlertResponseField DESCRIPTION;
    public static final AlertResponseField DISTANCE_KM;
    public static final AlertResponseField DISTANCE_MILES;
    public static final AlertResponseField ETN;
    public static final AlertResponseField ETNPHENOM;
    public static final AlertResponseField FIELD_LAT;
    public static final AlertResponseField FIELD_LONG;
    public static final AlertResponseField GRASS_LEVEL;
    public static final AlertResponseField IMG_SRC;
    public static final AlertResponseField LATITUDE;
    public static final AlertResponseField LOCALIZED_HEADLINE;
    public static final AlertResponseField LOCATION;
    public static final AlertResponseField LOCATION_CODE;
    public static final AlertResponseField LOC_TYPE;
    public static final AlertResponseField LONGITUDE;
    public static final AlertResponseField OFFICE_ID;
    public static final AlertResponseField PRESENTATION_NAME;
    public static final AlertResponseField PRODUCT;
    public static final AlertResponseField SEVERITY_NUM;
    public static final AlertResponseField SIGNIFICANCE;
    public static final AlertResponseField SIGNIFICANT_WEATHER_ALERT_LOCALIZED_TEXT;
    public static final AlertResponseField SIGNIFICANT_WEATHER_ALERT_TYPE_CODE;
    public static final AlertResponseField STATE;
    public static final AlertResponseField STRIKE_LATITUDE;
    public static final AlertResponseField STRIKE_LONGITUDE;
    public static final AlertResponseField TEXT;
    public static final AlertResponseField TIMESTAMP;
    public static final AlertResponseField TITLE;
    public static final AlertResponseField TREE_LEVEL;
    public static final AlertResponseField TWC_EVENT_ID;
    public static final AlertResponseField WEEDS_LEVEL;
    private String name;

    private AlertResponseField(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static AlertResponseField valueOf(String s)
    {
        return (AlertResponseField)Enum.valueOf(com/weather/commons/push/AlertResponseField, s);
    }

    public static AlertResponseField[] values()
    {
        return (AlertResponseField[])$VALUES.clone();
    }

    public String getName()
    {
        return name;
    }

    static 
    {
        SEVERITY_NUM = new AlertResponseField("SEVERITY_NUM", 0, "severityNum");
        PRODUCT = new AlertResponseField("PRODUCT", 1, "product");
        COUNTRY_CODE = new AlertResponseField("COUNTRY_CODE", 2, "countryCode");
        CITY = new AlertResponseField("CITY", 3, "city");
        STATE = new AlertResponseField("STATE", 4, "state");
        COUNTRY = new AlertResponseField("COUNTRY", 5, "country");
        ETNPHENOM = new AlertResponseField("ETNPHENOM", 6, "phenom");
        SIGNIFICANCE = new AlertResponseField("SIGNIFICANCE", 7, "significance");
        DESCRIPTION = new AlertResponseField("DESCRIPTION", 8, "description");
        TWC_EVENT_ID = new AlertResponseField("TWC_EVENT_ID", 9, "twcEventId");
        PRESENTATION_NAME = new AlertResponseField("PRESENTATION_NAME", 10, "prsntNm");
        LOC_TYPE = new AlertResponseField("LOC_TYPE", 11, "locType");
        LOCATION = new AlertResponseField("LOCATION", 12, "location");
        LOCATION_CODE = new AlertResponseField("LOCATION_CODE", 13, "locationCode");
        TREE_LEVEL = new AlertResponseField("TREE_LEVEL", 14, "treeLevel");
        GRASS_LEVEL = new AlertResponseField("GRASS_LEVEL", 15, "grassLevel");
        WEEDS_LEVEL = new AlertResponseField("WEEDS_LEVEL", 16, "weedsLevel");
        LOCALIZED_HEADLINE = new AlertResponseField("LOCALIZED_HEADLINE", 17, "localizedHeadline");
        ARTICLE_ID = new AlertResponseField("ARTICLE_ID", 18, "articleId");
        ARTICLE_URL = new AlertResponseField("ARTICLE_URL", 19, "articleUrl");
        IMG_SRC = new AlertResponseField("IMG_SRC", 20, "imgSrc");
        TITLE = new AlertResponseField("TITLE", 21, "title");
        CARDINAL_DEGREES = new AlertResponseField("CARDINAL_DEGREES", 22, "cardinalDegrees");
        CARDINAL_DIRECTION = new AlertResponseField("CARDINAL_DIRECTION", 23, "cardinalDigration");
        DISTANCE_KM = new AlertResponseField("DISTANCE_KM", 24, "distanceKm");
        DISTANCE_MILES = new AlertResponseField("DISTANCE_MILES", 25, "distanceMiles");
        LATITUDE = new AlertResponseField("LATITUDE", 26, "latitude");
        LONGITUDE = new AlertResponseField("LONGITUDE", 27, "longitude");
        TEXT = new AlertResponseField("TEXT", 28, "text");
        STRIKE_LATITUDE = new AlertResponseField("STRIKE_LATITUDE", 29, "strikeLatitude");
        STRIKE_LONGITUDE = new AlertResponseField("STRIKE_LONGITUDE", 30, "strikeLongitude");
        TIMESTAMP = new AlertResponseField("TIMESTAMP", 31, "timestamp");
        OFFICE_ID = new AlertResponseField("OFFICE_ID", 32, "officeId");
        ETN = new AlertResponseField("ETN", 33, "etn");
        FIELD_LAT = new AlertResponseField("FIELD_LAT", 34, "latitude");
        FIELD_LONG = new AlertResponseField("FIELD_LONG", 35, "longitude");
        SIGNIFICANT_WEATHER_ALERT_TYPE_CODE = new AlertResponseField("SIGNIFICANT_WEATHER_ALERT_TYPE_CODE", 36, "g8phenomena");
        SIGNIFICANT_WEATHER_ALERT_LOCALIZED_TEXT = new AlertResponseField("SIGNIFICANT_WEATHER_ALERT_LOCALIZED_TEXT", 37, "localizedText");
        $VALUES = (new AlertResponseField[] {
            SEVERITY_NUM, PRODUCT, COUNTRY_CODE, CITY, STATE, COUNTRY, ETNPHENOM, SIGNIFICANCE, DESCRIPTION, TWC_EVENT_ID, 
            PRESENTATION_NAME, LOC_TYPE, LOCATION, LOCATION_CODE, TREE_LEVEL, GRASS_LEVEL, WEEDS_LEVEL, LOCALIZED_HEADLINE, ARTICLE_ID, ARTICLE_URL, 
            IMG_SRC, TITLE, CARDINAL_DEGREES, CARDINAL_DIRECTION, DISTANCE_KM, DISTANCE_MILES, LATITUDE, LONGITUDE, TEXT, STRIKE_LATITUDE, 
            STRIKE_LONGITUDE, TIMESTAMP, OFFICE_ID, ETN, FIELD_LAT, FIELD_LONG, SIGNIFICANT_WEATHER_ALERT_TYPE_CODE, SIGNIFICANT_WEATHER_ALERT_LOCALIZED_TEXT
        });
    }
}
