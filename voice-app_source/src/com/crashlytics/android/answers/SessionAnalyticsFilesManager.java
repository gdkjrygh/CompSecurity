// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import io.fabric.sdk.android.services.events.EventsStorage;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventTransform

class SessionAnalyticsFilesManager extends EventsFilesManager
{

    private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
    private AnalyticsSettingsData analyticsSettingsData;

    SessionAnalyticsFilesManager(Context context, SessionEventTransform sessioneventtransform, CurrentTimeProvider currenttimeprovider, EventsStorage eventsstorage)
        throws IOException
    {
        super(context, sessioneventtransform, currenttimeprovider, eventsstorage, 100);
    }

    protected String generateUniqueRollOverFileName()
    {
        UUID uuid = UUID.randomUUID();
        return (new StringBuilder()).append("sa").append("_").append(uuid.toString()).append("_").append(currentTimeProvider.getCurrentTimeMillis()).append(".tap").toString();
    }

    protected int getMaxByteSizePerFile()
    {
        if (analyticsSettingsData == null)
        {
            return super.getMaxByteSizePerFile();
        } else
        {
            return analyticsSettingsData.maxByteSizePerFile;
        }
    }

    protected int getMaxFilesToKeep()
    {
        if (analyticsSettingsData == null)
        {
            return super.getMaxFilesToKeep();
        } else
        {
            return analyticsSettingsData.maxPendingSendFileCount;
        }
    }

    void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata)
    {
        analyticsSettingsData = analyticssettingsdata;
    }
}
