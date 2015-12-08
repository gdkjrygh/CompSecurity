// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;


// Referenced classes of package com.walmart.android.analytics:
//            GoogleAnalytics

public static interface 
{

    public static final String ACTION_ACCOUNT_CREATE_ACCOUNT_COMPLETE = "Create Account Complete";
    public static final String ACTION_ACCOUNT_CREATE_ACCOUNT_START = "Create Account Start";
    public static final String ACTION_ACCOUNT_CUSTOMER_LOGIN = "Customer Login";
    public static final String ACTION_ACCOUNT_FORGOT_PASSWORD = "Forgot Password";
    public static final String ACTION_CART_ADD = "Add to Cart %s";
    public static final String ACTION_CART_ADD_ERROR = "Add to Cart error %d";
    public static final String ACTION_CART_ADD_SUFFIX_CONFIGURABLE_BUNDLE = "configurable_bundle";
    public static final String ACTION_CART_ADD_SUFFIX_EGIFTCARD = "egiftcard";
    public static final String ACTION_CART_ADD_SUFFIX_GIFTCARD = "giftcard";
    public static final String ACTION_CART_ADD_SUFFIX_PREORDER = "preorder";
    public static final String ACTION_CART_ADD_SUFFIX_REGULAR = "regular";
    public static final String ACTION_CART_ADD_SUFFIX_VARIANT = "variant";
    public static final String ACTION_CART_CHECKOUT = "Checkout";
    public static final String ACTION_CART_CHECKOUT_ERROR = "Checkout error";
    public static final String ACTION_CART_DELETE = "Delete from Cart";
    public static final String ACTION_CART_GUEST_CHECKOUT = "Guest Checkout";
    public static final String ACTION_CART_MOVE_TO_CART = "Move To Cart";
    public static final String ACTION_CART_MOVE_TO_SFL = "Move To SFL";
    public static final String ACTION_CART_PAGE_SOURCE = "Page Source";
    public static final String ACTION_CART_SIGN_IN_PROMPT = "Sign in prompt";
    public static final String ACTION_CART_SIGN_IN_TAP = "Sign in tap";
    public static final String ACTION_CART_UPDATE_QTY = "Update Quantity";
    public static final String ACTION_GLOBAL_NAV_CHANGE_STORE = "Change Store";
    public static final String ACTION_GLOBAL_NAV_ERECEIPTS = "eReceipts";
    public static final String ACTION_GLOBAL_NAV_FEEDBACK = "Feedback";
    public static final String ACTION_GLOBAL_NAV_FULLSITE = "Walmart.com";
    public static final String ACTION_GLOBAL_NAV_NOTIFICATIONS = "Notifications";
    public static final String ACTION_GLOBAL_NAV_PHARMACY = "Pharmacy";
    public static final String ACTION_GLOBAL_NAV_PHOTO = "Photo";
    public static final String ACTION_GLOBAL_NAV_PRIVACY = "Privacy";
    public static final String ACTION_GLOBAL_NAV_TOU = "TOU";
    public static final String ACTION_HOME_BANNER = "Banner";
    public static final String ACTION_HOME_FIND_STORE = "Find Store";
    public static final String ACTION_HOME_LOCAL_AD = "Local Ad";
    public static final String ACTION_HOME_PHARMACY = "Pharmacy";
    public static final String ACTION_HOME_ROLLBACKS = "Rollbacks";
    public static final String ACTION_HOME_SHOP_BY_DEPARTMENT = "Shop by Dept";
    public static final String ACTION_ITEM_BUTTONS_BUY_FULLSITE = "Buy Fullsite";
    public static final String ACTION_ITEM_BUTTONS_CUSTOMIZE_BUNDLE = "Customize Bundle";
    public static final String ACTION_ITEM_DETAILS_MORE_ITEM_DESCRIPTION = "More Item Description";
    public static final String ACTION_ITEM_DETAILS_MORE_STORE_AVAILABILITY = "More Store Availability";
    public static final String ACTION_ITEM_DETAILS_REVIEWS = "Reviews";
    public static final String ACTION_ITEM_DETAILS_STORE_AVAILABILITY = "Store Availability";
    public static final String ACTION_ITEM_DETAILS_VIEW = "View";
    public static final String ACTION_LOCAL_AD_CHANGE_STORE_CLICK = "Change Store Click";
    public static final String ACTION_LOCAL_AD_FULL_SCREEN_CLICK = "Full Screen Click";
    public static final String ACTION_LOCAL_AD_ITEM_CLICK = "Item Click";
    public static final String ACTION_LOCAL_AD_VIEW_BY_DEPARTMENT = "View by Department";
    public static final String ACTION_NOTIFICATIONS_ERECEIPTS_DISABLED = "EReceipts Disabled";
    public static final String ACTION_NOTIFICATIONS_ERECEIPTS_ENABLED = "EReceipts Enabled";
    public static final String ACTION_NOTIFICATIONS_PROMOTION_DISABLED = "Promotions Disabled";
    public static final String ACTION_NOTIFICATIONS_PROMOTION_ENABLED = "Promotions Enabled";
    public static final String ACTION_NOTIFICATIONS_STORE_FEATURES_DISABLED = "Store Features Disabled";
    public static final String ACTION_NOTIFICATIONS_STORE_FEATURES_ENABLED = "Store Features Enabled";
    public static final String ACTION_RECOMMENDATIONS_ITEM_PAGE_ADD_TO_CART = "Item Page Add to Cart";
    public static final String ACTION_RECOMMENDATIONS_ITEM_PAGE_TAP = "Item Page Tap";
    public static final String ACTION_SCAN_FIND_OTHER_LOCATION = "Find in another location";
    public static final String ACTION_SCAN_PERFORMED = "Scan Performed";
    public static final String ACTION_SCAN_QR = "QR";
    public static final String ACTION_SCAN_QR_BROWSER_OPEN = "QR scan browser open";
    public static final String ACTION_SCAN_SCREEN = "Scan Screen";
    public static final String ACTION_SCAN_TO_ITEM = "Scan to Item";
    public static final String ACTION_SCAN_TO_SHELF = "Scan to Shelf";
    public static final String ACTION_SEARCH_BARCODE = "Barcode";
    public static final String ACTION_SEARCH_CLEAR = "Clear Search History";
    public static final String ACTION_SEARCH_EXACT = "Exact";
    public static final String ACTION_SEARCH_GOOGLE = "Google";
    public static final String ACTION_SEARCH_HISTORY = "History";
    public static final String ACTION_SEARCH_TYPE_AHEAD = "Type Ahead";
    public static final String ACTION_SEARCH_VOICE = "Voice";
    public static final String ACTION_SHELF_FILTER = "Filter";
    public static final String ACTION_SHELF_SORT = "Sort";
    public static final String ACTION_SHELF_VIEWS = "Views";
    public static final String ACTION_STORE_DETAILS_CALL = "Call %s";
    public static final String ACTION_STORE_DETAILS_CALL_STORE = "Call Store";
    public static final String ACTION_STORE_DETAILS_DIRECTIONS = "Directions";
    public static final String ACTION_STORE_DETAILS_LOCAL_AD = "Local Ad";
    public static final String ACTION_STORE_DETAILS_MAKE_MY_STORE = "Make My Store";
    public static final String ACTION_STORE_DETAILS_MAP = "Map";
    public static final String ACTION_STORE_DETAILS_VIEWS = "Views";
    public static final String ACTION_STORE_SEARCH_FILTER = "Filter";
    public static final String ACTION_WIDGET_HOME_CLICK = "Home Click";
    public static final String ACTION_WIDGET_SEARCH_CLICK = "Search Click";
    public static final String ACTION_WIDGET_STORE_FINDER_CLICK = "Store Finder Click";
}
