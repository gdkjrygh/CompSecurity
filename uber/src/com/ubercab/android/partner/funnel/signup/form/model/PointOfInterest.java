// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.form.model;

import android.os.Parcelable;
import com.ubercab.android.location.UberLatLng;

public abstract class PointOfInterest
    implements Parcelable
{

    public static final String TYPE_UBER_LOT = "uber_lot";
    private UberLatLng mUberLatLng;

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

    public UberLatLng getUberLatLng()
    {
        if (mUberLatLng == null)
        {
            mUberLatLng = new UberLatLng(getLat(), getLng());
        }
        return mUberLatLng;
    }

    public abstract PointOfInterest setAddress(String s);

    public abstract PointOfInterest setCostAmount(int i);

    public abstract PointOfInterest setCurrencySymbol(String s);

    public abstract PointOfInterest setDescription(String s);

    public abstract PointOfInterest setIncentiveAmount(int i);

    public abstract PointOfInterest setLat(double d);

    public abstract PointOfInterest setLng(double d);

    public abstract PointOfInterest setMisc(String s);

    public abstract PointOfInterest setName(String s);

    public abstract PointOfInterest setPhoneNumber(String s);

    public abstract PointOfInterest setPoiId(String s);

    public abstract PointOfInterest setType(String s);
}
