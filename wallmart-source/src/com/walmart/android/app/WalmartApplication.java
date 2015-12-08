// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.support.multidex.MultiDexApplication;
import android.text.TextUtils;
import android.webkit.WebViewDatabase;
import com.arubanetworks.meridian.Meridian;
import com.crashlytics.android.Crashlytics;
import com.squareup.okhttp.CipherSuite;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.otto.Bus;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.walmart.android.analytics.Collector;
import com.walmart.android.analytics.CrashlyticsKeys;
import com.walmart.android.analytics.Tracker;
import com.walmart.android.analytics.events.WalmartBulkParams;
import com.walmart.android.app.photo.PhotoAppConfigurationReceiver;
import com.walmart.android.app.push.UAPushNotificationFactory;
import com.walmart.android.config.ServiceConfigChangedEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.weeklyad.WeeklyAdConfiguration;
import com.walmart.android.ui.CustomAlertDialog;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.VersionUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.android.photo.service.PhotoAuthenticationStatusReceiver;
import com.walmartlabs.anivia.AniviaLog;
import com.walmartlabs.anivia.AniviaTracker;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.utils.WLog;
import io.theholygrail.jsbridge.JSLog;
import java.util.Arrays;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app:
//            ActivityTracker

public class WalmartApplication extends MultiDexApplication
{
    private static class HybridBridgeLog
        implements io.theholygrail.jsbridge.JSLog.LogInterface
    {

        public void debug(String s, String s1, Throwable throwable)
        {
            WLog.d(s, s1);
        }

        public void error(String s, String s1, Throwable throwable)
        {
            if (throwable != null)
            {
                WLog.e(s, s1, throwable);
                return;
            } else
            {
                WLog.e(s, s1);
                return;
            }
        }

        public void failure(String s, String s1, Throwable throwable)
        {
            error(s, s1, throwable);
        }

        public void info(String s, String s1, Throwable throwable)
        {
            WLog.i(s, s1);
        }

        public void verbose(String s, String s1, Throwable throwable)
        {
            WLog.v(s, s1);
        }

        public void warn(String s, String s1, Throwable throwable)
        {
            WLog.w(s, s1);
        }

        private HybridBridgeLog()
        {
        }

    }

    private static class WAniviaLog extends AniviaLog
    {

        public void debug(String s, String s1, Throwable throwable)
        {
            WLog.d(s, s1);
        }

        public void error(String s, String s1, Throwable throwable)
        {
            if (throwable != null)
            {
                WLog.e(s, s1, throwable);
                return;
            } else
            {
                WLog.e(s, s1);
                return;
            }
        }

        public void info(String s, String s1, Throwable throwable)
        {
            WLog.i(s, s1);
        }

        public void verbose(String s, String s1, Throwable throwable)
        {
            WLog.v(s, s1);
        }

        public void warn(String s, String s1, Throwable throwable)
        {
            WLog.w(s, s1);
        }

        public void whatTheFox(String s, String s1, Throwable throwable)
        {
            error(s, s1, throwable);
        }

        private WAniviaLog()
        {
        }

    }


    private static final ConnectionSpec COMPATIBLE_TLS_RC4;
    private static final ConnectionSpec MODERN_TLS_RC4;
    private static final CipherSuite OUR_CIPHER_SUITES[];
    private Tracker mAnalyticsTracker;
    private long mCreationTime;
    private int mNoOfLaunches;

    public WalmartApplication()
    {
    }

    private void clearOldWebViewFormData()
    {
        if (!SharedPreferencesUtil.hasClearedWebViewFormData(this))
        {
            WebViewDatabase webviewdatabase = WebViewDatabase.getInstance(this);
            if (webviewdatabase != null)
            {
                webviewdatabase.clearFormData();
            }
            deleteDatabase("webview.db");
            SharedPreferencesUtil.setHasClearedWebViewFormData(this);
        }
    }

    private void createOkHttpClient()
    {
        SharedHttpClient.create(this);
        SharedHttpClient.get().setConnectionSpecs(Arrays.asList(new ConnectionSpec[] {
            MODERN_TLS_RC4, COMPATIBLE_TLS_RC4, ConnectionSpec.CLEARTEXT
        }));
    }

    private void setUrbanAirshipAlias(String s)
    {
        PushManager pushmanager = UAirship.shared().getPushManager();
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "";
        }
        try
        {
            pushmanager.setAlias(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e("WalmartApplication", "Could not set alias for Urban Airship", s);
        }
        return;
    }

    private void setWalmartBulkParams(final AniviaTracker tracker)
    {
        tracker.setExtraBulkParams(WalmartBulkParams.getParams(this, new com.walmart.android.analytics.events.WalmartBulkParams.AsyncParamsListener() {

            final WalmartApplication this$0;
            final AniviaTracker val$tracker;

            public void onReceive(HashMap hashmap)
            {
                tracker.setExtraBulkParams(hashmap, false);
            }

            
            {
                this$0 = WalmartApplication.this;
                tracker = aniviatracker;
                super();
            }
        }), false);
    }

    private void setupAnivia()
    {
        AniviaLog.setInstance(new WAniviaLog());
        mAnalyticsTracker = new Tracker();
        mAnalyticsTracker.start(this);
        setWalmartBulkParams(mAnalyticsTracker.getAniviaTracker());
    }

