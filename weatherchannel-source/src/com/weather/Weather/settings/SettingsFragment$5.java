// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.preference.Preference;
import com.weather.Weather.settings.alerts.WeatherAlertsSettingsFragment;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttribute;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsSummaryRecorder;
import com.weather.util.app.FragmentHelper;

// Referenced classes of package com.weather.Weather.settings:
//            SettingsFragment

class this._cls0
    implements android.preference.enceClickListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        SettingsFragment.access$000(SettingsFragment.this).getGeneralSettingsSummaryRecorder().putValueIfAbsent(LocalyticsGeneralSettingsAttribute.WEATHER_ALERTS_CLICKED, com.weather.commons.analytics.Values.AttributeValue.BOOLEAN_YES.getAttributeValue());
        FragmentHelper.switchToNewFragment(getFragmentManager(), new WeatherAlertsSettingsFragment());
        return true;
    }

    sSettingsFragment()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
