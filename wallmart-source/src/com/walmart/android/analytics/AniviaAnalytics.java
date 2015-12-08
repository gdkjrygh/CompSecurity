// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;

import java.text.SimpleDateFormat;
import java.util.Locale;

public interface AniviaAnalytics
{
    public static interface Attribute
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

    public static interface Constant
    {

        public static final int ERROR_MSG_MAX_SIZE = 60;
        public static final int NOTIFICATION_ID_MAX_SIZE = 60;
    }

    public static interface ErrorMessage
    {

        public static final String SAVER_RECEIPT_ERROR_GENERAL_ERROR = "General Server Error";
        public static final String SAVER_RECEIPT_ERROR_MANUAL_NOT_FOUND = "Error Handling - Text Entry Not Recognized";
        public static final String SAVER_RECEIPT_ERROR_RECEIPT_NOT_ELIGIBLE = "Error Handling - Not Eligible";
        public static final String SAVER_RECEIPT_ERROR_SCAN_NOT_FOUND = "Error Handling - Scan Entry Not Recognized";
        public static final String SAVER_RECEIPT_REJECT_SIGN_IN = "Error Handling - Deny to Sign In";
        public static final String SAVER_REGISTER_PHONE_EXHAUSTED_PAGE = "For your security, you must wait 30 minutes before trying to register again";
        public static final String SAVER_REGISTER_PHONE_NOT_VALID = "Oops! The code you entered is not valid. Please check the text message we sent you and enter the code again now";
    }

    public static interface Event
    {

        public static final String ADD_FROM_HEADER = "mobilePayHeader";
        public static final String ADD_TO_CART = "addToCart";
        public static final String ADD_TO_LIST_TAP = "AddToListTap";
        public static final String APP_VERSION_DIFF = "appVersionDiff";
        public static final String BARCODE_QR_SCAN = "barcodeQRScan";
        public static final String CREATE_NEW_LIST_TAP = "createNewListTap";
        public static final String EDIT_LIST_TAP = "editListTap";
        public static final String ERECEIPT_SECTION = "eReceiptsection";
        public static final String ERRORS = "errors";
        public static final String EXISTING_LIST_TAP = "existingListTap";
        public static final String FAST_PICKUP_NOTIFICATION_SENT = "notificationSent";
        public static final String FAST_PICKUP_PREPARE_ORDER = "expressPrepareOrder";
        public static final String FAST_PICKUP_SELECT_STORE = "expressStoreSelect";
        public static final String FIND_LIST_FINAL_TAP = "findListFinalTap";
        public static final String FIND_LIST_TAP = "findListTap";
        public static final String FOREGROUND = "foreground";
        public static final String IN_STORE_ID = "instoreId";
        public static final String LAUNCH = "launch";
        public static final String LIST_CART_TAP = "listCartTap";
        public static final String LIST_DELETE = "listDelete";
        public static final String LIST_MARK_PURCHASED = "listMarkPurchased";
        public static final String LIST_REMOVE_ITEM_TAP = "listRemoveItemTap";
        public static final String LIST_SAVE = "listSave";
        public static final String LIST_SCAN_BROWSE = "listScanBrowse";
        public static final String LIST_SEARCH_AGAIN_TAP = "listSearchAgainTap";
        public static final String LIST_SHARE_TAP = "listShareTap";
        public static final String LIST_WANTS_TAP = "listWantsTap";
        public static final String LIST_WANTS_UPDATE_TAP = "listWantsUpdate";
        public static final String MAKE_MY_STORE = "makeMyStore";
        public static final String MAP_INTERACTION = "mapInteraction";
        public static final String NAVIGATION_ACTION = "navigationAction";
        public static final String NOTIFICATION_SETTING_CHANGED = "notificationChanged";
        public static final String PAGE_VIEW = "pageView";
        public static final String PRODUCT_IMAGE_CLICKED = "enlargePic";
        public static final String PUSH_NOTIFICATION_ID = "pushNotificationId";
        public static final String RECOMMENDATIONS_PRODUCT_VIEW = "recProdView";
        public static final String REFERRAL_SOURCE = "referralSource";
        public static final String SAVER_ACCOUNT_SIGNIN = "saverAccountSignin";
        public static final String SAVER_ATTEMPT_BLUEBIRD_TRANSFER = "attemptBBtransfer";
        public static final String SAVER_ATTEMPT_CREATE_BB_ACCOUNT = "attemptBbcard";
        public static final String SAVER_ATTEMPT_SIGNIN_BB_ACCOUNT = "bluebirdSignin";
        public static final String SAVER_BANNER_CLICKED = "savingsCatcherBanner";
        public static final String SAVER_CREATE_GIFTCARD = "attemptCreateGiftCard";
        public static final String SAVER_FEEDBACK_SUBMITTED = "missedCompForm";
        public static final String SAVER_GIFTCARD_CREATED = "eGiftCardCreation";
        public static final String SAVER_GIFTCARD_TRANSFER = "successGiftCardTransfer";
        public static final String SAVER_RECEIPT_SUBMITTED = "saverRecSubmitted";
        public static final String SAVER_RECOMMENDED_TAP = "recommendedTap";
        public static final String SAVER_RECOMMENDED_VIEW = "recommendedView";
        public static final String SAVER_REGISTER_NUMBER = "registerAction";
        public static final String SAVER_REGISTER_NUMBER_RETRY = "requestResendCode";
        public static final String SAVER_REGISTER_NUMBER_VERIFIED = "phoneNumberAdd";
        public static final String SAVER_RESULT = "saverResult";
        public static final String SAVER_SCANNER_RESULT = "saverScannerOpenTimeAndResult";
        public static final String SAVER_SUCCESSFULL_BB_LINKED = "successBbcardLink";
        public static final String SAVER_SUCCESSFULL_BB_TRANSFER = "successBbcardTransfer";
        public static final String SECTION = "section";
        public static final String SHARE_ITEM = "shareItem";
        public static final String SHIPPING_PASS_HOME_TAP = "shippingPassHomeTap";
        public static final String SIGN_IN_TAP = "signInTap";
        public static final String SIGN_OUT = "signOut";
        public static final String STORE_DETAILS_SECTIONS = "storeDetailsSections";
        public static final String TEST = "test";
        public static final String USER_VOICE_FEEDBACK_DIALOG = "popUpModal";
        public static final String UV_ENJOY_APP_RESULT = "enjoyUsingApp";
        public static final String WEBVIEW_PAGE_LOAD = "webview : ";
    }

