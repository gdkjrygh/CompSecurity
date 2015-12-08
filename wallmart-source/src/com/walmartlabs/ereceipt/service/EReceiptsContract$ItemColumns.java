// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.provider.BaseColumns;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptsContract

public static interface 
    extends BaseColumns
{

    public static final String COUPON = "coupon";
    public static final String ERECEIPT_ID = "ereceiptId";
    public static final String LINE_NUMBER = "lineNumber";
    public static final String NAME = "name";
    public static final String NAME_ON_RECEIPT = "nameOnReceipt";
    public static final String NORMALIZED_UPC = "normalizedUpc";
    public static final String ORIGINAL_ORDER = "originalOrder";
    public static final String PRICE = "price";
    public static final String PRODUCT_ID = "productId";
    public static final String PRODUCT_IMAGE_URL = "productImageUrl";
    public static final String QUANTITY = "quantity";
    public static final String RAW_TEXT = "rawText";
    public static final String STORE_ITEM_LOOKUP = "storeItemLookup";
    public static final String UNIT_PRICE = "unitPrice";
    public static final String UNIT_QUANTITY = "unitQuantity";
    public static final String UNIT_TYPE = "unitType";
    public static final String UPC = "upc";
    public static final String VERTICAL_PIXEL = "verticalPixel";
}
