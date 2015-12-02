// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            Shape_ShoppingCartChargesRequestLegacy

public abstract class ShoppingCartChargesRequestLegacy
{

    public ShoppingCartChargesRequestLegacy()
    {
    }

    public static ShoppingCartChargesRequestLegacy create(List list, String s, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        return (new Shape_ShoppingCartChargesRequestLegacy()).setItems(list).setVehicleViewId(s).setPromoCode(s2);
    }

    public abstract List getItems();

    public abstract String getPromoCode();

    public abstract String getVehicleViewId();

    abstract ShoppingCartChargesRequestLegacy setItems(List list);

    abstract ShoppingCartChargesRequestLegacy setPromoCode(String s);

    abstract ShoppingCartChargesRequestLegacy setVehicleViewId(String s);
}
