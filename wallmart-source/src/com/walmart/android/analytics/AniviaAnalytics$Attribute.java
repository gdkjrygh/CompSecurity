// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;


// Referenced classes of package com.walmart.android.analytics:
//            AniviaAnalytics

public static interface 
{

    public static final String ACTION = "action";
    public static final String ACTION_TAPPED = "actionTapped";
    public static final String ADVERTISER_ID_ENABLED = "aie";
    public static final String ADVERTISING_ID = "advertisingId";
    public static final String AISLE_MAPPED = "aisleMapped";
    public static final String AISLE_NOT_MAPPED = "aisleNotMapped";
    public static final String AMOUNT = "amount";
    public static final String APP_LOCATION = "loc";
    public static final String APP_VERSION = "appVersion";
    public static final String ATHENA_BEACON = "athenaBeacon";
    public static final String BANNER = "banner";
    public static final String BANNER_LOCATION = "bannerLocation";
    public static final String BROWSE_TOKEN = "browseToken";
    public static final String CART_ITEM_QUANT = "cartItemQuant";
    public static final String COMPETITOR_NAME = "compName";
    public static final String CUSTOMER_ID = "customerId";
    public static final String DATE = "date";
    public static final String DEVICE = "device";
    public static final String DEVICE_TYPE = "type";
    public static final String END_DATE = "endDate";
    public static final String ENTRY_METHOD = "entryMethod";
    public static final String ERROR = "error";
    public static final String ERROR_MESSAGE = "errorMessage";
    public static final String GEOFENCE = "geofence";
    public static final String HAS_ANDROID_WEAR = "hasWatch";
    public static final String INSTALLED_APP_VERSION = "appVer";
    public static final String INSTALL_DATE = "instDate";
    public static final String IS_SHIPPING_PASS_MEMBER = "shippingPass";
    public static final String IS_SIGNED_IN = "isSignedIn";
    public static final String ITEMS_IN_CART_COUNT = "itemsInCart";
    public static final String ITEM_COUNT = "itemCount";
    public static final String ITEM_ID = "itemId";
    public static final String ITEM_NAME = "itemName";
    public static final String ITEM_PRICE = "itemPrice";
    public static final String ITEM_UPC = "itemUPC";
    public static final String LANG = "lang";
    public static final String LATEST_APP_VERSION = "appVerAvail";
    public static final String LIST_PRIVACY_SETTING = "privacySetting";
    public static final String LOCATION_ACCURACY = "locationAccuracy";
    public static final String LOCATION_ENABLED = "locationEnabled";
    public static final String LOGGED_IN = "loggedIn";
    public static final String LOGGED_IN_STATUS = "loggedInStatus";
    public static final String NEARBY_AVAILABILITY = "nearbyAvailability";
    public static final String NEW_STATUS = "newStatus";
    public static final String NOTIFICATION = "notification";
    public static final String NOTIFICATION_ID = "notificationId";
    public static final String NUMBER_AISLES_MAPPED = "numberOfAislesMapped";
    public static final String NUMBER_ITEMS_MAPPED = "numberOfItemsMapped";
    public static final String N_COLD_LAUNCHES = "counter";
    public static final String ONLINE_AVAILABILITY = "onlineAvailability";
    public static final String ORDER_ID = "orderId";
    public static final String OS = "osVer";
    public static final String PAGE_NAME = "name";
    public static final String PRODUCT_ID = "productId";
    public static final String PRODUCT_NAME = "productName";
    public static final String PROD_TYPE = "prodType";
    public static final String PUSH_DESTINATION = "pushDestination";
    public static final String PUSH_ENABLED = "pushEnabled";
    public static final String QUANTITY_CHANGE_DIRECTION = "quantityChange";
    public static final String RECEIPT_COUNT = "receiptCount";
    public static final String RECOMMENDATION_ITEM_ID = "recItemId";
    public static final String RECOMMENDATION_MODULE = "recModule";
    public static final String REFERRAL_DESTINATION_FULL = "refDestinationFull";
    public static final String REFERRAL_SOURCE_FULL = "refSourceFull";
    public static final String RESULT = "result";
    public static final String RESULT_NUMBER = "resultNumber";
    public static final String SAVED_FOR_LATER_ITEMS = "saveForLaterItems";
    public static final String SAVER_ACTIVE_SINCE = "activeSince";
    public static final String SAVER_AVAILABLE = "available";
    public static final String SAVER_CREDIT_AMOUNT = "creditAmount";
    public static final String SAVER_REDEEMED = "redeemed";
    public static final String SAVER_RESULT_MSG = "saverResultMsg";
    public static final String SAVER_TC_NUMBER = "tcNumber";
    public static final String SAVER_TOTAL_REWARDS = "totalRewards";
    public static final String SCAN_CODE = "scanCode";
    public static final String SCAN_RESULT = "scanResult";
    public static final String SCAN_SOURCE = "scanSource";
    public static final String SCAN_TIME = "time";
    public static final String SCAN_TYPE = "scanType";
    public static final String SEARCH_TERM = "searchTerm";
    public static final String SECTION = "section";
    public static final String SECTION_ID = "sectionId";
    public static final String SFL_CART_QUANT = "saveForLaterCartQuant";
    public static final String SHARE_TYPE = "shareType";
    public static final String START_DATE = "startDate";
    public static final String STORE_AVAILABILITY = "storeAvailability";
    public static final String STORE_ID = "storeId";
    public static final String STORE_ID_DISTANCE = "storeIdDistance";
    public static final String STORE_ID_STATUS = "storeIdStatus";
    public static final String STORE_SET = "storeSet";
    public static final String SUBCATEGORY = "subCategory";
    public static final String TAP_LOCATION = "tapLocation";
    public static final String TC = "TC";
    public static final String TC_NUMBER = "TC#";
    public static final String TEST_GROUP = "testGroup";
    public static final String TOTAL = "total";
    public static final String UNIT_COUNT = "unitCount";
    public static final String UPC = "upc";
    public static final String UPGRADE_OPTION_SELECTED = "optionselected";
    public static final String UPGRADE_TYPE = "upgradeType";
    public static final String URL = "url";
    public static final String USER_AGENT = "ua";
    public static final String USER_VOICE_DIALOG_ACTION = "modalAction";
    public static final String USER_VOICE_DIALOG_TYPE = "modalType";
    public static final String USER_VOICE_ENJOY_DIALOG_RESPONSE = "enjoyResponse";
    public static final String WEEKLY_AD_ID = "weeklyAdId";
    public static final String WIFI = "wifi";
}
