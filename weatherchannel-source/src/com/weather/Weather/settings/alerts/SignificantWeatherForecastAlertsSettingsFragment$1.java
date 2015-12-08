// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.view.View;
import android.widget.AdapterView;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.push.ProductType;
import com.weather.dal2.locations.FixedLocations;
import java.util.Iterator;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            SignificantWeatherForecastAlertsSettingsFragment, WeatherAlertSettingsListItem

class this._cls0
    implements android.widget.tsSettingsFragment._cls1
{

    final SignificantWeatherForecastAlertsSettingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag;
        if (!SignificantWeatherForecastAlertsSettingsFragment.access$000(SignificantWeatherForecastAlertsSettingsFragment.this).isSelected(i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SignificantWeatherForecastAlertsSettingsFragment.access$000(SignificantWeatherForecastAlertsSettingsFragment.this).changeSelectState(i);
        adapterview = SignificantWeatherForecastAlertsSettingsFragment.access$100(SignificantWeatherForecastAlertsSettingsFragment.this).iterator();
        do
        {
            if (!adapterview.hasNext())
            {
                break;
            }
            Object obj = (WeatherAlertSettingsListItem)adapterview.next();
            view = SignificantWeatherForecastAlertsSettingsFragment.access$000(SignificantWeatherForecastAlertsSettingsFragment.this).getItem(i);
            obj = ((WeatherAlertSettingsListItem) (obj)).getType();
            if (view != null && obj != null)
            {
                FixedLocations.getInstance().setNotification(view, ((ProductType) (obj)).getAlertType(), flag);
            }
        } while (true);
        AlertServiceManager.getInstance().setNeedsSync(true);
    }

    ()
    {
        this$0 = SignificantWeatherForecastAlertsSettingsFragment.this;
        super();
    }
}
