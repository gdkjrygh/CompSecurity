// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            ShoppingRequestedItem

public final class Shape_ShoppingRequestedItem extends ShoppingRequestedItem
{

    private String itemId;
    private int quantity;

    Shape_ShoppingRequestedItem()
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
            obj = (ShoppingRequestedItem)obj;
            if (((ShoppingRequestedItem) (obj)).getItemId() == null ? getItemId() != null : !((ShoppingRequestedItem) (obj)).getItemId().equals(getItemId()))
            {
                return false;
            }
            if (((ShoppingRequestedItem) (obj)).getQuantity() != getQuantity())
            {
                return false;
            }
        }
        return true;
    }

    public final String getItemId()
    {
        return itemId;
    }

    public final int getQuantity()
    {
        return quantity;
    }

    public final int hashCode()
    {
        int i;
        if (itemId == null)
        {
            i = 0;
        } else
        {
            i = itemId.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ quantity;
    }

    final ShoppingRequestedItem setItemId(String s)
    {
        itemId = s;
        return this;
    }

    final ShoppingRequestedItem setQuantity(int i)
    {
        quantity = i;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ShoppingRequestedItem{itemId=")).append(itemId).append(", quantity=").append(quantity).append("}").toString();
    }
}
