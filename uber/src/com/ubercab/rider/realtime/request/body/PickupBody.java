// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.UpfrontFare;
import com.ubercab.rider.realtime.request.param.DeviceData;
import com.ubercab.rider.realtime.request.param.Note;
import gjz;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_PickupBody, DynamicPickup, AddExpenseInfoBody, ExtraPaymentData, 
//            ShoppingCart

public abstract class PickupBody
{

    public PickupBody()
    {
    }

    public static PickupBody create(int i, Location location)
    {
        gjz.a(location);
        return (new Shape_PickupBody()).setVehicleViewId(i).setPickupLocation(com.ubercab.rider.realtime.request.param.Location.create(location.getLatitude(), location.getLongitude()));
    }

    public abstract Integer getCapacity();

    public abstract com.ubercab.rider.realtime.request.param.Location getDestination();

    public abstract DeviceData getDeviceData();

    public abstract DynamicPickup getDynamicPickup();

    public abstract AddExpenseInfoBody getExpenseInfo();

    public abstract ExtraPaymentData getExtraPaymentData();

    public abstract Long getFareId();

    public abstract Boolean getIsGoogleWalletRequest();

    public abstract Note getNote();

    public abstract String getPaymentProfileUUID();

    public abstract com.ubercab.rider.realtime.request.param.Location getPickupLocation();

    public abstract String getProfileType();

    public abstract String getProfileUUID();

    public abstract ShoppingCart getShoppingCart();

    public abstract UpfrontFare getUpfrontFare();

    public abstract Boolean getUseCredits();

    public abstract int getVehicleViewId();

    public abstract PickupBody setCapacity(Integer integer);

    public abstract PickupBody setDestination(com.ubercab.rider.realtime.request.param.Location location);

    public abstract PickupBody setDeviceData(DeviceData devicedata);

    public abstract PickupBody setDynamicPickup(DynamicPickup dynamicpickup);

    public abstract PickupBody setExpenseInfo(AddExpenseInfoBody addexpenseinfobody);

    public abstract PickupBody setExtraPaymentData(ExtraPaymentData extrapaymentdata);

    public abstract PickupBody setFareId(Long long1);

    public abstract PickupBody setIsGoogleWalletRequest(Boolean boolean1);

    public abstract PickupBody setNote(Note note);

    public abstract PickupBody setPaymentProfileUUID(String s);

    abstract PickupBody setPickupLocation(com.ubercab.rider.realtime.request.param.Location location);

    public abstract PickupBody setProfileType(String s);

    public abstract PickupBody setProfileUUID(String s);

    public abstract PickupBody setShoppingCart(ShoppingCart shoppingcart);

    public abstract PickupBody setUpfrontFare(UpfrontFare upfrontfare);

    public abstract PickupBody setUseCredits(Boolean boolean1);

    abstract PickupBody setVehicleViewId(int i);
}
