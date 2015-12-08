// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.user;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.util.PreferencesUtil;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class UserPreferences
{

    private static final String ADMIN_LOGIN_CODE = "AdminLoginCode";
    private static final String ADVERTISING_PING_SENT_KEY = "ServerAdvertisingPingSent";
    private static final String API_COUNTRY_CODE = "DevSettingsCountryCode";
    private static final String API_ROOT_PATH_KEY = "DevSettingsServerPath";
    private static final String APP_FOREGROUND_COUNT_KEY = "app_foreground_count";
    private static final String APP_REFERRER_KEY = "AppReferrer";
    private static final String BROWSE_MENU_INDEX_KEY = "BrowseMenuIndex";
    private static final String CHECKED_FOR_GOOGLE_PLUS_KEY = "checked_for_google_plus";
    private static final String DEVICE_UUID_KEY = "DeviceUUID";
    private static final String DISCOUNT_VALUE_PROP_SEEN_KEY = "DiscountValuePropSeenKey";
    private static final String DISLIKE_DIALOG_SEEN_KEY = "DislikeDialogSeen";
    private static final String EXPERIMENT_OVERRIDE_KEY_PREFIX = "ExperimentOverride-";
    private static final String FB_ACCESS_TOKEN_KEY = "fb_access_token";
    private static final String FB_DEV_MODE_KEY = "DevSettingsUseDevFbApp";
    private static final String FB_EXPIRES_KEY = "fb_access_expires";
    private static final String FB_ID_KEY = "fb_user_id";
    private static final String FB_PERMISSION_LEVEL = "fb_permission_level";
    private static final String FB_PUBLISH_PERMISSIONS_REQUESTED_KEY = "fb_publish_permissions_requested";
    private static final String FEED_BADGE_OVERLAY_SEEN_KEY = "FeedBadgeOverlaySeen";
    private static final String FEED_SIDE_NAV_OVERLAY_SEEN_KEY = "FeedSideNavOverlaySeen";
    private static final String FIRST_LAUNCH_IMPRESSION_SENT_KEY = "FirstLaunchImpressionSent";
    private static final String FORCE_RELOGIN_KEY = "ForceRelogin";
    private static final String GOOGLE_PLUS_ID_KEY = "google_plus_user_id";
    private static final String INSTALLED_APP_VERSION_KEY = "InstalledAppVersion";
    private static final String LANDING_PAGE_COUNT_KEY = "LandingPageCount";
    private static final String LAST_BIRTHDAY_CHECK_KEY = "LastBirthdayCheckTime";
    private static final String LAST_FOREGROUND_TIME_KEY = "LastForegroundTime";
    private static final String LAST_INSTALLED_APP_VERSION_KEY = "LastInstalledAppVersion";
    private static final String LAST_LANDING_PAGE_KEY = "LastLandingPage";
    private static final String LAST_LANDING_PAGE_TIME_KEY = "LastLandingPageTime";
    private static final String LAST_LOCAL_NOTIFICATION_SENT = "lastLocalNotificationSent";
    private static final String LAST_LOGGED_IN_USER_IMAGE_KEY = "LoggedInUserImage";
    private static final String LAST_LOGGED_IN_USER_KEY = "LoggedInUser";
    private static final String LAST_LOGGED_IN_USER_NAME_KEY = "LoggedInUserName";
    private static final String LIST_EDITING_OVERLAY_SEEN_KEY = "ListEditingOverlaySeen";
    private static final String LIST_EDITING_TOUR_SEEN_KEY = "ListEditingTourSeen";
    private static final String LOCAL_NOTIFICATION_ID_KEY = "local_notification_id";
    public static final String LOGIN_MODE_EMAIL = "LoginModeEmail";
    public static final String LOGIN_MODE_EMAIL_SIGNUP = "LoginModeEmailSignup";
    public static final String LOGIN_MODE_FB = "LoginModeFB";
    public static final String LOGIN_MODE_GOOGLE_PLUS = "LoginModeGooglePlus";
    private static final String LOGIN_MODE_KEY = "login_mode";
    private static final String NEXT_LANDING_PAGE_EXPIRY_KEY = "LastLandingPageExpiry";
    private static final String NEXT_LANDING_PAGE_KEY = "NextLandingPage";
    public static final String PAYMENT_MODE_BOLETO = "PaymentModeBoleto";
    public static final String PAYMENT_MODE_CC = "PaymentModeCC";
    public static final String PAYMENT_MODE_GOOGLE = "PaymentModeGoogle";
    private static final String PAYMENT_MODE_KEY = "payment_mode";
    public static final String PAYMENT_MODE_KLARNA = "PaymentModeKlarna";
    public static final String PAYMENT_MODE_OXXO = "PaymentModeOxxo";
    public static final String PAYMENT_MODE_PAYPAL = "PaymentModePayPal";
    private static final String PING_SENT_KEY = "ServerPingSent";
    private static final String PREFS_FILE_NAME = "WishPref";
    private static final String PUSH_TOKEN_KEY = "PushToken";
    private static final String REFERRER_LOGIN_SENT_KEY = "ReferrerLoginSent";
    private static final String SEARCH_HISTORY_KEY = "WishSearchHistory";
    private static final String SIGNUP_FLOW_SEEN_KEY = "SignupFlowSeen";
    private static final String SIGNUP_OVERLAY_SEEN_KEY = "SignupOverlaySeen";
    private static final String SORT_MODE_KEY = "browse_products_sort_mode";
    private static final String TESTING_FORCED_CURRENCY_KEY = "TestingForcedCurrency";
    private static final String USER_AGENT_KEY = "UserAgentKey";
    private static final String USER_LOGIN_EMAIL_KEY = "user_login_email";
    private static final String USER_LOGIN_PASSWORD_KEY = "user_login_password";
    private static byte _secureKey[] = generateSecureKey();

    public UserPreferences()
    {
    }

    private static byte[] decode(String s)
    {
        return Base64.decode(s, 3);
    }

    private static String decrypt(String s)
    {
        if (s == null || s.length() == 0)
        {
            return s;
        }
        try
        {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, new SecretKeySpec(_secureKey, "AES"));
            s = new String(cipher.doFinal(decode(s)), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private static String encode(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 3);
    }

    private static String encrypt(String s)
    {
        if (s == null || s.length() == 0)
        {
            return s;
        }
        try
        {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(1, new SecretKeySpec(_secureKey, "AES"));
            s = encode(cipher.doFinal(s.getBytes("UTF-8")));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private static String generateAesKeyName(Context context)
        throws InvalidKeySpecException, NoSuchAlgorithmException
    {
        char ac[] = context.getPackageName().toCharArray();
        String s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        context = s;
        if (s == null)
        {
            context = "9774d56d682e549c";
        }
        context = new PBEKeySpec(ac, context.getBytes(), 1000, 256);
        return encode(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(context).getEncoded());
    }

    private static String generateAesKeyValue()
        throws NoSuchAlgorithmException
    {
        SecureRandom securerandom = new SecureRandom();
        KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
        try
        {
            keygenerator.init(256, securerandom);
        }
        catch (Exception exception)
        {
            try
            {
                keygenerator.init(192, securerandom);
            }
            catch (Exception exception1)
            {
                keygenerator.init(128, securerandom);
            }
        }
        return encode(keygenerator.generateKey().getEncoded());
    }

    private static byte[] generateSecureKey()
    {
        String s;
        byte abyte0[];
        String s1;
        String s2;
        try
        {
            s2 = generateAesKeyName(WishApplication.getAppInstance());
            s1 = getPreferences().getString(s2, null);
        }
        catch (Throwable throwable)
        {
            return (new byte[] {
                0, 1, 2, 3, 4
            });
        }
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        s = generateAesKeyValue();
        getPreferences().edit().putString(s2, s).commit();
        abyte0 = decode(s);
        return abyte0;
    }

    public static String getAdminLoginCode()
    {
        return getSecureString("AdminLoginCode");
    }

    public static String getApiCountryCode()
    {
        return getPreferences().getString("DevSettingsCountryCode", null);
    }

    public static String getApiRootPath()
    {
        return getPreferences().getString("DevSettingsServerPath", null);
    }

    public static long getAppForegroundCount()
    {
        return getPreferences().getLong("app_foreground_count", 0L);
    }

    public static String getAppReferrer()
    {
        return getPreferences().getString("AppReferrer", null);
    }

    public static int getBrowseMenuIndex()
    {
        return getPreferences().getInt("BrowseMenuIndex", -1);
    }

    public static String getDeviceUuid()
    {
        return getPreferences().getString("DeviceUUID", null);
    }

    public static boolean getDiscountValuePropSeen()
    {
        return getPreferences().getBoolean("DiscountValuePropSeenKey", false);
    }

    public static boolean getDislikeDialogSeen()
    {
        return getPreferences().getBoolean("DislikeDialogSeen", false);
    }

    public static String getExperimentOverride(String s)
    {
        if (WishApplication.getAppInstance().isGooglePlusBuild())
        {
            if (s.equals("mobile_google_checkout"))
            {
                return "show";
            } else
            {
                return getPreferences().getString((new StringBuilder()).append("ExperimentOverride-").append(s).toString(), null);
            }
        } else
        {
            return getPreferences().getString((new StringBuilder()).append("ExperimentOverride-").append(s).toString(), null);
        }
    }

    public static String getFbAccessToken()
    {
        return getPreferences().getString("fb_access_token", null);
    }

    public static long getFbExpires()
    {
        return getPreferences().getLong("fb_access_expires", -1L);
    }

    public static String getFbId()
    {
        return getPreferences().getString("fb_user_id", null);
    }

    public static int getFbPermissionLevel()
    {
        return getPreferences().getInt("fb_permission_level", 0);
    }

    public static boolean getFbPublishPermissionsRequested()
    {
        return getPreferences().getBoolean("fb_publish_permissions_requested", false);
    }

    public static boolean getFeedBadgeOverlaySeen()
    {
        return getPreferences().getBoolean("FeedBadgeOverlaySeen", false);
    }

    public static boolean getFeedSideNavOverlaySeen()
    {
        return getPreferences().getBoolean("FeedSideNavOverlaySeen", false);
    }

    public static boolean getFirstLaunchImpressionSent()
    {
        return getPreferences().getBoolean("FirstLaunchImpressionSent", false);
    }

    public static boolean getForceRelogin()
    {
        return getPreferences().getBoolean("ForceRelogin", false);
    }

    public static boolean getGooglePlusChecked()
    {
        return getPreferences().getBoolean("checked_for_google_plus", false);
    }

    public static String getGooglePlusId()
    {
        return getPreferences().getString("google_plus_user_id", null);
    }

    public static String getInstalledAppVersion()
    {
        return getPreferences().getString("InstalledAppVersion", null);
    }

    public static int getLandingPageCount()
    {
        return getPreferences().getInt("LandingPageCount", 0);
    }

    public static long getLastBirthdayCheckTime()
    {
        return getPreferences().getLong("LastBirthdayCheckTime", System.currentTimeMillis() - 0x240c8400L);
    }

    public static long getLastForegroundTime()
    {
        return getPreferences().getLong("LastForegroundTime", 0L);
    }

    public static String getLastInstalledAppVersion()
    {
        return getPreferences().getString("LastInstalledAppVersion", null);
    }

    public static String getLastLandingPage()
    {
        return getPreferences().getString("LastLandingPage", null);
    }

    public static long getLastLandingPageTime()
    {
        return getPreferences().getLong("LastLandingPageTime", 0L);
    }

    public static long getLastLocalNotificationSent()
    {
        return getPreferences().getLong("lastLocalNotificationSent", 0L);
    }

    public static String getLastLoggedInUserId()
    {
        return getPreferences().getString("LoggedInUser", null);
    }

    public static String getLastLoggedInUserImage()
    {
        return getPreferences().getString("LoggedInUserImage", null);
    }

    public static String getLastLoggedInUserName()
    {
        return getPreferences().getString("LoggedInUserName", null);
    }

    public static boolean getListEditingOverlaySeen()
    {
        return getPreferences().getBoolean("ListEditingOverlaySeen", false);
    }

    public static boolean getListEditingTourSeen()
    {
        return getPreferences().getBoolean("ListEditingTourSeen", false);
    }

    public static String getLoginEmail()
    {
        return getSecureString("user_login_email");
    }

    public static String getLoginMode()
    {
        return getPreferences().getString("login_mode", "LoginModeFB");
    }

    public static String getLoginPassword()
    {
        return getSecureString("user_login_password");
    }

    public static String getNextLandingPage()
    {
        return getPreferences().getString("NextLandingPage", null);
    }

    public static long getNextLandingPageExpiry()
    {
        return getPreferences().getLong("LastLandingPageExpiry", 0L);
    }

    public static SharedPreferences getPreferences()
    {
        return WishApplication.getAppInstance().getSharedPreferences("WishPref", 0);
    }

    public static SharedPreferences getPreferences(Context context)
    {
        return context.getSharedPreferences("WishPref", 0);
    }

    public static String getPreferredPaymentMode()
    {
        return getPreferences().getString("payment_mode", "PaymentModeCC");
    }

    public static int getPreferredSortMode()
    {
        return getPreferences().getInt("browse_products_sort_mode", 0);
    }

    public static String getPushToken()
    {
        return getPreferences().getString("PushToken", null);
    }

    public static boolean getReferrerLoginSent()
    {
        return getPreferences().getBoolean("ReferrerLoginSent", false);
    }

    public static ArrayList getSearchHistory()
    {
        return PreferencesUtil.getStringArray(getPreferences(), "WishSearchHistory");
    }

    private static String getSecureString(String s)
    {
        return getSecureString(s, null);
    }

    private static String getSecureString(String s, String s1)
    {
        s = getPreferences().getString(encrypt(s), null);
        if (s != null)
        {
            s1 = decrypt(s);
        }
        return s1;
    }

    public static boolean getServerAdvertisingPingSent()
    {
        return getPreferences().getBoolean("ServerAdvertisingPingSent", false);
    }

    public static boolean getServerPingSent()
    {
        return getPreferences().getBoolean("ServerPingSent", false);
    }

    public static boolean getSignupFlowSeen()
    {
        return getPreferences().getBoolean("SignupFlowSeen", false);
    }

    public static boolean getSignupOverlaySeen()
    {
        return getPreferences().getBoolean("SignupOverlaySeen", false);
    }

    private static ArrayList getStoredNotificationIds()
    {
        return PreferencesUtil.getStringArray(getPreferences(), "local_notification_id");
    }

    public static String getTestingForcedCurrency()
    {
        return getPreferences().getString("TestingForcedCurrency", null);
    }

    public static boolean getUseFbDevMode()
    {
        return getPreferences().getBoolean("DevSettingsUseDevFbApp", false);
    }

    public static String getUserAgent()
    {
        return getPreferences().getString("UserAgentKey", null);
    }

    public static void markNotificationAsScheduled(String s)
    {
        ArrayList arraylist = getStoredNotificationIds();
        arraylist.add(0, s);
        for (; arraylist.size() > 5; arraylist.remove(arraylist.size() - 1)) { }
        PreferencesUtil.setStringArray(getPreferences(), "local_notification_id", arraylist);
    }

    public static boolean notificationHasBeenScheduled(String s)
    {
        return getStoredNotificationIds().contains(s);
    }

    private static void putSecureString(String s, String s1)
    {
        if (s1 == null)
        {
            getPreferences().edit().remove(encrypt(s)).commit();
            return;
        } else
        {
            getPreferences().edit().putString(encrypt(s), encrypt(s1)).commit();
            return;
        }
    }

    public static void setAdminLoginCode(String s)
    {
        putSecureString("AdminLoginCode", s);
    }

    public static void setApiCountryCode(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("DevSettingsCountryCode").commit();
            return;
        } else
        {
            getPreferences().edit().putString("DevSettingsCountryCode", s).commit();
            return;
        }
    }

    public static void setApiRootPath(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("DevSettingsServerPath").commit();
            return;
        } else
        {
            getPreferences().edit().putString("DevSettingsServerPath", s).commit();
            return;
        }
    }

    public static void setAppForegroundCount(long l)
    {
        getPreferences().edit().putLong("app_foreground_count", l).commit();
    }

    public static void setAppReferrer(Context context, String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("AppReferrer").commit();
            return;
        } else
        {
            getPreferences().edit().putString("AppReferrer", s).commit();
            return;
        }
    }

    public static void setBrowseMenuIndex(int i)
    {
        getPreferences().edit().putInt("BrowseMenuIndex", i).commit();
    }

    public static void setDeviceUuid(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("DeviceUUID").commit();
            return;
        } else
        {
            getPreferences().edit().putString("DeviceUUID", s).commit();
            return;
        }
    }

    public static void setDiscountValuePropSeen(boolean flag)
    {
        getPreferences().edit().putBoolean("DiscountValuePropSeenKey", flag).commit();
    }

    public static void setDislikeDialogSeen(boolean flag)
    {
        getPreferences().edit().putBoolean("DislikeDialogSeen", flag).commit();
    }

    public static void setExperimentOverride(String s, String s1)
    {
        if (s1 == null)
        {
            getPreferences().edit().remove((new StringBuilder()).append("ExperimentOverride-").append(s).toString()).commit();
            return;
        } else
        {
            getPreferences().edit().putString((new StringBuilder()).append("ExperimentOverride-").append(s).toString(), s1).commit();
            return;
        }
    }

    public static void setFbAccessToken(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("fb_access_token").commit();
            return;
        } else
        {
            getPreferences().edit().putString("fb_access_token", s).commit();
            return;
        }
    }

    public static void setFbExpires(long l)
    {
        getPreferences().edit().putLong("fb_access_expires", l).commit();
    }

    public static void setFbId(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("fb_user_id").commit();
            return;
        } else
        {
            getPreferences().edit().putString("fb_user_id", s).commit();
            return;
        }
    }

    public static void setFbPermissionLevel(int i)
    {
        getPreferences().edit().putInt("fb_permission_level", i).commit();
    }

    public static void setFbPublishPermissionsRequested(boolean flag)
    {
        getPreferences().edit().putBoolean("fb_publish_permissions_requested", flag).commit();
    }

    public static void setFeedBadgeOverlaySeen(boolean flag)
    {
        getPreferences().edit().putBoolean("FeedBadgeOverlaySeen", flag).commit();
    }

    public static void setFeedSideNavOverlaySeen(boolean flag)
    {
        getPreferences().edit().putBoolean("FeedSideNavOverlaySeen", flag).commit();
    }

    public static void setFirstLaunchImpressionSent(boolean flag)
    {
        getPreferences().edit().putBoolean("FirstLaunchImpressionSent", flag).commit();
    }

    public static void setForceRelogin(boolean flag)
    {
        getPreferences().edit().putBoolean("ForceRelogin", flag).commit();
    }

    public static void setGooglePlusChecked(boolean flag)
    {
        getPreferences().edit().putBoolean("checked_for_google_plus", flag).commit();
    }

    public static void setGooglePlusId(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("google_plus_user_id").commit();
            return;
        } else
        {
            getPreferences().edit().putString("google_plus_user_id", s).commit();
            return;
        }
    }

    public static void setInstalledAppVersion(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("InstalledAppVersion").commit();
            return;
        } else
        {
            getPreferences().edit().putString("InstalledAppVersion", s).commit();
            return;
        }
    }

    public static void setLandingPageCount(int i)
    {
        getPreferences().edit().putInt("LandingPageCount", i).commit();
    }

    public static void setLastBrithdayCheckTime(long l)
    {
        getPreferences().edit().putLong("LastBirthdayCheckTime", l).commit();
    }

    public static void setLastForegroundTime(long l)
    {
        getPreferences().edit().putLong("LastForegroundTime", l).commit();
    }

    public static void setLastInstalledAppVersion(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("LastInstalledAppVersion").commit();
            return;
        } else
        {
            getPreferences().edit().putString("LastInstalledAppVersion", s).commit();
            return;
        }
    }

    public static void setLastLandingPage(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("LastLandingPage").commit();
            return;
        } else
        {
            getPreferences().edit().putString("LastLandingPage", s).commit();
            return;
        }
    }

    public static void setLastLandingPageTime(long l)
    {
        getPreferences().edit().putLong("LastLandingPageTime", l).commit();
    }

    public static void setLastLocalNotificationSent(long l)
    {
        getPreferences().edit().putLong("lastLocalNotificationSent", l).commit();
    }

    public static void setLastLoggedInUserId(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("LoggedInUser").commit();
            return;
        } else
        {
            getPreferences().edit().putString("LoggedInUser", s).commit();
            return;
        }
    }

    public static void setLastLoggedInUserImage(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("LoggedInUserImage").commit();
            return;
        } else
        {
            getPreferences().edit().putString("LoggedInUserImage", s).commit();
            return;
        }
    }

    public static void setLastLoggedInUserName(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("LoggedInUserName").commit();
            return;
        } else
        {
            getPreferences().edit().putString("LoggedInUserName", s).commit();
            return;
        }
    }

    public static void setListEditingOverlaySeen(boolean flag)
    {
        getPreferences().edit().putBoolean("ListEditingOverlaySeen", flag).commit();
    }

    public static void setListEditingTourSeen(boolean flag)
    {
        getPreferences().edit().putBoolean("ListEditingTourSeen", flag).commit();
    }

    public static void setLoginEmail(String s)
    {
        putSecureString("user_login_email", s);
    }

    public static void setLoginMode(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("login_mode").commit();
            return;
        } else
        {
            getPreferences().edit().putString("login_mode", s).commit();
            return;
        }
    }

    public static void setLoginPassword(String s)
    {
        putSecureString("user_login_password", s);
    }

    public static void setNextLandingPage(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("NextLandingPage").commit();
            return;
        } else
        {
            getPreferences().edit().putString("NextLandingPage", s).commit();
            return;
        }
    }

    public static void setNextLandingPageExpiry(long l)
    {
        getPreferences().edit().putLong("LastLandingPageExpiry", l).commit();
    }

    public static void setPreferredPaymentMode(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("payment_mode").commit();
            return;
        } else
        {
            getPreferences().edit().putString("payment_mode", s).commit();
            return;
        }
    }

    public static void setPreferredSortMode(int i)
    {
        getPreferences().edit().putInt("browse_products_sort_mode", i).commit();
    }

    public static void setPushToken(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("PushToken").commit();
            return;
        } else
        {
            getPreferences().edit().putString("PushToken", s).commit();
            return;
        }
    }

    public static void setReferrerLoginSent(boolean flag)
    {
        getPreferences().edit().putBoolean("ReferrerLoginSent", flag).commit();
    }

    public static void setSearchHistory(ArrayList arraylist)
    {
        if (arraylist == null)
        {
            getPreferences().edit().remove("WishSearchHistory").commit();
            return;
        } else
        {
            PreferencesUtil.setStringArray(getPreferences(), "WishSearchHistory", arraylist);
            return;
        }
    }

    public static void setServerAdvertisingPingSent(boolean flag)
    {
        getPreferences().edit().putBoolean("ServerAdvertisingPingSent", flag).commit();
    }

    public static void setServerPingSent(boolean flag)
    {
        getPreferences().edit().putBoolean("ServerPingSent", flag).commit();
    }

    public static void setSignupFlowSeen(boolean flag)
    {
        getPreferences().edit().putBoolean("SignupFlowSeen", flag).commit();
    }

    public static void setSignupOverlaySeen(boolean flag)
    {
        getPreferences().edit().putBoolean("SignupOverlaySeen", flag).commit();
    }

    public static void setTestingForcedCurrency(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("TestingForcedCurrency").commit();
            return;
        } else
        {
            getPreferences().edit().putString("TestingForcedCurrency", s).commit();
            return;
        }
    }

    public static void setUseFbDevMode(boolean flag)
    {
        getPreferences().edit().putBoolean("DevSettingsUseDevFbApp", flag).commit();
    }

    public static void setUserAgent(String s)
    {
        if (s == null)
        {
            getPreferences().edit().remove("UserAgentKey").commit();
            return;
        } else
        {
            getPreferences().edit().putString("UserAgentKey", s).commit();
            return;
        }
    }

}
