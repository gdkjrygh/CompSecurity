// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.helpers;


public final class GeoDataType extends Enum
{

    private static final GeoDataType $VALUES[];
    public static final GeoDataType EARTHQUAKE;
    public static final GeoDataType HURRICANE;
    public static final GeoDataType STORM_CELL;
    public static final GeoDataType TRAFFIC_INCIDENT;
    public static final GeoDataType UNKNOWN;
    public static final GeoDataType WEATHER_ALERT;
    private boolean gzipGML;
    private int id;
    private boolean isCategoryBased;
    private boolean isUseDecluttering;
    private String tesseraFeatureId;
    private String title;

    private GeoDataType(String s, int i, int j, String s1, boolean flag, boolean flag1, String s2, 
            boolean flag2)
    {
        super(s, i);
        id = j;
        title = s1;
        gzipGML = flag;
        isCategoryBased = flag1;
        tesseraFeatureId = s2;
        isUseDecluttering = flag2;
    }

    public static GeoDataType getGeoDataTypeForId(int i)
    {
        GeoDataType ageodatatype[] = values();
        int k = ageodatatype.length;
        for (int j = 0; j < k; j++)
        {
            GeoDataType geodatatype = ageodatatype[j];
            if (geodatatype.id == i)
            {
                return geodatatype;
            }
        }

        return UNKNOWN;
    }

    public static GeoDataType valueOf(String s)
    {
        return (GeoDataType)Enum.valueOf(com/wsi/android/framework/wxdata/geodata/helpers/GeoDataType, s);
    }

    public static GeoDataType[] values()
    {
        return (GeoDataType[])$VALUES.clone();
    }

    public int getId()
    {
        return id;
    }

    public String getTesseraFeatureId()
    {
        return tesseraFeatureId;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isCategoryBased()
    {
        return isCategoryBased;
    }

    public boolean isGmlGZipped()
    {
        return gzipGML;
    }

    public boolean isUseDucluttering()
    {
        return isUseDecluttering;
    }

    public void setTesseraId(String s)
    {
        tesseraFeatureId = s;
    }

    static 
    {
        UNKNOWN = new GeoDataType("UNKNOWN", 0, 0, "", false, false, "", false);
        STORM_CELL = new GeoDataType("STORM_CELL", 1, 2, "StormCellCurrent", false, false, "", true);
        EARTHQUAKE = new GeoDataType("EARTHQUAKE", 2, 4, "EarthquakesRecent", false, false, "", true);
        HURRICANE = new GeoDataType("HURRICANE", 3, 7, "TropicalTrackActive", false, false, "", false);
        WEATHER_ALERT = new GeoDataType("WEATHER_ALERT", 4, 10, "WeatherAlert", true, true, "", false);
        TRAFFIC_INCIDENT = new GeoDataType("TRAFFIC_INCIDENT", 5, 13, "", false, false, "", false);
        $VALUES = (new GeoDataType[] {
            UNKNOWN, STORM_CELL, EARTHQUAKE, HURRICANE, WEATHER_ALERT, TRAFFIC_INCIDENT
        });
    }
}
