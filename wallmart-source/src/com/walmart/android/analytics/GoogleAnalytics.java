// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import java.lang.reflect.Method;
import java.util.Random;

public class GoogleAnalytics
{
    public static interface Action
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

    private static class AuthencationStatusReceiver
    {

        public AuthenticationStatusEvent mLastAuthStatusEvent;

        public void onAuthencationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
        {
            mLastAuthStatusEvent = authenticationstatusevent;
        }

        private AuthencationStatusReceiver()
        {
        }

    }

    public static interface Category
    {

        public static final String CATEGORY_ACCOUNT = "Account";
        public static final String CATEGORY_CART = "Cart";
        public static final String CATEGORY_GLOBAL_NAV = "Global Nav";
        public static final String CATEGORY_HOME = "Home";
        public static final String CATEGORY_ITEM_BUTTONS = "Item Buttons";
        public static final String CATEGORY_ITEM_DETAILS = "Item Details";
        public static final String CATEGORY_LOCAL_AD = "Local Ad";
        public static final String CATEGORY_NOTIFICATIONS = "Notifications";
        public static final String CATEGORY_PHARMACY = "Pharmacy";
        public static final String CATEGORY_RECOMMENDATIONS = "Recommendations";
        public static final String CATEGORY_SCAN = "Scan";
        public static final String CATEGORY_SEARCH = "Search";
        public static final String CATEGORY_SEARCH_INTERCEPT = "Search Intercept";
        public static final String CATEGORY_SHELF = "Shelf";
        public static final String CATEGORY_SHOP_BY_DEPT = "Shop by Dept";
        public static final String CATEGORY_STORE_DETAILS = "Store Details";
        public static final String CATEGORY_STORE_SEARCH = "Store Search";
        public static final String CATEGORY_WIDGET = "Widget";
    }

    public static interface Label
    {

        public static final String LABEL_CART_CHECKOUT_COMPLETE = "Complete";
        public static final String LABEL_CART_CHECKOUT_START = "Start";
        public static final String LABEL_CART_GUEST_CHECKOUT_AVAILABLE = "Available";
        public static final String LABEL_CART_GUEST_CHECKOUT_COMPLETE = "Complete";
        public static final String LABEL_CART_GUEST_CHECKOUT_START = "Start";
        public static final String LABEL_GLOBAL_NAV_CHANGE_STORE_MORE_MENU = "More Menu";
        public static final String LABEL_GLOBAL_NAV_CHANGE_STORE_NAV_FOOTER = "Nav Footer";
        public static final String LABEL_ITEM_DETAILS_REVIEWS_HEADER = "Header";
        public static final String LABEL_ITEM_DETAILS_REVIEWS_SECTION = "Section";
        public static final String LABEL_ITEM_DETAILS_STORE_AVAILABILITY_FAILED = "Failed";
        public static final String LABEL_ITEM_DETAILS_STORE_AVAILABILITY_NO_STORE = "No Store";
        public static final String LABEL_SCAN_TO_SHELF_STORE_NOT_SET = "Store Not Set";
        public static final String LABEL_SCAN_TO_SHELF_STORE_SET = "Store Set";
        public static final String LABEL_SHELF_FILTER_NO_FILTER = "No Filter";
        public static final String LABEL_SHELF_FILTER_STORE = "Store";
    }


    public static final String APP_SECTION_BROWSE = "Browse";
    public static final String APP_SECTION_CART = "Cart";
    public static final String APP_SECTION_LOCAL_AD = "Local Ad";
    public static final String APP_SECTION_OTHER = "Other";
    public static final String APP_SECTION_PHARMACY = "Pharmacy";
    public static final String APP_SECTION_PHOTO = "Photo";
    public static final String APP_SECTION_SEARCH = "Search";
    public static final String APP_SECTION_STORES = "Stores";
    public static final String APP_SECTION_TRACK_ORDER = "Track Order";
    public static String BUNDLE_TYPE_CONFIGURABLE = "configurable_bundle";
    public static String BUNDLE_TYPE_INFLEXKIT = "inflexible_kit";
    public static String BUNDLE_TYPE_NON_CONFIGURABLE = "non_configurable";
    public static String BUNDLE_TYPE_REGULAR = "regular";
    private static boolean DEBUG = false;
    private static final String TAG = com/walmart/android/analytics/GoogleAnalytics.getSimpleName();
    private static final int TRACK_PERCENTAGE = 20;
    private static AuthencationStatusReceiver sAuthStatusReceiver;
    private static Context sContext;
    private static String sCurrentAppSection;
    public static String sDeviceType;
    private static boolean sIsTablet;
    private static boolean sStarted;
    private static boolean sTracking;