    private void setupCrashlytics()
    {
        Crashlytics.start(this);
        WLog.setLogListener(new com.walmartlabs.utils.WLog.LogListener() {

            final WalmartApplication this$0;

            public void d(String s, String s1)
            {
                Crashlytics.log((new StringBuilder()).append("d:").append(s).append(": ").append(s1).toString());
            }

            public void e(String s, String s1)
            {
                Crashlytics.log((new StringBuilder()).append("e:").append(s).append(": ").append(s1).toString());
            }

            public void e(String s, String s1, Throwable throwable)
            {
                CrashlyticsKeys.setTimestamp("current_time", System.currentTimeMillis());
                Crashlytics.log((new StringBuilder()).append("e:").append(s).append(": ").append(s1).toString());
                Crashlytics.logException(throwable);
            }

            public void i(String s, String s1)
            {
                Crashlytics.log((new StringBuilder()).append("i:").append(s).append(": ").append(s1).toString());
            }

            public void v(String s, String s1)
            {
                Crashlytics.log((new StringBuilder()).append("v:").append(s).append(": ").append(s1).toString());
            }

            public void w(String s, String s1)
            {
                Crashlytics.log((new StringBuilder()).append("w:").append(s).append(": ").append(s1).toString());
            }

            
            {
                this$0 = WalmartApplication.this;
                super();
            }
        });
        VersionUtil.getCommitId(this, new com.walmart.android.util.VersionUtil.CommitIdCallback() {

            final WalmartApplication this$0;

            public void onResult(String s)
            {
                CrashlyticsKeys.setString("walmart_android", s);
            }

            
            {
                this$0 = WalmartApplication.this;
                super();
            }
        });
    }

    private void setupUrbanAirship()
    {
        try
        {
            UAirship.takeOff(this, new com.urbanairship.UAirship.OnReadyCallback() {

                final WalmartApplication this$0;

                public void onAirshipReady(UAirship uairship)
                {
                    UAPushNotificationFactory uapushnotificationfactory = new UAPushNotificationFactory(WalmartApplication.this);
                    uapushnotificationfactory.setSmallIconId(0x7f0202ef);
                    uairship = uairship.getPushManager();
                    uairship.setNotificationFactory(uapushnotificationfactory);
                    uairship.setPushEnabled(true);
                    uairship.setUserNotificationsEnabled(true);
                }

            
            {
                this$0 = WalmartApplication.this;
                super();
            }
            });
            return;
        }
        catch (Exception exception)
        {
            WLog.e("WalmartApplication", "Failed to setup Urban Airship", exception);
        }
    }

    private int updateNoColdLaunches()
    {
        int i = SharedPreferencesUtil.getNoOfLaunches(this) + 1;
        SharedPreferencesUtil.setNoOfLaunches(this, i);
        return i;
    }

    public AniviaTracker getAniviaTracker()
    {
        if (mAnalyticsTracker != null)
        {
            return mAnalyticsTracker.getAniviaTracker();
        } else
        {
            return null;
        }
    }

    public long getCreationTime()
    {
        return mCreationTime;
    }

    public int getNoOfLaunches()
    {
        return mNoOfLaunches;
    }

    public void onAuthenticationStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        SharedPreferencesUtil.onAuthenticationStatusChanged(this, authenticationstatusevent);
        Crashlytics.setUserIdentifier(authenticationstatusevent.customerId);
        Crashlytics.setUserEmail(authenticationstatusevent.email);
        Crashlytics.setUserName(authenticationstatusevent.firstName);
        setUrbanAirshipAlias(authenticationstatusevent.customerId);
    }

    public void onCreate()
    {
        super.onCreate();
        mCreationTime = System.currentTimeMillis();
        SharedPreferencesUtil.setAppStart(this);
        mNoOfLaunches = updateNoColdLaunches();
        setupCrashlytics();
        createOkHttpClient();
        setupAnivia();
        Collector.init();
        Collector.getInstance().setBulkParams(mAnalyticsTracker.getAniviaTracker().getBulkParams());
        CrashlyticsKeys.setString("anivia_sid", mAnalyticsTracker.getAniviaTracker().getSessionId());
        JSLog.setInstance(new HybridBridgeLog());
        Services.create(this);
        AppConfigManager.create();
        setupUrbanAirship();
        MessageBus.getBus().register(this);
        registerActivityLifecycleCallbacks(new ActivityTracker(this));
        clearOldWebViewFormData();
        PhotoAuthenticationStatusReceiver.create(this);
        PhotoAppConfigurationReceiver.create(this);
        Meridian.configure(this);
        WeeklyAdConfiguration.init(this);
    }

    public void onServiceConfigChanged(ServiceConfigChangedEvent serviceconfigchangedevent)
    {
        Services.create(this);
        mAnalyticsTracker.stop();
        mAnalyticsTracker.start(this);
    }

    static 
    {
        OUR_CIPHER_SUITES = (new CipherSuite[] {
            CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, 
            CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_RSA_WITH_RC4_128_SHA
        });
        MODERN_TLS_RC4 = (new com.squareup.okhttp.ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)).cipherSuites(OUR_CIPHER_SUITES).build();
        COMPATIBLE_TLS_RC4 = (new com.squareup.okhttp.ConnectionSpec.Builder(ConnectionSpec.COMPATIBLE_TLS)).cipherSuites(OUR_CIPHER_SUITES).build();
        CustomProgressDialog.configure(0x7f0b01f2, 0x7f0202f9);
        CustomAlertDialog.configure(0x7f0b01f1, 0x7f040025, 0x7f100053, 0x7f040024, 0x7f100089);
    }
}
