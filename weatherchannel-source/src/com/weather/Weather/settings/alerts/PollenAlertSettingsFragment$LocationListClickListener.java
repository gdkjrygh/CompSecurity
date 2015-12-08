// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.view.View;
import android.widget.AdapterView;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.dal2.locations.FixedLocations;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            PollenAlertSettingsFragment

private class <init>
    implements android.widget.ionListClickListener
{

    final PollenAlertSettingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag;
        if (!adapter.isSelected(i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (anyPollenAlertEnabledForAnonymousUsers)
        {
            if (adapter.getSelectedLocationsCount() >= 1 && flag)
            {
                showWeatherProfileDialog();
                return;
            } else
            {
                adapter.changeSelectState(i);
                FixedLocations.getInstance().setNotification(adapter.getItem(i), com.weather.dal2.locations.eDialog, flag);
                return;
            }
        }
        if (!PollenAlertSettingsFragment.access$100(PollenAlertSettingsFragment.this) && PollenAlertSettingsFragment.access$200(PollenAlertSettingsFragment.this))
        {
            showWeatherProfileDialog();
            return;
        } else
        {
            adapter.changeSelectState(i);
            FixedLocations.getInstance().setNotification(adapter.getItem(i), com.weather.dal2.locations.eDialog, flag);
            return;
        }
    }

    private ()
    {
        this$0 = PollenAlertSettingsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
