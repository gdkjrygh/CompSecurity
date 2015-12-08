// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            LoggingBehavior, Response, FacebookRequestError, Request, 
//            RequestBatch, FacebookException, BoltsMeasurementEventListener

public final class Settings
{

    private static final String ANALYTICS_EVENT = "event";
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    private static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    private static final String AUTO_PUBLISH = "auto_publish";
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
    private static final int DEFAULT_CORE_POOL_SIZE = 5;
    private static final int DEFAULT_KEEP_ALIVE = 1;
    private static final int DEFAULT_MAXIMUM_POOL_SIZE = 128;
    private static final ThreadFactory DEFAULT_THREAD_FACTORY = new ThreadFactory() {

        private final AtomicInteger counter = new AtomicInteger(0);

        public Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder()).append("FacebookSdk #").append(counter.incrementAndGet()).toString());
        }

    };
    private static final BlockingQueue DEFAULT_WORK_QUEUE = new LinkedBlockingQueue(10);
    private static final String FACEBOOK_COM = "facebook.com";
    private static final Object LOCK = new Object();
    private static final String MOBILE_INSTALL_EVENT = "MOBILE_APP_INSTALL";
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
    private static final String TAG = com/facebook/Settings.getCanonicalName();
    private static volatile String appClientToken;
    private static volatile String appVersion;
    private static volatile String applicationId;
    private static volatile boolean defaultsLoaded = false;
    private static volatile Executor executor;
    private static volatile String facebookDomain = "facebook.com";
    private static volatile boolean isDebugEnabled = false;
    private static final HashSet loggingBehaviors;
    private static AtomicLong onProgressThreshold = new AtomicLong(0x10000L);
    private static volatile boolean platformCompatibilityEnabled;
    private static Boolean sdkInitialized = Boolean.valueOf(false);
    private static volatile boolean shouldAutoPublishInstall;

    public Settings()
    {
    }

    public static final void addLoggingBehavior(LoggingBehavior loggingbehavior)
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.add(loggingbehavior);
        }
        return;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    public static final void clearLoggingBehaviors()
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.clear();
        }
        return;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String getAppVersion()
    {
        return appVersion;
    }

    public static String getApplicationId()
    {
        return applicationId;
    }

    public static String getApplicationSignature(Context context)
    {
        PackageManager packagemanager;
        if (context != null)
        {
            if ((packagemanager = context.getPackageManager()) != null)
            {
                context = context.getPackageName();
                Signature asignature[];
                try
                {
                    context = packagemanager.getPackageInfo(context, 64);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return null;
                }
                asignature = ((PackageInfo) (context)).signatures;
                if (asignature != null && asignature.length != 0)
                {
                    MessageDigest messagedigest;
                    try
                    {
                        messagedigest = MessageDigest.getInstance("SHA-1");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        return null;
                    }
                    messagedigest.update(((PackageInfo) (context)).signatures[0].toByteArray());
                    return Base64.encodeToString(messagedigest.digest(), 9);
                }
            }
        }
        return null;
    }

    private static Executor getAsyncTaskExecutor()
    {
        Object obj;
        try
        {
            obj = android/os/AsyncTask.getField("THREAD_POOL_EXECUTOR");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj = ((Field) (obj)).get(null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        if (!(obj instanceof Executor))
        {
            return null;
        } else
        {
            return (Executor)obj;
        }
    }

    public static String getAttributionId(ContentResolver contentresolver)
    {
        String s;
        try
        {
            contentresolver = contentresolver.query(ATTRIBUTION_ID_CONTENT_URI, new String[] {
                "aid"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            Log.d(TAG, (new StringBuilder()).append("Caught unexpected exception in getAttributionId(): ").append(contentresolver.toString()).toString());
            return null;
        }
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!contentresolver.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        s = contentresolver.getString(contentresolver.getColumnIndex("aid"));
        contentresolver.close();
        return s;
        return null;
    }

    public static String getClientToken()
    {
        return appClientToken;
    }

    public static Executor getExecutor()
    {
        Object obj1 = LOCK;
        obj1;
        JVM INSTR monitorenter ;
        Executor executor1;
        if (executor != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        executor1 = getAsyncTaskExecutor();
        Object obj;
        obj = executor1;
        if (executor1 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, DEFAULT_WORK_QUEUE, DEFAULT_THREAD_FACTORY);
        executor = ((Executor) (obj));
        obj1;
        JVM INSTR monitorexit ;
        return executor;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String getFacebookDomain()
    {
        return facebookDomain;
    }

    public static boolean getLimitEventAndDataUsage(Context context)
    {
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final Set getLoggingBehaviors()
    {
        Set set;
        synchronized (loggingBehaviors)
        {
            set = Collections.unmodifiableSet(new HashSet(loggingBehaviors));
        }
        return set;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static long getOnProgressThreshold()
    {
        return onProgressThreshold.get();
    }

    public static boolean getPlatformCompatibilityEnabled()
    {
        return platformCompatibilityEnabled;
    }

    public static String getSdkVersion()
    {
        return "3.20.0";
    }

    public static boolean getShouldAutoPublishInstall()
    {
        return shouldAutoPublishInstall;
    }

    public static final boolean isDebugEnabled()
    {
        return isDebugEnabled;
    }

    public static final boolean isLoggingBehaviorEnabled(LoggingBehavior loggingbehavior)
    {
        HashSet hashset = loggingBehaviors;
        hashset;
        JVM INSTR monitorenter ;
        boolean flag;
        if (isDebugEnabled() && loggingBehaviors.contains(loggingbehavior))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashset;
        JVM INSTR monitorexit ;
        return flag;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    public static final boolean isLoggingEnabled()
    {
        return isDebugEnabled();
    }

    public static void loadDefaultsFromMetadata(Context context)
    {
        defaultsLoaded = true;
        if (context != null)
        {
            try
            {
                context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            if (context != null && ((ApplicationInfo) (context)).metaData != null)
            {
                if (applicationId == null)
                {
                    applicationId = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationId");
                }
                if (appClientToken == null)
                {
                    appClientToken = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ClientToken");
                    return;
                }
            }
        }
    }

    static void loadDefaultsFromMetadataIfNeeded(Context context)
    {
        if (!defaultsLoaded)
        {
            loadDefaultsFromMetadata(context);
        }
    }

    static Response publishInstallAndWaitForResponse(Context context, String s, boolean flag)
    {
        if (context == null || s == null)
        {
            try
            {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Utility.logd("Facebook-publish", context);
            }
            return new Response(null, null, new FacebookRequestError(null, context));
        }
        String s1;
        String s2;
        String s3;
        SharedPreferences sharedpreferences;
        AttributionIdentifiers attributionidentifiers;
        long l;
        attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
        sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
        s1 = (new StringBuilder()).append(s).append("ping").toString();
        s2 = (new StringBuilder()).append(s).append("json").toString();
        l = sharedpreferences.getLong(s1, 0L);
        s3 = sharedpreferences.getString(s2, null);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        setShouldAutoPublishInstall(false);
        Object obj;
        obj = com.facebook.model.GraphObject.Factory.create();
        ((GraphObject) (obj)).setProperty("event", "MOBILE_APP_INSTALL");
        Utility.setAppEventAttributionParameters(((GraphObject) (obj)), attributionidentifiers, Utility.getHashedDeviceAndAppID(context, s), getLimitEventAndDataUsage(context));
        ((GraphObject) (obj)).setProperty("auto_publish", Boolean.valueOf(flag));
        ((GraphObject) (obj)).setProperty("application_package_name", context.getPackageName());
        obj = Request.newPostRequest(null, String.format("%s/activities", new Object[] {
            s
        }), ((GraphObject) (obj)), null);
        if (l == 0L) goto _L2; else goto _L1
_L1:
        s = null;
        context = s;
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        context = com.facebook.model.GraphObject.Factory.create(new JSONObject(s3));
_L4:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        return (Response)Response.createResponsesFromString("true", null, new RequestBatch(new Request[] {
            obj
        }), true).get(0);
        return new Response(null, null, null, context, true);
_L2:
        if (attributionidentifiers == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        if (attributionidentifiers.getAndroidAdvertiserId() != null || attributionidentifiers.getAttributionId() != null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        throw new FacebookException("No attribution id available to send to server.");
        if (!Utility.queryAppSettings(s, false).supportsAttribution())
        {
            throw new FacebookException("Install attribution has been disabled on the server.");
        }
        context = ((Request) (obj)).executeAndWait();
        s = sharedpreferences.edit();
        s.putLong(s1, System.currentTimeMillis());
        if (context.getGraphObject() != null && context.getGraphObject().getInnerJSONObject() != null)
        {
            s.putString(s2, context.getGraphObject().getInnerJSONObject().toString());
        }
        s.apply();
        return context;
        context;
        context = s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void publishInstallAsync(Context context, String s, Request.Callback callback)
    {
        context = context.getApplicationContext();
        getExecutor().execute(new Runnable(context, s, callback) {

            final Context val$applicationContext;
            final String val$applicationId;
            final Request.Callback val$callback;

            public void run()
            {
                Response response = Settings.publishInstallAndWaitForResponse(applicationContext, applicationId, false);
                if (callback != null)
                {
                    (new Handler(Looper.getMainLooper())).post(response. new Runnable() {

                        final _cls2 this$0;
                        final Response val$response;

                        public void run()
                        {
                            callback.onCompleted(response);
                        }

            
            {
                this$0 = final__pcls2;
                response = Response.this;
                super();
            }
                    });
                }
            }

            
            {
                applicationContext = context;
                applicationId = s;
                callback = callback1;
                super();
            }
        });
    }

    public static final void removeLoggingBehavior(LoggingBehavior loggingbehavior)
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.remove(loggingbehavior);
        }
        return;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    public static void sdkInitialize(Context context)
    {
        com/facebook/Settings;
        JVM INSTR monitorenter ;
        boolean flag = sdkInitialized.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/Settings;
        JVM INSTR monitorexit ;
        return;
_L2:
        loadDefaultsFromMetadataIfNeeded(context);
        Utility.loadAppSettingsAsync(context, getApplicationId());
        BoltsMeasurementEventListener.getInstance(context.getApplicationContext());
        sdkInitialized = Boolean.valueOf(true);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void setAppVersion(String s)
    {
        appVersion = s;
    }

    public static void setApplicationId(String s)
    {
        applicationId = s;
    }

    public static void setClientToken(String s)
    {
        appClientToken = s;
    }

    public static void setExecutor(Executor executor1)
    {
        Validate.notNull(executor1, "executor");
        synchronized (LOCK)
        {
            executor = executor1;
        }
        return;
        executor1;
        obj;
        JVM INSTR monitorexit ;
        throw executor1;
    }

    public static void setFacebookDomain(String s)
    {
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = s;
    }

    public static final void setIsDebugEnabled(boolean flag)
    {
        isDebugEnabled = flag;
    }

    public static final void setIsLoggingEnabled(boolean flag)
    {
        setIsDebugEnabled(flag);
    }

    public static void setLimitEventAndDataUsage(Context context, boolean flag)
    {
        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("limitEventUsage", flag).apply();
    }

    public static void setOnProgressThreshold(long l)
    {
        onProgressThreshold.set(l);
    }

    public static void setPlatformCompatibilityEnabled(boolean flag)
    {
        platformCompatibilityEnabled = flag;
    }

    public static void setShouldAutoPublishInstall(boolean flag)
    {
        shouldAutoPublishInstall = flag;
    }

    static 
    {
        loggingBehaviors = new HashSet(Arrays.asList(new LoggingBehavior[] {
            LoggingBehavior.DEVELOPER_ERRORS
        }));
    }
}
