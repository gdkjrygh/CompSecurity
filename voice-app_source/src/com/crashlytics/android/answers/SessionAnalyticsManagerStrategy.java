// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.events.EventsStrategy;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

interface SessionAnalyticsManagerStrategy
    extends EventsStrategy
{

    public abstract void processEvent(SessionEvent.Builder builder);

    public abstract void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s);
}
