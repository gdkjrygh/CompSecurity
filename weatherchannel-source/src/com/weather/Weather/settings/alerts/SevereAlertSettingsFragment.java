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
import com.google.common.base.Joiner;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.Weather.locations.adapters.policy.AlertEnabledLocationSelectedOnInitPolicy;
import com.weather.Weather.locations.adapters.policy.AllLocationsInclusionPolicy;
import com.weather.Weather.locations.adapters.policy.FollowMePolicy;
import com.weather.Weather.locations.adapters.policy.ListOrderPolicy;
import com.weather.Weather.locations.adapters.policy.OmnitureBeaconConfig;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.push.ProductType;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.CountryCodeUtil;
import com.weather.util.device.LocaleUtil;
import com.weather.util.sessionm.SessionMUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            AlertSettingsFragment

public final class SevereAlertSettingsFragment extends AlertSettingsFragment
{
    private class LocationListClickListener
        implements android.widget.AdapterView.OnItemClickListener
    {

        final SevereAlertSettingsFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            hasChanged = true;
            boolean flag;
            boolean flag1;
            if (!UpsCommonUtil.isLoggedIntoNamedAccount() && !LocaleUtil.deviceCountryIsNonUsAndSupportsSevereAlerts())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!adapter.isSelected(i))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag && adapter.getSelectedLocationsCount() >= 1 && flag1)
            {
                showWeatherProfileDialog();
                return;
            }
            adapter.changeSelectState(i);
            adapterview = adapter.getItem(i);
            if (adapter.positionRefersToFollowMe(i))
            {
                FollowMe.getInstance().setNotification(com.weather.dal2.locations.SavedLocation.AlertType.severe, flag1);
            } else
            {
                FixedLocations.getInstance().setNotification(adapterview, com.weather.dal2.locations.SavedLocation.AlertType.severe, flag1);
            }
            AlertServiceManager.getInstance().setNeedsSync(true);
        }

        private LocationListClickListener()
        {
            this$0 = SevereAlertSettingsFragment.this;
            super();
        }

    }


    LocationListAdapter adapter;
    private boolean hasChanged;
    private final android.widget.AdapterView.OnItemClickListener locationListClickListener = new LocationListClickListener();
    private int previousSelectedCount;
    ListView severeList;

    public SevereAlertSettingsFragment()
    {
        super(ProductType.PRODUCT_SEVERE, 0x7f0702ac, 0x7f03008f, com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS, com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERT_SOUND, com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERT_VIBRATION, com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERT_LIGHT, 0x7f070048, false, false);
    }

    protected void logAction()
    {
        int i = adapter.getSelectedLocationsCount();
        if (isAlertEnabled() && hasChanged && previousSelectedCount != i)
        {
            SessionMUtils.logAction("severe_alert_signup", i);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (layoutinflater == null)
        {
            return null;
        } else
        {
            severeList = (ListView)layoutinflater.findViewById(0x7f0d023f);
            return layoutinflater;
        }
    }

    public void onPause()
    {
        super.onPause();
        boolean flag = false;
        HashSet hashset = new HashSet();
        for (int i = 0; i < adapter.getCount();)
        {
            boolean flag1 = flag;
            if (adapter.isSelected(i))
            {
                SavedLocation savedlocation = adapter.getItem(i);
                hashset.add(savedlocation.getNickname());
                flag1 = flag;
                if (!CountryCodeUtil.isUs(savedlocation.getCountryCode()))
                {
                    flag1 = true;
                }
            }
            i++;
            flag = flag1;
        }

        HashMap hashmap = new HashMap();
        com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute alertattribute = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.SEVERE;
        String s;
        if (isAlertEnabled())
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        hashmap.put(alertattribute, s);
        alertattribute = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.INTERNATIONAL_SEVERE;
        if (flag)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        hashmap.put(alertattribute, s);
        hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.SEVERE_LOCATIONS_SELECTED_LIST, Joiner.on(",").join(hashset));
        hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.SEVERE_LOCATIONS_SELECTED, String.valueOf(adapter.getSelectClickCount()));
        hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.SEVERE_LOCATIONS_DESELECTED, String.valueOf(adapter.getDeselectClickCount()));
        hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.ALERT_SETTING_LOCATION, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttributeValues.ALERT_SETTING_SCREEN.getAttributeValue());
        hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.PHONE_REGION, LocaleUtil.getLocale().getDisplayCountry(Locale.US));
        LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.ALERT_SETTINGS, hashmap);
        KahunaEvents.getInstance().setSevereAlert(adapter.getSelectClickCount(), adapter.getDeselectClickCount(), isAlertEnabled());
    }

    public void onResume()
    {
        super.onResume();
        if (severeList.getFooterViewsCount() == 0)
        {
            View view = getFooterView();
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            severeList.addFooterView(view, null, false);
        }
        OmnitureBeaconConfig omniturebeaconconfig = new OmnitureBeaconConfig(getActivity().getString(0x7f0704b8), getActivity().getString(0x7f0704b7));
        adapter = new LocationListAdapter(getActivity(), new SavedLocationsSnapshot(), FollowMePolicy.INCLUDED, ListOrderPolicy.FIXED, omniturebeaconconfig, new AllLocationsInclusionPolicy(), new AlertEnabledLocationSelectedOnInitPolicy(com.weather.dal2.locations.SavedLocation.AlertType.severe));
        severeList.setAdapter(adapter);
        severeList.setOnItemClickListener(locationListClickListener);
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.SEVERE_WX_ALERTS);
        previousSelectedCount = adapter.getSelectedLocationsCount();
    }


/*
    static boolean access$102(SevereAlertSettingsFragment severealertsettingsfragment, boolean flag)
    {
        severealertsettingsfragment.hasChanged = flag;
        return flag;
    }

*/
}
