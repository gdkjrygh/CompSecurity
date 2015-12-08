// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.view.View;
import android.widget.AdapterView;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.push.ProductType;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.Iterator;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            SignificantWeatherForecastAlertsSettingsFragment, WeatherAlertSettingListAdapter, WeatherAlertSettingsListItem

class this._cls0
    implements android.widget.tsSettingsFragment._cls2
{

    final SignificantWeatherForecastAlertsSettingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = SignificantWeatherForecastAlertsSettingsFragment.access$200(SignificantWeatherForecastAlertsSettingsFragment.this).getItem(i);
        if (adapterview.getType() != null)
        {
            SavedLocation savedlocation;
            boolean flag;
            if (!adapterview.isEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for (view = SignificantWeatherForecastAlertsSettingsFragment.access$300(SignificantWeatherForecastAlertsSettingsFragment.this).iterator(); view.hasNext(); FixedLocations.getInstance().setNotification(savedlocation, adapterview.getType().getAlertType(), flag))
            {
                savedlocation = (SavedLocation)view.next();
            }

            TwcPrefs.getInstance().putBoolean(adapterview.getType().getTwcPrefsKey(), flag);
            AlertServiceManager.getInstance().setNeedsSync(true);
            SignificantWeatherForecastAlertsSettingsFragment.access$200(SignificantWeatherForecastAlertsSettingsFragment.this).toggleEnabledState(i);
        }
    }

    ()
    {
        this$0 = SignificantWeatherForecastAlertsSettingsFragment.this;
        super();
    }
}
