// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts.donotdisturb.localytics;

import com.localytics.android.Localytics;
import java.util.Map;

// Referenced classes of package com.weather.Weather.settings.alerts.donotdisturb.localytics:
//            DoNotDisturbLocalyticsModelBuilder

public class DoNotDisturbEventTagger
{

    public DoNotDisturbEventTagger()
    {
    }

    private Map buildLoacalyticsRepresentations()
    {
        return (new DoNotDisturbLocalyticsModelBuilder()).build();
    }

    public void tagEvent()
    {
        Localytics.tagEvent("do not disturb", buildLoacalyticsRepresentations());
    }
}
