// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.Weather.locations.adapters.policy.AllLocationsInclusionPolicy;
import com.weather.Weather.locations.adapters.policy.AnyAlertEnabledLocationSelectedOnInitPolicy;
import com.weather.Weather.locations.adapters.policy.FollowMePolicy;
import com.weather.Weather.locations.adapters.policy.ListOrderPolicy;
import com.weather.Weather.locations.adapters.policy.OmnitureBeaconConfig;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.push.ProductType;
import com.weather.commons.ui.widgets.ExpandableHeightListView;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.device.LocaleUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            AlertSettingsFragment, WeatherAlertSettingListAdapter, WeatherAlertSettingsListItem, AlertListBuilder

public class SignificantWeatherForecastAlertsSettingsFragment extends AlertSettingsFragment
{

    private WeatherAlertSettingListAdapter alertListAdapter;
    private final android.widget.AdapterView.OnItemClickListener alertListClickListener = new android.widget.AdapterView.OnItemClickListener() {

        final SignificantWeatherForecastAlertsSettingsFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = alertListAdapter.getItem(i);
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
                for (view = getSelectedLocations().iterator(); view.hasNext(); FixedLocations.getInstance().setNotification(savedlocation, adapterview.getType().getAlertType(), flag))
                {
                    savedlocation = (SavedLocation)view.next();
                }

                TwcPrefs.getInstance().putBoolean(adapterview.getType().getTwcPrefsKey(), flag);
                AlertServiceManager.getInstance().setNeedsSync(true);
                alertListAdapter.toggleEnabledState(i);
            }
        }

            
            {
                this$0 = SignificantWeatherForecastAlertsSettingsFragment.this;
                super();
            }
    };
    private ExpandableHeightListView locationList;
    private LocationListAdapter locationListAdapter;
    private final android.widget.AdapterView.OnItemClickListener locationListClickListener = new android.widget.AdapterView.OnItemClickListener() {

        final SignificantWeatherForecastAlertsSettingsFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            boolean flag;
            if (!locationListAdapter.isSelected(i))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            locationListAdapter.changeSelectState(i);
            adapterview = getSelectedAlerts().iterator();
            do
            {
                if (!adapterview.hasNext())
                {
                    break;
                }
                Object obj = (WeatherAlertSettingsListItem)adapterview.next();
                view = locationListAdapter.getItem(i);
                obj = ((WeatherAlertSettingsListItem) (obj)).getType();
                if (view != null && obj != null)
                {
                    FixedLocations.getInstance().setNotification(view, ((ProductType) (obj)).getAlertType(), flag);
                }
            } while (true);
            AlertServiceManager.getInstance().setNeedsSync(true);
        }

            
            {
                this$0 = SignificantWeatherForecastAlertsSettingsFragment.this;
                super();
            }
    };

    public SignificantWeatherForecastAlertsSettingsFragment()
    {
        super(ProductType.SIGNIFICANT_WEATHER_FORECAST, 0x7f0702b8, 0x7f030098, com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS_SOUND, com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS_VIBRATION, com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS_LIGHT, 0x7f070048, LocaleUtil.isDeviceInUS(), false);
    }

    private Iterable getSelectedAlerts()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < alertListAdapter.getCount(); i++)
        {
            WeatherAlertSettingsListItem weatheralertsettingslistitem = alertListAdapter.getItem(i);
            if (weatheralertsettingslistitem.isEnabled())
            {
                arraylist.add(weatheralertsettingslistitem);
            }
        }

        return arraylist;
    }

    private Iterable getSelectedLocations()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < locationListAdapter.getCount(); i++)
        {
            if (locationListAdapter.isSelected(i))
            {
                arraylist.add(locationListAdapter.getItem(i));
            }
        }

        return arraylist;
    }

    protected void logAction()
    {
    }

    protected void onActionBarMenuSwitchDisabled()
    {
        super.onActionBarMenuSwitchDisabled();
        for (Iterator iterator = getSelectedLocations().iterator(); iterator.hasNext();)
        {
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            Iterator iterator1 = getSelectedAlerts().iterator();
            while (iterator1.hasNext()) 
            {
                WeatherAlertSettingsListItem weatheralertsettingslistitem1 = (WeatherAlertSettingsListItem)iterator1.next();
                if (weatheralertsettingslistitem1.getType() != null)
                {
                    FixedLocations.getInstance().setNotification(savedlocation, weatheralertsettingslistitem1.getType().getAlertType(), false);
                }
            }
        }

        AlertServiceManager.getInstance().setNeedsSync(true);
        alertListAdapter.disableAll();
        for (int i = 0; i < alertListAdapter.getCount(); i++)
        {
            WeatherAlertSettingsListItem weatheralertsettingslistitem = alertListAdapter.getItem(i);
            if (weatheralertsettingslistitem.getType() != null)
            {
                TwcPrefs.getInstance().putBoolean(weatheralertsettingslistitem.getType().getTwcPrefsKey(), false);
            }
        }

    }

    protected void onActionBarMenuSwitchEnabled()
    {
        super.onActionBarMenuSwitchEnabled();
        if (FixedLocations.getInstance().isEmpty())
        {
            Toast.makeText(getActivity(), getActivity().getString(0x7f070545), 1).show();
            toggleAlertState(false);
            return;
        }
        alertListAdapter.enableAll();
        for (int i = 0; i < alertListAdapter.getCount(); i++)
        {
            WeatherAlertSettingsListItem weatheralertsettingslistitem = alertListAdapter.getItem(i);
            if (weatheralertsettingslistitem.getType() != null)
            {
                TwcPrefs.getInstance().putBoolean(weatheralertsettingslistitem.getType().getTwcPrefsKey(), true);
            }
        }

        for (Iterator iterator = getSelectedLocations().iterator(); iterator.hasNext();)
        {
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            Iterator iterator1 = getSelectedAlerts().iterator();
            while (iterator1.hasNext()) 
            {
                WeatherAlertSettingsListItem weatheralertsettingslistitem1 = (WeatherAlertSettingsListItem)iterator1.next();
                if (weatheralertsettingslistitem1.getType() != null)
                {
                    FixedLocations.getInstance().setNotification(savedlocation, weatheralertsettingslistitem1.getType().getAlertType(), true);
                }
            }
        }

        AlertServiceManager.getInstance().setNeedsSync(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (layoutinflater == null)
        {
            return null;
        } else
        {
            viewgroup = layoutinflater.findViewById(0x7f0d0259);
            locationList = (ExpandableHeightListView)layoutinflater.findViewById(0x7f0d0258);
            locationList.setEmptyView(viewgroup);
            locationList.setExpanded(true);
            viewgroup = (LinearLayout)layoutinflater.findViewById(0x7f0d025a);
            bundle = getFooterView();
            bundle.findViewById(0x7f0d0045).setVisibility(0);
            alertListAdapter = new WeatherAlertSettingListAdapter(getActivity(), AlertListBuilder.buildSignificantWeatherAlertsList(getActivity()), WeatherAlertSettingListAdapter.OnOffIndicator.CHECK_BOX);
            ExpandableHeightListView expandableheightlistview = (ExpandableHeightListView)bundle.findViewById(0x7f0d0046);
            expandableheightlistview.setExpanded(true);
            expandableheightlistview.setAdapter(alertListAdapter);
            expandableheightlistview.setOnItemClickListener(alertListClickListener);
            viewgroup.addView(bundle, new android.widget.LinearLayout.LayoutParams(-1, -2));
            return layoutinflater;
        }
    }

    public void onResume()
    {
        super.onResume();
        OmnitureBeaconConfig omniturebeaconconfig = new OmnitureBeaconConfig(getActivity().getString(0x7f0704ba), getActivity().getString(0x7f0704b9));
        locationListAdapter = new LocationListAdapter(getActivity(), new SavedLocationsSnapshot(), FollowMePolicy.EXCLUDED, ListOrderPolicy.FIXED, omniturebeaconconfig, new AllLocationsInclusionPolicy(), new AnyAlertEnabledLocationSelectedOnInitPolicy(com.weather.dal2.locations.SavedLocation.AlertType.SIGNIFICANT_WEATHER_ALERTS_LIST));
        locationList.setAdapter(locationListAdapter);
        locationList.setOnItemClickListener(locationListClickListener);
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.SEVERE_WX_ALERTS);
    }




}
