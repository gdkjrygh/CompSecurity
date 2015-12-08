// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.settings;

import com.weather.commons.analytics.LocalyticsRecorder;
import java.util.Map;

// Referenced classes of package com.weather.commons.analytics.settings:
//            LocalyticsGeneralSettingsAttribute

public class LocalyticsGeneralSettingsSummaryRecorder extends LocalyticsRecorder
{

    public LocalyticsGeneralSettingsSummaryRecorder()
    {
    }

    public Map getAttributesMap()
    {
        LocalyticsGeneralSettingsAttribute alocalyticsgeneralsettingsattribute[] = LocalyticsGeneralSettingsAttribute.values();
        int j = alocalyticsgeneralsettingsattribute.length;
        for (int i = 0; i < j; i++)
        {
            LocalyticsGeneralSettingsAttribute localyticsgeneralsettingsattribute = alocalyticsgeneralsettingsattribute[i];
            String s = localyticsgeneralsettingsattribute.getDefaultValue();
            if (s != null)
            {
                putValueIfAbsent(localyticsgeneralsettingsattribute, s);
            }
        }

        return super.getAttributesMap();
    }
}
