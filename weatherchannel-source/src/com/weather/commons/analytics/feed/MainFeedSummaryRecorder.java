// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import com.google.common.collect.Sets;
import com.weather.commons.analytics.LocalyticsRecorder;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.weather.commons.analytics.feed:
//            LocalyticsModuleViewedAttribute, LocalyticsFeedButton, LocalyticsMainFeedTag

public class MainFeedSummaryRecorder extends LocalyticsRecorder
{

    private final Set adsViewed = Sets.newConcurrentHashSet();

    public MainFeedSummaryRecorder()
    {
    }

    public Map getAttributesMap()
    {
        boolean flag = false;
        Object aobj[] = LocalyticsModuleViewedAttribute.values();
        int k = aobj.length;
        for (int i = 0; i < k; i++)
        {
            putValueIfAbsent(aobj[i], com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.NOT_DISPLAYED.getAttributeValue());
        }

        aobj = LocalyticsFeedButton.values();
        k = aobj.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            putValueIfAbsent(aobj[j], com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        }

        putValueIfAbsent(LocalyticsMainFeedTag.SCROLLED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        putValueIfAbsent(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.NOT_AVAILABLE.getAttributeValue());
        return super.getAttributesMap();
    }

    public void recordAdViewed(String s)
    {
        if (adsViewed.add(s))
        {
            incrementValue(LocalyticsMainFeedTag.ADS_VIEWED);
        }
    }
}
