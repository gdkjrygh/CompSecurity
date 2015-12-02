// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            ShoppingCartLineItem

public final class Shape_ShoppingCartLineItem extends ShoppingCartLineItem
{

    private String amount;
    private String id;
    private String item_id;
    private String tax;

    Shape_ShoppingCartLineItem()
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
            obj = (ShoppingCartLineItem)obj;
            if (((ShoppingCartLineItem) (obj)).getAmount() == null ? getAmount() != null : !((ShoppingCartLineItem) (obj)).getAmount().equals(getAmount()))
            {
                return false;
            }
            if (((ShoppingCartLineItem) (obj)).getId() == null ? getId() != null : !((ShoppingCartLineItem) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((ShoppingCartLineItem) (obj)).getItemId() == null ? getItemId() != null : !((ShoppingCartLineItem) (obj)).getItemId().equals(getItemId()))
            {
                return false;
            }
            if (((ShoppingCartLineItem) (obj)).getTax() == null ? getTax() != null : !((ShoppingCartLineItem) (obj)).getTax().equals(getTax()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAmount()
    {
        return amount;
    }

    public final String getId()
    {
        return id;
    }

    public final String getItemId()
    {
        return item_id;
    }

    public final String getTax()
    {
        return tax;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (amount == null)
        {
            i = 0;
        } else
        {
            i = amount.hashCode();
        }
        if (id == null)
        {
            j = 0;
        } else
        {
            j = id.hashCode();
        }
        if (item_id == null)
        {
            k = 0;
        } else
        {
            k = item_id.hashCode();
        }
        if (tax != null)
        {
            l = tax.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    final ShoppingCartLineItem setAmount(String s)
    {
        amount = s;
        return this;
    }

    final ShoppingCartLineItem setId(String s)
    {
        id = s;
        return this;
    }

    final ShoppingCartLineItem setItemId(String s)
    {
        item_id = s;
        return this;
    }

    final ShoppingCartLineItem setTax(String s)
    {
        tax = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ShoppingCartLineItem{amount=")).append(amount).append(", id=").append(id).append(", item_id=").append(item_id).append(", tax=").append(tax).append("}").toString();
    }
}
