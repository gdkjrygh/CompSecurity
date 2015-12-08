// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            FastPickupOrder

public static class mage
{

    public static final String ORDER_ITEM_STATUS_CANCELLED = "CANCELLED";
    public static final String ORDER_ITEM_STATUS_DELAYED = "DELAYED";
    public static final String ORDER_ITEM_STATUS_DELIVERED = "DELIVERED";
    public static final String ORDER_ITEM_STATUS_EDELIVERED = "EDELIVERED";
    public static final String ORDER_ITEM_STATUS_PICKEDUP = "PICKEDUP";
    public static final String ORDER_ITEM_STATUS_PROCESSING = "PROCESSING";
    public static final String ORDER_ITEM_STATUS_READY_FOR_PICKUP = "READY_FOR_PICKUP";
    public static final String ORDER_ITEM_STATUS_RESERVED = "RESERVED";
    public static final String ORDER_ITEM_STATUS_RETURNED = "RETURNED";
    public static final String ORDER_ITEM_STATUS_SHIPPED = "SHIPPED";
    public static final String ORDER_ITEM_STATUS_UNDEFINED = "UNDEFINED";
    public static final String ORDER_ITEM_STATUS_WARRANTY_AVAILABLE_TO_PRINT = "WARRANTY_AVAILABLE_TO_PRINT";
    public String currency;
    public mage displayImage;
    public String fulfillmentType;
    public String price;
    public String productId;
    public String productName;
    public int quantity;
    public String status;
    public String upc;
    public String wmItemNumber;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (mage)obj;
            if (quantity != ((quantity) (obj)).quantity)
            {
                return false;
            }
            if (currency == null ? ((currency) (obj)).currency != null : !currency.equals(((currency) (obj)).currency))
            {
                return false;
            }
            if (displayImage == null ? ((displayImage) (obj)).displayImage != null : !displayImage.equals(((displayImage) (obj)).displayImage))
            {
                return false;
            }
            if (fulfillmentType == null ? ((fulfillmentType) (obj)).fulfillmentType != null : !fulfillmentType.equals(((fulfillmentType) (obj)).fulfillmentType))
            {
                return false;
            }
            if (price == null ? ((price) (obj)).price != null : !price.equals(((price) (obj)).price))
            {
                return false;
            }
            if (productId == null ? ((productId) (obj)).productId != null : !productId.equals(((productId) (obj)).productId))
            {
                return false;
            }
            if (productName == null ? ((productName) (obj)).productName != null : !productName.equals(((productName) (obj)).productName))
            {
                return false;
            }
            if (status == null ? ((status) (obj)).status != null : !status.equals(((status) (obj)).status))
            {
                return false;
            }
            if (upc == null ? ((upc) (obj)).upc != null : !upc.equals(((upc) (obj)).upc))
            {
                return false;
            }
            if (wmItemNumber == null ? ((wmItemNumber) (obj)).wmItemNumber != null : !wmItemNumber.equals(((wmItemNumber) (obj)).wmItemNumber))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int j2;
        if (fulfillmentType != null)
        {
            i = fulfillmentType.hashCode();
        } else
        {
            i = 0;
        }
        if (status != null)
        {
            j = status.hashCode();
        } else
        {
            j = 0;
        }
        if (productName != null)
        {
            k = productName.hashCode();
        } else
        {
            k = 0;
        }
        if (upc != null)
        {
            l = upc.hashCode();
        } else
        {
            l = 0;
        }
        if (productId != null)
        {
            i1 = productId.hashCode();
        } else
        {
            i1 = 0;
        }
        if (wmItemNumber != null)
        {
            j1 = wmItemNumber.hashCode();
        } else
        {
            j1 = 0;
        }
        j2 = quantity;
        if (price != null)
        {
            k1 = price.hashCode();
        } else
        {
            k1 = 0;
        }
        if (currency != null)
        {
            l1 = currency.hashCode();
        } else
        {
            l1 = 0;
        }
        if (displayImage != null)
        {
            i2 = displayImage.hashCode();
        }
        return ((((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + j2) * 31 + k1) * 31 + l1) * 31 + i2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{fulfillmentType: ").append(fulfillmentType).append(", status: ").append(status).append(" ,productName: ").append(productName).append(" ,upc: ").append(upc).append(" ,productId: ").append(productId).append(", wmItemNumber: ").append(wmItemNumber).append(", quantity: ").append(quantity).append(", price: ").append(price).append(", currency: ").append(currency).append(", displayImage: ").append(displayImage).append("}").toString();
    }

    public mage()
    {
    }
}
