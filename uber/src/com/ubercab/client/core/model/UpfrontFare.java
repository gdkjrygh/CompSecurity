// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.rider.realtime.model.Signature;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpfrontFare, UpfrontFareSignature

public abstract class UpfrontFare
    implements Parcelable, com.ubercab.rider.realtime.model.UpfrontFare
{

    public UpfrontFare()
    {
    }

    public static UpfrontFare create()
    {
        return new Shape_UpfrontFare();
    }

    public abstract Integer getCapacity();

    public abstract String getCurrencyCode();

    public abstract double getDestinationLat();

    public UberLatLng getDestinationLatLng()
    {
        return new UberLatLng(getDestinationLat(), getDestinationLng());
    }

    public abstract double getDestinationLng();

    public abstract String getFare();

    public abstract double getOriginLat();

    public UberLatLng getOriginLatLng()
    {
        return new UberLatLng(getOriginLat(), getOriginLng());
    }

    public abstract double getOriginLng();

    public abstract UpfrontFareSignature getSignature();

    public volatile Signature getSignature()
    {
        return getSignature();
    }

    public abstract String getUuid();

    public abstract int getVehicleViewId();

    abstract UpfrontFare setCapacity(Integer integer);

    abstract UpfrontFare setCurrencyCode(String s);

    abstract UpfrontFare setDestinationLat(double d);

    abstract UpfrontFare setDestinationLng(double d);

    abstract UpfrontFare setFare(String s);

    abstract UpfrontFare setOriginLat(double d);

    abstract UpfrontFare setOriginLng(double d);

    abstract UpfrontFare setSignature(UpfrontFareSignature upfrontfaresignature);

    abstract UpfrontFare setUuid(String s);

    abstract UpfrontFare setVehicleViewId(int i);
}
