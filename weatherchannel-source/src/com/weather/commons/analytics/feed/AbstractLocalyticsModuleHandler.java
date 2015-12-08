// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import android.os.Handler;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.commons.analytics.feed:
//            LocalyticsModuleHandler

public abstract class AbstractLocalyticsModuleHandler
    implements LocalyticsModuleHandler
{

    private static final long REQUIRED_VIEW_DURATION_MS;
    private static final String TAG = "AbstractLocalyticsModuleHandler";
    protected final Handler handler;
    private final Runnable moduleVisibleRunnable = new Runnable() {

        final AbstractLocalyticsModuleHandler this$0;

        public void run()
        {
            if (visibleTime.isRunning())
            {
                visibleTime.stop();
                recordModuleVisible();
            }
        }

            
            {
                this$0 = AbstractLocalyticsModuleHandler.this;
                super();
            }
    };
    private final Stopwatch visibleTime = Stopwatch.createUnstarted();

    protected AbstractLocalyticsModuleHandler(Handler handler1)
    {
        handler = (Handler)Preconditions.checkNotNull(handler1);
    }

    protected abstract void recordModuleVisible();

    public void viewIsMoreThanHalfVisible()
    {
        if (!visibleTime.isRunning())
        {
            visibleTime.reset();
            visibleTime.start();
            handler.postDelayed(moduleVisibleRunnable, REQUIRED_VIEW_DURATION_MS);
        }
    }

    public void viewIsNotVisible()
    {
        if (visibleTime.isRunning())
        {
            LogUtil.d("AbstractLocalyticsModuleHandler", LoggingMetaTags.TWC_LOCALYTICS, (new StringBuilder()).append("View was visible for ").append(visibleTime).toString(), new Object[0]);
            handler.removeCallbacks(moduleVisibleRunnable);
            visibleTime.stop();
        }
    }

    static 
    {
        REQUIRED_VIEW_DURATION_MS = TimeUnit.SECONDS.toMillis(1L);
    }

}
