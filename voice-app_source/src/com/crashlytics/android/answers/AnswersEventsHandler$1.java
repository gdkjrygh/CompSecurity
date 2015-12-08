// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventsHandler, SessionAnalyticsManagerStrategy

class val.protocolAndHostOverride
    implements Runnable
{

    final AnswersEventsHandler this$0;
    final AnalyticsSettingsData val$analyticsSettingsData;
    final String val$protocolAndHostOverride;

    public void run()
    {
        try
        {
            strategy.setAnalyticsSettingsData(val$analyticsSettingsData, val$protocolAndHostOverride);
            return;
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("Answers", "Failed to set analytics settings data", exception);
        }
    }

    gsData()
    {
        this$0 = final_answerseventshandler;
        val$analyticsSettingsData = analyticssettingsdata;
        val$protocolAndHostOverride = String.this;
        super();
    }
}
