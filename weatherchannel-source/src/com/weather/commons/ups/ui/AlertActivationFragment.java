// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsAddressTypes;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSummaryRecorder;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.SearchUtil;
import com.weather.commons.ups.backend.location.LocationEndSyncService;
import com.weather.dal2.google.AddressList;
import com.weather.dal2.google.ReverseGeoCodeConnection;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.net.Receiver;
import com.weather.util.CountryCodeUtil;
import com.weather.util.ExceptionUtil;
import com.weather.util.app.FragmentHelper;
import com.weather.util.config.ConfigException;
import com.weather.util.device.LocaleUtil;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.weather.commons.ups.ui:
//            CableProviderSelectFragment

public class AlertActivationFragment extends Fragment
{
    private class AddressListReceiver
        implements Receiver
    {

        final AlertActivationFragment this$0;

        private void setAddressToSearchView(AddressList addresslist)
        {
            final Activity activity = getActivity();
            if (activity == null)
            {
                return;
            } else
            {
                activity.runOnUiThread(addresslist. new Runnable() {

                    final AddressListReceiver this$1;
                    final Activity val$activity;
                    final InputMethodManager val$inputMethodManager;
                    final AddressList val$result;

                    public void run()
                    {
                        if (activity.getCurrentFocus() != null)
                        {
                            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
                        }
                        initAddressFields(result.getFormattedAddress(0));
                    }

            
            {
                this$1 = final_addresslistreceiver;
                activity = activity1;
                inputMethodManager = inputmethodmanager;
                result = AddressList.this;
                super();
            }
                });
                return;
            }
        }

        public void onCompletion(AddressList addresslist, Void void1)
        {
            int i = 0;
            do
            {
label0:
                {
                    if (i < addresslist.getCount())
                    {
                        if (!addresslist.isAcceptableAddress(i))
                        {
                            break label0;
                        }
                        setAddressToSearchView(addresslist);
                    }
                    return;
                }
                i++;
            } while (true);
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((AddressList)obj, (Void)obj1);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (Void)obj);
        }

        public void onError(Throwable throwable, Void void1)
        {
        }

