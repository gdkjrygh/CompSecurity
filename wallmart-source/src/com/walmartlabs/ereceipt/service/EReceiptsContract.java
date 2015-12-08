// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.provider.BaseColumns;

public interface EReceiptsContract
{
    public static interface EReceiptColumns
        extends BaseColumns
    {

        public static final String ADDRESS = "address";
        public static final String ADDRESS_LINE_1 = "addressLine1";
        public static final String ADDRESS_LINE_2 = "addressLine2";
        public static final String CHANGE_DUE = "changeDue";
        public static final String CITY = "city";
        public static final String CUSTOMER_ID = "customerId";
        public static final String CUSTOMER_RECEIPT_ID = "customerReceiptId";
        public static final String DISCOUNT_GIVEN = "discountGiven";
        public static final String HAS_IMAGE = "hasImage";
        public static final String IMAGE = "image";
        public static final String ITEMS_SOLD = "itemsSold";
        public static final String LOCAL_DATETIME = "localDateTime";
        public static final String MARK_DELETED = "deleted";
        public static final String PHONE = "phone";
        public static final String STORE_ID = "storeId";
        public static final String SUB_TOTAL = "subtotal";
        public static final String TC_NBR = "tcNumber";
        public static final String TIMESTAMP = "timestamp";
        public static final String TOTAL = "total";
        public static final String UUID = "uuid";
        public static final String WAITING_MORE_INFO = "waitingOnMoreInfo";
    }

    public static interface ItemColumns
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

    public static interface TaxColumns
        extends BaseColumns
    {

        public static final String AMOUNT = "amount";
        public static final String ERECEIPT_ID = "ereceiptId";
        public static final String LEVEL = "level";
        public static final String RATE_STR = "rateStr";
    }

    public static interface TenderColumns
        extends BaseColumns
    {

        public static final String AMOUNT = "amount";
        public static final String ERECEIPT_ID = "ereceiptId";
        public static final String NAME = "name";
    }


    public static final int FALSE = 0;
    public static final int TRUE = 1;
    public static final String UNIT_TYPE_LB = "lb";
}
