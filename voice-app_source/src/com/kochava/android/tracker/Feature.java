// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.kochava.android.util.Logging;
import com.kochava.android.util.StringUtils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            Global, DbAdapter, WebAdView, ReferralCapture

public class Feature
{
    protected static class AppLifeCycleStatusManager
    {

        protected static final String IS_FOCUSED = "is_focused";
        protected static final String IS_IN_BACKGROUND = "is_in_background";
        protected static boolean active = false;
        protected static boolean resumed = false;

        protected static void changeStatus(String s)
        {
            (new Thread(s) {

                final String val$status;

                public void run()
                {
                    if (!AppLifeCycleStatusManager.active)
                    {
                        Log.e("KochavaTracker", "AppLifeCycleStatusManager - not active");
                    } else
                    {
                        if (status.equals("is_focused"))
                        {
                            if (!AppLifeCycleStatusManager.resumed)
                            {
                                Logging.Log("AppLifeCycleStatusManager - not already resumed, starting session...");
                                Feature.startAppSession();
                                AppLifeCycleStatusManager.resumed = true;
                                return;
                            } else
                            {
                                Logging.Log("AppLifeCycleStatusManager - IS_FOCUSED received, App is already in focused state.");
                                return;
                            }
                        }
                        if (status.equals("is_in_background"))
                        {
                            if (AppLifeCycleStatusManager.resumed)
                            {
                                Logging.Log("AppLifeCycleStatusManager - going to background from app, ending session");
                                Feature.endAppSession();
                                AppLifeCycleStatusManager.resumed = false;
                                return;
                            } else
                            {
                                Logging.Log("AppLifeCycleStatusManager - IS_IN_BACKGROUND received, App is already in background state.");
                                return;
                            }
                        }
                    }
                }

            
            {
                status = s;
                super();
            }
            }).start();
        }


        protected AppLifeCycleStatusManager()
        {
        }
    }

    public final class CURRENCIES
    {

        public static final String AED = "AED";
        public static final String AUD = "AUD";
        public static final String CAD = "CAD";
        public static final String CHF = "CHF";
        public static final String CNY = "CNY";
        public static final String DKK = "DKK";
        public static final String EUR = "EUR";
        public static final String GBP = "GBP";
        public static final String IDR = "IDR";
        public static final String ILS = "ILS";
        public static final String INR = "INR";
        public static final String MXP = "MXP";
        public static final String NOK = "NOK";
        public static final String NZD = "NZD";
        public static final String RUB = "RUB";
        public static final String SAR = "SAR";
        public static final String SEK = "SEK";
        public static final String TRY = "TRY";
        public static final String USD = "USD";
        public static final String YEN = "YEN";
        public static final String ZAR = "ZAR";
        final Feature this$0;

        private CURRENCIES()
        {
            this$0 = Feature.this;
            super();
        }
    }

    public final class INPUTITEMS
    {

        public static final String APP_LIMIT_TRACKING = "app_limit_tracking";
        public static final String BIDDER_HOST = "bidder_host";
        public static final String CONTROL_HOST = "control_host";
        public static final String CURRENCY = "currency";
        public static final String DEBUG_ON = "debug";
        public static final String FLUSH_IN_BACKGROUND = "flush_in_background";
        public static final String IDENTITY_LINK = "identity_link";
        public static final String KOCHAVA_APP_ID = "kochava_app_id";
        public static final String PARTNER_NAME = "partner_name";
        public static final String REQUEST_ATTRIBUTION = "request_attribution";
        final Feature this$0;

        private INPUTITEMS()
        {
            this$0 = Feature.this;
            super();
        }
    }

