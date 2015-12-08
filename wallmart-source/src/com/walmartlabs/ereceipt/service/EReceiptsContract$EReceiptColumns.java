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
