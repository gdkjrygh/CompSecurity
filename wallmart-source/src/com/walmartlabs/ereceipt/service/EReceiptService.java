// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import com.walmart.android.service.AsyncCallback;
import java.io.OutputStream;
import java.util.List;

public interface EReceiptService
{

    public static final String CUSTOMER = "/customer/";
    public static final String CUSTOMER_CONFIG = "/config";
    public static final String CUSTOMER_ID_KEY = "customerID";
    public static final String CUSTOMER_RECEIPT_IDS_KEY = "customer-receipt-ids";
    public static final String DELETE_RECEIPTS = "/receipts/delete";
    public static final String ETOKEN = "etoken";
    public static final String EXCLUDE_IMAGES_KEY = "exclude_images";
    public static final String GET_RECEIPT = "/receipt/";
    public static final String GET_RECEIPT_IMAGE = "/receipt/image/";
    public static final String GET_RECEIPT_TC = "/transaction/%1$s/date/%2$s";
    public static final String LEGACY_PRODUCTION_URL = "https://receipts.walmart.com";
    public static final String LEGACY_TEST_URL = "http://receipts.walmartlabs.com";
    public static final String PHONE_ID_KEY = "phone-uuid";
    public static final String PHONE_NUMBER = "phone-number";
    public static final String PRODUCTION_URL = "https://store.mobile.walmart.com";
    public static final String RECEIPTS_KEY = "receipts";
    public static final String RECEIPTS_STG0_URL = "https://receipts-stg0.walmart.com";
    public static final String RECEIPT_UUIDS_KEY = "receipt-uuids";
    public static final String REGISTRATION_ID = "registration-id";
    public static final String SERVICE = "/api";
    public static final String STORE_STG1_MOBILE_URL = "https://store-stg1.mobile.walmart.com";
    public static final String SYNC_BATCH_LIMIT = "limit";
    public static final String SYNC_RECEIPTS = "/receipts/sync";
    public static final String VERIFY_CODE = "verify-code";
    public static final String WALLET_REGISTER = "/wallet/register";
    public static final String WALLET_REGISTER_STATUS = "/wallet/register/status";
    public static final String WALLET_REGISTER_VERIFY = "/wallet/register/verify";
    public static final String WALMART_SERVICE = "/api/business/wm";

    public abstract void deleteReceipts(String s, int ai[], String s1, AsyncCallback asynccallback);

    public abstract void getImage(String s, AsyncCallback asynccallback);

    public abstract void getReceipt(String s, String s1, String s2, AsyncCallback asynccallback);

    public abstract void getReceiptByTc(String s, String s1, String s2, String s3, AsyncCallback asynccallback);

    public abstract void getReceiptImage(String s, AsyncCallback asynccallback);

    public abstract String getReceiptImageUrl(String s);

    public abstract void syncReceipts(String s, List list, String s1, boolean flag, int i, AsyncCallback asynccallback);

    public abstract void updatePhoneConfiguration(String s, String s1, String s2, String s3, AsyncCallback asynccallback);

    public abstract void walletRegister(String s, String s1, String s2, AsyncCallback asynccallback);

    public abstract void walletRegisterVerify(String s, String s1, String s2, String s3, AsyncCallback asynccallback);

    public abstract void walletRegisteredStatus(String s, String s1, AsyncCallback asynccallback);

    public abstract void writeImageStream(String s, OutputStream outputstream, AsyncCallback asynccallback);
}
