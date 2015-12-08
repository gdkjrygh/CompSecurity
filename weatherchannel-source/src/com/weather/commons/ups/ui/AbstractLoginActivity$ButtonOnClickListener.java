// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.view.View;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsLoginSummaryRecorder;

// Referenced classes of package com.weather.commons.ups.ui:
//            AbstractLoginActivity

private static class <init>
    implements android.view.ClickListener
{

    private final Runnable loginTask;

    public void onClick(View view)
    {
        LocalyticsHandler.getInstance().getUpsLoginSummaryRecorder().recordAttemptStarted();
        loginTask.run();
    }

    private (Runnable runnable)
    {
        loginTask = runnable;
    }

    loginTask(Runnable runnable, loginTask logintask)
    {
        this(runnable);
    }
}
