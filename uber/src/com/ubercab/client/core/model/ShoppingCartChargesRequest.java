// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_ShoppingCartChargesRequest

public abstract class ShoppingCartChargesRequest
{

    public ShoppingCartChargesRequest()
    {
    }

    public static ShoppingCartChargesRequest create(List list, String s, String s1, Double double1, Double double2, String s2)
    {
        return (new Shape_ShoppingCartChargesRequest()).setItems(list).setVehicleViewId(s).setPaymentProfileUuid(s1).setLatitude(double1).setLongitude(double2).setDevice(s2);
    }

    public abstract String getDevice();

    public abstract List getItems();

    public abstract Double getLatitude();

    public abstract Double getLongitude();

    public abstract String getPaymentProfileUuid();

    public abstract String getVehicleViewId();

    abstract ShoppingCartChargesRequest setDevice(String s);

    abstract ShoppingCartChargesRequest setItems(List list);

    abstract ShoppingCartChargesRequest setLatitude(Double double1);

    abstract ShoppingCartChargesRequest setLongitude(Double double1);

    abstract ShoppingCartChargesRequest setPaymentProfileUuid(String s);

    abstract ShoppingCartChargesRequest setVehicleViewId(String s);
}
