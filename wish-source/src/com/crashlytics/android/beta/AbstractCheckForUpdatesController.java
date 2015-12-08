// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.BetaSettingsData;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.beta:
//            UpdatesController, BuildProperties, CheckForUpdatesRequest, Beta, 
//            CheckForUpdatesResponseTransform

abstract class AbstractCheckForUpdatesController
    implements UpdatesController
{

    static final long LAST_UPDATE_CHECK_DEFAULT = 0L;
    static final String LAST_UPDATE_CHECK_KEY = "last_update_check";
    private static final long MILLIS_PER_SECOND = 1000L;
    private Beta beta;
    private BetaSettingsData betaSettings;
    private BuildProperties buildProps;
    private Context context;
    private CurrentTimeProvider currentTimeProvider;
    private final AtomicBoolean externallyReady;
    private HttpRequestFactory httpRequestFactory;
    private IdManager idManager;
    private final AtomicBoolean initialized;
    private long lastCheckTimeMillis;
    private PreferenceStore preferenceStore;

    public AbstractCheckForUpdatesController()
    {
        this(false);
    }

    public AbstractCheckForUpdatesController(boolean flag)
    {
        initialized = new AtomicBoolean();
        lastCheckTimeMillis = 0L;
        externallyReady = new AtomicBoolean(flag);
    }

    private void performUpdateCheck()
    {
        Fabric.getLogger().d("Beta", "Performing update check");
        String s = (new ApiKey()).getValue(context);
        String s1 = idManager.createIdHeaderValue(s, buildProps.packageName);
        (new CheckForUpdatesRequest(beta, beta.getOverridenSpiEndpoint(), betaSettings.updateUrl, httpRequestFactory, new CheckForUpdatesResponseTransform())).invoke(s, s1, buildProps);
    }

    protected void checkForUpdates()
    {
        long l;
        synchronized (preferenceStore)
        {
            if (preferenceStore.get().contains("last_update_check"))
            {
                preferenceStore.save(preferenceStore.edit().remove("last_update_check"));
            }
        }
        l = currentTimeProvider.getCurrentTimeMillis();
        long l1 = (long)betaSettings.updateSuspendDurationSeconds * 1000L;
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates delay: ").append(l1).toString());
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates last check time: ").append(getLastCheckTimeMillis()).toString());
        l1 = getLastCheckTimeMillis() + l1;
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates current time: ").append(l).append(", next check time: ").append(l1).toString());
        if (l < l1)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        performUpdateCheck();
        setLastCheckTimeMillis(l);
        return;
        exception1;
        preferencestore;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        setLastCheckTimeMillis(l);
        throw exception;
        Fabric.getLogger().d("Beta", "Check for updates next check time was not passed");
        return;
    }

    long getLastCheckTimeMillis()
    {
        return lastCheckTimeMillis;
    }

    public void initialize(Context context1, Beta beta1, IdManager idmanager, BetaSettingsData betasettingsdata, BuildProperties buildproperties, PreferenceStore preferencestore, CurrentTimeProvider currenttimeprovider, 
            HttpRequestFactory httprequestfactory)
    {
        context = context1;
        beta = beta1;
        idManager = idmanager;
        betaSettings = betasettingsdata;
        buildProps = buildproperties;
        preferenceStore = preferencestore;
        currentTimeProvider = currenttimeprovider;
        httpRequestFactory = httprequestfactory;
        if (signalInitialized())
        {
            checkForUpdates();
        }
    }

    void setLastCheckTimeMillis(long l)
    {
        lastCheckTimeMillis = l;
    }

    protected boolean signalExternallyReady()
    {
        externallyReady.set(true);
        return initialized.get();
    }

    boolean signalInitialized()
    {
        initialized.set(true);
        return externallyReady.get();
    }
}
