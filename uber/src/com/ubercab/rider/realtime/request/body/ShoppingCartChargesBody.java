// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ShoppingCartChargesBody

public abstract class ShoppingCartChargesBody
{

    public ShoppingCartChargesBody()
    {
    }

    public static ShoppingCartChargesBody create()
    {
        return new Shape_ShoppingCartChargesBody();
    }

    public abstract List getItems();

    public abstract String getPromoCode();

    public abstract String getVehicleViewId();

    public abstract ShoppingCartChargesBody setItems(List list);

    public abstract ShoppingCartChargesBody setPromoCode(String s);

    public abstract ShoppingCartChargesBody setVehicleViewId(String s);
}
