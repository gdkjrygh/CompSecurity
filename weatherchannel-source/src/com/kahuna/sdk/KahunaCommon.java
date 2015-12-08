// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import com.kahuna.sdk.http.AsyncHttpClient;
import com.kahuna.sdk.http.RequestParams;
import com.kahuna.sdk.location.KahunaActivityRecognitionManager;
import com.kahuna.sdk.location.KahunaIBeacon;
import com.kahuna.sdk.location.KahunaIBeaconManager;
import com.kahuna.sdk.location.KahunaRegionManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            IKahuna, Event, KahunaSDKConfiguration, KahunaUtils, 
//            KahunaPreferences, KahunaBackgroundRunnable, EventBucketManager, PushNotConfiguredException, 
//            GCMRegistrar, KahunaUserCredentials, IKahunaUserCredentials, EmptyCredentialsException, 
//            GCMRegistrationManager, PushNotificationsManager, KahunaInAppMessageListener, KahunaSDKUpgradeManager, 
//            KahunaInternalDebugManager, ArchiveContainerObject, EventBuilder, KahunaInAppManager

public abstract class KahunaCommon
    implements IKahuna
{
    private class KahunaTimer extends Timer
    {

        final KahunaCommon this$0;
        private long timerFireTime;

        public long getTimerFireTime()
        {
            return timerFireTime;
        }

        public void schedule(TimerTask timertask, long l)
        {
            timerFireTime = System.currentTimeMillis() + l;
            super.schedule(timertask, l);
        }

        private KahunaTimer()
        {
            this$0 = KahunaCommon.this;
            super();
            timerFireTime = -1L;
        }

    }

    private class SendEventsTask extends TimerTask
    {

        final KahunaCommon this$0;

        public void run()
        {
            synchronized (mConnectionProgressLock)
            {
                mConnectionInProgress = true;
            }
            obj1 = new RequestParams();
            ((RequestParams) (obj1)).put("key", mKahunaSecretKey);
            ((RequestParams) (obj1)).put("dev_id", mDeviceId);
            ((RequestParams) (obj1)).put("app_name", mAppName);
            ((RequestParams) (obj1)).put("app_ver", mAppVersion);
            ((RequestParams) (obj1)).put("os_version", mOSVersion);
            ((RequestParams) (obj1)).put("os_name", mOSName);
            ((RequestParams) (obj1)).put("dev_name", mDeviceName);
            ((RequestParams) (obj1)).put("client_time", (new StringBuilder()).append("").append(System.currentTimeMillis() / 1000L).toString());
            ((RequestParams) (obj1)).put("sdk_version", "2.0.3");
            if (!KahunaUtils.isNullOrEmpty(mPushToken))
            {
                ((RequestParams) (obj1)).put("push_token", mPushToken);
            }
            if (!KahunaUtils.isNullOrEmpty(HYBRID_SDK_KEY) && !KahunaUtils.isNullOrEmpty(HYBRID_SDK_VALUE))
            {
                ((RequestParams) (obj1)).put("sdk_wrapper", HYBRID_SDK_KEY);
                ((RequestParams) (obj1)).put("sdk_wrapper_version", HYBRID_SDK_VALUE);
            }
            Object obj2;
            Object obj3;
            int i;
            int j;
            if (mDebugBuild)
            {
                obj = "s";
            } else
            {
                obj = "p";
            }
            ((RequestParams) (obj1)).put("env", ((String) (obj)));
            ((RequestParams) (obj1)).put("c", (new StringBuilder()).append("").append(mSDKConfig.getVersion()).toString());
            obj = new JSONArray();
            if (KahunaCommon.inAppFeatureSupported)
            {
                ((JSONArray) (obj)).put("iam");
            }
            if (!KahunaCommon.regionMonitoringDeveloperEnabled || !KahunaRegionManager.isDeviceReadyForRegionMonitoring()) goto _L2; else goto _L1
_L1:
            ((JSONArray) (obj)).put("rm");
            obj3 = KahunaRegionManager.getCurrentlyMonitoredRegions(KahunaCommon.this);
            if (((Set) (obj3)).size() <= 0) goto _L2; else goto _L3
_L3:
            obj2 = new JSONArray();
            for (obj3 = ((Set) (obj3)).iterator(); ((Iterator) (obj3)).hasNext(); ((JSONArray) (obj2)).put((String)((Iterator) (obj3)).next())) { }
              goto _L4
            obj2;
_L10:
            if (!KahunaUtils.isNullOrEmpty(((JSONArray) (obj))))
            {
                ((RequestParams) (obj1)).put("fsupported", ((JSONArray) (obj)).toString());
            }
            obj2 = new JSONArray();
            mEventsInProgress = new ArrayList();
            obj = mEventsLock;
            obj;
            JVM INSTR monitorenter ;
            if (mNumEventsToContinueFlushing.get() <= 0)
            {
                mNumEventsToContinueFlushing.set(mEventsQueue.size());
            }
            i = mSDKConfig.getBatchSize();
            if (i < mEventsQueue.size())
            {
                break MISSING_BLOCK_LABEL_1434;
            }
              goto _L5
_L8:
            if (j >= i) goto _L7; else goto _L6
_L6:
            obj3 = (Event)mEventsQueue.get(j);
            mEventsInProgress.add(obj3);
            obj3 = ((Event) (obj3)).getJSONRepresentation();
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_573;
            }
            ((JSONArray) (obj2)).put(obj3);
            j++;
              goto _L8
            obj1;
            obj;
            JVM INSTR monitorexit ;
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Caught exception in Send Events Task handler: ").append(obj).toString());
                ((Exception) (obj)).printStackTrace();
            }
            synchronized (mBatchTimerLock)
            {
                if (mBatchTimer != null)
                {
                    mBatchTimer.cancel();
                    mBatchTimer = null;
                }
            }
_L13:
            return;
_L4:
            ((RequestParams) (obj1)).put("rm", ((JSONArray) (obj2)).toString());
_L2:
            if (android.os.Build.VERSION.SDK_INT < 18 || !KahunaCommon.iBeaconMonitoringDeveloperEnabled || !KahunaActivityRecognitionManager.isDeviceReadyForActivityRecognition() || !KahunaIBeaconManager.isDeviceReadyForIBeaconMonitoring(KahunaCommon.this)) goto _L10; else goto _L9
_L9:
            ((JSONArray) (obj)).put("bm");
            obj3 = KahunaIBeaconManager.getCurrentlyMonitorediBeacons(KahunaCommon.this);
            if (((Set) (obj3)).size() <= 0) goto _L10; else goto _L11
_L11:
            obj2 = new JSONArray();
            for (obj3 = ((Set) (obj3)).iterator(); ((Iterator) (obj3)).hasNext(); ((JSONArray) (obj2)).put((String)((Iterator) (obj3)).next())) { }
            ((RequestParams) (obj1)).put("bm", ((JSONArray) (obj2)).toString());
              goto _L10
_L5:
            i = mEventsQueue.size();
            break MISSING_BLOCK_LABEL_1434;
_L7:
            obj;
            JVM INSTR monitorexit ;
            EventBucketManager.clearBucketMappings();
            if (mEventsInProgress.size() != 0)
            {
                break MISSING_BLOCK_LABEL_914;
            }
            synchronized (mConnectionProgressLock)
            {
                mConnectionInProgress = false;
            }
            synchronized (mBatchTimerLock)
            {
                if (mBatchTimer != null)
                {
                    mBatchTimer.cancel();
                    mBatchTimer = null;
                }
            }
            return;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            obj = ((JSONArray) (obj2)).toString();
            ((RequestParams) (obj1)).put("events_cksum", KahunaUtils.getHashForString(((String) (obj)), "MD5", false));
            ((RequestParams) (obj1)).put("events", ((String) (obj)));
            if (!KahunaUtils.isNullOrEmpty(mCorruptedArchivePayload))
            {
                ((RequestParams) (obj1)).put("archive_corrupt_raw_data", mCorruptedArchivePayload);
            }
            if (!KahunaUtils.isNullOrEmpty(mCorruptedEventNames))
            {
                ((RequestParams) (obj1)).put("archive_corrupt_event_names", mCorruptedEventNames.toString());
            }
            obj = KahunaUtils.getHashForString(EntityUtils.toString(((RequestParams) (obj1)).getEntity(), "UTF-8"), "MD5", false);
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Top Level Checksum was: ").append(((String) (obj))).toString());
            }
            obj = new BasicHeader("top_level_checksum", ((String) (obj)));
            obj2 = mHttpClient;
            obj3 = mUrl;
        /* block-local class not found */
        class _cls1 {}

            _cls1 _lcls1 = new _cls1();
            ((AsyncHttpClient) (obj2)).post(null, ((String) (obj3)), new Header[] {
                obj
            }, ((RequestParams) (obj1)), "application/x-www-form-urlencoded", _lcls1);
            if (!KahunaCommon.mDebugEnabled) goto _L13; else goto _L12
