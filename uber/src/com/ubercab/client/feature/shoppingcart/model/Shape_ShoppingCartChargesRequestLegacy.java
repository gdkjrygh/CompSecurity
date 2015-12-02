// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            ShoppingCartChargesRequestLegacy

public final class Shape_ShoppingCartChargesRequestLegacy extends ShoppingCartChargesRequestLegacy
{

    private List items;
    private String promo_code;
    private String vehicle_view_id;

    Shape_ShoppingCartChargesRequestLegacy()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ShoppingCartChargesRequestLegacy)obj;
            if (((ShoppingCartChargesRequestLegacy) (obj)).getItems() == null ? getItems() != null : !((ShoppingCartChargesRequestLegacy) (obj)).getItems().equals(getItems()))
            {
                return false;
            }
            if (((ShoppingCartChargesRequestLegacy) (obj)).getVehicleViewId() == null ? getVehicleViewId() != null : !((ShoppingCartChargesRequestLegacy) (obj)).getVehicleViewId().equals(getVehicleViewId()))
            {
                return false;
            }
            if (((ShoppingCartChargesRequestLegacy) (obj)).getPromoCode() == null ? getPromoCode() != null : !((ShoppingCartChargesRequestLegacy) (obj)).getPromoCode().equals(getPromoCode()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getItems()
    {
        return items;
    }

    public final String getPromoCode()
    {
        return promo_code;
    }

    public final String getVehicleViewId()
    {
        return vehicle_view_id;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (items == null)
        {
            i = 0;
        } else
        {
            i = items.hashCode();
        }
        if (vehicle_view_id == null)
        {
            j = 0;
        } else
        {
            j = vehicle_view_id.hashCode();
        }
        if (promo_code != null)
        {
            k = promo_code.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final ShoppingCartChargesRequestLegacy setItems(List list)
    {
        items = list;
        return this;
    }

    final ShoppingCartChargesRequestLegacy setPromoCode(String s)
    {
        promo_code = s;
        return this;
    }

    final ShoppingCartChargesRequestLegacy setVehicleViewId(String s)
    {
        vehicle_view_id = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ShoppingCartChargesRequestLegacy{items=")).append(items).append(", vehicle_view_id=").append(vehicle_view_id).append(", promo_code=").append(promo_code).append("}").toString();
    }
}
