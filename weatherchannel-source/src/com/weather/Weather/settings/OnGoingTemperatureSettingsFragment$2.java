// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.view.View;
import android.widget.AdapterView;
import com.google.common.collect.ImmutableMap;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;

// Referenced classes of package com.weather.Weather.settings:
//            OnGoingTemperatureSettingsFragment

class this._cls0
    implements android.widget.ngsFragment._cls2
{

    final OnGoingTemperatureSettingsFragment this$0;

    private void clearExistingTempAlert()
    {
        int i = 0;
        while (i < adapter.getCount()) 
        {
            SavedLocation savedlocation = adapter.getItem(i);
            if (adapter.positionRefersToFollowMe(i))
            {
                FollowMe.getInstance().setNotification(com.weather.dal2.locations.ionRefersToFollowMe, false);
            } else
            {
                FixedLocations.getInstance().setNotification(savedlocation, com.weather.dal2.locations.ionRefersToFollowMe, false);
            }
            i++;
        }
        adapter.clearSelection();
    }

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
        clearExistingTempAlert();
        if (flag)
        {
            adapterview = adapter.getItem(i);
            LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.ON_GOING_TEMP_NOTIFICATION, ImmutableMap.of(com.weather.commons.analytics.ATION, adapterview.getPresentationName()));
            if (adapter.positionRefersToFollowMe(i))
            {
                FollowMe.getInstance().setNotification(com.weather.dal2.locations.ionRefersToFollowMe, true);
            } else
            {
                FixedLocations.getInstance().setNotification(adapterview, com.weather.dal2.locations.ionRefersToFollowMe, true);
            }
        }
        adapter.changeSelectState(i);
    }

    ()
    {
        this$0 = OnGoingTemperatureSettingsFragment.this;
        super();
    }
}