_L12:
            if (!KahunaInternalDebugManager.getIsDebugEnabled(mAppContext))
            {
                break MISSING_BLOCK_LABEL_1402;
            }
            Log.d("Kahuna", "filtering some parameters");
            obj = ((RequestParams) (obj1)).getUrlParams();
            obj1 = new StringBuilder();
            obj2 = ((Map) (obj)).keySet().iterator();
_L16:
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_1372;
                }
                obj3 = (String)((Iterator) (obj2)).next();
            } while ("key".equals(obj3));
            if (((StringBuilder) (obj1)).length() > 0)
            {
                ((StringBuilder) (obj1)).append("&");
            }
            if (!"events".equals(obj3))
            {
                break MISSING_BLOCK_LABEL_1329;
            }
            ((StringBuilder) (obj1)).append((new StringBuilder()).append(((String) (obj3))).append("=[").toString());
            j = mEventsInProgress.size();
            i = 0;
_L15:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            obj3 = ((Event)mEventsInProgress.get(i)).getJSONRepresentation();
            ((JSONObject) (obj3)).remove("credentials");
            ((StringBuilder) (obj1)).append(((JSONObject) (obj3)).toString());
            i++;
            if (true) goto _L15; else goto _L14
_L14:
            ((StringBuilder) (obj1)).append("]");
              goto _L16
            ((StringBuilder) (obj1)).append((new StringBuilder()).append(((String) (obj3))).append("=").append((String)((Map) (obj)).get(obj3)).toString());
              goto _L16
            Log.d("Kahuna", (new StringBuilder()).append("Sending request: ").append(((StringBuilder) (obj1)).toString()).toString());
            return;
            Log.d("Kahuna", (new StringBuilder()).append("Sending request: ").append(obj1).toString());
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            j = 0;
              goto _L8
        }

        private SendEventsTask()
        {
            this$0 = KahunaCommon.this;
            super();
        }

    }


    private static final long BATCH_PENDING_INTERVAL_MILLI = 2000L;
    private static final long FIRST_BATCH_TIMER_DELAY = 2000L;
    private static final int HTTP_SOCKET_TIMEOUT = 60000;
    public static final String LOG_TAG = "Kahuna";
    protected static int MAX_EVENTS_TO_ARCHIVE = 0;
    private static final long STOP_TIMEOUT_MILLI = 5000L;
    private static boolean hideFGPushes = false;
    private static boolean iBeaconMonitoringDeveloperEnabled = false;
    private static int iconOverrideId = -1;
    private static boolean inAppFeatureSupported = false;
    protected static boolean mDebugEnabled = false;
    private static boolean mDeveloperDebugEnabledOption = false;
    private static KahunaInAppMessageListener mInAppMessageListener;
    private static ExecutorService mKahunaExecutor = Executors.newSingleThreadExecutor();
    private static boolean regionMonitoringDeveloperEnabled = false;
    private static boolean sdkGenerateNotificationsOverride = false;
    private static boolean sdkPushLaunchOverride = false;
    protected static String senderId;
    private static KahunaCommon sharedInstance = null;
    private static Object startStopLock = new Object();
    private String HYBRID_SDK_KEY;
    private String HYBRID_SDK_VALUE;
    private final String OS_NAME = "Android";
    private final String PRODUCTION_URL = "https://tap-nexus.appspot.com/log";
    private final String SDK_VERSION = "2.0.3";
    private AtomicInteger mActivityCount;
    private Context mAppContext;
    private String mAppName;
    private String mAppVersion;
    private KahunaTimer mBatchTimer;
    private Object mBatchTimerLock;
    private boolean mConnectionInProgress;
    private Object mConnectionProgressLock;
    private String mCorruptedArchivePayload;
    private JSONArray mCorruptedEventNames;
    private boolean mDebugBuild;
    private String mDeviceId;
    private String mDeviceName;
    private AtomicLong mEventNumber;
    private List mEventsInProgress;
    private Object mEventsLock;
    private List mEventsQueue;
    private int mExponentialBackoffRangesMilli[][] = {
        {
            5000, 10000
        }, {
            10000, 20000
        }, {
            20000, 40000
        }, {
            40000, 0x13880
        }
    };
    private final AsyncHttpClient mHttpClient = new AsyncHttpClient();
    private boolean mIsInitialized;
    private String mKahunaSecretKey;
    private long mLastBatchSentTimestamp;
    private AtomicInteger mNumEventsToContinueFlushing;
    private String mOSName;
    private String mOSVersion;
    private boolean mPushEnabled;
    private String mPushToken;
    private int mRetryAttempt;
    private KahunaSDKConfiguration mSDKConfig;
    private final String mSDKVersion = "2.0.3";
    private Timer mStopTimer;
    private String mUrl;

    protected KahunaCommon()
    {
        mDebugBuild = false;
        HYBRID_SDK_KEY = null;
        HYBRID_SDK_VALUE = null;
        mIsInitialized = false;
        mPushEnabled = true;
        mUrl = "https://tap-nexus.appspot.com/log";
        mOSName = "Android";
        mEventsLock = new Object();
        mConnectionProgressLock = new Object();
        mBatchTimerLock = new Object();
        mRetryAttempt = 0;
        mLastBatchSentTimestamp = 0L;
        mNumEventsToContinueFlushing = new AtomicInteger(0);
        mEventNumber = new AtomicLong(1L);
        mCorruptedArchivePayload = null;
        mCorruptedEventNames = null;
        mHttpClient.setTimeout(60000);
        sharedInstance = this;
    }

    private void addEventToEventQueue(Event event)
    {
        synchronized (mEventsLock)
        {
            event.setEventNumber(mEventNumber.getAndIncrement());
            mEventsQueue.add(event);
        }
        return;
        event;
        obj;
        JVM INSTR monitorexit ;
        throw event;
    }

    protected static void debugManagerSetDebugLogging(boolean flag)
    {
        if (flag)
        {
            mDebugEnabled = flag;
            return;
        } else
        {
            mDebugEnabled = mDeveloperDebugEnabledOption;
            return;
        }
    }

    private void filterOutEventProperties(Event event, int i)
    {
label0:
        {
            Object obj;
label1:
            {
                obj = event.getEventPropertiesData();
                if (obj != null)
                {
                    HashMap hashmap = new HashMap();
                    if (i <= 0)
                    {
                        break label0;
                    }
                    Iterator iterator = ((JSONObject) (obj)).keys();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        String s = (String)iterator.next();
                        String s2 = ((JSONObject) (obj)).optString(s);
                        if (mSDKConfig.isValidEventProperty(event.getName(), s, s2))
                        {
                            hashmap.put(s, s2);
                        }
                    } while (true);
                    obj = hashmap;
                    if (hashmap.size() > i)
                    {
                        obj = new HashMap();
                        Iterator iterator1 = hashmap.keySet().iterator();
                        for (int j = 0; j < i; j++)
                        {
                            String s1 = (String)iterator1.next();
                            ((Map) (obj)).put(s1, hashmap.get(s1));
                        }

                    }
                    if (!KahunaUtils.isNullOrEmpty(((Map) (obj))))
                    {
                        break label1;
                    }
                    event.setEventPropertiesData(null);
                }
                return;
            }
            event.setEventPropertiesData(new JSONObject(((Map) (obj))));
            return;
        }
        event.setEventPropertiesData(null);
    }

    protected static KahunaInAppMessageListener getCustomInAppMessageListener()
    {
        return mInAppMessageListener;
    }

    public static boolean getDebugModeEnabled()
    {
        return mDebugEnabled;
    }

    private boolean getEventsQueueHasFireImmediateEvents()
    {
label0:
        {
            synchronized (mEventsLock)
            {
                Set set = mSDKConfig.getTriggerEvents();
                if (set.size() <= 0 || mEventsQueue.size() <= 0)
                {
                    break label0;
                }
                Iterator iterator = mEventsQueue.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (!set.contains(((Event)iterator.next()).getName().toLowerCase()));
            }
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String getGUID()
    {
        String s1 = KahunaPreferences.getSavedDeviceId(mAppContext);
        String s = s1;
        if (KahunaUtils.isNullOrEmpty(s1))
        {
            s = UUID.randomUUID().toString();
            KahunaPreferences.saveDeviceId(s, mAppContext);
        }
        return s;
    }

    protected static boolean getKahunaGenerateNotificationsOverride()
    {
        return sdkGenerateNotificationsOverride;
    }

    private long getNextExponentialBackoffTimerValue()
    {
        this;
        JVM INSTR monitorenter ;
        int j = mRetryAttempt;
        int i = j;
        double d;
        if (j >= mExponentialBackoffRangesMilli.length)
        {
            i = mExponentialBackoffRangesMilli.length - 1;
        }
        j = mExponentialBackoffRangesMilli[i][1];
        i = mExponentialBackoffRangesMilli[i][0];
        d = Math.random();
        long l = (int)(d * (double)(j - i) + (double)i);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    protected static KahunaCommon getSharedInstance()
    {
        return sharedInstance;
    }

    private Map getUserAttributesInternal()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = KahunaPreferences.getUserAttributes(mAppContext);
_L2:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj = new HashMap();
        this;
        JVM INSTR monitorexit ;
        return ((Map) (obj));
        Object obj1;
        obj1;
        if (mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception attempting to retrieve stored attributes:").append(obj1).toString());
        }
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
_L4:
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void handleBatchRequestFailure()
    {
label0:
        {
            synchronized (mBatchTimerLock)
            {
                if (mBatchTimer != null)
                {
                    mBatchTimer.cancel();
                    mBatchTimer = null;
                }
                if (mRetryAttempt < mSDKConfig.getMaxRetryAttempts())
                {
                    break label0;
                }
                resetExponentialBackoffTimerValue();
                mNumEventsToContinueFlushing.set(0);
                if (mDebugEnabled)
                {
                    Log.d("Kahuna", (new StringBuilder()).append("Reached our max retry limit. Will not retry until the next request to flush events. Max attempts: ").append(mSDKConfig.getMaxRetryAttempts()).toString());
                }
            }
            return;
        }
        long l = getNextExponentialBackoffTimerValue();
        if (mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Scheduling next retry in: ").append(l).append("(ms)").toString());
        }
        mBatchTimer = new KahunaTimer();
        mBatchTimer.schedule(new SendEventsTask(), l);
        mRetryAttempt = mRetryAttempt + 1;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void handleBatchScheduling(String s)
    {
label0:
        {
            synchronized (mEventsLock)
            {
                if (!KahunaUtils.isNullOrEmpty(mEventsQueue))
                {
                    break label0;
                }
            }
            return;
        }
        int i = mEventsQueue.size();
        obj;
        JVM INSTR monitorexit ;
        boolean flag = false;
        if (!mSDKConfig.getTriggerEvents().contains(s.toLowerCase())) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (mBatchTimerLock));
        s;
        JVM INSTR monitorenter ;
        if (mBatchTimer != null)
        {
            mBatchTimer.cancel();
            mBatchTimer = null;
        }
        mBatchTimer = new KahunaTimer();
        long l = 0L;
        if (mLastBatchSentTimestamp == 0L)
        {
            l = 2000L;
        }
        mBatchTimer.schedule(new SendEventsTask(), l);
        s;
        JVM INSTR monitorexit ;
        return;
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        if ((long)i >= mSDKConfig.getFlushOnEventCount())
        {
            flag = true;
        } else
        {
            long l1 = System.currentTimeMillis() / 1000L;
            long l3 = mSDKConfig.getFlushIntervalSeconds();
            if (mLastBatchSentTimestamp + l3 < l1)
            {
                flag = true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mSDKConfig.getFlushSoonEvents().contains(s.toLowerCase()))
        {
            long l2 = mSDKConfig.getFlushSoonDelayIntervalSeconds() * 1000L;
            synchronized (mBatchTimerLock)
            {
                if (mBatchTimer != null && mBatchTimer.getTimerFireTime() - System.currentTimeMillis() > l2)
                {
                    mBatchTimer.cancel();
                    mBatchTimer = null;
                }
                if (mBatchTimer == null)
                {
                    mBatchTimer = new KahunaTimer();
                    mBatchTimer.schedule(new SendEventsTask(), l2);
                }
            }
            return;
        }
        break MISSING_BLOCK_LABEL_323;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (mBatchTimerLock)
        {
            if (mBatchTimer == null)
            {
                mBatchTimer = new KahunaTimer();
                mBatchTimer.schedule(new SendEventsTask(), mSDKConfig.getFlushIntervalSeconds() * 1000L);
            }
        }
        return;
        exception1;
        s;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private void handleCommonLogout()
    {
        KahunaPreferences.saveUserCredentialsNew(null, mAppContext);
        KahunaPreferences.saveUserAttributes(null, mAppContext);
    }

    private void handleCommonTrackEvent(final Event event)
    {
        if (event == null)
        {
            if (mDebugEnabled)
            {
                Log.w("Kahuna", "Event is null.");
            }
            return;
        } else
        {
            mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

                final KahunaCommon this$0;
                final Event val$event;

                public void run()
                {
                    try
                    {
                        trackEventInternal(event);
                        return;
                    }
                    catch (Exception exception)
                    {
                        Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.trackEvent(): ").append(exception).toString());
                    }
                }

            
            {
                this$0 = KahunaCommon.this;
                event = event1;
                super();
            }
            }));
            return;
        }
    }

    private void handleCommonTrackEvent(final String eventNameCopy, final int count, final int value, final boolean hasPurchaseData)
    {
        if (KahunaUtils.isNullOrEmpty(eventNameCopy))
        {
            if (mDebugEnabled)
            {
                Log.w("Kahuna", "You cannot track a null or empty String event name. Ignoring event.");
            }
            return;
        } else
        {
            eventNameCopy = new String(eventNameCopy);
            mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

                final KahunaCommon this$0;
                final int val$count;
                final String val$eventNameCopy;
                final boolean val$hasPurchaseData;
                final int val$value;

                public void run()
                {
                    try
                    {
                        EventBuilder eventbuilder = new EventBuilder(eventNameCopy);
                        if (hasPurchaseData)
                        {
                            eventbuilder.setPurchaseData(count, value);
                        }
                        trackEventInternal(eventbuilder.build());
                        return;
                    }
                    catch (Exception exception)
                    {
                        Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.trackEvent(): ").append(exception).toString());
                    }
                }

            
            {
                this$0 = KahunaCommon.this;
                eventNameCopy = s;
                hasPurchaseData = flag;
                count = i;
                value = j;
                super();
            }
            }));
            return;
        }
    }

    private void initializeInstance()
    {
        this;
        JVM INSTR monitorenter ;
        if (mAppContext == null)
        {
            throw new IllegalStateException("You did not call onAppCreate() in your MainApplication's onCreate() method.");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag = mIsInitialized;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (mDebugEnabled)
        {
            Log.d("Kahuna", "Initializing SDK version: 2.0.3");
        }
        ApplicationInfo applicationinfo = mAppContext.getApplicationInfo();
        mAppName = mAppContext.getString(applicationinfo.labelRes);
        mAppVersion = mAppContext.getPackageManager().getPackageInfo(mAppContext.getPackageName(), 0).versionName;
_L3:
        mDeviceId = getGUID();
        mOSVersion = android.os.Build.VERSION.RELEASE;
        mDeviceName = Build.MODEL;
        mPushEnabled = KahunaPreferences.getPushEnabled(mAppContext);
_L5:
        mActivityCount = new AtomicInteger();
        synchronized (mEventsLock)
        {
            if (mEventsQueue == null)
            {
                mEventsQueue = new ArrayList();
            }
        }
        mConnectionInProgress = false;
        mIsInitialized = true;
        mDebugBuild = KahunaUtils.isDebuggable(mAppContext);
        mSDKConfig = KahunaSDKConfiguration.getSavedSDKConfiguration(mAppContext);
        EventBucketManager.updateBucketConfig(mSDKConfig.getEventBucketConfig());
        mLastBatchSentTimestamp = KahunaPreferences.getLastFlushTimestamp(mAppContext);
        if (mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Loading SDK Config:").append(mSDKConfig.getVersion()).append(" flushInterval: ").append(mSDKConfig.getFlushIntervalMinutes()).append(" flushEventCount: ").append(mSDKConfig.getFlushOnEventCount()).append(" events:").append(mSDKConfig.getTriggerEvents()).toString());
        }
          goto _L1
        obj;
        if (mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception occured trying to set appName and/or appVersion:").append(obj).toString());
        }
        mAppVersion = "";
        mAppName = "unknown";
          goto _L3
        obj;
        if (!mDebugEnabled) goto _L5; else goto _L4
_L4:
        Log.d("Kahuna", (new StringBuilder()).append("Exception occured trying to retrieve previous push enabled setting:").append(obj).toString());
          goto _L5
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
          goto _L1
    }

    private void mergeEventUserAttributes(Event event, Event event1)
    {
        try
        {
            event = KahunaUtils.jsonToMap(event.getJSONRepresentation().getJSONObject("user_info"));
            Map map = KahunaUtils.jsonToMap(event1.getJSONRepresentation().getJSONObject("user_info"));
            map.putAll(event);
            event1.setUserAttributes(map);
            if (mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Merged adjacent User Attributes to event:").append(event1.getJSONRepresentation()).toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Event event)
        {
            Log.d("Kahuna", (new StringBuilder()).append("error merging User Attributes: ").append(event).toString());
        }
    }

    private void resetExponentialBackoffTimerValue()
    {
        this;
        JVM INSTR monitorenter ;
        mRetryAttempt = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void setUserAttributesInternal(Map map)
    {
        if (map == null)
        {
            HashMap hashmap;
            Map map1;
            Iterator iterator;
            String s;
            boolean flag;
            try
            {
                if (mDebugEnabled)
                {
                    Log.d("Kahuna", "You must specify a valid Map for user Attributes. Ignoring this call to setUserAttributes");
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                if (mDebugEnabled)
                {
                    Log.d("Kahuna", (new StringBuilder()).append("Exception attempting to set user attributes:").append(map).toString());
                    return;
                }
            }
            break MISSING_BLOCK_LABEL_396;
        }
        map1 = getUserAttributesInternal();
        hashmap = new HashMap();
        flag = false;
        iterator = map.keySet().iterator();
_L3:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_276;
            }
            s = (String)iterator.next();
        } while (KahunaUtils.isNullOrEmpty(s));
        if (map1.containsKey(s)) goto _L2; else goto _L1
_L1:
        map1.put(s, map.get(s));
        hashmap.put(s, map.get(s));
        flag = true;
          goto _L3
_L2:
        if (map1.get(s) != null && map.get(s) != null) goto _L5; else goto _L4
_L4:
        if (map1.get(s) == map.get(s)) goto _L3; else goto _L6
_L6:
        map1.put(s, map.get(s));
        hashmap.put(s, map.get(s));
        flag = true;
          goto _L3
_L5:
        if (((String)map1.get(s)).equals(map.get(s))) goto _L3; else goto _L7
_L7:
        map1.put(s, map.get(s));
        hashmap.put(s, map.get(s));
        flag = true;
          goto _L3
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        KahunaPreferences.saveUserAttributes(map1, mAppContext);
        if (hashmap == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        map = new Event("k_user_attributes");
        map.setUserAttributes(hashmap);
        trackEventInternal(map);
        if (mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Detected changes for the following user attributes: ").append(hashmap).toString());
            return;
        }
        break MISSING_BLOCK_LABEL_396;
        if (mDebugEnabled)
        {
            Log.d("Kahuna", "Did not detect any change in user attributes, not sending request...");
        }
    }

    private void trackEventInternal(Event event)
    {
        if (event != null) goto _L2; else goto _L1
_L1:
        if (mDebugEnabled)
        {
            Log.w("Kahuna", "Ignoring request to track (null) Event object");
        }
_L4:
        return;
_L2:
        if (!KahunaUtils.isNullOrEmpty(event.getName()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (mDebugEnabled)
        {
            Log.w("Kahuna", "Cannot track null or empty event name");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj2;
        Object obj;
label0:
        {
            if (!mIsInitialized)
            {
                initializeInstance();
            }
            Event event1 = event;
            obj2 = event1;
            if (KahunaSDKConfiguration.MAPPING_FILTERING_BLACKLIST_EVENTS.contains(event1.getName().toLowerCase()))
            {
                break; /* Loop/switch isn't completed */
            }
            obj2 = mSDKConfig.getEventMapping();
            obj = event1;
            if (obj2 == null)
            {
                break label0;
            }
            obj = event1;
            if (((Map) (obj2)).isEmpty())
            {
                break label0;
            }
            obj2 = ((Map) (obj2)).entrySet().iterator();
            do
            {
                obj = event1;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break label0;
                }
                obj = (java.util.Map.Entry)((Iterator) (obj2)).next();
            } while (!KahunaUtils.getRegexMatches((String)((java.util.Map.Entry) (obj)).getKey(), event1.getName()));
            obj2 = new Event(event);
            ((Event) (obj2)).setName((String)((java.util.Map.Entry) (obj)).getValue());
            obj = obj2;
            if (mDebugEnabled)
            {
                Log.w("Kahuna", (new StringBuilder()).append("Mapped event name from: ").append(event.getName()).append(" to:").append(((Event) (obj2)).getName()).toString());
                obj = obj2;
            }
        }
        obj2 = mSDKConfig.getEventIncludeList();
        event = mSDKConfig.getEventExcludeList();
        if (obj2 != null && !((Set) (obj2)).isEmpty())
        {
            boolean flag2 = false;
            event = ((Set) (obj2)).iterator();
            boolean flag;
            do
            {
                flag = flag2;
                if (!event.hasNext())
                {
                    break;
                }
                if (!KahunaUtils.getRegexMatches((String)event.next(), ((Event) (obj)).getName()))
                {
                    continue;
                }
                flag = true;
                break;
            } while (true);
            obj2 = obj;
            if (flag)
            {
                break; /* Loop/switch isn't completed */
            }
            if (mDebugEnabled)
            {
                Log.w("Kahuna", (new StringBuilder()).append("Ignoring event: ").append(((Event) (obj)).getName()).append(" not in include list.").toString());
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj;
        if (event == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj;
        if (event.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag3 = false;
        event = event.iterator();
        boolean flag1;
        do
        {
            flag1 = flag3;
            if (!event.hasNext())
            {
                break;
            }
            if (!KahunaUtils.getRegexMatches((String)event.next(), ((Event) (obj)).getName()))
            {
                continue;
            }
            flag1 = true;
            break;
        } while (true);
        obj2 = obj;
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mDebugEnabled)
        {
            Log.w("Kahuna", (new StringBuilder()).append("Ignoring event: ").append(((Event) (obj)).getName()).append(" in exclude list.").toString());
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        filterOutEventProperties(((Event) (obj2)), mSDKConfig.getEventPropertiesMaxCount());
        if (!EventBucketManager.getHasBucketConfig(((Event) (obj2)).getName().toLowerCase()) || ((Event) (obj2)).hasEventProperties()) goto _L7; else goto _L6
_L6:
        Object obj3 = mEventsLock;
        obj3;
        JVM INSTR monitorenter ;
        Object obj1 = EventBucketManager.getEventForBucketName(((Event) (obj2)).getName(), ((Event) (obj2)).getCreationTime());
        if (obj1 != null) goto _L9; else goto _L8
_L8:
        addEventToEventQueue(((Event) (obj2)));
        if (mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Queueing event:").append(((Event) (obj2)).getName()).toString());
        }
        EventBucketManager.insertEventBucketForEvent(((Event) (obj2)));
        event = ((Event) (obj2));
_L15:
        event.incrementBucketCount();
        if (mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("incrementing bucket count for event:").append(event.getName()).toString());
        }
        if (((Event) (obj2)).getPurchaseCount() > 0)
        {
            if (event.getPurchaseCount() < 0)
            {
                event.setPurchaseCount(0);
            }
            event.setPurchaseCount(event.getPurchaseCount() + ((Event) (obj2)).getPurchaseCount());
        }
        if (((Event) (obj2)).getPurchaseValue() > 0)
        {
            if (event.getPurchaseValue() < 0)
            {
                event.setPurchaseValue(0);
            }
            event.setPurchaseValue(event.getPurchaseValue() + ((Event) (obj2)).getPurchaseValue());
        }
        obj3;
        JVM INSTR monitorexit ;
_L13:
        if (!mIsInitialized) goto _L11; else goto _L10
_L10:
        event = ((Event) (mConnectionProgressLock));
        event;
        JVM INSTR monitorenter ;
        if (mConnectionInProgress)
        {
            return;
        }
          goto _L12
        obj1;
        event;
        JVM INSTR monitorexit ;
        throw obj1;
_L9:
        event = ((Event) (obj1));
        if (!"k_user_attributes".equals(((Event) (obj2)).getName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        mergeEventUserAttributes(((Event) (obj2)), ((Event) (obj1)));
        event = ((Event) (obj1));
        continue; /* Loop/switch isn't completed */
        event;
        obj3;
        JVM INSTR monitorexit ;
        throw event;
_L7:
        if (!KahunaUtils.isNullOrEmpty(mEventsQueue) && "k_user_attributes".equals(((Event) (obj2)).getName()) && "k_user_attributes".equals(((Event)mEventsQueue.get(mEventsQueue.size() - 1)).getName()))
        {
            mergeEventUserAttributes(((Event) (obj2)), (Event)mEventsQueue.get(mEventsQueue.size() - 1));
        } else
        {
            addEventToEventQueue(((Event) (obj2)));
            if (mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Queueing event:").append(((Event) (obj2)).getName()).toString());
            }
        }
          goto _L13
_L12:
        event;
        JVM INSTR monitorexit ;
        handleBatchScheduling(((Event) (obj2)).getName());
        return;
_L11:
        Log.d("Kahuna", "Please call the method onAppCreate() with your secretKey before trackEvent otherwise events cannot be logged");
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public void _internalTrackiBeaconEvent(final KahunaIBeacon beacon, final String status)
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;
            final KahunaIBeacon val$beacon;
            final String val$status;

            public void run()
            {
                try
                {
                    HashMap hashmap = new HashMap();
                    hashmap.put("id", beacon.getId());
                    hashmap.put("status", status);
                    hashmap.put("type", "beacon");
                    if (beacon.getMajor() > -1)
                    {
                        hashmap.put("major", Integer.valueOf(beacon.getMajor()));
                    }
                    if (beacon.getMinor() > -1)
                    {
                        hashmap.put("minor", Integer.valueOf(beacon.getMinor()));
                    }
                    Event event = new Event("k_user_location", System.currentTimeMillis() / 1000L);
                    event.setLocationMetadata(hashmap);
                    trackEventInternal(event);
                    return;
                }
                catch (Exception exception)
                {
                    Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.trackRegionMonitoringEvent(): ").append(exception).toString());
                }
            }

            
            {
                this$0 = KahunaCommon.this;
                beacon = kahunaibeacon;
                status = s;
                super();
            }
        }));
    }

    public void checkPush(Context context)
        throws PushNotConfiguredException
    {
        try
        {
            GCMRegistrar.checkDevice(context);
            GCMRegistrar.checkManifest(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (KahunaUtils.isNullOrEmpty(context.getMessage()))
        {
            throw new PushNotConfiguredException("Encountered a problem checking Push. See Logcat output for more details.");
        } else
        {
            throw new PushNotConfiguredException(context.getMessage());
        }
    }

    public IKahunaUserCredentials createUserCredentials()
    {
        return new KahunaUserCredentials();
    }

    public void disableKahunaGenerateNotifications()
    {
        sdkGenerateNotificationsOverride = true;
    }

    public void disableKahunaPushLaunchApp()
    {
        sdkPushLaunchOverride = true;
    }

    public void disableLocationServices(int i)
    {
        if ((i & 1) > 0)
        {
            regionMonitoringDeveloperEnabled = false;
        }
        if (!regionMonitoringDeveloperEnabled)
        {
            KahunaRegionManager.removeAllMonitoredRegions(this);
        }
    }

    public void disablePush()
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;

            public void run()
            {
                if (!mIsInitialized)
                {
                    Log.e("Kahuna", "You need to call onAppCreate() before any other call to the SDK. Ignoring disablePush request");
                } else
                if (mPushEnabled)
                {
                    mPushEnabled = false;
                    KahunaPreferences.savePushEnabled(mPushEnabled, mAppContext);
                    trackEventInternal(new Event("k_push_disabled"));
                    return;
                }
            }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
        }));
    }

    public void enableKahunaGenerateNotifications()
    {
        sdkGenerateNotificationsOverride = false;
    }

    public void enableKahunaPushLaunchApp()
    {
        sdkPushLaunchOverride = false;
    }

    public void enableLocationServices(int i)
    {
        if ((i & 1) > 0)
        {
            regionMonitoringDeveloperEnabled = true;
        }
    }

    public void enablePush()
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;

            public void run()
            {
                if (!mIsInitialized)
                {
                    Log.e("Kahuna", "You need to call onAppCreate() before any other call to the SDK. Ignoring enablePush request");
                } else
                if (!mPushEnabled)
                {
                    mPushEnabled = true;
                    KahunaPreferences.savePushEnabled(mPushEnabled, mAppContext);
                    trackEventInternal(new Event("k_push_enabled"));
                    return;
                }
            }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
        }));
    }

    public void forceDebugBuild()
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;

            public void run()
            {
                if (mAppContext == null)
                {
                    Log.w("Kahuna", "You should call onAppCreate() before forcing debug build.");
                }
                mDebugBuild = true;
            }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
        }));
    }

    protected int getEventPropertiesMaxCount()
    {
        return mSDKConfig.getEventPropertiesMaxCount();
    }

    public int getIconResourceId()
    {
        return iconOverrideId;
    }

    public boolean getIsPushEnabled()
    {
        if (mAppContext == null)
        {
            Log.d("Kahuna", "Error, push state unknown. You must call onAppCreate() before getting the current status of push.");
        }
        return mPushEnabled;
    }

    protected int getKahunaActivityCount()
    {
        return mActivityCount.get();
    }

    public String getKahunaDeviceId()
    {
        String s;
        try
        {
            s = (String)mKahunaExecutor.submit(new Callable() {

                final KahunaCommon this$0;

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public String call()
                {
                    if (!mIsInitialized)
                    {
                        if (KahunaCommon.mDebugEnabled)
                        {
                            Log.e("Kahuna", "Need to call onAppCreate() before calling getKahunaDeviceId()");
                        }
                        return null;
                    } else
                    {
                        return mDeviceId;
                    }
                }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
            }).get();
        }
        catch (Exception exception)
        {
            if (mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception attempting to retrieve Kahuna deviceId:").append(exception).toString());
            }
            return null;
        }
        return s;
    }

    public boolean getKahunaPushLaunchOverride()
    {
        return sdkPushLaunchOverride;
    }

    public String getPushToken()
    {
        if (!mIsInitialized)
        {
            if (mDebugEnabled)
            {
                Log.e("Kahuna", "Need to call onAppCreate() before calling getPushToken()");
            }
        } else
        if (mPushEnabled && !KahunaUtils.isNullOrEmpty(senderId))
        {
            return GCMRegistrar.getRegistrationId(mAppContext);
        }
        return null;
    }

    protected String getSDKVersion()
    {
        return "2.0.3";
    }

    protected String getSecretKey()
    {
        return mKahunaSecretKey;
    }

    public boolean getShouldDisplayNotification()
    {
        while (!mIsInitialized || !hideFGPushes || mActivityCount.get() <= 0) 
        {
            return true;
        }
        return false;
    }

    public Map getUserAttributes()
    {
        Map map;
        try
        {
            map = (Map)mKahunaExecutor.submit(new Callable() {

                final KahunaCommon this$0;

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public Map call()
                {
                    return getUserAttributesInternal();
                }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
            }).get();
        }
        catch (Exception exception)
        {
            if (mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception attempting to retrieve stored attributes:").append(exception).toString());
            }
            return new HashMap();
        }
        return map;
    }

    public IKahunaUserCredentials getUserCredentials()
    {
        IKahunaUserCredentials ikahunausercredentials;
        try
        {
            ikahunausercredentials = (IKahunaUserCredentials)mKahunaExecutor.submit(new Callable() {

                final KahunaCommon this$0;

                public IKahunaUserCredentials call()
                {
                    return new KahunaUserCredentials(KahunaPreferences.getUserCredentialsNew(mAppContext));
                }

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
            }).get();
        }
        catch (Exception exception)
        {
            if (mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception attempting to retrieve stored credentials:").append(exception).toString());
            }
            return createUserCredentials();
        }
        return ikahunausercredentials;
    }

    public void login(final IKahunaUserCredentials credentials)
        throws EmptyCredentialsException
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;
            final IKahunaUserCredentials val$credentials;

            public void run()
            {
                Object obj;
                Object obj1;
                java.util.Map.Entry entry;
                boolean flag1;
                obj1 = KahunaPreferences.getUserCredentialsNew(mAppContext);
                if (credentials != null)
                {
                    obj = credentials.getCredentialsAsMap();
                } else
                {
                    obj = new HashMap();
                }
                entry = null;
                flag1 = false;
                if (!((Map) (obj1)).isEmpty()) goto _L2; else goto _L1
_L1:
                if (!KahunaUtils.isNullOrEmpty(credentials)) goto _L4; else goto _L3
_L3:
                return;
_L4:
                boolean flag;
                if (KahunaCommon.mDebugEnabled)
                {
                    Log.d("Kahuna", (new StringBuilder()).append("login() called and no previous credentials found. Storing new credentials: ").append(obj).toString());
                }
                KahunaPreferences.saveUserCredentialsNew(((Map) (obj)), mAppContext);
                flag = true;
_L7:
                if (flag)
                {
                    obj1 = new Event("k_user_login");
                    ((Event) (obj1)).setUserCredentials(((Map) (obj)));
                    trackEventInternal(((Event) (obj1)));
                    return;
                }
                  goto _L5
_L2:
                if (KahunaUtils.isNullOrEmpty(credentials))
                {
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.d("Kahuna", "login() called with previous credentials but new credentials are empty. Triggering empty k_user_login.");
                    }
                    handleCommonLogout();
                    flag = true;
                    obj = entry;
                } else
                if (!credentials.areCredentialsEqual(new KahunaUserCredentials(((Map) (obj1)))))
                {
                    if (KahunaUtils.doMapsOverlap(((Map) (obj1)), ((Map) (obj))))
                    {
                        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
                        {
                            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                            if (((Map) (obj1)).containsKey(entry.getKey()))
                            {
                                ((Set)((Map) (obj1)).get(entry.getKey())).addAll((Collection)entry.getValue());
                            } else
                            {
                                ((Map) (obj1)).put(entry.getKey(), entry.getValue());
                            }
                        }

                        if (KahunaCommon.mDebugEnabled)
                        {
                            Log.d("Kahuna", (new StringBuilder()).append("login() called with overlapping credentials. Merging all credentials: ").append(obj1).toString());
                        }
                        KahunaPreferences.saveUserCredentialsNew(((Map) (obj1)), mAppContext);
                        obj = obj1;
                        flag = true;
                    } else
                    {
                        if (KahunaCommon.mDebugEnabled)
                        {
                            Log.d("Kahuna", "login() called with no overlapping credentials. Sending up only new credentials.");
                        }
                        handleCommonLogout();
                        KahunaPreferences.saveUserCredentialsNew(((Map) (obj)), mAppContext);
                        flag = true;
                    }
                } else
                {
                    obj = entry;
                    flag = flag1;
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.d("Kahuna", "login() called with no change in credentials.");
                        obj = entry;
                        flag = flag1;
                    }
                }
                if (true) goto _L7; else goto _L6
