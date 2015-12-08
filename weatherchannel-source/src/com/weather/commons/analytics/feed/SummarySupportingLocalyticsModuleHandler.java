// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import android.os.Handler;
import com.google.common.base.Preconditions;
import com.weather.commons.analytics.Attribute;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;

// Referenced classes of package com.weather.commons.analytics.feed:
//            AbstractLocalyticsModuleHandler

public abstract class SummarySupportingLocalyticsModuleHandler extends AbstractLocalyticsModuleHandler
{

    protected final LocalyticsHandler localyticsHandler;
    private final com.weather.commons.analytics.LocalyticsTags.ScreenName moduleScreen;
    private final Attribute moduleViewedAttribute;

    protected SummarySupportingLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, Attribute attribute, LocalyticsHandler localyticshandler, Handler handler)
    {
        super(handler);
        moduleScreen = screenname;
        moduleViewedAttribute = attribute;
        localyticsHandler = (LocalyticsHandler)Preconditions.checkNotNull(localyticshandler);
    }

    protected abstract LocalyticsRecorder getFeedSummaryRecorder();

    public void recordInFeed()
    {
        if (moduleViewedAttribute != null)
        {
            getFeedSummaryRecorder().putValueIfAbsent(moduleViewedAttribute, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        }
    }

    protected void recordModuleVisible()
    {
        if (moduleScreen != null)
        {
            localyticsHandler.tagScreen(moduleScreen);
            localyticsHandler.getSessionSummaryRecorder().incrementValue(LocalyticsSessionAttribute.MODULES_VIEWED);
        }
        if (moduleViewedAttribute != null)
        {
            getFeedSummaryRecorder().putValue(moduleViewedAttribute, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        }
    }
}