        private AddressListReceiver()
        {
            this$0 = AlertActivationFragment.this;
            super();
        }

    }

    private class LocationReceiver
        implements Receiver
    {

        final Activity activity;
        InputMethodManager inputMethodManager;
        final AlertActivationFragment this$0;

        private void saveLocation(SavedLocation savedlocation, String s)
        {
            location = savedlocation;
            address = s;
        }

        public void onCompletion(SavedLocation savedlocation, final String userData)
        {
            activity.runOnUiThread(savedlocation. new Runnable() {

                final LocationReceiver this$1;
                final SavedLocation val$result;
                final String val$userData;

                public void run()
                {
                    if (activity != null && activity.getCurrentFocus() != null)
                    {
                        inputMethodManager = (InputMethodManager)activity.getSystemService("input_method");
                        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
                    }
                    homeAddress.setQuery(userData, false);
                    if (userData != null)
                    {
                        saveLocation(result, userData);
                    }
                    searchUtil.moveCursorToStart();
                    homeAddress.clearFocus();
                }

            
            {
                this$1 = final_locationreceiver;
                userData = s;
                result = SavedLocation.this;
                super();
            }
            });
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((SavedLocation)obj, (String)obj1);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (String)obj);
        }

        public void onError(Throwable throwable, String s)
        {
            ExceptionUtil.logExceptionError("AlertActivationFragment", (new StringBuilder()).append("LocationReceiver.onError for location:").append(s).toString(), throwable);
        }


        private LocationReceiver()
        {
            this$0 = AlertActivationFragment.this;
            super();
            activity = getActivity();
        }

    }


    private static final String ADDRESS_STATE_KEY = "AddressState";
    private static final String DONE_BUTTON_STATE_KEY = "DoneButtonState";
    private static final String TAG = "AlertActivationFragment";
    private String address;
    private Switch breakingNewsSwitch;
    private boolean buttonClicked;
    private SearchView homeAddress;
    private final LocalyticsHandler localyticsHandler;
    private SavedLocation location;
    private boolean locationAdded;
    private Switch realTimeRainSwitch;
    private SearchUtil searchUtil;
    private Switch severeWeatherSwitch;
    private boolean showCableProviderScreen;

    public AlertActivationFragment()
    {
        this(LocalyticsHandler.getInstance());
    }

    public AlertActivationFragment(LocalyticsHandler localyticshandler)
    {
        localyticsHandler = localyticshandler;
        try
        {
            showCableProviderScreen = ConfigurationManagers.getInstance().getFlagshipConfig().showCableProviderSignupScreen;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocalyticsHandler localyticshandler)
        {
            Log.e("AlertActivationFragment", localyticshandler.toString(), localyticshandler);
        }
    }

    private void initAddressFields(String s)
    {
        homeAddress.setQuery(s, true);
        searchUtil.moveCursorToStart();
        address = s;
        homeAddress.clearFocus();
    }

    private void navigateToNextPage(Activity activity)
    {
        if (showCableProviderScreen)
        {
            CableProviderSelectFragment.newInstance(activity.getFragmentManager());
            return;
        } else
        {
            activity.finish();
            return;
        }
    }

    static void newInstance(FragmentManager fragmentmanager)
    {
        FragmentHelper.switchToNewFragment(fragmentmanager, new AlertActivationFragment());
    }

    private void releaseAnalyticsEvents(boolean flag, boolean flag1, boolean flag2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.ALERT_SETTING_LOCATION, com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttributeValues.ACTIVATION_SCREEN.getAttributeValue());
        Object obj = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.SEVERE;
        String s;
        if (flag)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        hashmap.put(obj, s);
        obj = com.weather.commons.analytics.LocalyticsTags.Tags.REAL_TIME_RAIN_ALERT;
        if (flag1)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        hashmap.put(obj, s);
        obj = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.BREAKING_NEWS;
        if (flag2)
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
        } else
        {
            s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
        }
        hashmap.put(obj, s);
        hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.PHONE_REGION, LocaleUtil.getLocale().getDisplayCountry(Locale.US));
        if (locationAdded && flag)
        {
            com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute alertattribute;
            boolean flag3;
            if (!CountryCodeUtil.isUs(location.getCountryCode()) && CountryCodeUtil.supportsSevereAlerts(location.getCountryCode(), com.weather.util.CountryCodeUtil.Spec.FIPS))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            alertattribute = com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.INTERNATIONAL_SEVERE;
            if (flag3)
            {
                s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue();
            } else
            {
                s = com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue();
            }
            hashmap.put(alertattribute, s);
            hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.SEVERE_LOCATIONS_SELECTED_LIST, location.getNickname());
            hashmap.put(com.weather.commons.analytics.alerts.LocalyticsAlertsAttribute.AlertAttribute.SEVERE_LOCATIONS_SELECTED, String.valueOf(1));
        }
        localyticsHandler.tagEvent(LocalyticsEvent.ALERT_SETTINGS, hashmap);
    }

    private void saveAlertState(boolean flag, String s, com.weather.util.prefs.TwcPrefs.Keys keys)
    {
        if (flag)
        {
            SessionMUtils.logAction(s);
        }
        TwcPrefs.getInstance().putBoolean(keys, flag);
    }

    public void addLocation(SavedLocation savedlocation, String s)
    {
        FixedLocations fixedlocations = FixedLocations.getInstance();
        if (fixedlocations.addLocation(savedlocation))
        {
            LocationManager.getLocationManager().setCurrentLocation(savedlocation, "AlertActivation.addLocation", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED);
        }
        if (s != null)
        {
            fixedlocations.setAddress(savedlocation, s);
            fixedlocations.clearTagInAllLocations("home");
            fixedlocations.addTagToLocation(savedlocation, "home");
        }
        fixedlocations.setNotification(savedlocation, com.weather.dal2.locations.SavedLocation.AlertType.severe, severeWeatherSwitch.isChecked());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (bundle != null)
        {
            buttonClicked = bundle.getBoolean("DoneButtonState", false);
            address = bundle.getString("AddressState", "");
        }
        viewgroup = layoutinflater.inflate(com.weather.commons.R.layout.alert_activation_fragment, viewgroup, false);
        if (viewgroup == null)
        {
            layoutinflater = null;
        } else
        {
            locationAdded = false;
            layoutinflater = viewgroup.findViewById(com.weather.commons.R.id.real_time_rain_alert_switch);
            ((TextView)layoutinflater.findViewById(com.weather.commons.R.id.realtime_rain_switch_title)).setText(getString(com.weather.commons.R.string.notification_realtime_rain_title));
            bundle = viewgroup.findViewById(com.weather.commons.R.id.severe_weather_alert_switch);
            ((TextView)bundle.findViewById(com.weather.commons.R.id.severe_weather_switch_title)).setText(getString(com.weather.commons.R.string.notification_settings_severe_title));
            View view = viewgroup.findViewById(com.weather.commons.R.id.breaking_news_switch);
            ((TextView)view.findViewById(com.weather.commons.R.id.breaking_news_switch_title)).setText(getString(com.weather.commons.R.string.breaking_news_activity_label));
            realTimeRainSwitch = (Switch)layoutinflater.findViewById(com.weather.commons.R.id.switch_widget_realtime_rain);
            realTimeRainSwitch.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final AlertActivationFragment this$0;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    if (realTimeRainSwitch.isChecked() && !LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
                    {
                        realTimeRainSwitch.setChecked(false);
                        Toast.makeText(getActivity(), getActivity().getString(com.weather.commons.R.string.turn_on_lbs_msg), 1).show();
                    }
                }

            
            {
                this$0 = AlertActivationFragment.this;
                super();
            }
            });
            if (!LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
            {
                realTimeRainSwitch.setChecked(false);
            }
            severeWeatherSwitch = (Switch)bundle.findViewById(com.weather.commons.R.id.switch_widget_severe_weather);
            breakingNewsSwitch = (Switch)view.findViewById(com.weather.commons.R.id.switch_widget_breaking_news);
            homeAddress = (SearchView)viewgroup.findViewById(com.weather.commons.R.id.home_location_address_edit_text);
            homeAddress.setIconified(false);
            if (!buttonClicked)
            {
                location = (new SavedLocationsSnapshot()).getFollowMeLocation();
                if (location != null)
                {
                    (new ReverseGeoCodeConnection()).asyncFetch(location.getLat(), location.getLng(), new AddressListReceiver(), null);
                }
            } else
            {
                initAddressFields(address);
            }
            layoutinflater = new LocationReceiver();
            searchUtil = new SearchUtil(homeAddress, layoutinflater);
            searchUtil.setupSearchView(getActivity(), 0xff000000);
            bundle = (Button)viewgroup.findViewById(com.weather.commons.R.id.done_or_continue_button);
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final AlertActivationFragment this$0;

                public void onClick(View view1)
                {
                    buttonClicked = true;
                    saveAlertState(severeWeatherSwitch.isChecked(), "severe_alert_signup", com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS);
                    saveAlertState(realTimeRainSwitch.isChecked(), "real_time_rain_alert_signup", com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS);
                    saveAlertState(breakingNewsSwitch.isChecked(), "breakingnews_alert_signup", com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS);
                    view1 = new ArrayList(1);
                    if (homeAddress.getQuery().toString().isEmpty())
                    {
                        FixedLocations.getInstance().clearTagInAllLocations("home");
                    } else
                    if (location != null)
                    {
                        view1.add(LocalyticsUpsAddressTypes.HOME);
                        addLocation(location, address);
                        locationAdded = true;
                    }
                    LocalyticsHandler.getInstance().getUpsSignupSummaryRecorder().recordSignupComplete(view1);
                    view1 = getActivity();
                    if (locationAdded)
                    {
                        view1.startService(new Intent(view1, com/weather/commons/ups/backend/location/LocationEndSyncService));
                        view1.registerReceiver(view1. new BroadcastReceiver() {

                            final _cls2 this$1;
                            final Activity val$activity;

                            public void onReceive(Context context, Intent intent)
                            {
                                activity.unregisterReceiver(this);
                                navigateToNextPage(activity);
                            }

            
            {
                this$1 = final__pcls2;
                activity = Activity.this;
                super();
            }
                        }, new IntentFilter(view1.getString(com.weather.commons.R.string.sync_task_result)));
                        return;
                    } else
                    {
                        navigateToNextPage(view1);
                        return;
                    }
                }

            
            {
                this$0 = AlertActivationFragment.this;
                super();
            }
            });
            layoutinflater = viewgroup;
            if (showCableProviderScreen)
            {
                bundle.setText(com.weather.commons.R.string.next);
                return viewgroup;
            }
        }
        return layoutinflater;
    }

    public void onPause()
    {
        super.onPause();
        FollowMe.getInstance().setRealtimeRainNotification(realTimeRainSwitch.isChecked());
        releaseAnalyticsEvents(severeWeatherSwitch.isChecked(), realTimeRainSwitch.isChecked(), breakingNewsSwitch.isChecked());
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("DoneButtonState", buttonClicked);
        bundle.putString("AddressState", address);
    }

    public void onStart()
    {
        super.onStart();
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.weather.commons.R.string.alert_activation_title);
        }
    }




/*
    static boolean access$1002(AlertActivationFragment alertactivationfragment, boolean flag)
    {
        alertactivationfragment.locationAdded = flag;
        return flag;
    }

*/





/*
    static boolean access$302(AlertActivationFragment alertactivationfragment, boolean flag)
    {
        alertactivationfragment.buttonClicked = flag;
        return flag;
    }

*/







/*
    static SavedLocation access$802(AlertActivationFragment alertactivationfragment, SavedLocation savedlocation)
    {
        alertactivationfragment.location = savedlocation;
        return savedlocation;
    }

*/



/*
    static String access$902(AlertActivationFragment alertactivationfragment, String s)
    {
        alertactivationfragment.address = s;
        return s;
    }

*/
}