_L6:
_L5:
                if (true) goto _L3; else goto _L8
_L8:
            }

            
            {
                this$0 = KahunaCommon.this;
                credentials = ikahunausercredentials;
                super();
            }
        }));
        if (credentials == null || credentials.isEmpty())
        {
            Log.e("Kahuna", "You cannot call login() with null or empty credentials.");
            throw new EmptyCredentialsException("You cannot call login without setting any credentials.");
        } else
        {
            return;
        }
    }

    public void logout()
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;

            public void run()
            {
                try
                {
                    handleCommonLogout();
                    trackEventInternal(new Event("k_user_logout"));
                    return;
                }
                catch (Exception exception)
                {
                    Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.logout(): ").append(exception).toString());
                    exception.printStackTrace();
                    return;
                }
            }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
        }));
    }

    public void onAppCreate(final Context context, String s, String s1)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Must have valid Application context to use Kahuna Analytics.");
        }
        if (KahunaUtils.isNullOrEmpty(s))
        {
            throw new IllegalArgumentException("Attempted to start Kahuna with invalid key! You must use your api Key with Kahuna");
        }
        mAppContext = context;
        mKahunaSecretKey = s;
        senderId = s1;
        if (mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Called onCreate with Key:").append(mKahunaSecretKey).toString());
        }
        GCMRegistrationManager.setContext(mAppContext);
        KahunaRegionManager.setContext(mAppContext);
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;
            final Context val$context;

            public void run()
            {
                Object obj;
                Object obj1;
                KahunaSDKUpgradeManager.checkIfSDKUpgraded(KahunaCommon.getSharedInstance(), mAppContext);
                if (!mIsInitialized)
                {
                    initializeInstance();
                }
                KahunaInternalDebugManager.onAppCreate(mAppContext);
                GCMRegistrationManager.init();
                PushNotificationsManager.init(context);
                ArchiveContainerObject archivecontainerobject;
                try
                {
                    KahunaRegionManager.init(KahunaCommon.getSharedInstance());
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.w("Kahuna", "Caught error when attepmting to initialize location services. If you are NOT using location services please ignore this error: ");
                        Log.w("Kahuna", ((Throwable) (obj)));
                    }
                    continue; /* Loop/switch isn't completed */
                }