    public static interface Page
    {

        public static final String APP_UPGRADE_MESSAGE = "App Upgrade Message";
        public static final String APP_UPGRADE_NOTICE = "App Upgrade Notice";
        public static final String CREATE_ACCOUNT = "create account";
        public static final String DETAILS_DESCRIPTION = "product detail:description";
        public static final String DETAILS_FIND_NEARBY = "product detail:find nearby";
        public static final String DETAILS_MAIN = "product detail";
        public static final String DETAILS_REVIEW = "product detail:reviews";
        public static final String DETAILS_REVIEW_DETAILS = "product detail:review details";
        public static final String ERROR_PAGE = "Error";
        public static final String FAST_PICKUP_CHECK_IN = "check in";
        public static final String FAST_PICKUP_CONFIRMATION = "check in : confirmation";
        public static final String FAST_PICKUP_NOTIFICATION = "express pickup notification";
        public static final String FAST_PICKUP_PUSH_NOTIFICATION_NEW_ORDER = "check in : order ready : service desk";
        public static final String FAST_PICKUP_PUSH_NOTIFICATION_REMINDER = "check in : order ready : store";
        public static final String FAST_PICKUP_SELECT_STORE = "check in : pick store";
        public static final String FEEDBACK_OVERLAY = "share your thoughts overlay";
        public static final String HOME_PAGE = "Homepage";
        public static final String IN_STORE_MAP = "store map";
        public static final String NAVIGATION = "Navigation";
        public static final String ORDERS = "orders";
        public static final String ORDER_DETAILS = "order details";
        public static final String PRIVACY_POLICY = "privacy policy";
        public static final String RECEIPT_MANUAL_ENTRY = "Receipt - Manual Entry";
        public static final String RECEIPT_SCAN = "Receipt - Scan";
        public static final String ROLLBACKS = "rollbacks";
        public static final String SAVER_ABOUT_FAQ = "About Saver - FAQ";
        public static final String SAVER_ABOUT_HOWTO = "About Saver - How To";
        public static final String SAVER_BB_TRANSFERRED = "Bluebird transfer success";
        public static final String SAVER_BLUEBIRD_SIGNUP = "Bluebird SignIn/Up";
        public static final String SAVER_BLUEBIRD_SITE = "Bluebird site";
        public static final String SAVER_DASHBOARD_NEW_USER = "Dashboard - New User";
        public static final String SAVER_DASHBOARD_RETURN_USER = "Dashboard - Return User";
        public static final String SAVER_EGIFT_CARD_CREATED = "eGift Card Created";
        public static final String SAVER_EGIFT_CARD_TRANSFERRED = "eGift Card Transfer Success";
        public static final String SAVER_FEEDBACK_CONFIRMATION_PAGE = "Missed Ad - Thank You";
        public static final String SAVER_FEEDBACK_PAGE = "Missed Ad";
        public static final String SAVER_LOWER_PRICES = "Celebration Lower Price";
        public static final String SAVER_NO_LOWER_PRICES = "Celebration No Lower Price";
        public static final String SAVER_RECEIPT_DETAILS_LOWER_PRICE_FOUND = "Receipt - Lower Price Found";
        public static final String SAVER_RECEIPT_DETAILS_NOT_IN_SAVER = "Receipt - Pre-Program";
        public static final String SAVER_RECEIPT_DETAILS_NO_LOWER_PRICE_FOUND = "Receipt - No Lower Price Found";
        public static final String SAVER_RECEIPT_DETAILS_PROCESSING = "Receipt - List View Processing";
        public static final String SAVER_RECEIPT_DETAILS_TOO_OLD = "Receipt - Not Eligible";
        public static final String SAVER_RECEIPT_IMAGE_DETAILS = "Receipt - Detail Image";
        public static final String SAVER_RECEIPT_ITEM_DETAILS = "Item details";
        public static final String SAVER_RECEIPT_LIST_MULTIPLE_RECEIPTS = "Receipt - List view";
        public static final String SAVER_RECEIPT_LIST_NO_RECEIPTS = "Receipt - No List View";
        public static final String SAVER_RECEIPT_LIST_ONE_RECEIPT = "Receipt - Single item list view";
        public static final String SAVER_RECEIPT_NOTIFICATION = "Results Notification";
        public static final String SAVER_RECEIPT_PRICE_COMPARISON = "Price Comparison";
        public static final String SAVER_RECEIPT_SUBMITTED = "Checking For Matches";
        public static final String SAVER_REDEEM_EGIFT_CARD_CREATED_BB_LINKED = "eGift Card Created - Linked to Bluebird";
        public static final String SAVER_REDEEM_EGIFT_CARD_CREATED_BB_NOT_CREATED = "eGift Card Created - Bluebird not created";
        public static final String SAVER_REDEEM_EGIFT_CARD_NOT_CREATED = "eGift Card Not Yet Created";
        public static final String SAVER_REDEEM_FUNDS_FAILED = "Not able to redeem funds";
        public static final String SAVER_REDEEM_PAGE = "Get Money Back";
        public static final String SAVER_REGISTER_PHONE_INFO = "Why Enter Phone Number";
        public static final String SAVER_REGISTER_PHONE_PAGE = "Enter Phone Number";
        public static final String SAVER_REGISTER_VERIFY_PAGE = "Enter Code";
        public static final String SAVER_REWARD_PAGE = "Your Reward dollars";
        public static final String SCAN_SCREEN = "home : scan";
        public static final String SEARCH_FILTER = "search filter";
        public static final String SEARCH_RESULTS = "search results";
        public static final String SEARCH_SORT = "search sort";
        public static final String SETTINGS_PAGE = "Settings";
        public static final String SHOP = "shop";
        public static final String SIGN_IN = "SignIn";
        public static final String STORE_DETAILS_PAGE = "store details";
        public static final String STORE_FILTER = "store filter";
        public static final String STORE_SEARCH_RESULTS = "storeSearchResults";
        public static final String TERMS_OF_USE = "terms of use";
        public static final String UV_ENJOY_APP = "did you enjoy using this app overlay";
        public static final String UV_FEEDBACK_PAGE = "question and feedback";
        public static final String WEEKLY_AD_ALL_SPECIALS = "weekly ad : all specials";
        public static final String WEEKLY_AD_FULL_PAGE = "weekly ad : full page";
        public static final String WEEKLY_AD_LANDING = "weekly ad : landing";
        public static final String WEEKLY_AD_PAGE_AND_LIST = "weekly ad : page and list";
        public static final String WISHLIST_ADD_TO_LIST = "add to list";
        public static final String WISHLIST_EDIT_LIST_DETAILS = "edit list details";
        public static final String WISHLIST_FIND_LIST = "find a list";
        public static final String WISHLIST_FIND_LIST_RESULTS = "find list results";
        public static final String WISHLIST_GIFT_GIVER = "gift giver";
        public static final String WISHLIST_LANDING_PAGE = "list tab";
        public static final String WISHLIST_LIST = "list";
        public static final String WISHLIST_REVIEW_ITEMS = "review items";
        public static final String WISHLIST_SORT_DIALOG = "list sort";
        public static final String WM_PHARMACY_ACCT = "Rx:WalmartPharmacyAccount";
    }

