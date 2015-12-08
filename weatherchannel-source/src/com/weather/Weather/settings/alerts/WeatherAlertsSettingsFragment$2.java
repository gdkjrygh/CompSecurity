// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;


// Referenced classes of package com.weather.Weather.settings.alerts:
//            WeatherAlertsSettingsFragment, WeatherAlertSettingListAdapter

class this._cls0
    implements Runnable
{

    final WeatherAlertsSettingsFragment this$0;

    public void run()
    {
        WeatherAlertsSettingsFragment.access$000(WeatherAlertsSettingsFragment.this).notifyDataSetChanged();
    }

    I()
    {
        this$0 = WeatherAlertsSettingsFragment.this;
        super();
    }
}
