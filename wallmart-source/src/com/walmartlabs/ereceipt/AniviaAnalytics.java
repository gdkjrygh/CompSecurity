// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;


public interface AniviaAnalytics
{
    public static interface Attribute
    {

        public static final String ERECEIPT_LIST_STATUS = "erecListViewStatus";
        public static final String NAME = "name";
        public static final String NUMBER = "number";
        public static final String NUMBER_OF_ITEMS = "numberItems";
        public static final String RECEIPT_UUID = "receiptUuid";
        public static final String SECTION = "section";
        public static final String STORE_ID = "storeId";
        public static final String SUBCATEGORY = "subCategory";
        public static final String TOTAL = "total";
    }

    public static interface Event
    {

        public static final String ERECEIPT_DELETED = "ereceiptDeleted";
        public static final String ERECEIPT_QR_CODE_SCAN = "ereceiptQRScan";
        public static final String PAGE_VIEW = "pageView";
        public static final String SAVER_RETURN_ITEM = "returnItem";
        public static final String SAVER_TC_NUMBER = "tcNumber";
    }

    public static interface Page
    {

        public static final String CREATE_ACCOUNT = "Create Account";
        public static final String ENTER_CODE = "Enter Code";
        public static final String ENTER_PHONE_NUMBER = "Enter Phone Number";
        public static final String LIST_VIEW = "eReceipts List View";
        public static final String RECEIPT_RETURN_PAGE = "TC Number";
        public static final String SIGN_IN = "SignIn";
    }

    public static interface Section
    {

        public static final String RECEIPT = "Saver - Receipt";
        public static final String SAVER = "Saver";
    }

    public static interface SubCategory
    {

        public static final String RECEIPT = "Receipt";
        public static final String SAVINGS_CATCHER = "Savings Catcher";
    }

    public static interface Value
    {

        public static final String ERECEIPTS_SECTION = "eReceipts";
        public static final String LIST_VIEW_EMPTY = " No Receipts";
        public static final String LIST_VIEW_NOT_EMPTY = " Receipts";
        public static final String LIST_VIEW_NOT_SIGNED_IN = "Not SignedIn";
        public static final String LIST_VIEW_SIGNED_IN = "SignedIn";
    }

}
