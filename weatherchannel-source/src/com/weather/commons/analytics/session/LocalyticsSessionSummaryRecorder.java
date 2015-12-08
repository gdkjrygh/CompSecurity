// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.session;

import com.weather.commons.analytics.LocalyticsRecorder;
import java.util.Map;

// Referenced classes of package com.weather.commons.analytics.session:
//            LocalyticsSessionAttribute

public class LocalyticsSessionSummaryRecorder extends LocalyticsRecorder
{

    public LocalyticsSessionSummaryRecorder()
    {
    }

    public Map getAttributesMap()
    {
        putValueIfAbsent(LocalyticsSessionAttribute.SOCIAL_CHECKIN_SUBMITTED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        putValueIfAbsent(LocalyticsSessionAttribute.SOCIAL_PHOTO_SUBMITTED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        return super.getAttributesMap();
    }
}
