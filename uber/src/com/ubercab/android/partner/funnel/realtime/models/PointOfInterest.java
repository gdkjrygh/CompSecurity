// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models;

import android.os.Parcelable;

public abstract class PointOfInterest
    implements Parcelable
{

    public static final String TYPE_UBER_LOT = "uber_lot";

    public PointOfInterest()
    {
    }

    public abstract String getAddress();

    public abstract int getCostAmount();

    public abstract String getCurrencySymbol();

    public abstract String getDescription();

    public abstract int getIncentiveAmount();

    public abstract double getLat();

    public abstract double getLng();

    public abstract String getMisc();

    public abstract String getName();

    public abstract String getPhoneNumber();

    public abstract String getPoiId();

    public abstract String getType();

    abstract PointOfInterest setAddress(String s);

    abstract PointOfInterest setCostAmount(int i);

    abstract PointOfInterest setCurrencySymbol(String s);

    abstract PointOfInterest setDescription(String s);

    abstract PointOfInterest setIncentiveAmount(int i);

    abstract PointOfInterest setLat(double d);

    abstract PointOfInterest setLng(double d);

    abstract PointOfInterest setMisc(String s);

    abstract PointOfInterest setName(String s);

    abstract PointOfInterest setPhoneNumber(String s);

    abstract PointOfInterest setPoiId(String s);

    abstract PointOfInterest setType(String s);
}
