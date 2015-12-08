// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.provider.BaseColumns;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverContract

public static interface A
    extends BaseColumns
{

    public static final String ASSOCIATE_DISCOUNT = "associateDiscount";
    public static final String CREDITED = "credited";
    public static final String DETAILS_ID = "receiptId";
    public static final String MEASUREMENT = "measurement";
    public static final String NORMALIZED_UPC = "normalizedUpc";
    public static final String PRE_DISCOUNT_RETAIL_PRICE = "preDiscountRetailPrice";
    public static final String PRE_DISCOUNT_UNIT_PRICE = "preDiscountUnitPrice";
    public static final String REMAINING_QUANTITY = "remainingQty";
    public static final String RETAIL_PRICE = "retailPrice";
    public static final String RETURN_QUANTITY = "returnQty";
    public static final String UNIT_PRICE = "unitPrice";
    public static final String UNIT_QUANTITY = "unitQuantity";
    public static final String UPC = "upc";
}