    public static interface Section
    {

        public static final String ACCOUNT = "account";
        public static final String BROWSE = "browse";
        public static final String FAST_PICKUP = "express pickup";
        public static final String FEEDBACK = "user feedback";
        public static final String GLOBAL_NAV = "global nav";
        public static final String HOME = "Home";
        public static final String HOMEPAGE = "homepage";
        public static final String LISTS = "lists";
        public static final String ROLLBACKS = "rollbacks";
        public static final String SAVER = "Saver";
        public static final String SAVER_RECEIPT = "Saver - Receipt";
        public static final String SEARCH = "search";
        public static final String SETTINGS = "Settings";
        public static final String SHOP = "shop";
        public static final String STORE = "store";
        public static final String STORE_SEARCH = "store search";
        public static final String UV_FEEDBACK = "user feedback";
        public static final String WEEKLY_AD = "weekly ad";
    }

    public static interface SubCategory
    {

        public static final String ACCOUNT = "account";
        public static final String BLUEBIRD = "Bluebird";
        public static final String BROWSE = "browse";
        public static final String EGIFT_CARD = "eGift Card";
        public static final String ERROR = "Error";
        public static final String FEEDBACK = "user feedback";
        public static final String GLOBAL_NAV = "global nav";
        public static final String HOMEPAGE = "homepage";
        public static final String HOME_PAGE = "Homepage";
        public static final String LISTS = "lists";
        public static final String RECEIPT = "Receipt";
        public static final String ROLLBACKS = "rollbacks";
        public static final String SAVER_DASHBOARD = "Dashboard";
        public static final String SAVINGS_CATCHER = "Savings Catcher";
        public static final String SEARCH = "search";
        public static final String SETTINGS = "Settings";
        public static final String STORE = "store";
        public static final String WEEKLY_AD = "weekly ad";
    }

