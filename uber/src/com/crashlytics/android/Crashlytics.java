// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.internal.CrashEventDataProvider;
import com.crashlytics.android.internal.models.SessionEventData;
import hui;
import hup;
import huq;
import hur;
import hvf;
import hvh;
import hvk;
import hvl;
import hvp;
import hvq;
import hwm;
import hws;
import hwt;
import hxk;
import hxl;
import hxm;
import hxs;
import hxx;
import hxy;
import hxz;
import hye;
import hym;
import hyo;
import hyp;
import hyq;
import hyv;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsExecutorServiceWrapper, CrashlyticsUncaughtExceptionHandler, DialogStringResolver, CrashlyticsPinningInfoProvider, 
//            BuildIdValidator, CrashTest, ReportUploader, DefaultCreateReportSpiCall, 
//            CrashlyticsMissingDependencyException, SessionDataWriter, CrashlyticsListener, PinningInfoProvider, 
//            CreateReportSpiCall

public class Crashlytics extends hup
    implements huq
{

    static final float CLS_DEFAULT_PROCESS_DELAY = 1F;
    static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    private static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    public static final String TAG = "Fabric";
    private final ConcurrentHashMap attributes;
    private String buildId;
    private float delay;
    private boolean disabled;
    private CrashlyticsExecutorServiceWrapper executorServiceWrapper;
    private CrashEventDataProvider externalCrashEventDataProvider;
    private CrashlyticsUncaughtExceptionHandler handler;
    private hxs httpRequestFactory;
    private File initializationMarkerFile;
    private String installerPackageName;
    private final Collection kits;
    private CrashlyticsListener listener;
    private String packageName;
    private final PinningInfoProvider pinningInfo;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;
    private String versionCode;
    private String versionName;

    public Crashlytics()
    {
        this(1.0F, null, null, false);
    }

    Crashlytics(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag)
    {
        this(f, crashlyticslistener, pinninginfoprovider, flag, hvp.a("Crashlytics Exception Handler"));
    }

    Crashlytics(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag, ExecutorService executorservice)
    {
        userId = null;
        userEmail = null;
        userName = null;
        attributes = new ConcurrentHashMap();
        startTime = System.currentTimeMillis();
        delay = f;
        listener = crashlyticslistener;
        pinningInfo = pinninginfoprovider;
        disabled = flag;
        executorServiceWrapper = new CrashlyticsExecutorServiceWrapper(executorservice);
        kits = Collections.unmodifiableCollection(Arrays.asList(new hup[] {
            new Answers(), new Beta()
        }));
    }

    private int dipsToPixels(float f, int i)
    {
        return (int)((float)i * f);
    }

    private static void doLog(int i, String s, String s1)
    {
        Crashlytics crashlytics;
        if (!isDisabled())
        {
            if (ensureFabricWithCalled("prior to logging messages.", crashlytics = getInstance()))
            {
                long l = System.currentTimeMillis();
                long l1 = crashlytics.startTime;
                crashlytics.handler.writeToLog(l - l1, formatLogMessage(i, s, s1));
                return;
            }
        }
    }

    private static boolean ensureFabricWithCalled(String s, Crashlytics crashlytics)
    {
        if (crashlytics == null || crashlytics.handler == null)
        {
            hui.c().c("Fabric", (new StringBuilder("Crashlytics must be initialized by calling Fabric.with(Context) ")).append(s).toString(), null);
            return false;
        } else
        {
            return true;
        }
    }

    private void finishInitSynchronously()
    {
        Object obj = new _cls1();
        for (Iterator iterator = getDependencies().iterator(); iterator.hasNext(); ((hwm) (obj)).addDependency((hws)iterator.next())) { }
        obj = getFabric().b().submit(((java.util.concurrent.Callable) (obj)));
        hui.c().a("Fabric", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try
        {
            ((Future) (obj)).get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            hui.c().c("Fabric", "Crashlytics was interrupted during initialization.", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            hui.c().c("Fabric", "Problem encountered during Crashlytics initialization.", executionexception);
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            hui.c().c("Fabric", "Crashlytics timed out during initialization.", timeoutexception);
        }
    }

    private static String formatLogMessage(int i, String s, String s1)
    {
        return (new StringBuilder()).append(hvh.b(i)).append("/").append(s).append(" ").append(s1).toString();
    }

    public static Crashlytics getInstance()
    {
        Crashlytics crashlytics;
        try
        {
            crashlytics = (Crashlytics)hui.a(com/crashlytics/android/Crashlytics);
        }
        catch (IllegalStateException illegalstateexception)
        {
            hui.c().c("Fabric", "Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()", null);
            throw illegalstateexception;
        }
        return crashlytics;
    }

    public static PinningInfoProvider getPinningInfoProvider()
    {
        if (!isDisabled())
        {
            return getInstance().pinningInfo;
        } else
        {
            return null;
        }
    }

    private boolean getSendDecisionFromUser(Activity activity, hyo hyo)
    {
        DialogStringResolver dialogstringresolver = new DialogStringResolver(activity, hyo);
        OptInLatch optinlatch = new OptInLatch(null);
        activity.runOnUiThread(new _cls7(activity, optinlatch, dialogstringresolver, hyo));
        hui.c().a("Fabric", "Waiting for user opt-in.");
        optinlatch.await();
        return optinlatch.getOptIn();
    }

    private static boolean isDisabled()
    {
        Crashlytics crashlytics = getInstance();
        return crashlytics == null || crashlytics.disabled;
    }

    private boolean isRequiringBuildId(Context context)
    {
        return hvh.a(context, "com.crashlytics.RequireBuildId", true);
    }

    public static void log(int i, String s, String s1)
    {
        doLog(i, s, s1);
        hui.c().a(i, s, s1, true);
    }

    public static void log(String s)
    {
        doLog(3, "Fabric", s);
    }

    public static void logException(Throwable throwable)
    {
        Crashlytics crashlytics;
        if (!isDisabled())
        {
            if (ensureFabricWithCalled("prior to logging exceptions.", crashlytics = getInstance()))
            {
                if (throwable == null)
                {
                    hui.c().a(5, "Fabric", "Crashlytics is ignoring a request to log a null exception.");
                    return;
                } else
                {
                    crashlytics.handler.writeNonFatalException(Thread.currentThread(), throwable);
                    return;
                }
            }
        }
    }

    static void recordFatalExceptionEvent(String s)
    {
        Answers answers = (Answers)hui.a(com/crashlytics/android/answers/Answers);
        if (answers != null)
        {
            answers.onException(new hvk(s));
        }
    }

    static void recordLoggedExceptionEvent(String s)
    {
        Answers answers = (Answers)hui.a(com/crashlytics/android/answers/Answers);
        if (answers != null)
        {
            answers.onException(new hvl(s));
        }
    }

    private static String sanitizeAttribute(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s = s.trim();
            s1 = s;
            if (s.length() > 1024)
            {
                s1 = s.substring(0, 1024);
            }
        }
        return s1;
    }

    private void setAndValidateKitProperties(Context context, String s)
    {
        Object obj;
        if (pinningInfo != null)
        {
            obj = new CrashlyticsPinningInfoProvider(pinningInfo);
        } else
        {
            obj = null;
        }
        httpRequestFactory = new hxk(hui.c());
        httpRequestFactory.a(((hxu) (obj)));
        packageName = context.getPackageName();
        installerPackageName = getIdManager().h();
        hui.c().a("Fabric", (new StringBuilder("Installer package name is: ")).append(installerPackageName).toString());
        obj = context.getPackageManager().getPackageInfo(packageName, 0);
        versionCode = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        obj = "0.0";
_L1:
        try
        {
            versionName = ((String) (obj));
            buildId = hvh.l(context);
        }
        catch (Exception exception)
        {
            hui.c().c("Fabric", "Error setting up app properties", exception);
        }
        getIdManager().i();
        getBuildIdValidator(buildId, isRequiringBuildId(context)).validate(s, packageName);
        return;
        obj = ((PackageInfo) (obj)).versionName;
          goto _L1
    }

    public static void setBool(String s, boolean flag)
    {
        setString(s, Boolean.toString(flag));
    }

    public static void setDouble(String s, double d)
    {
        setString(s, Double.toString(d));
    }

    public static void setFloat(String s, float f)
    {
        setString(s, Float.toString(f));
    }

    public static void setInt(String s, int i)
    {
        setString(s, Integer.toString(i));
    }

    public static void setLong(String s, long l)
    {
        setString(s, Long.toString(l));
    }

    public static void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
    {
        hui.c().c("Fabric", "Use of Crashlytics.setPinningInfoProvider is deprecated");
    }

    public static void setString(String s, String s1)
    {
        if (isDisabled())
        {
            return;
        }
        if (s == null)
        {
            if (getInstance().getContext() != null && hvh.i(getInstance().getContext()))
            {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            } else
            {
                hui.c().c("Fabric", "Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
        }
        String s2 = sanitizeAttribute(s);
        if (getInstance().attributes.size() < 64 || getInstance().attributes.containsKey(s2))
        {
            if (s1 == null)
            {
                s = "";
            } else
            {
                s = sanitizeAttribute(s1);
            }
            getInstance().attributes.put(s2, s);
            return;
        } else
        {
            hui.c().a("Fabric", "Exceeded maximum number of custom attributes (64)");
            return;
        }
    }

    public static void setUserEmail(String s)
    {
        if (isDisabled())
        {
            return;
        } else
        {
            getInstance().userEmail = sanitizeAttribute(s);
            return;
        }
    }

    public static void setUserIdentifier(String s)
    {
        if (isDisabled())
        {
            return;
        } else
        {
            getInstance().userId = sanitizeAttribute(s);
            return;
        }
    }

    public static void setUserName(String s)
    {
        if (isDisabled())
        {
            return;
        } else
        {
            getInstance().userName = sanitizeAttribute(s);
            return;
        }
    }

    boolean canSendWithUserApproval()
    {
        return ((Boolean)hyq.a().a(new _cls6(), Boolean.valueOf(true))).booleanValue();
    }

    public void crash()
    {
        (new CrashTest()).indexOutOfBounds();
    }

    boolean didPreviousInitializationComplete()
    {
        return ((Boolean)executorServiceWrapper.executeSyncLoggingException(new _cls4())).booleanValue();
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    protected Void doInBackground()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        markInitializationStarted();
        handler.cleanInvalidTempFiles();
        flag2 = true;
        flag1 = true;
        flag = flag2;
        Object obj = hyq.a().b();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        flag = flag2;
        hui.c().c("Fabric", "Received null settings, skipping initialization!");
        markInitializationComplete();
        return null;
        flag = flag2;
        if (!((hyv) (obj)).d.c) goto _L2; else goto _L1
_L1:
        flag2 = false;
        flag1 = false;
        flag = flag2;
        handler.finalizeSessions();
        flag = flag2;
        obj = getCreateReportSpiCall(((hyv) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag2;
        (new ReportUploader(((CreateReportSpiCall) (obj)))).uploadReports(delay);
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        hui.c().a("Fabric", "Crash reporting disabled.");
        markInitializationComplete();
        return null;
_L4:
        flag = flag2;
        hui.c().c("Fabric", "Unable to create a call to upload reports.");
          goto _L2
        Object obj1;
        obj1;
        hui.c().c("Fabric", "Error dealing with settings", ((Throwable) (obj1)));
        flag1 = flag;
          goto _L2
        obj1;
        hui.c().c("Fabric", "Problem encountered during Crashlytics initialization.", ((Throwable) (obj1)));
        markInitializationComplete();
        return null;
        obj1;
        markInitializationComplete();
        throw obj1;
    }

    Map getAttributes()
    {
        return Collections.unmodifiableMap(attributes);
    }

    String getBuildId()
    {
        return buildId;
    }

    BuildIdValidator getBuildIdValidator(String s, boolean flag)
    {
        return new BuildIdValidator(s, flag);
    }

    CreateReportSpiCall getCreateReportSpiCall(hyv hyv1)
    {
        if (hyv1 != null)
        {
            return new DefaultCreateReportSpiCall(this, getOverridenSpiEndpoint(), hyv1.a.d, httpRequestFactory);
        } else
        {
            return null;
        }
    }

    public boolean getDebugMode()
    {
        hui.c().c("Fabric", "Use of Crashlytics.getDebugMode is deprecated.");
        getFabric();
        return hui.d();
    }

    SessionEventData getExternalCrashEventData()
    {
        SessionEventData sessioneventdata = null;
        if (externalCrashEventDataProvider != null)
        {
            sessioneventdata = externalCrashEventDataProvider.getCrashEventData();
        }
        return sessioneventdata;
    }

    CrashlyticsUncaughtExceptionHandler getHandler()
    {
        return handler;
    }

    public String getIdentifier()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    String getInstallerPackageName()
    {
        return installerPackageName;
    }

    public Collection getKits()
    {
        return kits;
    }

    String getOverridenSpiEndpoint()
    {
        return hvh.d(getInstance().getContext(), "com.crashlytics.ApiEndpoint");
    }

    String getPackageName()
    {
        return packageName;
    }

    File getSdkDirectory()
    {
        return (new hxx(this)).a();
    }

    hyp getSessionSettingsData()
    {
        hyv hyv1 = hyq.a().b();
        if (hyv1 == null)
        {
            return null;
        } else
        {
            return hyv1.b;
        }
    }

    String getUserEmail()
    {
        if (getIdManager().a())
        {
            return userEmail;
        } else
        {
            return null;
        }
    }

    String getUserIdentifier()
    {
        if (getIdManager().a())
        {
            return userId;
        } else
        {
            return null;
        }
    }

    String getUserName()
    {
        if (getIdManager().a())
        {
            return userName;
        } else
        {
            return null;
        }
    }

    public String getVersion()
    {
        return "2.2.3.41";
    }

    String getVersionCode()
    {
        return versionCode;
    }

    String getVersionName()
    {
        return versionName;
    }

    boolean internalVerifyPinning(URL url)
    {
        if (getPinningInfoProvider() != null)
        {
            url = httpRequestFactory.a(hxl.a, url.toString());
            ((HttpsURLConnection)url.a()).setInstanceFollowRedirects(false);
            url.b();
            return true;
        } else
        {
            return false;
        }
    }

    void markInitializationComplete()
    {
        executorServiceWrapper.executeAsync(new _cls3());
    }

    void markInitializationStarted()
    {
        executorServiceWrapper.executeSyncLoggingException(new _cls2());
    }

    protected boolean onPreExecute()
    {
        return onPreExecute(super.getContext());
    }

    boolean onPreExecute(Context context)
    {
        Object obj;
        if (disabled)
        {
            return false;
        }
        new hvf();
        obj = hvf.a(context);
        if (obj == null)
        {
            return false;
        }
        hui.c().b("Fabric", (new StringBuilder("Initializing Crashlytics ")).append(getVersion()).toString());
        initializationMarkerFile = new File(getSdkDirectory(), "initialization_marker");
        Exception exception;
        boolean flag;
        try
        {
            setAndValidateKitProperties(context, ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            hui.c().c("Fabric", "Crashlytics was not started due to an exception during initialization", context);
            return false;
        }
        obj = new SessionDataWriter(getContext(), buildId, getPackageName());
        hui.c().a("Fabric", "Installing exception handler...");
        handler = new CrashlyticsUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler(), listener, executorServiceWrapper, getIdManager(), ((SessionDataWriter) (obj)), this);
        flag = didPreviousInitializationComplete();
        handler.ensureOpenSessionExists();
        Thread.setDefaultUncaughtExceptionHandler(handler);
        hui.c().a("Fabric", "Successfully installed exception handler.");
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!hvh.m(context))
        {
            break; /* Loop/switch isn't completed */
        }
        finishInitSynchronously();
        return false;
_L3:
        hui.c().c("Fabric", "There was a problem installing the exception handler.", exception);
        if (true) goto _L2; else goto _L1
        context;
        throw new hwt(context);
_L1:
        return true;
        exception;
          goto _L3
        exception;
        flag = false;
          goto _L3
    }

    public void setDebugMode(boolean flag)
    {
        hui.c().c("Fabric", "Use of Crashlytics.setDebugMode is deprecated.");
    }

    void setExternalCrashEventDataProvider(CrashEventDataProvider crasheventdataprovider)
    {
        externalCrashEventDataProvider = crasheventdataprovider;
    }

    public void setListener(CrashlyticsListener crashlyticslistener)
    {
        this;
        JVM INSTR monitorenter ;
        hui.c().c("Fabric", "Use of Crashlytics.setListener is deprecated.");
        if (crashlyticslistener != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        throw new IllegalArgumentException("listener must not be null.");
        crashlyticslistener;
        this;
        JVM INSTR monitorexit ;
        throw crashlyticslistener;
        listener = crashlyticslistener;
        this;
        JVM INSTR monitorexit ;
    }

    void setShouldSendUserReportsWithoutPrompting(boolean flag)
    {
        hxz hxz1 = new hxz(this);
        hxz1.a(hxz1.b().putBoolean("always_send_reports_opt_in", flag));
    }

    boolean shouldPromptUserBeforeSendingCrashReports()
    {
        return ((Boolean)hyq.a().a(new _cls5(), Boolean.valueOf(false))).booleanValue();
    }

    boolean shouldSendReportsWithoutPrompting()
    {
        return (new hxz(this)).a().getBoolean("always_send_reports_opt_in", false);
    }

    public boolean verifyPinning(URL url)
    {
        boolean flag;
        try
        {
            flag = internalVerifyPinning(url);
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            hui.c().c("Fabric", "Could not verify SSL pinning", url);
            return false;
        }
        return flag;
    }




    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class OptInLatch {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}

}