_L6:
                archivecontainerobject = KahunaPreferences.getSavedEvents(mAppContext, false);
                obj1 = mEventsLock;
                obj1;
                JVM INSTR monitorenter ;
                mEventsQueue = archivecontainerobject.getArchivedEvents();
                if (mEventsQueue.isEmpty()) goto _L2; else goto _L1
_L1:
                obj = (Event)mEventsQueue.get(mEventsQueue.size() - 1);
_L3:
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_231;
                }
                if (((Event) (obj)).getEventNumber() <= 0L)
                {
                    break MISSING_BLOCK_LABEL_231;
                }
                mEventNumber.set(((Event) (obj)).getEventNumber() + 1L);
_L4:
                obj1;
                JVM INSTR monitorexit ;
                EventBucketManager.rebuildBucketMappingsFromEvents(mEventsQueue);
                mCorruptedArchivePayload = archivecontainerobject.getBase64CorruptedArchivedString();
                mCorruptedEventNames = archivecontainerobject.getBase64CorruptedEventNames();
                return;
_L2:
                obj = null;
                  goto _L3
                mEventNumber.set(KahunaPreferences.getSavedEventNumber(mAppContext));
                  goto _L4
                Exception exception;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = KahunaCommon.this;
                context = context1;
                super();
            }
        }));
    }

    public void registerInAppMessageListener(KahunaInAppMessageListener kahunainappmessagelistener)
    {
        inAppFeatureSupported = true;
        mInAppMessageListener = kahunainappmessagelistener;
    }

    public void setDebugMode(boolean flag)
    {
        mDeveloperDebugEnabledOption = flag;
        mDebugEnabled = flag;
    }

    public void setHybridSDKVersion(final String key, final String value)
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;
            final String val$key;
            final String val$value;

            public void run()
            {
                if (!mIsInitialized)
                {
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.e("Kahuna", "Need to call onAppCreate() before calling getKahunaDeviceId()");
                    }
                } else
                if (!KahunaUtils.isNullOrEmpty(key) && !KahunaUtils.isNullOrEmpty(value))
                {
                    HYBRID_SDK_KEY = key;
                    HYBRID_SDK_VALUE = value;
                    return;
                }
            }

            
            {
                this$0 = KahunaCommon.this;
                key = s;
                value = s1;
                super();
            }
        }));
    }

    public void setIconResourceId(int i)
    {
        iconOverrideId = i;
    }

    public void setPushReceiver(Class class1)
    {
        PushNotificationsManager.setPushRecevier(class1);
    }

    protected void setPushToken(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!KahunaUtils.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        mPushToken = "";
        KahunaPreferences.savePushToken(mPushToken, mAppContext);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mPushToken = s;
        if (KahunaUtils.isNullOrEmpty(KahunaPreferences.getSavedPushToken(mAppContext)))
        {
            trackEventInternal(new Event("k_push_enabled"));
        }
        KahunaPreferences.savePushToken(mPushToken, mAppContext);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void setUserAttributes(final Map userAttributes)
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;
            final Map val$userAttributes;

            public void run()
            {
                setUserAttributesInternal(userAttributes);
            }

            
            {
                this$0 = KahunaCommon.this;
                userAttributes = map;
                super();
            }
        }));
    }

    public void start()
    {
        try
        {
            mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

                final KahunaCommon this$0;

                public void run()
                {
                    if (!mIsInitialized)
                    {
                        initializeInstance();
                    }
                    Object obj = KahunaCommon.startStopLock;
                    obj;
                    JVM INSTR monitorenter ;
                    if (mActivityCount.incrementAndGet() == 1)
                    {
                        if (KahunaInternalDebugManager.getShouldSentMonitorRequest())
                        {
                            KahunaInternalDebugManager.requestSendMonitorRequest(mKahunaSecretKey, mDeviceId, mDebugBuild);
                        }
                        KahunaCommon.debugManagerSetDebugLogging(KahunaInternalDebugManager.getIsDebugEnabled(mAppContext));
                        if (mStopTimer == null)
                        {
                            break MISSING_BLOCK_LABEL_112;
                        }
                        mStopTimer.cancel();
                        mStopTimer = null;
                        return;
                    }
                      goto _L1
                    if (!mPushEnabled || KahunaUtils.isNullOrEmpty(KahunaCommon.senderId)) goto _L3; else goto _L2
_L2:
                    Object obj1 = GCMRegistrationManager.getRegistrationId();
                    if (!"".equals(obj1)) goto _L5; else goto _L4
_L4:
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.d("Kahuna", "Device not registered yet, will now register with GCM");
                    }
                    setPushToken("");
                    GCMRegistrationManager.registerForPush(KahunaCommon.senderId);
_L3:
                    trackEventInternal(new Event("Start"));
                    Object obj3 = mAppContext.getResources().getConfiguration().locale;
                    obj1 = TimeZone.getDefault();
                    obj1 = ((TimeZone) (obj1)).getDisplayName(((TimeZone) (obj1)).inDaylightTime(new Date(System.currentTimeMillis())), 0);
                    obj3 = ((Locale) (obj3)).getLanguage();
                    HashMap hashmap = new HashMap();
                    hashmap.put("kahuna_tz", obj1);
                    hashmap.put("kahuna_lang", obj3);
                    setUserAttributesInternal(hashmap);
_L7:
                    resetExponentialBackoffTimerValue();
_L1:
                    KahunaInAppManager.hostAppNewActivityStarted();
                    return;
_L5:
                    setPushToken(((String) (obj1)));
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.d("Kahuna", "Device already registered");
                    }
                      goto _L3
                    Object obj2;
                    obj2;
                    obj;
                    JVM INSTR monitorexit ;
                    throw obj2;
                    obj2;
                    if (!KahunaCommon.mDebugEnabled) goto _L7; else goto _L6
_L6:
                    Log.d("Kahuna", (new StringBuilder()).append("Exception occured trying to retrieve app language or timezone:").append(obj2).toString());
                      goto _L7
                }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
            }));
            return;
        }
        catch (Exception exception)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.start(): ").append(exception).toString());
        }
    }

    public void stop()
    {
        try
        {
            mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

                final KahunaCommon this$0;

                public void run()
                {
                    Object obj = KahunaCommon.startStopLock;
                    obj;
                    JVM INSTR monitorenter ;
                    int i;
                    i = mActivityCount.decrementAndGet();
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.d("Kahuna", (new StringBuilder()).append("Called stop, remaining activities in foreground is: ").append(i).toString());
                    }
                    if (i != 0)
                    {
                        break MISSING_BLOCK_LABEL_169;
                    }
                    if (mStopTimer != null)
                    {
                        mStopTimer.cancel();
                        mStopTimer = null;
                    }
                    mStopTimer = new Timer();
                /* block-local class not found */
                class _cls1 {}

                    mStopTimer.schedule(new _cls1(), 5000L);
                    synchronized (mEventsLock)
                    {
                        KahunaPreferences.saveEvents(mEventsQueue, mAppContext);
                    }
                    KahunaPreferences.saveEventNumber(mEventNumber.get(), mAppContext);
                    obj;
                    JVM INSTR monitorexit ;
                    return;
                    exception2;
                    obj1;
                    JVM INSTR monitorexit ;
                    throw exception2;
                    Exception exception1;
                    exception1;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception1;
                }

            
            {
                this$0 = KahunaCommon.this;
                super();
            }
            }));
            return;
        }
        catch (Exception exception)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.stop(): ").append(exception).toString());
        }
    }

    public void trackEvent(Event event)
    {
        handleCommonTrackEvent(event);
    }

    public void trackEvent(String s)
    {
        handleCommonTrackEvent(s, -1, -1, false);
    }

    public void trackEvent(String s, int i, int j)
    {
        handleCommonTrackEvent(s, i, j, true);
    }

    public void trackPushClickedEvent(String s)
    {
        try
        {
            Event event = new Event("k_push_clicked", System.currentTimeMillis() / 1000L);
            event.setTrackingId(s);
            if (sdkPushLaunchOverride)
            {
                event.setPushClickedOverride();
            }
            trackEventInternal(event);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.trackPushClicked(): ").append(s).toString());
        }
    }

    protected void trackRegionMonitoringEvent(final String regionId, final String status)
    {
        mKahunaExecutor.execute(new KahunaBackgroundRunnable(new Runnable() {

            final KahunaCommon this$0;
            final String val$regionId;
            final String val$status;

            public void run()
            {
                try
                {
                    HashMap hashmap = new HashMap();
                    hashmap.put("id", regionId);
                    hashmap.put("status", status);
                    hashmap.put("type", "circle");
                    Event event = new Event("k_user_location");
                    event.setLocationMetadata(hashmap);
                    trackEventInternal(event);
                    return;
                }
                catch (Exception exception)
                {
                    Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.trackRegionMonitoringEvent(): ").append(exception).toString());
                }
            }

            
            {
                this$0 = KahunaCommon.this;
                regionId = s;
                status = s1;
                super();
            }
        }));
    }

    public void unregisterInAppMessageListener()
    {
        mInAppMessageListener = null;
    }

    static 
    {
        MAX_EVENTS_TO_ARCHIVE = 5000;
    }








