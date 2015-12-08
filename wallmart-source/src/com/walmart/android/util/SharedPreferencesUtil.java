// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.utils.WLog;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class SharedPreferencesUtil
{
    public static class SaverBluebirdRedeemed
    {

        public int previousTotal;
        public int redeemedCredit;
        public int redeemedTotal;

        public SaverBluebirdRedeemed()
        {
        }
    }

    public static class StoreUpdateEvent
    {

        public WalmartStore store;

        public boolean hasStoreSet()
        {
            return store != null;
        }

        public StoreUpdateEvent()
        {
        }

        public StoreUpdateEvent(WalmartStore walmartstore)
        {
            store = walmartstore;
        }
    }


    public static final String BROADCAST_STORE_DATA_UPDATED = "com.walmart.android.STORE_DATE_UPDATED";
    public static final boolean DEBUG = false;
    public static final long ERECEIPT_PHONE_NUMBER_TIME_LIMIT = 0x1b7740L;
    public static final int GA_TRACKING_DO_NOT_TRACK = 2;
    public static final int GA_TRACKING_NOT_SET = 0;
    public static final int GA_TRACKING_SHOULD_TRACK = 1;
    public static final String GENERAL_PREFS = "GENERAL_PREFS";
    private static final String LOCAL_AD_JSON_STORE_FILE = "local_ad_store_json";
    public static final String LOCAL_AD_PREFS = "LOCAL_AD_PREFS";
    public static final String NOT_SET = "not_set";
    public static final String PREF_APP_STARTED = "PREF_APP_STARTED";
    public static final String PREF_CHECKOUT_URL = "PREF_CHECKOUT_URL";
    public static final String PREF_CLEAR_CACHE = "PREF_CLEAR_CACHE";
    private static final String PREF_ERECEIPT_NOTIFICATIONS_ENABLED = "STORE_ERECEIPT_NOTIFICATIONS_ENABLED";
    private static final String PREF_ERECEIPT_PHONE_NUMBER = "PREF_ERECEIPT_PHONE_NUMBER";
    private static final String PREF_ERECEIPT_PHONE_NUMBER_TIMESTAMP = "PREF_ERECEIPT_PHONE_NUMBER_TIMESTAMP";
    private static final String PREF_FAST_PICKUP_NOTIFICATION_STATUS = "PREF_FAST_PICKUP_NOTIFICATION_STATUS";
    private static final String PREF_HAS_CLEARED_ADX_UDID = "PREF_HAS_CLEARED_ADX_UDID";
    private static final String PREF_HAS_CLEARED_WEBVIEW_FORM_DATA = "PREF_HAS_CLEARED_WEBVIEW_FORM_DATA";
    public static final String PREF_HOME_IMAGE_TARGET = "PREF_HOME_IMAGE_TARGET";
    public static final String PREF_HOME_IMAGE_URL = "PREF_HOME_IMAGE_URL";
    public static final String PREF_INITIAL_BANNER_ASPECT_RATIO = "PREF_INITIAL_BANNER_ASPECT_RATIO";
    private static final String PREF_INSTALLATION_ID = "INSTALLATION_ID";
    public static final String PREF_MENU_HAS_BEEN_CLICKED = "PREF_MENU_HAS_BEEN_CLICKED";
    private static final String PREF_NO_OF_LAUNCHES = "PREF_NO_OF_LAUNCHES";
    public static final String PREF_ONBOARDING_VERSION_CODE = "PREF_ONBOARDING_VERSION_CODE";
    private static final String PREF_PROMOTION_NOTIFICATIONS_ENABLED = "PUSH_ENABLED";
    private static final String PREF_SAVER_AMOUNT_PREVIOUS_TOTAL = "PREF_SAVER_AMOUNT_PREVIOUS_TOTAL";
    private static final String PREF_SAVER_AMOUNT_REDEEMED_BLUEBIRD = "PREF_SAVER_AMOUNT_REDEEMED_BLUEBIRD";
    private static final String PREF_SAVER_AMOUNT_REDEEMED_CREDIT = "PREF_SAVER_AMOUNT_REDEEMED_CREDIT";
    private static final String PREF_SAVER_AMOUNT_REDEEMED_TIMESTAMP = "PREF_SAVER_AMOUNT_REDEEMED_TIMESTAMP";
    private static final String PREF_SAVER_NOTIFICATIONS_ENABLED = "STORE_SAVER_NOTIFICATIONS_ENABLED";
    private static final String PREF_SAVER_RECEIPT_SCANNED = "PREF_SAVER_RECEIPT_SCANNED";
    private static final String PREF_SAVER_SHOW_CELEBRATION = "PREF_SAVER_SHOW_CELEBRATION";
    public static final String PREF_SELECTED_STORE_ADDRESS_1 = "PREF_SELECTED_STORE_ADDRESS_1";
    public static final String PREF_SELECTED_STORE_ADDRESS_2 = "PREF_SELECTED_STORE_ADDRESS_2";
    public static final String PREF_SELECTED_STORE_ID = "PREF_SELECTED_STORE_ID";
    public static final String PREF_SELECTED_STORE_LAT = "PREF_SELECTED_STORE_LAT";
    public static final String PREF_SELECTED_STORE_LONG = "PREF_SELECTED_STORE_LONG";
    public static final String PREF_SELECTED_STORE_NAME = "PREF_SELECTED_STORE_NAME";
    private static final String PREF_SHIPPING_PASS_PENDING_REFRESH = "PREF_SHIPPING_PASS_PENDING_REFRESH";
    private static final String PREF_SHOWN_AD_PAGE_INSTRUCTION = "PREF_SHOWN_AD_INSTRUCTION";
    private static final String PREF_SHOWN_AD_ZOOM_INSTRUCTION = "PREF_SHOWN_AD_ZOOM_INSTRUCTION";
    public static final String PREF_SHOWN_NO_AUTOFOCUS = "PREF_SHOWN_NO_AUTOFOCUS";
    public static final String PREF_SHOWN_RATE_APP = "PREF_SHOWN_RATE_APP";
    public static final String PREF_SHOW_RATE_APP = "PREF_SHOW_RATE_APP";
    private static final String PREF_STORE_FEATURES_NOTIFICATIONS_ENABLED = "STORE_FEATURES_NOTIFICATIONS_ENABLED";
    private static final String PREF_TRACK_GA = "PREF_TRACK_GA";
    public static final String PREF_UPDATE_NAG = "PREF_UPDATE_NAG";
    private static final String PREF_VUDU_NOTIFICATIONS_ENABLED = "VUDU_NOTIFICATIONS_ENABLED";
    private static final String PREF_WISHLIST_INTRO_SHOWN = "PREF_WISHLIST_INTRO_SHOWN";
    private static final String TAG = com/walmart/android/util/SharedPreferencesUtil.getSimpleName();
    private static boolean sIsFirstStart;

    public SharedPreferencesUtil()
    {
    }

    public static void clearFastPickupNotificationStatus(Context context, String s)
    {
        context = context.getSharedPreferences("PREF_FAST_PICKUP_NOTIFICATION_STATUS", 0);
        if (TextUtils.isEmpty(s))
        {
            context.edit().clear().apply();
        } else
        {
            context.edit().remove(s).apply();
        }
        context = context.getAll();
        WLog.d(TAG, (new StringBuilder()).append("clearFastPickupNotificationStatus() : items=").append(context.size()).toString());
        for (context = context.entrySet().iterator(); context.hasNext(); WLog.d(TAG, (new StringBuilder()).append("clearFastPickupNotificationStatus Item: key=").append((String)s.getKey()).append(": ").append(s.getValue()).toString()))
        {
            s = (java.util.Map.Entry)context.next();
        }

    }

    public static void clearSaverReceiptScanned(Context context)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().remove("PREF_SAVER_RECEIPT_SCANNED").commit();
    }

    public static void clearSaverShowCelebration(Context context)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().remove("PREF_SAVER_SHOW_CELEBRATION").commit();
    }

    public static void clearStates(Context context, boolean flag)
    {
        if (flag)
        {
            setEReceiptPhoneNumber(context, null);
            setSaverAmountRedeemed(context, -1, -1, -1);
            return;
        } else
        {
            getEReceiptPhoneNumber(context);
            getSaverAmountRedeemed(context);
            return;
        }
    }

    public static void clearStoreInfo(Context context)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("LOCAL_AD_PREFS", 0).edit();
        editor.clear();
        editor.apply();
        context.deleteFile("local_ad_store_json");
        context.sendBroadcast(new Intent("com.walmart.android.STORE_DATE_UPDATED"));
        MessageBus.getBus().post(new StoreUpdateEvent());
    }

    public static String getClearCacheUUID(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getString("PREF_CLEAR_CACHE", "not_set");
    }

    public static String getEReceiptPhoneNumber(Context context)
    {
        Object obj = context.getSharedPreferences("GENERAL_PREFS", 0);
        long l = ((SharedPreferences) (obj)).getLong("PREF_ERECEIPT_PHONE_NUMBER_TIMESTAMP", 0L);
        String s = ((SharedPreferences) (obj)).getString("PREF_ERECEIPT_PHONE_NUMBER", null);
        obj = s;
        if (!TextUtils.isEmpty(s))
        {
            obj = s;
            if (0x1b7740L + l < System.currentTimeMillis())
            {
                setEReceiptPhoneNumber(context, null);
                obj = null;
            }
        }
        return ((String) (obj));
    }

    public static String getFastPickupNotificationStatus(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            context = context.getSharedPreferences("PREF_FAST_PICKUP_NOTIFICATION_STATUS", 0).getString(s, "");
            WLog.d(TAG, (new StringBuilder()).append("getFastPickupNotificationStatus() storeId=").append(s).append(" hash=").append(context).toString());
            return context;
        }
    }

    public static String getHomeImageTarget(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getString("PREF_HOME_IMAGE_TARGET", "");
    }

    public static String getHomeImageUrl(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getString("PREF_HOME_IMAGE_URL", "");
    }

    public static float getInitialBannerAspectRatio(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getFloat("PREF_INITIAL_BANNER_ASPECT_RATIO", 0.0F);
    }

    public static String getInstallationId(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("GENERAL_PREFS", 0);
        String s = sharedpreferences.getString("INSTALLATION_ID", null);
        context = s;
        if (s == null)
        {
            context = UUID.randomUUID().toString();
            sharedpreferences.edit().putString("INSTALLATION_ID", context).apply();
        }
        return context;
    }

    public static String getLastNaggedVersion(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getString("PREF_UPDATE_NAG", "");
    }

    public static int getNoOfLaunches(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getInt("PREF_NO_OF_LAUNCHES", 0);
    }

    public static WalmartStore getSavedLocalAdJsonStore(Context context)
    {
        ObjectMapper objectmapper = new ObjectMapper();
        objectmapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try
        {
            context = (WalmartStore)objectmapper.readValue(context.openFileInput("local_ad_store_json"), com/walmart/android/data/WalmartStore);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static StoreInfo getSavedLocalAdStore(Context context)
    {
        Object obj = null;
        SharedPreferences sharedpreferences = context.getSharedPreferences("LOCAL_AD_PREFS", 0);
        context = obj;
        if (sharedpreferences.contains("PREF_SELECTED_STORE_ID"))
        {
            context = new StoreInfo();
            context.storeID = sharedpreferences.getString("PREF_SELECTED_STORE_ID", null);
            context.storeDescription = sharedpreferences.getString("PREF_SELECTED_STORE_NAME", "");
            context.addressLine1 = sharedpreferences.getString("PREF_SELECTED_STORE_ADDRESS_1", "");
            context.addressLine2 = sharedpreferences.getString("PREF_SELECTED_STORE_ADDRESS_2", "");
            context.latitude = sharedpreferences.getFloat("PREF_SELECTED_STORE_LAT", 0.0F);
            context.longitude = sharedpreferences.getFloat("PREF_SELECTED_STORE_LONG", 0.0F);
        }
        return context;
    }

    public static SaverBluebirdRedeemed getSaverAmountRedeemed(Context context)
    {
        Object obj;
label0:
        {
            obj = context.getSharedPreferences("GENERAL_PREFS", 0);
            long l = ((SharedPreferences) (obj)).getLong("PREF_SAVER_AMOUNT_REDEEMED_TIMESTAMP", 0L);
            SaverBluebirdRedeemed saverbluebirdredeemed = new SaverBluebirdRedeemed();
            saverbluebirdredeemed.previousTotal = ((SharedPreferences) (obj)).getInt("PREF_SAVER_AMOUNT_PREVIOUS_TOTAL", -1);
            saverbluebirdredeemed.redeemedCredit = ((SharedPreferences) (obj)).getInt("PREF_SAVER_AMOUNT_REDEEMED_CREDIT", -1);
            saverbluebirdredeemed.redeemedTotal = ((SharedPreferences) (obj)).getInt("PREF_SAVER_AMOUNT_REDEEMED_BLUEBIRD", -1);
            if (saverbluebirdredeemed.previousTotal < 0 && saverbluebirdredeemed.redeemedCredit < 0)
            {
                obj = saverbluebirdredeemed;
                if (saverbluebirdredeemed.redeemedTotal < 0)
                {
                    break label0;
                }
            }
            obj = saverbluebirdredeemed;
            if (0x1b7740L + l < System.currentTimeMillis())
            {
                setSaverAmountRedeemed(context, -1, -1, -1);
                obj = null;
            }
        }
        return ((SaverBluebirdRedeemed) (obj));
    }

    public static boolean getShippingPassPendingRefresh(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_SHIPPING_PASS_PENDING_REFRESH", false);
    }

    public static int getShouldTrackWithGA(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getInt("PREF_TRACK_GA", 0);
    }

    public static boolean getWishListIntroShown(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_WISHLIST_INTRO_SHOWN", false);
    }

    public static boolean hasClearedAdXUdid(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_HAS_CLEARED_ADX_UDID", false);
    }

    public static boolean hasClearedWebViewFormData(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_HAS_CLEARED_WEBVIEW_FORM_DATA", false);
    }

    public static boolean hasShownAdPageInstruction(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_SHOWN_AD_INSTRUCTION", false);
    }

    public static boolean hasShownAdZoomInstruction(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_SHOWN_AD_ZOOM_INSTRUCTION", false);
    }

    public static boolean hasShownNoAutofocusDialog(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_SHOWN_NO_AUTOFOCUS", false);
    }

    public static boolean hasShownRateAppDialog(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_SHOWN_RATE_APP", false);
    }

    public static boolean hasStoreInfo(Context context)
    {
        return context.getSharedPreferences("LOCAL_AD_PREFS", 0).contains("PREF_SELECTED_STORE_ID");
    }

    public static boolean isEReceiptNotificationsEnabled(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("STORE_ERECEIPT_NOTIFICATIONS_ENABLED", true);
    }

    public static boolean isFirstStart()
    {
        return sIsFirstStart;
    }

    public static boolean isPromotionNotificationsEnabled(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PUSH_ENABLED", true);
    }

    public static boolean isSaverNotificationsEnabled(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("STORE_SAVER_NOTIFICATIONS_ENABLED", true);
    }

    public static boolean isSaverReceiptScanned(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_SAVER_RECEIPT_SCANNED", false);
    }

    public static boolean isStoreFeatureNotificationsEnabled(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("STORE_FEATURES_NOTIFICATIONS_ENABLED", true);
    }

    public static boolean isVuduNotificationsEnabled(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("VUDU_NOTIFICATIONS_ENABLED", true);
    }

    public static void onAuthenticationStatusChanged(Context context, AuthenticationStatusEvent authenticationstatusevent)
    {
        boolean flag;
        if (!authenticationstatusevent.loggedIn && !authenticationstatusevent.hasCredentials)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        clearStates(context, flag);
    }

    private static void saveLocalAdJsonStore(Context context, WalmartStore walmartstore)
    {
        ObjectMapper objectmapper = new ObjectMapper();
        objectmapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try
        {
            objectmapper.writeValue(context.openFileOutput("local_ad_store_json", 0), walmartstore);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static void saveLocalAdStore(Context context, WalmartStore walmartstore)
    {
        if (walmartstore == null)
        {
            return;
        } else
        {
            saveLocalAdJsonStore(context, walmartstore);
            saveLocalAdStoreInfo(new StoreInfo(walmartstore), context);
            context.sendBroadcast(new Intent("com.walmart.android.STORE_DATE_UPDATED"));
            MessageBus.getBus().post(new StoreUpdateEvent(walmartstore));
            return;
        }
    }

    private static void saveLocalAdStoreInfo(StoreInfo storeinfo, Context context)
    {
        context = context.getSharedPreferences("LOCAL_AD_PREFS", 0).edit();
        context.putString("PREF_SELECTED_STORE_ID", storeinfo.storeID);
        context.putString("PREF_SELECTED_STORE_NAME", storeinfo.storeDescription);
        context.putString("PREF_SELECTED_STORE_ADDRESS_1", storeinfo.addressLine1);
        context.putString("PREF_SELECTED_STORE_ADDRESS_2", storeinfo.addressLine2);
        context.putFloat("PREF_SELECTED_STORE_LAT", (float)storeinfo.latitude);
        context.putFloat("PREF_SELECTED_STORE_LONG", (float)storeinfo.longitude);
        context.apply();
    }

    public static boolean setAppStart(Context context)
    {
        boolean flag = false;
        context = context.getSharedPreferences("GENERAL_PREFS", 0);
        if (!context.getBoolean("PREF_APP_STARTED", false))
        {
            flag = true;
        }
        sIsFirstStart = flag;
        context = context.edit();
        context.putBoolean("PREF_APP_STARTED", true);
        context.apply();
        return sIsFirstStart;
    }

    public static void setClearCacheUUID(Context context, String s)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putString("PREF_CLEAR_CACHE", s);
        context.apply();
    }

    public static void setEReceiptNotificationsEnabled(Context context, boolean flag)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("STORE_ERECEIPT_NOTIFICATIONS_ENABLED", flag);
        context.apply();
    }

    public static void setEReceiptPhoneNumber(Context context, String s)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putLong("PREF_ERECEIPT_PHONE_NUMBER_TIMESTAMP", System.currentTimeMillis()).putString("PREF_ERECEIPT_PHONE_NUMBER", s).apply();
    }

    public static void setFastPickupNotificationStatus(Context context, String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            context.getSharedPreferences("PREF_FAST_PICKUP_NOTIFICATION_STATUS", 0).edit().putString(s, s1).apply();
            WLog.d(TAG, (new StringBuilder()).append("setFastPickupNotificationStatus() storeId=").append(s).append(" hash=").append(s1).toString());
            return;
        }
    }

    public static void setHasClearedAdXUdid(Context context)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putBoolean("PREF_HAS_CLEARED_ADX_UDID", true).apply();
    }

    public static void setHasClearedWebViewFormData(Context context)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putBoolean("PREF_HAS_CLEARED_WEBVIEW_FORM_DATA", true).apply();
    }

    public static void setHasShownAdPageInstruction(Context context)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("PREF_SHOWN_AD_INSTRUCTION", true);
        context.apply();
    }

    public static void setHasShownAdZoomInstruction(Context context)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("PREF_SHOWN_AD_ZOOM_INSTRUCTION", true);
        context.apply();
    }

    public static void setHasShownNoAutoFocusDialog(Context context)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("PREF_SHOWN_NO_AUTOFOCUS", true);
        context.apply();
    }

    public static void setHasShownRateAppDialog(Context context)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("PREF_SHOWN_RATE_APP", true);
        context.apply();
    }

    public static void setHomeImageTarget(String s, Context context)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putString("PREF_HOME_IMAGE_TARGET", s);
        context.apply();
    }

    public static void setHomeImageUrl(String s, Context context)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putString("PREF_HOME_IMAGE_URL", s);
        context.apply();
    }

    public static void setInitialBannerAspectRatio(float f, Context context)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putFloat("PREF_INITIAL_BANNER_ASPECT_RATIO", f);
        context.apply();
    }

    public static void setNagged(String s, Context context)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putString("PREF_UPDATE_NAG", s);
        context.apply();
    }

    public static void setNoOfLaunches(Context context, int i)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putInt("PREF_NO_OF_LAUNCHES", i).apply();
    }

    public static void setPromotionNotificationsEnabled(Context context, boolean flag)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("PUSH_ENABLED", flag);
        context.apply();
    }

    public static void setSaverAmountRedeemed(Context context, int i, int j, int k)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putLong("PREF_SAVER_AMOUNT_REDEEMED_TIMESTAMP", System.currentTimeMillis()).putInt("PREF_SAVER_AMOUNT_PREVIOUS_TOTAL", i).putInt("PREF_SAVER_AMOUNT_REDEEMED_CREDIT", j).putInt("PREF_SAVER_AMOUNT_REDEEMED_BLUEBIRD", k).apply();
    }

    public static void setSaverNotificationsEnabled(Context context, boolean flag)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("STORE_SAVER_NOTIFICATIONS_ENABLED", flag);
        context.commit();
    }

    public static void setSaverReceiptScanned(Context context, boolean flag)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putBoolean("PREF_SAVER_RECEIPT_SCANNED", flag).commit();
    }

    public static void setSaverShowCelebration(Context context, boolean flag)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putBoolean("PREF_SAVER_SHOW_CELEBRATION", flag).commit();
    }

    public static void setShippingPassPendingRefresh(Context context, boolean flag)
    {
        WLog.d(TAG, (new StringBuilder()).append("setShippingPassPendingRefresh(): ").append(flag).toString());
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putBoolean("PREF_SHIPPING_PASS_PENDING_REFRESH", flag).apply();
    }

    public static void setShouldTrackWithGA(Context context, int i)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putInt("PREF_TRACK_GA", i);
        context.apply();
    }

    public static void setShowRateAppDialog(Context context, boolean flag)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("PREF_SHOW_RATE_APP", flag);
        context.apply();
    }

    public static void setStoreFeatureNotificationsEnabled(Context context, boolean flag)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("STORE_FEATURES_NOTIFICATIONS_ENABLED", flag);
        context.apply();
    }

    public static void setVuduNotificationsEnabled(Context context, boolean flag)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0).edit();
        context.putBoolean("VUDU_NOTIFICATIONS_ENABLED", flag);
        context.apply();
    }

    public static void setWishListIntroShown(Context context, boolean flag)
    {
        WLog.d(TAG, (new StringBuilder()).append("setWishListIntroShown(): ").append(flag).toString());
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putBoolean("PREF_WISHLIST_INTRO_SHOWN", flag).apply();
    }

    public static boolean shouldShowOnboarding(Context context, int i)
    {
        context = context.getSharedPreferences("GENERAL_PREFS", 0);
        for (int j = context.getInt("PREF_ONBOARDING_VERSION_CODE", -1); i == j || i <= j;)
        {
            return false;
        }

        context.edit().putInt("PREF_ONBOARDING_VERSION_CODE", i).apply();
        return true;
    }

    public static boolean shouldShowRateAppDialog(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_SHOW_RATE_APP", false);
    }

    public static boolean shouldShowSaverCelebration(Context context)
    {
        return context.getSharedPreferences("GENERAL_PREFS", 0).getBoolean("PREF_SAVER_SHOW_CELEBRATION", true);
    }

    public static void updateInstallationId(Context context, String s)
    {
        context.getSharedPreferences("GENERAL_PREFS", 0).edit().putString("INSTALLATION_ID", s).apply();
    }

}
