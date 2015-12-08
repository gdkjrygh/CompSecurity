// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.common.collect.ImmutableMap;
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
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.sessionm.SessionMUtils;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            AlertSettingsFragment

public class RainSnowAlertSettingsFragment extends AlertSettingsFragment
{
    private class DeliveryTimeOnClickListener
        implements android.view.View.OnClickListener
    {

        final RainSnowAlertSettingsFragment this$0;

        public void onClick(View view)
        {
            int j = hourValues.indexOf(rainSnowAlertDeliveryTimes);
            int i = j;
            if (j == -1)
            {
                i = 1;
            }
        /* block-local class not found */
        class _cls2 {}

        /* block-local class not found */
        class _cls1 {}

            (new android.app.AlertDialog.Builder(activity)).setTitle(getResources().getString(0x7f07028f)).setSingleChoiceItems(hoursEntries, i, new _cls2()).setNegativeButton(0x1040000, new _cls1()).show();
            AlertServiceManager.getInstance().setNeedsSync(true);
        }

        private DeliveryTimeOnClickListener()
        {
            this$0 = RainSnowAlertSettingsFragment.this;
            super();
        }

    }


    private static final String TAG = "RainSnowAlertSettingsFragment";
    private Activity activity;
    private LocationListAdapter adapter;
    private TextView deliveryTime;
    private boolean hasChanged;
    private List hourValues;
    private String hoursEntries[];
    private final android.widget.AdapterView.OnItemClickListener locationListClickListener = new android.widget.AdapterView.OnItemClickListener() {

        final RainSnowAlertSettingsFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            boolean flag = true;
            hasChanged = true;
            if (!UpsCommonUtil.isLoggedIntoNamedAccount() && LocaleUtil.isDeviceInUS())
            {
                showWeatherProfileDialog();
                return;
            }
            if (adapter.isSelected(i))
            {
                flag = false;
            }
            adapter.changeSelectState(i);
            FixedLocations.getInstance().setNotification(adapter.getItem(i), com.weather.dal2.locations.SavedLocation.AlertType.rainSnow, flag);
        }

            
            {
                this$0 = RainSnowAlertSettingsFragment.this;
                super();
            }
    };
    private SharedPreferences preferences;
    private int previousSelectedCount;
    private String rainSnowAlertDeliveryTimes;
    private ListView rainSnowLocationListView;

    public RainSnowAlertSettingsFragment()
    {
        super(ProductType.PRODUCT_RAINSNOW, 0x7f070290, 0x7f03008d, com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS, com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERT_SOUND, com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERT_VIBRATION, com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERT_LIGHT, 0x7f070048, LocaleUtil.isDeviceInUS(), false);
    }

    protected void logAction()
    {
        int i = adapter.getSelectedLocationsCount();
        if (isAlertEnabled() && hasChanged && previousSelectedCount != i)
        {
            SessionMUtils.logAction("rain_snow_alert_signup", i);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        layoutinflater = null;
_L4:
        return layoutinflater;
_L2:
        rainSnowLocationListView = (ListView)viewgroup.findViewById(0x7f0d023e);
        rainSnowLocationListView.setEmptyView(viewgroup.findViewById(0x7f0d023d));
        bundle = getFooterView().findViewById(0x7f0d003e);
        bundle.setVisibility(0);
        deliveryTime = (TextView)bundle.findViewById(0x7f0d0241);
        activity = getActivity();
        layoutinflater = viewgroup;
        if (activity == null) goto _L4; else goto _L3
_L3:
        hoursEntries = activity.getResources().getStringArray(0x7f080000);
        hourValues = Arrays.asList(activity.getResources().getStringArray(0x7f080004));
        preferences = PreferenceManager.getDefaultSharedPreferences(activity);
        rainSnowAlertDeliveryTimes = preferences.getString("rain_snow_alert_delivery_times", "");
        LogUtil.d("RainSnowAlertSettingsFragment", LoggingMetaTags.TWC_UI, (new StringBuilder()).append("rainSnowAlertDeliveryTimes=").append(rainSnowAlertDeliveryTimes).toString(), new Object[0]);
        if (!rainSnowAlertDeliveryTimes.isEmpty()) goto _L6; else goto _L5
_L5:
        deliveryTime.setText(hoursEntries[1]);
_L8:
        bundle.setOnClickListener(new DeliveryTimeOnClickListener());
        return viewgroup;
_L6:
        try
        {
            deliveryTime.setText(hoursEntries[hourValues.indexOf(rainSnowAlertDeliveryTimes)]);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            deliveryTime.setText(hoursEntries[1]);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onPause()
    {
        super.onPause();
        LocalyticsHandler localyticshandler = LocalyticsHandler.getInstance();
        LocalyticsEvent localyticsevent = LocalyticsEvent.ALERT_SETTINGS;
        com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute alertattribute = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.DAILY_RAIN;
        String s;
        if (isAlertEnabled())
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        localyticshandler.tagEvent(localyticsevent, ImmutableMap.of(alertattribute, s, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.DAILY_RAIN_LOCATIONS_SELECTED, String.valueOf(adapter.getSelectClickCount()), com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.DAILY_RAIN_LOCATIONS_DESELECTED, String.valueOf(adapter.getDeselectClickCount()), com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.ALERT_SETTING_LOCATION, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttributeValues.ALERT_SETTING_SCREEN.getAttributeValue()));
        KahunaEvents.getInstance().setDailyRainAlert(adapter.getSelectClickCount(), adapter.getDeselectClickCount(), isAlertEnabled());
    }

    public void onResume()
    {
        super.onResume();
        adapter = new LocationListAdapter(getActivity(), new SavedLocationsSnapshot(), FollowMePolicy.EXCLUDED, ListOrderPolicy.FIXED, OmnitureBeaconConfig.NULL, new AllLocationsInclusionPolicy(), new AlertEnabledLocationSelectedOnInitPolicy(com.weather.dal2.locations.SavedLocation.AlertType.rainSnow));
        if (rainSnowLocationListView.getFooterViewsCount() == 0)
        {
            View view = getFooterView();
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            rainSnowLocationListView.addFooterView(view, null, false);
        }
        rainSnowLocationListView.setAdapter(adapter);
        rainSnowLocationListView.setOnItemClickListener(locationListClickListener);
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.RAIN_SNOW_ALERTS);
        previousSelectedCount = adapter.getSelectedLocationsCount();
    }



/*
    static String access$102(RainSnowAlertSettingsFragment rainsnowalertsettingsfragment, String s)
    {
        rainsnowalertsettingsfragment.rainSnowAlertDeliveryTimes = s;
        return s;
    }

*/







/*
    static boolean access$702(RainSnowAlertSettingsFragment rainsnowalertsettingsfragment, boolean flag)
    {
        rainsnowalertsettingsfragment.hasChanged = flag;
        return flag;
    }

*/

}
