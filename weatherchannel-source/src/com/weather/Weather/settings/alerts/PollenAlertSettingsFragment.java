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
import android.widget.ListView;
import android.widget.Switch;
import com.google.common.collect.ImmutableMap;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.Weather.locations.adapters.policy.AlertEnabledLocationSelectedOnInitPolicy;
import com.weather.Weather.locations.adapters.policy.FollowMePolicy;
import com.weather.Weather.locations.adapters.policy.ListOrderPolicy;
import com.weather.Weather.locations.adapters.policy.OmnitureBeaconConfig;
import com.weather.Weather.locations.adapters.policy.UsOrUkLocationInclusionPolicy;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.push.ProductType;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FixedLocationsSnapshot;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.device.LocaleUtil;
import com.weather.util.prefs.Prefs;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            AlertSettingsFragment

public final class PollenAlertSettingsFragment extends AlertSettingsFragment
{
    private class LocationListClickListener
        implements android.widget.AdapterView.OnItemClickListener
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
                    FixedLocations.getInstance().setNotification(adapter.getItem(i), com.weather.dal2.locations.SavedLocation.AlertType.pollen, flag);
                    return;
                }
            }
            if (!isUserLoggedIntoNamedAccount && isDeviceInUS)
            {
                showWeatherProfileDialog();
                return;
            } else
            {
                adapter.changeSelectState(i);
                FixedLocations.getInstance().setNotification(adapter.getItem(i), com.weather.dal2.locations.SavedLocation.AlertType.pollen, flag);
                return;
            }
        }

        private LocationListClickListener()
        {
            this$0 = PollenAlertSettingsFragment.this;
            super();
        }

    }


    LocationListAdapter adapter;
    boolean anyPollenAlertEnabledForAnonymousUsers;
    private boolean isDeviceInUS;
    private boolean isUserLoggedIntoNamedAccount;
    private final android.widget.AdapterView.OnItemClickListener locationListClickListener = new LocationListClickListener();
    ListView pollenList;

    public PollenAlertSettingsFragment()
    {
        super(ProductType.PRODUCT_POLLEN, 0x7f07024d, 0x7f03008c, com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS, com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERT_SOUND, com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERT_VIBRATION, com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERT_LIGHT, 0x7f070048, LocaleUtil.isDeviceInUS(), false);
    }

    protected void logAction()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (layoutinflater == null)
        {
            return null;
        } else
        {
            pollenList = (ListView)layoutinflater.findViewById(0x7f0d023c);
            pollenList.setEmptyView(layoutinflater.findViewById(0x7f0d023d));
            return layoutinflater;
        }
    }

    public void onPause()
    {
        super.onPause();
        LocalyticsHandler localyticshandler = LocalyticsHandler.getInstance();
        LocalyticsEvent localyticsevent = LocalyticsEvent.ALERT_SETTINGS;
        com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute alertattribute = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.POLLEN;
        String s;
        if (isAlertEnabled())
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        localyticshandler.tagEvent(localyticsevent, ImmutableMap.of(alertattribute, s, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.POLLEN_LOCATIONS_SELECTED, String.valueOf(adapter.getSelectClickCount()), com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.POLLEN_LOCATIONS_DESELECTED, String.valueOf(adapter.getDeselectClickCount()), com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.ALERT_SETTING_LOCATION, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttributeValues.ALERT_SETTING_SCREEN.getAttributeValue()));
        KahunaEvents.getInstance().setPollenAlert(adapter.getSelectClickCount(), adapter.getDeselectClickCount(), isAlertEnabled());
        localyticshandler = LocalyticsHandler.getInstance();
        localyticsevent = LocalyticsEvent.ALERT_SETTINGS;
        alertattribute = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.POLLEN;
        if (prefs.getBoolean(overallKey, false))
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        localyticshandler.tagEvent(localyticsevent, ImmutableMap.of(alertattribute, s, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.POLLEN_LOCATIONS_SELECTED, String.valueOf(adapter.getSelectClickCount()), com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.POLLEN_LOCATIONS_DESELECTED, String.valueOf(adapter.getDeselectClickCount()), com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.ALERT_SETTING_LOCATION, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttributeValues.ALERT_SETTING_SCREEN.getAttributeValue()));
    }

    public void onResume()
    {
label0:
        {
            isUserLoggedIntoNamedAccount = UpsCommonUtil.isLoggedIntoNamedAccount();
            isDeviceInUS = LocaleUtil.isDeviceInUS();
            if (isUserLoggedIntoNamedAccount || !isDeviceInUS)
            {
                break label0;
            }
            Iterator iterator = (new FixedLocationsSnapshot()).viewLocations().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((SavedLocation)iterator.next()).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.pollen));
            anyPollenAlertEnabledForAnonymousUsers = true;
        }
        super.onResume();
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.POLLEN_ALERTS);
        OmnitureBeaconConfig omniturebeaconconfig = new OmnitureBeaconConfig(getActivity().getString(0x7f0704b4), getActivity().getString(0x7f0704b3));
        adapter = new LocationListAdapter(getActivity(), new SavedLocationsSnapshot(), FollowMePolicy.EXCLUDED, ListOrderPolicy.FIXED, omniturebeaconconfig, new UsOrUkLocationInclusionPolicy(), new AlertEnabledLocationSelectedOnInitPolicy(com.weather.dal2.locations.SavedLocation.AlertType.pollen));
        if (pollenList.getFooterViewsCount() == 0)
        {
            View view = getFooterView();
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            pollenList.addFooterView(view, null, false);
        }
        pollenList.setAdapter(adapter);
        pollenList.setOnItemClickListener(locationListClickListener);
    }

    public void updateSwitchAndLayout()
    {
        if (!anyPollenAlertEnabledForAnonymousUsers) goto _L2; else goto _L1
_L1:
        prefs.putBoolean(overallKey, true);
_L4:
        boolean flag = isAlertEnabled();
        if (actionBarMenuSwitch != null)
        {
            actionBarMenuSwitch.setChecked(flag);
        }
        updateLayoutVisibility(flag);
        return;
_L2:
        if (!isUserLoggedIntoNamedAccount && isDeviceInUS)
        {
            prefs.putBoolean(overallKey, false);
            AlertServiceManager.getInstance().setNeedsSync(true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }


}