    public static interface Value
    {

        public static final String ACTION_TAPPED_ABOUT = "about";
        public static final String ACTION_TAPPED_CHANGE_STORE = "change store";
        public static final String ACTION_TAPPED_FEEDBACK = "give feedback";
        public static final String ACTION_TAPPED_HELP = "help";
        public static final String ACTION_TAPPED_HOME = "home";
        public static final String ACTION_TAPPED_MOBILE_PAY = "mobile pay";
        public static final String ACTION_TAPPED_PHARMACY = "pharmacy";
        public static final String ACTION_TAPPED_PHOTO = "1-hour photo";
        public static final String ACTION_TAPPED_SAVER = "savings catcher";
        public static final String ACTION_TAPPED_SETTINGS = "settings";
        public static final String ACTION_TAPPED_SET_STORE = "set your store";
        public static final String ACTION_TAPPED_SHOP_BY_DEPT = "shop by department";
        public static final String ACTION_TAPPED_SIGNIN = "sign in";
        public static final String ACTION_TAPPED_SIGNOUT = "sign out";
        public static final String ACTION_TAPPED_STORE_FINDER = "store finder";
        public static final String ACTION_TAPPED_TRACK_ORDER = "track your order";
        public static final String ACTION_TAPPED_WEEKLY_AD = "weekly ad";
        public static final String ACTION_TAPPED_YOUR_STORE = "your store";
        public static final String BROWSE = "browse";
        public static final String CHECKED = "checked";
        public static final String HOMESCREEN_SECTION_BARCODE_ICON = "barcode icon";
        public static final String HOMESCREEN_SECTION_CART = "cart";
        public static final String HOMESCREEN_SECTION_ENABLE_LOCATION = "enable location";
        public static final String HOMESCREEN_SECTION_FAST_PICKUP = "express pickup";
        public static final String HOMESCREEN_SECTION_FIND_STORE = "find store";
        public static final String HOMESCREEN_SECTION_PHARMACY = "pharmacy";
        public static final String HOMESCREEN_SECTION_PHOTO = "photo";
        public static final String HOMESCREEN_SECTION_ROLLBACKS = "rollbacks";
        public static final String HOMESCREEN_SECTION_SAVER = "savings catcher";
        public static final String HOMESCREEN_SECTION_SCAN_FOR_PRICE = "scan for price";
        public static final String HOMESCREEN_SECTION_SEARCH_ICON = "search icon";
        public static final String HOMESCREEN_SECTION_SEARCH_THIS_STORE = "search this store";
        public static final String HOMESCREEN_SECTION_SHOP_BY_DEPT = "shop by department";
        public static final String HOMESCREEN_SECTION_UPDATE = "update";
        public static final String HOMESCREEN_SECTION_WALMART_PAY = "mobile pay";
        public static final String HOMESCREEN_SECTION_WEEKLY_AD = "weekly ad";
        public static final String INSIDE = "inside";
        public static final String ITEM_PAGE = "item page";
        public static final String LOC_CART = "cart";
        public static final String LOC_ITEM_PAGE = "itempage";
        public static final String LOWER_FOUND = "lowerFound";
        public static final String LOWER_NOT_FOUND = "lowerNotFound";
        public static final String MAP_INTERACTION_NEXT = "paginate next";
        public static final String MAP_INTERACTION_OPEN = "reopen card";
        public static final String MAP_INTERACTION_PREV = "paginate previous";
        public static final String MPAY = "mobile pay";
        public static final String MPAY_METHODS = "mobile payment methods";
        public static final String NO = "no";
        public static final String NOTIFICATION_PROMOTION = "promotion";
        public static final String NOTIFICATION_SAVER = "savingscatcher";
        public static final String NOTIFICATION_SAVER_COMPARISON_DONE = "completecomparison";
        public static final String NOTIFICATION_STORE = "events";
        public static final String NOT_APLICABLE = "NA";
        public static final String NO_ERROR = "none";
        public static final String OUTSIDE = "outside";
        public static final String PRIVATE = "private";
        public static final String PUBLIC = "public";
        public static final String PUSH_DESTINATION_HOMESCREEN = "MainActivity";
        public static final String RESULT_ABORT = "abort";
        public static final String RESULT_ERROR = "error";
        public static final String SAVER_REGISTER = "register";
        public static final String SAVER_REGISTER_LATER = "not now";
        public static final String SCAN = "scan";
        public static final String SCAN_QR_RESULT_SUCCESS = "qrscan";
        public static final String SCAN_RESULT_MANUAL = "manual";
        public static final String SCAN_TC_RESULT_SUCCESS = "tcscan";
        public static final String STORE_DETAILS_SECTION_CALL_DEPT = "callDepartment";
        public static final String STORE_DETAILS_SECTION_CALL_STORE = "callStore";
        public static final String STORE_DETAILS_SECTION_GET_DIRECTIONS = "getDirections";
        public static final String STORE_DETAILS_SECTION_MAP = "map";
        public static final String STORE_DETAILS_SECTION_SET_MY_STORE = "setAsMyStore";
        public static final String STORE_DETAILS_SECTION_WEEKLY_AD = "weeklyAd";
        public static final String STORE_ID_STATUS_INACCURATE = "inaccurate";
        public static final String STORE_ID_STATUS_IN_STORE = "instore";
        public static final String STORE_ID_STATUS_NOT_PERMITTED = "notpermitted";
        public static final String STORE_ID_STATUS_NOT_STORE = "notstore";
        public static final String STORE_ID_STATUS_UNKNOWN = "unknown";
        public static final String UNCHECKED = "unchecked";
        public static final String UNKNOWN_PAGE = "unknown";
        public static final String UPGRADE_OPTION_SELECTED_DISMISS = "dismiss";
        public static final String UPGRADE_OPTION_SELECTED_UPGRADE = "upgrade";
        public static final String UPGRADE_TYPE_FORCED = "force";
        public static final String WEBVIEW = "webview";
        public static final String YES = "yes";
    }


    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy", Locale.US);

}
