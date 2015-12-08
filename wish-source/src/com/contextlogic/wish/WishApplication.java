// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.android.adm.AmazonDeviceMessaging;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.GetLoggedOutExperimentsService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.api.service.PushDeregistrationService;
import com.contextlogic.wish.api.service.PushRegistrationService;
import com.contextlogic.wish.api.service.ServerPingService;
import com.contextlogic.wish.api.service.manager.FacebookFriendInfoServiceManager;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.http.WishHttpClient;
import com.contextlogic.wish.prompt.PromptManager;
import com.contextlogic.wish.push.LocalNotificationAlarmReceiver;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.AddressUtil;
import com.contextlogic.wish.util.PreferencesUtil;
import com.contextlogic.wish.util.StateSerializer;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.samsung.android.sdk.richnotification.Srn;
import com.samsung.android.sdk.richnotification.SrnRichNotificationManager;
import com.seppius.i18n.plurals.PluralResources;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.contextlogic.wish:
//            ApplicationDeepLinkConfig

public class WishApplication extends Application
{

    private static final long FOREGROUND_TEST_INTERVAL = 5000L;
    private static boolean IS_PLAY_SERVICES_AVAILABLE = false;
    public static final long WISH_SESSION_EXPIRES = 0x1ee62800L;
    private static WishApplication _instance;
    private int activityVisible;
    private LocalNotificationAlarmReceiver alarm;
    private ApplicationDeepLinkConfig deepLinkConfig;
    private float displayDensity;
    private boolean firstBackgroundCheckComplete;
    private Runnable foregroundTestRunnable;
    private Handler handler;
    private boolean inBackground;
    private PluralResources pluralResources;
    private String pushToken;
    private SrnRichNotificationManager samsungNotificationManager;

    public WishApplication()
    {
        activityVisible = 0;
    }

    public static WishApplication getAppInstance()
    {
        return _instance;
    }

