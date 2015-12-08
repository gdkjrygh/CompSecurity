// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.common.collect.ImmutableMap;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.Weather.locations.adapters.policy.AlertEnabledLocationSelectedOnInitPolicy;
import com.weather.Weather.locations.adapters.policy.AllLocationsInclusionPolicy;
import com.weather.Weather.locations.adapters.policy.FollowMePolicy;
import com.weather.Weather.locations.adapters.policy.ListOrderPolicy;
import com.weather.Weather.locations.adapters.policy.OmnitureBeaconConfig;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.service.AbstractNotificationService;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.LocationChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.system.TwcBus;
import com.weather.facade.WeatherDataManager;

public final class OnGoingTemperatureSettingsFragment extends Fragment
{

    LocationListAdapter adapter;
    private final android.widget.AdapterView.OnItemClickListener locationListClickListener = new android.widget.AdapterView.OnItemClickListener() {

        final OnGoingTemperatureSettingsFragment this$0;

        private void clearExistingTempAlert()
        {
            int i = 0;
            while (i < adapter.getCount()) 
            {
                SavedLocation savedlocation = adapter.getItem(i);
                if (adapter.positionRefersToFollowMe(i))
                {
                    FollowMe.getInstance().setNotification(com.weather.dal2.locations.SavedLocation.AlertType.temperature, false);
                } else
                {
                    FixedLocations.getInstance().setNotification(savedlocation, com.weather.dal2.locations.SavedLocation.AlertType.temperature, false);
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
                LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.ON_GOING_TEMP_NOTIFICATION, ImmutableMap.of(com.weather.commons.analytics.LocalyticsTags.Tags.LOCATION, adapterview.getPresentationName()));
                if (adapter.positionRefersToFollowMe(i))
                {
                    FollowMe.getInstance().setNotification(com.weather.dal2.locations.SavedLocation.AlertType.temperature, true);
                } else
                {
                    FixedLocations.getInstance().setNotification(adapterview, com.weather.dal2.locations.SavedLocation.AlertType.temperature, true);
                }
            }
            adapter.changeSelectState(i);
        }

            
            {
                this$0 = OnGoingTemperatureSettingsFragment.this;
                super();
            }
    };
    ListView temperatureList;

    public OnGoingTemperatureSettingsFragment()
    {
    }

    private void updateSnapshot()
    {
        getActivity().runOnUiThread(new Runnable() {

            final OnGoingTemperatureSettingsFragment this$0;

            public void run()
            {
                adapter.updateData(null);
            }

            
            {
                this$0 = OnGoingTemperatureSettingsFragment.this;
                super();
            }
        });
    }

    public void onChange(LocationChange locationchange)
    {
        updateSnapshot();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menu.clear();
        menu = getActivity().getActionBar();
        if (menu != null)
        {
            menu.setTitle(0x7f070230);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030083, viewgroup, false);
        temperatureList = (ListView)layoutinflater.findViewById(0x7f0d0205);
        viewgroup = new OmnitureBeaconConfig(getActivity().getString(0x7f0704bc), getActivity().getString(0x7f0704bb));
        adapter = new LocationListAdapter(getActivity(), new SavedLocationsSnapshot(), FollowMePolicy.INCLUDED, ListOrderPolicy.FIXED, viewgroup, new AllLocationsInclusionPolicy(), new AlertEnabledLocationSelectedOnInitPolicy(com.weather.dal2.locations.SavedLocation.AlertType.temperature));
        temperatureList.setAdapter(adapter);
        temperatureList.setOnItemClickListener(locationListClickListener);
        setHasOptionsMenu(true);
        return layoutinflater;
    }

    public void onDestroy()
    {
        AbstractNotificationService.cancelNotification(getActivity());
        FlagshipApplication.getInstance().getWeatherDataManager().postOnGoingTemperatureNotifications();
        super.onDestroy();
    }

    public void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.ONGOING_TEMPERATURE_ALERTS);
        DataAccessLayer.BUS.register(this);
    }

    public void onStart()
    {
        super.onStart();
        updateSnapshot();
    }
}
