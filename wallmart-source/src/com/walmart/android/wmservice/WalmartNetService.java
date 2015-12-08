// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.net.Uri;
import com.walmart.android.service.AsyncCallback;
import java.util.List;
import org.apache.http.client.HttpClient;

public interface WalmartNetService
{

    public static final String BASE_URL_E_1 = "http://mobile-e1.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_10 = "http://mobile-e10.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_10_SECURE = "https://mobile-e10.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_11 = "http://mobile-e11.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_11_SECURE = "https://mobile-e11.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_12 = "http://mobile-e12.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_12_SECURE = "https://mobile-e12.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_1_SECURE = "https://mobile-e1.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_2 = "http://mobile-e2.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_2_SECURE = "https://mobile-e2.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_3 = "http://mobile-e3.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_3_SECURE = "https://mobile-e3.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_4 = "http://mobile-e4.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_4_SECURE = "https://mobile-e4.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_5 = "http://mobile-e5.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_5_SECURE = "https://mobile-e5.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_6 = "http://mobile-e6.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_6_SECURE = "https://mobile-e6.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_7 = "http://mobile-e7.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_7_SECURE = "https://mobile-e7.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_8 = "http://mobile-e8.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_8_SECURE = "https://mobile-e8.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_9 = "http://mobile-e9.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_E_9_SECURE = "https://mobile-e9.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_PRODUCTION = "http://mobile.walmart.com/m/j?e=1&";
    public static final String BASE_URL_PRODUCTION_SECURE = "https://mobile.walmart.com/m/j?e=1&";
    public static final String BASE_URL_STAGE = "http://mobile-stage.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String BASE_URL_STAGE_SECURE = "https://mobile-stage.walmart.com/m/j?username=mobile&password=1111&e=1&";
    public static final String DEPARTMENT_ENTIRESITE = "ENTIRESITE";
    public static final int ERROR_CODE_JSON_ERROR = 0x15f93;
    public static final int ERROR_CODE_MAINTENANCE = 4;
    public static final int ERROR_CODE_NETWORK_ERROR = 0x15f92;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0x15f91;
    public static final String FAST_PICKUP_CUSTOMER_MODE = "/user/status";
    public static final String FAST_PICKUP_HOST_1 = "https://checkin-stg2.mobile.walmart.com";
    public static final String FAST_PICKUP_HOST_PROD = "https://checkin.mobile.walmart.com";
    public static final String FAST_PICKUP_ORDER_MODE = "/orders";
    public static final Uri HAPI_BASE_URL_E_1 = Uri.parse("http://api-e1.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_10 = Uri.parse("http://api-e10.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_10_SECURE = Uri.parse("https://api-e10.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_11 = Uri.parse("http://api-e11.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_11_SECURE = Uri.parse("https://api-e11.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_12 = Uri.parse("http://api-e12.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_12_SECURE = Uri.parse("https://api-e12.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_1_SECURE = Uri.parse("https://api-e1.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_2 = Uri.parse("http://api-e2.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_2_SECURE = Uri.parse("https://api-e2.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_3 = Uri.parse("http://api-e3.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_3_SECURE = Uri.parse("https://api-e3.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_4 = Uri.parse("http://api-e4.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_4_SECURE = Uri.parse("https://api-e4.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_5 = Uri.parse("http://api-e5.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_5_SECURE = Uri.parse("https://api-e5.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_6 = Uri.parse("http://api-e6.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_6_SECURE = Uri.parse("https://api-e6.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_7 = Uri.parse("http://api-e7.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_7_SECURE = Uri.parse("https://api-e7.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_8 = Uri.parse("http://api-e8.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_8_SECURE = Uri.parse("https://api-e8.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_9 = Uri.parse("http://api-e9.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_E_9_SECURE = Uri.parse("https://api-e9.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_PRODUCTION = Uri.parse("http://api.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_PRODUCTION_SECURE = Uri.parse("https://api.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_STAGE = Uri.parse("http://api-staging.mobile.walmart.com");
    public static final Uri HAPI_BASE_URL_STAGE_SECURE = Uri.parse("https://api-stage.mobile.walmart.com");
    public static final String ITEM_SORT_BY_ALPHA_AZ = "ALPHA_AZ";
    public static final String ITEM_SORT_BY_ALPHA_ZA = "ALPHA_ZA";
    public static final String ITEM_SORT_BY_BESTSELLERS = "BESTSELLERS";
    public static final String ITEM_SORT_BY_NEW = "NEW";
    public static final String ITEM_SORT_BY_PRICE_HILO = "HILO";
    public static final String ITEM_SORT_BY_PRICE_LOHI = "LOHI";
    public static final String ITEM_SORT_BY_RELEVANCE = "RELEVANCE";
    public static final String ITEM_SORT_BY_TOPRATED = "TOPRATED";
    public static final String ITEM_SOURCE_ALL = "All";
    public static final String METHOD_AUTHENTICATION_GUEST_LOGIN = "&method=guestLogin";
    public static final String METHOD_CHECKOUT_APPLY_ASSOCIATE_DISCOUNT = "&method=applyAssociateDiscount";
    public static final String METHOD_CHECKOUT_IS_ASSOCIATE_LOGIN_REQUIRED = "&method=isAssociateLoginRequired";
    public static final String METHOD_CHECKOUT_SET_ASSOCIATE_DISCOUNT_DECLINED = "&method=setAssociateDeclined";
    public static final String METHOD_EXTENDED_ITEM_GET = "&method=get&version=4";
    public static final String METHOD_EXTENDED_ITEM_GET_BY_UPC = "&method=getByUpc&version=4";
    public static final String METHOD_ITEM_GET = "&method=get";
    public static final String METHOD_LOCAL_AD_GET_CATALOG = "&method=getCatalog";
    public static final String METHOD_MANUAL_SHELF_GET = "&method=getShelf";
    public static final String METHOD_MANUAL_SHELF_GET_EXTENDED = "&method=getExtendedShelf";
    public static final String METHOD_MANUAL_SHELVES_GET = "&method=getShelves";
    public static final String METHOD_OFFERING_INFO = "&method=getOfferingInfoForUpcs";
    public static final String METHOD_SIMILAR_ITEMS_GET = "&pt=item_page.content_similarItems";
    public static final String METHOD_SLAP_GET = "&method=get&version=3";
    public static final String METHOD_SLAP_GET_BY_IDS = "&method=getByItemsAndStores&version=3";
    public static final String METHOD_TERMS_OF_USE_GET = "&method=getTos";
    public static final String MOBILE_PAY_HOST_DEV = "pay-stg2.edge.walmart.com";
    public static final String MOBILE_PAY_HOST_PROD = "pay.edge.walmart.com";
    public static final String MOBILE_PAY_HOST_QA = "pay-stg1.edge.walmart.com";
    public static final String PATH_ANDROID = "android";
    public static final String PATH_CONFIG = "config";
    public static final String PATH_CREATE_ACCOUNT = "createAccount";
    public static final String PATH_GET_COOKIES = "getCookies";
    public static final String PATH_GET_TOKEN = "getToken";
    public static final String PATH_LOGOUT = "logout";
    public static final String PATH_MOBILE_AUTH = "mauth";
    public static final String PATH_V2 = "v2";
    public static final String PATH_VERIFY = "verify";
    public static final String PHOENIX_URL_E_1 = "https://mobile-e1.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_10 = "https://mobile-e10.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_11 = "https://mobile-e11.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_12 = "https://mobile-e12.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_2 = "https://mobile-e2.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_3 = "https://mobile-e3.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_4 = "https://mobile-e4.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_5 = "https://mobile-e5.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_6 = "https://mobile-e6.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_7 = "https://mobile-e7.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_8 = "https://mobile-e8.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_E_9 = "https://mobile-e9.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_PRODUCTION = "https://mobile.walmart.com/r/phoenix/android/index.html";
    public static final String PHOENIX_URL_STAGE = "https://mobile-stage.walmart.com/r/phoenix/android/index.html";
    public static final String SERVICE_AUTHENTICATION_NORMAL = "service=Authentication";
    public static final String SERVICE_CHECKOUT = "service=Checkout";
    public static final String SERVICE_EXTENDED_ITEM = "service=ExtendedItem";
    public static final String SERVICE_ITEM = "service=Item";
    public static final String SERVICE_LOCAL_AD = "service=LocalAd";
    public static final String SERVICE_MANUAL_SHELF = "service=ManualShelf";
    public static final String SERVICE_OFFERING = "service=Offering";
    public static final String SERVICE_SLAP = "service=Slap";
    public static final String SERVICE_TERMS_OF_USE = "service=Tos";
    public static final int VALUE_MERGE = 1;
    public static final int VALUE_NONE = 3;
    public static final int VALUE_SWEEP = 2;

    public abstract void addCookies(List list, boolean flag);

    public abstract void applyAssociateDiscount(String s, String s1, AsyncCallback asynccallback);

    public abstract void clearCache(AsyncCallback asynccallback);

    public abstract void createAccount(String s, String s1, String s2, String s3, boolean flag, int i, AsyncCallback asynccallback);

    public abstract void getAssociateLoginRequired(AsyncCallback asynccallback);

    public abstract void getConfig(String s, AsyncCallback asynccallback);

    public abstract List getCookies();

    public abstract void getCss(AsyncCallback asynccallback);

    public abstract void getFastPickupOrders(AsyncCallback asynccallback);

    public abstract void getFastPickupUserStatus(String s, AsyncCallback asynccallback);

    public abstract void getImage(String s, long l, AsyncCallback asynccallback);

    public abstract void getImage(String s, AsyncCallback asynccallback);

    public abstract HttpClient getImageClient();

    public abstract void getLocalAd(String s, AsyncCallback asynccallback);

    public abstract void getManualShelf(String s, int i, AsyncCallback asynccallback);

    public abstract void getManualShelfExtended(String s, int i, AsyncCallback asynccallback);

    public abstract void getManualShelves(String as[], AsyncCallback asynccallback);

    public abstract void getOfferingInfoForUpc(String s, String s1, AsyncCallback asynccallback);

    public abstract void getStoreAvailabilityByItemId(String s, String as[], AsyncCallback asynccallback);

    public abstract void getStoreAvailabilityByUpc(String s, String as[], AsyncCallback asynccallback);

    public abstract void getStoreAvailabilityForItemIdsAtStore(String as[], String s, AsyncCallback asynccallback);

    public abstract void getStoreItemDetails(String s, AsyncCallback asynccallback);

    public abstract void getStringFromURL(String s, AsyncCallback asynccallback);

    public abstract void getTermsOfUse(AsyncCallback asynccallback);

    public abstract void guestLogin(AsyncCallback asynccallback);

    public abstract void logOut(AsyncCallback asynccallback);

    public abstract void login(String s, String s1, int i, AsyncCallback asynccallback);

    public abstract void printCookies();

    public abstract void setAssoicateDiscountDeclined(AsyncCallback asynccallback);

    public abstract void setFastPickupUserStatus(String s, String s1, AsyncCallback asynccallback);

    public abstract void validateToken(String s, AsyncCallback asynccallback);

    public abstract void verifyLogin(AsyncCallback asynccallback);

}