    protected class LifeCycleTracker
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final Feature this$0;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
        }

        public void onActivityDestroyed(Activity activity)
        {
        }

        public void onActivityPaused(Activity activity)
        {
            Logging.Log("LifeCycleTracker - Tracking Activity lost focus");
            AppLifeCycleStatusManager.changeStatus("is_in_background");
            Feature.is_in_background = true;
        }

        public void onActivityResumed(Activity activity)
        {
            Logging.Log("LifeCycleTracker - Tracking Activity Resumed");
            AppLifeCycleStatusManager.changeStatus("is_focused");
            Feature.is_in_background = false;
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
        }

        public void onActivityStopped(Activity activity)
        {
        }

        protected LifeCycleTracker()
        {
            this$0 = Feature.this;
            super();
        }
    }

    protected class MemoryBoss
        implements ComponentCallbacks2
    {

        final Feature this$0;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
        }

        public void onTrimMemory(int i)
        {
            if (i == 20)
            {
                Logging.Log("MemoryBoss - Tracking Activity lost focus");
                AppLifeCycleStatusManager.changeStatus("is_in_background");
                Feature.is_in_background = true;
            }
        }

        protected MemoryBoss()
        {
            this$0 = Feature.this;
            super();
        }
    }

    public final class PARAMS
    {

        public static final String ADID = "adid";
        public static final String ANDROID_ID = "android_id";
        public static final String FB_ATTRIBUTION_ID = "fb_attribution_id";
        public static final String IMEI = "imei";
        public static final String MAC = "mac";
        public static final String ODIN = "odin";
        public static final String OPEN_UDID = "open_udid";
        final Feature this$0;

        private PARAMS()
        {
            this$0 = Feature.this;
            super();
        }
    }

    private final class PRIVATEINPUTITEMS
    {

        public static final String CLICK_DATA = "clickData";
        public static final String FLUSH_RATE = "flush_rate";
        public static final String OVERRIDE_AUTOMATIC_SESSIONS = "override_automatic_sessions";
        public static final String SUPPRESS_ADID_GATHER = "suppress_adid_gather";
        public static final String VERSION_EXTENSION = "version_extension";
        final Feature this$0;

        private PRIVATEINPUTITEMS()
        {
            this$0 = Feature.this;
            super();
        }
    }

    private static class TrackTask
        implements Runnable
    {

        public void run()
        {
            Feature.postEvent();
        }

        private TrackTask()
        {
        }

    }

    public final class WATCHLIST
    {

        public static final String ADID = "adid";
        public static final String APP_LIMIT_TRACKING = "app_limit_tracking";
        public static final String APP_SHORT_STRING = "app_short_string";
        public static final String APP_VERSION = "app_version";
        public static final String DEVICE_LIMIT_TRACKING = "device_limit_tracking";
        public static final String OS_VERSION = "os_version";
        final Feature this$0;

        private WATCHLIST()
        {
            this$0 = Feature.this;
            super();
        }
    }

    private final class WHITELISTITEMS
    {

        public static final String EMAIL = "email";
        final Feature this$0;

        private WHITELISTITEMS()
        {
            this$0 = Feature.this;
            super();
        }
    }


    protected static final String ADLOGTAG = "KochavaAds";
    private static final int AD_CLICK_RESET_TIME = 2500;
    private static final int AD_UNAVAILABLE_CLICK_RESET_TIME = 2500;
    public static final String ATTRIBUTION_DATA = "attributionData";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    protected static final String ATTRIBUTION_PREF_DATA = "attributionData";
    protected static final String ATTRIBUTION_PREF_NAME = "attributionPref";
    private static final String BAD_INIT_MESSAGE = "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.";
    private static final String BIDDER_DEFAULT_HOST = "bidder.kochava.com";
    private static final String BIDDER_ENDPOINT = "/adserver/request/";
    private static final int BULK_UPLOAD_LIMIT = 50;
    private static final String CONTROL_DEFAULT_HOST = "control.kochava.com";
    private static final String DEVICE_ID_GENERATED = "kochava_app_id_generated";
    private static final int EVENT_FLUSH_TIME = 60000;
    private static final String EXIT = "exit";
    private static final int FLUSH_RATE_MAX_MINS = 360;
    private static final String HTML_FORMAT = "<html><body style=\"text-align: center; background-color: black; vertical-align: center;\"><img src = \"%s\" /></body></html>";
    private static final String HTTPS_STRING = "https://";
    private static final String HTTP_STRING = "http://";
    private static final String INIT_ENDPOINT = "/track/kvinit";
    private static final int INIT_FORCE_TIME = 0x927c0;
    private static final String KOCHAVA_APP_ID = "kochava_app_id";
    private static final String KVQUERY_ENDPOINT = "/track/kvquery";
    private static final int KV_QUERY_DEFAULT_RERUN = 60;
    private static final int KV_QUERY_FIRST_RUN = 7;
    private static final String LAUNCH = "launch";
    public static final String LINKIDENTITYBOOL = "linkIdentityBool";
    protected static final String LOGTAG = "KochavaTracker";
    private static final int MAX_ADID_DELAY = 600;
    private static final String OPTIONS_ENDPOINT = "/track/kv_options.php";
    protected static final String PREF_APPDATA = "kochavaappdata";
    protected static final String PREF_CUR = "currency";
    protected static final String PREF_INIT = "initBool";
    protected static final String PREF_INIT_DATA = "initData";
    protected static final String PREF_LAT = "mylat";
    protected static final String PREF_LONG = "mylong";
    protected static final String PREF_NAME = "initPrefs";
    protected static final String PREF_TIMESTOPPED = "timeStampStopped";
    protected static final String REQLOGTAG = "KochavaRequirements";
    private static final String SENDONSTART = "sendonstart";
    private static final String STRING_FALSE = "false";
    private static final String STRING_TRUE = "true";
    private static final String TRACKER_ENDPOINT = "/track/kvTracker.php";
    private static String adid = "";
    private static String advertisingID;
    protected static Context appContext;
    private static Handler attributionDataHandler;
    private static SharedPreferences attributionDataPrefs;
    private static boolean badInit = false;
    private static boolean canSendSession = true;
    private static boolean device_limit_tracking = false;
    private static boolean event_flush_triggered = false;
    private static ArrayList eventnameBlacklist = new ArrayList();
    private static final ExecutorService executor = Executors.newFixedThreadPool(1);
    private static int flush_rate = 60000;
    private static String hostBidder = "";
    private static String hostControl = "";
    private static Map identityLinkMap;
    private static JSONObject identityLinkMapJSON;
    private static boolean is_in_background = false;
    private static DbAdapter kDbAdapter;
    private static long lastCallTime = 0L;
    private static String mAppId;
    private static String mEnvDeviceID;
    private static String mIMEI;
    private static String mKochDevIDStrategy;
    private static String mMacAddr;
    private static Map mSuperProperties;
    private static Timer mTimer;
    private static String mUserAgent;
    protected static boolean overrideAutomaticSessions = false;
    private static HashMap paramRestrictions = new HashMap() {

            
            {
                put("android_id", Boolean.valueOf(true));
                put("imei", Boolean.valueOf(true));
                put("odin", Boolean.valueOf(true));
                put("mac", Boolean.valueOf(true));
                put("fb_attribution_id", Boolean.valueOf(true));
                put("open_udid", Boolean.valueOf(true));
                put("adid", Boolean.valueOf(true));
            }
    };
    private static SharedPreferences prefs;
    private static int referrerDelayFromInit = 60;
    private static boolean requestAttributionData = false;
    private static boolean sendEmails = false;
    private static Runnable sendKVQuery = new Runnable() {

        public void run()
        {
            int i;
            int j;
            j = 60;
            i = j;
            Object obj = Feature.createHttpClient(true);
            i = j;
            HttpProtocolParams.setUserAgent(((HttpClient) (obj)).getParams(), Feature.mUserAgent);
            i = j;
            if (Feature.hostControl == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            i = j;
            if (!Feature.hostControl.trim().isEmpty())
            {
                break MISSING_BLOCK_LABEL_74;
            }
            i = j;
            Logging.Log("KVquery - hostControl was empty, using default");
            i = j;
            Feature.hostControl = "control.kochava.com";
            i = j;
            Object obj2 = (new StringBuilder()).append("https://").append(Feature.hostControl).append("/track/kvquery").toString();
            i = j;
            Logging.Log((new StringBuilder()).append("KVquery - posting to ").append(((String) (obj2))).toString());
            i = j;
            obj2 = new HttpPost(((String) (obj2)));
            i = j;
            Object obj3 = new JSONObject();
            i = j;
            ((JSONObject) (obj3)).put("action", "get_attribution");
            i = j;
            ((JSONObject) (obj3)).put("kochava_app_id", Feature.mAppId);
            i = j;
            ((JSONObject) (obj3)).put("kochava_device_id", Feature.getDeviceId());
            i = j;
            ((JSONObject) (obj3)).put("sdk_version", (new StringBuilder()).append("Android20150511").append(Feature.versionExtension).toString());
            i = j;
            ((JSONObject) (obj3)).put("sdk_protocol", "3");
            i = j;
            obj3 = ((JSONObject) (obj3)).toString();
            i = j;
            Logging.Log((new StringBuilder()).append("KVquery data:").append(((String) (obj3))).toString());
            i = j;
            obj3 = new StringEntity(((String) (obj3)), "UTF-8");
            i = j;
            BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
            i = j;
            ((HttpPost) (obj2)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
            i = j;
            ((StringEntity) (obj3)).setContentType(basicheader);
            i = j;
            ((HttpPost) (obj2)).setEntity(((HttpEntity) (obj3)));
            i = j;
            Logging.Log("Trying to post to KVquery.");
            i = j;
            obj = ((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj2))).getEntity();
            if (obj != null) goto _L2; else goto _L1
_L1:
            i = j;
            Logging.LogError("Could not get a response entity from KVquery.");
_L8:
            return;
_L2:
            int i1;
            int j1;
            i1 = j;
            j1 = j;
            i = j;
            Logging.Log("(KVquery) Grabbing Result...");
            i1 = j;
            j1 = j;
            i = j;
            obj = StringUtils.inputStreamToString(((HttpEntity) (obj)).getContent());
            i1 = j;
            j1 = j;
            i = j;
            Logging.Log((new StringBuilder()).append("(KVquery) Result: ").append(((String) (obj))).toString());
            obj2 = null;
            i1 = j;
            j1 = j;
            i = j;
            obj = new JSONObject(((String) (obj)));
            obj2 = obj;
_L9:
            int l = j;
            if (obj2 == null) goto _L4; else goto _L3
_L3:
            i1 = j;
            j1 = j;
            i = j;
            Logging.Log((new StringBuilder()).append("(KVquery) Parsed result: ").append(((JSONObject) (obj2)).toString()).toString());
            obj = null;
            i1 = j;
            j1 = j;
            i = j;
            obj2 = ((JSONObject) (obj2)).getJSONObject("data");
            i1 = j;
            obj = obj2;
            j1 = j;
            i = j;
            Logging.Log((new StringBuilder()).append("(KVquery) return data: ").append(((JSONObject) (obj2)).toString()).toString());
            obj = obj2;
_L10:
            l = j;
            if (obj == null) goto _L4; else goto _L5
_L5:
            obj2 = "";
            i1 = j;
            j1 = j;
            i = j;
            obj3 = ((JSONObject) (obj)).getString("attribution");
            obj2 = obj3;
_L11:
            i1 = j;
            j1 = j;
            i = j;
            int k = ((JSONObject) (obj)).getInt("retry");
            l = k;
            if (k >= 0) goto _L4; else goto _L6
_L6:
            i1 = k;
            j1 = k;
            i = k;
            j = k;
            Feature.attributionDataPrefs.edit().putString("attributionData", ((String) (obj2))).commit();
            l = k;
            i1 = k;
            j1 = k;
            i = k;
            j = k;
            if (Feature.attributionDataHandler == null) goto _L4; else goto _L7
_L7:
            i1 = k;
            j1 = k;
            i = k;
            j = k;
            obj = Message.obtain();
            i1 = k;
            j1 = k;
            i = k;
            j = k;
            obj3 = new Bundle();
            i1 = k;
            j1 = k;
            i = k;
            j = k;
            ((Bundle) (obj3)).putString("attributionData", ((String) (obj2)).toString());
            i1 = k;
            j1 = k;
            i = k;
            j = k;
            ((Message) (obj)).setData(((Bundle) (obj3)));
            i1 = k;
            j1 = k;
            i = k;
            j = k;
            Feature.attributionDataHandler.sendMessage(((Message) (obj)));
            l = k;
_L4:
            if (l > 0)
            {
                Feature.sendKVQuery(l);
                return;
            }
              goto _L8
            Object obj1;
            obj1;
            i1 = j;
            j1 = j;
            i = j;
            Logging.LogError((new StringBuilder()).append("(KVquery) Error while parsing result json: ").append(((JSONException) (obj1)).toString()).toString());
              goto _L9
            obj1;
            i = i1;
            if (!obj1.getClass().equals(javax/net/ssl/SSLException))
            {
                break MISSING_BLOCK_LABEL_1138;
            }
            i = i1;
            Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj1).toString());
            i = i1;
            JSONException jsonexception;
            JSONException jsonexception1;
            try
            {
                Feature.httpsError(((Exception) (obj1)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Logging.LogError((new StringBuilder()).append("KVquery ClientProtocolException: ").append(obj1).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                if (obj1.getClass().equals(javax/net/ssl/SSLException))
                {
                    Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj1).toString());
                    Feature.httpsError(((Exception) (obj1)));
                    return;
                }
                break MISSING_BLOCK_LABEL_1166;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Logging.LogError((new StringBuilder()).append("Unexpected error during KVquery communication. ").append(obj1).toString());
                l = i;
            }
              goto _L4
            jsonexception;
            i1 = j;
            j1 = j;
            i = j;
            Logging.Log("KVquery response did not contain data.");
              goto _L10
            obj1;
            i = j1;
            Logging.LogError((new StringBuilder()).append("KVquery OutOfMemoryError: ").append(obj1).toString());
            return;
            jsonexception1;
            i1 = j;
            j1 = j;
            i = j;
            Logging.LogError("KVquery response did not contain attribution data, or JSON was invalid.");
              goto _L11
            obj1;
            i1 = j;
            j1 = j;
            i = j;
            Logging.LogError("KVquery response did not contain a retry value, or JSON was invalid.");
            l = j;
              goto _L4
            i = i1;
            Logging.LogError((new StringBuilder()).append("KVquery IOException: ").append(obj1).toString());
            return;
            Logging.LogError((new StringBuilder()).append("KVquery IOException: ").append(obj1).toString());
            return;
              goto _L9
        }

    };
    private static boolean should_flush_in_background = true;
    private static long startTime = 0L;
    private static boolean suppress_adid = false;
    protected static String versionExtension = "";
    public static Hashtable webStates;
    public static Hashtable webViews;
    private static final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();
    private Timer adTimer;
    private boolean app_limit_tracking;
    private String clickData;
    private Timer eventFlushTimer;
    private Handler initHandler;
    private Timer initTimer;
    private JSONObject initialObject;
    private JSONObject initialPropertiesObject;
    protected JSONObject kvinitdata;
    protected JSONObject kvinitdataholder;
    protected JSONObject kvinitorigdata;
    private String mAndroidID;
    private String mAppName;
    private String mAppPackageName;
    private String mAppVersionCode;
    private String mAppVersionName;
    private String mCarrier;
    private Context mContext;
    private String mDeviceId;
    private int mDisplayHeight;
    private int mDisplayWidth;
    private String mFbId;
    private boolean mIsStartOfLife;
    private String mModel;
    private String mOSVersion;
    private Timer mTimerSendOnBegin;

    public Feature(Context context, String s)
    {
        app_limit_tracking = false;
        mIsStartOfLife = true;
        initHandler = null;
        HashMap hashmap = new HashMap();
        if (s != null && s.trim().length() != 0)
        {
            hashmap.put("kochava_app_id", s);
        }
        init(context, true, hashmap);
    }

    public Feature(Context context, String s, String s1)
    {
        app_limit_tracking = false;
        mIsStartOfLife = true;
        initHandler = null;
        HashMap hashmap = new HashMap();
        if (s != null && s.trim().length() != 0)
        {
            hashmap.put("kochava_app_id", s);
        }
        if (s1 != null && s1.trim().length() != 0)
        {
            hashmap.put("currency", s1);
        }
        init(context, true, hashmap);
    }

    public Feature(Context context, String s, boolean flag)
    {
        app_limit_tracking = false;
        mIsStartOfLife = true;
        initHandler = null;
        HashMap hashmap = new HashMap();
        if (s != null && s.trim().length() != 0)
        {
            hashmap.put("kochava_app_id", s);
        }
        init(context, flag, hashmap);
    }

    public Feature(Context context, String s, boolean flag, String s1)
    {
        app_limit_tracking = false;
        mIsStartOfLife = true;
        initHandler = null;
        HashMap hashmap = new HashMap();
        if (s != null && s.trim().length() != 0)
        {
            hashmap.put("kochava_app_id", s);
        }
        if (s1 != null && s1.trim().length() != 0)
        {
            hashmap.put("currency", s1);
        }
        init(context, flag, hashmap);
    }

    public Feature(Context context, HashMap hashmap)
    {
        app_limit_tracking = false;
        mIsStartOfLife = true;
        initHandler = null;
        init(context, true, hashmap);
    }

    public Feature(Context context, boolean flag, HashMap hashmap)
    {
        app_limit_tracking = false;
        mIsStartOfLife = true;
        initHandler = null;
        init(context, flag, hashmap);
    }

    private static JSONObject addGlobalProperties(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        jsonobject.put("usertime", (new StringBuilder()).append(System.currentTimeMillis() / 1000L).append("").toString());
        jsonobject.put("uptime", (new StringBuilder()).append(System.currentTimeMillis() / 1000L - startTime).append("").toString());
        if (lastCallTime == 0L)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        jsonobject.put("updelta", (new StringBuilder()).append(System.currentTimeMillis() / 1000L - lastCallTime).append("").toString());
_L1:
        lastCallTime = System.currentTimeMillis() / 1000L;
        prefs = appContext.getSharedPreferences("initPrefs", 0);
        if (prefs.getString("mylat", "").equals(""))
        {
            break MISSING_BLOCK_LABEL_248;
        }
        jsonobject.put("geo_lat", prefs.getString("mylat", ""));
        jsonobject.put("geo_lon", prefs.getString("mylong", ""));
        return jsonobject;
        jsonobject.put("updelta", "0");
          goto _L1
        Exception exception;
        exception;
        Logging.LogError((new StringBuilder()).append("Error adding time properties to a JSON object ").append(exception).toString());
        return jsonobject;
    }

    private String createAppData()
    {
        String s = (new StringBuilder()).append("").append(getDeviceId()).append(":::").toString();
        s = (new StringBuilder()).append(s).append(getModel()).append(":::").toString();
        s = (new StringBuilder()).append(s).append(getCarrier()).append(":::").toString();
        s = (new StringBuilder()).append(s).append(getIMEI()).append(":::").toString();
        s = (new StringBuilder()).append(s).append(getAppVersion()).append(":::").toString();
        return (new StringBuilder()).append(s).append(getOSVersion()).toString();
    }

    private static HttpClient createHttpClient(boolean flag)
    {
        Logging.Log("Creating secure https client.");
        X509HostnameVerifier x509hostnameverifier = SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basichttpparams, "ISO-8859-1");
        HttpProtocolParams.setUseExpectContinue(basichttpparams, true);
        if (flag)
        {
            HttpConnectionParams.setConnectionTimeout(basichttpparams, 10000);
        }
        Object obj = SSLSocketFactory.getSocketFactory();
        ((SSLSocketFactory) (obj)).setHostnameVerifier((X509HostnameVerifier)x509hostnameverifier);
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
        obj = new ThreadSafeClientConnManager(basichttpparams, schemeregistry);
        HttpsURLConnection.setDefaultHostnameVerifier(x509hostnameverifier);
        return new DefaultHttpClient(((org.apache.http.conn.ClientConnectionManager) (obj)), basichttpparams);
    }

    public static void enableDebug(boolean flag)
    {
        Log.i("KochavaTracker", (new StringBuilder()).append("enableDebug to ").append(flag).toString());
        Global.DEBUG = flag;
    }

    private static void endAppSession()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 14 && !overrideAutomaticSessions)
            {
                if (!badInit)
                {
                    break label0;
                }
                Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            }
            return;
        }
        Logging.Log("Automatic Session End");
        if (!should_flush_in_background)
        {
            if (mTimer != null)
            {
                Logging.Log("Session end, flush timer was on, canceling timer and flushing current events.");
                flush();
                mTimer.cancel();
                mTimer = null;
            } else
            {
                Logging.Log("Session end, flush timer was already off.");
            }
        }
        if (canSendSession)
        {
            eventSession("exit");
            return;
        } else
        {
            Logging.Log("Session events disabled by server.");
            return;
        }
    }

    private static void eventSession(String s)
    {
        (new Thread(s) {

            final String val$state;

            public void run()
            {
                Object obj;
                Object obj1;
                Logging.Log((new StringBuilder()).append("Got event ").append(state).toString());
                obj1 = new HashMap();
                ((HashMap) (obj1)).put("state", state);
                Logging.Log((new StringBuilder()).append("FIRE EVENT*** action:").append("session").toString());
                Logging.Log((new StringBuilder()).append("FIRE EVENT*** properties:").append(obj1).toString());
                obj = new JSONObject();
                JSONObject jsonobject;
                ((JSONObject) (obj)).put("kochava_app_id", Feature.mAppId);
                ((JSONObject) (obj)).put("kochava_device_id", Feature.getDeviceId());
                ((JSONObject) (obj)).put("action", "session");
                ((JSONObject) (obj)).put("dev_id_strategy", Feature.mKochDevIDStrategy);
                jsonobject = Feature.addGlobalProperties(new JSONObject());
                if (Feature.mSuperProperties != null)
                {
                    java.util.Map.Entry entry1;
                    for (Iterator iterator = Feature.mSuperProperties.entrySet().iterator(); iterator.hasNext(); jsonobject.put((String)entry1.getKey(), entry1.getValue()))
                    {
                        entry1 = (java.util.Map.Entry)iterator.next();
                    }

                }
                  goto _L1
                obj;
                ((JSONException) (obj)).printStackTrace();
                Logging.LogError((new StringBuilder()).append("event ").append(obj).toString());
_L3:
                return;
_L1:
                if (obj1 == null)
                {
                    break MISSING_BLOCK_LABEL_302;
                }
                java.util.Map.Entry entry;
                for (obj1 = ((HashMap) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
                {
                    entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                }

                ((JSONObject) (obj)).put("data", jsonobject);
                Logging.Log((new StringBuilder()).append("fireEvent with properties: ").append(obj).toString());
                if (Feature.kDbAdapter.addEvent(((JSONObject) (obj)), false) >= 50)
                {
                    Feature.flush();
                    return;
                }
                if (true) goto _L3; else goto _L2
_L2:
            }

            
            {
                state = s;
                super();
            }
        }).start();
    }

    private void fireEvent(String s, Map map)
    {
        JSONObject jsonobject;
        if (!s.equals("initial") && !should_flush_in_background && is_in_background && !event_flush_triggered)
        {
            event_flush_triggered = true;
            eventFlushTimer.schedule(new TimerTask() {

                final Feature this$0;

                public void run()
                {
                    if (Feature.is_in_background)
                    {
                        Feature.flush();
                    }
                    Feature.event_flush_triggered = false;
                }

            
            {
                this$0 = Feature.this;
                super();
            }
            }, 60000L);
        }
        Logging.Log((new StringBuilder()).append("FIRE EVENT*** action:").append(s).toString());
        Logging.Log((new StringBuilder()).append("FIRE EVENT*** properties:").append(map).toString());
        jsonobject = new JSONObject();
        JSONObject jsonobject1;
        jsonobject.put("kochava_app_id", mAppId);
        jsonobject.put("kochava_device_id", getDeviceId());
        jsonobject.put("action", s);
        jsonobject.put("dev_id_strategy", mKochDevIDStrategy);
        jsonobject.put("last_post_time", 0);
        prefs = mContext.getSharedPreferences("initPrefs", 0);
        jsonobject.put("currency", prefs.getString("currency", "USD"));
        jsonobject1 = addGlobalProperties(new JSONObject());
        if (!s.equals("initial"))
        {
            break MISSING_BLOCK_LABEL_844;
        }
        Logging.Log("Event is initial, or initial did not get que'd on first load");
        jsonobject.put("sdk_version", (new StringBuilder()).append("Android20150511").append(versionExtension).toString());
        if (((Boolean)paramRestrictions.get("adid")).booleanValue())
        {
            jsonobject1.put("adid", advertisingID);
        }
        jsonobject1.put("device", (new StringBuilder()).append(getModel()).append("-").append(getCarrier()).toString());
        if (((Boolean)paramRestrictions.get("imei")).booleanValue())
        {
            jsonobject1.put("imei", getIMEI());
        }
        jsonobject1.put("disp_h", mDisplayHeight);
        jsonobject1.put("disp_w", mDisplayWidth);
        jsonobject1.put("package_name", getAppPackageName());
        jsonobject1.put("app_version", getAppVersion());
        if (!mAppVersionName.equals(""))
        {
            jsonobject1.put("app_short_string", mAppVersionName);
        }
        if (((Boolean)paramRestrictions.get("android_id")).booleanValue())
        {
            jsonobject1.put("android_id", mAndroidID);
        }
        jsonobject1.put("os_version", getOSVersion());
        jsonobject1.put("app_limit_tracking", app_limit_tracking);
        jsonobject1.put("device_limit_tracking", device_limit_tracking);
        s = new JSONObject();
        if (sendEmails)
        {
            String s1 = getEmailAccounts();
            if (!s1.equals("[]"))
            {
                s.put("email", s1);
            }
        }
        if (s.length() > 0)
        {
            jsonobject1.put("ids", s);
        }
        if (identityLinkMapJSON != null)
        {
            jsonobject1.put("identity_link", identityLinkMapJSON);
        }
        if (((Boolean)paramRestrictions.get("odin")).booleanValue())
        {
            jsonobject1.put("odin", getOdin());
        }
        if (((Boolean)paramRestrictions.get("mac")).booleanValue())
        {
            jsonobject1.put("mac", mMacAddr);
        }
        if (clickData != null && !clickData.isEmpty())
        {
            jsonobject1.put("clickData", clickData);
        }
        if (((Boolean)paramRestrictions.get("fb_attribution_id")).booleanValue())
        {
            mFbId = getAttributionId(mContext.getContentResolver());
            if (mFbId != null)
            {
                break MISSING_BLOCK_LABEL_759;
            }
            jsonobject1.put("fb_attribution_id", "");
        }
_L2:
        s = (WindowManager)mContext.getSystemService("window");
        DisplayMetrics displaymetrics = new DisplayMetrics();
        s.getDefaultDisplay().getMetrics(displaymetrics);
        initialPropertiesObject = jsonobject1;
        initialObject = jsonobject;
        Logging.Log("Initial Event, saving until next event. ");
        return;
        jsonobject1.put("fb_attribution_id", mFbId);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        try
        {
            s.printStackTrace();
            Logging.LogError((new StringBuilder()).append("event ").append(s).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        Logging.LogError((new StringBuilder()).append("event ").append(s).toString());
        return;
        s;
        Logging.LogError("Error during fireEvent - Please review stack trace");
        s.printStackTrace();
_L4:
        if (mSuperProperties != null)
        {
            java.util.Map.Entry entry;
            for (s = mSuperProperties.entrySet().iterator(); s.hasNext(); jsonobject1.put((String)entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)s.next();
            }

        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_969;
        }
        for (s = map.entrySet().iterator(); s.hasNext(); jsonobject1.put((String)map.getKey(), map.getValue()))
        {
            map = (java.util.Map.Entry)s.next();
        }

        jsonobject.put("data", jsonobject1);
        Logging.Log((new StringBuilder()).append("fireEvent with properties: ").append(jsonobject).toString());
        queInitial(true);
        if (kDbAdapter.addEvent(jsonobject, false) >= 50)
        {
            flush();
            return;
        } else
        {
            return;
        }
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void fireEventBlacklist(String s, Map map)
    {
        String s1 = (String)map.get("event_name");
        if (s1 != null)
        {
            if (!eventnameBlacklist.contains(map.get("event_name")))
            {
                fireEvent(s, map);
                return;
            } else
            {
                Logging.Log((new StringBuilder()).append("fireEvent - Events under the key \"").append(s1).append("\" are blocked!").toString());
                return;
            }
        } else
        {
            fireEvent(s, map);
            return;
        }
    }

    public static void flush()
    {
        if (badInit)
        {
            Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            return;
        } else
        {
            Logging.Log("flush");
            executor.submit(new TrackTask());
            return;
        }
    }

    private void getAd(final WebView adWebview, final Activity context, final int height, final int width)
    {
        if (badInit)
        {
            Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            return;
        }
        ComponentName componentname = new ComponentName(mContext, com/kochava/android/tracker/WebAdView);
        try
        {
            mContext.getPackageManager().getActivityInfo(componentname, 0);
            Logging.Log("Ad activity registered.");
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Logging.LogRequirementsError("WEBADVIEW ACTIVITY REGISTRATION MISSING: com.kochava.android.tracker.WebAdView");
        }
        (new Thread() {

            final Feature this$0;
            final WebView val$adWebview;
            final Activity val$context;
            final int val$height;
            final int val$width;

            public void run()
            {
                Object obj;
                final String clickUrl;
                Object obj1;
                clickUrl = "";
                obj1 = context.getPackageManager();
                char ac[];
                Matcher matcher;
                int i;
                try
                {
                    obj = ((PackageManager) (obj1)).getApplicationInfo(getAppPackageName(), 0);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = null;
                }
                if (obj != null)
                {
                    obj = ((PackageManager) (obj1)).getApplicationLabel(((android.content.pm.ApplicationInfo) (obj)));
                } else
                {
                    obj = "(unknown)";
                }
                obj = (String)(String)obj;
                obj1 = Feature.createHttpClient(false);
                if (Feature.hostBidder == null || Feature.hostBidder.trim().isEmpty())
                {
                    Feature.hostBidder = "bidder.kochava.com";
                }
                obj1 = ((HttpClient) (obj1)).execute(new HttpGet((new StringBuilder()).append("https://").append(Feature.hostBidder).append("/adserver/request/").append("?w=").append(width).append("&h=").append(height).append("&odin=").append(getOdin()).append("&aid=").append(Feature.mAppId).append("&an=").append(((String) (obj))).append("&av=").append("Android20150511").append(Feature.versionExtension).append("&kochava_device_id=").append(Feature.getDeviceId()).toString())).getEntity();
                obj = clickUrl;
                if (obj1 == null) goto _L2; else goto _L1
_L1:
                obj = new InputStreamReader(((HttpEntity) (obj1)).getContent(), "ISO-8859-1");
                obj1 = new StringBuilder();
                ac = new char[1024];
_L5:
                i = ((Reader) (obj)).read(ac);
                if (i == -1) goto _L4; else goto _L3
_L3:
                ((StringBuilder) (obj1)).append(ac, 0, i);
                  goto _L5
                obj;
_L8:
                if (obj.getClass().equals(javax/net/ssl/SSLException))
                {
                    Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj).toString());
                    Feature.httpsError(((Exception) (obj)));
                } else
                {
                    Logging.LogError((new StringBuilder()).append("Problem grabbing ad: ").append(((IOException) (obj)).getMessage()).toString());
                }
                ((IOException) (obj)).printStackTrace();
                obj = clickUrl;
_L2:
                clickUrl = "";
                obj1 = "";
                Logging.Log((new StringBuilder()).append("Response:").append(((String) (obj))).toString());
                matcher = Pattern.compile("href='(.*?)'").matcher(((CharSequence) (obj)));
                if (matcher.find())
                {
                    clickUrl = matcher.group(1);
                }
                matcher = Pattern.compile("src='(.*?)'").matcher(((CharSequence) (obj)));
                obj = obj1;
                if (matcher.find())
                {
                    obj = matcher.group(1);
                }
                obj = ((_cls1) (obj)). new Thread() {

                    final _cls12 this$1;
                    final String val$clickUrl;
                    final String val$fAdUrl;

                    public void run()
                    {
                        adWebview.setVerticalScrollBarEnabled(false);
                        adWebview.setHorizontalScrollBarEnabled(false);
                        adWebview.getSettings().setBuiltInZoomControls(false);
                        adWebview.setOnTouchListener(new android.view.View.OnTouchListener() {

                            final _cls1 this$2;

                            public boolean onTouch(View view, MotionEvent motionevent)
                            {
                                int i = (int)motionevent.getRawX();
                                int j = (int)motionevent.getRawY();
                                int ai[] = new int[2];
                                view.getLocationOnScreen(ai);
                                int k = ai[0];
                                int l = view.getWidth();
                                int i1 = ai[1];
                                int j1 = view.getHeight();
                                if (motionevent.getAction() == 1 && i > ai[0] && i < k + l && j > ai[1] && j < i1 + j1)
                                {
                                    view = new Intent(context, com/kochava/android/tracker/WebAdView);
                                    motionevent = new Bundle();
                                    motionevent.putString("URL", clickUrl);
                                    view.putExtras(motionevent);
                                    context.startActivity(view);
                                    if (context.getResources().getIdentifier("slide_up", "anim", context.getPackageName()) != 0)
                                    {
                                        context.overridePendingTransition(context.getResources().getIdentifier("slide_up", "anim", context.getPackageName()), context.getResources().getIdentifier("stay", "anim", context.getPackageName()));
                                    } else
                                    {
                                        context.overridePendingTransition(0x10a0002, 0x10a0001);
                                    }
                                }
                                return true;
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                        adWebview.getSettings().setJavaScriptEnabled(true);
                        Logging.Log((new StringBuilder()).append("Loading add ").append(fAdUrl).toString());
                        adWebview.loadUrl(fAdUrl);
                    }

            
            {
                this$1 = final__pcls12;
                clickUrl = s;
                fAdUrl = String.this;
                super();
            }
                };
                context.runOnUiThread(((Runnable) (obj)));
                return;
_L4:
                obj = ((StringBuilder) (obj1)).toString();
                  goto _L2
                obj;
_L6:
                Logging.LogError((new StringBuilder()).append("Problem grabbing ad: ").append(((NoSuchAlgorithmException) (obj)).getMessage()).toString());
                ((NoSuchAlgorithmException) (obj)).printStackTrace();
                obj = clickUrl;
                  goto _L2
                obj;
                  goto _L6
                obj;
                if (true) goto _L8; else goto _L7
_L7:
            }

            
            {
                this$0 = Feature.this;
                context = activity;
                width = i;
                height = j;
                adWebview = webview;
                super();
            }
        }).start();
    }

    private String getAdvertisingId()
    {
        String s;
        int i;
        try
        {
            i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        }
        catch (Exception exception)
        {
            Logging.LogError((new StringBuilder()).append("Problem getting Advertising ID (catch): ").append(exception.toString()).toString());
            return "";
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 9: default 336
    //                   0 145
    //                   1 208
    //                   2 240
    //                   3 272
    //                   4 68
    //                   5 68
    //                   6 68
    //                   7 68
    //                   8 68
    //                   9 304;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L3 _L3 _L3 _L3 _L8
_L8:
        break MISSING_BLOCK_LABEL_304;
_L3:
        Logging.Log((new StringBuilder()).append("Google Play Services check returned unknown error code (").append(i).append(").").toString());
_L9:
        Logging.LogError((new StringBuilder()).append("Problem getting Advertising ID ").append(GooglePlayServicesUtil.getErrorString(i)).toString());
_L2:
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(mContext);
        s = info.getId();
        device_limit_tracking = info.isLimitAdTrackingEnabled();
        return s;
_L4:
        Logging.Log((new StringBuilder()).append("Google Play Services check returned ConnectionResult.SUCCESS (").append(i).append(").").toString());
          goto _L9
_L5:
        Logging.Log((new StringBuilder()).append("Google Play Services check returned ConnectionResult.SERVICE_MISSING (").append(i).append(").").toString());
          goto _L9
_L6:
        Logging.Log((new StringBuilder()).append("Google Play Services check returned ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED (").append(i).append(").").toString());
          goto _L9
_L7:
        Logging.Log((new StringBuilder()).append("Google Play Services check returned ConnectionResult.SERVICE_DISABLED (").append(i).append(").").toString());
          goto _L9
        Logging.Log((new StringBuilder()).append("Google Play Services check returned ConnectionResult.SERVICE_INVALID (").append(i).append(").").toString());
          goto _L9
    }

    private String getAppPackageName()
    {
        if (mAppPackageName != null)
        {
            return mAppPackageName;
        } else
        {
            return "Unknown";
        }
    }

    private String getAppVersion()
    {
        return (new StringBuilder()).append(mAppName).append(" ").append(mAppVersionCode).toString();
    }

    public static String getAttributionData()
    {
        if (attributionDataPrefs != null)
        {
            return attributionDataPrefs.getString("attributionData", "");
        } else
        {
            return "";
        }
    }

    protected static String getAttributionId(ContentResolver contentresolver)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = null;
        contentresolver = contentresolver.query(ATTRIBUTION_ID_CONTENT_URI, new String[] {
            "aid"
        }, null, null, null);
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = contentresolver;
        obj1 = contentresolver;
        boolean flag = contentresolver.moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        String s;
        if (contentresolver != null)
        {
            try
            {
                if (!contentresolver.isClosed())
                {
                    contentresolver.close();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver) { }
        }
        return null;
        obj = contentresolver;
        obj1 = contentresolver;
        s = contentresolver.getString(contentresolver.getColumnIndex("aid"));
        obj = s;
        obj1 = obj;
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj1 = obj;
        if (contentresolver.isClosed())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        contentresolver.close();
        obj1 = obj;
_L2:
        return ((String) (obj1));
        contentresolver;
        obj1 = obj;
        Logging.Log((new StringBuilder()).append("Problem getting FB attribution ID ").append(contentresolver.toString()).toString());
        obj1 = obj2;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj2;
        try
        {
            if (((Cursor) (obj)).isClosed())
            {
                continue; /* Loop/switch isn't completed */
            }
            ((Cursor) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            obj1 = obj2;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        contentresolver;
        if (obj1 != null)
        {
            try
            {
                if (!((Cursor) (obj1)).isClosed())
                {
                    ((Cursor) (obj1)).close();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw contentresolver;
        contentresolver;
        obj1 = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String getCarrier()
    {
        return Build.BRAND;
    }

    private static String getDeviceId()
    {
        if (prefs.contains("kochava_app_id_generated") && !prefs.getString("kochava_app_id_generated", "").equals(""))
        {
            return prefs.getString("kochava_app_id_generated", "");
        } else
        {
            String s = UUID.randomUUID().toString().replaceAll("-", "");
            s = (new StringBuilder()).append("KA").append(s).toString();
            prefs.edit().putString("kochava_app_id_generated", s).commit();
            return s;
        }
    }

    private String getEmailAccounts()
    {
        String s = "";
        if (mContext.checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS") == 0)
        {
            Account aaccount[] = AccountManager.get(mContext).getAccounts();
            int j = aaccount.length;
            for (int i = 0; i < j;)
            {
                Account account = aaccount[i];
                String s1 = s;
                if (isEmailValid(account.name))
                {
                    s1 = account.name.toLowerCase();
                    s1 = (new StringBuilder()).append(s).append(s1).append(",").toString();
                }
                i++;
                s = s1;
            }

            if (s.length() > 0)
            {
                s = s.substring(0, s.length() - 1);
            } else
            {
                s = "";
            }
        } else
        {
            s = "";
            Logging.Log("****NOTICE**** Gathering of emails was whitelisted, but android.permission.GET_ACCOUNTS declaration was missing from manifest.");
        }
        return (new StringBuilder()).append("[").append(s).append("]").toString();
    }

    private String getIMEI()
    {
        return mIMEI;
    }

    public static String getKochavaDeviceId()
    {
        String s = getDeviceId();
        if (s != null)
        {
            return s;
        }
        break MISSING_BLOCK_LABEL_18;
        Exception exception;
        exception;
        Logging.LogError(exception.toString());
        return "";
    }

    private static String getModel()
    {
        return Build.MODEL;
    }

    private static String getOSVersion()
    {
        return (new StringBuilder()).append("Android ").append(android.os.Build.VERSION.RELEASE).toString();
    }

    private String getOdin()
        throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        if (mAndroidID == null || "".equals(mAndroidID)) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        StringBuffer stringbuffer;
        int i;
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
        byte abyte1[] = new byte[40];
        messagedigest.update(mAndroidID.getBytes("iso-8859-1"), 0, mAndroidID.length());
        abyte0 = messagedigest.digest();
        stringbuffer = new StringBuffer();
        i = 0;
_L4:
        int j;
        int k;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        k = abyte0[i] >>> 4 & 0xf;
        j = 0;
_L5:
        if (k >= 0 && k <= 9)
        {
            stringbuffer.append((char)(k + 48));
        } else
        {
            stringbuffer.append((char)((k - 10) + 97));
        }
        k = abyte0[i] & 0xf;
        if (j < 1)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        return stringbuffer.toString();
_L2:
        return "";
        j++;
          goto _L5
    }

    private String getUserAgent()
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj2 = "";
        String s = "";
        boolean flag = true;
        boolean flag1 = true;
        String s2;
        Object obj6;
        Object obj7;
        try
        {
            obj3 = (new StringBuilder()).append("").append("\nTrying user agent method 1").toString();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj3 = new StringWriter();
            ((Exception) (obj1)).printStackTrace(new PrintWriter(((java.io.Writer) (obj3))));
            Logging.LogError(((StringWriter) (obj3)).toString());
            obj3 = (new StringBuilder()).append(s).append("\nError with user agent first method: ").append(((Exception) (obj1)).toString()).append("\n").append(((StringWriter) (obj3)).toString()).toString();
            continue; /* Loop/switch isn't completed */
        }
        s = ((String) (obj3));
        obj1 = System.getProperty("http.agent");
        obj2 = obj1;
_L4:
        if (((String) (obj2)).trim().isEmpty())
        {
            flag = false;
        }
        s = ((String) (obj2));
        obj1 = obj3;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        s = ((String) (obj2));
        obj1 = obj3;
        obj3 = (new StringBuilder()).append(((String) (obj3))).append("\nTrying user agent method 2").toString();
        s = ((String) (obj2));
        obj1 = obj3;
        obj2 = (new WebView(mContext)).getSettings().getUserAgentString();
        s = ((String) (obj2));
        obj1 = obj3;
        obj3 = (new StringBuilder()).append(((String) (obj3))).append("\nMethod 2 successful").toString();
        obj1 = obj3;
        s = ((String) (obj2));
_L1:
        flag = flag1;
        if (s.trim().isEmpty())
        {
            flag = false;
        }
        obj4 = s;
        obj5 = obj1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        obj7 = null;
        obj6 = null;
        obj2 = obj6;
        obj3 = s;
        obj5 = obj1;
        obj4 = obj7;
        s2 = (new StringBuilder()).append(((String) (obj1))).append("\nTrying user agent method 3").toString();
        obj2 = obj6;
        obj3 = s;
        obj5 = s2;
        obj4 = obj7;
        obj1 = android/webkit/WebSettings.getDeclaredConstructor(new Class[] {
            android/content/Context, android/webkit/WebView
        });
        obj2 = obj1;
        obj3 = s;
        obj5 = s2;
        obj4 = obj1;
        ((Constructor) (obj1)).setAccessible(true);
        obj2 = obj1;
        obj3 = s;
        obj5 = s2;
        obj4 = obj1;
        s = ((WebSettings)((Constructor) (obj1)).newInstance(new Object[] {
            mContext, null
        })).getUserAgentString();
        obj2 = obj1;
        obj3 = s;
        obj5 = s2;
        obj4 = obj1;
        s2 = (new StringBuilder()).append(s2).append("\nMethod 3 successful.").toString();
        obj2 = s2;
        obj4 = s;
        obj5 = obj2;
        if (obj1 != null)
        {
            ((Constructor) (obj1)).setAccessible(false);
            obj5 = obj2;
            obj4 = s;
        }
_L2:
        Logging.Log((new StringBuilder()).append("user agent result: ").append(((String) (obj5))).toString());
        return ((String) (obj4));
        obj2;
        obj3 = new StringWriter();
        ((Exception) (obj2)).printStackTrace(new PrintWriter(((java.io.Writer) (obj3))));
        Logging.LogError(((StringWriter) (obj3)).toString());
        obj1 = (new StringBuilder()).append(((String) (obj1))).append("\nError with user agent second method: ").append(((Exception) (obj2)).toString()).append("\n").append(((StringWriter) (obj3)).toString()).append("\n userAgent = error.").toString();
          goto _L1
        Object obj;
        obj;
        obj4 = obj2;
        obj1 = new StringWriter();
        obj4 = obj2;
        ((Exception) (obj)).printStackTrace(new PrintWriter(((java.io.Writer) (obj1))));
        obj4 = obj2;
        Logging.LogError(((StringWriter) (obj1)).toString());
        obj4 = obj2;
        String s1 = (new StringBuilder()).append(((String) (obj5))).append("\nError with user agent third method: ").append(((Exception) (obj)).toString()).append("\n").append(((StringWriter) (obj1)).toString()).append("\n userAgent = error.").toString();
        obj4 = obj3;
        obj5 = s1;
        if (obj2 != null)
        {
            ((Constructor) (obj2)).setAccessible(false);
            obj4 = obj3;
            obj5 = s1;
        }
          goto _L2
        s1;
        if (obj4 != null)
        {
            ((Constructor) (obj4)).setAccessible(false);
        }
        throw s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean haveAttributionData()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (attributionDataPrefs != null)
        {
            flag = flag1;
            if (!attributionDataPrefs.getAll().isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

    private static void httpsError(Exception exception)
    {
        (new Thread(exception) {

            final Exception val$e;

            public void run()
            {
                Object obj;
                Feature.badInit = true;
                Object obj1 = e.getMessage();
                obj = new JSONObject();
                ((JSONObject) (obj)).put("message", obj1);
                ((JSONObject) (obj)).put("os_version", Feature.getOSVersion());
                ((JSONObject) (obj)).put("device", (new StringBuilder()).append(Feature.getModel()).append("-").append(Feature.getCarrier()).toString());
                obj1 = new JSONObject();
                ((JSONObject) (obj1)).put("kochava_device_id", Feature.getDeviceId());
                ((JSONObject) (obj1)).put("action", "error");
                ((JSONObject) (obj1)).put("data", obj);
                ((JSONObject) (obj1)).put("kochava_app_id", Feature.mAppId);
                ((JSONObject) (obj1)).put("sdk_version", (new StringBuilder()).append("Android20150511").append(Feature.versionExtension).toString());
                obj = new DefaultHttpClient();
                HttpProtocolParams.setUserAgent(((DefaultHttpClient) (obj)).getParams(), Feature.mUserAgent);
                Object obj2 = ((JSONObject) (obj1)).toString();
                Logging.Log((new StringBuilder()).append("https log - posting to ").append("http://").append(Feature.hostControl).append("/track/kvTracker.php").toString());
                Logging.Log((new StringBuilder()).append("https log data: ").append(((String) (obj2))).toString());
                obj1 = new HttpPost((new StringBuilder()).append("http://").append(Feature.hostControl).append("/track/kvTracker.php").toString());
                obj2 = new StringEntity((new StringBuilder()).append("[").append(((String) (obj2))).append("]").toString(), "UTF-8");
                BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
                ((HttpPost) (obj1)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
                ((StringEntity) (obj2)).setContentType(basicheader);
                ((HttpPost) (obj1)).setEntity(((HttpEntity) (obj2)));
                Logging.Log("Trying to post an https failure log.");
                obj = ((DefaultHttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj1))).getEntity();
                if (obj == null)
                {
                    try
                    {
                        Logging.Log("https failure - did not get response back");
                        return;
                    }
                    catch (Exception exception1)
                    {
                        Logging.LogError((new StringBuilder()).append("httpsFail ").append(exception1).toString());
                    }
                    break MISSING_BLOCK_LABEL_417;
                }
                Logging.Log("https failure log, Grabbing Result...");
                obj = StringUtils.inputStreamToString(((HttpEntity) (obj)).getContent());
                Logging.Log((new StringBuilder()).append("https failure log, Result: ").append(((String) (obj))).toString());
                return;
            }

            
            {
                e = exception;
                super();
            }
        }).start();
    }

    private void init(Context context, final boolean sendOnStart, HashMap hashmap)
    {
        if (context == null) goto _L2; else goto _L1
_L1:
        mContext = context;
        Logging.Log((new StringBuilder()).append("Feature initialization. Library version: Android20150511").append(versionExtension).toString());
        if (appContext == null)
        {
            appContext = context.getApplicationContext();
        }
        eventFlushTimer = new Timer();
        prefs = mContext.getSharedPreferences("initPrefs", 0);
        kDbAdapter = new DbAdapter(mContext);
        if (hashmap != null)
        {
            if (hashmap.get("debug") != null && hashmap.get("debug").getClass().equals(java/lang/Boolean))
            {
                boolean flag = ((Boolean)hashmap.get("debug")).booleanValue();
                enableDebug(flag);
                setErrorDebug(flag);
            }
            if (hashmap.get("version_extension") != null && hashmap.get("version_extension").getClass().equals(java/lang/String))
            {
                versionExtension = (String)hashmap.get("version_extension");
            }
            if (hashmap.get("override_automatic_sessions") != null && hashmap.get("override_automatic_sessions").getClass().equals(java/lang/Boolean))
            {
                overrideAutomaticSessions = ((Boolean)hashmap.get("override_automatic_sessions")).booleanValue();
            }
            if (hashmap.get("suppress_adid_gather") != null && hashmap.get("suppress_adid_gather").getClass().equals(java/lang/Boolean))
            {
                suppress_adid = ((Boolean)hashmap.get("suppress_adid_gather")).booleanValue();
            }
            if (hashmap.get("flush_in_background") != null && hashmap.get("flush_in_background").getClass().equals(java/lang/Boolean))
            {
                should_flush_in_background = ((Boolean)hashmap.get("flush_in_background")).booleanValue();
            }
        }
        initHandler();
        String s1;
        Object obj;
        String s2;
        String s3;
        Object obj1;
        Object obj2;
        String s4;
        String s5;
        Object obj3;
        String s6;
        Object obj4;
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 14 && !overrideAutomaticSessions)
        {
            Log.i("KochavaTracker", (new StringBuilder()).append("using automatic sessions, overrideAutomaticSessions= ").append(overrideAutomaticSessions).toString());
            ((Application)appContext).registerActivityLifecycleCallbacks(new LifeCycleTracker());
            appContext.registerComponentCallbacks(new MemoryBoss());
            AppLifeCycleStatusManager.active = true;
            AppLifeCycleStatusManager.resumed = true;
        } else
        {
            Log.i("KochavaTracker", (new StringBuilder()).append("not using automatic sessions, overrideAutomaticSessions= ").append(overrideAutomaticSessions).toString());
        }
        try
        {
            mFbId = getAttributionId(mContext.getContentResolver());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (!suppress_adid)
        {
            (new AsyncTask() {

                final Feature this$0;

                protected volatile Object doInBackground(Object aobj[])
                {
                    return doInBackground((Void[])aobj);
                }

                protected transient String doInBackground(Void avoid[])
                {
                    try
                    {
                        avoid = getAdvertisingId();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        Logging.LogError("*****NOTICE***** \nAn error has occured when trying to gather the Google Advertising Id. Please make sure you have the Google Play Services Library integrated in your app! \n*****NOTICE*****");
                        return null;
                    }
                    return avoid;
                }

                protected volatile void onPostExecute(Object obj5)
                {
                    onPostExecute((String)obj5);
                }

                protected void onPostExecute(String s7)
                {
                    Feature.advertisingID = s7;
                    Logging.Log("ADID retrevial finished and gathered if available.");
                }

            
            {
                this$0 = Feature.this;
                super();
            }
            }).execute(new Void[0]);
        }
        try
        {
            mAppPackageName = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).packageName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        kvinitdata = new JSONObject();
        kvinitdataholder = new JSONObject();
        kvinitorigdata = new JSONObject();
        s6 = null;
        s1 = null;
        obj1 = null;
        obj = null;
        obj3 = null;
        context = null;
        obj2 = null;
        s2 = null;
        s4 = null;
        s3 = null;
        s5 = null;
        obj4 = null;
        if (hashmap != null)
        {
            String s = s1;
            if (hashmap.get("partner_name") != null)
            {
                s = s1;
                if (hashmap.get("partner_name").getClass().equals(java/lang/String))
                {
                    s = (String)hashmap.get("partner_name");
                }
            }
            s1 = ((String) (obj));
            if (hashmap.get("kochava_app_id") != null)
            {
                s1 = ((String) (obj));
                if (hashmap.get("kochava_app_id").getClass().equals(java/lang/String))
                {
                    s1 = (String)hashmap.get("kochava_app_id");
                }
            }
            obj = context;
            if (hashmap.get("currency") != null)
            {
                obj = context;
                if (hashmap.get("currency").getClass().equals(java/lang/String))
                {
                    obj = (String)hashmap.get("currency");
                }
            }
            context = s2;
            if (hashmap.get("request_attribution") != null)
            {
                if (hashmap.get("request_attribution").getClass().equals(java/lang/String))
                {
                    context = (String)hashmap.get("request_attribution");
                } else
                {
                    context = s2;
                    if (hashmap.get("request_attribution").getClass().equals(java/lang/Boolean))
                    {
                        context = s2;
                        if (((Boolean)hashmap.get("request_attribution")).booleanValue())
                        {
                            context = "true";
                        }
                    }
                }
            }
            s2 = s3;
            if (hashmap.get("bidder_host") != null)
            {
                s2 = s3;
                if (hashmap.get("bidder_host").getClass().equals(java/lang/String))
                {
                    s2 = (String)hashmap.get("bidder_host");
                }
            }
            s3 = obj4;
            if (hashmap.get("control_host") != null)
            {
                s3 = obj4;
                if (hashmap.get("control_host").getClass().equals(java/lang/String))
                {
                    s3 = (String)hashmap.get("control_host");
                }
            }
            if (hashmap.get("app_limit_tracking") != null && hashmap.get("app_limit_tracking").getClass().equals(java/lang/Boolean))
            {
                app_limit_tracking = ((Boolean)hashmap.get("app_limit_tracking")).booleanValue();
            }
            if (hashmap.get("identity_link") != null && (hashmap.get("identity_link") instanceof HashMap))
            {
                try
                {
                    identityLinkMap = (HashMap)hashmap.get("identity_link");
                    identityLinkMapJSON = new JSONObject();
                    for (obj1 = identityLinkMap.entrySet().iterator(); ((Iterator) (obj1)).hasNext(); ((Iterator) (obj1)).remove())
                    {
                        obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                        identityLinkMapJSON.put((String)((java.util.Map.Entry) (obj2)).getKey(), (String)((java.util.Map.Entry) (obj2)).getValue());
                    }

                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
            }
            if (hashmap.get("clickData") != null && hashmap.get("clickData").getClass().equals(java/lang/String))
            {
                clickData = (String)hashmap.get("clickData");
            }
            obj1 = s1;
            obj2 = context;
            s4 = s2;
            s5 = s3;
            obj3 = obj;
            s6 = s;
            if (hashmap.get("flush_rate") != null)
            {
                obj1 = s1;
                obj2 = context;
                s4 = s2;
                s5 = s3;
                obj3 = obj;
                s6 = s;
                if (hashmap.get("flush_rate").getClass().equals(java/lang/Integer))
                {
                    i = ((Integer)hashmap.get("flush_rate")).intValue();
                    if (i < 1)
                    {
                        Logging.Log((new StringBuilder()).append("Trying to set flush rate to: ").append(i).append(". Flush rate can only be set to between 1 minute and 6 hours (360 minutes). Setting flush rate to 1 minute.").toString());
                        s6 = s;
                        obj3 = obj;
                        s5 = s3;
                        s4 = s2;
                        obj2 = context;
                        obj1 = s1;
                    } else
                    if (i > 360)
                    {
                        Logging.Log((new StringBuilder()).append("Trying to set flush rate to: ").append(i).append(". Flush rate can only be set to between 1 minute and 6 hours (360 minutes). Setting flush rate to 6 hours.").toString());
                        flush_rate = 0x1499700;
                        obj1 = s1;
                        obj2 = context;
                        s4 = s2;
                        s5 = s3;
                        obj3 = obj;
                        s6 = s;
                    } else
                    {
                        flush_rate = i * 60 * 1000;
                        Logging.Log((new StringBuilder()).append("Flush rate set to ").append(i).append(" minutes.").toString());
                        obj1 = s1;
                        obj2 = context;
                        s4 = s2;
                        s5 = s3;
                        obj3 = obj;
                        s6 = s;
                    }
                }
            }
        }
        if (s5 != null && s5.trim().length() != 0)
        {
            hostControl = s5;
        }
        if (s4 != null && s4.trim().length() != 0)
        {
            hostBidder = s4;
        }
        if (obj3 != null && ((String) (obj3)).length() != 0)
        {
            setCurrency(((String) (obj3)));
        }
        if (obj2 != null && ((String) (obj2)).equalsIgnoreCase("true"))
        {
            requestAttributionData = true;
        }
        attributionDataPrefs = mContext.getSharedPreferences("attributionPref", 0);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (((String) (obj1)).trim().length() == 0) goto _L4; else goto _L5
_L5:
        mAppId = ((String) (obj1));
        kvinitdataholder.put("kochava_app_id", obj1);
        kvinitorigdata.put("kochava_app_id", obj1);
        if (prefs.getString("kochavaappdata", "").equals(""))
        {
            prefs.edit().putString("kochavaappdata", ((String) (obj1))).commit();
        }
_L6:
        kvinitdata.put("package", getAppPackageName());
        kvinitdata.put("platform", "android");
        kvinitdata.put("session_tracking", "full");
        kvinitdata.put("currency", prefs.getString("currency", "USD"));
        kvinitorigdata.put("currency", prefs.getString("currency", "USD"));
        kvinitorigdata.put("session_tracking", "full");
        kvinitorigdata.put("currency", prefs.getString("currency", "USD"));
        kvinitdataholder.put("sdk_version", (new StringBuilder()).append("Android20150511").append(versionExtension).toString());
        kvinitdataholder.put("sdk_protocol", "3");
        kvinitdataholder.put("data", kvinitdata);
        kvinitdataholder.put("data_orig", kvinitorigdata);
_L7:
        startTime = System.currentTimeMillis() / 1000L;
        i = 0;
        hashmap = "";
        context = new ComponentName(mContext, com/kochava/android/tracker/ReferralCapture);
        try
        {
            mContext.getPackageManager().getReceiverInfo(context, 0);
            Logging.Log("Receiver registered.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            i = 1;
            hashmap = (new StringBuilder()).append("").append("\n    BROADCAST RECEIVER REGISTRATION MISSING: com.kochava.android.tracker.ReferralCapture").toString();
        }
        context = hashmap;
        if (mContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", mContext.getPackageName()) < 0)
        {
            i = 1;
            context = (new StringBuilder()).append(hashmap).append("\n    PERMMISION MISSING: android.permission.ACCESS_NETWORK_STATE").toString();
        }
        hashmap = context;
        if (mContext.getPackageManager().checkPermission("android.permission.INTERNET", mContext.getPackageName()) < 0)
        {
            i = 1;
            hashmap = (new StringBuilder()).append(context).append("\n    PERMMISION MISSING: android.permission.INTERNET").toString();
        }
        context = hashmap;
        if (mContext.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", mContext.getPackageName()) < 0)
        {
            i = 1;
            context = (new StringBuilder()).append(hashmap).append("\n    PERMMISION MISSING: android.permission.ACCESS_WIFI_STATE").toString();
        }
        if (i != 0)
        {
            Logging.LogRequirementsError("**NOTICE** The following items may not have been implemented correctly. Please refer to the SDK documentation to resolve these issues:");
            Logging.LogRequirementsError(context);
        }
        try
        {
            mIMEI = ((TelephonyManager)mContext.getSystemService("phone")).getDeviceId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logging.LogError((new StringBuilder()).append("Couldn't gather IMEI: ").append(context.toString()).toString());
        }
        try
        {
            mMacAddr = ((WifiManager)mContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            kvinitdataholder.put("kochava_device_id", getDeviceId());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        context = new Runnable() {

            final Feature this$0;
            final boolean val$sendOnStart;

            public void run()
            {
                Object obj5;
                Logging.Log("getKVinit thread started.");
                Logging.Log((new StringBuilder()).append("getKVinit post: ").append(kvinitdataholder.toString()).toString());
                obj5 = Feature.createHttpClient(true);
                HttpProtocolParams.setUserAgent(((HttpClient) (obj5)).getParams(), Feature.mUserAgent);
                if (Feature.hostControl == null || Feature.hostControl.trim().isEmpty())
                {
                    Logging.Log("KVinit - hostControl was empty, using default");
                    Feature.hostControl = "control.kochava.com";
                }
                Logging.Log((new StringBuilder()).append("KVinit - posting to ").append("https://").append(Feature.hostControl).append("/track/kvinit").toString());
                HttpPost httppost = new HttpPost((new StringBuilder()).append("https://").append(Feature.hostControl).append("/track/kvinit").toString());
                Object obj7 = kvinitdataholder.toString();
                Logging.Log((new StringBuilder()).append("kvinit data:").append(((String) (obj7))).toString());
                obj7 = new StringEntity(((String) (obj7)), "UTF-8");
                BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
                httppost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
                ((StringEntity) (obj7)).setContentType(basicheader);
                httppost.setEntity(((HttpEntity) (obj7)));
                Logging.Log("Trying to post to KVinit.");
                obj5 = ((HttpClient) (obj5)).execute(httppost).getEntity();
                if (obj5 != null) goto _L2; else goto _L1
_L1:
                Logging.Log("Could not get a response entity from KVinit.");
_L21:
                return;
_L2:
                Logging.Log("(KVinit) Grabbing Result...");
                obj5 = StringUtils.inputStreamToString(((HttpEntity) (obj5)).getContent());
                Logging.Log((new StringBuilder()).append("(KVinit) Result: ").append(((String) (obj5))).toString());
                Object obj6 = null;
                obj5 = new JSONObject(((String) (obj5)));
                obj6 = obj5;
_L14:
                if (obj6 == null) goto _L4; else goto _L3
_L3:
                Logging.Log((new StringBuilder()).append("(KVinit) Parsed result: ").append(((JSONObject) (obj6)).toString()).toString());
                obj5 = null;
                JSONObject jsonobject = ((JSONObject) (obj6)).getJSONObject("flags");
                obj5 = jsonobject;
                Logging.Log((new StringBuilder()).append("Flags: ").append(jsonobject.toString()).toString());
                obj5 = jsonobject;
_L16:
                if (obj5 == null) goto _L6; else goto _L5
_L5:
                String s7 = ((JSONObject) (obj5)).getString("kochava_app_id");
                Logging.Log((new StringBuilder()).append("app_id: ").append(s7.toString()).toString());
                Feature.mAppId = s7;
_L17:
                if (((JSONObject) (obj5)).get("session_tracking").equals("none"))
                {
                    Feature.canSendSession = false;
                }
_L22:
                InterruptedException interruptedexception;
                JSONException jsonexception;
                int j;
                int k;
                boolean flag1;
                boolean flag2;
                boolean flag3;
                try
                {
                    String s8 = ((String)((JSONObject) (obj5)).get("currency")).toUpperCase();
                    Logging.Log((new StringBuilder()).append("setting currency to: ").append(s8).toString());
                    setCurrency(s8);
                }
                catch (Exception exception2) { }
                try
                {
                    if (((JSONObject) (obj5)).get("resend_initial").equals("true"))
                    {
                        Logging.Log("resend_initial flag triggered.");
                        Feature.prefs = mContext.getSharedPreferences("initPrefs", 0);
                        Feature.prefs.edit().putString("initBool", "false").commit();
                    }
                }
                catch (Exception exception1) { }
                Feature.referrerDelayFromInit = ((Integer)((JSONObject) (obj5)).get("delay_for_referrer_data")).intValue();
                if (Feature.referrerDelayFromInit >= 0) goto _L8; else goto _L7
_L7:
                Logging.Log((new StringBuilder()).append("referrerDelayFromInit returned was less than 0 (").append(Feature.referrerDelayFromInit).append("), setting referrerDelayFromInit to 0.").toString());
                Feature.referrerDelayFromInit = 0;
_L6:
                obj5 = ((JSONObject) (obj6)).getJSONArray("blacklist");
                Logging.Log((new StringBuilder()).append("blacklist: ").append(((JSONArray) (obj5)).toString()).toString());
                j = 0;
_L13:
                if (j >= ((JSONArray) (obj5)).length()) goto _L10; else goto _L9
_L9:
                if (!((JSONArray) (obj5)).get(j).toString().toLowerCase().equals("android_id")) goto _L12; else goto _L11
_L11:
                Logging.Log("disabling: android_id");
                Feature.paramRestrictions.put("android_id", Boolean.valueOf(false));
_L25:
                j++;
                  goto _L13
                obj5;
                Logging.Log((new StringBuilder()).append("Error while parsing result json: ").append(((JSONException) (obj5)).toString()).toString());
                  goto _L14
                obj5;
                if (obj5.getClass().equals(javax/net/ssl/SSLException))
                {
                    Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj5).toString());
                    Feature.httpsError(((Exception) (obj5)));
                    return;
                }
                  goto _L15
                jsonexception;
                Logging.Log("KVinit response did not contain flags.");
                  goto _L16
                obj5;
                try
                {
                    Logging.LogError((new StringBuilder()).append("TrackTask").append(obj5).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj5)
                {
                    Logging.LogError((new StringBuilder()).append("TrackTask").append(obj5).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj5)
                {
                    if (obj5.getClass().equals(javax/net/ssl/SSLException))
                    {
                        Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj5).toString());
                        Feature.httpsError(((Exception) (obj5)));
                        return;
                    } else
                    {
                        Logging.LogError((new StringBuilder()).append("TrackTask").append(obj5).toString());
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj5)
                {
                    Logging.LogError((new StringBuilder()).append("Unexpected error during KVinit communication.").append(obj5).toString());
                }
                  goto _L4
                jsonexception;
                Logging.LogError("KVinit response did not contain a app_id.");
                  goto _L17
_L4:
                Logging.Log("getKVinit thread ended, sending message to initHandler.");
                k = 0;
                if (Feature.prefs.getString("initBool", "").equals("true")) goto _L19; else goto _L18
_L18:
                if (!((Boolean)Feature.paramRestrictions.get("adid")).booleanValue())
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                flag3 = Feature.suppress_adid;
_L34:
label0:
                {
                    if (k >= Feature.referrerDelayFromInit)
                    {
                        break label0;
                    }
                    if (!Feature.prefs.getString("initData", "noData").equals("noData"))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (Feature.advertisingID != null)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                }
                  goto _L20
_L33:
                Logging.Log((new StringBuilder()).append("finished referrer data wait ").append(k).append(" seconds.").toString());
_L35:
                obj5 = Message.obtain();
                obj6 = new Bundle();
                ((Bundle) (obj6)).putBoolean("sendonstart", sendOnStart);
                ((Message) (obj5)).setData(((Bundle) (obj6)));
                if (initHandler != null)
                {
                    Logging.Log("sending message to initHandler.");
                    initHandler.sendMessage(((Message) (obj5)));
                    return;
                }
                  goto _L21
                jsonexception;
                Logging.LogError("KVinit response did not contain flags.");
                  goto _L22
_L8:
label1:
                {
                    if (Feature.referrerDelayFromInit <= 120)
                    {
                        break label1;
                    }
                    Logging.Log((new StringBuilder()).append("referrerDelayFromInit returned was greater than 120 (").append(Feature.referrerDelayFromInit).append("), setting referrerDelayFromInit to 120.").toString());
                    Feature.referrerDelayFromInit = 120;
                }
                  goto _L6
                Logging.Log((new StringBuilder()).append("setting referrerDelayFromInit to: ").append(Feature.referrerDelayFromInit).toString());
                  goto _L6
_L12:
                if (!((JSONArray) (obj5)).get(j).toString().toLowerCase().equals("fb_attribution_id")) goto _L24; else goto _L23
_L23:
                Logging.Log("disabling: fb_attribution_id");
                Feature.paramRestrictions.put("fb_attribution_id", Boolean.valueOf(false));
                  goto _L25
                obj5;
                Logging.Log("KVinit response did not contain a blacklist.");
_L10:
                obj5 = ((JSONObject) (obj6)).getJSONArray("whitelist");
                Logging.Log((new StringBuilder()).append("whitelist: ").append(((JSONArray) (obj5)).toString()).toString());
                j = 0;
_L27:
                if (j >= ((JSONArray) (obj5)).length())
                {
                    break; /* Loop/switch isn't completed */
                }
                if (((JSONArray) (obj5)).get(j).toString().toLowerCase().equals("email"))
                {
                    Logging.Log("sending emails");
                    Feature.sendEmails = true;
                }
                j++;
                if (true) goto _L27; else goto _L26
_L24:
label2:
                {
                    if (!((JSONArray) (obj5)).get(j).toString().toLowerCase().equals("imei"))
                    {
                        break label2;
                    }
                    Logging.Log("disabling: imei");
                    Feature.paramRestrictions.put("imei", Boolean.valueOf(false));
                }
                  goto _L25
label3:
                {
                    if (!((JSONArray) (obj5)).get(j).toString().toLowerCase().equals("mac"))
                    {
                        break label3;
                    }
                    Logging.Log("disabling: mac");
                    Feature.paramRestrictions.put("mac", Boolean.valueOf(false));
                }
                  goto _L25
                if (!((JSONArray) (obj5)).get(j).toString().toLowerCase().equals("odin")) goto _L29; else goto _L28
_L28:
                Logging.Log("disabling: odin");
                Feature.paramRestrictions.put("odin", Boolean.valueOf(false));
                  goto _L25
_L29:
                if (!((JSONArray) (obj5)).get(j).toString().toLowerCase().equals("adid")) goto _L25; else goto _L30
_L30:
                Logging.Log("disabling: adid");
                Feature.paramRestrictions.put("adid", Boolean.valueOf(false));
                  goto _L25
                obj5;
_L26:
                obj5 = ((JSONObject) (obj6)).getJSONArray("eventname_blacklist");
                Logging.Log((new StringBuilder()).append("saving eventname_blacklist: ").append(((JSONArray) (obj5)).toString()).toString());
                Feature.eventnameBlacklist.clear();
                j = 0;
_L31:
                if (j >= ((JSONArray) (obj5)).length())
                {
                    break MISSING_BLOCK_LABEL_1621;
                }
                Logging.Log((new StringBuilder()).append("eventname_blacklist item: ").append(((JSONArray) (obj5)).get(j).toString()).toString());
                Feature.eventnameBlacklist.add(((JSONArray) (obj5)).get(j).toString());
                j++;
                  goto _L31
                obj5;
                Logging.Log("KVinit response did not contain an eventname_blacklist.");
                obj5 = ((JSONObject) (obj6)).getString("error");
                Logging.LogError((new StringBuilder()).append("There was a problem getting the KVinit response: ").append(((String) (obj5))).toString());
                if (((String) (obj5)).equals("invalid kochava_app_id, partner_name required for app_id autoprovisioning"))
                {
                    Feature.badInit = true;
                    return;
                }
                  goto _L4
                obj5;
                Logging.Log("KVinit response did not contain an error.");
                  goto _L4
_L15:
                Logging.LogError((new StringBuilder()).append("TrackTask").append(obj5).toString());
                return;
_L20:
                if (flag1 && (j != 0 || flag3) || flag1 && flag2) goto _L33; else goto _L32
_L32:
                try
                {
                    Thread.sleep(1000L);
                }
                // Misplaced declaration of an exception variable
                catch (InterruptedException interruptedexception)
                {
                    Logging.LogError((new StringBuilder()).append("Unexpected error during referral data wait loop ").append(interruptedexception).toString());
                }
                k++;
                  goto _L34
_L19:
                Logging.Log("already sent initial, skiping any referrer data wait");
                  goto _L35
                Exception exception;
                exception;
                  goto _L6
            }

            
            {
                this$0 = Feature.this;
                sendOnStart = flag;
                super();
            }
        };
        worker.schedule(context, 5L, TimeUnit.SECONDS);
        tryUpdate("init");
        return;
_L2:
        Logging.LogError("Context you passed was null, cannot initialize.");
        badInit = true;
        return;
_L4:
        if (s6 == null)
        {
            break MISSING_BLOCK_LABEL_2272;
        }
        if (s6.trim().length() == 0)
        {
            break MISSING_BLOCK_LABEL_2272;
        }
        kvinitdata.put("partner_name", s6);
        if (prefs.getString("kochavaappdata", "").equals(""))
        {
            prefs.edit().putString("kochavaappdata", s6).commit();
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_2245;
        }
        if (((String) (obj1)).trim().length() == 0)
        {
            break MISSING_BLOCK_LABEL_2245;
        }
        mAppId = ((String) (obj1));
        kvinitdataholder.put("kochava_app_id", obj1);
        kvinitorigdata.put("kochava_app_id", obj1);
          goto _L6
        mAppId = (new StringBuilder()).append("_p:").append(s6).toString();
          goto _L6
        try
        {
            Logging.LogError("You must pass either an app id, or a partner name into the datamap during initialization.");
            badInit = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logging.LogError((new StringBuilder()).append("Error building KVinit json object: ").append(context.toString()).toString());
        }
          goto _L7
    }

    private void initHandler()
    {
        if (initHandler == null)
        {
            initHandler = new Handler() {

                final Feature this$0;

                public void handleMessage(Message message)
                {
                    boolean flag = message.getData().getBoolean("sendonstart");
                    initialHandlerActions();
                    if (!flag)
                    {
                        initTimer.schedule(new TimerTask() {

                            final _cls10 this$1;

                            public void run()
                            {
                                Logging.Log("Reached 10 min mark w/o sending initial, sending now.");
                                queInitial(false);
                            }

            
            {
                this$1 = _cls10.this;
                super();
            }
                        }, 0x927c0L);
                        return;
                    } else
                    {
                        initTimer.schedule(new TimerTask() {

                            final _cls10 this$1;

                            public void run()
                            {
                                Logging.Log("Scheduling timer to que initial event if needed.");
                                queInitial(false);
                            }

            
            {
                this$1 = _cls10.this;
                super();
            }
                        }, 2000L);
                        mTimerSendOnBegin = new Timer();
                        mTimerSendOnBegin.schedule(new TimerTask() {

                            final _cls10 this$1;

                            public void run()
                            {
                                Feature.flush();
                            }

            
            {
                this$1 = _cls10.this;
                super();
            }
                        }, 4000L);
                        return;
                    }
                }

            
            {
                this$0 = Feature.this;
                super();
            }
            };
        }
    }

    private void initialHandlerActions()
    {
        boolean flag1;
        flag1 = false;
        mUserAgent = getUserAgent();
        mCarrier = getCarrier();
        mModel = getModel();
        mAppName = "Default";
        mAppVersionCode = "N/A";
        mAppVersionName = "";
        PackageManager packagemanager = mContext.getApplicationContext().getPackageManager();
        Object obj = packagemanager.getApplicationInfo(mContext.getPackageName(), 0);
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_710;
        }
        obj = packagemanager.getApplicationLabel(((android.content.pm.ApplicationInfo) (obj)));
_L3:
        mAppName = (String)(String)obj;
        Logging.Log((new StringBuilder()).append("mAppName now: ").append(mAppName).toString());
_L2:
label0:
        {
            try
            {
                mAppVersionCode = (new StringBuilder()).append(mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionCode).append("").toString();
                Logging.Log((new StringBuilder()).append("mAppVersionCode now: ").append(mAppVersionCode).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.LogError((new StringBuilder()).append("Error gathering app version code ").append(((Exception) (obj)).toString()).toString());
            }
            try
            {
                mAppVersionName = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionName;
                Logging.Log((new StringBuilder()).append("mAppVersionName now: ").append(mAppVersionName).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.LogError((new StringBuilder()).append("Error gathering app version name ").append(((Exception) (obj)).toString()).toString());
            }
            try
            {
                obj = (WindowManager)mContext.getSystemService("window");
                mDisplayHeight = ((WindowManager) (obj)).getDefaultDisplay().getHeight();
                mDisplayWidth = ((WindowManager) (obj)).getDefaultDisplay().getWidth();
                Logging.Log((new StringBuilder()).append("Height: ").append(mDisplayHeight).append(" | Width: ").append(mDisplayWidth).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.LogError((new StringBuilder()).append("Error ").append(((Exception) (obj)).toString()).toString());
            }
            mAndroidID = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
            mDeviceId = getDeviceId();
            prefs = mContext.getSharedPreferences("initPrefs", 0);
            if (prefs.getString("initBool", "").equals(""))
            {
                prefs.edit().putString("initBool", "false").commit();
            }
            if (prefs.getString("kochavaappdata", null) != null)
            {
                obj = kDbAdapter.getApplicationData(prefs.getString("kochavaappdata", null));
                String s = createAppData();
                Logging.Log((new StringBuilder()).append("Stored Data: ").append(((String) (obj))).toString());
                Logging.Log((new StringBuilder()).append("Created Data: ").append(s).toString());
                android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
                boolean flag;
                if (obj == null)
                {
                    kDbAdapter.insertApplicationData(prefs.getString("kochavaappdata", null), s);
                } else
                if (!((String) (obj)).equals(s))
                {
                    kDbAdapter.updateApplicationData(prefs.getString("kochavaappdata", null), s);
                } else
                {
                    Logging.Log("Set start of life to false");
                    mIsStartOfLife = false;
                }
            } else
            {
                mIsStartOfLife = false;
            }
            if (mIsStartOfLife || !prefs.getString("initBool", "").equals("") && prefs.getString("initBool", "").equals("false"))
            {
                Logging.Log("Initial event has not yet been qued in the database, making initial call");
                fireEvent("initial", null);
            }
            if (!should_flush_in_background)
            {
                flag = flag1;
                if (should_flush_in_background)
                {
                    break label0;
                }
                flag = flag1;
                if (is_in_background)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (flag && mTimer == null)
        {
            mTimer = new Timer();
            mTimer.schedule(new TimerTask() {

                final Feature this$0;

                public void run()
                {
                    Feature.flush();
                }

            
            {
                this$0 = Feature.this;
                super();
            }
            }, 0L, flush_rate);
        }
        initTimer = new Timer();
        return;
        namenotfoundexception;
        obj = null;
        Logging.LogError((new StringBuilder()).append("Error gathering app name ").append(namenotfoundexception.toString()).toString());
          goto _L1
        obj;
        Logging.LogError((new StringBuilder()).append("Error gathering app name ").append(((Exception) (obj)).toString()).toString());
          goto _L2
        obj = "(unknown)";
          goto _L3
    }

    private static boolean isEmailValid(String s)
    {
        boolean flag = false;
        if (Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(s).matches())
        {
            flag = true;
        }
        return flag;
    }

    private static String postEvent()
    {
        if (prefs.getString("initBool", "").equals("true")) goto _L2; else goto _L1
_L1:
        Object obj;
        Logging.Log("PREF_INIT not true, waiting for initial to be queued");
        obj = "";
_L6:
        return ((String) (obj));
_L2:
        Object obj2;
        HttpPost httppost;
        boolean flag;
        long l;
        obj = kDbAdapter.generateDataString();
        if (obj == null)
        {
            return "";
        }
        obj = new StringTokenizer(((String) (obj)), "=");
        l = Long.parseLong(((StringTokenizer) (obj)).nextToken());
        obj2 = ((StringTokenizer) (obj)).nextToken();
        obj = obj2;
        if (((String) (obj2)).startsWith("["))
        {
            obj = ((String) (obj2)).substring(1);
        }
        obj2 = obj;
        if (((String) (obj)).endsWith("]"))
        {
            obj2 = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
        }
        Logging.Log((new StringBuilder()).append("Post The Data 3>>>>>>").append(((String) (obj2))).toString());
        flag = false;
        if (((String) (obj2)).contains("\"action\":\"initial\""))
        {
            Logging.LogError("Post Data: Event is initial, look at response");
            flag = true;
        }
        obj = createHttpClient(false);
        HttpProtocolParams.setUserAgent(((HttpClient) (obj)).getParams(), mUserAgent);
        if (hostControl == null || hostControl.trim().isEmpty())
        {
            Logging.Log("postEvent - hostControl was empty, using default");
            hostControl = "control.kochava.com";
        }
        Logging.Log((new StringBuilder()).append("postEvent - posting to ").append("https://").append(hostControl).append("/track/kvTracker.php").toString());
        httppost = new HttpPost((new StringBuilder()).append("https://").append(hostControl).append("/track/kvTracker.php").toString());
        obj2 = new StringEntity((new StringBuilder()).append("[").append(((String) (obj2))).append("]").toString(), "UTF-8");
        BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
        httppost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
        ((StringEntity) (obj2)).setContentType(basicheader);
        httppost.setEntity(((HttpEntity) (obj2)));
        Logging.Log("Trying to post an event.");
        obj = ((HttpClient) (obj)).execute(httppost).getEntity();
        if (obj == null)
        {
            return "";
        }
        Logging.Log("Grabbing Result...");
        obj2 = StringUtils.inputStreamToString(((HttpEntity) (obj)).getContent());
        Logging.Log((new StringBuilder()).append("Result: ").append(((String) (obj2))).toString());
        if (!flag) goto _L4; else goto _L3
_L3:
        if (((String) (obj2)).contains("\"success\":\"1\""))
        {
            Logging.Log("Got success response, cleaning database.");
            kDbAdapter.cleanupEvents(l);
        }
        obj = obj2;
        if (haveAttributionData()) goto _L6; else goto _L5
_L5:
        obj = obj2;
        if (!requestAttributionData) goto _L6; else goto _L7
_L7:
        Logging.Log("Requesting attribution data...");
        sendKVQuery(7);
        return ((String) (obj2));
        Object obj1;
        obj1;
        if (!obj1.getClass().equals(javax/net/ssl/SSLException)) goto _L9; else goto _L8
_L8:
        Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj1).toString());
        httpsError(((Exception) (obj1)));
_L11:
        return "";
_L4:
        kDbAdapter.cleanupEvents(l);
        return ((String) (obj2));
        obj1;
        Logging.LogError((new StringBuilder()).append("TrackTask ").append(obj1).toString());
        return "";
_L9:
        try
        {
            Logging.LogError((new StringBuilder()).append("TrackTask ").append(obj1).toString());
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            Logging.LogError((new StringBuilder()).append("TrackTask ").append(clientprotocolexception).toString());
            return "";
        }
        catch (IOException ioexception)
        {
            if (ioexception.getClass().equals(javax/net/ssl/SSLException))
            {
                Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(ioexception).toString());
                httpsError(ioexception);
            } else
            {
                Logging.LogError((new StringBuilder()).append("TrackTask ").append(ioexception).toString());
            }
            return "";
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void queInitial(boolean flag)
    {
        if (!prefs.getString("initBool", "").equals("false") || initialPropertiesObject == null || initialObject == null)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        Logging.Log((new StringBuilder()).append("Initial properties: ").append(initialPropertiesObject).toString());
        Logging.Log((new StringBuilder()).append("Initital Oject: ").append(initialObject).toString());
        if (prefs.getString("initData", "noData").equals("noData"))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        initialPropertiesObject.put("conversion_type", "gplay");
        initialPropertiesObject.put("conversion_data", prefs.getString("initData", ""));
        Logging.Log((new StringBuilder()).append("Got referral, attaching: ").append(prefs.getString("initData", "")).toString());
_L1:
        initialObject.put("data", initialPropertiesObject);
        kDbAdapter.addEvent(initialObject, true);
        Logging.Log("Sending Initial");
        prefs.edit().putString("initBool", "true").commit();
        if (flag)
        {
            try
            {
                initTimer.cancel();
                return;
            }
            catch (JSONException jsonexception)
            {
                Logging.Log((new StringBuilder()).append("An error occured during que initial. ").append(jsonexception).toString());
                jsonexception.printStackTrace();
            }
        }
        break MISSING_BLOCK_LABEL_287;
        Logging.LogError("Did not get referral data.");
          goto _L1
    }

    protected static void sendKVQuery(int i)
    {
        worker.schedule(sendKVQuery, i, TimeUnit.SECONDS);
    }

    public static void setAttributionHandler(Handler handler)
    {
        attributionDataHandler = handler;
    }

    private void setCurrency(String s)
    {
        if (s != null && Global.CURRENCYLIST.contains(s))
        {
            prefs = mContext.getSharedPreferences("initPrefs", 0);
            prefs.edit().putString("currency", s).commit();
            return;
        } else
        {
            Logging.LogError((new StringBuilder()).append("Trying to set currency, but ").append(s).append(" is not a valid currency.").toString());
            return;
        }
    }

    public static void setErrorDebug(boolean flag)
    {
        Log.i("KochavaTracker", (new StringBuilder()).append("setErrorDebug to ").append(flag).toString());
        Global.DEBUGERROR = flag;
    }

    private static void startAppSession()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 14 && !overrideAutomaticSessions)
            {
                if (!badInit)
                {
                    break label0;
                }
                Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            }
            return;
        }
        Logging.Log("Automatic Session start");
        if (!should_flush_in_background)
        {
            if (mTimer == null)
            {
                Logging.Log("Session start, flush timer was off and is not first launch, starting periodic flush timer.");
                mTimer = new Timer();
                mTimer.schedule(new TimerTask() {

                    public void run()
                    {
                        Feature.flush();
                    }

                }, flush_rate, flush_rate);
            } else
            {
                Logging.Log("Session start, flush timer was already on.");
            }
        }
        startTime = System.currentTimeMillis() / 1000L;
        if (canSendSession)
        {
            eventSession("launch");
            return;
        } else
        {
            Logging.Log("Session events disabled by server.");
            return;
        }
    }

    public void clearSuperProperties()
    {
        if (badInit)
        {
            Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            return;
        } else
        {
            Logging.Log("clearSuperProperties");
            mSuperProperties = null;
            return;
        }
    }

    public void deepLinkEvent(String s)
    {
        if (!badInit) goto _L2; else goto _L1
_L1:
        Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
_L4:
        return;
_L2:
        int i;
        Logging.Log((new StringBuilder()).append("Got deep link event with uri").append(s).toString());
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("action", "deeplink");
        jsonobject.put("kochava_app_id", mAppId);
        jsonobject.put("kochava_device_id", getDeviceId());
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("uri", s);
        jsonobject1.put("usertime", (new StringBuilder()).append(System.currentTimeMillis() / 1000L).append("").toString());
        jsonobject.put("data", jsonobject1);
        i = kDbAdapter.addEvent(jsonobject, false);
        Logging.Log((new StringBuilder()).append("deep link event: ").append(jsonobject).toString());
        if (i >= 50)
        {
            try
            {
                flush();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Logging.LogError((new StringBuilder()).append("Error in deep link event call: ").append(s).toString());
            }
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void endSession()
    {
label0:
        {
            if (overrideAutomaticSessions)
            {
                if (!badInit)
                {
                    break label0;
                }
                Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            }
            return;
        }
        Logging.Log("Manual Session End");
        if (!should_flush_in_background)
        {
            if (mTimer != null)
            {
                Logging.Log("Session end, flush timer was on, canceling timer and flushing current events.");
                flush();
                mTimer.cancel();
                mTimer = null;
            } else
            {
                Logging.Log("Session end, flush timer was already off.");
            }
        }
        if (canSendSession)
        {
            eventSession("exit");
            return;
        } else
        {
            Logging.Log("Session events disabled by server.");
            return;
        }
    }

    public void event(String s, String s1)
    {
        if (badInit)
        {
            Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            return;
        }
        try
        {
            Logging.Log((new StringBuilder()).append("Got event ").append(s).toString());
            HashMap hashmap = new HashMap();
            hashmap.put("event_name", s);
            hashmap.put("event_data", s1);
            fireEventBlacklist("event", hashmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logging.LogError((new StringBuilder()).append("Error in event call: ").append(s).toString());
        }
    }

    public void eventSpatial(String s, double d, double d1, double d2, 
            String s1)
    {
        if (badInit)
        {
            Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            return;
        }
        try
        {
            Logging.Log((new StringBuilder()).append("Got event ").append(s).toString());
            HashMap hashmap = new HashMap();
            hashmap.put("event_name", s);
            s = new DecimalFormat("#.##");
            hashmap.put("x", Double.valueOf(s.format(d)).toString());
            hashmap.put("y", Double.valueOf(s.format(d1)).toString());
            hashmap.put("z", Double.valueOf(s.format(d2)).toString());
            hashmap.put("event_data", s1);
            fireEventBlacklist("spatial", hashmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logging.LogError((new StringBuilder()).append("Error in event call: ").append(s).toString());
        }
    }

    public void linkIdentity(Map map)
    {
        if (badInit)
        {
            Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            return;
        } else
        {
            Logging.Log("Mapping identity");
            fireEvent("identityLink", map);
            return;
        }
    }

    public void registerSuperProperties(Map map)
    {
        if (badInit)
        {
            Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
        } else
        {
            Logging.Log("registerSuperProperties");
            if (mSuperProperties == null)
            {
                mSuperProperties = map;
                return;
            }
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                mSuperProperties.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void setAppLimitTracking(boolean flag)
    {
        app_limit_tracking = flag;
        tryUpdate("setAppLimitTracking");
    }

    public void setLatlong(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            Logging.LogError("Trying to set lat/long, but one/both of the parameters where null.");
            return;
        } else
        {
            prefs = mContext.getSharedPreferences("initPrefs", 0);
            prefs.edit().putString("mylat", s).commit();
            prefs.edit().putString("mylong", s1).commit();
            return;
        }
    }

    public void startSession()
    {
label0:
        {
            if (overrideAutomaticSessions)
            {
                if (!badInit)
                {
                    break label0;
                }
                Logging.LogError("The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used.");
            }
            return;
        }
        Logging.Log("Manual Session Start");
        if (!should_flush_in_background)
        {
            if (mTimer == null)
            {
                Logging.Log("Session start, flush timer was off and is not first launch, starting periodic flush timer.");
                mTimer = new Timer();
                mTimer.schedule(new TimerTask() {

                    final Feature this$0;

                    public void run()
                    {
                        Feature.flush();
                    }

            
            {
                this$0 = Feature.this;
                super();
            }
                }, flush_rate, flush_rate);
            } else
            {
                Logging.Log("Session start, flush timer was already on.");
            }
        }
        startTime = System.currentTimeMillis() / 1000L;
        if (canSendSession)
        {
            eventSession("launch");
            return;
        } else
        {
            Logging.Log("Session events disabled by server.");
            return;
        }
    }

    protected void tryUpdate(final String source)
    {
        source = new Runnable() {

            final Feature this$0;
            final String val$source;

            public void run()
            {
                Object obj;
                HashMap hashmap;
                Object obj1;
                Logging.Log((new StringBuilder()).append("Checking watchlist from ").append(source).append("...").toString());
                hashmap = new HashMap();
                Iterator iterator;
                String s;
                if (!Feature.prefs.contains("app_short_string"))
                {
                    Logging.Log((new StringBuilder()).append("No previous app_short_string in watchlist, adding ").append(mAppVersionName).toString());
                    Feature.prefs.edit().putString("app_short_string", mAppVersionName).commit();
                } else
                if (!Feature.prefs.getString("app_short_string", "").equals(mAppVersionName))
                {
                    Logging.Log((new StringBuilder()).append("app_short_string changed! Is now ").append(mAppVersionName).toString());
                    hashmap.put("app_short_string", (new StringBuilder()).append(mAppVersionName).append("").toString());
                    Feature.prefs.edit().putString("app_short_string", mAppVersionName).commit();
                }
_L5:
                if (!Feature.prefs.contains("app_limit_tracking"))
                {
                    Logging.Log((new StringBuilder()).append("No previous app_limit_tracking in watchlist, adding ").append(app_limit_tracking).toString());
                    Feature.prefs.edit().putBoolean("app_limit_tracking", app_limit_tracking).commit();
                } else
                if (Feature.prefs.getBoolean("app_limit_tracking", false) != app_limit_tracking)
                {
                    Logging.Log((new StringBuilder()).append("app_limit_tracking changed! Is now ").append(app_limit_tracking).toString());
                    hashmap.put("app_limit_tracking", (new StringBuilder()).append(app_limit_tracking).append("").toString());
                    Feature.prefs.edit().putBoolean("app_limit_tracking", app_limit_tracking).commit();
                }
                if (!Feature.prefs.contains("app_version"))
                {
                    Logging.Log((new StringBuilder()).append("No previous app_version in watchlist, adding ").append(getAppVersion()).toString());
                    Feature.prefs.edit().putString("app_version", getAppVersion()).commit();
                } else
                if (!Feature.prefs.getString("app_version", "").equals(getAppVersion()))
                {
                    Logging.Log((new StringBuilder()).append("app_version changed! Is now ").append(getAppVersion()).toString());
                    hashmap.put("app_version", (new StringBuilder()).append(getAppVersion()).append("").toString());
                    Feature.prefs.edit().putString("app_version", getAppVersion()).commit();
                }
                if (!Feature.prefs.contains("device_limit_tracking"))
                {
                    Logging.Log((new StringBuilder()).append("No previous device_limit_tracking in watchlist, adding ").append(Feature.device_limit_tracking).toString());
                    Feature.prefs.edit().putBoolean("device_limit_tracking", Feature.device_limit_tracking).commit();
                } else
                if (Feature.prefs.getBoolean("device_limit_tracking", false) != Feature.device_limit_tracking)
                {
                    Logging.Log((new StringBuilder()).append("device_limit_tracking changed! Is now ").append(Feature.device_limit_tracking).toString());
                    hashmap.put("device_limit_tracking", (new StringBuilder()).append(Feature.device_limit_tracking).append("").toString());
                    Feature.prefs.edit().putBoolean("device_limit_tracking", Feature.device_limit_tracking).commit();
                }
                if (!Feature.prefs.contains("adid"))
                {
                    Logging.Log((new StringBuilder()).append("No previous adid in watchlist, adding ").append(Feature.advertisingID).toString());
                    Feature.prefs.edit().putString("adid", Feature.advertisingID).commit();
                } else
                if (!Feature.prefs.getString("adid", "").equals(Feature.advertisingID))
                {
                    Logging.Log((new StringBuilder()).append("adid changed! Is now ").append(Feature.advertisingID).toString());
                    hashmap.put("adid", Feature.advertisingID);
                    Feature.prefs.edit().putString("adid", Feature.advertisingID).commit();
                }
                if (!Feature.prefs.contains("os_version"))
                {
                    Logging.Log((new StringBuilder()).append("No previous os_version in watchlist, adding ").append(Feature.getOSVersion()).toString());
                    Feature.prefs.edit().putString("os_version", Feature.getOSVersion()).commit();
                } else
                if (!Feature.prefs.getString("os_version", "").equals(Feature.getOSVersion()))
                {
                    Logging.Log((new StringBuilder()).append("os_version changed! Is now ").append(Feature.getOSVersion()).toString());
                    hashmap.put("os_version", Feature.getOSVersion());
                    Feature.prefs.edit().putString("os_version", Feature.getOSVersion()).commit();
                }
                if (hashmap.keySet().isEmpty()) goto _L2; else goto _L1
_L1:
                obj = new JSONObject();
                ((JSONObject) (obj)).put("action", "update");
                ((JSONObject) (obj)).put("kochava_device_id", Feature.getDeviceId());
                ((JSONObject) (obj)).put("kochava_app_id", Feature.mAppId);
                obj1 = new JSONObject();
                for (iterator = hashmap.keySet().iterator(); iterator.hasNext(); ((JSONObject) (obj1)).put(s, hashmap.get(s)))
                {
                    s = (String)iterator.next();
                }

                  goto _L3
                obj;
                Logging.LogError((new StringBuilder()).append("Update error: ").append(((Exception) (obj)).toString()).toString());
_L2:
                return;
_L3:
                ((JSONObject) (obj)).put("data", obj1);
                HttpClient httpclient = Feature.createHttpClient(false);
                HttpProtocolParams.setUserAgent(httpclient.getParams(), Feature.mUserAgent);
                if (Feature.hostControl == null || Feature.hostControl.trim().isEmpty())
                {
                    Feature.hostControl = "control.kochava.com";
                }
                Logging.Log((new StringBuilder()).append("posting update to ").append("https://").append(Feature.hostControl).append("/track/kvTracker.php").toString());
                obj1 = new HttpPost((new StringBuilder()).append("https://").append(Feature.hostControl).append("/track/kvTracker.php").toString());
                StringEntity stringentity = new StringEntity(((JSONObject) (obj)).toString(), "UTF-8");
                BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
                ((HttpPost) (obj1)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
                stringentity.setContentType(basicheader);
                ((HttpPost) (obj1)).setEntity(stringentity);
                Logging.Log((new StringBuilder()).append("Trying to post an update: ").append(((JSONObject) (obj)).toString()).toString());
                obj = httpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1))).getEntity();
                if (obj == null) goto _L2; else goto _L4
_L4:
                obj = StringUtils.inputStreamToString(((HttpEntity) (obj)).getContent());
                Logging.Log((new StringBuilder()).append("Update Result: ").append(((String) (obj))).toString());
                return;
                  goto _L5
            }

            
            {
                this$0 = Feature.this;
                source = s;
                super();
            }
        };
        worker.schedule(source, 10L, TimeUnit.SECONDS);
    }






/*
    static int access$1002(int i)
    {
        referrerDelayFromInit = i;
        return i;
    }

*/


/*
    static String access$102(String s)
    {
        advertisingID = s;
        return s;
    }

*/



/*
    static boolean access$1202(boolean flag)
    {
        sendEmails = flag;
        return flag;
    }

*/



/*
    static boolean access$1402(boolean flag)
    {
        badInit = flag;
        return flag;
    }

*/




















/*
    static boolean access$3002(boolean flag)
    {
        is_in_background = flag;
        return flag;
    }

*/


/*
    static boolean access$3102(boolean flag)
    {
        event_flush_triggered = flag;
        return flag;
    }

*/






/*
    static Timer access$3602(Feature feature, Timer timer)
    {
        feature.mTimerSendOnBegin = timer;
        return timer;
    }

*/




/*
    static String access$3802(String s)
    {
        hostBidder = s;
        return s;
    }

*/





/*
    static String access$402(String s)
    {
        hostControl = s;
        return s;
    }

*/







/*
    static String access$502(String s)
    {
        mAppId = s;
        return s;
    }

*/


/*
    static boolean access$602(boolean flag)
    {
        canSendSession = flag;
        return flag;
    }

*/




/*
    static SharedPreferences access$802(SharedPreferences sharedpreferences)
    {
        prefs = sharedpreferences;
        return sharedpreferences;
    }

*/

}
