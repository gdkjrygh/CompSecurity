// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            WeatherAlertsSettingsFragment, WeatherAlertSettingListAdapter, WeatherAlertSettingsListItem

class this._cls0
    implements android.widget.tsSettingsFragment._cls1
{

    final WeatherAlertsSettingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = WeatherAlertsSettingsFragment.access$000(WeatherAlertsSettingsFragment.this).getItem(i);
        if (adapterview.getType() != null)
        {
            WeatherAlertsSettingsFragment.access$100(WeatherAlertsSettingsFragment.this, adapterview.getType());
        }
    }

    I()
    {
        this$0 = WeatherAlertsSettingsFragment.this;
        super();
    }
}