/*
    static Timer access$1302(KahunaCommon kahunacommon, Timer timer)
    {
        kahunacommon.mStopTimer = timer;
        return timer;
    }

*/



/*
    static boolean access$1402(KahunaCommon kahunacommon, boolean flag)
    {
        kahunacommon.mPushEnabled = flag;
        return flag;
    }

*/







/*
    static KahunaTimer access$1902(KahunaCommon kahunacommon, KahunaTimer kahunatimer)
    {
        kahunacommon.mBatchTimer = kahunatimer;
        return kahunatimer;
    }

*/







/*
    static boolean access$2602(KahunaCommon kahunacommon, boolean flag)
    {
        kahunacommon.mConnectionInProgress = flag;
        return flag;
    }

*/










/*
    static String access$3302(KahunaCommon kahunacommon, String s)
    {
        kahunacommon.HYBRID_SDK_KEY = s;
        return s;
    }

*/



/*
    static String access$3402(KahunaCommon kahunacommon, String s)
    {
        kahunacommon.HYBRID_SDK_VALUE = s;
        return s;
    }

*/



/*
    static KahunaSDKConfiguration access$3502(KahunaCommon kahunacommon, KahunaSDKConfiguration kahunasdkconfiguration)
    {
        kahunacommon.mSDKConfig = kahunasdkconfiguration;
        return kahunasdkconfiguration;
    }

*/






/*
    static List access$3902(KahunaCommon kahunacommon, List list)
    {
        kahunacommon.mEventsInProgress = list;
        return list;
    }

*/




/*
    static List access$402(KahunaCommon kahunacommon, List list)
    {
        kahunacommon.mEventsQueue = list;
        return list;
    }

*/





/*
    static long access$4302(KahunaCommon kahunacommon, long l)
    {
        kahunacommon.mLastBatchSentTimestamp = l;
        return l;
    }

*/






/*
    static String access$602(KahunaCommon kahunacommon, String s)
    {
        kahunacommon.mCorruptedArchivePayload = s;
        return s;
    }

*/



/*
    static JSONArray access$702(KahunaCommon kahunacommon, JSONArray jsonarray)
    {
        kahunacommon.mCorruptedEventNames = jsonarray;
        return jsonarray;
    }

*/



/*
    static boolean access$802(KahunaCommon kahunacommon, boolean flag)
    {
        kahunacommon.mDebugBuild = flag;
        return flag;
    }

*/

}
