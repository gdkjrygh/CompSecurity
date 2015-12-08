// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;

import com.walmart.android.service.AsyncCallback;
import com.walmartlabs.android.pharmacy.data.CartCheckoutData;
import com.walmartlabs.android.pharmacy.data.LinkAccountData;
import com.walmartlabs.android.pharmacy.data.TransferRxData;
import com.walmartlabs.android.pharmacy.data.ValidateAccountData;

public interface PharmacyService
{

    public static final String ACCOUNT_METHOD_LINK = "link";
    public static final String ACCOUNT_METHOD_PROFILE = "profile";
    public static final String ACCOUNT_METHOD_RX_ENABLED = "rx-enabled";
    public static final String ACCOUNT_METHOD_VALIDATE = "validate";
    public static final String ACCOUNT_SERVICE = "pharmacy/account";
    public static final String CART_METHOD_CHECKOUT = "checkout";
    public static final String CART_METHOD_DELIVERY_METHOD = "delivery-method";
    public static final String CART_METHOD_PICKUP_DETAILS = "pickup-details";
    public static final String CART_METHOD_REFILL = "refill";
    public static final String CART_METHOD_SHIP_DETAILS = "ship-details";
    public static final String CART_REFILL_SERVICE = "pharmacy/cart/refill/";
    public static final String CART_SERVICE = "pharmacy/cart";
    public static final String CART_VALIDATE_METHOD = "validate";
    public static final String KILLSWITCH_METHOD = "kill-switch";
    public static final String KILLSWITCH_SERVICE = "pharmacy/";
    public static final String PHARMACY_METHOD_CART = "cart";
    public static final String PHARMACY_SERVICE = "pharmacy/";
    public static final String PRESCRIPTIONS_FILTER_ACTIVE = "active";
    public static final String PRESCRIPTIONS_FILTER_ALL = "all";
    public static final String PRESCRIPTIONS_FILTER_EXPIRED = "expired";
    public static final String PRESCRIPTIONS_FILTER_PARAM = "filter";
    public static final String PRESCRIPTIONS_METHOD = "prescriptions";
    public static final String PRESCRIPTIONS_SERVICE = "pharmacy/";
    public static final String PRESCRIPTIONS_SORT_AUTO_REFILL = "rxAutoRefillOn";
    public static final String PRESCRIPTIONS_SORT_DRUG = "drug";
    public static final String PRESCRIPTIONS_SORT_LAST_REFILL_DATE = "lastRefillDate";
    public static final String PRESCRIPTIONS_SORT_PARAM = "sort";
    public static final String PRESCRIPTIONS_SORT_PRESCRIBER = "prescriber";
    public static final String PRESCRIPTIONS_SORT_REMAINING_REFILLS = "noOfRemRefills";
    public static final String REFILL_DETAILS_METHOD = "refill";
    public static final String REFILL_DETAILS_REFILL_ID_PARAM = "refill-id";
    public static final String REFILL_DETAILS_SERVICE = "pharmacy/refill-history/";
    public static final String REFILL_HISTORY_FILTER_12_MONTHS = "last12Months";
    public static final String REFILL_HISTORY_FILTER_24_MONTHS = "last24Months";
    public static final String REFILL_HISTORY_FILTER_6_MONTHS = "last6Months";
    public static final String REFILL_HISTORY_FILTER_90_DAYS = "last90Days";
    public static final String REFILL_HISTORY_FILTER_PARAM = "filter";
    public static final String REFILL_HISTORY_METHOD = "refill-history";
    public static final String REFILL_HISTORY_SERVICE = "pharmacy/";
    public static final String REFILL_HISTORY_SORT_DRUG = "drug";
    public static final String REFILL_HISTORY_SORT_FILL_DATE = "fillDate";
    public static final String REFILL_HISTORY_SORT_FILL_STATUS = "fillStatus";
    public static final String REFILL_HISTORY_SORT_PARAM = "sort";
    public static final String REFILL_HISTORY_SORT_PRICE = "customerPriceForRx";
    public static final String SESSION_METHOD_LOGOUT = "logout";
    public static final String SESSION_SERVICE = "pharmacy/session";
    public static final String STORE_NUMBER_PARAM = "store-number";
    public static final String STORE_PICKUP_TIME_METHOD = "pick-up-date-time";
    public static final String STORE_SERVICE = "pharmacy/store/";
    public static final String TRANSFER_RX_METHOD_EXT_TRANSFER = "external-transfer";
    public static final String TRANSFER_RX_SERVICE = "pharmacy/prescriptions";

    public abstract void addRefillToCart(int i, int j, AsyncCallback asynccallback);

    public abstract void deleteCart(AsyncCallback asynccallback);

    public abstract void deleteRefillFromCart(int i, int j, AsyncCallback asynccallback);

    public abstract void getAccountProfile(AsyncCallback asynccallback);

    public abstract void getCart(AsyncCallback asynccallback);

    public abstract void getKillSwitchStatus(AsyncCallback asynccallback);

    public abstract void getPickupTimes(int i, AsyncCallback asynccallback);

    public abstract void getPrescriptions(String s, String s1, AsyncCallback asynccallback);

    public abstract void getRefillDetails(int i, int j, AsyncCallback asynccallback);

    public abstract void getRefillHistory(String s, String s1, AsyncCallback asynccallback);

    public abstract void hasRxEnabledAccount(AsyncCallback asynccallback);

    public abstract void linkAccount(LinkAccountData linkaccountdata, AsyncCallback asynccallback);

    public abstract void logout(AsyncCallback asynccallback);

    public abstract void setGuestPickupDetails(int i, int j, String s, String s1, AsyncCallback asynccallback);

    public abstract void setPickupDetails(int i, String s, String s1, AsyncCallback asynccallback);

    public abstract void submitCart(CartCheckoutData cartcheckoutdata, AsyncCallback asynccallback);

    public abstract void transferRxExternal(TransferRxData transferrxdata, AsyncCallback asynccallback);

    public abstract void updateAccountProfile(com.walmartlabs.android.pharmacy.data.ProfileData.Communication communication, AsyncCallback asynccallback);

    public abstract void validateAccount(ValidateAccountData validateaccountdata, AsyncCallback asynccallback);

    public abstract void validateRefillInCart(int i, int j, String s, AsyncCallback asynccallback);
}
