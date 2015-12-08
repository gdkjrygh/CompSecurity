// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.weather.Weather.settings.alerts.donotdisturb.DoNotDisturbSettingsController;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.push.ProductType;
import com.weather.commons.ui.widgets.ExpandableHeightListView;
import com.weather.dal2.locations.LocationChange;
import com.weather.util.app.FragmentHelper;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            SevereAlertSettingsFragment, PollenAlertSettingsFragment, RainSnowAlertSettingsFragment, RealTimeAlertType, 
//            RealTimeAlertSettingsFragment, BreakingNewsAlertSettingsFragment, SignificantWeatherForecastAlertsSettingsFragment, AlertListBuilder, 
//            WeatherAlertSettingListAdapter, WeatherAlertSettingsListItem

public final class WeatherAlertsSettingsFragment extends Fragment
{

    private final DoNotDisturbSettingsController doNotDisturbSettingsController = new DoNotDisturbSettingsController();
    private WeatherAlertSettingListAdapter weatherAlertListAdapter;
    private final Runnable weatherAlertListAdapterNotifier = new Runnable() {

        final WeatherAlertsSettingsFragment this$0;

        public void run()
        {
            weatherAlertListAdapter.notifyDataSetChanged();
        }

            
            {
                this$0 = WeatherAlertsSettingsFragment.this;
                super();
            }
    };

    public WeatherAlertsSettingsFragment()
    {
    }

    private void navigateToChildAlertScreen(ProductType producttype)
    {
        static class _cls3
        {

            static final int $SwitchMap$com$weather$commons$push$ProductType[];

            static 
            {
                $SwitchMap$com$weather$commons$push$ProductType = new int[ProductType.values().length];
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_SEVERE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_POLLEN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_RAINSNOW.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_REAL_TIME_RAIN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_BREAKINGNEWS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_LIGHTNING_STRIKES.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$push$ProductType[ProductType.SIGNIFICANT_WEATHER_FORECAST.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.weather.commons.push.ProductType[producttype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            FragmentHelper.switchToNewFragment(getFragmentManager(), new SevereAlertSettingsFragment());
            return;

        case 2: // '\002'
            FragmentHelper.switchToNewFragment(getFragmentManager(), new PollenAlertSettingsFragment());
            return;

        case 3: // '\003'
            FragmentHelper.switchToNewFragment(getFragmentManager(), new RainSnowAlertSettingsFragment());
            return;

        case 4: // '\004'
            FragmentHelper.switchToNewFragment(getFragmentManager(), RealTimeAlertSettingsFragment.newInstance(RealTimeAlertType.REAL_TIME_RAIN));
            return;

        case 5: // '\005'
            FragmentHelper.switchToNewFragment(getFragmentManager(), new BreakingNewsAlertSettingsFragment());
            return;

        case 6: // '\006'
            FragmentHelper.switchToNewFragment(getFragmentManager(), RealTimeAlertSettingsFragment.newInstance(RealTimeAlertType.LIGHTNING_STRIKES));
            return;

        case 7: // '\007'
            FragmentHelper.switchToNewFragment(getFragmentManager(), new SignificantWeatherForecastAlertsSettingsFragment());
            break;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (getActivity() == null)
        {
            return null;
        } else
        {
            java.util.List list = AlertListBuilder.buildLegacyMyAlertsScreenList(getActivity());
            weatherAlertListAdapter = new WeatherAlertSettingListAdapter(getActivity(), list, WeatherAlertSettingListAdapter.OnOffIndicator.TEXT);
            layoutinflater = layoutinflater.inflate(0x7f030094, viewgroup, false);
            viewgroup = (ExpandableHeightListView)layoutinflater.findViewById(0x7f0d0249);
            viewgroup.setExpanded(true);
            viewgroup.setAdapter(weatherAlertListAdapter);
            viewgroup.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final WeatherAlertsSettingsFragment this$0;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    adapterview = weatherAlertListAdapter.getItem(i);
                    if (adapterview.getType() != null)
                    {
                        navigateToChildAlertScreen(adapterview.getType());
                    }
                }

            
            {
                this$0 = WeatherAlertsSettingsFragment.this;
                super();
            }
            });
            doNotDisturbSettingsController.start(layoutinflater, bundle);
            return layoutinflater;
        }
    }

    public void onDestroy()
    {
        doNotDisturbSettingsController.stop();
        super.onDestroy();
    }

    public void onLocationChange(LocationChange locationchange)
    {
        locationchange = getActivity();
        if (locationchange == null)
        {
            return;
        } else
        {
            locationchange.runOnUiThread(weatherAlertListAdapterNotifier);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(0x7f0702a2);
        }
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.WEATHER_ALERTS);
    }

    public void onStart()
    {
        super.onStart();
        weatherAlertListAdapter.notifyDataSetChanged();
    }


}
