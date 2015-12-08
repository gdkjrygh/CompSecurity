// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.events.GZIPQueueFileEventStorage;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventTransform, SessionAnalyticsFilesManager

class AnswersFilesManagerProvider
{

    static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
    static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
    final Context context;
    final FileStore fileStore;

    public AnswersFilesManagerProvider(Context context1, FileStore filestore)
    {
        context = context1;
        fileStore = filestore;
    }

    public SessionAnalyticsFilesManager getAnalyticsFilesManager()
        throws IOException
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
        } else
        {
            SessionEventTransform sessioneventtransform = new SessionEventTransform();
            SystemCurrentTimeProvider systemcurrenttimeprovider = new SystemCurrentTimeProvider();
            Object obj = fileStore.getFilesDir();
            obj = new GZIPQueueFileEventStorage(context, ((java.io.File) (obj)), "session_analytics.tap", "session_analytics_to_send");
            return new SessionAnalyticsFilesManager(context, sessioneventtransform, systemcurrenttimeprovider, ((io.fabric.sdk.android.services.events.EventsStorage) (obj)));
        }
    }
}
