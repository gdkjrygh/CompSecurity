// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class MPConfig
{

    public static boolean DEBUG = false;
    private static final String LOGTAG = "MixpanelAPI.Conf";
    static final int MAX_NOTIFICATION_CACHE_COUNT = 2;
    static final String REFERRER_PREFS_NAME = "com.mixpanel.android.mpmetrics.ReferralInfo";
    public static final int UI_FEATURES_MIN_API = 16;
    public static final String VERSION = "4.6.0";
    private static MPConfig sInstance;
    private static final Object sInstanceLock = new Object();
    private final boolean mAutoShowMixpanelUpdates;
    private final int mBulkUploadLimit;
    private final int mDataExpiration;
    private final int mDebugFlushInterval;
    private final String mDecideEndpoint;
    private final String mDecideFallbackEndpoint;
    private final boolean mDisableAppOpenEvent;
    private final boolean mDisableEmulatorBindingUI;
    private final boolean mDisableFallback;
    private final boolean mDisableGestureBindingUI;
    private final String mEditorUrl;
    private final String mEventsEndpoint;
    private final String mEventsFallbackEndpoint;
    private final int mFlushInterval;
    private final int mMinimumDatabaseLimit;
    private final String mPeopleEndpoint;
    private final String mPeopleFallbackEndpoint;
    private final String mResourcePackageName;
    private final boolean mTestMode;

    MPConfig(Bundle bundle, Context context)
    {
        boolean flag = true;
        super();
        DEBUG = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        if (bundle.containsKey("com.mixpanel.android.MPConfig.AutoCheckForSurveys"))
        {
            Log.w("MixpanelAPI.Conf", "com.mixpanel.android.MPConfig.AutoCheckForSurveys has been deprecated in favor of com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates. Please update this key as soon as possible.");
        }
        mBulkUploadLimit = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        mFlushInterval = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        mDebugFlushInterval = bundle.getInt("com.mixpanel.android.MPConfig.DebugFlushInterval", 1000);
        mDataExpiration = bundle.getInt("com.mixpanel.android.MPConfig.DataExpiration", 0x19bfcc00);
        mMinimumDatabaseLimit = bundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 0x1400000);
        mDisableFallback = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableFallback", true);
        mResourcePackageName = bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        mDisableGestureBindingUI = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableGestureBindingUI", false);
        mDisableEmulatorBindingUI = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableEmulatorBindingUI", false);
        mDisableAppOpenEvent = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        boolean flag1 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoCheckForSurveys", true);
        boolean flag2 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates", true);
        String s;
        String s1;
        if (!flag1 || !flag2)
        {
            flag = false;
        }
        mAutoShowMixpanelUpdates = flag;
        mTestMode = bundle.getBoolean("com.mixpanel.android.MPConfig.TestMode", false);
        s1 = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "https://api.mixpanel.com/track?ip=1";
        }
        mEventsEndpoint = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.EventsFallbackEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "http://api.mixpanel.com/track?ip=1";
        }
        mEventsFallbackEndpoint = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "https://api.mixpanel.com/engage";
        }
        mPeopleEndpoint = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.PeopleFallbackEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "http://api.mixpanel.com/engage";
        }
        mPeopleFallbackEndpoint = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "https://decide.mixpanel.com/decide";
        }
        mDecideEndpoint = s;
        s1 = bundle.getString("com.mixpanel.android.MPConfig.DecideFallbackEndpoint");
        s = s1;
        if (s1 == null)
        {
            s = "http://decide.mixpanel.com/decide";
        }
        mDecideFallbackEndpoint = s;
        s = bundle.getString("com.mixpanel.android.MPConfig.EditorUrl");
        bundle = s;
        if (s == null)
        {
            bundle = "wss://switchboard.mixpanel.com/connect/";
        }
        mEditorUrl = bundle;
        if (DEBUG)
        {
            Log.v("MixpanelAPI.Conf", (new StringBuilder("Mixpanel configured with:\n    AutoShowMixpanelUpdates ")).append(getAutoShowMixpanelUpdates()).append("\n").append("    BulkUploadLimit ").append(getBulkUploadLimit()).append("\n").append("    FlushInterval ").append(getFlushInterval(context)).append("\n").append("    DataExpiration ").append(getDataExpiration()).append("\n").append("    MinimumDatabaseLimit ").append(getMinimumDatabaseLimit()).append("\n").append("    DisableFallback ").append(getDisableFallback()).append("\n").append("    DisableAppOpenEvent ").append(getDisableAppOpenEvent()).append("\n").append("    DisableDeviceUIBinding ").append(getDisableGestureBindingUI()).append("\n").append("    DisableEmulatorUIBinding ").append(getDisableEmulatorBindingUI()).append("\n").append("    EnableDebugLogging ").append(DEBUG).append("\n").append("    TestMode ").append(getTestMode()).append("\n").append("    EventsEndpoint ").append(getEventsEndpoint()).append("\n").append("    PeopleEndpoint ").append(getPeopleEndpoint()).append("\n").append("    DecideEndpoint ").append(getDecideEndpoint()).append("\n").append("    EventsFallbackEndpoint ").append(getEventsFallbackEndpoint()).append("\n").append("    PeopleFallbackEndpoint ").append(getPeopleFallbackEndpoint()).append("\n").append("    DecideFallbackEndpoint ").append(getDecideFallbackEndpoint()).append("\n").append("    EditorUrl ").append(getEditorUrl()).append("\n").toString());
        }
    }

    public static MPConfig getInstance(Context context)
    {
        synchronized (sInstanceLock)
        {
            if (sInstance == null)
            {
                sInstance = readConfig(context.getApplicationContext());
            }
        }
        return sInstance;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static MPConfig readConfig(Context context)
    {
        String s = context.getPackageName();
        Bundle bundle;
        Bundle bundle1;
        try
        {
            bundle1 = context.getPackageManager().getApplicationInfo(s, 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Can't configure Mixpanel with package name ")).append(s).toString(), context);
        }
        bundle = bundle1;
        if (bundle1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        bundle = new Bundle();
        context = new MPConfig(bundle, context);
        return context;
    }

    public boolean getAutoShowMixpanelUpdates()
    {
        return mAutoShowMixpanelUpdates;
    }

    public int getBulkUploadLimit()
    {
        return mBulkUploadLimit;
    }

    public int getDataExpiration()
    {
        return mDataExpiration;
    }

    public String getDecideEndpoint()
    {
        return mDecideEndpoint;
    }

    public String getDecideFallbackEndpoint()
    {
        return mDecideFallbackEndpoint;
    }

    public boolean getDisableAppOpenEvent()
    {
        return mDisableAppOpenEvent;
    }

    public boolean getDisableEmulatorBindingUI()
    {
        return mDisableEmulatorBindingUI;
    }

    public boolean getDisableFallback()
    {
        return mDisableFallback;
    }

    public boolean getDisableGestureBindingUI()
    {
        return mDisableGestureBindingUI;
    }

    public String getEditorUrl()
    {
        return mEditorUrl;
    }

    public String getEventsEndpoint()
    {
        return mEventsEndpoint;
    }

    public String getEventsFallbackEndpoint()
    {
        return mEventsFallbackEndpoint;
    }

    public int getFlushInterval()
    {
        return getFlushInterval(null);
    }

    public int getFlushInterval(Context context)
    {
        boolean flag;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        context = context.getApplicationInfo();
        int i = ((ApplicationInfo) (context)).flags & 2;
        context.flags = i;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        flag = true;
_L1:
        if (flag)
        {
            return mDebugFlushInterval;
        } else
        {
            return mFlushInterval;
        }
        flag = false;
          goto _L1
    }

    public int getMinimumDatabaseLimit()
    {
        return mMinimumDatabaseLimit;
    }

    public String getPeopleEndpoint()
    {
        return mPeopleEndpoint;
    }

    public String getPeopleFallbackEndpoint()
    {
        return mPeopleFallbackEndpoint;
    }

    public String getResourcePackageName()
    {
        return mResourcePackageName;
    }

    public boolean getTestMode()
    {
        return mTestMode;
    }

    static 
    {
        DEBUG = false;
    }
}
