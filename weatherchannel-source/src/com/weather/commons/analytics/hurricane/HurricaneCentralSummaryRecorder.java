// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.hurricane;

import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.Screen;
import java.util.Map;

// Referenced classes of package com.weather.commons.analytics.hurricane:
//            HurricaneCentralTag

public class HurricaneCentralSummaryRecorder extends LocalyticsRecorder
{

    public HurricaneCentralSummaryRecorder()
    {
    }

    public Map getAttributesMap()
    {
        putValueIfAbsent(HurricaneCentralTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.NOT_AVAILABLE.getAttributeValue());
        return super.getAttributesMap();
    }

    public void recordResumeOnScreen(Screen screen)
    {
        startMinuteStopwatch(HurricaneCentralTag.TIME_SPENT);
        putValue(HurricaneCentralTag.EXIT_METHOD, screen.getName());
    }
}
