// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.surge;

import hny;

public class <init> extends Enum
    implements hny
{

    private static final SHOW_RATES $VALUES[];
    public static final SHOW_RATES BASE;
    public static final SHOW_RATES BASE_VALUE;
    public static final SHOW_RATES CANCELLATION;
    public static final SHOW_RATES DISTANCE_UNIT;
    public static final SHOW_RATES DROP_NOTIFICATION;
    public static final SHOW_RATES EXPIRATION_TIME;
    public static final SHOW_RATES FARE_ID;
    public static final SHOW_RATES FARE_UUID;
    public static final SHOW_RATES FORCE_FARE_ESTIMATE;
    public static final SHOW_RATES ID;
    public static final SHOW_RATES MINIMUM;
    public static final SHOW_RATES MULTIPLIER;
    public static final SHOW_RATES PER_DISTANCE_UNIT;
    public static final SHOW_RATES PER_MINUTE;
    public static final SHOW_RATES SAFE_RIDES_FEE;
    public static final SHOW_RATES SCREEN_TYPE;
    public static final SHOW_RATES SHOW_RATES;
    public static final SHOW_RATES SPEED_THRESHOLD_MPS;
    public static final SHOW_RATES TYPE;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/ubercab/client/core/model/surge/Shape_Surge$Property, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        BASE_VALUE = new Shape_Surge.Property("BASE_VALUE", 0) {

            public final String toString()
            {
                return "baseValue";
            }

        };
        BASE = new Shape_Surge.Property("BASE", 1) {

            public final String toString()
            {
                return "base";
            }

        };
        DISTANCE_UNIT = new Shape_Surge.Property("DISTANCE_UNIT", 2) {

            public final String toString()
            {
                return "distanceUnit";
            }

        };
        FARE_ID = new Shape_Surge.Property("FARE_ID", 3) {

            public final String toString()
            {
                return "fareId";
            }

        };
        MINIMUM = new Shape_Surge.Property("MINIMUM", 4) {

            public final String toString()
            {
                return "minimum";
            }

        };
        PER_DISTANCE_UNIT = new Shape_Surge.Property("PER_DISTANCE_UNIT", 5) {

            public final String toString()
            {
                return "perDistanceUnit";
            }

        };
        PER_MINUTE = new Shape_Surge.Property("PER_MINUTE", 6) {

            public final String toString()
            {
                return "perMinute";
            }

        };
        EXPIRATION_TIME = new Shape_Surge.Property("EXPIRATION_TIME", 7) {

            public final String toString()
            {
                return "expirationTime";
            }

        };
        MULTIPLIER = new Shape_Surge.Property("MULTIPLIER", 8) {

            public final String toString()
            {
                return "multiplier";
            }

        };
        SAFE_RIDES_FEE = new Shape_Surge.Property("SAFE_RIDES_FEE", 9) {

            public final String toString()
            {
                return "safeRidesFee";
            }

        };
        TYPE = new Shape_Surge.Property("TYPE", 10) {

            public final String toString()
            {
                return "type";
            }

        };
        SCREEN_TYPE = new Shape_Surge.Property("SCREEN_TYPE", 11) {

            public final String toString()
            {
                return "screenType";
            }

        };
        DROP_NOTIFICATION = new Shape_Surge.Property("DROP_NOTIFICATION", 12) {

            public final String toString()
            {
                return "dropNotification";
            }

        };
        CANCELLATION = new Shape_Surge.Property("CANCELLATION", 13) {

            public final String toString()
            {
                return "cancellation";
            }

        };
        FARE_UUID = new Shape_Surge.Property("FARE_UUID", 14) {

            public final String toString()
            {
                return "fareUuid";
            }

        };
        SPEED_THRESHOLD_MPS = new Shape_Surge.Property("SPEED_THRESHOLD_MPS", 15) {

            public final String toString()
            {
                return "speedThresholdMps";
            }

        };
        ID = new Shape_Surge.Property("ID", 16) {

            public final String toString()
            {
                return "id";
            }

        };
        FORCE_FARE_ESTIMATE = new Shape_Surge.Property("FORCE_FARE_ESTIMATE", 17) {

            public final String toString()
            {
                return "forceFareEstimate";
            }

        };
        SHOW_RATES = new Shape_Surge.Property("SHOW_RATES", 18) {

            public final String toString()
            {
                return "showRates";
            }

        };
        $VALUES = (new .VALUES[] {
            BASE_VALUE, BASE, DISTANCE_UNIT, FARE_ID, MINIMUM, PER_DISTANCE_UNIT, PER_MINUTE, EXPIRATION_TIME, MULTIPLIER, SAFE_RIDES_FEE, 
            TYPE, SCREEN_TYPE, DROP_NOTIFICATION, CANCELLATION, FARE_UUID, SPEED_THRESHOLD_MPS, ID, FORCE_FARE_ESTIMATE, SHOW_RATES
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
