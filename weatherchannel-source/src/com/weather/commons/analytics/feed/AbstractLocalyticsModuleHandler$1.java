// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import com.google.common.base.Stopwatch;

// Referenced classes of package com.weather.commons.analytics.feed:
//            AbstractLocalyticsModuleHandler

class this._cls0
    implements Runnable
{

    final AbstractLocalyticsModuleHandler this$0;

    public void run()
    {
        if (AbstractLocalyticsModuleHandler.access$000(AbstractLocalyticsModuleHandler.this).isRunning())
        {
            AbstractLocalyticsModuleHandler.access$000(AbstractLocalyticsModuleHandler.this).stop();
            recordModuleVisible();
        }
    }

    ()
    {
        this$0 = AbstractLocalyticsModuleHandler.this;
        super();
    }
}