    private boolean inForegroundInternal()
    {
        boolean flag = false;
        Object obj = ((ActivityManager)getSystemService("activity")).getRunningAppProcesses();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
                if (runningappprocessinfo != null && runningappprocessinfo.importance == 100 && getPackageName().equals(runningappprocessinfo.processName))
                {
                    flag = true;
                }
            } while (true);
            if (inBackground)
            {
                if (activityVisible > 0 && flag)
                {
                    return true;
                }
            } else
            {
                return flag;
            }
        }
        return false;
    }

    private void initializeForegroundTester()
    {
        handler = new Handler();
        foregroundTestRunnable = new Runnable() {

            final WishApplication this$0;

            public void run()
            {
                performForegroundCheck();
            }

            
            {
                this$0 = WishApplication.this;
                super();
            }
        };
        handler.postDelayed(foregroundTestRunnable, 5000L);
        alarm = new LocalNotificationAlarmReceiver();
    }

    private void initializePush()
    {
        (new AsyncTask() {

            final WishApplication this$0;

            protected transient Boolean doInBackground(Void avoid[])
            {
                boolean flag;
                flag = false;
                avoid = null;
                if (!WishApplication.isPlayServicesAvailable()) goto _L2; else goto _L1
_L1:
                avoid = GoogleCloudMessaging.getInstance(WishApplication.getAppInstance()).register(new String[] {
                    getString(0x7f0604ce)
                });
_L4:
                WishApplication.getAppInstance().setPushToken(avoid);
                if (!LoggedInUser.getInstance().isLoggedIn() || avoid == null)
                {
                    break MISSING_BLOCK_LABEL_85;
                }
                if (WishApi.getInstance().getConfig().hasSessionCookie())
                {
                    (new PushRegistrationService()).requestService(avoid, null, null);
                    UserPreferences.setPushToken(avoid);
                }
                flag = true;
_L5:
                return Boolean.valueOf(flag);
_L2:
                if (!WishApplication.getAppInstance().isAmazonBuild()) goto _L4; else goto _L3
_L3:
                avoid = AmazonDeviceMessaging.getInstance(WishApplication.getAppInstance()).register(new String[] {
                    getString(0x7f0604b7)
                });
                  goto _L4
                avoid;
                  goto _L5
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            
            {
                this$0 = WishApplication.this;
                super();
            }
        }).execute(new Void[] {
            null, null, null
        });
    }

    private void initializeServices()
    {
        Fabric.with(this, new Kit[] {
            new Crashlytics()
        });
        try
        {
            (new Srn()).initialize(this);
            samsungNotificationManager = new SrnRichNotificationManager(this);
            samsungNotificationManager.start();
            return;
        }
        catch (Throwable throwable)
        {
            samsungNotificationManager = null;
        }
    }

    private void initializeSingletons()
    {
        try
        {
            Class.forName("android.os.AsyncTask");
        }
        catch (ClassNotFoundException classnotfoundexception) { }
        WishHttpClient.getInstance();
        ApiDataChangeNotificationManager.getInstance();
        UserStatusManager.getInstance();
        try
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            ((WindowManager)getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
            displayDensity = displaymetrics.density;
            return;
        }
        catch (Throwable throwable)
        {
            displayDensity = 1.0F;
        }
    }

    private boolean isActivityProcess()
    {
        boolean flag1 = false;
        Iterator iterator;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            iterator = ((ActivityManager)getSystemService("activity")).getRunningAppProcesses().iterator();
        }
        catch (Throwable throwable)
        {
            return false;
        }
        flag = flag1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
        if (runningappprocessinfo.pid != Process.myPid())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = getPackageName().equals(runningappprocessinfo.processName);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_21;
_L1:
        return flag;
    }

    public static boolean isPlayServicesAvailable()
    {
        return IS_PLAY_SERVICES_AVAILABLE;
    }

    private void markAppVersion()
    {
        String s2 = getVersionNumber();
        String s1 = UserPreferences.getInstalledAppVersion();
        String s = s1;
        if (s1 == null)
        {
            s = UserPreferences.getPreferences().getString("PromptInstalledAppVersion", null);
        }
        if (s == null || !s.equals(s2))
        {
            if (s != null)
            {
                UserPreferences.setForceRelogin(true);
                UserPreferences.setLastInstalledAppVersion(s);
                UserPreferences.setServerAdvertisingPingSent(true);
            }
            UserPreferences.setInstalledAppVersion(s2);
        }
    }

    private void performForegroundCheck()
    {
        boolean flag;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag = false;
        flag3 = inForegroundInternal();
        if (!flag3) goto _L2; else goto _L1
_L1:
        if (LoggedInUser.getInstance().isLoggedIn())
        {
            UserStatusManager.getInstance().startStatusRefresh();
            alarm.cancelAlarm(this);
        }
        if (inBackground || !firstBackgroundCheckComplete)
        {
            FacebookManager.getInstance().activateApp(this);
            clearAllLocalNotifications();
        }
        if (!flag3)
        {
            flag = true;
        }
        inBackground = flag;
_L4:
        firstBackgroundCheckComplete = true;
        handler.postDelayed(foregroundTestRunnable, 5000L);
        return;
_L2:
        if (!flag3 && !inBackground)
        {
            boolean flag1 = flag2;
            if (!flag3)
            {
                flag1 = true;
            }
            inBackground = flag1;
            UserStatusManager.getInstance().stopStatusRefresh();
            alarm.informBackground(this);
            FacebookManager.getInstance().deactivateApp(this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void sendServerPing()
    {
        if (!UserPreferences.getServerPingSent())
        {
            UserPreferences.setServerPingSent(true);
            (new ServerPingService()).requestService(null, null, null, null);
        }
        if (!UserPreferences.getServerAdvertisingPingSent())
        {
            UserPreferences.setServerAdvertisingPingSent(true);
            (new Thread(new Runnable() {

                final WishApplication this$0;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(WishApplication.getAppInstance());
                        String s = info.getId();
                        if (!info.isLimitAdTrackingEnabled())
                        {
                            (new ServerPingService()).requestService(null, s, null, null);
                        }
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        return;
                    }
                }

            
            {
                this$0 = WishApplication.this;
                super();
            }
            })).start();
        }
    }

    private void setupLoggedOutExperiments()
    {
        if (UserPreferences.getLastLoggedInUserId() == null)
        {
            (new GetLoggedOutExperimentsService()).requestService(new com.contextlogic.wish.api.service.GetLoggedOutExperimentsService.SuccessCallback() {

                final WishApplication this$0;

                public void onServiceSucceeded(HashMap hashmap)
                {
                    java.util.Map.Entry entry;
                    for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); UserPreferences.setExperimentOverride((String)entry.getKey(), (String)entry.getValue()))
                    {
                        entry = (java.util.Map.Entry)hashmap.next();
                    }

                }

            
            {
                this$0 = WishApplication.this;
                super();
            }
            }, null);
        }
    }

    public void activityPaused()
    {
        activityVisible = activityVisible - 1;
        if (handler != null)
        {
            handler.post(new Runnable() {

                final WishApplication this$0;

                public void run()
                {
                    performForegroundCheck();
                }

            
            {
                this$0 = WishApplication.this;
                super();
            }
            });
        }
    }

    public void activityResumed()
    {
        activityVisible = activityVisible + 1;
        if (handler != null)
        {
            handler.post(new Runnable() {

                final WishApplication this$0;

                public void run()
                {
                    performForegroundCheck();
                }

            
            {
                this$0 = WishApplication.this;
                super();
            }
            });
        }
    }

    public void clearAllLocalNotifications()
    {
        SharedPreferences sharedpreferences = UserPreferences.getPreferences();
        NotificationManager notificationmanager = (NotificationManager)getSystemService("notification");
        for (Iterator iterator = PreferencesUtil.getIntegerArray(sharedpreferences, "LocalNotificationIds").iterator(); iterator.hasNext(); notificationmanager.cancel(((Integer)iterator.next()).intValue())) { }
        sharedpreferences.edit().remove("LocalNotificationIds").commit();
    }

    public void clearAllNotifications()
    {
        ((NotificationManager)getSystemService("notification")).cancelAll();
        UserPreferences.getPreferences().edit().remove("push-notification-ids").commit();
    }

    public void clearAllPushNotifications()
    {
        SharedPreferences sharedpreferences = UserPreferences.getPreferences();
        NotificationManager notificationmanager = (NotificationManager)getSystemService("notification");
        for (Iterator iterator = PreferencesUtil.getIntegerArray(sharedpreferences, "push-notification-ids").iterator(); iterator.hasNext(); notificationmanager.cancel(((Integer)iterator.next()).intValue())) { }
        sharedpreferences.edit().remove("push-notification-ids").commit();
    }

    public Uri getAmazonUri(Activity activity)
    {
        return Uri.parse((new StringBuilder()).append("https://www.amazon.com/gp/mas/dl/android?p=").append(activity.getPackageName()).append("&ref=mas_pm_wish_shopping_made_fun").toString());
    }

    public String getAppName()
    {
        return getString(0x7f0604b9);
    }

    public String getAppType()
    {
        return getString(0x7f0604ba);
    }

    public String getClient()
    {
        return getString(0x7f0604c0);
    }

    public ApplicationDeepLinkConfig getDeepLinkConfig()
    {
        return deepLinkConfig;
    }

    public float getDisplayDensity()
    {
        return displayDensity;
    }

    public Uri getPlayUri(Activity activity)
    {
        return Uri.parse((new StringBuilder()).append("market://details?id=").append(activity.getPackageName()).toString());
    }

    public String getQuantityString(int i, int j)
    {
        return getQuantityString(i, j, (Object[])null);
    }

    public transient String getQuantityString(int i, int j, Object aobj[])
    {
        if (pluralResources == null)
        {
            try
            {
                pluralResources = new PluralResources(getResources());
            }
            catch (SecurityException securityexception) { }
            catch (NoSuchMethodException nosuchmethodexception) { }
        }
        if (pluralResources == null)
        {
            if (aobj == null)
            {
                return getResources().getQuantityString(i, j);
            } else
            {
                return getResources().getQuantityString(i, j, aobj);
            }
        }
        if (aobj == null)
        {
            return pluralResources.getQuantityString(i, j);
        } else
        {
            return pluralResources.getQuantityString(i, j, aobj);
        }
    }

    public SrnRichNotificationManager getSamsungNotificationManager()
    {
        return samsungNotificationManager;
    }

    public String getVersionNumber()
    {
        String s;
        try
        {
            s = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return null;
        }
        return s;
    }

    public void goToMarketListing(Activity activity)
    {
        Object obj;
        if (isAmazonBuild())
        {
            obj = getAmazonUri(activity);
        } else
        {
            obj = getPlayUri(activity);
        }
        obj = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
        try
        {
            activity.startActivity(((Intent) (obj)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            PopupAlertDialog.showError(activity, activity.getString(0x7f06030d), activity.getString(0x7f06021a));
        }
    }

    public boolean inForeground()
    {
        return !inBackground;
    }

    public boolean isAmazonBuild()
    {
        return false;
    }

    public boolean isDeveloperBuild()
    {
        return false;
    }

    public boolean isGooglePlusBuild()
    {
        return false;
    }

    public boolean isScreenshotBuild()
    {
        return false;
    }

    public boolean isTestingBuild()
    {
        return false;
    }

    public boolean isVisaBuild()
    {
        return false;
    }

    public boolean isWishApp()
    {
        return getAppType().equals("wish");
    }

    public boolean isWishSessionValid()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (LoggedInUser.getInstance().getLoginTime() > 0L)
        {
            flag = flag1;
            if (System.currentTimeMillis() - LoggedInUser.getInstance().getLoginTime() < 0x1ee62800L)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void login(Activity activity, boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
    {
        if (UserPreferences.getLastLoggedInUserId() == null)
        {
            Object obj = new LogService();
            boolean flag1;
            if (flag)
            {
                ((LogService) (obj)).requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_SIGNUP_NOT_FROM_WISH_NOTIFICATION.getValue()), null, null, null);
            } else
            {
                ((LogService) (obj)).requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_LOGIN_NOT_FROM_WISH_NOTIFICATION.getValue()), null, null, null);
            }
        }
        UserPreferences.setReferrerLoginSent(true);
        flag1 = false;
        obj = UserPreferences.getLastLoggedInUserId();
        if (obj == null || !LoggedInUser.getInstance().getCurrentUser().getUserId().equals(obj))
        {
            flag1 = true;
        }
        UserPreferences.setLastLoggedInUserId(LoggedInUser.getInstance().getCurrentUser().getUserId());
        if (flag1 && !flag)
        {
            PromptManager.getInstance().deactivateNewUserPrompts();
        }
        obj = new Intent();
        if (flag1)
        {
            ((Intent) (obj)).setAction("NewAppUser");
        }
        ((Intent) (obj)).putExtra("NewWishUser", flag);
        ((Intent) (obj)).putExtra("ArgSignupFlow", wishsignupflow);
        ((Intent) (obj)).setClass(activity, com/contextlogic/wish/ui/activity/root/RootActivity);
        activity.startActivity(((Intent) (obj)));
        (new FacebookFriendInfoServiceManager()).fetchFriendInfo(null);
        UserStatusManager.getInstance().startStatusRefresh();
        Crashlytics.setUserIdentifier(LoggedInUser.getInstance().getCurrentUser().getUserId());
        if (pushToken != null)
        {
            (new PushRegistrationService()).requestService(pushToken, null, null);
            UserPreferences.setPushToken(pushToken);
            return;
        } else
        {
            initializePush();
            return;
        }
    }

    public void logout(Activity activity, boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag5 = false;
        Intent intent;
        boolean flag3;
        boolean flag4;
        if (!flag)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (!flag)
        {
            flag5 = true;
        }
        resetUserData(true, flag3, flag2, flag4, flag5);
        UserStatusManager.getInstance().stopStatusRefresh();
        intent = new Intent();
        intent.setFlags(0x4000000);
        if (flag1)
        {
            intent.putExtra("SkipAutoLogin", true);
            intent.putExtra("ShowLogoutError", true);
        }
        intent.setClass(activity, com/contextlogic/wish/ui/activity/login/LoginActivity);
        activity.startActivity(intent);
    }

    public void onCreate()
    {
        super.onCreate();
        _instance = this;
        boolean flag;
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getApplicationContext()) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_PLAY_SERVICES_AVAILABLE = flag;
        initializeSingletons();
        markAppVersion();
        if (isActivityProcess())
        {
            initializePush();
            initializeServices();
            initializeForegroundTester();
            sendServerPing();
            setupLoggedOutExperiments();
            AddressUtil.initializeWithContext(this);
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        TransientCache.getInstance().clearCache();
    }

    public void resetUserData(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4)
    {
        if (flag && WishApi.getInstance().getConfig().hasSessionCookie())
        {
            String s = UserPreferences.getPushToken();
            if (s != null)
            {
                (new PushDeregistrationService()).requestService(UserPreferences.getLastLoggedInUserId(), s, null, null);
            }
            UserPreferences.setPushToken(null);
        }
        if (flag)
        {
            WishApi.getInstance().getConfig().clearSessionCookies();
            LoggedInUser.getInstance().logout(flag2);
            TransientCache.getInstance().clearCache();
            UserStatusManager.getInstance().resetCounts(flag2);
            UserPreferences.setSignupFlowSeen(false);
        }
        if (flag4)
        {
            UserPreferences.setLoginPassword(null);
        }
        if (flag2)
        {
            StateSerializer.getInstance().deleteAllSerializedState();
        }
        if (flag1)
        {
            UserPreferences.setFbAccessToken(null);
            UserPreferences.setFbExpires(-1L);
            UserPreferences.setFbId(null);
            FacebookManager.getInstance().logout();
        }
        if (flag3)
        {
            UserPreferences.setGooglePlusId(null);
            GooglePlusManager.getInstance().logout();
        }
    }

    public void setDeepLinkConfig(ApplicationDeepLinkConfig applicationdeeplinkconfig)
    {
        deepLinkConfig = applicationdeeplinkconfig;
    }

    public void setPushToken(String s)
    {
        pushToken = s;
    }

}
