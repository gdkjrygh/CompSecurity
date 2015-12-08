// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import android.util.SparseArray;

public final class LocationType extends Enum
{

    private static final LocationType $VALUES[];
    public static final LocationType Airport;
    public static final LocationType City;
    public static final LocationType Empty;
    public static final LocationType EventVenue;
    public static final LocationType GolfCourse;
    public static final LocationType Intersection;
    public static final LocationType LakeOrRiver;
    public static final LocationType OutdoorLocation;
    public static final LocationType PostalCode;
    public static final LocationType RecreationLocation;
    public static final LocationType School;
    public static final LocationType ShoppingCenter;
    public static final LocationType SkiResort;
    private static SparseArray map;
    private final int value;

    private LocationType(String s, int i, int j)
    {
        super(s, i);
        value = j;
        add();
    }

    private void add()
    {
        com/weather/dal/locations/LocationType;
        JVM INSTR monitorenter ;
        if (map == null)
        {
            map = new SparseArray();
        }
        map.put(value, this);
        com/weather/dal/locations/LocationType;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/weather/dal/locations/LocationType;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static LocationType getMember(int i)
    {
        LocationType locationtype = (LocationType)map.get(i);
        if (locationtype == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("LocationType not valid for:").append(i).toString());
        } else
        {
            return locationtype;
        }
    }

    public static LocationType valueOf(String s)
    {
        return (LocationType)Enum.valueOf(com/weather/dal/locations/LocationType, s);
    }

    public static LocationType[] values()
    {
        return (LocationType[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        Empty = new LocationType("Empty", 0, 0);
        City = new LocationType("City", 1, 1);
        PostalCode = new LocationType("PostalCode", 2, 4);
        GolfCourse = new LocationType("GolfCourse", 3, 5);
        Airport = new LocationType("Airport", 4, 9);
        SkiResort = new LocationType("SkiResort", 5, 11);
        RecreationLocation = new LocationType("RecreationLocation", 6, 13);
        Intersection = new LocationType("Intersection", 7, 16);
        School = new LocationType("School", 8, 17);
        ShoppingCenter = new LocationType("ShoppingCenter", 9, 18);
        OutdoorLocation = new LocationType("OutdoorLocation", 10, 19);
        EventVenue = new LocationType("EventVenue", 11, 20);
        LakeOrRiver = new LocationType("LakeOrRiver", 12, 21);
        $VALUES = (new LocationType[] {
            Empty, City, PostalCode, GolfCourse, Airport, SkiResort, RecreationLocation, Intersection, School, ShoppingCenter, 
            OutdoorLocation, EventVenue, LakeOrRiver
        });
    }
}
