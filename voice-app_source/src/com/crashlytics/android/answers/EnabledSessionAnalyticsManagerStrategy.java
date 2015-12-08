// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.events.EnabledEventsStrategy;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManagerStrategy, KeepAllEventFilter, SessionEvent, EventFilter, 
//            SessionAnalyticsFilesSender, AnswersRetryFilesSender, SessionAnalyticsFilesManager, SamplingEventFilter, 
//            SessionEventMetadata

class EnabledSessionAnalyticsManagerStrategy extends EnabledEventsStrategy
    implements SessionAnalyticsManagerStrategy
{

    ApiKey apiKey;
    boolean customEventsEnabled;
    EventFilter eventFilter;
    FilesSender filesSender;
    private final HttpRequestFactory httpRequestFactory;
    private final Kit kit;
    final SessionEventMetadata metadata;
    boolean predefinedEventsEnabled;

    public EnabledSessionAnalyticsManagerStrategy(Kit kit1, Context context, ScheduledExecutorService scheduledexecutorservice, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory, SessionEventMetadata sessioneventmetadata)
    {
        super(context, scheduledexecutorservice, sessionanalyticsfilesmanager);
        eventFilter = new KeepAllEventFilter();
        apiKey = new ApiKey();
        customEventsEnabled = true;
        predefinedEventsEnabled = true;
        kit = kit1;
        httpRequestFactory = httprequestfactory;
        metadata = sessioneventmetadata;
    }

    public FilesSender getFilesSender()
    {
        return filesSender;
    }

    public void processEvent(SessionEvent.Builder builder)
    {
        builder = builder.build(metadata);
        if (!customEventsEnabled && SessionEvent.Type.CUSTOM.equals(((SessionEvent) (builder)).type))
        {
            Fabric.getLogger().d("Answers", (new StringBuilder()).append("Custom events tracking disabled - skipping event: ").append(builder).toString());
            return;
        }
        if (!predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(((SessionEvent) (builder)).type))
        {
            Fabric.getLogger().d("Answers", (new StringBuilder()).append("Predefined events tracking disabled - skipping event: ").append(builder).toString());
            return;
        }
        if (eventFilter.skipEvent(builder))
        {
            Fabric.getLogger().d("Answers", (new StringBuilder()).append("Skipping filtered event: ").append(builder).toString());
            return;
        } else
        {
            recordEvent(builder);
            return;
        }
    }

    public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
    {
        filesSender = AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(kit, s, analyticssettingsdata.analyticsURL, httpRequestFactory, apiKey.getValue(context)));
        ((SessionAnalyticsFilesManager)filesManager).setAnalyticsSettingsData(analyticssettingsdata);
        customEventsEnabled = analyticssettingsdata.trackCustomEvents;
        Logger logger = Fabric.getLogger();
        StringBuilder stringbuilder = (new StringBuilder()).append("Custom event tracking ");
        if (customEventsEnabled)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        logger.d("Answers", stringbuilder.append(s).toString());
        predefinedEventsEnabled = analyticssettingsdata.trackPredefinedEvents;
        logger = Fabric.getLogger();
        stringbuilder = (new StringBuilder()).append("Predefined event tracking ");
        if (predefinedEventsEnabled)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        logger.d("Answers", stringbuilder.append(s).toString());
        if (analyticssettingsdata.samplingRate > 1)
        {
            Fabric.getLogger().d("Answers", "Event sampling enabled");
            eventFilter = new SamplingEventFilter(analyticssettingsdata.samplingRate);
        }
        configureRollover(analyticssettingsdata.flushIntervalSeconds);
    }
}
