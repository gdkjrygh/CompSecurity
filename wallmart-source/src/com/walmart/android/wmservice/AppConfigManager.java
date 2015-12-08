// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.squareup.otto.Bus;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.utils.WLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.walmart.android.wmservice:
//            Services, WalmartNetService

public class AppConfigManager
{
    public static interface AppConfigCallback
    {

        public abstract void onAppConfig(AppConfig appconfig);
    }


    private static final long DEFAULT_REFRESH_TIME_MS = 0xdbba0L;
    private static final long REFRESH_TIME_ON_FAILURE_MS = 60000L;
    private static final String TAG = com/walmart/android/wmservice/AppConfigManager.getSimpleName();
    private static AppConfigManager sInstance;
    private AppConfig mAppConfig;
    private Set mCallbacks;
    private boolean mDestroyed;
    private Handler mHandler;
    private boolean mIsFetching;
    private long mLastFetch;
    private final Runnable mRetryRunnable = new Runnable() {

        final AppConfigManager this$0;

        public void run()
        {
            fetch(null);
        }

            
            {
                this$0 = AppConfigManager.this;
                super();
            }
    };
    private boolean mStarted;

    private AppConfigManager()
    {
        mCallbacks = new HashSet();
        mHandler = new Handler();
    }

    private boolean configIsOutdated()
    {
        boolean flag = false;
        long l1 = SystemClock.elapsedRealtime() - mLastFetch;
        long l;
        if (mAppConfig != null && mAppConfig.configRefreshRate != 0)
        {
            l = mAppConfig.configRefreshRate;
        } else
        {
            l = 0xdbba0L;
        }
        if (l1 > l || mLastFetch == 0L)
        {
            flag = true;
        }
        WLog.d(TAG, (new StringBuilder()).append("outdated: ").append(flag).append(". refresh interval: ").append(l).append(". since last fetch: ").append(l1).toString());
        return flag;
    }

    public static AppConfigManager create()
    {
        destroy();
        sInstance = new AppConfigManager();
        MessageBus.getBus().register(sInstance);
        return sInstance;
    }

    public static void destroy()
    {
        if (sInstance != null)
        {
            MessageBus.getBus().unregister(sInstance);
            sInstance.innerDestroy();
        }
        sInstance = null;
    }

    private void fetch(Context context)
    {
        WLog.d(TAG, "Downloading config");
        mIsFetching = true;
        String s;
        if (context != null)
        {
            s = SharedPreferencesUtil.getInstallationId(context);
        } else
        {
            s = null;
        }
        Services.get().getWalmartService().getConfig(s, new AsyncCallbackOnThread(s) {

            final AppConfigManager this$0;
            final Context val$applicationContext;
            final String val$installationId;

            public void onFailureSameThread(Integer integer, AppConfig appconfig)
            {
                if (mDestroyed)
                {
                    return;
                } else
                {
                    WLog.d(AppConfigManager.TAG, "Downloading config failed. Will retry in 60000 ms");
                    fetchDone(applicationContext, installationId, null);
                    mHandler.removeCallbacks(mRetryRunnable);
                    mHandler.postDelayed(mRetryRunnable, 60000L);
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (AppConfig)obj1);
            }

            public void onSuccessSameThread(AppConfig appconfig)
            {
                if (mDestroyed)
                {
                    return;
                } else
                {
                    WLog.d(AppConfigManager.TAG, "Config downloaded successfully.");
                    fetchDone(applicationContext, installationId, appconfig);
                    return;
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((AppConfig)obj);
            }

            
            {
                this$0 = AppConfigManager.this;
                applicationContext = context;
                installationId = s;
                super(final_handler);
            }
        });
    }

    private void fetchDone(Context context, String s, AppConfig appconfig)
    {
        if (context != null && s != null && appconfig != null)
        {
            if (appconfig.vid != null && !s.equals(appconfig.vid))
            {
                WLog.d(TAG, "Updating installation id");
                SharedPreferencesUtil.updateInstallationId(context, appconfig.vid);
            } else
            {
                WLog.d(TAG, "No need to update installation id");
            }
        }
        mIsFetching = false;
        mLastFetch = SystemClock.elapsedRealtime();
        if (appconfig != null)
        {
            mAppConfig = appconfig;
            MessageBus.getBus().post(mAppConfig);
        }
        for (context = mCallbacks.iterator(); context.hasNext(); ((AppConfigCallback)context.next()).onAppConfig(mAppConfig)) { }
        mCallbacks.clear();
    }

    public static AppConfigManager get()
    {
        return sInstance;
    }

    private void innerDestroy()
    {
        mHandler.removeCallbacks(mRetryRunnable);
        mDestroyed = true;
    }

    private void requestDownload(Context context, AppConfigCallback appconfigcallback, boolean flag)
    {
        if (mStarted && configIsOutdated() || flag)
        {
            if (appconfigcallback != null)
            {
                mCallbacks.add(appconfigcallback);
            }
            if (!mIsFetching)
            {
                mHandler.removeCallbacks(mRetryRunnable);
                fetch(context);
            }
        } else
        if (appconfigcallback != null)
        {
            appconfigcallback.onAppConfig(mAppConfig);
            return;
        }
    }

    public void forceDownload()
    {
        requestDownload(null, null, true);
    }

    public AppConfig getAppConfig()
    {
        return mAppConfig;
    }

    public com.walmart.android.data.AppConfig.MerchandisingData getMerchandisingData()
    {
        if (mAppConfig != null)
        {
            return mAppConfig.merchData;
        } else
        {
            return null;
        }
    }

    public void requestDownload()
    {
        requestDownload(null, null, false);
    }

    public void requestDownload(AppConfigCallback appconfigcallback)
    {
        requestDownload(null, appconfigcallback, false);
    }

    public void start(Context context, AppConfigCallback appconfigcallback)
    {
        if (!mStarted)
        {
            mStarted = true;
        }
        requestDownload(context, appconfigcallback, false);
    }







}
