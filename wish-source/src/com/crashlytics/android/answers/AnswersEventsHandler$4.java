// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventsHandler, SessionMetadataCollector, AnswersFilesManagerProvider, SessionAnalyticsFilesManager, 
//            EnabledSessionAnalyticsManagerStrategy

class this._cls0
    implements Runnable
{

    final AnswersEventsHandler this$0;

    public void run()
    {
        try
        {
            SessionEventMetadata sessioneventmetadata = AnswersEventsHandler.access$000(AnswersEventsHandler.this).getMetadata();
            SessionAnalyticsFilesManager sessionanalyticsfilesmanager = AnswersEventsHandler.access$100(AnswersEventsHandler.this).getAnalyticsFilesManager();
            sessionanalyticsfilesmanager.registerRollOverListener(AnswersEventsHandler.this);
            strategy = new EnabledSessionAnalyticsManagerStrategy(AnswersEventsHandler.access$200(AnswersEventsHandler.this), AnswersEventsHandler.access$300(AnswersEventsHandler.this), executor, sessionanalyticsfilesmanager, AnswersEventsHandler.access$400(AnswersEventsHandler.this), sessioneventmetadata);
            return;
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("Answers", "Failed to enable events", exception);
        }
    }

    ManagerStrategy()
    {
        this$0 = AnswersEventsHandler.this;
        super();
    }
}