    public GoogleAnalytics()
    {
    }

    public static String getAppSection()
    {
        return sCurrentAppSection;
    }

    private static String getCurrentOrientation()
    {
        if (sContext != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return "N/A";
_L2:
        if ((obj = sContext.getResources()) == null || (obj = ((Resources) (obj)).getConfiguration()) == null) goto _L1; else goto _L3
_L3:
        ((Configuration) (obj)).orientation;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 99
    //                   2 93
    //                   3 105;
           goto _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_105;
_L4:
        obj = "Undefined";
_L8:
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (sIsTablet)
        {
            s = "Tablet ";
        } else
        {
            s = "Phone ";
        }
        return stringbuilder.append(s).append(((String) (obj))).toString();
_L6:
        obj = "Landscape";
          goto _L8
_L5:
        obj = "Portrait";
          goto _L8
        obj = "Square";
          goto _L8
    }

    private static String getUserType()
    {
        if (sAuthStatusReceiver == null) goto _L2; else goto _L1
_L1:
        Object obj = sAuthStatusReceiver.mLastAuthStatusEvent;
_L4:
        if (obj != null)
        {
            try
            {
                if (((AuthenticationStatusEvent) (obj)).hasCredentials)
                {
                    return ((AuthenticationStatusEvent) (obj)).customerId;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e(TAG, (new StringBuilder()).append("getUserType(): ").append(obj).toString());
                return "N/A";
            }
        }
        return "Visitor";
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void setAppSection(String s)
    {
        sCurrentAppSection = s;
    }

    private static void setCustomVariable(int i, String s, String s1, int j)
    {
        if (s == null)
        {
            Log.e(TAG, "setCustomVariable(): no name supplied!");
            return;
        }
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "N/A";
            Log.e(TAG, (new StringBuilder()).append("setCustomVariable(): no value for ").append(s).append(" supplied. Defaulting to N/A").toString());
        }
        s1 = GoogleAnalyticsTracker.getInstance();
        try
        {
            s1.setCustomVar(i, s, s2, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, (new StringBuilder()).append("setCustomVariable(): ").append(s).toString());
        }
    }

    private static void setCustomVariables()
    {
        try
        {
            setCustomVariable(1, "Device Type", sDeviceType, 3);
            setCustomVariable(2, "App Section", sCurrentAppSection, 3);
            setCustomVariable(3, "User Type", getUserType(), 2);
            setCustomVariable(4, "Orientation", getCurrentOrientation(), 2);
            return;
        }
        catch (Exception exception)
        {
            Log.e(TAG, (new StringBuilder()).append("setCustomVariables(): ").append(exception).toString());
        }
    }

    private static void setDeviceTypeString(Context context)
    {
        Object obj;
        String s;
        String s1;
        String s2;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        StringBuilder stringbuilder;
        int i;
        i = 0;
        stringbuilder = new StringBuilder();
        obj3 = null;
        s = null;
        obj2 = null;
        s1 = null;
        obj1 = null;
        obj4 = null;
        obj = obj3;
        s2 = obj2;
        Method amethod[] = Class.forName("android.os.SystemProperties").getMethods();
        obj = obj3;
        s2 = obj2;
        int j = amethod.length;
_L6:
        Method method = obj4;
        if (i >= j) goto _L2; else goto _L1
_L1:
        method = amethod[i];
        obj = obj3;
        s2 = obj2;
        if (!method.getName().equals("get")) goto _L4; else goto _L3
_L3:
        obj = obj3;
        s2 = obj2;
        if (!method.getReturnType().equals(java/lang/String)) goto _L4; else goto _L5
_L5:
        obj = obj3;
        s2 = obj2;
        if (method.getParameterTypes().length != 1) goto _L4; else goto _L2
_L2:
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        obj = obj3;
        s2 = obj2;
        s = (String)method.invoke(null, new Object[] {
            "ro.product.model"
        });
        obj = s;
        s2 = obj2;
        s1 = (String)method.invoke(null, new Object[] {
            "ro.build.version.release"
        });
        obj = s;
        s2 = s1;
        context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        obj = s;
_L7:
        if (obj == null)
        {
            obj = "UNKNOWN";
        }
        obj = stringbuilder.append(((String) (obj))).append(" : ");
        if (s1 == null)
        {
            s1 = "UNKNOWN";
        }
        obj = ((StringBuilder) (obj)).append(s1).append(" : ");
        if (context == null)
        {
            context = "UNKNOWN";
        }
        ((StringBuilder) (obj)).append(context);
        sDeviceType = stringbuilder.toString();
        return;
_L4:
        i++;
          goto _L6
        context;
        context = obj1;
        s1 = s2;
          goto _L7
    }

    public static void start(Context context)
    {
        if (sStarted)
        {
            return;
        }
        sContext = context;
        int j = SharedPreferencesUtil.getShouldTrackWithGA(sContext);
        int i = j;
        if (j == 0)
        {
            GoogleAnalyticsTracker googleanalyticstracker;
            if ((new Random()).nextInt(99) < 20)
            {
                i = 1;
            } else
            {
                i = 2;
            }
            if (DEBUG)
            {
                Log.d(TAG, (new StringBuilder()).append("Setting initial tracking status: ").append(i).toString());
            }
            SharedPreferencesUtil.setShouldTrackWithGA(sContext, i);
        }
        if (i != 1) goto _L2; else goto _L1
_L1:
        sTracking = true;
        googleanalyticstracker = GoogleAnalyticsTracker.getInstance();
        try
        {
            googleanalyticstracker.start("UA-23393732-2", 20, context.getApplicationContext());
            googleanalyticstracker.setDebug(DEBUG);
            googleanalyticstracker.setDryRun(false);
            setDeviceTypeString(context);
            sIsTablet = context.getResources().getBoolean(0x7f0c0003);
            if (sAuthStatusReceiver == null)
            {
                sAuthStatusReceiver = new AuthencationStatusReceiver();
                MessageBus.getBus().register(sAuthStatusReceiver);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(TAG, "start()", context);
        }
        if (DEBUG)
        {
            Log.d(TAG, "GA set up");
        }
_L4:
        sStarted = true;
        return;
_L2:
        sTracking = false;
        if (DEBUG)
        {
            Log.d(TAG, "This client will not track GA events");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void stop()
    {
        try
        {
            if (sTracking)
            {
                GoogleAnalyticsTracker.getInstance().stop();
            }
            if (sAuthStatusReceiver != null)
            {
                MessageBus.getBus().unregister(sAuthStatusReceiver);
                sAuthStatusReceiver = null;
            }
            return;
        }
        catch (Exception exception)
        {
            Log.e(TAG, "stop()", exception);
        }
    }

    public static void trackEvent(String s, String s1, String s2)
    {
        trackEvent(s, s1, s2, 0);
    }

    public static void trackEvent(String s, String s1, String s2, int i)
    {
        if (!sTracking)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        setCustomVariables();
        GoogleAnalyticsTracker.getInstance().trackEvent(s, s1, s2, i);
        if (DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("trackEvent: category=").append(s).append(", action=").append(s1).append(", label=").append(s2).append(", value=").append(i).toString());
        }
_L1:
        return;
        s;
        Log.e(TAG, "trackEvent()", s);
        return;
        if (DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("Not tracking: trackEvent: category=").append(s).append(", action=").append(s1).append(", label=").append(s2).append(", value=").append(i).toString());
            return;
        }
          goto _L1
    }

    public static transient void trackEventNew(String s, String s1, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('{');
        for (int i = 0; i < as.length; i++)
        {
            stringbuilder.append(as[i]);
            if (i < as.length - 1)
            {
                stringbuilder.append(',');
            }
        }

        stringbuilder.append('}');
        trackEvent(s, s1, stringbuilder.toString(), 0);
    }

    public static void trackPageView(String s)
    {
        GoogleAnalyticsTracker googleanalyticstracker;
        if (!sTracking)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        googleanalyticstracker = GoogleAnalyticsTracker.getInstance();
        setCustomVariables();
        googleanalyticstracker.trackPageView(s);
        if (DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("trackPageView: ").append(s).toString());
        }
_L1:
        return;
        Exception exception;
        exception;
        Log.e(TAG, (new StringBuilder()).append("trackPageView(): ").append(s).toString(), exception);
        return;
        if (DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("trackPageView: ").append(s).toString());
            return;
        }
          goto _L1
    }

    public static void trackUncaughtException(Thread thread, Throwable throwable)
    {
        for (; throwable.getCause() != null; throwable = throwable.getCause()) { }
        StringBuilder stringbuilder = new StringBuilder();
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        for (int i = 0; i < astacktraceelement.length && i < 10; i++)
        {
            if (i != 0)
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append(astacktraceelement[i].getFileName());
            stringbuilder.append(":");
            stringbuilder.append(astacktraceelement[i].getLineNumber());
        }

        trackEvent("Exceptions", throwable.getClass().getName(), (new StringBuilder()).append("In thread ").append(thread.getName()).append(" @ ").append(stringbuilder.toString()).append("\n[").append(sDeviceType).append("]").toString());
    }

    static 
    {
        DEBUG = false;
    }
}
