// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.ActivityLifecycleManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionMetadataCollector, AnswersEventsHandler, AnswersFilesManagerProvider, SessionAnalyticsManager, 
//            AnswersLifecycleCallbacks, AnswersPreferenceManager, AddToCartEvent, ContentViewEvent, 
//            CustomEvent, InviteEvent, LevelEndEvent, LevelStartEvent, 
//            LoginEvent, PurchaseEvent, RatingEvent, SearchEvent, 
//            ShareEvent, SignUpEvent, StartCheckoutEvent

public class Answers extends Kit
{

    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    static final long FIRST_LAUNCH_INTERVAL_IN_MS = 0x36ee80L;
    static final String PREF_STORE_NAME = "settings";
    public static final String TAG = "Answers";
    SessionAnalyticsManager analyticsManager;
    private long installedAt;
    ActivityLifecycleManager lifecycleManager;
    AnswersPreferenceManager preferenceManager;
    private String versionCode;
    private String versionName;

    public Answers()
    {
    }

    public static Answers getInstance()
    {
        return (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
    }

    private void initializeSessionAnalytics(Context context)
    {
        try
        {
            SessionMetadataCollector sessionmetadatacollector = new SessionMetadataCollector(context, getIdManager(), versionCode, versionName);
            context = new AnswersEventsHandler(this, context, new AnswersFilesManagerProvider(context, new FileStoreImpl(this)), sessionmetadatacollector, new DefaultHttpRequestFactory(Fabric.getLogger()));
            context.enable();
            analyticsManager = new SessionAnalyticsManager(context);
            lifecycleManager.registerCallbacks(new AnswersLifecycleCallbacks(analyticsManager));
            if (isFirstLaunch(installedAt))
            {
                Fabric.getLogger().d("Answers", "New app install detected");
                analyticsManager.onInstall();
                preferenceManager.setAnalyticsLaunched();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.getLogger().e("Answers", "Failed to initialize", context);
        }
    }

    protected Boolean doInBackground()
    {
        SettingsData settingsdata;
        try
        {
            settingsdata = Settings.getInstance().awaitSettingsData();
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (settingsdata != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        Fabric.getLogger().e("Answers", "Failed to retrieve settings");
        return Boolean.valueOf(false);
        if (settingsdata.featuresData.collectAnalytics)
        {
            Fabric.getLogger().d("Answers", "Analytics collection enabled");
            analyticsManager.setAnalyticsSettingsData(settingsdata.analyticsSettingsData, getOverridenSpiEndpoint());
            return Boolean.valueOf(true);
        }
        Fabric.getLogger().d("Answers", "Analytics collection disabled");
        lifecycleManager.resetCallbacks();
        analyticsManager.disable();
        return Boolean.valueOf(false);
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    public String getIdentifier()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    String getOverridenSpiEndpoint()
    {
        return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
    }

    public String getVersion()
    {
        return "1.3.2.79";
    }

    boolean installedRecently(long l)
    {
        return System.currentTimeMillis() - l < 0x36ee80L;
    }

    boolean isFirstLaunch(long l)
    {
        return !preferenceManager.hasAnalyticsLaunched() && installedRecently(l);
    }

    public void logAddToCart(AddToCartEvent addtocartevent)
    {
        if (addtocartevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(addtocartevent);
        }
    }

    public void logContentView(ContentViewEvent contentviewevent)
    {
        if (contentviewevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(contentviewevent);
        }
    }

    public void logCustom(CustomEvent customevent)
    {
        if (customevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onCustom(customevent);
        }
    }

    public void logInvite(InviteEvent inviteevent)
    {
        if (inviteevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(inviteevent);
        }
    }

    public void logLevelEnd(LevelEndEvent levelendevent)
    {
        if (levelendevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(levelendevent);
        }
    }

    public void logLevelStart(LevelStartEvent levelstartevent)
    {
        if (levelstartevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(levelstartevent);
        }
    }

    public void logLogin(LoginEvent loginevent)
    {
        if (loginevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(loginevent);
        }
    }

    public void logPurchase(PurchaseEvent purchaseevent)
    {
        if (purchaseevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(purchaseevent);
        }
    }

    public void logRating(RatingEvent ratingevent)
    {
        if (ratingevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(ratingevent);
        }
    }

    public void logSearch(SearchEvent searchevent)
    {
        if (searchevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(searchevent);
        }
    }

    public void logShare(ShareEvent shareevent)
    {
        if (shareevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(shareevent);
        }
    }

    public void logSignUp(SignUpEvent signupevent)
    {
        if (signupevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(signupevent);
        }
    }

    public void logStartCheckout(StartCheckoutEvent startcheckoutevent)
    {
        if (startcheckoutevent == null)
        {
            throw new NullPointerException("event must not be null");
        }
        if (analyticsManager != null)
        {
            analyticsManager.onPredefined(startcheckoutevent);
        }
    }

    public void onException(io.fabric.sdk.android.services.common.Crash.FatalException fatalexception)
    {
        if (analyticsManager != null)
        {
            analyticsManager.onCrash(fatalexception.getSessionId());
        }
    }

    public void onException(io.fabric.sdk.android.services.common.Crash.LoggedException loggedexception)
    {
        if (analyticsManager != null)
        {
            analyticsManager.onError(loggedexception.getSessionId());
        }
    }

    protected boolean onPreExecute()
    {
        Context context;
        PackageInfo packageinfo;
        context = getContext();
        preferenceManager = new AnswersPreferenceManager(new PreferenceStoreImpl(context, "settings"));
        lifecycleManager = new ActivityLifecycleManager(context);
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        versionCode = Integer.toString(packageinfo.versionCode);
        String s;
        if (packageinfo.versionName == null)
        {
            s = "0.0";
        } else
        {
            try
            {
                s = packageinfo.versionName;
            }
            catch (Exception exception)
            {
                Fabric.getLogger().e("Answers", "Error retrieving app properties", exception);
                return false;
            }
        }
        versionName = s;
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        installedAt = packageinfo.firstInstallTime;
_L1:
        initializeSessionAnalytics(context);
        return true;
        installedAt = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
          goto _L1
    }
}
